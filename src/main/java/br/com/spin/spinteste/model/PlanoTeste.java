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
@Table(name = "plano_teste")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PlanoTeste.findAll", query = "SELECT p FROM PlanoTeste p")
    , @NamedQuery(name = "PlanoTeste.findById", query = "SELECT p FROM PlanoTeste p WHERE p.id = :id")
    , @NamedQuery(name = "PlanoTeste.findByDescricao", query = "SELECT p FROM PlanoTeste p WHERE p.descricao = :descricao")
    , @NamedQuery(name = "PlanoTeste.findByDataInicio", query = "SELECT p FROM PlanoTeste p WHERE p.dataInicio = :dataInicio")
    , @NamedQuery(name = "PlanoTeste.findByDataFinal", query = "SELECT p FROM PlanoTeste p WHERE p.dataFinal = :dataFinal")
    , @NamedQuery(name = "PlanoTeste.findBySituacao", query = "SELECT p FROM PlanoTeste p WHERE p.situacao = :situacao")
    , @NamedQuery(name = "PlanoTeste.findByVersaoProduto", query = "SELECT p FROM PlanoTeste p WHERE p.versaoProduto = :versaoProduto")
    , @NamedQuery(name = "PlanoTeste.findByUserId", query = "SELECT p FROM PlanoTeste p WHERE p.userId = :userId")
    , @NamedQuery(name = "PlanoTeste.findByProdutoId", query = "SELECT p FROM PlanoTeste p WHERE p.produtoId = :produtoId")
    , @NamedQuery(name = "PlanoTeste.findByProjetoTesteId", query = "SELECT p FROM PlanoTeste p WHERE p.projetoTesteId = :projetoTesteId")
    , @NamedQuery(name = "PlanoTeste.findByEmpresaId", query = "SELECT p FROM PlanoTeste p WHERE p.empresaId = :empresaId")
    , @NamedQuery(name = "PlanoTeste.findByCreatedAt", query = "SELECT p FROM PlanoTeste p WHERE p.createdAt = :createdAt")
    , @NamedQuery(name = "PlanoTeste.findByUpdatedAt", query = "SELECT p FROM PlanoTeste p WHERE p.updatedAt = :updatedAt")})
public class PlanoTeste implements Serializable {

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
    @Lob
    @Size(min = 1, max = 2147483647)
    @Column(name = "observacao")
    private String observacao;
    @Basic(optional = false)
    @NotNull
    @Column(name = "data_inicio")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataInicio;
    @Basic(optional = false)
    @NotNull
    @Column(name = "data_final")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataFinal;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 7)
    @Column(name = "situacao")
    private String situacao;
    @Size(max = 255)
    @Column(name = "versao_produto")
    private String versaoProduto;
    @Basic(optional = false)
    @NotNull
    @Column(name = "user_id")
    private int userId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "produto_id")
    private int produtoId;
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

    public PlanoTeste() {
    }

    public PlanoTeste(Integer id) {
        this.id = id;
    }

    public PlanoTeste(Integer id, String descricao, String observacao, Date dataInicio, Date dataFinal, String situacao, int userId, int produtoId, int projetoTesteId, int empresaId) {
        this.id = id;
        this.descricao = descricao;
        this.observacao = observacao;
        this.dataInicio = dataInicio;
        this.dataFinal = dataFinal;
        this.situacao = situacao;
        this.userId = userId;
        this.produtoId = produtoId;
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

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(Date dataFinal) {
        this.dataFinal = dataFinal;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getVersaoProduto() {
        return versaoProduto;
    }

    public void setVersaoProduto(String versaoProduto) {
        this.versaoProduto = versaoProduto;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getProdutoId() {
        return produtoId;
    }

    public void setProdutoId(int produtoId) {
        this.produtoId = produtoId;
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
        if (!(object instanceof PlanoTeste)) {
            return false;
        }
        PlanoTeste other = (PlanoTeste) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.spin.spinteste.model.PlanoTeste[ id=" + id + " ]";
    }
    
}
