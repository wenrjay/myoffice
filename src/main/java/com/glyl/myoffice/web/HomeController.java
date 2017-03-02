package com.glyl.myoffice.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by jay on 2017/2/7.
 *
 * @author jay
 */
@Controller
public class HomeController {
    @RequestMapping(value = "/home")
    public String home(){
        return "/views/home/home";
    }
}
