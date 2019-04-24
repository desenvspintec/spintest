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
@Table(name = "conta_entrada")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ContaEntrada.findAll", query = "SELECT c FROM ContaEntrada c")
    , @NamedQuery(name = "ContaEntrada.findByIdContaEntrada", query = "SELECT c FROM ContaEntrada c WHERE c.idContaEntrada = :idContaEntrada")
    , @NamedQuery(name = "ContaEntrada.findByVrOperacao", query = "SELECT c FROM ContaEntrada c WHERE c.vrOperacao = :vrOperacao")})
public class ContaEntrada extends AbstractEntity<Integer> implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_conta_entrada")
    private Integer idContaEntrada;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "vr_operacao")
    private BigDecimal vrOperacao;
    @JoinColumn(name = "id_conta", referencedColumnName = "id_conta")
    @ManyToOne(optional = false)
    private Conta idConta;

    public ContaEntrada() {
    }

    public ContaEntrada(Integer idContaEntrada) {
        this.idContaEntrada = idContaEntrada;
    }

    public ContaEntrada(Integer idContaEntrada, BigDecimal vrOperacao) {
        this.idContaEntrada = idContaEntrada;
        this.vrOperacao = vrOperacao;
    }

    @Override
    public Integer getId() {
        return idContaEntrada;
    }

    public Integer getIdContaEntrada() {
        return idContaEntrada;
    }

    public void setIdContaEntrada(Integer idContaEntrada) {
        this.idContaEntrada = idContaEntrada;
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
        hash += (idContaEntrada != null ? idContaEntrada.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ContaEntrada)) {
            return false;
        }
        ContaEntrada other = (ContaEntrada) object;
        if ((this.idContaEntrada == null && other.idContaEntrada != null) || (this.idContaEntrada != null && !this.idContaEntrada.equals(other.idContaEntrada))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.lgrapp.banco.model.ContaEntrada[ idContaEntrada=" + idContaEntrada + " ]";
    }

}
