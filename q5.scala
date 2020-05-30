object q5 extends App{

  def addEven(n:Int):Int = n  match{
    case x if(x==0) => 0
    case x if(x>0 && x%2==0) => x+addEven(n-2)
    case x if(x>0 && x%2!=0) => addEven(n-1)
  }

  print("Enter even number:")
  var x:Int=scala.io.StdIn.readInt()
  print("Addition of the even number :")
  println(addEven(x))

}
