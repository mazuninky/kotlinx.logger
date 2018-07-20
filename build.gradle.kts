import org.jetbrains.kotlin.gradle.dsl.Coroutines

plugins {
    base
}

buildscript {
    repositories {
        mavenLocal()
        jcenter()
        google()
        mavenCentral()
    }
    dependencies {
      classpath(Config.BuildPlugins.androidGradle)
        classpath(kotlin("gradle-plugin", version = Config.Versions.kotlin))
    }
}

subprojects {
    repositories {
        mavenLocal()
        jcenter()
        google()
        mavenCentral()
    }
}