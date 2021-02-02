package com.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/index")
public class IndexController {
    private static final Logger logger = Logger.getLogger(IndexController.class);

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model) {
        return "index";
    }
}
