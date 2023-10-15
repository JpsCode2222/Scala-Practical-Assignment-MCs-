import scala.io.StdIn.readInt
object Ass1_4{
def decimalToBinary(decimal: Int): String = {
        if(decimal == 0) 
            return "0"
        else{
        var binary : String = ""
        var num = decimal 
        while(num > 0){
            binary = (num % 2).toString + binary
            num /= 2
        }
        return binary
    }
}

 def decimalToOctal(decimal: Int): String = {
    if(decimal == 0) 
        return "0"
    else{
        var octal : String = ""
        var num : Int = decimal
        while(num > 0){
            octal = (num % 8).toString + octal
            num /= 8
        }
        return octal
    }
}   
def main(args: Array[String]): Unit = {
    println("Enter Number : ")
    var n: Int = readInt()
    // println((n).toBinaryString)
    var d : String = decimalToBinary(n)
    var o : String= decimalToOctal(n)
    println(d)
    println(o)
    }
}
