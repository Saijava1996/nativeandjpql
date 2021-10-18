pipeline{
  agent any 
  stages{
     stage('git repo & clean'){
        steps{
          bat "rmdir /s /q nativeandjpq"
          bat "git clone https://github.com/Saijava1996/nativeandjpq.git"
          bat "mvn clean -f  nativeandjpql"
       }    
  }
  stage('install'){
     steps{
       bat "mvn install -f nativeandjpq"
     }
   }
         stage('test'){
     steps{
       bat "mvn test -f nativeandjpq"
     }
   } stage('package'){
     steps{
       bat "mvn package -f nativeandjpq"
     }
   }
  }
}
        
        
         
