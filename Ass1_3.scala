object Ass1_3 extends App{
    var sum:Int = 0
    for(i <- 1 to 100){
        var cnt:Int = 0
        for(j <- 1 to i){
            if(i % j == 0){
                cnt += 1;
            }
        }
        if(cnt == 2)
        sum += i
    }
    println(sum+"Sum of 100 prime Numbers")
}