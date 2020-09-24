job('GERF-QA/gerf-qa-ci') {
    scm {
        git {
		
            remote {

                url('https://github.com/rayinianji/NewWebproject.git')
				
                }
			branch('master')	
        }
    }
}