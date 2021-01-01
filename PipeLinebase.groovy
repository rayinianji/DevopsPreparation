pipelineJob('Tecsol') {
    
    definition {
        cps {
            script(readFileFromWorkspace('ci_pipe.groovy'))
            sandbox()
        }
    }
}
