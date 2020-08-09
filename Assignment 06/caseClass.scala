import scala.math.sqrt

object caseClass extends App {

  val q1 = Point(8,10);
  val q2 = Point(3,4);

  println(" Point 1 : "+q1)
  println(" Point 2 : "+q2)

  val q3 = q1+q2
  println(" Point 1 + Point 2 : "+q3)

  val q4 = q2.move(3,3)
  println( " "+q2+ " after moving : "+ q4)

  val q5 = q2.invert()
  println(" Invert of "+q2+" :"+q5)

  val q6 = q2.distance(q1)
  println(" Distance between " +q2+ " and "+q1+" : "+q6)




}

case class Point(x:Int,y:Int){

  def +(p:Point)=Point(this.x+p.x,this.y+p.y)
  def move(dx:Int,dy:Int)=Point(this.x+dx,this.y+dy)
  def invert()=Point(this.y,this.x)
  def distance(p:Point)=sqrt((this.x-p.x)*(this.x-p.x)+(this.y-p.y)*(this.y-p.y))

}