package com.IsabelFeraudo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.IsabelFeraudo.model.Folder;

public interface FolderRepository extends JpaRepository<Folder, Long>{
	
}
