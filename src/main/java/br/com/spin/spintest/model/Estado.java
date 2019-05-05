/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.spin.spintest.model;

import br.com.spin.spintest.base.annotations.RestQuery;
import br.com.spin.spintest.base.SAbstractEntity;
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
@Table(name = "estado")
@RestQuery(rest = "estado")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Estado.findAll", query = "SELECT e FROM Estado e")
    , @NamedQuery(name = "Estado.findById", query = "SELECT e FROM Estado e WHERE e.id = :id")
    , @NamedQuery(name = "Estado.findByNome", query = "SELECT e FROM Estado e WHERE e.nome = :nome")
    , @NamedQuery(name = "Estado.findByUf", query = "SELECT e FROM Estado e WHERE e.uf = :uf")
    , @NamedQuery(name = "Estado.findByPaisId", query = "SELECT e FROM Estado e WHERE e.paisId = :paisId")})
public class Estado extends SAbstractEntity<Integer> implements Serializable {

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "estadoId")
    private Collection<Cidade> cidadeCollection;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 120)
    @Column(name = "nome")
    private String nome;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "uf")
    private String uf;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pais_id")
    private int paisId;

    public Estado() {
    }

    public Estado(Integer id) {
        this.id = id;
    }

    public Estado(Integer id, String nome, String uf, int paisId) {
        this.id = id;
        this.nome = nome;
        this.uf = uf;
        this.paisId = paisId;
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

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public int getPaisId() {
        return paisId;
    }

    public void setPaisId(int paisId) {
        this.paisId = paisId;
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
        if (!(object instanceof Estado)) {
            return false;
        }
        Estado other = (Estado) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.spin.spinteste.model.Estado[ id=" + id + " ]";
    }

    @XmlTransient
    public Collection<Cidade> getCidadeCollection() {
        return cidadeCollection;
    }

    public void setCidadeCollection(Collection<Cidade> cidadeCollection) {
        this.cidadeCollection = cidadeCollection;
    }

}
