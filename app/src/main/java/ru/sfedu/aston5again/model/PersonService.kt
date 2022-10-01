package ru.sfedu.aston5again.model

import com.github.javafaker.Faker

class PersonService {

    val persons: List<Person> = (1..4).map {
        Person(
            id = it,
            name = Faker.instance().name().firstName(),
            secondName = Faker.instance().name().lastName(),
            phone = (0..500000).random()
        )
    }
}