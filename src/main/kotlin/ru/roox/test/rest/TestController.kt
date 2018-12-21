package ru.roox.test.rest

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import ru.roox.test.model.Client


@RestController
@RequestMapping("/test")
class TestController {

    @GetMapping("/client")
    fun getTest() : ResponseEntity<Client> = ResponseEntity.ok(Client(25, "Andrew"))



}