/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lgrapp.banco.model;

import br.com.lgrapp.banco.base.crud.AbstractEntity;
import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author adm
 */
@Entity
@Table(name = "pessoa_juridica")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PessoaJuridica.findAll", query = "SELECT p FROM PessoaJuridica p")
    , @NamedQuery(name = "PessoaJuridica.findByIdPessoaJuridica", query = "SELECT p FROM PessoaJuridica p WHERE p.idPessoaJuridica = :idPessoaJuridica")
    , @NamedQuery(name = "PessoaJuridica.findByDsNomeFantasia", query = "SELECT p FROM PessoaJuridica p WHERE p.dsNomeFantasia = :dsNomeFantasia")
    , @NamedQuery(name = "PessoaJuridica.findByDsRazaoSocial", query = "SELECT p FROM PessoaJuridica p WHERE p.dsRazaoSocial = :dsRazaoSocial")
    , @NamedQuery(name = "PessoaJuridica.findByDsCnpj", query = "SELECT p FROM PessoaJuridica p WHERE p.dsCnpj = :dsCnpj")
    , @NamedQuery(name = "PessoaJuridica.findByDsTelefone", query = "SELECT p FROM PessoaJuridica p WHERE p.dsTelefone = :dsTelefone")
    , @NamedQuery(name = "PessoaJuridica.findByDsEmail", query = "SELECT p FROM PessoaJuridica p WHERE p.dsEmail = :dsEmail")})
public class PessoaJuridica extends AbstractEntity<Integer> implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_pessoa_juridica")
    private Integer idPessoaJuridica;
    @Size(max = 255)
    @Column(name = "ds_nome_fantasia")
    private String dsNomeFantasia;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "ds_razao_social")
    private String dsRazaoSocial;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "ds_cnpj")
    private String dsCnpj;
    @Size(max = 255)
    @Column(name = "ds_telefone")
    private String dsTelefone;
    @Size(max = 255)
    @Column(name = "ds_email")
    private String dsEmail;

    public PessoaJuridica() {
    }

    public PessoaJuridica(Integer idPessoaJuridica) {
        this.idPessoaJuridica = idPessoaJuridica;
    }

    public PessoaJuridica(Integer idPessoaJuridica, String dsRazaoSocial, String dsCnpj) {
        this.idPessoaJuridica = idPessoaJuridica;
        this.dsRazaoSocial = dsRazaoSocial;
        this.dsCnpj = dsCnpj;
    }

    @Override
    public Integer getId() {
        return idPessoaJuridica;
    }

    public Integer getIdPessoaJuridica() {
        return idPessoaJuridica;
    }

    public void setIdPessoaJuridica(Integer idPessoaJuridica) {
        this.idPessoaJuridica = idPessoaJuridica;
    }

    public String getDsNomeFantasia() {
        return dsNomeFantasia;
    }

    public void setDsNomeFantasia(String dsNomeFantasia) {
        this.dsNomeFantasia = dsNomeFantasia;
    }

    public String getDsRazaoSocial() {
        return dsRazaoSocial;
    }

    public void setDsRazaoSocial(String dsRazaoSocial) {
        this.dsRazaoSocial = dsRazaoSocial;
    }

    public String getDsCnpj() {
        return dsCnpj;
    }

    public void setDsCnpj(String dsCnpj) {
        this.dsCnpj = dsCnpj;
    }

    public String getDsTelefone() {
        return dsTelefone;
    }

    public void setDsTelefone(String dsTelefone) {
        this.dsTelefone = dsTelefone;
    }

    public String getDsEmail() {
        return dsEmail;
    }

    public void setDsEmail(String dsEmail) {
        this.dsEmail = dsEmail;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPessoaJuridica != null ? idPessoaJuridica.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PessoaJuridica)) {
            return false;
        }
        PessoaJuridica other = (PessoaJuridica) object;
        if ((this.idPessoaJuridica == null && other.idPessoaJuridica != null) || (this.idPessoaJuridica != null && !this.idPessoaJuridica.equals(other.idPessoaJuridica))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.lgrapp.banco.model.PessoaJuridica[ idPessoaJuridica=" + idPessoaJuridica + " ]";
    }

}
