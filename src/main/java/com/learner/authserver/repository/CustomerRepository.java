package com.learner.authserver.repository;


import com.learner.authserver.model.Customers;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CustomerRepository extends CrudRepository<Customers,Long> {

  Optional<Customers> findByEmail(String email);
}
