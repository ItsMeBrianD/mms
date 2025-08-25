plugins {
    kotlin("jvm") version "1.9.24"
    id("org.jetbrains.intellij") version "1.17.3"
}

group = "com.mms"
version = "0.1.0"

repositories {
    mavenCentral()
}

kotlin {
    jvmToolchain(17)
}

intellij {
    // Use a stable IntelliJ Platform version; adjust as needed
    version.set("2023.3")
    type.set("IC")
    plugins.set(listOf())
}

// Plugin metadata for publishing/verification (optional now)
//tasks.publishPlugin { }

tasks.patchPluginXml {
    sinceBuild.set("233")
    untilBuild.set(null as String?)
}

// Ensure Kotlin is available at compile time
dependencies {
    implementation(kotlin("stdlib"))
}

// Enable building the plugin zip via: ./gradlew buildPlugin
