import java.io.FileInputStream
import java.util.Properties

version in ThisBuild := {
  val s = new FileInputStream(file("version.properties"))
  try {
    val p = new Properties()
    p.load(s)
    p.getProperty("version")
  } finally s.close()

}
