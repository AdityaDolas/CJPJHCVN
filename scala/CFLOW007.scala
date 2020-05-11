object CFLOW007 {
  def main(args: Array[String]): Unit = {
    var z = scala.io.StdIn.readInt();
    var result = 0
    while (z > 0) {
      var a = scala.io.StdIn.readInt();
      while (a > 0) {
        var b = a % 10
        result = (result * 10) + b
        a /= 10
      }
      println(result)
      result = 0
      z -= 1
    }
  }
}