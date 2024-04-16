package com.nehak.thymeleafsamplecode.controller;

import com.nehak.thymeleafsamplecode.dto.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
public class UserController {

    @GetMapping
    public String getUser(Model model) {
        User user = new User("neha", "er.nekhan@gmail.com", "ADMIN", "FEMALE");
        model.addAttribute("user", user);
        return "get-user";
    }

    //In this example template rendered would take prev selected object as reference using th:object
    @GetMapping("/selection")
    public String getUserSelection(Model model) {
        User user = new User("neha", "er.nekhan@gmail.com", "ADMIN", "FEMALE");
        model.addAttribute("user", user);
        return "get-user-selection-object";
    }

    //Message Expression example data will be loaded from properties file.
    @GetMapping("/properties-file-or-message-expression")
    public String getUserMessageExpression() {
        return "properties-file-or-message-expression";
    }

}
