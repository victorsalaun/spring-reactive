package com.victorsalaun.springreactive

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Person(
        @Id
        var id: String? = null,
        var name: String? = null
)