package com.oop.services.interfaces;

import com.oop.entidades.DTO.ProdutoDTO;
import com.oop.entidades.Produto;

import java.util.List;

public interface ProdutoServiceInterface {

    public List<Produto> listarProdutos();

    public Produto inclui(Produto p);

    public Produto pesquisarPorId(String p);

    public Produto alterarProduto(String id, Produto produto);

    public List<ProdutoDTO> listarProdutosDTO();

    public int deletarTodos();
}
