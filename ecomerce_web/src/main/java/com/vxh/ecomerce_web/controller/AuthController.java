package com.vxh.ecomerce_web.controller;

import com.vxh.ecomerce_web.modal.User;
import com.vxh.ecomerce_web.response.SignupRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @PostMapping("/signup")
    public ResponseEntity<User> CreateUserHandle(@RequestBody SignupRequest req ){
        User user = new User();

        user.setEmail(req.getEmail());
        user.setFullName(req.getFullName());

        return ResponseEntity.ok(user);

    }
}
