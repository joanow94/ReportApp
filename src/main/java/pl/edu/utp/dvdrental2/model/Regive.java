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
@Table(name = "REGIVE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Regive.findAll", query = "SELECT r FROM Regive r")
    , @NamedQuery(name = "Regive.findById", query = "SELECT r FROM Regive r WHERE r.id = :id")
    , @NamedQuery(name = "Regive.findByDateOfRegive", query = "SELECT r FROM Regive r WHERE r.dateOfRegive = :dateOfRegive")})
public class Regive implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Column(name = "DATE_OF_REGIVE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateOfRegive;
    @JoinColumn(name = "ID_CUSTOMER", referencedColumnName = "ID")
    @ManyToOne
    private Customer idCustomer;
    @JoinColumn(name = "ID_PIECE", referencedColumnName = "ID")
    @ManyToOne
    private Piece idPiece;

    public Regive() {
    }

    public Regive(Integer id, Date dateOfRegive) {
        this.id = id;
        this.dateOfRegive = dateOfRegive;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDateOfRegive() {
        return dateOfRegive;
    }

    public void setDateOfRegive(Date dateOfRegive) {
        this.dateOfRegive = dateOfRegive;
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
        if (!(object instanceof Regive)) {
            return false;
        }
        Regive other = (Regive) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pl.edu.utp.dvdrental2.model.Regive[ id=" + id + " ]";
    }
    
}
