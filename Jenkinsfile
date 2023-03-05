pipeline{
    agent {label 'swarm'}
    stages {
        stage("Compile"){
            steps{
                bat "./gradlew compileJava"
            }
        }
        stage("Unit test"){
            steps{
                bat "./gradlew test"
            }
        }
    }
}
