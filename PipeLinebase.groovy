pipelineJob('Springboot-web/ci-deploy') {
    
    definition {
        cps {
            script(readFileFromWorkspace('ci_pipe.groovy'))
            sandbox()
        }
    }
}
