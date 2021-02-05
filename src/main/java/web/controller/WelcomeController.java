package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import web.service.UserService;

@Controller
@RequestMapping("/welcome")
public class WelcomeController {

    private final UserService userService;


    public WelcomeController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public String welcome() {
        return "welcome/welcome";
    }

}
