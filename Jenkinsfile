pipeline{
    agent any
    stages {
        stage("Compile"){
            steps{
                bat "./gradlew compileJava"
            }
        }
        stage("Unit test"){
            setps{
                bat "./gradlew test"
            }
        }
    }

}