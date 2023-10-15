object Ass2_1 extends App{
    var numbers = Array(10,20,25,30);
    var min,max = numbers(0)
    for(i <- 1 until numbers.length){
        if(numbers(i)<min){
            min = numbers(i)
        }
        if(numbers(i)>max){
            max = numbers(i)
        }
    }
    println("Minimum no. in Arr : "+min)
    println("Maximum no. in Arr : "+max)
}