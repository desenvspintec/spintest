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
@RestQuery(rest = "baselineplanejado")
@Table(name = "baseline_planejado")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BaselinePlanejado.findAll", query = "SELECT b FROM BaselinePlanejado b")
    , @NamedQuery(name = "BaselinePlanejado.findById", query = "SELECT b FROM BaselinePlanejado b WHERE b.id = :id")
    , @NamedQuery(name = "BaselinePlanejado.findByDataInicio", query = "SELECT b FROM BaselinePlanejado b WHERE b.dataInicio = :dataInicio")
    , @NamedQuery(name = "BaselinePlanejado.findByDataFinal", query = "SELECT b FROM BaselinePlanejado b WHERE b.dataFinal = :dataFinal")
    , @NamedQuery(name = "BaselinePlanejado.findByHoraInicio", query = "SELECT b FROM BaselinePlanejado b WHERE b.horaInicio = :horaInicio")
    , @NamedQuery(name = "BaselinePlanejado.findByHoraFinal", query = "SELECT b FROM BaselinePlanejado b WHERE b.horaFinal = :horaFinal")
    , @NamedQuery(name = "BaselinePlanejado.findBySituacao", query = "SELECT b FROM BaselinePlanejado b WHERE b.situacao = :situacao")
    , @NamedQuery(name = "BaselinePlanejado.findByUserExecutorId", query = "SELECT b FROM BaselinePlanejado b WHERE b.userExecutorId = :userExecutorId")
    , @NamedQuery(name = "BaselinePlanejado.findByUserId", query = "SELECT b FROM BaselinePlanejado b WHERE b.userId = :userId")
    , @NamedQuery(name = "BaselinePlanejado.findByPlanoTesteId", query = "SELECT b FROM BaselinePlanejado b WHERE b.planoTesteId = :planoTesteId")
    , @NamedQuery(name = "BaselinePlanejado.findByEmpresaId", query = "SELECT b FROM BaselinePlanejado b WHERE b.empresaId = :empresaId")
    , @NamedQuery(name = "BaselinePlanejado.findByCreatedAt", query = "SELECT b FROM BaselinePlanejado b WHERE b.createdAt = :createdAt")
    , @NamedQuery(name = "BaselinePlanejado.findByUpdatedAt", query = "SELECT b FROM BaselinePlanejado b WHERE b.updatedAt = :updatedAt")})
public class BaselinePlanejado extends SAbstractEntity<Integer> implements Serializable {

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
    @Column(name = "descricao")
    private String descricao;
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
    @Size(max = 255)
    @Column(name = "hora_inicio")
    private String horaInicio;
    @Size(max = 255)
    @Column(name = "hora_final")
    private String horaFinal;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 7)
    @Column(name = "situacao")
    private String situacao;
    @Basic(optional = false)
    @NotNull
    @Column(name = "user_executor_id")
    private Integer userExecutorId;

    @Basic(optional = false)
    @NotNull
    @Column(name = "plano_teste_id")
    private Integer planoTesteId;
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

    public BaselinePlanejado() {
    }

    public BaselinePlanejado(Integer id) {
        this.id = id;
    }

    public BaselinePlanejado(Integer id, String descricao, Date dataInicio, Date dataFinal, String situacao, Integer userExecutorId, String userId, Integer planoTesteId, Integer empresaId) {
        this.id = id;
        this.descricao = descricao;
        this.dataInicio = dataInicio;
        this.dataFinal = dataFinal;
        this.situacao = situacao;
        this.userExecutorId = userExecutorId;
        this.userId = userId;
        this.planoTesteId = planoTesteId;
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

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraFinal() {
        return horaFinal;
    }

    public void setHoraFinal(String horaFinal) {
        this.horaFinal = horaFinal;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public Integer getUserExecutorId() {
        return userExecutorId;
    }

    public void setUserExecutorId(Integer userExecutorId) {
        this.userExecutorId = userExecutorId;
    }

    public Integer getPlanoTesteId() {
        return planoTesteId;
    }

    public void setPlanoTesteId(Integer planoTesteId) {
        this.planoTesteId = planoTesteId;
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
        if (!(object instanceof BaselinePlanejado)) {
            return false;
        }
        BaselinePlanejado other = (BaselinePlanejado) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.spin.spinteste.model.BaselinePlanejado[ id=" + id + " ]";
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
