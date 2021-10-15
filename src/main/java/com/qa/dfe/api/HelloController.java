package com.qa.dfe.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  // if spring receives a GET request at /hello
  // call vv THIS vv method

  @GetMapping("/hello")
  public String hello() {
    return "Hello, DFE!";
  }

  @GetMapping("/goodbye")
  public String bye() {
    return "So long!";
  }

}
