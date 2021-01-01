folder('Springboot-web') {
    displayName('Gradle-Web')
    description('Folder for project SpringBoot')
}

listView('TechSol') {

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

    }
