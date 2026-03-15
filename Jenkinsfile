pipeline {
    agent any

    tools {
        maven 'Maven'
    }

    environment {
        IMAGE_NAME = "scientific-calculator"
        DOCKERHUB_USER = "svrma13"
    }

    stages {

        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/superv13/scientific-calculator.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Build Docker Image') {
            steps {
                sh 'docker build -t $DOCKERHUB_USER/$IMAGE_NAME:latest .'
            }
        }

        stage('Push to DockerHub') {
            steps {
                withCredentials([usernamePassword(
                    credentialsId: 'dockerhub-creds',
                    usernameVariable: 'DOCKER_USER',
                    passwordVariable: 'DOCKER_PASS'
                )]) {
                    sh '''
                        echo $DOCKER_PASS | docker login -u $DOCKER_USER --password-stdin
                        docker push $DOCKERHUB_USER/$IMAGE_NAME:latest
                    '''
                }
            }
        }

        stage('Deploy with Ansible') {
            steps {
                sh 'ansible-playbook ansible/deploy.yml -i ansible/inventory.ini -K'
            }
        }
    }

    post {

        success {
            emailext(
                subject: "Jenkins Build SUCCESS",
                body: "Scientific Calculator pipeline build succeeded.",
                to: "shrutivrma1301@gmail.com"
            )
        }

        failure {
            emailext(
                subject: "Jenkins Build FAILED",
                body: "Scientific Calculator pipeline build failed.",
                to: "shrutivrma1301@gmail.com"
            )
        }

        always {
            echo "Pipeline execution completed."
        }
    }
}
