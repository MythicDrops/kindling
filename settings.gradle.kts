pluginManagement {
    repositories {
        gradlePluginPortal()
    }
}

plugins {
    // See https://jmfayard.github.io/refreshVersions
    id("de.fayard.refreshVersions") version "0.60.2"
    id("com.gradle.enterprise") version "3.16.2"
}

gradleEnterprise {
    buildScan {
        termsOfServiceUrl = "https://gradle.com/terms-of-service"
        termsOfServiceAgree = "yes"
    }
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
