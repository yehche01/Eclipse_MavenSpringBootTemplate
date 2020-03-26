package template.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


//@Controller + @ResponseBody = @RestController
@RestController
public class HelloController {
	@GetMapping("/hello")
    public String getHello() {
        System.out.println("hello");
        return "Hello World!";
    }
}
