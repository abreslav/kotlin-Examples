package theBasics.functions.innerFunction

/*
 * functions can be defined inside of other functions.
 */


fun main (args : Array<String>){

    fun insideTop(){
        println ("insideTop")
    }

    var myString : String = "myString Var"
    fun insideMiddle(){
        println ("insideMiddle ${myString}")

    }

    // call the functions above and below
    insideTop()
    insideMiddle()
    // the function must be declared before it is called - the following line won't compile
    //insideBottom()
    fun insideBottom(){
        println ("insideBottom")

    }
    var changeMe : String = "original"
    for (i: Int in 1..10){
        println ("i:$i")
        fun inFor(){
            println("Function Inside of the for loop $i")
            changeMe = "new" + " " + i
        }
        inFor()
    }
    println (changeMe)

    insideBottom()
}

