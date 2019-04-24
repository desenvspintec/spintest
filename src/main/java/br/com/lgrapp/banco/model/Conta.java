/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lgrapp.banco.model;

import br.com.lgrapp.banco.base.crud.AbstractEntity;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author adm
 */
@Entity
@Table(name = "conta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Conta.findAll", query = "SELECT c FROM Conta c")
    , @NamedQuery(name = "Conta.findByIdConta", query = "SELECT c FROM Conta c WHERE c.idConta = :idConta")
    , @NamedQuery(name = "Conta.findByVrSaldo", query = "SELECT c FROM Conta c WHERE c.vrSaldo = :vrSaldo")
    , @NamedQuery(name = "Conta.findByDtAbertura", query = "SELECT c FROM Conta c WHERE c.dtAbertura = :dtAbertura")
    , @NamedQuery(name = "Conta.findByDtFechamento", query = "SELECT c FROM Conta c WHERE c.dtFechamento = :dtFechamento")})
public class Conta extends AbstractEntity<Integer> implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_conta")
    private Integer idConta;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "vr_saldo")
    private BigDecimal vrSaldo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dt_abertura")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAbertura;
    @Column(name = "dt_fechamento")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtFechamento;
    @JoinColumn(name = "id_agencia", referencedColumnName = "id_agencia")
    @ManyToOne(optional = false)
    private Agencia idAgencia;
    @JoinColumn(name = "id_pessoa_fisica", referencedColumnName = "id_pessoa_fisica")
    @ManyToOne
    private PessoaFisica idPessoaFisica;
    @JoinColumn(name = "id_pessoa_juridica", referencedColumnName = "id_pessoa_juridica")
    @ManyToOne(optional = false)
    private PessoaJuridica idPessoaJuridica;

    public Conta() {
    }

    public Conta(Integer idConta) {
        this.idConta = idConta;
    }

    public Conta(Integer idConta, Date dtAbertura) {
        this.idConta = idConta;
        this.dtAbertura = dtAbertura;
    }

    @Override
    public Integer getId() {
        return idConta;
    }

    public Integer getIdConta() {
        return idConta;
    }

    public void setIdConta(Integer idConta) {
        this.idConta = idConta;
    }

    public BigDecimal getVrSaldo() {
        return vrSaldo;
    }

    public void setVrSaldo(BigDecimal vrSaldo) {
        this.vrSaldo = vrSaldo;
    }

    public Date getDtAbertura() {
        return dtAbertura;
    }

    public void setDtAbertura(Date dtAbertura) {
        this.dtAbertura = dtAbertura;
    }

    public Date getDtFechamento() {
        return dtFechamento;
    }

    public void setDtFechamento(Date dtFechamento) {
        this.dtFechamento = dtFechamento;
    }

    public Agencia getIdAgencia() {
        return idAgencia;
    }

    public void setIdAgencia(Agencia idAgencia) {
        this.idAgencia = idAgencia;
    }

    public PessoaFisica getIdPessoaFisica() {
        return idPessoaFisica;
    }

    public void setIdPessoaFisica(PessoaFisica idPessoaFisica) {
        this.idPessoaFisica = idPessoaFisica;
    }

    public PessoaJuridica getIdPessoaJuridica() {
        return idPessoaJuridica;
    }

    public void setIdPessoaJuridica(PessoaJuridica idPessoaJuridica) {
        this.idPessoaJuridica = idPessoaJuridica;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idConta != null ? idConta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Conta)) {
            return false;
        }
        Conta other = (Conta) object;
        if ((this.idConta == null && other.idConta != null) || (this.idConta != null && !this.idConta.equals(other.idConta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.lgrapp.banco.model.Conta[ idConta=" + idConta + " ]";
    }

}
