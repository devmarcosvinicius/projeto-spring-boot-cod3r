package com.marcosviniciusdev.exerciciossb.controllers;

import com.marcosviniciusdev.exerciciossb.model.entities.Produto;
import com.marcosviniciusdev.exerciciossb.model.repository.ProdutoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

//    @PostMapping
//    public @ResponseBody Produto novoProduto(@Valid Produto produto) {
//        produtoRepository.save(produto);
//        return produto;
//    }

    @GetMapping
    public Iterable<Produto> obterProdutos() {
        return produtoRepository.findAll();
    }

    @GetMapping(path = "/nome/{parteNome}")
    public Iterable<Produto> obterProdutosPorNome(@PathVariable String parteNome) {
        return produtoRepository.findByNomeContainingIgnoreCase(parteNome);
    }

    @GetMapping(path = "/pagina/{numeroPagina}/{qtdPaginas}/{qtdProdutos}")
    public Iterable<Produto> obterProdutosPorPagina(@PathVariable int numeroPagina, @PathVariable int qtdPaginas, @PathVariable int qtdProdutos) {
        if (qtdPaginas > 10) qtdPaginas = 10;
        if (qtdProdutos > 50) qtdPaginas = 50;

        Pageable page = PageRequest.of(qtdPaginas, qtdProdutos);
        return produtoRepository.findAll(page);
    }

    @GetMapping(path = "{id}")
    public Optional<Produto> obterProdutoPorId(@PathVariable int id) {
        return produtoRepository.findById(id);
    }

//    @PutMapping
//    public Produto alterarProduto(@Valid Produto produto) {
//        produtoRepository.save(produto);
//        return produto;
//    }

    // Esses metodo com o RequestMapping pode substituir os metodos de criar e alterar acima.
    @RequestMapping(method = {RequestMethod.POST, RequestMethod.PUT})
    public @ResponseBody Produto criarESalvarProduto(@Valid Produto produto) {
        produtoRepository.save(produto);
        return produto;
    }

    @DeleteMapping(path = "/{id}")
    public void excluirProduto(@PathVariable int id) {
        produtoRepository.deleteById(id);
    }

}
