package ru.sfedu.aston5again.model

import java.io.Serializable

data class Person(
    val id: Int,
    val name: String,
    val secondName: String,
    val phone: Int
) : Serializable{
    override fun toString(): String {
        return name
    }
}