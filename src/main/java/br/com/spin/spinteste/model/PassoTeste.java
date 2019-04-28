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
@Table(name = "passo_teste")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PassoTeste.findAll", query = "SELECT p FROM PassoTeste p")
    , @NamedQuery(name = "PassoTeste.findById", query = "SELECT p FROM PassoTeste p WHERE p.id = :id")
    , @NamedQuery(name = "PassoTeste.findBySequencia", query = "SELECT p FROM PassoTeste p WHERE p.sequencia = :sequencia")
    , @NamedQuery(name = "PassoTeste.findByTipoTeste", query = "SELECT p FROM PassoTeste p WHERE p.tipoTeste = :tipoTeste")
    , @NamedQuery(name = "PassoTeste.findBySituacao", query = "SELECT p FROM PassoTeste p WHERE p.situacao = :situacao")
    , @NamedQuery(name = "PassoTeste.findByUserId", query = "SELECT p FROM PassoTeste p WHERE p.userId = :userId")
    , @NamedQuery(name = "PassoTeste.findByEmpresaId", query = "SELECT p FROM PassoTeste p WHERE p.empresaId = :empresaId")
    , @NamedQuery(name = "PassoTeste.findByCasoTesteId", query = "SELECT p FROM PassoTeste p WHERE p.casoTesteId = :casoTesteId")
    , @NamedQuery(name = "PassoTeste.findByCreatedAt", query = "SELECT p FROM PassoTeste p WHERE p.createdAt = :createdAt")
    , @NamedQuery(name = "PassoTeste.findByUpdatedAt", query = "SELECT p FROM PassoTeste p WHERE p.updatedAt = :updatedAt")})
public class PassoTeste implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 2147483647)
    @Column(name = "acao")
    private String acao;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 2147483647)
    @Column(name = "resultado")
    private String resultado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "sequencia")
    private int sequencia;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 12)
    @Column(name = "tipo_teste")
    private String tipoTeste;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 7)
    @Column(name = "situacao")
    private String situacao;
    @Basic(optional = false)
    @NotNull
    @Column(name = "user_id")
    private int userId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "empresa_id")
    private int empresaId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "caso_teste_id")
    private int casoTesteId;
    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    @Column(name = "updated_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;

    public PassoTeste() {
    }

    public PassoTeste(Integer id) {
        this.id = id;
    }

    public PassoTeste(Integer id, String acao, String resultado, int sequencia, String tipoTeste, String situacao, int userId, int empresaId, int casoTesteId) {
        this.id = id;
        this.acao = acao;
        this.resultado = resultado;
        this.sequencia = sequencia;
        this.tipoTeste = tipoTeste;
        this.situacao = situacao;
        this.userId = userId;
        this.empresaId = empresaId;
        this.casoTesteId = casoTesteId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAcao() {
        return acao;
    }

    public void setAcao(String acao) {
        this.acao = acao;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public int getSequencia() {
        return sequencia;
    }

    public void setSequencia(int sequencia) {
        this.sequencia = sequencia;
    }

    public String getTipoTeste() {
        return tipoTeste;
    }

    public void setTipoTeste(String tipoTeste) {
        this.tipoTeste = tipoTeste;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getEmpresaId() {
        return empresaId;
    }

    public void setEmpresaId(int empresaId) {
        this.empresaId = empresaId;
    }

    public int getCasoTesteId() {
        return casoTesteId;
    }

    public void setCasoTesteId(int casoTesteId) {
        this.casoTesteId = casoTesteId;
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
        if (!(object instanceof PassoTeste)) {
            return false;
        }
        PassoTeste other = (PassoTeste) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.spin.spinteste.model.PassoTeste[ id=" + id + " ]";
    }
    
}
