package com.example.hellokotlin.koans

/*
Delegates
You may declare your own delegates. Implement the methods of the class 'EffectiveDate' so it can be delegated to. Store only the time in milliseconds in 'timeInMillis' property.

Use the extension functions MyDate.toMillis() and Long.toDate(), defined at MyDate.kt
 */

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class D {
    var date: MyDate by EffectiveDate()
}

class EffectiveDate<R> : ReadWriteProperty<R, MyDate> {

    var timeInMillis: Long? = null

    override fun getValue(thisRef: R, property: KProperty<*>): MyDate {
        TODO()
    }

    override fun setValue(thisRef: R, property: KProperty<*>, value: MyDate) {
        TODO()
    }
}