package com.oop.entidades.DTO;

import com.oop.entidades.Cliente;
import com.oop.entidades.Endereco;
import com.oop.entidades.ItensPedido;
import com.oop.entidades.Pedido;

import java.util.List;

public class PedidoDTO {

    private String id;
    private ClienteDTO cliente;
    private Endereco enderecoDeEntrega;
    private List<ItensPedido> itensPedido;

    public PedidoDTO(){}

    public PedidoDTO(String id, ClienteDTO cliente, Endereco enderecoDeEntrega, List<ItensPedido> itensPedido) {
        this.id = id;
        this.cliente = cliente;
        this.enderecoDeEntrega = enderecoDeEntrega;
        this.itensPedido = itensPedido;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ClienteDTO getCliente() {
        return cliente;
    }

    public void setCliente(ClienteDTO cliente) {
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

    public PedidoDTO criaPedidoDTO(Pedido pedido){



        PedidoDTO pedidoDTO = new PedidoDTO();
        ClienteDTO clienteDTO = new ClienteDTO();

        pedidoDTO.setId(pedido.getId());
        pedidoDTO.setCliente(clienteDTO.criaClienteDTO(pedido.getCliente()));
        pedidoDTO.setEnderecoDeEntrega(pedido.getEnderecoDeEntrega());
        pedidoDTO.setItensPedido(pedido.getItensPedido());

        return pedidoDTO;
    }
}
