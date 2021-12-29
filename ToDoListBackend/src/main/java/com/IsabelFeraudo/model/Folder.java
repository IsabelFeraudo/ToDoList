package com.IsabelFeraudo.model;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table (name="folder")

public class Folder {
	private int idFolder;
	private String name;
}
