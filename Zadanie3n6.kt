import kotlin.math.pow
fun Zadanie3n1part1(){
    try {
        println("введите время(секунды)")
        val t: Double = readLine()!!.toDouble()
        println("введите ускорение(м/c^2)")
        val a: Double = readLine()!!.toDouble()
        println("введите начальную скорость движения(м/c)")
        val v0: Double = readLine()!!.toDouble()
        when{
            (t<0||v0<0) ->
                println("время или начальная скороcть не могут быть отрицательными")
            else->{
                val s: Double = (v0 * t + a * t.pow(2)) / 2
                println("Пройденное расстояние = " + s+" метров")
            }
        }
    }
    catch (e:Exception){
        println("вы ввели не число")
    }
}