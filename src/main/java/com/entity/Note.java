package com.entity;

import java.util.Date;
import java.util.Random;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Note {
	
	@Id
	private int id;
	private String title;
	private String Content;
	private Date date;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return Content;
	}
	public void setContent(String content) {
		Content = content;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Note( String title, String content, Date date) {
		super();
		this.id = new Random().nextInt(10000);
		this.title = title;
		Content = content;
		this.date = date;
	}
	public Note() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
