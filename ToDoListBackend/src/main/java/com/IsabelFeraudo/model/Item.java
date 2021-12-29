package com.IsabelFeraudo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name="item")
public class Item {

@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int idItem;
private String description;
@ManyToOne
@JoinColumn(name="idFolder")
private Folder folder;


public Item() {

}

public Item(String description, Folder folder) {
	super();
	this.description = description;
	this.folder = folder;
}



public Item(int idItem, String description, Folder folder) {
	super();
	this.idItem = idItem;
	this.description = description;
	this.folder = folder;
}


public Item(int idItem, String description) {
	super();
	this.idItem = idItem;
	this.description = description;
}


public int getIdItem() {
	return idItem;
}
public void setIdItem(int idItem) {
	this.idItem = idItem;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public Folder getFolder() {
	return folder;
}
public void setFolder(Folder folder) {
	this.folder = folder;
}


}
