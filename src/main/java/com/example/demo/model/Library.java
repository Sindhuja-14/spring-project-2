package com.example.demo.model;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Library {
@Id
	private int bookid;
	private int quantity;
	private String bookname;
	private String  genre;
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public Library() {
		super();
	}
	public Library(int bookid, int quantity, String bookname, String genre) {
		super();
		this.bookid = bookid;
		this.quantity = quantity;
		this.bookname = bookname;
		this.genre = genre;
	}
	public Library(int quantity, String bookname, String genre) {
		super();
		this.quantity = quantity;
		this.bookname = bookname;
		this.genre = genre;
	}
	
	

}
