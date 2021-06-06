package com.zikovam.kotlinrest.services

import com.zikovam.kotlinrest.entities.Message
import com.zikovam.kotlinrest.repositories.MessageRepository
import org.springframework.stereotype.Service

@Service
class MessageService(val db: MessageRepository) {

    fun getAllMessages(): List<Message> = db.getAllMessages()

    fun save(message: Message){
        db.save(message)
    }
}