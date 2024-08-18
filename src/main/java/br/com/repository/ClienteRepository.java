package br.com.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.model.Cliente;


/**
 * @author fsdney
 */


public interface ClienteRepository extends MongoRepository<Cliente, String> {
}
