package com.oop.repositories;

import com.oop.entidades.Pedido;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PedidoRepository extends MongoRepository<Pedido,String> {
}
