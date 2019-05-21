/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.spin.spintest.model;

import br.com.spin.spintest.base.SAbstractEntity;
import br.com.spin.spintest.base.annotations.RestQuery;
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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author lucas
 */
@Entity
@Table(name = "fornecedor_contato")
@RestQuery(rest = "fornecedorcontato")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FornecedorContato.findAll", query = "SELECT f FROM FornecedorContato f")
    , @NamedQuery(name = "FornecedorContato.findById", query = "SELECT f FROM FornecedorContato f WHERE f.id = :id")
    , @NamedQuery(name = "FornecedorContato.findByNome", query = "SELECT f FROM FornecedorContato f WHERE f.nome = :nome")
    , @NamedQuery(name = "FornecedorContato.findByCargo", query = "SELECT f FROM FornecedorContato f WHERE f.cargo = :cargo")
    , @NamedQuery(name = "FornecedorContato.findByTelCel", query = "SELECT f FROM FornecedorContato f WHERE f.telCel = :telCel")
    , @NamedQuery(name = "FornecedorContato.findByTelFixo", query = "SELECT f FROM FornecedorContato f WHERE f.telFixo = :telFixo")
    , @NamedQuery(name = "FornecedorContato.findByRamal", query = "SELECT f FROM FornecedorContato f WHERE f.ramal = :ramal")
    , @NamedQuery(name = "FornecedorContato.findByFornecedorId", query = "SELECT f FROM FornecedorContato f WHERE f.fornecedorId = :fornecedorId")})
public class FornecedorContato extends SAbstractEntity<Integer> implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 255)
    @NotNull
    @Column(name = "nome")
    private String nome;
    @Size(max = 255)
    @Column(name = "cargo")
    private String cargo;
    @Size(max = 50)
    @Column(name = "tel_cel")
    private String telCel;
    @Size(max = 50)
    @Column(name = "tel_fixo")
    private String telFixo;
    @Column(name = "ramal")
    private Long ramal;
    @Column(name = "fornecedor_id")
    private Integer fornecedorId;
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @NotNull
    @Column(name = "user_id")
    private String userId;

    @NotNull
    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    @NotNull
    @Column(name = "updated_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;

    @Basic(optional = false)
    @NotNull
    @Column(name = "updated_user_id")
    private String updatedUserId;

    public FornecedorContato() {
    }

    public FornecedorContato(Integer id) {
        this.id = id;
    }

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getTelCel() {
        return telCel;
    }

    public void setTelCel(String telCel) {
        this.telCel = telCel;
    }

    public String getTelFixo() {
        return telFixo;
    }

    public void setTelFixo(String telFixo) {
        this.telFixo = telFixo;
    }

    public Long getRamal() {
        return ramal;
    }

    public void setRamal(Long ramal) {
        this.ramal = ramal;
    }

    public Integer getFornecedorId() {
        return fornecedorId;
    }

    public void setFornecedorId(Integer fornecedorId) {
        this.fornecedorId = fornecedorId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
        if (!(object instanceof FornecedorContato)) {
            return false;
        }
        FornecedorContato other = (FornecedorContato) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.spin.spintest.model.FornecedorContato[ id=" + id + " ]";
    }
    
     @Override
    public String getUpdatedUserId() {
        return updatedUserId;
    }

    @Override
    public void setUpdatedUserId(String updatedUserId) {
        this.updatedUserId = updatedUserId;
    }

    @Override
    public Date getUpdatedAt() {
        return updatedAt;
    }

    @Override
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String getUserId() {
        return userId;
    }

    @Override
    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public Date getCreatedAt() {
        return createdAt;
    }

    @Override
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

}
