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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author nowakowska joanna
 */
@Entity
@Table(name = "MOVIE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Movie.findAll", query = "SELECT m FROM Movie m")
    , @NamedQuery(name = "Movie.findById", query = "SELECT m FROM Movie m WHERE m.id = :id")
    , @NamedQuery(name = "Movie.findByTitle", query = "SELECT m FROM Movie m WHERE m.title = :title")
    , @NamedQuery(name = "Movie.findByDirector", query = "SELECT m FROM Movie m WHERE m.director = :director")
    , @NamedQuery(name = "Movie.findByGenre", query = "SELECT m FROM Movie m WHERE m.genre = :genre")
    , @NamedQuery(name = "Movie.findByCountry", query = "SELECT m FROM Movie m WHERE m.country = :country")
    , @NamedQuery(name = "Movie.findByYearOfPremiere", query = "SELECT m FROM Movie m WHERE m.yearOfPremiere = :yearOfPremiere")
    , @NamedQuery(name = "Movie.findByPriceForDay", query = "SELECT m FROM Movie m WHERE m.priceForDay = :priceForDay")})
public class Movie implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "TITLE")
    private String title;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "DIRECTOR")
    private String director;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "GENRE")
    private String genre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "COUNTRY")
    private String country;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4)
    @Column(name = "YEAR_OF_PREMIERE")
    private String yearOfPremiere;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PRICE_FOR_DAY")
    private int priceForDay;
    @OneToMany(mappedBy = "idPreviousMovie")
    private Collection<Movie> movieCollection;
    @JoinColumn(name = "ID_PREVIOUS_MOVIE", referencedColumnName = "ID")
    @ManyToOne
    private Movie idPreviousMovie;
    @OneToMany(mappedBy = "idMovie")
    private Collection<Reservation> reservationCollection;
    @OneToMany(mappedBy = "idMovie")
    private Collection<Piece> pieceCollection;

    public Movie() {
    }

    public Movie(Integer id) {
        this.id = id;
    }

    public Movie(Integer id, String title, String director, String genre, String country, String yearOfPremiere, int priceForDay) {
        this.id = id;
        this.title = title;
        this.director = director;
        this.genre = genre;
        this.country = country;
        this.yearOfPremiere = yearOfPremiere;
        this.priceForDay = priceForDay;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getYearOfPremiere() {
        return yearOfPremiere;
    }

    public void setYearOfPremiere(String yearOfPremiere) {
        this.yearOfPremiere = yearOfPremiere;
    }

    public int getPriceForDay() {
        return priceForDay;
    }

    public void setPriceForDay(int priceForDay) {
        this.priceForDay = priceForDay;
    }

    @XmlTransient
    public Collection<Movie> getMovieCollection() {
        return movieCollection;
    }

    public void setMovieCollection(Collection<Movie> movieCollection) {
        this.movieCollection = movieCollection;
    }

    public Movie getIdPreviousMovie() {
        return idPreviousMovie;
    }

    public void setIdPreviousMovie(Movie idPreviousMovie) {
        this.idPreviousMovie = idPreviousMovie;
    }

    @XmlTransient
    public Collection<Reservation> getReservationCollection() {
        return reservationCollection;
    }

    public void setReservationCollection(Collection<Reservation> reservationCollection) {
        this.reservationCollection = reservationCollection;
    }

    @XmlTransient
    public Collection<Piece> getPieceCollection() {
        return pieceCollection;
    }

    public void setPieceCollection(Collection<Piece> pieceCollection) {
        this.pieceCollection = pieceCollection;
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
        if (!(object instanceof Movie)) {
            return false;
        }
        Movie other = (Movie) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pl.edu.utp.dvdrental2.model.Movie[ id=" + id + " ]";
    }
    
}
