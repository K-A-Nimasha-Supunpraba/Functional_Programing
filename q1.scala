object q1 extends App{

  def otHour(hours:Int):Int = hours*75

  def normalHour(hours:Int):Int = hours*150

  def salaryIncome(normalH:Int,otH:Int):Int = normalHour(normalH)+otHour(otH)

  def salaryTax(incomeS:Int):Double = incomeS*0.1

  def takeHomeSalary(normal_H:Int,ot_H:Int):Double = salaryIncome(normal_H,ot_H)-salaryTax(salaryIncome(normal_H,ot_H))
  print("Enter normal hour:")
  var x:Int=scala.io.StdIn.readInt()
  print("Enter ot hour:")
  var y:Int=scala.io.StdIn.readInt()
  print("TakeHomeSalary :")
  println(takeHomeSalary(x,y))

}
