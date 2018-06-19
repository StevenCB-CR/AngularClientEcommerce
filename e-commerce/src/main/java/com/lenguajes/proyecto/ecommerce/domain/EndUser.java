
package com.lenguajes.proyecto.ecommerce.domain;

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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@Entity
@Table(name = "End_User")

public class EndUser implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "name_user")
    private String nameuser;

    @Column(name = "email")
    private String email;

    @Column(name = "pass")
    private String pass;
    //@OneToOne(cascade = CascadeType.ALL)
    //private UserAddress userAddress;
   //	@OneToMany(cascade = CascadeType.ALL, mappedBy = "endUser")
   // private Collection<UserPhones> userPhonesCollection;
    //@OneToMany(cascade = CascadeType.ALL, mappedBy = "endUserId")
    //private Collection<ShoppingOrder> shoppingOrderCollection;

    public EndUser() {
    }

    public EndUser(Integer id) {
        this.id = id;
    }

    public EndUser(Integer id, String nameUser, String email, String pass) {
        this.id = id;
        this.nameuser = nameUser;
        this.email = email;
        this.pass = pass;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameUser() {
        return nameuser;
    }

    public void setNameUser(String nameUser) {
        this.nameuser = nameUser;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    /* public UserAddress getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(UserAddress userAddress) {
        this.userAddress = userAddress;
    }
    
    @XmlTransient
    public Collection<UserPhones> getUserPhonesCollection() {
        return userPhonesCollection;
    }

    public void setUserPhonesCollection(Collection<UserPhones> userPhonesCollection) {
        this.userPhonesCollection = userPhonesCollection;
    }

    @XmlTransient
    public Collection<ShoppingOrder> getShoppingOrderCollection() {
        return shoppingOrderCollection;
    }

    public void setShoppingOrderCollection(Collection<ShoppingOrder> shoppingOrderCollection) {
        this.shoppingOrderCollection = shoppingOrderCollection;
    }
	*/
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EndUser)) {
            return false;
        }
        EndUser other = (EndUser) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.lenguajes.proyecto.ecommerce.dtoTestPersistence.EndUser[ id=" + id + " ]";
    }
    
}
