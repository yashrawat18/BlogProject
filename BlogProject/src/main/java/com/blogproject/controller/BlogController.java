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
import com.student.domain.Student;

@Controller
public class BlogController {

	@Autowired
	private BlogService service;
	
	@GetMapping("/")
	public String home(Model model) {
		List<Posts> listStudent = service.listAll();
		model.addAttribute("posts",new Posts());
		System.out.printf("GET / ");
		return "new";
	}
	
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String post(@ModelAttribute("posts") Posts post,Model model){
		model.addAttribute("posts",new Posts());
		service.save(post);
		return "redirect:/";
	}
}
