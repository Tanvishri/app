package com.api.application.services;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.api.application.entity.News;
import com.api.application.entity.NewsComment;

@Service
@CacheConfig(cacheNames = {"Cache"})
public class NewsService {
	
	public  RestTemplate restTemplate;
    NewsComment first,second;
    Integer maxid1;
	Integer maxid2;
	
	@Autowired
	 public NewsService(RestTemplate restTemplate) {
		super();
	 this.restTemplate =restTemplate; 
	 }
	
	public NewsService() {
		super();
	}
	
	
	@Cacheable
	public ArrayList<News> consumeTopStories() {
		
		
		first = restTemplate.getForObject("https://hacker-news.firebaseio.com/v0/maxitem.json", NewsComment.class);
		 ArrayList<News> result = new ArrayList<>();
		 maxid1 = first.getId();
		 for(Integer i = maxid1; i>maxid1-10;i--) {
			  
			 result.add(restTemplate.getForObject("https://hacker-news.firebaseio.com/v0/item/"+i+".json", News.class));
		 }
		 
		return result;
		
	}


	public ArrayList<News> consumePastStories() {
		
		 second = restTemplate.getForObject("https://hacker-news.firebaseio.com/v0/maxitem.json", NewsComment.class);
		 maxid2 = second.getId();
		 ArrayList<News> result2 = new ArrayList<>();
		 for(Integer i = maxid2; i>maxid1-10;i--) {
			  
			 result2.add(restTemplate.getForObject("https://hacker-news.firebaseio.com/v0/item/"+i+".json", News.class));
		 }
		 
		return result2;
		
	}


	public String consumeComments(long id) {
		
		News temp =restTemplate.getForObject("https://hacker-news.firebaseio.com/v0/item/"+id+".json", News.class);
	
		return ("Comments: "+temp.getText());
	}
	
	

}
