/*
 * Copyright (c) 2013. Eric F. Palmer
 * See license/LICENSE.txt for the applicable software license
 */

package theBasics.functions.objectPassing
import kotlin.test.assertEquals

/*
 * class instances (Objects) are passed into functions as reference to the object.
 * The reference is passed by value (is immutable) but by accessing the reference
 * and the properties and methods of the object the object is mutable
 * Changes to the object are visiable in the scope of the functtion that changes the
 * object and beyond the scope (after the function returns)
 */

// create a simple class
class SomeClass{
    public var a : Int = 1
}

fun main(args : Array<String>){
    var c = SomeClass()
    assertEquals(1, c.a, "The original value of c.a should be 1: Int")
    changeIt(c)
    assertEquals(4, c.a, "The new value of c.a after the function \"changeIt(c: SomeClass)\" returns should be 4: Int")
}
// a function that changes the objectt
fun changeIt(c : SomeClass) {
    assertEquals(1, c.a, "The  value of c.a passed into \"changeIt(c: SomeClass)\" should be 1: Int")
    c.a = 4
    assertEquals(4, c.a, "The new value of c.a inside of \"changeIt(c: SomeClass)\" but before the return should be 4: Int")
}
