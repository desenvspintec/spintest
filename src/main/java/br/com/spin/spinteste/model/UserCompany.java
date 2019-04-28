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
@Table(name = "user_company")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UserCompany.findAll", query = "SELECT u FROM UserCompany u")
    , @NamedQuery(name = "UserCompany.findById", query = "SELECT u FROM UserCompany u WHERE u.id = :id")
    , @NamedQuery(name = "UserCompany.findByEmpresaId", query = "SELECT u FROM UserCompany u WHERE u.empresaId = :empresaId")
    , @NamedQuery(name = "UserCompany.findByUserId", query = "SELECT u FROM UserCompany u WHERE u.userId = :userId")
    , @NamedQuery(name = "UserCompany.findByCreatedAt", query = "SELECT u FROM UserCompany u WHERE u.createdAt = :createdAt")
    , @NamedQuery(name = "UserCompany.findByUpdatedAt", query = "SELECT u FROM UserCompany u WHERE u.updatedAt = :updatedAt")})
public class UserCompany implements Serializable {

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
    @Basic(optional = false)
    @NotNull
    @Column(name = "user_id")
    private int userId;
    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    @Column(name = "updated_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;

    public UserCompany() {
    }

    public UserCompany(Integer id) {
        this.id = id;
    }

    public UserCompany(Integer id, int empresaId, int userId) {
        this.id = id;
        this.empresaId = empresaId;
        this.userId = userId;
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

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
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
        if (!(object instanceof UserCompany)) {
            return false;
        }
        UserCompany other = (UserCompany) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.spin.spinteste.model.UserCompany[ id=" + id + " ]";
    }
    
}
