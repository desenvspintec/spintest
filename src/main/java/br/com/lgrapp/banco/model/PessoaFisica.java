/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lgrapp.banco.model;

import br.com.lgrapp.banco.base.crud.AbstractEntity;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author adm
 */
@Entity
@Table(name = "pessoa_fisica")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PessoaFisica.findAll", query = "SELECT p FROM PessoaFisica p")
    , @NamedQuery(name = "PessoaFisica.findByIdPessoaFisica", query = "SELECT p FROM PessoaFisica p WHERE p.idPessoaFisica = :idPessoaFisica")
    , @NamedQuery(name = "PessoaFisica.findByDsNome", query = "SELECT p FROM PessoaFisica p WHERE p.dsNome = :dsNome")
    , @NamedQuery(name = "PessoaFisica.findByDtNasc", query = "SELECT p FROM PessoaFisica p WHERE p.dtNasc = :dtNasc")
    , @NamedQuery(name = "PessoaFisica.findByDsCpf", query = "SELECT p FROM PessoaFisica p WHERE p.dsCpf = :dsCpf")
    , @NamedQuery(name = "PessoaFisica.findByDsEmail", query = "SELECT p FROM PessoaFisica p WHERE p.dsEmail = :dsEmail")
    , @NamedQuery(name = "PessoaFisica.findByDsTelefone", query = "SELECT p FROM PessoaFisica p WHERE p.dsTelefone = :dsTelefone")})
public class PessoaFisica extends AbstractEntity<Integer> implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_pessoa_fisica")
    private Integer idPessoaFisica;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "ds_nome")
    private String dsNome;
    @Column(name = "dt_nasc")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtNasc;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "ds_cpf")
    private String dsCpf;
    @Size(max = 255)
    @Column(name = "ds_email")
    private String dsEmail;
    @Size(max = 50)
    @Column(name = "ds_telefone")
    private String dsTelefone;

    public PessoaFisica() {
    }

    public PessoaFisica(Integer idPessoaFisica) {
        this.idPessoaFisica = idPessoaFisica;
    }

    public PessoaFisica(Integer idPessoaFisica, String dsNome, String dsCpf) {
        this.idPessoaFisica = idPessoaFisica;
        this.dsNome = dsNome;
        this.dsCpf = dsCpf;
    }

    @Override
    public Integer getId() {
        return idPessoaFisica;
    }

    public Integer getIdPessoaFisica() {
        return idPessoaFisica;
    }

    public void setIdPessoaFisica(Integer idPessoaFisica) {
        this.idPessoaFisica = idPessoaFisica;
    }

    public String getDsNome() {
        return dsNome;
    }

    public void setDsNome(String dsNome) {
        this.dsNome = dsNome;
    }

    public Date getDtNasc() {
        return dtNasc;
    }

    public void setDtNasc(Date dtNasc) {
        this.dtNasc = dtNasc;
    }

    public String getDsCpf() {
        return dsCpf;
    }

    public void setDsCpf(String dsCpf) {
        this.dsCpf = dsCpf;
    }

    public String getDsEmail() {
        return dsEmail;
    }

    public void setDsEmail(String dsEmail) {
        this.dsEmail = dsEmail;
    }

    public String getDsTelefone() {
        return dsTelefone;
    }

    public void setDsTelefone(String dsTelefone) {
        this.dsTelefone = dsTelefone;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPessoaFisica != null ? idPessoaFisica.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PessoaFisica)) {
            return false;
        }
        PessoaFisica other = (PessoaFisica) object;
        if ((this.idPessoaFisica == null && other.idPessoaFisica != null) || (this.idPessoaFisica != null && !this.idPessoaFisica.equals(other.idPessoaFisica))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.lgrapp.banco.model.PessoaFisica[ idPessoaFisica=" + idPessoaFisica + " ]";
    }

}
