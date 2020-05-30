object q2 extends App{

  def attendance(ticketPrice:Int):Int=120+(15-ticketPrice)/5*20

  def ticketRevenue(ticketPrice:Int):Int = attendance(ticketPrice)*ticketPrice

  def cost(ticketPrice:Int):Int=500+attendance(ticketPrice)

  def ticketProfit(ticketPrice:Int):Int = ticketRevenue(ticketPrice)-cost(ticketPrice)

  def bestPrice(){
    var p=5;
    var x=ticketProfit(p)
    while(x<ticketProfit(p+5)){
      x=ticketProfit(p+5)
      p=p+5
    }
    println("Best price :",x)
    println("Best ticket price :",p)

  }

  bestPrice()

}
