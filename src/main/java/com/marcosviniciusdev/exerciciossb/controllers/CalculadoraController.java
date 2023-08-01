package com.marcosviniciusdev.exerciciossb.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {

    //    /calculadora/somar/10/20
    @RequestMapping("/somar/{a}/{b}")
    public int subtrair(@PathVariable int a, @PathVariable int b) {
        return a + b;
    }

    //    /calculadora/subtrair?a=100&b=39
    @RequestMapping("/subtrair")
    public int somar(@RequestParam(name = "a") int a, @RequestParam(name = "b") int b) {
        return a - b;
    }

}
