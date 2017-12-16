/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.utp.dvdrental2.model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author nowakowska joanna
 */
@Entity
@Table(name = "PIECE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Piece.findAll", query = "SELECT p FROM Piece p")
    , @NamedQuery(name = "Piece.findById", query = "SELECT p FROM Piece p WHERE p.id = :id")
    , @NamedQuery(name = "Piece.findByIsRental", query = "SELECT p FROM Piece p WHERE p.isRental = :isRental")})
public class Piece implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Column(name = "IS_RENTAL")
    private Integer isRental;
    @JoinColumn(name = "ID_MOVIE", referencedColumnName = "ID")
    @ManyToOne
    private Movie idMovie;
    @OneToMany(mappedBy = "idPiece")
    private Collection<Rental> rentalCollection;
    @OneToMany(mappedBy = "idPiece")
    private Collection<Regive> regiveCollection;

    public Piece() {
    }

    public Piece(Integer id) {
        this.id = id;
    }

    public Piece(Integer id, Integer isRental) {
        this.id = id;
        this.isRental = isRental;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIsRental() {
        return isRental;
    }

    public void setIsRental(Integer isRental) {
        this.isRental = isRental;
    }

    public Movie getIdMovie() {
        return idMovie;
    }

    public void setIdMovie(Movie idMovie) {
        this.idMovie = idMovie;
    }

    @XmlTransient
    public Collection<Rental> getRentalCollection() {
        return rentalCollection;
    }

    public void setRentalCollection(Collection<Rental> rentalCollection) {
        this.rentalCollection = rentalCollection;
    }

    @XmlTransient
    public Collection<Regive> getRegiveCollection() {
        return regiveCollection;
    }

    public void setRegiveCollection(Collection<Regive> regiveCollection) {
        this.regiveCollection = regiveCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Piece)) {
            return false;
        }
        Piece other = (Piece) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pl.edu.utp.dvdrental2.model.Piece[ id=" + id + " ]";
    }
    
}
