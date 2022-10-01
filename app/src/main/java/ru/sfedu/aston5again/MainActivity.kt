package ru.sfedu.aston5again

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.sfedu.aston5again.model.Person
import ru.sfedu.aston5again.model.PersonService

class MainActivity : AppCompatActivity(), AppContract {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if(savedInstanceState == null){
            supportFragmentManager.beginTransaction()
                .add(R.id.fragment_container, PersonListFragment())
                .commit()
        }

    }

    override val personService: PersonService
        get() = (applicationContext as App).personService

    override fun launchPersonDetailsScreen(person: Person) {
        val fragment = PersonDetailsFragment.newInstance(person)
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .addToBackStack(null)
            .commit()
    }
}