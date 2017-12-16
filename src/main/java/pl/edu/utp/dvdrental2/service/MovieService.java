/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.utp.dvdrental2.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.edu.utp.dvdrental2.model.Movie;
import pl.edu.utp.dvdrental2.repository.MovieRepository;

/**
 *
 * @author nowakowska joanna
 */
@Service
public class MovieService {
    
    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> findAll() {
        return movieRepository.findAll();
    }

    public <S extends Movie> List<S> save(Iterable<S> itrbl) {
        return movieRepository.save(itrbl);
    }

   

    public Movie findOne(Integer id) {
        return movieRepository.findOne(id);
    }

    public void delete(Integer id) {
        movieRepository.delete(id);
    }
    
    
}
