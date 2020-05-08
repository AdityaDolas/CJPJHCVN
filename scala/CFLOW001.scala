object CFLOW001 {
  def main(args: Array[String]) {
    var i = io.StdIn.readInt()
    while (i > 0) {
      var ln = io.StdIn.readLine().split(" ").map(_.toInt)
      var (a, b) = (ln(0), ln(1))
      var r = a + b;
      println(r)
      i = i - 1;
    }
  }
}
