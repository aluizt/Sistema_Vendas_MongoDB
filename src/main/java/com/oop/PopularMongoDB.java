package com.oop;

import com.oop.entidades.*;
import com.oop.entidades.DTO.ClienteDTO;
import com.oop.repositories.ClienteRepository;
import com.oop.repositories.PedidoRepository;
import com.oop.repositories.ProdutosRepository;
import com.oop.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import java.util.*;


@Service
public class PopularMongoDB {

    @Autowired
    private ProdutosRepository produtoRepo;

    @Autowired
    private ClienteRepository clienteRepo;

    @Autowired
    private PedidoRepository pedidoRepository;


    public String popularMongoDB() {

        Produto p1 = new Produto();
        p1.setNome("Serveja SKOL");
        p1.setDescricao("Serveja feita com malte ");
        p1.setValorDeCusto(0.98);
        p1.setValorDeVenda(2.99);

        Produto p2 = new Produto();
        p2.setNome("Serveja POLAR");
        p2.setDescricao("Serveja feita com malte ");
        p2.setValorDeCusto(0.93);
        p2.setValorDeVenda(2.79);

        Produto p3 = new Produto();
        p3.setNome("Serveja STELLA ARTOIS");
        p3.setDescricao("Serveja feita com malte ");
        p3.setValorDeCusto(1.93);
        p3.setValorDeVenda(3.79);

        Endereco e1 = new Endereco();
        e1.setRua("Rua Figueira ");
        e1.setNumero("479");
        e1.setComplemento("");
        e1.setBairro("Sumare");
        e1.setCidade("Alvorada");
        e1.setUf("RS");

        Endereco e2 = new Endereco();
        e2.setRua("Rua Figueira ");
        e2.setNumero("479");
        e2.setComplemento("Casa 01");
        e2.setBairro("Sumare");
        e2.setCidade("Alvorada");
        e2.setUf("RS");

        Cliente c1 = new Cliente();
        c1.setNome("Alexandre Luiz Tavares");
        c1.setEndereco(e1);

        Cliente c2 = new Cliente();
        c2.setNome("Janice");
        c2.setEndereco(e2);


        ItensPedido itensPedido1 =new ItensPedido();
        itensPedido1.setItem(p1);
        itensPedido1.setQuantidade(2);
        itensPedido1.setValorUnitario(p1.getValorDeVenda());
        itensPedido1.setValorTotal(p1.getValorDeVenda()*itensPedido1.getQuantidade());

        ItensPedido itensPedido2 =new ItensPedido();
        itensPedido2.setItem(p2);
        itensPedido2.setQuantidade(8);
        itensPedido2.setValorUnitario(p2.getValorDeVenda());
        itensPedido2.setValorTotal(p2.getValorDeVenda()*itensPedido2.getQuantidade());

        List<ItensPedido> listaItensPedidos = new ArrayList<ItensPedido>();
        listaItensPedidos.add(itensPedido1);
        listaItensPedidos.add(itensPedido2);

        ClienteDTO clienteDTO = new ClienteDTO();

        Pedido pedido1 = new Pedido();

        pedido1.setCliente(c1);
        pedido1.setDataDaCriacao(new Date());
        pedido1.setDataDoVencimento(new Date(30));
        pedido1.setEnderecoDeEntrega(c1.getEndereco());
        pedido1.setItensPedido(listaItensPedidos);



        produtoRepo.save(p1);
        produtoRepo.save(p2);
        produtoRepo.save(p3);

        clienteRepo.save(c1);
        clienteRepo.save(c2);

        pedidoRepository.save(pedido1);


        return "ok";

    }

}
