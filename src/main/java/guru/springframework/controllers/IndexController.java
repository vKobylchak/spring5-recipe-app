package guru.springframework.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping({"", "/", "/index"})
    public String getIndexPage(){
        System.out.println("Some message to say ... 1234 55555");
        return "index";
    }
}
