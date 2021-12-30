package com.IsabelFeraudo.rest;
import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.IsabelFeraudo.model.Item;
import com.IsabelFeraudo.service.ItemService;

@RestController
@RequestMapping("/item/")

public class ItemRest {
	@Autowired
	private ItemService itemService;
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping
	public ResponseEntity<List<Item>> getAllItems(){
		return ResponseEntity.ok(itemService.findAll());
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("{idFolder}")
	private ResponseEntity<List<Item>> getAllItemsByFolder (@PathVariable("idFolder") long idFolder){
		return ResponseEntity.ok(itemService.getItemsByFolder(idFolder));
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping
	private ResponseEntity<Item> saveItem(@RequestBody Item item){
	try {
		Item savedItem= itemService.save(item);
		return ResponseEntity.created(new URI("/item/"+savedItem.getIdItem())).body(savedItem);
	} catch (Exception e) {
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
	}
		
		
		
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@DeleteMapping (value = "delete/{idItem}")
	private ResponseEntity<Boolean> deleteItem (@PathVariable ("idItem") Long idItem){
		itemService.deleteById(idItem);
		return ResponseEntity.ok(!(itemService.findById(idItem)!=null));
		
	}
	
	
}