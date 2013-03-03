/*
 * Copyright (c) 2013 Eric F. Palmer
 * See license/LICENSE.txt for the applicable software license
 */

package theBasics.functions.extendString.aChar

/*
 * this is a slightly more complicated example than theString.kt of creating a function that extends a String
 * this shows a String extension function that takes a parameter and returns a different datatype
 */

import kotlin.test.assertEquals
import kotlin.test.fails
import kotlin.test.failsWith
import kotlin.test.fail

// charPosition 0...String.length()-1
fun String.aChar(charPosition : Int) : Char {
    if (charPosition<0 || charPosition > this.length()-1) {
        throw Exception("The charPosition parameter value is out of range")
    }
    val theStringAsChars = this.toCharArray()
    return theStringAsChars[charPosition]
}

fun main(args : Array<String>) {

    assertEquals('a', "abcabc".aChar(0), "the return char should be an 'a'")
    assertEquals('c', "abcabc".aChar(2), "the return char should be an 'c'")
    try {
        "0123456789".aChar(-1)
        fail("\"0123456789\".aChar(-1) should have failed with an exception")
    } catch (e : Exception){}

    try {
        "0123456789".aChar(11)
        fail("\"0123456789\".aChar(11) should have failed with an exception")
    } catch (e : Exception){}

}