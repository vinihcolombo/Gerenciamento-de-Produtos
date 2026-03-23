package com.example.Produto.services;

import com.example.Produto.models.ProdutoModel;
import com.example.Produto.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository repository;

    public ProdutoModel salvar(ProdutoModel produto) {
        return repository.save(produto);
    }

    public List<ProdutoModel> listar() {
        return repository.findAll();
    }

    public ProdutoModel buscar(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}