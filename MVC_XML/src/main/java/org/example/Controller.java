package org.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Controller {
   @GetMapping("/index")
    public String index() {
       return "Запрос";
   }
   @GetMapping("/hello")
    public String hello(){ return "GET запрос";
   }
   @GetMapping("/hello_name")
   public String hello_name(@RequestParam(value = "name", defaultValue = "World") String name) {
       return String.format("Hello %s!", name);
   }
}
