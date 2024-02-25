package com.example.learnkotlin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.learnkotlin.ui.theme.LearnKotlinTheme

/*class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LearnKotlinTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LearnKotlinTheme {
        Greeting("Android")
    }
}*/



// ######  LEARNING STARTS HERE :  #######
/*
private fun testMinOf(a: Int, b: Int): Int = if (a<b) a else b


fun main(){
    var res: Int = testMinOf(48,95)
    println(testMinOf(34,22))
}


class Student(var name: String = "", var isGraduated: Boolean = false){
    private var password: String? = null
    fun setPassword(newPassword: String){
        this.password = newPassword
        println("Password is updated")
    }
}

fun main(args: Array<String>) {
    val student = Student()
    student.name = "Erwan"
    student.setPassword("123456")
    println("Hello student, your name is : ${student.name} ")
    println("Your graduation status : ${student.isGraduated} ")
}

class User (email: String, private var password: String, var age: Int) {
    var email: String = email
        get() {
            println("User is getting email.");
            return field
        }
        set(value) {
            println("User is setting email.");
            field = value
        }
}

class Parent ( var firstname: String = "", var lastname: String = "", var phone: String = "", var emailAddress: String = "", var postalAddress: String = "")
class Child (var firstname: String = "", var lastname: String = "", var parent1: Parent, var parent2: Parent, var postalAddress: String = "", var allergies: Array<String> = [])
*/





// ##### Switch cases like in Java ########

/*var leRetour = 200

fun printResponse(reponsedelapi: Int) = when (reponsedelapi){
    200, 201, 202 -> print("SUCCESS")
    300, 301, 302 -> print("REDIRECTION")
    401, 403, 404 -> print ("ERROR")
    else -> print("UNKNOWN")
}

fun main(){
    printResponse(leRetour)
}*/





// ####### Enumeration ######

/*private enum class ApiResponses(code: Int) {
    OK(200),
    NOT_FOUND(404),
    UNAUTHORIZED(401),
    FORBIDDEN(403),
    UNKNOWN(0);
}

val reponse: ApiResponses = ApiResponses.UNKNOWN

when (reponse) {
    ApiResponses.OK -> print("OK")
    ApiResponses.FORBIDDEN -> print("FORBIDDEN")
    // ...
} */




// ###### WHILE ######
/*const val condition: Boolean = true
fun main() {
    while (condition) {
        println("Condition met.")
    }

    do {
        println("Condition met.")
    } while (condition)
}
*/




// ###### Boucle for ######
/*val nomsComplets = listOf("me", "myself", "I")
fun main() {
    for ((index,nom) in nomsComplets.withIndex()) {
        println("it's $nom on line $index")
    }
    //intervalles
    for (i in 0..9) {
        print(i)
        println(" which comes before")
    }

    // extra for
    for (j in 10 downTo 1 step 2) println("Index is $j")
}*/




// ######## List vs Set #########
/*
val listOfNames: List<String> = listOf("Jake Wharton", "Joe Birch", "Robert Martin")
val mutableListOfNames: List<String> = mutableListOf("Jake Wharton", "Joe Birch", "Robert Martin")
val setOfNames: Set<String> = setOf("Jake Wharton", "Joe Birch", "Robert Martin")
val mutableSetOfNames: Set<String> = mutableSetOf("Jake Wharton", "Joe Birch", "Robert Martin")


fun main(){
    println("This is mutableListOfNames[0] : $mutableListOfNames[0]")
    println("Executing : mutableListOfNames[0] = \"Mathieu Nebra\"")
    mutableListOfNames[0] = "Mathieu Nebra"
    println(mutableListOfNames)
    println("Tests on sets \n\n\n")
    println("mutable set of names : $mutableSetOfNames")
    println("setOfNames.first() -> " + setOfNames.first())
    mutableSetOfNames.add("test")
    println("mutable set of names now : $mutableSetOfNames")
}*/




// ####### Conversions intelligentes #######
//Mon idée :
/*fun getDefaultSize(objetInconnu: Any): Int {
    if (objetInconnu is String) return objetInconnu.length
    else if (objetInconnu is List<*>) return objetInconnu.size
    return 0
}*/

//Kotlin-friendly
/*fun getDefaultSize(objetInconnu: Any) = when (objetInconnu) {
    is String -> objetInconnu.length
    is List<*> -> objetInconnu.size
    else -> -1
}

fun main() {
    val monObjet = listOf("python", "kotlin", "c++")
    var resultat = getDefaultSize(monObjet)
    println(resultat)
    // Conversion Any -> String
    // val objetInconnu2: Any = "Slt, c'est moi"
    // val retour = objetInconnu2 as String
    // print(retour)

    //not kotlin friendly
    /*try {
        val tentative = monObjet as Int
        println(tentative)
    }
    catch (exception: ClassCastException){
        print ("ClassCastException error !")
    }*/

    // kotlin friendly
    val mmessage: Int? = monObjet as? Int
    print(mmessage)
}*/




// ######### Exceptions ############
private fun soustraitNombre(a: Int, b: Int) = if (a >= b) a - b else throw Exception("a is smaller than b!")
fun main() {
    try {
        print(soustraitNombre(5, 6))
    }
    catch (e: Exception) {
        print(e.message)
    }
}