package com.marcosviniciusdev.exerciciossb.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/metodos")
public class MetodosHttpController {

    @GetMapping
    public String get() {
        return "Requisition GET";
    }

    @PostMapping
    public String post() {
        return "Requisition POST";
    }

    @PutMapping
    public String put() {
        return "Requisition PUT";
    }

    @PatchMapping
    public String patch() {
        return "Requisition PATCH";
    }

    @DeleteMapping
    public String delete() {
        return "Requisition DELETE";
    }

}
