pipelineJob('DevApp/ci-deploy') {
    
    definition {
        cps {
            script(readFileFromWorkspace('ci_pipe.groovy'))
            sandbox()
        }
    }
}
pipelineJob('DevApp/ci-deploy-QA') {
    
    definition {
        cps {
            script(readFileFromWorkspace('ci_pipe.groovy'))
            sandbox()
        }
    }
}
pipelineJob('DevApp/ci-deploy-Prod') {
    
    definition {
        cps {
            script(readFileFromWorkspace('ci_pipe.groovy'))
            sandbox()
        }
    }
}
