object CXENRANK {
  def main(args: Array[String]): Unit = {
    var u,v,temp2,result, temp=0
    var z = scala.io.StdIn.readInt()

    while (z > 0) {
      u = scala.io.StdIn.readInt()
      v = scala.io.StdIn.readInt()
      temp = (u + v) + 1
      temp2 = temp * (temp - 1) / 2 + 1
      result = temp2 + 1
      println(result)
      z -= 1
    }
  }
}