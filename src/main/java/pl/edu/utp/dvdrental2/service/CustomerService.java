/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.utp.dvdrental2.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.edu.utp.dvdrental2.model.Customer;
import pl.edu.utp.dvdrental2.repository.CustomerRepository;

/**
 *
 * @author nowakowska joanna
 */
@Service
public class CustomerService {
    
    @Autowired
    private CustomerRepository customerRepository;

    public void deleteAll() {
        customerRepository.deleteAll();
    }

    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    public <S extends Customer> List<S> save(Iterable<S> itrbl) {
        return customerRepository.save(itrbl);
    }

    public Customer findOne(Integer id) {
        return customerRepository.findOne(id);
    }

    public void delete(Integer id) {
        customerRepository.delete(id);
    }
    
}
