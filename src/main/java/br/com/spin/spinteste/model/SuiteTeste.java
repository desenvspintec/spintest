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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author adm
 */
@Entity
@Table(name = "suite_teste")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SuiteTeste.findAll", query = "SELECT s FROM SuiteTeste s")
    , @NamedQuery(name = "SuiteTeste.findById", query = "SELECT s FROM SuiteTeste s WHERE s.id = :id")
    , @NamedQuery(name = "SuiteTeste.findByDescricao", query = "SELECT s FROM SuiteTeste s WHERE s.descricao = :descricao")
    , @NamedQuery(name = "SuiteTeste.findBySituacao", query = "SELECT s FROM SuiteTeste s WHERE s.situacao = :situacao")
    , @NamedQuery(name = "SuiteTeste.findByObjetivo", query = "SELECT s FROM SuiteTeste s WHERE s.objetivo = :objetivo")
    , @NamedQuery(name = "SuiteTeste.findByUserId", query = "SELECT s FROM SuiteTeste s WHERE s.userId = :userId")
    , @NamedQuery(name = "SuiteTeste.findByProjetoTesteId", query = "SELECT s FROM SuiteTeste s WHERE s.projetoTesteId = :projetoTesteId")
    , @NamedQuery(name = "SuiteTeste.findByEmpresaId", query = "SELECT s FROM SuiteTeste s WHERE s.empresaId = :empresaId")
    , @NamedQuery(name = "SuiteTeste.findByCreatedAt", query = "SELECT s FROM SuiteTeste s WHERE s.createdAt = :createdAt")
    , @NamedQuery(name = "SuiteTeste.findByUpdatedAt", query = "SELECT s FROM SuiteTeste s WHERE s.updatedAt = :updatedAt")})
public class SuiteTeste implements Serializable {

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
    @Size(min = 1, max = 255)
    @Column(name = "objetivo")
    private String objetivo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "user_id")
    private int userId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "projeto_teste_id")
    private int projetoTesteId;
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

    public SuiteTeste() {
    }

    public SuiteTeste(Integer id) {
        this.id = id;
    }

    public SuiteTeste(Integer id, String descricao, String situacao, String objetivo, int userId, int projetoTesteId, int empresaId) {
        this.id = id;
        this.descricao = descricao;
        this.situacao = situacao;
        this.objetivo = objetivo;
        this.userId = userId;
        this.projetoTesteId = projetoTesteId;
        this.empresaId = empresaId;
    }

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

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getProjetoTesteId() {
        return projetoTesteId;
    }

    public void setProjetoTesteId(int projetoTesteId) {
        this.projetoTesteId = projetoTesteId;
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
        if (!(object instanceof SuiteTeste)) {
            return false;
        }
        SuiteTeste other = (SuiteTeste) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.spin.spinteste.model.SuiteTeste[ id=" + id + " ]";
    }
    
}
