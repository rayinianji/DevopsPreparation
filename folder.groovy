folder('DevApp') {
    displayName('GERF-DEV')
    description('Folder for project SpringBoot')
}

listView('GERF-APP') {

    description('All Stable jobs for project spring boot web')
    columns {
        status()
        weather()
        name()
        lastSuccess()
        lastFailure()
        lastDuration()
        buildButton()
    }

    jobs {
        name('DevApp/ci-deploy')
         }
}
