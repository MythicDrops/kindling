plugins {
    kotlin("jvm") version "1.5.21" apply false
    id("dev.mythicdrops.gradle.project") version "1.0.6"
}

description = "Logging library for the JVM with no external dependencies"

mythicDropsRelease {
    repository = "MythicDrops/kindling"
}