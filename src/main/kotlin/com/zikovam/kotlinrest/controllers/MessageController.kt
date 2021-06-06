package com.zikovam.kotlinrest.controllers

import com.zikovam.kotlinrest.entities.Message
import com.zikovam.kotlinrest.services.MessageService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("messages")
class MessageController(val service: MessageService) {
    @GetMapping
    fun index(): List<Message>{
        return service.getAllMessages()
    }

    @PostMapping
    fun saveNewMessage(@RequestBody message: Message){
        service.save(message)
    }
}