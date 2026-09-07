pipeline{
    agent any
    stages{
        stage('Checkout'){
            git branch main ,url:'https://github.com/Jaya-sri26/DevOpsInternal.git'
            }
        }
        stage('Test'){
            javac TestFactorial Factorial
        }
        stage('Run'){
            java Factorial
        }
        stage('Package Jar'){
            jar cfm -c factorial Factorial
        }
        stage('Archive Artifact'){
            echo "ArchiveArtifact"
        }
    }
    post{
        success{
            echo "Build,Run,Test the project Successfully"
        }
        failure{
            echo "Test Project Failed"
        }
    }
}
