object CFSQRT {
  def main(args: Array[String]): Unit = {
    var z = scala.io.StdIn.readInt()
    while (z > 0) {
      var a = scala.io.StdIn.readInt()
      println(Math.sqrt(a).toInt)
      z -= 1
    }
  }
}