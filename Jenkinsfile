pipeline {
    agent any

    stages {

        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build') {
            steps {
                sh 'chmod +x gradlew'
                sh './gradlew clean build -x test'
            }
        }

        stage('Docker Build') {
            steps {
                sh 'docker build -t cicd-test .'
            }
        }

        stage('Deploy') {
            steps {
                sh 'docker stop cicd-test || true'
                sh 'docker rm cicd-test || true'
                sh 'docker run -d -p 8081:8080 --name cicd-test cicd-test'
            }
        }
    }
}