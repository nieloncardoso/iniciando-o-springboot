package com.aulasspring.aulasspring.resources;

import com.aulasspring.aulasspring.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User("maria@gmail.com",1L,"Maria","12345","9999999");
        return ResponseEntity.ok().body(u);
    }

}
