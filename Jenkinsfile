// local backup of IaC script running in local Jenkins master node instance
pipeline {
    agent any 
    stages {
        stage("Checkout") {
            steps {
                git url: 'https://github.com/jasonsalas/dockerjenkins-calculator', branch: 'main'
            }
        }
        stage("Compile") {
            steps {
                sh "./gradlew compileJava"
            }
        }
    }
}