object CLUCKFOUR {
  def main(args: Array[String]): Unit = {
    var z = scala.io.StdIn.readInt()
    var count = 0
    while (z > 0) {
      var a = scala.io.StdIn.readInt()
      while (a > 0) {
        var b = a % 10
        if (b == 4) {
          count = count + 1
        }
        a = a / 10
      }
      println(count)
      count = 0
      z -= 1
    }
  }
}