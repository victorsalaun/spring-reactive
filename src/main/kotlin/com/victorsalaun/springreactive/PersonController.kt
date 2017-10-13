package com.victorsalaun.springreactive

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/persons")
open class PersonController @Autowired constructor(
        private val personService: PersonService)
{

    @PostMapping(produces = arrayOf(MediaType.TEXT_EVENT_STREAM_VALUE))
    @ResponseBody
    fun create(@RequestBody person: Person) = personService.create(person)

    @GetMapping("/{id}", produces = arrayOf(MediaType.TEXT_EVENT_STREAM_VALUE))
    @ResponseBody
    fun get(@PathVariable id: String) = personService.get(id)

    @GetMapping(produces = arrayOf(MediaType.TEXT_EVENT_STREAM_VALUE))
    @ResponseBody
    fun list() = personService.list()

}