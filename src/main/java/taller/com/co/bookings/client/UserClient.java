package taller.com.co.bookings.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import taller.com.co.bookings.model.Users;

@FeignClient(name="user-service")
@RequestMapping(value="/users")
public interface UserClient {

    @GetMapping(value = "/{idUser}")
    public ResponseEntity<Users> getUser(@PathVariable("idUser") Long idUser);

}
