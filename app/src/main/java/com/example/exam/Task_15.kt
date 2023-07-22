import java.util.*

class Task_15 {
}




fun main(){
    val reader = Scanner(System.`in`)
    var a:Int = reader.nextInt()
    showPrimeSum(a)
}



fun showPrimeSum(a:Int){
    val b = a/2
    for (i in 2..b){
        if (isPrime(i) && isPrime(a-i)){
            var c = a-i
            println("$a = $i + $c")
        }
    }
}


fun isPrime(a:Int):Boolean{
    if (a==1){
        return false
    }
    for (i in 2 until a){
        if (a%i == 0){
            return false
        }
    }
    return true
}