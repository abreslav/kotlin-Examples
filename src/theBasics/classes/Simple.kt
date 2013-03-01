/*
 * Copyright (c) 2013. Eric F. Palmer
 * See license/LICENSE.txt for the applicable software license
 */

package theBasics.classes.Simple

import kotlin.test.assertEquals

// a very simple class without a explicit constructor and 1 public property
public class Simple {
    public var x : String = "Simple Class"
}

// fun main resides OUTSIDE of the class definition unlike java
fun main (args : Array<String>){
    var s : Simple = Simple()

    println ("x is a public property so x = ${s.x}")
    assertEquals("Simple Class", s.x, "x should == \"Simple Class\"")

    println ("Setting x=\"New value\"")
    s.x="New Value"
    assertEquals("New Value", s.x, "x should == \"New Value\"")
    println ("x is a public property so x = ${s.x}")
}
