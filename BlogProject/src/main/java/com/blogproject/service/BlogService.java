package com.blogproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blogproject.entities.Posts;
import com.blogproject.repository.BlogRepository;

@Service
public class BlogService {
	
	@Autowired
	private BlogRepository repo;
	
	public List<Posts> listAll(){
		return repo.findAll();
	}
	
	public void save(Posts post) {
		repo.save(post);
	}
}
