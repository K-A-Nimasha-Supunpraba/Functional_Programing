object q4 extends App{

  def IsEvenOrOdd(n:Int):String = n match{
    case 0 => "Is even"
    case 1 => "Is odd"
    case _ => IsEvenOrOdd(n-2)

  }

  print("Enter the number:")
  var x:Int=scala.io.StdIn.readInt()
  println(IsEvenOrOdd(x))

}
