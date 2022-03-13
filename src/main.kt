fun main(){
    var s=numbers(arrayOf(10,5,2))
    println(s)
var v=mixedtype(arrayOf(20,7.2,5,10.5F,6,5,))
    println(v)
    var x = characters(arrayOf('a','e','i','o','u'))
    println(x)

}
fun numbers(numb:Array<Int>):Int{
    var product = 1
    numb.forEach { ed ->
        product*= ed
    }
    return product

}
fun mixedtype(numbers:Array<Any>):Double{
    var sum = 0.0
    numbers.forEach {del ->
   if (del is Double || del is Float){
       sum+=del.toString().toDouble()

   }

    }
    return sum
}
fun characters(char:Array<Char>):Int{
    var vowels= char.count()
    return vowels

}
    
