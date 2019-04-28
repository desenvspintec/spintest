/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.spin.spinteste.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author adm
 */
@Entity
@Table(name = "central_company")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CentralCompany.findAll", query = "SELECT c FROM CentralCompany c")
    , @NamedQuery(name = "CentralCompany.findById", query = "SELECT c FROM CentralCompany c WHERE c.id = :id")
    , @NamedQuery(name = "CentralCompany.findByEmpresaId", query = "SELECT c FROM CentralCompany c WHERE c.empresaId = :empresaId")
    , @NamedQuery(name = "CentralCompany.findByCreatedAt", query = "SELECT c FROM CentralCompany c WHERE c.createdAt = :createdAt")
    , @NamedQuery(name = "CentralCompany.findByUpdatedAt", query = "SELECT c FROM CentralCompany c WHERE c.updatedAt = :updatedAt")})
public class CentralCompany implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "empresa_id")
    private int empresaId;
    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    @Column(name = "updated_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;

    public CentralCompany() {
    }

    public CentralCompany(Integer id) {
        this.id = id;
    }

    public CentralCompany(Integer id, int empresaId) {
        this.id = id;
        this.empresaId = empresaId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getEmpresaId() {
        return empresaId;
    }

    public void setEmpresaId(int empresaId) {
        this.empresaId = empresaId;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
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
        if (!(object instanceof CentralCompany)) {
            return false;
        }
        CentralCompany other = (CentralCompany) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.spin.spinteste.model.CentralCompany[ id=" + id + " ]";
    }
    
}
