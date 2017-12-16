/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.utp.dvdrental2.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.edu.utp.dvdrental2.model.Rental;
import pl.edu.utp.dvdrental2.repository.RentalRepository;

/**
 *
 * @author nowakowska joanna
 */
@Service
public class RentalService {
    
    @Autowired
    private RentalRepository rentalRepository;

    public List<Rental> findAll() {
        return rentalRepository.findAll();
    }

    public <S extends Rental> List<S> save(Iterable<S> itrbl) {
        return rentalRepository.save(itrbl);
    }

    public void deleteAll() {
        rentalRepository.deleteAll();
    }


    public Rental findOne(Integer id) {
        return rentalRepository.findOne(id);
    }

    public void delete(Integer id) {
        rentalRepository.delete(id);
    }
    
}
