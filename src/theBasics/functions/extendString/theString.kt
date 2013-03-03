/*
 * Copyright (c) 2013 Eric F. Palmer
 * See license/LICENSE.txt for the applicable software license
 */

package theBasics.functions.extendString.theString

/*
 * Kotlin functions can extend existing objects which makes using them like having syntactical candy
 *
 * This first example is of the simplest extensions on a string that is possible. It just returns the string
 *
 */

fun String.theString() : String = this

fun main(args : Array<String>){
    print ("A_String".theString())
}


