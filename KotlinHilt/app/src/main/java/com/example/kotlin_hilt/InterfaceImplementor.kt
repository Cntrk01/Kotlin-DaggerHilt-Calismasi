package com.example.kotlin_hilt

import javax.inject.Inject

class InterfaceImplementor
    @Inject constructor() :MyInterface {
    override fun myPrintFunction(): String {
        return "My Interface Implementor"
    }
}
