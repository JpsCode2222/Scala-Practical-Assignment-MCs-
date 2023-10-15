import scala.io.StdIn.readInt
object Ass2_3 extends App{
    var arr = Array.ofDim[Int](10,10)
    var flag : Int = 0
    println("Enter Elements in matrix :")
    for(i <- 0 to 2){
        for(j <- 0 to 2){
            arr(i)(j) = readInt()
        }
    }

    println("Entered Matrix : ")
    for(i <- 0 to 2){
        for(j <- 0 to 2){
            print(arr(i)(j))
        }
        println()
    }

    for(i <- 1 to 2)
        for(j <- 0 to i-1)
            if( arr(i)(j) != 0 )
                flag = 0
            else
                flag = 1

    println("value of flag"+flag);

    if(flag == 1){
        println("Upper Traingular Matrix")
    }
    else{
        println("Not a Upper Triangular Matrix")
    }
}