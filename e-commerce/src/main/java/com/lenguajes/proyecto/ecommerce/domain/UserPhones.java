/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lenguajes.proyecto.ecommerce.domain;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author steve
 */
@Entity
@Table(name = "User_Phones")

public class UserPhones implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected UserPhonesPK userPhonesPK;
    @JoinColumn(name = "id_user", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private EndUser endUser;

    public UserPhones() {
    }

    public UserPhones(UserPhonesPK userPhonesPK) {
        this.userPhonesPK = userPhonesPK;
    }

    public UserPhones(int idUser, int phone) {
        this.userPhonesPK = new UserPhonesPK(idUser, phone);
    }

    public UserPhonesPK getUserPhonesPK() {
        return userPhonesPK;
    }

    public void setUserPhonesPK(UserPhonesPK userPhonesPK) {
        this.userPhonesPK = userPhonesPK;
    }

    public EndUser getEndUser() {
        return endUser;
    }

    public void setEndUser(EndUser endUser) {
        this.endUser = endUser;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userPhonesPK != null ? userPhonesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UserPhones)) {
            return false;
        }
        UserPhones other = (UserPhones) object;
        if ((this.userPhonesPK == null && other.userPhonesPK != null) || (this.userPhonesPK != null && !this.userPhonesPK.equals(other.userPhonesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.lenguajes.proyecto.ecommerce.dtoTestPersistence.UserPhones[ userPhonesPK=" + userPhonesPK + " ]";
    }
    
}
