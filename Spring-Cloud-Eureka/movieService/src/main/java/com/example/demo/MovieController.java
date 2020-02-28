package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {
	
	private static List<Movie> movieList= new ArrayList();
	static
	{
		movieList.add(new Movie(1,"Dabang","Action"));
		movieList.add(new Movie(2,"My Movie","Thriller"));
		movieList.add(new Movie(3,"Your Movie","Comedy"));
		movieList.add(new Movie(4,"Our Movie","Drama"));
		
	}
	@GetMapping("/movies")
	public ResponseEntity<?> getMovies(){
		
		return ResponseEntity.ok(movieList);
		
		
	}
	@GetMapping("/movie/{id}")
	public ResponseEntity<?> getMovie(@PathVariable int id){
		
		Movie movie = findMovie(id);
		if(movie==null) {
			return ResponseEntity.badRequest().body("Invalid movie id");
		}
		return ResponseEntity.ok(movie);
		
		
	}
	
	private Movie findMovie(int id) {
		
		return movieList.stream().filter(movie -> movie.getId().equals(id)).findFirst().orElse(null);
	}
	

}
