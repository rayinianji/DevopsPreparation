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
        stage ('Deplyoing to PCF Dev')
        {
            steps
            {
            echo 'Deplyoing in to the PCF'
            pushToCloudFoundry cloudSpace: 'development', credentialsId: 'PCF_dev_id', organization: 'TechSol', target: 'https://api.run.pivotal.io'  
            
            }
            
        }
    
        }

    }
