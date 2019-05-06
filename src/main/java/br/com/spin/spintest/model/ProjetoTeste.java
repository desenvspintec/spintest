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
@Table(name = "projeto_teste")
@RestQuery(rest = "projetoteste")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProjetoTeste.findAll", query = "SELECT p FROM ProjetoTeste p")
    , @NamedQuery(name = "ProjetoTeste.findById", query = "SELECT p FROM ProjetoTeste p WHERE p.id = :id")
    , @NamedQuery(name = "ProjetoTeste.findByDescricao", query = "SELECT p FROM ProjetoTeste p WHERE p.descricao = :descricao")
    , @NamedQuery(name = "ProjetoTeste.findBySituacao", query = "SELECT p FROM ProjetoTeste p WHERE p.situacao = :situacao")
    , @NamedQuery(name = "ProjetoTeste.findByProdutoId", query = "SELECT p FROM ProjetoTeste p WHERE p.produtoId = :produtoId")
    , @NamedQuery(name = "ProjetoTeste.findByUserId", query = "SELECT p FROM ProjetoTeste p WHERE p.userId = :userId")
    , @NamedQuery(name = "ProjetoTeste.findByEmpresaId", query = "SELECT p FROM ProjetoTeste p WHERE p.empresaId = :empresaId")
    , @NamedQuery(name = "ProjetoTeste.findByCreatedAt", query = "SELECT p FROM ProjetoTeste p WHERE p.createdAt = :createdAt")
    , @NamedQuery(name = "ProjetoTeste.findByUpdatedAt", query = "SELECT p FROM ProjetoTeste p WHERE p.updatedAt = :updatedAt")})
public class ProjetoTeste extends SAbstractEntity<Integer> implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "descricao")
    private String descricao;
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

    public ProjetoTeste() {
    }

    public ProjetoTeste(Integer id) {
        this.id = id;
    }

    public ProjetoTeste(Integer id, String descricao, String situacao, Integer produtoId, String userId, Integer empresaId) {
        this.id = id;
        this.descricao = descricao;
        this.situacao = situacao;
        this.produtoId = produtoId;
        this.userId = userId;
        this.empresaId = empresaId;
    }

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
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
        if (!(object instanceof ProjetoTeste)) {
            return false;
        }
        ProjetoTeste other = (ProjetoTeste) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.spin.spinteste.model.ProjetoTeste[ id=" + id + " ]";
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
