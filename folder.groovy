folder('GERF-DEV') {
    displayName('ABC')
    description('Folder for project ABC')
}
listView('GERF-Project') {
    description('All unstable jobs for project ABC')
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
        name('GERF-DEV/build')
        name('GERF-DEV/test')
    }
}
