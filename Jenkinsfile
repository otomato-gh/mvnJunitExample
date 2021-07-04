pipeline {
  agent any
  stages {
    stage("check") {
      steps {
        script {
          if (env.BRANCH_NAME.startsWith('PR')) {
            echo "pull request"
          }
          else {
            echo env.BRANCH_NAME
          }
        }
     }
   }
 }
}
