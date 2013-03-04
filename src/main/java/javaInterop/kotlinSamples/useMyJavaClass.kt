package javaInterop.kotlinSamples.useMyJavaClass
import  javaInterop.javaSamples.MyJavaClass
import kotlin.test.assertEquals

fun main(args: Array<String>){
    // lets call a Java class using the kotlin syntax
    var m = MyJavaClass(23)
    assertEquals(23, m.getI(), "MyJavaClass().getI() should be 23")
    // what does m.doIt() return?
    println("m.doIt()=${m.doIt()}")
}
