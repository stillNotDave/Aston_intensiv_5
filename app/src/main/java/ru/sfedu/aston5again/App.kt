package ru.sfedu.aston5again

import android.app.Application
import ru.sfedu.aston5again.model.PersonService

class App : Application() {
    val personService = PersonService()
}