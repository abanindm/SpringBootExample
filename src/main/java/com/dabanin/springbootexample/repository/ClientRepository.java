package com.dabanin.springbootexample.repository;

import com.dabanin.springbootexample.entity.Client;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by D.Abanin on 06.04.2017.
 */
public interface ClientRepository extends CrudRepository<Client, Integer>{
}
