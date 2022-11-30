pipeline {
    agent any {
        stages {
            stage('code-pulling') {
                steps {git credentialsId: 'mohit-decoder', url: 'git@github.com:mohit-decoder/student-ui.git'}
            }
            }    
        }
    }