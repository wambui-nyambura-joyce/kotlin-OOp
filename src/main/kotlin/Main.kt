fun main() {
val being = Human("Joyce", 21, 70)
    being.eat(3)
    println( being.weight)
    being.speak("Hooray!")
    being.birthday()
    println(being.age)
    val herUser=User("Sonia", "Uwamohoro","sonia@gmail.com","0712345678","nyambura")
    println(herUser.email)
    println(herUser.password)



}
class Human(var name: String, var age:Int, var weight:Int){
    fun eat(foodWeight:Int){
     println("I am eating $foodWeight kgs of food")
        weight+=foodWeight
    }
    fun speak(speech:String){
        println(speech)
    }
    fun birthday(){
        age++
    }

}
data class User(var firstName:String, var lastName:String, var email:String,var phoneNumber:String, var password:String)