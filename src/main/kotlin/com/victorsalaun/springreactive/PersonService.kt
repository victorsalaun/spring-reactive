package com.victorsalaun.springreactive

import org.springframework.stereotype.Service

@Service
open class PersonService constructor(
        private val personRepository: PersonRepository
) {

    fun create(person: Person) = personRepository.save(person)

    fun get(id: String) = personRepository.findById(id)

    fun list() = personRepository.findAll()

}