//1 Write a program to calculate average of all number between n1 and n2
import scala.io.StdIn.readInt
object Ass1_1 extends App{
        var sum: Float = 0.0
        var cnt: Int = 0
        var avg: Float = 0.0
        println("Enter n1: ")
        var n1 = readInt()
        println("Enter n2: ")
        var n2 = readInt()

        for(i <- n1 to n2){
                sum = sum + i;
                cnt += 1
        }
        avg = sum / cnt
        println("Average is : "+avg)
}