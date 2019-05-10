package com.oop.entidades;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;

import java.util.Date;

public abstract class ModeloAbstrato {

    @Id
    private String id;

    @JsonFormat(pattern="dd/MM/yyyy HH:mm:ss")
    @CreatedDate
    private Date dataDeCriacao;

    @JsonFormat(pattern="dd/MM/yyyy HH:mm:ss")
    @LastModifiedDate
    private Date dataDaUltimaModificacao;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDataDeCriacao() {
        return dataDeCriacao;
    }

    public void setDataDeCriacao(Date dataDeCriacao) {
        this.dataDeCriacao = dataDeCriacao;
    }

    public Date getDataDaUltimaModificacao() {
        return dataDaUltimaModificacao;
    }

    public void setDataDaUltimaModificacao(Date dataDaUltimaModificacao) {
        this.dataDaUltimaModificacao = dataDaUltimaModificacao;
    }
}
