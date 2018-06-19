/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lenguajes.proyecto.ecommerce.domain;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author steve
 */
@Entity
@Table(name = "Shopping_Order")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ShoppingOrder.findAll", query = "SELECT s FROM ShoppingOrder s")
    , @NamedQuery(name = "ShoppingOrder.findById", query = "SELECT s FROM ShoppingOrder s WHERE s.id = :id")
    , @NamedQuery(name = "ShoppingOrder.findByShoppingDate", query = "SELECT s FROM ShoppingOrder s WHERE s.shoppingDate = :shoppingDate")
    , @NamedQuery(name = "ShoppingOrder.findByTotalValue", query = "SELECT s FROM ShoppingOrder s WHERE s.totalValue = :totalValue")})
public class ShoppingOrder implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "shopping_date")
    @Temporal(TemporalType.DATE)
    private Date shoppingDate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "total_value")
    private double totalValue;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "shoppingOrder")
    private Collection<OrderDetail> orderDetailCollection;
    @JoinColumn(name = "end_user_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private EndUser endUserId;

    public ShoppingOrder() {
    }

    public ShoppingOrder(Integer id) {
        this.id = id;
    }

    public ShoppingOrder(Integer id, Date shoppingDate, double totalValue) {
        this.id = id;
        this.shoppingDate = shoppingDate;
        this.totalValue = totalValue;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getShoppingDate() {
        return shoppingDate;
    }

    public void setShoppingDate(Date shoppingDate) {
        this.shoppingDate = shoppingDate;
    }

    public double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(double totalValue) {
        this.totalValue = totalValue;
    }

    @XmlTransient
    public Collection<OrderDetail> getOrderDetailCollection() {
        return orderDetailCollection;
    }

    public void setOrderDetailCollection(Collection<OrderDetail> orderDetailCollection) {
        this.orderDetailCollection = orderDetailCollection;
    }

    public EndUser getEndUserId() {
        return endUserId;
    }

    public void setEndUserId(EndUser endUserId) {
        this.endUserId = endUserId;
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
        if (!(object instanceof ShoppingOrder)) {
            return false;
        }
        ShoppingOrder other = (ShoppingOrder) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.lenguajes.proyecto.ecommerce.dtoTestPersistence.ShoppingOrder[ id=" + id + " ]";
    }
    
}
