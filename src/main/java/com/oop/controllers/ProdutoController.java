package com.oop.controllers;

import com.oop.entidades.DTO.ProdutoDTO;
import com.oop.entidades.Produto;
import com.oop.repositories.ProdutosRepository;
import com.oop.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/produto")
public class ProdutoController {


    @Autowired
    private ProdutoService service;


    @GetMapping(value = "/dto")
    public List<ProdutoDTO> listarTodosMostrandoDTO(){

        return service.listarProdutosDTO();
    }

    @GetMapping
    public List<Produto> listarTodos(){
        return service.listarProdutos();
    }

    @PostMapping
    public  Produto incluir(@RequestBody Produto p){
        return service.inclui(p);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Produto> listarPorId(@PathVariable(name = "id") String id) {
        return ResponseEntity.ok(this.service.pesquisarPorId(id));
    }

    @PutMapping(path=("/{id}"))
    public ResponseEntity<Produto> alterar( @PathVariable(name="id") String id, @RequestBody Produto produto){
        produto.setId(id);
        return ResponseEntity.ok(this.service.alterarProduto(id, produto));
    }

    @DeleteMapping(value = "/deletartodos")
    public int deletarTodos(){
       return this.service.deletarTodos();
    }

}
