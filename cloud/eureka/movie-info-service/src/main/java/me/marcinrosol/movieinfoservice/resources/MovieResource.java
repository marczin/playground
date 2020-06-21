package me.marcinrosol.movieinfoservice.resources;

import me.marcinrosol.movieinfoservice.models.Movie;
import me.marcinrosol.movieinfoservice.models.MovieSummary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/movies")
public class MovieResource {

    @Value("${api.key}")
    private String apiKey;

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/{movieId}")
    public Movie getMovieInfo(@PathVariable("movieId") String movieId){
        try{
            MovieSummary movieSummary = restTemplate.getForObject(
                    "https://api.themoviedb.org/3/movie/"+movieId+"?api_key="+apiKey,
                    MovieSummary.class
            );
            return new Movie(movieId,movieSummary.getTitle(), movieSummary.getOverview());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }
}
