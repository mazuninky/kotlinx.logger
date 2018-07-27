rootProject.name = "kotlinx.logger"

fun module(path: String) {
  val i = path.lastIndexOf('/')
    val name = path.substring(i + 1)
    include(name)
    project(":$name").projectDir = File(path)
}
