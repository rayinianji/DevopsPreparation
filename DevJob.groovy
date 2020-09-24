job('GERF-DEV/gerf-ci') {
    scm {
        git {
		
            remote {

                url('https://github.com/rayinianji/NewWebproject.git')
				
                }
			branch('master')	
        }
    }
}