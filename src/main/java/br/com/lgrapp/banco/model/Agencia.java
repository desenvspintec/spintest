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
@Table(name = "agencia")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Agencia.findAll", query = "SELECT a FROM Agencia a")
    , @NamedQuery(name = "Agencia.findByIdAgencia", query = "SELECT a FROM Agencia a WHERE a.idAgencia = :idAgencia")
    , @NamedQuery(name = "Agencia.findByDsAgencia", query = "SELECT a FROM Agencia a WHERE a.dsAgencia = :dsAgencia")})
public class Agencia extends AbstractEntity<Integer> implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_agencia")
    private Integer idAgencia;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "ds_agencia")
    private String dsAgencia;

    public Agencia() {
    }

    public Agencia(Integer idAgencia) {
        this.idAgencia = idAgencia;
    }

    public Agencia(Integer idAgencia, String dsAgencia) {
        this.idAgencia = idAgencia;
        this.dsAgencia = dsAgencia;
    }

    @Override
    public Integer getId() {
        return idAgencia;
    }

    public Integer getIdAgencia() {
        return idAgencia;
    }

    public void setIdAgencia(Integer idAgencia) {
        this.idAgencia = idAgencia;
    }

    public String getDsAgencia() {
        return dsAgencia;
    }

    public void setDsAgencia(String dsAgencia) {
        this.dsAgencia = dsAgencia;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAgencia != null ? idAgencia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Agencia)) {
            return false;
        }
        Agencia other = (Agencia) object;
        if ((this.idAgencia == null && other.idAgencia != null) || (this.idAgencia != null && !this.idAgencia.equals(other.idAgencia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.lgrapp.banco.model.Agencia[ idAgencia=" + idAgencia + " ]";
    }

}
