package com.oop.services;

import com.oop.entidades.DTO.ClienteDTO;
import com.oop.entidades.DTO.PedidoDTO;
import com.oop.entidades.Pedido;
import com.oop.repositories.PedidoRepository;
import com.oop.services.interfaces.PedidoServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PedidoService implements PedidoServiceInterface {

    @Autowired
    private PedidoRepository repo;

    @Override
    public List<Pedido> listarPedidos() { return this.repo.findAll(); }

    @Override
    public List<PedidoDTO> listarPedidosDTO() {

        List<Pedido> listaPedidos = this.repo.findAll();

        List<PedidoDTO> listaPedidosDTO = new ArrayList<>();
        ClienteDTO clienteDTO = new ClienteDTO();

        listaPedidos.forEach(pedido -> listaPedidosDTO.add(new PedidoDTO(
                pedido.getId(),
                clienteDTO.criaClienteDTO(pedido.getCliente()),
                pedido.getEnderecoDeEntrega(),
                pedido.getItensPedido()))
        );

        return listaPedidosDTO;
    }

    @Override
    public Pedido listaPedidoPorId(String id) {
        Optional<Pedido> op =this.repo.findById(id);
        return op.get();
    }

    @Override
    public Pedido incluirPedido(Pedido pedido ){
        return this.repo.save(pedido);
    }

    @Override
    public Pedido alterarPedido(Pedido pedido) {
        return this.repo.save(pedido);
    }

    @Override
    public void deletarTodos() {
      this.repo.deleteAll();

    }
}
