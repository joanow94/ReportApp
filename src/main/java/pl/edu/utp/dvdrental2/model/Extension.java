/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.utp.dvdrental2.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author nowakowska joanna
 */
@Entity
@Table(name = "EXTENSION")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Extension.findAll", query = "SELECT e FROM Extension e")
    , @NamedQuery(name = "Extension.findById", query = "SELECT e FROM Extension e WHERE e.id = :id")
    , @NamedQuery(name = "Extension.findByDays", query = "SELECT e FROM Extension e WHERE e.days = :days")
    , @NamedQuery(name = "Extension.findByDateOfExtension", query = "SELECT e FROM Extension e WHERE e.dateOfExtension = :dateOfExtension")})
public class Extension implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DAYS")
    private int days;
    @Column(name = "DATE_OF_EXTENSION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateOfExtension;
    @JoinColumn(name = "ID_RENTAL", referencedColumnName = "ID")
    @ManyToOne
    private Rental idRental;

    public Extension() {
    }

    public Extension(Integer id) {
        this.id = id;
    }

    public Extension(Integer id, int days, Date dateOfExtension) {
        this.id = id;
        this.days = days;
        this.dateOfExtension = dateOfExtension;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public Date getDateOfExtension() {
        return dateOfExtension;
    }

    public void setDateOfExtension(Date dateOfExtension) {
        this.dateOfExtension = dateOfExtension;
    }

    public Rental getIdRental() {
        return idRental;
    }

    public void setIdRental(Rental idRental) {
        this.idRental = idRental;
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
        if (!(object instanceof Extension)) {
            return false;
        }
        Extension other = (Extension) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pl.edu.utp.dvdrental2.model.Extension[ id=" + id + " ]";
    }
    
}
