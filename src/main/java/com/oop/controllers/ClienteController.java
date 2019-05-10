package com.oop.controllers;

import com.oop.entidades.Cliente;
import com.oop.entidades.DTO.ClienteDTO;
import com.oop.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping(value = "/cliente")
public class ClienteController {

    @Autowired
    private ClienteService service;


    @GetMapping
    public List<Cliente> listarTodosClientes(){
        return this.service.listarTodos();
    }

    @GetMapping(value = "/dto")
    public List<ClienteDTO> listarTodosClientesDTO(){ return this.service.listarTodosDTO();}

    @GetMapping(value = "/{id}")
    public ResponseEntity<Cliente> listarClientePorId(@PathVariable(value = "id") String id){
        return ResponseEntity.ok(this.service.listarClientePorId(id));
    }

    @GetMapping(value = "/dto/{id}")
    public ResponseEntity<ClienteDTO> listaClienteDTOPorId(@PathVariable(value = "id") String id){
        return ResponseEntity.ok(this.service.listaClienteDTOPorId(id));
    }

    @PostMapping
    public Cliente incluirCliente(@RequestBody Cliente cliente){

        return this.service.incuir(cliente);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Cliente> alterarCliente(@PathVariable(value = "id") String id, @RequestBody Cliente cliente){
        cliente.setId(id);
        return ResponseEntity.ok(this.service.alterarCliente(cliente));
    }

    @DeleteMapping(value = "/deletartodos")
    public void deletarTodos(){
        this.service.deletarTodos();
    }

}
