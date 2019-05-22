package com.example.demo;

import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
//    long countByStateid(long stateid);
    Iterable<Customer> findAllByLastNameContainingIgnoreCase(String lastName);
//    Iterable<Customer> findAllByCityAndState(String cityid, String stateid);
}
