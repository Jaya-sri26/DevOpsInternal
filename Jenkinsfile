pipeline{
    agent any
    stages{
        steps{
            stage('Checkout'){
                step{
                    git branch main,
                        url:'https://github.com/Jaya-sri26/DevOpsInternal.git'
                }
            }
            stage('Test'){
                step{
                    javac TestFactorial Factorial
                }
            }
            stage('Run'){
                step{
                    java Factorial
                }
            }
            stage('Package Jar'){
                step{
                    jar cfm -c factorial Factorial
                }
            }
            stage('Archive Artifact'){
                step{
                    echo "ArchiveArtifact"
                }
            }
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
