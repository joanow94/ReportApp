/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.utp.dvdrental2.repository;

import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.edu.utp.dvdrental2.model.Extension;

/**
 *
 * @author nowakowska joanna
 */
@Repository
public interface ExtensionRepository extends JpaRepository<Extension, Integer>{
    
}
