/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lenguajes.proyecto.ecommerce.domain;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author steve
 */
@Embeddable
public class UserPhonesPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "id_user")
    private int idUser;
    @Basic(optional = false)
    @NotNull
    @Column(name = "phone")
    private int phone;

    public UserPhonesPK() {
    }

    public UserPhonesPK(int idUser, int phone) {
        this.idUser = idUser;
        this.phone = phone;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idUser;
        hash += (int) phone;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UserPhonesPK)) {
            return false;
        }
        UserPhonesPK other = (UserPhonesPK) object;
        if (this.idUser != other.idUser) {
            return false;
        }
        if (this.phone != other.phone) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.lenguajes.proyecto.ecommerce.dtoTestPersistence.UserPhonesPK[ idUser=" + idUser + ", phone=" + phone + " ]";
    }
    
}
