/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.spin.spintest.model;

import br.com.spin.spintest.base.SAbstractEntity;
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
@Table(name = "pessoa_fisica")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PessoaFisica.findAll", query = "SELECT p FROM PessoaFisica p")
    , @NamedQuery(name = "PessoaFisica.findById", query = "SELECT p FROM PessoaFisica p WHERE p.id = :id")
    , @NamedQuery(name = "PessoaFisica.findByNome", query = "SELECT p FROM PessoaFisica p WHERE p.nome = :nome")
    , @NamedQuery(name = "PessoaFisica.findByDataNascimento", query = "SELECT p FROM PessoaFisica p WHERE p.dataNascimento = :dataNascimento")
    , @NamedQuery(name = "PessoaFisica.findByRg", query = "SELECT p FROM PessoaFisica p WHERE p.rg = :rg")
    , @NamedQuery(name = "PessoaFisica.findByCpf", query = "SELECT p FROM PessoaFisica p WHERE p.cpf = :cpf")
    , @NamedQuery(name = "PessoaFisica.findBySexo", query = "SELECT p FROM PessoaFisica p WHERE p.sexo = :sexo")
    , @NamedQuery(name = "PessoaFisica.findByTelefoneFixo", query = "SELECT p FROM PessoaFisica p WHERE p.telefoneFixo = :telefoneFixo")
    , @NamedQuery(name = "PessoaFisica.findByTelefoneCel", query = "SELECT p FROM PessoaFisica p WHERE p.telefoneCel = :telefoneCel")
    , @NamedQuery(name = "PessoaFisica.findByNomeUsuario", query = "SELECT p FROM PessoaFisica p WHERE p.nomeUsuario = :nomeUsuario")
    , @NamedQuery(name = "PessoaFisica.findByUserId", query = "SELECT p FROM PessoaFisica p WHERE p.userId = :userId")
    , @NamedQuery(name = "PessoaFisica.findByCreatedAt", query = "SELECT p FROM PessoaFisica p WHERE p.createdAt = :createdAt")
    , @NamedQuery(name = "PessoaFisica.findByUpdatedAt", query = "SELECT p FROM PessoaFisica p WHERE p.updatedAt = :updatedAt")})
public class PessoaFisica extends SAbstractEntity<Integer> implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 255)
    @Column(name = "nome")
    private String nome;
    @Column(name = "data_nascimento")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataNascimento;
    @Size(max = 255)
    @Column(name = "rg")
    private String rg;
    @Size(max = 255)
    @Column(name = "cpf")
    private String cpf;
    @Size(max = 6)
    @Column(name = "sexo")
    private String sexo;
    @Size(max = 255)
    @Column(name = "telefone_fixo")
    private String telefoneFixo;
    @Size(max = 255)
    @Column(name = "telefone_cel")
    private String telefoneCel;
    @Size(max = 255)
    @Column(name = "nome_usuario")
    private String nomeUsuario;
    @Basic(optional = false)
    @NotNull
    @Column(name = "user_id")
    private int userId;
    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    @Column(name = "updated_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;

    public PessoaFisica() {
    }

    public PessoaFisica(Integer id) {
        this.id = id;
    }

    public PessoaFisica(Integer id, int userId) {
        this.id = id;
        this.userId = userId;
    }

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTelefoneFixo() {
        return telefoneFixo;
    }

    public void setTelefoneFixo(String telefoneFixo) {
        this.telefoneFixo = telefoneFixo;
    }

    public String getTelefoneCel() {
        return telefoneCel;
    }

    public void setTelefoneCel(String telefoneCel) {
        this.telefoneCel = telefoneCel;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
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
        if (!(object instanceof PessoaFisica)) {
            return false;
        }
        PessoaFisica other = (PessoaFisica) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.spin.spinteste.model.PessoaFisica[ id=" + id + " ]";
    }

}
