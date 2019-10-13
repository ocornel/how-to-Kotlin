fun main(args:Array<String>) {
    var x:Int?=null                     // This variable accepts null. Could be nullable
    println("Enter name")
    var name:String?= readLine()        // How to read user input. Nullable value because user might just press enter without value
    println("Enter age")
    var age:Int = readLine()!!.toInt() // The value read is usually a string, convert to integer. !! means not null so required value

    println("Hello "+name+ " double your age is " + age * 2)    // string, variable concatenation and basic mathematics operation.
}