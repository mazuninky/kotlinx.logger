plugins {
    id("kotlin-platform-js")
}

dependencies {
    implementation(Config.JS.kotlinStdlib)
    expectedBy(project(":common"))
    testImplementation(Config.JS.kotlinTest)
}