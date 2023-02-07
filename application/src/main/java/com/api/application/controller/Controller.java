package com.api.application.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.api.application.entity.News;
import com.api.application.services.NewsService;

@RestController
public class Controller {
	
	@Autowired
	public final NewsService newsService;
	
	
	public Controller(NewsService newsService) {
		super();
		this.newsService = newsService;
	}

	@GetMapping("/top-stories")
	public ResponseEntity<ArrayList<News>> getTopStories() {
			return new ResponseEntity<>(newsService.consumeTopStories(), HttpStatus.OK);
	}
	
	@GetMapping("/past-stories")
	public ResponseEntity<ArrayList<News>> getPastStories(){
		
		return new ResponseEntity<>(newsService.consumePastStories(), HttpStatus.OK);
	}
	
	@GetMapping("/comments/{id}")
	public ResponseEntity<String> getComments(@PathVariable long id) {
		
		return new ResponseEntity<>(newsService.consumeComments(id), HttpStatus.OK);
	} 

}
