import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("kotlin-platform-jvm")
    id("java-library")
}

dependencies {
    implementation(Config.JVM.kotlinStdlib)
    expectedBy(project(":common"))

    testImplementation(Config.JVM.junit)
    testImplementation(Config.JVM.kotlinTest)
    testImplementation(Config.JVM.kotlinTestJUNIT)
}

/*val compileKotlin: KotlinCompile by tasks
compileKotlin.kotlinOptions {
    jvmTarget = "1.8"
}
val compileTestKotlin: KotlinCompile by tasks
compileTestKotlin.kotlinOptions {
    jvmTarget = "1.8"
}*/