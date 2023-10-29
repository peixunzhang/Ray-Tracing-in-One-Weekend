object Main extends App {
  val imageWidth = 256
  val imageHeight = 256

  println("P3")
  println(s"$imageWidth $imageHeight")
  println(255)

  for (j <- 0 until imageHeight ) {
    System.err.println(s"Scanlines remaining ${imageHeight - j}")
    for (i <- 0 until imageWidth) {
      val r = i.toDouble / (imageWidth-1)
      val g = j.toDouble / (imageHeight-1)
      val b = 0

      val ir = (255.999 * r).toInt
      val ig = (255.999 * g).toInt
      val ib = (255.999 * b).toInt

      println(s"$ir $ig $ib")
    }
  }
  System.err.println("Done.")
}
