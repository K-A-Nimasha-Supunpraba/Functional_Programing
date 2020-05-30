object q3 extends App{

  def add(n:Int):Int = n match{
    case x if(x==1) => x
    case x if(x>1) => x+add(x-1)

  }

  println(add(5))

}
