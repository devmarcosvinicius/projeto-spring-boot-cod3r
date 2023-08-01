package com.marcosviniciusdev.exerciciossb.controllers;

import com.marcosviniciusdev.exerciciossb.model.entities.Cliente;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @GetMapping("/qualquer")
    public Cliente obterCliente() {
        return new Cliente(5, "Marcos Vinicius", "123.456.789-00");
    }

    @GetMapping("/{id}")
    public Cliente obterClientePorId1(@PathVariable int id) {
        return new Cliente(id, "Maria", "987.654.321-00");
    }

    @GetMapping
    public Cliente obterClientePorId2(@RequestParam(name = "id", required = true, defaultValue = "5") int ident) {
        return new Cliente(ident, "Joao Augusto", "111.222.333-44");
    }

}
