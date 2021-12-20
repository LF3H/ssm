package com.pubnews.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

    @ResponseBody
    @RequestMapping("/index")
    public String say() {
        return "hello, world！";
    }
}
