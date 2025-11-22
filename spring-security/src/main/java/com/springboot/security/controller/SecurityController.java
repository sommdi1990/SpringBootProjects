package com.springboot.security.controller;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class SecurityController {

    @GetMapping("/public/hello")
    public Map<String, String> publicHello() {
        Map<String, String> response = new HashMap<>();
        response.put("message", "این یک endpoint عمومی است");
        return response;
    }

    @GetMapping("/private/info")
    public Map<String, Object> privateInfo(Authentication authentication) {
        Map<String, Object> response = new HashMap<>();
        response.put("message", "این یک endpoint محافظت شده است");
        response.put("username", authentication.getName());
        response.put("authorities", authentication.getAuthorities());
        return response;
    }
}

