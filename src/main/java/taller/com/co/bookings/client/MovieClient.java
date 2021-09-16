package taller.com.co.bookings.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import taller.com.co.bookings.model.Movie;


@FeignClient(name="movie-service")
@RequestMapping(value="/movies")
public interface MovieClient {

    @GetMapping(value = "/{idMovie}")
    public ResponseEntity<Movie> getMovie(@PathVariable("idMovie") Long idMovie);

}
