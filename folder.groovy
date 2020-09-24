folder('GERF-DEV') {
    displayName('GERF-DEV')
    description('Folder for project GERF-DEV')
}
folder('GERF-QA') {
    displayName('GERF-QA')
    description('Folder for project GERF-QA')
}
listView('GERF-Project') {

    description('All unstable jobs for project GERF')
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
        name('GERF-DEV')
        name('GERF-QA')
    }
}
