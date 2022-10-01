package ru.sfedu.aston5again

import androidx.fragment.app.Fragment
import ru.sfedu.aston5again.model.Person
import ru.sfedu.aston5again.model.PersonService

fun Fragment.contract(): AppContract = requireActivity() as AppContract

interface AppContract {
    val personService: PersonService

    fun launchPersonDetailsScreen(person: Person)
}