/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.utp.dvdrental2.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.edu.utp.dvdrental2.model.Reservation;
import pl.edu.utp.dvdrental2.repository.ReservationRepository;

/**
 *
 * @author nowakowska joanna
 */
@Service
public class ReservationService {
    
    @Autowired
    private ReservationRepository reservationRepository;

    public List<Reservation> findAll() {
        return reservationRepository.findAll();
    }

    public <S extends Reservation> List<S> save(Iterable<S> itrbl) {
        return reservationRepository.save(itrbl);
    }

    public void deleteAll() {
        reservationRepository.deleteAll();
    }

    

    public Reservation findOne(Integer id) {
        return reservationRepository.findOne(id);
    }

    public void delete(Integer id) {
        reservationRepository.delete(id);
    }
    
}
