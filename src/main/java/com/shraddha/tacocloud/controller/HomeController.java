package com.shraddha.tacocloud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by HOME on 01-07-2019.
 */
@Controller
public class HomeController {

    @GetMapping(value = "/")
    public String home(){
        return "home";
    }
}
