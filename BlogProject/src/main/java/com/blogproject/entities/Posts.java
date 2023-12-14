package com.blogproject.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Posts {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String heading;
	private String content;
	private String source;
	
	public int getId() {
		return id;
	}
	public String getHeading() {
		return heading;
	}
	public String getContent() {
		return content;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setHeading(String heading) {
		this.heading = heading;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	
	
}
