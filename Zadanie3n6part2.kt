fun Zadanie3n6part2(){
    try{
        println("введите число")
        val num: Int = readLine()!!.toInt()
        when{
            (num<100||num>999)-> println("заданное число неудовлетворяет заданные рамки")
            else->{
        when{
            (num%10<(num/10)%10&&(num/10)%10<num/100 ||num%10>(num/10)%10&&(num/10)%10>num/100)-> println("цифры числа образуют упроядоченную последовательность")
            else-> println("цифры числа не образуют упроядоченную последовательность")
        }
            }
        }
    }
    catch (e:Exception){
        println("вы ввели не число")
    }
}