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
