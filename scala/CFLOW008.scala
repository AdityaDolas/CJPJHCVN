object CFLOW008 {
  def main(args: Array[String]): Unit = {
    var a = scala.io.StdIn.readInt()
    while (a > 0) {
      var b = scala.io.StdIn.readInt()
      if (b < 10) {
        println("What an obedient servant you are!")
      } else {
        println("-1")
      }
      a -= 1
    }
  }
}