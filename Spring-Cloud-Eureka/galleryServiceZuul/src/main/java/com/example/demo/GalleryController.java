package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/")
public class GalleryController {
	
	
	@Autowired
	private RestTemplate template;
	@Autowired
	private Environment env;
	
	@RequestMapping("/")
	public String home() {
		
		return "This is Gallery Service running at PORT: "+env.getProperty("local.server.port");
	}
	
	@RequestMapping("/{id}")
	public Gallery getGallery(@PathVariable final int id) {
		Gallery gallery = new Gallery();
		gallery.setId(id);
		List<Object> images=template.getForObject("http://image-service/images/",List.class);
		gallery.setImages(images);
		return gallery;
	}
}
