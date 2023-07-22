import java.util.*
import kotlin.math.sqrt

class Task_10 {
}




fun main(){
    val reader = Scanner(System.`in`)
    var a:Int = reader.nextInt()
    var b:Int = reader.nextInt()
    var c:Int = reader.nextInt()

    var det = sqrt((b*b - 4*a*c).toDouble())
    if (det == 0.0){
        val root = ((-b) + det)/(2*a)
        println("One root = $root")
    }else if(det > 0.0){
        val root1 = ((-b) + det)/(2*a)
        val root2 = ((-b) - det)/(2*a)
        println("First root = $root1")
        println("Second root = $root2")
    }else{
        println("The equation has no real roots!")
    }


}
