package com.xworkz.JDBCauthentication.controller;

//import org.springframework.stereotype.Controller;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class SpringController {



//    @GetMapping
//    public String home(){
//        return "index";
//    }

    @GetMapping("/")
    public String home(){
        return "index";
    }

//    @PreAuthorize("hasRole('ADMIN')")
//    @GetMapping("/adminToHome")
//    public String getHomeA(){
//        System.out.println("admin");
//        return "Home Admin";
//    }
//
//    @PreAuthorize("hasRole('USER')")
//    @GetMapping("/userToHome")
//    public String getHomeU(){
//        System.out.println("user");
//        return "Home User";
//    }

}
