/*
 * Copyright (c) 2013. Eric F. Palmer
 * See license/LICENSE.txt for the applicable software license
 */

package theBasics.functions .paramPassing
import kotlin.test.assertEquals

/*
 * In Kotlin version M5.1 the mutability of function parameters was set to be immutable
 * this was confirmed with the development team and is explained here
 * http://blog.jetbrains.com/kotlin/2013/02/kotlin-m5-1/#more-971
 */

fun main(arg : Array<String>){
    doit(2, "A String")
}

fun doit (a : Int, b : String){
    /* Parameters passed into functions are immutable (can't be changed)
     *
     * However, see the kotlin file objectPassing.kt
     * Objects can ae passed by reference (actually the reference is passed a val
     * but the Object is mutable and is mutable beyond the scope of the function)
     */

    // the following won't compile
    // a = 1
    // b = "New String"

    // you can do this
    var a2 = a
    var b2 = b
    a2 = 1
    b2 = "New String"
    assertEquals(1, a2, "a2 should be 1: Int")
    assertEquals("New String", b2, "b2 should be \"New String\"")
}