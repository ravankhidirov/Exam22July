class Task_9 {
}




fun main(){

    println(check_leap(504))

}


fun check_leap(a:Int):Boolean{
    if (a%100 == 0){
        if (a%400 == 0){
            return true
        }else{
            return false
        }
    }else{
        if (a%4 == 0){
            return true
        }
    }
    return false
}