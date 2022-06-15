package com.example.calculatrice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var isNewOperator = true
    var operator = "+"
    var initialNumber = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun number(view: View) {
        if (isNewOperator) editText.setText("")
        isNewOperator = false

        var number: String = editText.text.toString()

        if (view.id === button1.id) {
            number += "1"
        }
        else if (view.id === button2.id) {
            number += "2"
        }
        else if (view.id === button3.id) {
            number += "3"
        }
        else if (view.id === button4.id) {
            number += "4"
        }
        else if (view.id === button5.id) {
            number += "5"
        }
        else if (view.id === button6.id) {
            number += "6"
        }
        else if (view.id === button7.id) {
            number += "7"
        }
        else if (view.id === button8.id) {
            number += "8"
        }
        else if (view.id === button9.id) {
            number += "9"
        }
        else if (view.id === button0.id) {
            number += "0"
        }
        else if (view.id === buttonDot.id) {
            number += "."
        }
        editText.setText(number)
    }

    fun operator(view: View) {
        isNewOperator = true
        initialNumber = editText.text.toString()

        if (view.id === buttonMultiply.id) {
            operator = "*"
        }
        else if (view.id === buttonMinus.id) {
            operator = "-"
        }
        else if (view.id === buttonDivide.id) {
            operator = "/"
        }
        else if (view.id === buttonPlus.id) {
            operator = "+"
        }
    }

    fun result(view: View?){
        val newNumber: String = editText.text.toString()
        var output = 0.0

        if (operator === "+") output = initialNumber.toDouble() + newNumber.toDouble()
        if (operator === "/") output = initialNumber.toDouble() / newNumber.toDouble()
        if (operator === "*") output = initialNumber.toDouble() * newNumber.toDouble()
        if (operator === "-") output = initialNumber.toDouble() - newNumber.toDouble()

        editText.setText(output.toString() + "")
    }

    fun reset(view: View?) {
        editText.setText("0")
        isNewOperator = true
    }

    fun pourcent(view: View?) {
        val num: Double = editText.text.toString().toDouble() / 100
        editText.setText(num.toString() + "")
        isNewOperator = true
    }
}