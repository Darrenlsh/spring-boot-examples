package com.neo.thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
    @RequestMapping("/hello")
    public String hello(Model model, @RequestParam(value="name", required=false, defaultValue="JavaWorld") String name,@RequestParam String number) {
        model.addAttribute("name", name);
        model.addAttribute("number",number);
        return "hello";
    }
}
