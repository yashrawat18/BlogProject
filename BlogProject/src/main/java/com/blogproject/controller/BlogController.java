package com.blogproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.blogproject.entities.Posts;
import com.blogproject.service.BlogService;


@Controller
public class BlogController {

	@Autowired
	private BlogService service;
	
	@GetMapping("/")
	public String home(Model model) {
		List<Posts> posts = service.listAll();
		model.addAttribute("posts",posts);
		System.out.print(posts);
		return "index";
	}
	
	@GetMapping("/new")
	public String newPost(Model model) {
		model.addAttribute("posts",new Posts());
		return "new";
	}
	
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String post(@ModelAttribute("posts") Posts post,Model model){
		model.addAttribute("posts",new Posts());
		service.save(post);
		return "redirect:/";
	}
}
