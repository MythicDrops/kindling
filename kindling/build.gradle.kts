plugins {
    kotlin("jvm")
    id("org.jetbrains.kotlinx.binary-compatibility-validator")
}

description = "Logging library for the JVM with no external dependencies"

dependencies {
    implementation(kotlin("stdlib"))

    testImplementation(platform("org.junit:junit-bom:_"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation("com.willowtreeapps.assertk:assertk-jvm:_")
    testImplementation("io.mockk:mockk:_")
}
