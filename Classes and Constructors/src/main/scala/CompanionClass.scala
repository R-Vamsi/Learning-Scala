class CompanionDemo(c:String="fill"){
  val x=4
  val z=c
  println("edi??")
  println(f"x is = ${x} and y is= ${CompanionDemo.y}, z=${z}")
  println("ohoo")
}
object CompanionDemo{
  val y=4.57
  println("yadiki")
  val k= new CompanionDemo()
  println(f"Inside obj x is = ${k.x} and y is= ${y}")
  println("endidi")
}

object CompanionClass extends App{
  //println("Hi")
  var p=new CompanionDemo("emo")
}
/*
process flow starts from 16--->18--->1,2,3,4--->8,9,10,11---->1 to 7----->12,13----->5,6
 */


//An object is executed only once through out the program even if it is called from different classes
