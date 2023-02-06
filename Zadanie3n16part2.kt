import kotlin.math.pow
fun Zadanie3n16part2(){
    try{
    println("введите а")
    val a:Double = readLine()!!.toDouble()
    println("введите b")
    val b: Double= readLine()!!.toDouble()
    println("введите c")
    val c: Double = readLine()!!.toDouble()
    println("введите u")
    var u: Double = readLine()!!.toDouble()
    println("введите v")
    val v: Double = readLine()!!.toDouble()
    var min:Double =Double.MAX_VALUE
    var max: Double = Double.MIN_VALUE
    when{
        u>v -> println("u не может быть больше v")
        else ->{
            while(u<=v){
                val y = a*u.pow(2)+b*u+c
                when{
                    y<min -> min =y
                }
                when{
                    y>max -> max =y
                }
                u+=0.1
            }
            println("Минимальное значение = "+min)
            println("Максимальное значение = "+max)
        }
    }
    }
    catch(e:Exception){
        println("вы ввели не число")
    }

}