pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenLocal()
    }
}

plugins {
    // See https://jmfayard.github.io/refreshVersions
    id("de.fayard.refreshVersions") version "0.11.0"
}

gradle.allprojects {
    group = "io.pixeloutlaw"

    repositories {
        mavenCentral()
    }
}

rootProject.name = "kindling"

include(
    "kindling"
)
