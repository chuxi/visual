package com.weichew.dev.controller;

import com.weichew.dev.model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created by king on 15-3-30.
 */
public interface CustomerRepository extends MongoRepository<Customer, String> {
    public Customer findByFirstName(String firstname);
    public List<Customer> findByLastName(String lastname);
}
