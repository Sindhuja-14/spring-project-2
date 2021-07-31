package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Library;

public interface LibraryRepo extends JpaRepository<Library, Integer> {

	

	List<Library> findAllByGenre(String gname);

	
	   

}
