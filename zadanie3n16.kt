import kotlin.math.abs
fun Zadanie3n16part1(){
    try{
    print("введите скорость первого автомобиля")
    val v1: Int = readLine()!!.toInt()
    println("введите скорость второго автомобиля")
    val v2: Int = readLine()!!.toInt()
    println("введите время")
    val t: Int = readLine()!!.toInt()
    println("введите расстояние между автомобилями")
    val s: Int = readLine()!!.toInt()
    when{
        (v1<0||v2<0||t<0||s<0) ->
            println("никакая характеристика не может быть меньше 0")
        else -> {
            val result: Int = abs((v1*t)+(v2*t)-s)
            println("Расстояние между автомобилями = " + result + " километров")
        }
    }
    }
    catch (e:Exception){
        println("вы ввели не число")
    }
}