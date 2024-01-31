pipeline {
  agent any 
  tools {
  	maven "MAVEN"
  }
  stages{
      stage("Clone the project") {
          steps{
            git branch: 'main', url: 'https://github.com/p3iyaji/pet-adoption-java-spring-boot-app.git'
          }
      }

      stage("Compilation") {
          steps{
          	script{
          		sh 'mvn clean package'
          	}
            
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
                sh 'docker run -d -p 80:80 --name petadoptionapp petadoption:latest'
              }
            
          }
      }
    }
  

}
