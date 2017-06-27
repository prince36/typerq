package com.typer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Ja on 27.06.2017.
 */
@Controller
public class HomeController {

    @RequestMapping("/")
    public String welcome(Model model) {


        return "home";
        //return "forward:/welcome/greeting";
    }
}
