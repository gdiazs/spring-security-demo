package io.github.gdiazs.demo.web.controllers;

import io.github.gdiazs.demo.services.SampleService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {

  private final SampleService sampleService;

  public HomeController(SampleService sampleService) {
    this.sampleService = sampleService;
  }

  @GetMapping
  public String goHome() {
    this.sampleService.sayHello();
    return "index";
  }
}
