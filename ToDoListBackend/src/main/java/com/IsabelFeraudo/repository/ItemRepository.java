package com.IsabelFeraudo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.IsabelFeraudo.model.Item;

public interface ItemRepository extends JpaRepository<Item, Long>{

}
