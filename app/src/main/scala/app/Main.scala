package app

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import uuid.uuid

@JSImport("./hello.js", "hello")
@js.native
object Hello extends js.Function1[String, String] {
  def apply(name: String): String = js.native
}

// TODO: Write ScalaJS facade for datadog client
// @JSImport("@datadog/datadog-api-client")
// @js.native
// object DatadogClient extends js.Object {
//   def createConfiguration: Unit = js.native
// }

object Main {
  def main(args: Array[String]): Unit = {
    println(Hello("Matt"))
    println(uuid.v4())
  }
}
