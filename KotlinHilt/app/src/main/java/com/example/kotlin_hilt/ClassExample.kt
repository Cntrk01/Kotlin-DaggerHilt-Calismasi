package com.example.kotlin_hilt

import com.google.gson.Gson
import javax.inject.Inject

class ClassExample
@Inject constructor(@FirstImplementor private val myInterface:MyInterface, private val gson: Gson,@SecondImplementor private val mySecondInterfaceImplementor:MyInterface) {
    fun myPrintFunction():String{
        return "Working : ${myInterface.myPrintFunction()}"
    }
    fun secondFunction():String{
        return "Working : ${mySecondInterfaceImplementor.myPrintFunction()}"
    }
}