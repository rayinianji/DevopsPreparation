#!groovy
pipeline {
    agent any 
    stages {
        stage('SCM checkout')
        {
        
            steps
            {
            echo 'Checkout of Dev branch code'
            git branch: 'master', url: 'https://github.com/rayinianji/DevopsPreparation.git'
            }

        }

        stage ('Building the artifacts') 
        {
            steps
            {
            echo 'Building Artifacts started...'
            sh 'chmod +x gradlew'
            sh './gradlew clean build'
         
            }
        } 
        stage ('Deplyoing the in to tomcat server')
        {
            steps
            {
            echo 'Deplyoing the jar in tomocat server on the way....'   
            }
            
        }
    
        }

    }
