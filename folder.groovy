folder('Gradle-Web') {
    displayName('Gradle-Web')
    description('Folder for project SpringBoot')
}

listView('SPRINTBOOT-WEB') {

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
        name('Springboot-web')
         }
}
