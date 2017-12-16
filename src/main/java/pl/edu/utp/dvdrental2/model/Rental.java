/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.utp.dvdrental2.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author nowakowska joanna
 */
@Entity
@Table(name = "RENTAL")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Rental.findAll", query = "SELECT r FROM Rental r")
    , @NamedQuery(name = "Rental.findById", query = "SELECT r FROM Rental r WHERE r.id = :id")
    , @NamedQuery(name = "Rental.findByDateOfRental", query = "SELECT r FROM Rental r WHERE r.dateOfRental = :dateOfRental")})
public class Rental implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Column(name = "DATE_OF_RENTAL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateOfRental;
    @OneToMany(mappedBy = "idRental")
    private Collection<Extension> extensionCollection;
    @JoinColumn(name = "ID_CUSTOMER", referencedColumnName = "ID")
    @ManyToOne
    private Customer idCustomer;
    @JoinColumn(name = "ID_PIECE", referencedColumnName = "ID")
    @ManyToOne
    private Piece idPiece;

    public Rental() {
    }

    public Rental(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDateOfRental() {
        return dateOfRental;
    }

    public void setDateOfRental(Date dateOfRental) {
        this.dateOfRental = dateOfRental;
    }

    @XmlTransient
    public Collection<Extension> getExtensionCollection() {
        return extensionCollection;
    }

    public void setExtensionCollection(Collection<Extension> extensionCollection) {
        this.extensionCollection = extensionCollection;
    }

    public Customer getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(Customer idCustomer) {
        this.idCustomer = idCustomer;
    }

    public Piece getIdPiece() {
        return idPiece;
    }

    public void setIdPiece(Piece idPiece) {
        this.idPiece = idPiece;
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
        if (!(object instanceof Rental)) {
            return false;
        }
        Rental other = (Rental) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pl.edu.utp.dvdrental2.model.Rental[ id=" + id + " ]";
    }
    
}
