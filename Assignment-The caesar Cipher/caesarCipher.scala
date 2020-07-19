object caesarCipher extends App{

  def caesarCipher(){
    val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

    val text:String = "SUPUNPRABA"

    val En=(x:Char,key:Int,y:String)=> y((y.indexOf(x.toUpper)+key)%y.size)

    val De=(x:Char,key:Int,y:String)=> y((y.indexOf(x.toUpper)-key+y.size)%y.size)

    val cipher=(algo:(Char,Int,String)=> Char,s:String,key:Int,y:String)=> s.map(algo(_,key,y))

    val encrtption=cipher(En,text,1,alphabet)

    val decryption=cipher(De,encrtption,1,alphabet)

    println("String : "+text)
    println("Encrtption String : "+encrtption)
    println("Decryption String : "+decryption)

  }
  caesarCipher()
}
