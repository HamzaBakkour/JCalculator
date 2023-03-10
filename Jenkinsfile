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
        stage("Code coverage"){
            steps{
                bat "./gradlew jacocoTestReport"
                publishHTML (target: [
                    reportDir: 'build/reports/jacoco/test/html',
                    reportFiles: 'index.html',
                    reportName: "JaCoCo Report"
                ])
                bat "./gradlew jacocoTestCoverageVerification"
            }
        }
        stage("Static code analysis"){
            steps{
                bat "./gradlew checkstyleMain"
                publishHTML (target: [
                    reportDir: 'build/reports/checkstyle/',
                    reportFiles : 'main.html',
                    reportName: "Checkstyle Report"
                ])
            }
        }
        stage("Package"){
            steps{
                bat "./gradlew build"
            }
        }
        stage("Docker build"){
            steps{
                bat "docker build -t hamzabakkour/temp:${BUILD_TIMESTAMP} ."
            }
        }
        stage("Docker push"){
            steps{
                bat "docker push hamzabakkour/temp:${BUILD_TIMESTAMP}"
            }
        }
        stage("Deploy to staging"){
            steps{
                bat "docker run -d --rm -p 8765:8080 --name temp hamzabakkour/temp:${BUILD_TIMESTAMP}"
            }
        }
        stage("Acceptance test"){
            steps{
                sleep 60
                bat "./gradlew acceptanceTest -D calculator.url=http://localhost:8765"
                publishHTML (target: [
                    reportDir: 'build/reports/tests/acceptanceTest',
                    reportFiles : 'index.html',
                    reportName: "Acceptance Report"
                ])
            }
        }
    }

    post {
        always{
            bat 'Docker stop temp' 
        } 
    }
}
