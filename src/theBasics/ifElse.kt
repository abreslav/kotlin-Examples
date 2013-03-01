package theBasics.ifElse
import kotlin.test.assertEquals
fun main (args : Array<String>){

    var a : Int = 1
    var b : Int = 2

    var max = if (a > b) a else b


    assertEquals(2, max, "max should have a value of 2")

    a = 3
    max =
    if (a > b)
        a
    else
        b

    assertEquals(3, max, "max should have a value of 3")
}