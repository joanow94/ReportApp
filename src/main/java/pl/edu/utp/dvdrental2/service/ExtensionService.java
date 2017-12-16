/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.utp.dvdrental2.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.edu.utp.dvdrental2.model.Extension;
import pl.edu.utp.dvdrental2.repository.ExtensionRepository;

/**
 *
 * @author nowakowska joanna
 */
@Service
public class ExtensionService {
    
    @Autowired
    private ExtensionRepository extensionRepository;

    public List<Extension> findAll() {
        return extensionRepository.findAll();
    }

    public <S extends Extension> S save(S s) {
        return extensionRepository.save(s);
    }

    public Extension findOne(Integer id) {
        return extensionRepository.findOne(id);
    }

    public void delete(Integer id) {
        extensionRepository.delete(id);
    }
    
}
