package com.IsabelFeraudo.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="folder")

public class Folder {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idFolder;
	private String name;
	public Folder(String name) {
		super();
		this.name = name;
	}
	public int getIdFolder() {
		return idFolder;
	}
	public void setIdFolder(int idFolder) {
		this.idFolder = idFolder;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
