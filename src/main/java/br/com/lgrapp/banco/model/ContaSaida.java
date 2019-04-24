/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lgrapp.banco.model;

import br.com.lgrapp.banco.base.crud.AbstractEntity;
import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author adm
 */
@Entity
@Table(name = "conta_saida")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ContaSaida.findAll", query = "SELECT c FROM ContaSaida c")
    , @NamedQuery(name = "ContaSaida.findByIdContaSaida", query = "SELECT c FROM ContaSaida c WHERE c.idContaSaida = :idContaSaida")
    , @NamedQuery(name = "ContaSaida.findByVrOperacao", query = "SELECT c FROM ContaSaida c WHERE c.vrOperacao = :vrOperacao")})
public class ContaSaida extends AbstractEntity<Integer> implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_conta_saida")
    private Integer idContaSaida;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "vr_operacao")
    private BigDecimal vrOperacao;
    @JoinColumn(name = "id_conta", referencedColumnName = "id_conta")
    @ManyToOne(optional = false)
    private Conta idConta;

    public ContaSaida() {
    }

    public ContaSaida(Integer idContaSaida) {
        this.idContaSaida = idContaSaida;
    }

    public ContaSaida(Integer idContaSaida, BigDecimal vrOperacao) {
        this.idContaSaida = idContaSaida;
        this.vrOperacao = vrOperacao;
    }

    @Override
    public Integer getId() {
        return idContaSaida;
    }

    public Integer getIdContaSaida() {
        return idContaSaida;
    }

    public void setIdContaSaida(Integer idContaSaida) {
        this.idContaSaida = idContaSaida;
    }

    public BigDecimal getVrOperacao() {
        return vrOperacao;
    }

    public void setVrOperacao(BigDecimal vrOperacao) {
        this.vrOperacao = vrOperacao;
    }

    public Conta getIdConta() {
        return idConta;
    }

    public void setIdConta(Conta idConta) {
        this.idConta = idConta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idContaSaida != null ? idContaSaida.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ContaSaida)) {
            return false;
        }
        ContaSaida other = (ContaSaida) object;
        if ((this.idContaSaida == null && other.idContaSaida != null) || (this.idContaSaida != null && !this.idContaSaida.equals(other.idContaSaida))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.lgrapp.banco.model.ContaSaida[ idContaSaida=" + idContaSaida + " ]";
    }

}
