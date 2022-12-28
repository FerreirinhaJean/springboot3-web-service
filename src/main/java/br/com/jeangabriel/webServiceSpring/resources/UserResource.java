package br.com.jeangabriel.webServiceSpring.resources;

import br.com.jeangabriel.webServiceSpring.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> getAllUsers() {
        User obj = new User(1L, "Jean", "jean@gmail.com", "80415593", "123456");
        return ResponseEntity.ok().body(obj);
    }

}
