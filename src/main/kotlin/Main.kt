fun main(){
    println(details("Marisah",45,"Rwanda"))
    myself("Sammy")
    println(vowels("beautiful"))
    println(allNames("myself"))


}

//1. Write a function that takes in 3 parameters, name, age, and country, and returns a String with this structure
//“Hi, my name is x, I am y years old and I am from z.” Where x, y, and z are the provided name, age, and country respectively. (3 points)
fun details(name:String,age:Int,country:String):String{
    return "Hi, my name $name, I am $age years old and I am from $country"

}
//2. Write a function that takes in a String and returns its length (2 points)
fun allNames(str:String):Int{
    return str.length

}
//3. Write a function that takes in a name and prints out “That’s me!”
//when your name is passed to it, otherwise, it prints out “I don’t know who that is” (3 points)
fun myself(name: String){
    var y="Sammy"
    if (name.equals(y)){
        println("That's me!")
    }
    else{
        println("I don't know who that is")
    }

}
//4. Write a Kotlin function that takes in a string will all the vowels replaces by the character ‘*’.
//Use string interpolation to generate the output. (2 points)
fun vowels(str: String):String{


val vowels = "aeiouAEIOU"
var result = ""
for (i in str) {
    if (i in vowels) {
        result += i
    }
    else {
        result += i
    }
}
return result
}




