pipeline {
    agent none

    stages {

        stage('Checkout') {
            agent { label 'spring-build' }
            steps {
                checkout scm
            }
        }

        stage('Build') {
            agent { label 'spring-build' }
            steps {
                bat 'mvn clean compile'
            }
        }

        stage('Test') {
            agent { label 'spring-test' }
            steps {
                bat 'mvn test'
            }
            post {
                always {
                    junit 'target\\surefire-reports\\*.xml'
                }
            }
        }
    }

    post {
        success {
            echo 'Build and tests passed successfully!'
        }
        failure {
            echo 'Build or tests failed!'
        }
    }
}
