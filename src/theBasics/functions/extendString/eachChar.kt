/*
 * Copyright (c) 2013 Eric F. Palmer
 * See license/LICENSE.txt for the applicable software license
 */

/*
 * This is am example of using a higher order function to create a closure.
 * This example shows iterating over a string and returning each char into the closure
 *
 * this is powerful stuff.  I had to read some of the kotlin source code to see how this might be
 * crafted
 *
 */

package theBasics.functions.extendString.eachChar

import java.util.ArrayList

fun String.eachChar(closure : (aChar : Char) -> Unit): Unit {
    val result = ArrayList<Char>()
    val theStringAsChars = this.toCharArray()
    for (i in 0..this.length()-1)
        closure(theStringAsChars[i])

}
//TODO this seems close but not so sure
fun main(args : Array<String>){
    "awesome".eachChar(){
        it ->
        println(it)
    }

}


