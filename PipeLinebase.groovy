pipelineJob('DevApp/ci-deploy') {
    
    definition {
        cps {
            script(readFileFromWorkspace('ci_pipe.groovy'))
            sandbox()
        }
    }
}
