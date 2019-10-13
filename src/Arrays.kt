fun main() {
    // Fixed array
    var bloodGroup= arrayOf("A", "B", "O", "AB")

    println("Fixed/static array; Blood Groups")
    for (group in bloodGroup)
        println(group)

    println("First group is " + bloodGroup[0])  // Access element by index

    // Dynamic Array
    var hobbies=ArrayList<String>()             // Dynamic array with elements of type string
    hobbies.add("Coding")                       // Add element to arraylist
    hobbies.add("Reading")

    println(hobbies.size)                       // Count elements in an array

    // Key => Value pair array: HashMap
    var employees=HashMap<String, Int>()        // Hash map with keys type string and values type integer
    employees["Martin"] = 5000                  // Adding element to hash map array type
    employees.put("Cornel", 3000)               // alternative way of adding element
    employees.put("Ouma", 4000)

    println("Key value pair array, keys only")
    for (employee_name in employees.keys)
        println(employee_name)

    println("Key value pair array, values only")
    for (salary in employees.values)
        println(salary)

    println("Hash map array: key and value")
    for ((employee, salary) in employees)
        println("$employee earns $salary")
}