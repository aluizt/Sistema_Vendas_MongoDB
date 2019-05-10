package com.oop.services.interfaces;

import com.oop.entidades.Cliente;
import com.oop.entidades.DTO.ClienteDTO;

import java.util.List;


public interface ClienteServiceInterface {

    public List<Cliente> listarTodos();

    public List<ClienteDTO> listarTodosDTO();

    public Cliente listarClientePorId(String id);

    public ClienteDTO listaClienteDTOPorId(String id);

    public Cliente incuir(Cliente cliente);

    public Cliente alterarCliente(Cliente cliente);

    public void deletarTodos();

}
