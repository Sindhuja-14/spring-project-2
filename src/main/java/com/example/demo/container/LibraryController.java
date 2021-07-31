package com.example.demo.container;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.LibraryRepo;
import com.example.demo.model.Library;




@RestController
public class LibraryController {
	@Autowired
	LibraryRepo repo;
	

	@PostMapping(path = "/saveBook")
	public Library addBook(@RequestBody Library lib) {
		repo.save(lib);
		return lib;
	}
	
	 @PostMapping(path = "/editBook")
	    public Library updateBook(@RequestParam("id") int id,@RequestBody Library lib) {
		repo.deleteById(id);
		lib.setBookid(id);
		repo.save(lib);
		return lib;
	}
	
	 @PostMapping(path = "/deleteBook")
		public String deleteBook(@RequestParam("id") int id) {
			repo.deleteById(id);
			return "Deleted Successfully";
		}
	 
	 @GetMapping(path = "/getBooks")
		public List<Library> getBooks() {
			
			return repo.findAll();
		}
		
	 @PostMapping(path = "/getByType")
		public List<Library> getWebSeriesName(@RequestParam("id") String gname) {
			
			return repo.findAllByGenre(gname);
		}

}
