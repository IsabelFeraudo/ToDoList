package com.IsabelFeraudo.rest;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;

import com.IsabelFeraudo.service.FolderService;
import com.IsabelFeraudo.model.Folder;

@RestController
@RequestMapping("/folder/")
public class FolderRest {
	@Autowired
	private FolderService folderService;
	
	@GetMapping
	public ResponseEntity<List<Folder>> getAllFolders(){
		return ResponseEntity.ok(folderService.findAll());
	}

}
