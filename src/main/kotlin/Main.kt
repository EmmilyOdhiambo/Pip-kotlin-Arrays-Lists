import javax.management.MBeanRegistration

fun main() {
    myNumbers()
    var names = studentsNames("Emmily","Stephanie","Odhiambo")
    println(names.contentToString())
    println(calculateAvg())

    var people = listOf(
        Person("Emmily",20,5,68.7)



    )
    var newPeople = people.sortedByDescending { it.age }
    println(newPeople)
}
// Create one function that is given the below array:
//var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
//(i) prints out the sum of the second and fifth elements (1 point)
//(ii) prints out the index of 158 (1 point)
//(iii) prints out the elements in ascending order.
fun myNumbers (){
    var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
    var num = numbers[1] +numbers[4]
    println(num)
    println(numbers.indexOf(158))
    println(numbers.sorted())

}
//Given a list of Person objects, each with the attributes, name, age, height, and weight. Sort the list in order of descending age
data class Person(var name:String,var age:Int,var height:Int,var weight:Double)

//Create a function that takes in 3 names and returns a string array containing all 3 names.
fun studentsNames(name1:String,name2:String,name3:String):Array<String>{
    return arrayOf(name1,name2,name3)
}
//Write a function that takes in a list of Car objects each with a registration and mileage
//attribute and returns the average mileage of all the vehicles in the list.
data class  Car(val registration: String,val mileage:Double)
fun calculateAvg() :Double{
    var vehicleone = Car("KWZ4", 1000.0)
    var vehiclestwo = Car("PZG5", 2000.0)
    var vehiclestthree = Car("GLP9", 3000.0)

    var vehicles = listOf(vehicleone, vehiclestwo, vehiclestthree)
    var totalMilaeage = 0.0
    for (vehicle in vehicles) {
        totalMilaeage += vehicle.mileage


    }
    var average = vehicles.size
    var new = totalMilaeage / average
    return new
}



