object ScalaForSparks {
  def main(args: Array[String]): Unit = {
    case class Order(
                      orderId: Int,
                      orderDate: String,
                      orderCustomerId: Int,
                      orderStatus: String
                    )

    val os = List(
      Order(1, "2017-01-01", 100, "COMPLETE"),
      Order(2, "2016-01-01", 24, "CLOSED"),
      Order(3, "2017-01-01", 150, "PENDING"),
      Order(4, "2017-01-01", 300, "COMPLETE"),
      Order(5, "2016-01-01", 500, "PENDING"),
      Order(6, "2017-01-01", 330, "COMPLETE"),
      Order(7, "2017-01-01", 642, "PENDING"),
      Order(8, "2017-01-01", 130, "CLOSED"),
      Order(9, "2017-01-01", 105, "COMPLETE"),
      Order(10, "2017-01-01", 108, "COMPLETE"),
      Order(11, "2017-01-01", 105, "PENDING"),
      Order(12, "2016-01-01", 106, "CLOSED"),
      Order(13, "2017-01-01", 105, "PENDING"),
      Order(14, "2017-01-01", 107, "COMPLETE"),
      Order(15, "2016-01-01", 102, "CLOSED"),
      Order(16, "2017-01-01", 340, "PENDING"),
      Order(17, "2017-01-01", 186, "COMPLETE"),
      Order(18, "2016-01-01", 256, "CLOSED"),
      Order(19, "2017-01-01", 133, "COMPLETE"),
      Order(20, "2016-01-01", 900, "CLOSED")
    )

    // print output in ascending order with related to orderId
    os.sortBy(order => order.orderId).foreach(println)

    // print output in descending order with related to orderId
    os.sortBy(order => -order.orderId).foreach(println)

  }
}