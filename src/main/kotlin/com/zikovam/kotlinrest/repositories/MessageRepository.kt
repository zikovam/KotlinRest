package com.zikovam.kotlinrest.repositories

import com.zikovam.kotlinrest.entities.Message
import org.springframework.data.jdbc.repository.query.Query
import org.springframework.data.repository.CrudRepository

interface MessageRepository: CrudRepository<Message, String> {
    @Query("select * from MESSAGES")
    fun getAllMessages(): List<Message>
}