import ostrat._, geom._

object MyApp extends App
{
  def ds(d: Double): String = d.toLong match {
    case l if d == l => l.toString
    case _ => d.toString  
  }

  val v1 = 4 vv 5
  println(v1.toString)
  println(ds(v1.x))
  println(ds(4.2))
} 
