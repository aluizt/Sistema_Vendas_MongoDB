package com.oop.entidades;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Document(collection = "Produtos")
public class Produto extends ModeloAbstrato implements Serializable {

    private static final long serialVersionUID = 1L;

    private String nome;
    private String descricao;
    private double valorDeCusto;
    private double valorDeVenda;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValorDeCusto() {
        return valorDeCusto;
    }

    public void setValorDeCusto(double valorDeCusto) {
        this.valorDeCusto = valorDeCusto;
    }

    public double getValorDeVenda() {
        return valorDeVenda;
    }

    public void setValorDeVenda(double valorDeVenda) {
        this.valorDeVenda = valorDeVenda;
    }


}
