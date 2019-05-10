package com.oop.services;


import com.oop.entidades.Cliente;
import com.oop.entidades.DTO.ClienteDTO;
import com.oop.repositories.ClienteRepository;
import com.oop.services.interfaces.ClienteServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ClienteService implements ClienteServiceInterface {

    @Autowired
    private ClienteRepository repo;

    @Override
    public List<Cliente> listarTodos() {
        return this.repo.findAll();
    }

    @Override
    public List<ClienteDTO> listarTodosDTO() {

        List<Cliente> listaClientes = this.repo.findAll();
        List<ClienteDTO> listaClienteDTO = new ArrayList<>();

        listaClientes.forEach(cliente -> listaClienteDTO.add(new ClienteDTO(
                 cliente.getId()
                ,cliente.getNome()
                ,cliente.getEndereco()))
        );

        return listaClienteDTO;
    }

    @Override
    public Cliente listarClientePorId(String id) {

        Optional<Cliente> op = this.repo.findById(id);

        Cliente cliente = op.get();

        return cliente;
    }

    @Override
    public ClienteDTO listaClienteDTOPorId(String id) {

        Optional<Cliente> clienteOptional = this.repo.findById(id);

        ClienteDTO clienteDTO = new ClienteDTO(
                 clienteOptional.get().getId()
                ,clienteOptional.get().getNome()
                ,clienteOptional.get().getEndereco()

        );

        return clienteDTO;
    }

    @Override
    public Cliente incuir(Cliente cliente) {
        return this.repo.save(cliente);
    }

    @Override
    public Cliente alterarCliente(Cliente cliente) { return this.repo.save(cliente); }

    @Override
    public void deletarTodos() {
        this.repo.deleteAll();
    }

}
