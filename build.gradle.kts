import org.jetbrains.kotlin.cli.common.toBooleanLenient
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.5.0"
    kotlin("plugin.serialization") version "1.5.0"
}

group = "net.edwardday.serialization"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        useOldBackend = System.getenv("USE_OLD_BACKEND").toBooleanLenient() ?: false
    }
}

dependencies {
    implementation(kotlin("stdlib"))

    implementation("org.jetbrains.kotlinx:kotlinx-serialization-core-jvm:1.2.0")
}
