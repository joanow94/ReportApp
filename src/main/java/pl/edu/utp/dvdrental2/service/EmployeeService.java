/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.utp.dvdrental2.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.edu.utp.dvdrental2.model.Employee;
import pl.edu.utp.dvdrental2.repository.EmployeeRepository;

/**
 *
 * @author nowakowska joanna
 */
@Service
public class EmployeeService {
    
    @Autowired
    private EmployeeRepository employeeRepository;
    

    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    public <S extends Employee> List<S> save(Iterable<S> itrbl) {
        return employeeRepository.save(itrbl);
    }

    public Employee findOne(Integer id) {
        return employeeRepository.findOne(id);
    }

    public void delete(Integer id) {
        employeeRepository.delete(id);
    }

    public void deleteAll() {
        employeeRepository.deleteAll();
    }
    
}
