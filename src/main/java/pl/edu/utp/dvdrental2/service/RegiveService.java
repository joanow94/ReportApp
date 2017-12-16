/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.utp.dvdrental2.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.edu.utp.dvdrental2.model.Regive;
import pl.edu.utp.dvdrental2.repository.RegiveRepository;

/**
 *
 * @author nowakowska joanna
 */
@Service
public class RegiveService {
    
    @Autowired
    private RegiveRepository regiveRepository;

    public List<Regive> findAll() {
        return regiveRepository.findAll();
    }

    public <S extends Regive> S save(S s) {
        return regiveRepository.save(s);
    }

    public Regive findOne(Integer id) {
        return regiveRepository.findOne(id);
    }

    public void delete(Integer id) {
        regiveRepository.delete(id);
    }
    
}
