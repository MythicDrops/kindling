plugins {
    kotlin("jvm") version "2.0.0" apply false
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
    repository.set("MythicDrops/kindling")
}
