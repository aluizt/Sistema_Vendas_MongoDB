package com.oop.controllers;

import com.oop.entidades.DTO.PedidoDTO;
import com.oop.entidades.Pedido;
import com.oop.services.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/pedido")
public class PedidoController {

   @Autowired
   private PedidoService servicePedido;


   @GetMapping
   public List<Pedido> listarPedidos(){ return this.servicePedido.listarPedidos(); }

   @GetMapping(value = "/dto")
   public List<PedidoDTO> listarPedidosDTO(){ return this.servicePedido.listarPedidosDTO();}

   @PostMapping
   public ResponseEntity<Pedido> incluirPedido(@RequestBody Pedido pedido){
      return ResponseEntity.ok(this.servicePedido.incluirPedido(pedido));
   }

   @DeleteMapping(value = "/deletartodos")
   public void deletarTodos(){
      this.servicePedido.deletarTodos();
   }

}
