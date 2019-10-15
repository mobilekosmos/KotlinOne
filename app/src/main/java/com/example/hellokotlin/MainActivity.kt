package com.example.hellokotlin

import android.os.Bundle
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
        if (args.size != 0) {
            printToConsoleView("Arguemnt:, ${args[0]}")

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

}
