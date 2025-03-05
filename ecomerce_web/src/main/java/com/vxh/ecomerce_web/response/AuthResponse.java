package com.vxh.ecomerce_web.response;

import com.vxh.ecomerce_web.domain.USER_ROLE;
import lombok.Data;

@Data
public class AuthResponse {
    private String jwt;
    private String message;
    private USER_ROLE role;
}
