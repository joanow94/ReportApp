/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.utp.dvdrental2.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.edu.utp.dvdrental2.model.PhoneNumbers;
import pl.edu.utp.dvdrental2.repository.PhoneNumbersRepository;

/**
 *
 * @author nowakowska joanna
 */
@Service
public class PhoneNumbersService {
    
    @Autowired
    private PhoneNumbersRepository phoneNumberRepository;

    public void deleteAll() {
        phoneNumberRepository.deleteAll();
    }
    

    public List<PhoneNumbers> findAll() {
        return phoneNumberRepository.findAll();
    }

    public <S extends PhoneNumbers> List<S> save(Iterable<S> itrbl) {
        return phoneNumberRepository.save(itrbl);
    }

   

    public PhoneNumbers findOne(Integer id) {
        return phoneNumberRepository.findOne(id);
    }

    public void delete(Integer id) {
        phoneNumberRepository.delete(id);
    }
    
}
