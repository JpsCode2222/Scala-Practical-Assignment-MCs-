import scala.io.StdIn.readInt
object Ass2_2 extends App{
    
    var arr = Array.ofDim[Int](10,10)
    var det : Int = 0

    println("Enter Elemet in matrix :")
    for(i <- 0 to 2){
        for(j <- 0 to 2){
            arr(i)(j) = readInt()
        }
    }

    println("Matrix is : ")
    for(i <- 0 to 2){
        for(j <- 0 to 2){
            print(arr(i)(j))
        }
        println()
    }

    for(i <- 0 to 2){
        det = det + (arr(0)(i)*(arr(1)((i+1)%3)*arr(2)((i+2)%3) - arr(1)((i+2)%3)*arr(2)((i+1)%3)))
    }
   
    println("Determinent of matrix : "+det)
}