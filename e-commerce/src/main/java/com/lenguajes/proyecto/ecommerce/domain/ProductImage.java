/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lenguajes.proyecto.ecommerce.domain;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;


@Entity
@Table(name = "Product_Image")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProductImage.findAll", query = "SELECT p FROM ProductImage p")
    , @NamedQuery(name = "ProductImage.findByProductId", query = "SELECT p FROM ProductImage p WHERE p.productImagePK.productId = :productId")
    , @NamedQuery(name = "ProductImage.findByImageName", query = "SELECT p FROM ProductImage p WHERE p.productImagePK.imageName = :imageName")})
public class ProductImage implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProductImagePK productImagePK;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "product_image")
    private byte[] productImage;
    @JoinColumn(name = "product_id", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Product product;

    public ProductImage() {
    }

    public ProductImage(ProductImagePK productImagePK) {
        this.productImagePK = productImagePK;
    }

    public ProductImage(ProductImagePK productImagePK, byte[] productImage) {
        this.productImagePK = productImagePK;
        this.productImage = productImage;
    }

    public ProductImage(int productId, String imageName) {
        this.productImagePK = new ProductImagePK(productId, imageName);
    }

    public ProductImagePK getProductImagePK() {
        return productImagePK;
    }

    public void setProductImagePK(ProductImagePK productImagePK) {
        this.productImagePK = productImagePK;
    }

    public byte[] getProductImage() {
        return productImage;
    }

    public void setProductImage(byte[] productImage) {
        this.productImage = productImage;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productImagePK != null ? productImagePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductImage)) {
            return false;
        }
        ProductImage other = (ProductImage) object;
        if ((this.productImagePK == null && other.productImagePK != null) || (this.productImagePK != null && !this.productImagePK.equals(other.productImagePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.lenguajes.proyecto.ecommerce.dtoTestPersistence.ProductImage[ productImagePK=" + productImagePK + " ]";
    }
    
}
