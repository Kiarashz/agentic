plugins {
    // Apply the Kotlin JVM plugin using the type-safe accessors
    kotlin("jvm")
    // If building a runnable application, you may also apply the 'application' plugin
    application
}

dependencies {
    implementation("ai.koog:koog-agents:0.6.0")
}

repositories {
    mavenCentral()
}

application {
    mainClass = "com.example.AppKt" // Replace with your main class name
}