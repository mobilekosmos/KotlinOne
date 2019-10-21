package com.example.hellokotlin

import android.os.Bundle
import android.os.Message
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_main.*

class MainActivity : AppCompatActivity() {

    // https://try.kotlinlang.org/

    // Don't need this like on Java, you can directly access the object by it's ID.
    var mTextView : TextView? = null;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
    }

    // #2 Create a function that receives an array of strings and print the first argument.
    fun readNameFromCommandLine(args : Array<String>) {
        clearConsoleView()
        if (args.isNotEmpty()) {
            printToConsoleView("Argument:, ${args[0]}")

            println()
        } else {
            println("Please provide letters to pass the test.")
            return
        }
    }

    private fun clearConsoleView() {
        textView3.text = ""
    }

    private fun printToConsoleView(s: String) {
        textView3.text = textView3.text.toString() + s
    }

    // #3 Create a function that receives an array of strings and print all passed arguments.
    fun readNamesFromCommandLine(args : Array<String>) {
        clearConsoleView()
        for (arg in args) {
            printToConsoleView("Hello, ${arg}!")
        }
    }

    // #4
    /**
     * In this example, `val` denotes a declaration of a read-only local variable,
     * that is assigned a pattern matching expression.
     * See http://kotlinlang.org/docs/reference/control-flow.html#when-expression
     */
    fun readLanguage(language: String?) {
        val language = if (language != null) language else "EN"
    }

    // #5 According to a given parameter print Hello if EN, Hallo if DE, Hola if ES, otherwise
    // an alternative text. Use Elvis expression.
    fun sayHello(language: String?) {
        val language = language ?: "EN"
        println(when(language) {
            "EN" -> "Hello"
            "DE" -> "Hallo"
            "ES" -> "Hola"
            else -> "Sorry, I can only understand English, German and Spanish"
        })
    }

    // #6 Create a static class that receives one argument an call a method from that class
    // which uses that argument. The argument cannot be null.
    class MyNewKotlinClass(private val message: String) {
        fun sayHi() {
            println("Message, $message")
        }
    }

    fun callClassFunction() {
        MyNewKotlinClass("Hello there!").sayHi()
    }


    // #7 Given 2 arguments calculate the max value in a separate function and print it from where
    // you call the function.
    fun calculateMax(args: Array<String>) {
        println(max(args[0].toInt(), args[1].toInt()))
    }

    fun max(a: Int, b : Int) = if (a>b) a else b
}
