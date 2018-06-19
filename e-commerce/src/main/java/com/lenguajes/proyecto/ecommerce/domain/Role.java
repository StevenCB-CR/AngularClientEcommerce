package com.lenguajes.proyecto.ecommerce.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlTransient;


@Entity
@Table(name ="Role")
public class Role implements Serializable{

    @OneToMany(mappedBy = "employedRoleId")
    private Collection<Employed> employedCollection;
private static final long serialVersionUID = 1L;

@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column (name= "id")
private int Id;

@Column (name= "name_role")
private String NameRole;

public Role(int id, String nameRole) {
	this.Id = id;
	NameRole = nameRole;
}
public Role() {}

public int getId() {
	return Id;
}
public void setId(int id) {
	Id = id;
}
public String getNameRole() {
	return NameRole;
}
public void setNameRole(String nameRole) {
	NameRole = nameRole;
}

    @XmlTransient
    public Collection<Employed> getEmployedCollection() {
        return employedCollection;
    }

    public void setEmployedCollection(Collection<Employed> employedCollection) {
        this.employedCollection = employedCollection;
    }
}//fin clase Role



