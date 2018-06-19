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
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;


@Entity
@Table(name = "User_Address")
public class UserAddress implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id_user")
    private Integer idUser;
    @Column(name = "country")
    private String country;
    @Column(name = "province")
    private String province;
    @Column(name = "canton")
    private String canton;
    @Column(name = "district")
    private String district;
    @Column(name = "address_details")
    private String addressDetails;
    //@JoinColumn(name = "id_user", referencedColumnName = "id", insertable = false, updatable = false)
    //@OneToOne(optional = false)
    //private EndUser endUser;

    public UserAddress() {
    }

    public UserAddress(Integer idUser) {
        this.idUser = idUser;
    }

    public UserAddress(Integer idUser, String country, String province, String canton, String district, String addressDetails) {
        this.idUser = idUser;
        this.country = country;
        this.province = province;
        this.canton = canton;
        this.district = district;
        this.addressDetails = addressDetails;
    }

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCanton() {
        return canton;
    }

    public void setCanton(String canton) {
        this.canton = canton;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getAddressDetails() {
        return addressDetails;
    }

    public void setAddressDetails(String addressDetails) {
        this.addressDetails = addressDetails;
    }
/*
    public EndUser getEndUser() {
        return endUser;
    }

    public void setEndUser(EndUser endUser) {
        this.endUser = endUser;
    }*/

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUser != null ? idUser.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UserAddress)) {
            return false;
        }
        UserAddress other = (UserAddress) object;
        if ((this.idUser == null && other.idUser != null) || (this.idUser != null && !this.idUser.equals(other.idUser))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.lenguajes.proyecto.ecommerce.dtoTestPersistence.UserAddress[ idUser=" + idUser + " ]";
    }
    
}
