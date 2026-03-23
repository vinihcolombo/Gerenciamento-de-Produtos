package com.example.Produto.controllers;

import com.example.Produto.models.ProdutoModel;
import com.example.Produto.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService service;

    @PostMapping
    public ProdutoModel salvar(@RequestBody ProdutoModel produto) {
        return service.salvar(produto);
    }

    @GetMapping
    public List<ProdutoModel> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public ProdutoModel buscar(@PathVariable Long id) {
        return service.buscar(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}