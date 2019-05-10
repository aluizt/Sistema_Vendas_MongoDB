package com.oop.repositories;

import com.oop.entidades.Produto;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProdutosRepository extends MongoRepository<Produto, String> {

}
