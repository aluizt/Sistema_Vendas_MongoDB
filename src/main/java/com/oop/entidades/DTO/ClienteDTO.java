package com.oop.entidades.DTO;


import com.oop.entidades.Cliente;
import com.oop.entidades.Endereco;



public class ClienteDTO {
    private String id;
    private String nome;
    private Endereco endereco;

    public ClienteDTO(){}

    public ClienteDTO(String id,String nome, Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ClienteDTO criaClienteDTO(Cliente cliente){

        ClienteDTO clienteDTO = new ClienteDTO();
        clienteDTO.setId(cliente.getId());
        clienteDTO.setNome(cliente.getNome());
        clienteDTO.setEndereco(cliente.getEndereco());

        return clienteDTO;
    }
}
