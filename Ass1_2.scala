import scala.util.Random
object Ass1_2 extends App{
for(i <- 1 to 5){
var n1=Random
var n=n1.nextInt(50)
var sum=0
for(j <- 1 to n-1){
    if(n%j==0){
    sum=sum+j
    }
}
if(sum==n)
    println(n+" is perfect no.")
else
    println(n+" is not perfect no.")
}

}