pluginManagement {
    repositories {
        gradlePluginPortal()
    }
}

plugins {
    // See https://jmfayard.github.io/refreshVersions
    id("de.fayard.refreshVersions") version "0.51.0"
    id("com.gradle.enterprise") version "3.12.2"
////                        # available:"3.12.3"
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
