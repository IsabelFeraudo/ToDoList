package com.IsabelFeraudo.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table (name="item")
public class Item {
	
private int idItem;
private String description;
private Folder folder;
}
