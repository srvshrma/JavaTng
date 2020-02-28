package com.example.demo;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class RecommendationController {
	@Autowired
	private RestTemplate template;
	
	@RequestMapping(value="/recommendations",method=RequestMethod.GET)
	@ResponseBody
	public Movie[] recommendations() {
		
		Movie[] result=template.getForObject("http://movie-service/movies", Movie[].class);
		return result;
		
	}
}
