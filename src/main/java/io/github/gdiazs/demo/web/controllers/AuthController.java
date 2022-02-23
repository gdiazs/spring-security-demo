package io.github.gdiazs.demo.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AuthController {

  @GetMapping("/login")
  public String goHome() {
    return "auth/login";
  }

  @PostMapping("/login")
  public String dologin() {
    System.out.println("POST");
    return "auth/login";
  }
}
