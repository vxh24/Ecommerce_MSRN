package com.vxh.ecomerce_web.service;

import com.vxh.ecomerce_web.request.LoginRequest;
import com.vxh.ecomerce_web.response.AuthResponse;
import com.vxh.ecomerce_web.response.SignupRequest;

public interface AuthService {
    void sentLoginOtp(String email) throws Exception;
    String createUser(SignupRequest req);
    AuthResponse signing(LoginRequest req);
}
