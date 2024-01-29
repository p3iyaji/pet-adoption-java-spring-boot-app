pipeline {
  agent any 
  
  stages{
      stage("Clone the project") {
          steps{
            git branch: 'main', url: 'https://github.com/p3iyaji/pet-adoption-java-spring-boot-app.git'
          }
      }

      stage("Compilation") {
          steps{
            sh 'mvn clean install'
          }
        
      }
    
      stage("build docker image") {
          steps{
              script{
                sh 'docker build -t petadoption .'
              }
            
          }
        
      }
    
      stage("create container"){
          steps{
              script{
                sh 'docker run -d -p 8080:8080 --name petadoptionapp petadoption:latest'
              }
            
          }
      }
    }
  

}
