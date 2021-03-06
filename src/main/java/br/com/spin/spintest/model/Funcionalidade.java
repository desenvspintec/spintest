/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.spin.spintest.model;

import br.com.spin.spintest.base.annotations.RestQuery;
import br.com.spin.spintest.base.SAbstractEntity;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
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
 * @author adm
 */
@Entity
@Table(name = "funcionalidade")
@RestQuery(rest = "funcionalidade")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Funcionalidade.findAll", query = "SELECT f FROM Funcionalidade f")
    , @NamedQuery(name = "Funcionalidade.findById", query = "SELECT f FROM Funcionalidade f WHERE f.id = :id")
    , @NamedQuery(name = "Funcionalidade.findByNome", query = "SELECT f FROM Funcionalidade f WHERE f.nome = :nome")
    , @NamedQuery(name = "Funcionalidade.findBySituacao", query = "SELECT f FROM Funcionalidade f WHERE f.situacao = :situacao")
    , @NamedQuery(name = "Funcionalidade.findByUserId", query = "SELECT f FROM Funcionalidade f WHERE f.userId = :userId")
    , @NamedQuery(name = "Funcionalidade.findByProdutoId", query = "SELECT f FROM Funcionalidade f WHERE f.produtoId = :produtoId")
    , @NamedQuery(name = "Funcionalidade.findByEmpresaId", query = "SELECT f FROM Funcionalidade f WHERE f.empresaId = :empresaId")
    , @NamedQuery(name = "Funcionalidade.findByCreatedAt", query = "SELECT f FROM Funcionalidade f WHERE f.createdAt = :createdAt")
    , @NamedQuery(name = "Funcionalidade.findByUpdatedAt", query = "SELECT f FROM Funcionalidade f WHERE f.updatedAt = :updatedAt")})
public class Funcionalidade extends SAbstractEntity<Integer> implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "nome")
    private String nome;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 2147483647)
    @Column(name = "observacao")
    private String observacao;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 7)
    @Column(name = "situacao")
    private String situacao;

    @Basic(optional = false)
    @NotNull
    @Column(name = "produto_id")
    private Integer produtoId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "empresa_id")
    private Integer empresaId;
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

    public Funcionalidade() {
    }

    public Funcionalidade(Integer id) {
        this.id = id;
    }

    public Funcionalidade(Integer id, String nome, String observacao, String situacao, String userId, Integer produtoId, Integer empresaId) {
        this.id = id;
        this.nome = nome;
        this.observacao = observacao;
        this.situacao = situacao;
        this.userId = userId;
        this.produtoId = produtoId;
        this.empresaId = empresaId;
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

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public Integer getProdutoId() {
        return produtoId;
    }

    public void setProdutoId(Integer produtoId) {
        this.produtoId = produtoId;
    }

    public Integer getEmpresaId() {
        return empresaId;
    }

    public void setEmpresaId(Integer empresaId) {
        this.empresaId = empresaId;
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
        if (!(object instanceof Funcionalidade)) {
            return false;
        }
        Funcionalidade other = (Funcionalidade) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.spin.spinteste.model.Funcionalidade[ id=" + id + " ]";
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
