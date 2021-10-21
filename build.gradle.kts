plugins {
    kotlin("jvm") version "1.5.31" apply false
    id("dev.mythicdrops.gradle.project")
}

description = "Logging library for the JVM with no external dependencies"

contacts {
    addPerson("topplethenunnery@gmail.com", closureOf<nebula.plugin.contacts.Contact> {
        moniker = "ToppleTheNun"
        github = "ToppleTheNun"
    })
}

mythicDropsRelease {
    repository = "MythicDrops/kindling"
}