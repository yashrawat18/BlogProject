package com.blogproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blogproject.entities.Posts;

public interface BlogRepository extends JpaRepository<Posts,Integer>{

}
