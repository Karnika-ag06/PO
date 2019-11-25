package com.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

                @RequestMapping(value="/", method=RequestMethod.GET)
                public String getHomePage(ModelMap map)
                {
                                map.addAttribute("msg","Welcome To Purchase Order .....");
                               
                                return "HomePage";
                }
                
                
                
}
