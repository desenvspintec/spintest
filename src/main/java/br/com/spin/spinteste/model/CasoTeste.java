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
@Table(name = "caso_teste")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CasoTeste.findAll", query = "SELECT c FROM CasoTeste c")
    , @NamedQuery(name = "CasoTeste.findById", query = "SELECT c FROM CasoTeste c WHERE c.id = :id")
    , @NamedQuery(name = "CasoTeste.findByDescricao", query = "SELECT c FROM CasoTeste c WHERE c.descricao = :descricao")
    , @NamedQuery(name = "CasoTeste.findByObjetivo", query = "SELECT c FROM CasoTeste c WHERE c.objetivo = :objetivo")
    , @NamedQuery(name = "CasoTeste.findByCondicoes", query = "SELECT c FROM CasoTeste c WHERE c.condicoes = :condicoes")
    , @NamedQuery(name = "CasoTeste.findByTipoTeste", query = "SELECT c FROM CasoTeste c WHERE c.tipoTeste = :tipoTeste")
    , @NamedQuery(name = "CasoTeste.findBySituacao", query = "SELECT c FROM CasoTeste c WHERE c.situacao = :situacao")
    , @NamedQuery(name = "CasoTeste.findByTempoExecucao", query = "SELECT c FROM CasoTeste c WHERE c.tempoExecucao = :tempoExecucao")
    , @NamedQuery(name = "CasoTeste.findBySuiteTesteId", query = "SELECT c FROM CasoTeste c WHERE c.suiteTesteId = :suiteTesteId")
    , @NamedQuery(name = "CasoTeste.findByEmpresaId", query = "SELECT c FROM CasoTeste c WHERE c.empresaId = :empresaId")
    , @NamedQuery(name = "CasoTeste.findByCreatedAt", query = "SELECT c FROM CasoTeste c WHERE c.createdAt = :createdAt")
    , @NamedQuery(name = "CasoTeste.findByUpdatedAt", query = "SELECT c FROM CasoTeste c WHERE c.updatedAt = :updatedAt")})
public class CasoTeste implements Serializable {

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
    @Size(min = 1, max = 255)
    @Column(name = "objetivo")
    private String objetivo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "condicoes")
    private String condicoes;
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
    @Column(name = "tempo_execucao")
    private int tempoExecucao;
    @Basic(optional = false)
    @NotNull
    @Column(name = "suite_teste_id")
    private int suiteTesteId;
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

    public CasoTeste() {
    }

    public CasoTeste(Integer id) {
        this.id = id;
    }

    public CasoTeste(Integer id, String descricao, String objetivo, String condicoes, String tipoTeste, String situacao, int tempoExecucao, int suiteTesteId, int empresaId) {
        this.id = id;
        this.descricao = descricao;
        this.objetivo = objetivo;
        this.condicoes = condicoes;
        this.tipoTeste = tipoTeste;
        this.situacao = situacao;
        this.tempoExecucao = tempoExecucao;
        this.suiteTesteId = suiteTesteId;
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

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public String getCondicoes() {
        return condicoes;
    }

    public void setCondicoes(String condicoes) {
        this.condicoes = condicoes;
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

    public int getTempoExecucao() {
        return tempoExecucao;
    }

    public void setTempoExecucao(int tempoExecucao) {
        this.tempoExecucao = tempoExecucao;
    }

    public int getSuiteTesteId() {
        return suiteTesteId;
    }

    public void setSuiteTesteId(int suiteTesteId) {
        this.suiteTesteId = suiteTesteId;
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
        if (!(object instanceof CasoTeste)) {
            return false;
        }
        CasoTeste other = (CasoTeste) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.spin.spinteste.model.CasoTeste[ id=" + id + " ]";
    }
    
}
