package com.victorsalaun.springreactive

import org.springframework.data.mongodb.repository.ReactiveMongoRepository

interface PersonRepository : ReactiveMongoRepository<Person, String>