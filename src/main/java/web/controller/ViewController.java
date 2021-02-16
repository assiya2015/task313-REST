package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import web.entity.Role;
import web.entity.User;
import web.service.RoleService;
import web.service.RoleServiceImpl;
import web.service.UserService;

import java.util.HashSet;
import java.util.Set;

@Controller
@RequestMapping("/")
public class AdminController {

    @Autowired
    RoleService roleService;

    @GetMapping("/user")
    public String getUserPage(){
        return "showUser";
    }


    @GetMapping("/admin")
    public String getAdminPage(Model model) {
        model.addAttribute("allRoles", roleService.getAllRoles());
        return "admin";
    }
}

