package com.vxh.ecomerce_web.controller;

import com.vxh.ecomerce_web.domain.USER_ROLE;
import com.vxh.ecomerce_web.modal.VerificationCode;
import com.vxh.ecomerce_web.request.LoginRequest;
import com.vxh.ecomerce_web.response.ApiResponse;
import com.vxh.ecomerce_web.response.AuthResponse;
import com.vxh.ecomerce_web.response.SignupRequest;
import com.vxh.ecomerce_web.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {
    private final AuthService authService;
    @PostMapping("/signup")
    public ResponseEntity<AuthResponse> CreateUserHandle(@RequestBody SignupRequest req ){

        String jwt = authService.createUser(req);
        AuthResponse res=new AuthResponse();
        res.setJwt(jwt);
        res.setMessage("register success");
        res.setRole(USER_ROLE.ROLE_CUSTOMER);
        return ResponseEntity.ok(res);

    }
    @PostMapping("/sent/login-signup-otp")
    public ResponseEntity<ApiResponse> sentOtpHandle(@RequestBody VerificationCode req ) throws Exception {

        authService.sentLoginOtp(req.getEmail());
        ApiResponse res=new ApiResponse();
        res.setMessage("otp sent successfully");
        return ResponseEntity.ok(res);

    }

    @PostMapping("/signing")
    public ResponseEntity<AuthResponse> loginHandle(@RequestBody LoginRequest req ) throws Exception {

        AuthResponse authResponse= authService.signing(req);

        return ResponseEntity.ok(authResponse);

    }
}
