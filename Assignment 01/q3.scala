object q3 extends App {
  def totalCost(x:Int):Double={
    var books:Int =x
    var total:Double=0

    if(x<=50){
      total=(24.95*x*(0.6))+3.0
    }else{
      total=(24.95*x*(0.6))+(3.0)+((x-50)*0.75)
    }
    return total
  }
  //var bookCopies:Double = c
  println(totalCost(60))
}
