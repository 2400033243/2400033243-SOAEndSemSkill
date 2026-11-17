package com.klu.springmvc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    @GetMapping("/")
    public String home() {
        return "Book Microservice is Running Successfully!";
    }

    @GetMapping("/books")
    public String getBooks() {
        return "Welcome to Book Microservice API!";
    }
}
