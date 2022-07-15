class Demo(val a:Int=10009, val b:Double=10.031)
{
val x=a
  val y=b
  println(f"x=${x} , y=${y}")
  def this(){
    this(12,33.4)
    println("no Param")
  }
  def this( b:Double)    //auxiliary constructor
    {
      this(12,b)
      println("one Param")
    }
}
object ConstructorsExample {
  def main(args: Array[String]): Unit = {
    println("Hello World")
    val k= new Demo(10,20.22)
    val n= new Demo(9.565)
    val p= new Demo()

  }

}
