/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lenguajes.proyecto.ecommerce.domain;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author steve
 */
@Entity
@Table(name = "System_Parameters")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SystemParameters.findAll", query = "SELECT s FROM SystemParameters s")
    , @NamedQuery(name = "SystemParameters.findById", query = "SELECT s FROM SystemParameters s WHERE s.id = :id")
    , @NamedQuery(name = "SystemParameters.findBySystemName", query = "SELECT s FROM SystemParameters s WHERE s.systemName = :systemName")
    , @NamedQuery(name = "SystemParameters.findByLegalRegistrationName", query = "SELECT s FROM SystemParameters s WHERE s.legalRegistrationName = :legalRegistrationName")
    , @NamedQuery(name = "SystemParameters.findByTaxPercentage", query = "SELECT s FROM SystemParameters s WHERE s.taxPercentage = :taxPercentage")
    , @NamedQuery(name = "SystemParameters.findByCompanyAddress", query = "SELECT s FROM SystemParameters s WHERE s.companyAddress = :companyAddress")})
public class SystemParameters implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "system_name")
    private String systemName;
    @Size(max = 30)
    @Column(name = "legal_registration_name")
    private String legalRegistrationName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tax_percentage")
    private int taxPercentage;
    @Size(max = 100)
    @Column(name = "company_address")
    private String companyAddress;

    public SystemParameters() {
    }

    public SystemParameters(Integer id) {
        this.id = id;
    }

    public SystemParameters(Integer id, String systemName, int taxPercentage) {
        this.id = id;
        this.systemName = systemName;
        this.taxPercentage = taxPercentage;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSystemName() {
        return systemName;
    }

    public void setSystemName(String systemName) {
        this.systemName = systemName;
    }

    public String getLegalRegistrationName() {
        return legalRegistrationName;
    }

    public void setLegalRegistrationName(String legalRegistrationName) {
        this.legalRegistrationName = legalRegistrationName;
    }

    public int getTaxPercentage() {
        return taxPercentage;
    }

    public void setTaxPercentage(int taxPercentage) {
        this.taxPercentage = taxPercentage;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
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
        if (!(object instanceof SystemParameters)) {
            return false;
        }
        SystemParameters other = (SystemParameters) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.lenguajes.proyecto.ecommerce.dtoTestPersistence.SystemParameters[ id=" + id + " ]";
    }
    
}
