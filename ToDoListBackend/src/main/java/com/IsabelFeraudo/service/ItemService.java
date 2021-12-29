package com.IsabelFeraudo.service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;

import com.IsabelFeraudo.model.Item;
import com.IsabelFeraudo.repository.ItemRepository;

@Service
public class ItemService implements ItemRepository {

@Autowired
private ItemRepository itemRepository;

@Override
public List<Item> findAll() {
	// TODO Auto-generated method stub
	return itemRepository.findAll();
}

@Override
public List<Item> findAll(Sort sort) {
	// TODO Auto-generated method stub
	return itemRepository.findAll(sort);
}

@Override
public List<Item> findAllById(Iterable<Long> ids) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public <S extends Item> List<S> saveAll(Iterable<S> entities) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public void flush() {
	// TODO Auto-generated method stub
	
}

@Override
public <S extends Item> S saveAndFlush(S entity) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public <S extends Item> List<S> saveAllAndFlush(Iterable<S> entities) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public void deleteAllInBatch(Iterable<Item> entities) {
	// TODO Auto-generated method stub
	
}

@Override
public void deleteAllByIdInBatch(Iterable<Long> ids) {
	// TODO Auto-generated method stub
	
}

@Override
public void deleteAllInBatch() {
	// TODO Auto-generated method stub
	
}

@Override
public Item getOne(Long id) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Item getById(Long id) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public <S extends Item> List<S> findAll(Example<S> example) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public <S extends Item> List<S> findAll(Example<S> example, Sort sort) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Page<Item> findAll(Pageable pageable) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public <S extends Item> S save(S entity) {
	// TODO Auto-generated method stub
	return itemRepository.save(entity);
}

@Override
public Optional<Item> findById(Long id) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public boolean existsById(Long id) {
	// TODO Auto-generated method stub
	return false;
}

@Override
public long count() {
	// TODO Auto-generated method stub
	return 0;
}

@Override
public void deleteById(Long id) {
	itemRepository.deleteById(id)
	
}

@Override
public void delete(Item entity) {
	itemRepository.delete(entity)
	
}

@Override
public void deleteAllById(Iterable<? extends Long> ids) {
	// TODO Auto-generated method stub
	
}

@Override
public void deleteAll(Iterable<? extends Item> entities) {
	// TODO Auto-generated method stub
	
}

@Override
public void deleteAll() {
	// TODO Auto-generated method stub
	
}

@Override
public <S extends Item> Optional<S> findOne(Example<S> example) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public <S extends Item> Page<S> findAll(Example<S> example, Pageable pageable) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public <S extends Item> long count(Example<S> example) {
	// TODO Auto-generated method stub
	return 0;
}

@Override
public <S extends Item> boolean exists(Example<S> example) {
	// TODO Auto-generated method stub
	return false;
}

@Override
public <S extends Item, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction) {
	// TODO Auto-generated method stub
	return null;
}

}
