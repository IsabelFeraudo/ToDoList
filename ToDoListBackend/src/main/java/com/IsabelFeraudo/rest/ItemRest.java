package com.IsabelFeraudo.rest;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.IsabelFeraudo.model.Item;
import com.IsabelFeraudo.service.ItemService;

@RestController
@RequestMapping("/item/")

public class ItemRest {
	@Autowired
	private ItemService itemService;
	
	@GetMapping
	private ResponseEntity<List<Item>> getAllItems(){
		return ResponseEntity.ok(itemService.findAll());
	}

}
