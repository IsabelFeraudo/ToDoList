package com.IsabelFeraudo.rest;
import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.IsabelFeraudo.service.FolderService;
import com.IsabelFeraudo.model.Folder;
import com.IsabelFeraudo.model.Item;

@RestController
@RequestMapping("/folder/")
public class FolderRest {
	@Autowired
	private FolderService folderService;
	
	@GetMapping
	public ResponseEntity<List<Folder>> getAllFolders(){
		return ResponseEntity.ok(folderService.findAll());
	}

	@PostMapping
	private ResponseEntity<Folder> saveFolder(@RequestBody Folder folder){
		try {
			Folder savedFolder= folderService.save(folder);
			return ResponseEntity.created(new URI("/folder/"+savedFolder.getIdFolder())).body(savedFolder);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
		
		
		
	}
}
