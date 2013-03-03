/*
 * Copyright (c) 2013 Eric F. Palmer
 * See license/LICENSE.txt for the applicable software license
 */

package theBasics.classes.GetSet

import kotlin.test.assertEquals

class GetSet {
    public var x : Int = 1;
        set(value) {$x = $x + value}

     public val y : Int = 10;
        get() {return $y}

    // alternative syntax for single expressions
    public var a: Int = 2
        set(value : Int) = $a = value
        get() = $a
}

fun main(args: Array<String>) {
    var c = GetSet()
    assertEquals(1, c.x, "Property x should have a value of 1")
    println ("setting value of x = x + 3");
    c.x = 3;
    assertEquals(4, c.x, "Property x should have a value of 4")
    println("testing the getter for property y")
    assertEquals(10, c.y, "Property y should have a value of 10")
    println("testing to see that property y does not have a setter")

    println("The complier will not allow a \"val\" property to set with a default setter")
    println("So you can't do something like: c.y = 1")
    // go ahead and uncomment out the following and see what happens
    //c.y = 1

    println("testing alternative syntax for getters and setters (actually for expressions in general)")
    assertEquals(2, c.a, "Property a should have a value of 2")
    c.a = 23
    assertEquals(23, c.a, "Property a should now have a value of 23")

}