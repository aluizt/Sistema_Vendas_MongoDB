package com.oop.repositories;

import com.oop.entidades.Cliente;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClienteRepository extends MongoRepository <Cliente, String >{
}
