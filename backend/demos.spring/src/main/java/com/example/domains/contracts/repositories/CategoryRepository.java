package com.example.domains.contracts.repositories;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.domains.entities.Actor;
import com.example.domains.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer>{
	List<Category> findByFirstName(String nombre);
	List<Category> findByFirstNameStartingWithAndLastNameEndingWith(String prefijo, String sufijo);

	<T> List<T> findByActorIdIsNotNull(Class<T> type);
	<T> Iterable<T> findByActorIdIsNotNull(Sort sort, Class<T> type);
	<T> Page<T> findByActorIdIsNotNull(Pageable pageable, Class<T> type);
}
