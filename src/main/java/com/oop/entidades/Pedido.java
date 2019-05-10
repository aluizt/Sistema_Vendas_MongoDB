package com.oop.entidades;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.oop.entidades.DTO.ClienteDTO;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Document(collection = "Pedidos")
public class Pedido extends ModeloAbstrato {

    @JsonFormat(pattern="dd/MM/yyyy HH:mm:ss")
    private Date dataDaCriacao;

    @JsonFormat(pattern="dd/MM/yyyy HH:mm:ss" )
    private Date dataDoVencimento;

    private Cliente cliente;
    private Endereco enderecoDeEntrega;
    private List<ItensPedido> itensPedido;


    public Pedido(){}

    public Pedido(Date dataDaCriacao, Date dataDoVencimento, Cliente cliente, Endereco enderecoDeEntrega, List<ItensPedido> itensPedido) {
        super();
        this.dataDaCriacao = dataDaCriacao;
        this.dataDoVencimento = dataDoVencimento;
        this.cliente = cliente;
        this.enderecoDeEntrega = enderecoDeEntrega;
        this.itensPedido = itensPedido;
    }

    public Date getDataDaCriacao() {
        return dataDaCriacao;
    }

    public void setDataDaCriacao(Date dataDaCriacao) {
        this.dataDaCriacao = dataDaCriacao;
    }

    public Date getDataDoVencimento() {
        return dataDoVencimento;
    }

    public void setDataDoVencimento(Date dataDoVencimento) {
        this.dataDoVencimento = dataDoVencimento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Endereco getEnderecoDeEntrega() {
        return enderecoDeEntrega;
    }

    public void setEnderecoDeEntrega(Endereco enderecoDeEntrega) {
        this.enderecoDeEntrega = enderecoDeEntrega;
    }

    public List<ItensPedido> getItensPedido() {
        return itensPedido;
    }

    public void setItensPedido(List<ItensPedido> itensPedido) {
        this.itensPedido = itensPedido;
    }
}
