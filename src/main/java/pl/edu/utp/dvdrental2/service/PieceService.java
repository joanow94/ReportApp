/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.utp.dvdrental2.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.edu.utp.dvdrental2.model.Piece;
import pl.edu.utp.dvdrental2.repository.PieceRepository;

/**
 *
 * @author nowakowska joanna
 */
@Service
public class PieceService {
    
    @Autowired
    private PieceRepository pieceRepository;

    public void deleteAll() {
        pieceRepository.deleteAll();
    }

    public List<Piece> findAll() {
        return pieceRepository.findAll();
    }

    public <S extends Piece> List<S> save(Iterable<S> itrbl) {
        return pieceRepository.save(itrbl);
    }


    public Piece findOne(Integer id) {
        return pieceRepository.findOne(id);
    }

    public void delete(Integer id) {
        pieceRepository.delete(id);
    }
    
}
