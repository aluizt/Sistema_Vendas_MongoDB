package com.oop.services.interfaces;

import com.oop.entidades.DTO.PedidoDTO;
import com.oop.entidades.Pedido;

import java.util.List;

public interface PedidoServiceInterface {

    public List<Pedido> listarPedidos();

    public List<PedidoDTO> listarPedidosDTO();

    public Pedido listaPedidoPorId(String id);

    public Pedido incluirPedido(Pedido pedido);

    public Pedido alterarPedido(Pedido pedido);

    public void deletarTodos();
}
