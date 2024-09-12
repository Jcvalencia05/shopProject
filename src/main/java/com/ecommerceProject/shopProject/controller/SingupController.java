package com.ecommerceProject.shopProject.controller;

import com.ecommerceProject.shopProject.dto.SingupDTO;
import com.ecommerceProject.shopProject.dto.UserDTO;
import com.ecommerceProject.shopProject.services.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class SingupController {

    @Autowired
    private UserService userService;


    @PostMapping("/sign-up")
    public ResponseEntity<?> signupUser(@RequestBody SingupDTO singupDTO){
        UserDTO createdUser = userService.createUser(singupDTO);

        if(createdUser == null) {
            return new ResponseEntity<>("Usuario No Creado", HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
    }
}
