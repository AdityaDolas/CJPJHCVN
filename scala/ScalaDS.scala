import scala.io.StdIn._
import scala.io.Source
import java.io._

object ScalaDS {
  def main(args: Array[String]): Unit = {
    val source = Source.fromFile("u.item")
    val lines = source.getLines()
    val result = lines.map(x => x.replace("http://us.imdb.com", " "))
    // val source = Source.fromFile("matrix.txt)
    //    val lines = source.getLines()
    //    val matrix = lines.map(_.split(" ").map(_.toDouble)).toArray
    //    val u = lines.map(x => x.replace("T", "")).toArray
    //    source.close()

    //    val pw = new PrintWriter("rowSums.txt")
    //    matrix.foreach{ row => pw.println(row)}
    //    pw.close()

    val writer = new PrintWriter(new File("u.item_clean"))
    //writer.write(source)
    //val i = source.map(x => x.re)
    result.foreach(row => writer.print(row))
    writer.close()
  }
}