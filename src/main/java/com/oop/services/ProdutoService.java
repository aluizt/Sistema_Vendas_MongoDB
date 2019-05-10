package com.oop.services;

import com.oop.entidades.DTO.ProdutoDTO;
import com.oop.entidades.Produto;
import com.oop.repositories.ProdutosRepository;
import com.oop.services.interfaces.ProdutoServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService  implements ProdutoServiceInterface {

    @Autowired
    private ProdutosRepository repo;

    @Override
    public List<Produto> listarProdutos() {
        return this.repo.findAll();
    }

    @Override
    public Produto inclui(Produto p) {
        return this.repo.save(p);
    }

    @Override
    public Produto pesquisarPorId(String p) {
        Optional<Produto> op = this.repo.findById(p);

        return op.get();
    }

    @Override
    public Produto alterarProduto(String id, Produto produto) {
        produto.setId(id);

        return this.repo.save(produto);
    }

    @Override
    public List<ProdutoDTO> listarProdutosDTO() {
        List<Produto> listaProdutos = this.repo.findAll();

        List<ProdutoDTO> listaProdutosDTO = new ArrayList<ProdutoDTO>();

        listaProdutos.forEach(produto -> listaProdutosDTO.add(new ProdutoDTO(produto.getNome(),produto.getDescricao())));

        return listaProdutosDTO;
    }

    @Override
    public int deletarTodos() {
        this.repo.deleteAll();
        return 1;
    }
}
