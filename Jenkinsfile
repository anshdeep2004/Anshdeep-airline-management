pipeline {
    agent any
    tools {
        maven "maven"
    }
    stages {
        stage('Checkout Code') {
            steps {
                checkout scmGit(
                    branches: [[name: '*/main']],
                    extensions: [],
                    userRemoteConfigs: [[url: 'https://github.com/anshdeep2004/Anshdeep-airline-management.git']]
                )
            }
        }

        stage('Build Maven') {
            steps {
                bat 'mvn clean install'
            }
        }

        stage('Run Tests') {
            steps {
                bat 'mvn test'
            }
        }

        stage('Build Docker Image') {
            steps {
                script {
                    bat 'docker build -t anshDocker1/springboot-docker .'
                }
            }
        }

        stage('Run Container') {
            steps {
                script {
                    bat 'docker run -d -p 8060:8000 anshDocker1/springboot-docker'
                }
            }
        }

        stage('Push Docker Image') {
            steps {
                withCredentials([usernamePassword(credentialsId: 'DockerId', usernameVariable: 'DOCKER_USER', passwordVariable: 'DOCKER_PASS')]) {
                    bat '''
                        echo Logging in to Docker Hub...
                        docker login -u %DOCKER_USER% -p %DOCKER_PASS%

                        echo Tagging image...
                        docker tag anshDocker1/springboot-docker %DOCKER_USER%/anshdeep-airline-management:latest

                        echo Pushing image...
                        docker push %DOCKER_USER%/anshdeep-airline-management:latest
                    '''
                }
            }
        }

        stage('Deploy to EC2') {
            steps {
                withCredentials([sshUserPrivateKey(credentialsId: 'jenkins_key_value', keyFileVariable: 'KEYFILE')]) {
                    bat '''
                        echo Deploying on EC2...
                        plink -i %KEYFILE% -batch ec2-user@ec2-44-211-124-162.compute-1.amazonaws.com ^
                        "docker pull %DOCKER_USER%/anshdeep-airline-management:latest && docker stop airline || true && docker rm airline || true && docker run -d --name airline -p 8060:8000 %DOCKER_USER%/anshdeep-airline-management:latest"
                    '''
                }
            }
        }

    }
}
