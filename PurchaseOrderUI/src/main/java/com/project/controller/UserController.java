package com.project.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.project.model.User;
import com.project.service.UserService;

@Controller
public class UserController {
                
                
                @Autowired
                UserService userService;
                

                
//=====open register form========
                
                @RequestMapping(value="/getRegisterForm" , method=RequestMethod.GET)
                public String getRegisterForm(ModelMap map)
                {
                                map.addAttribute("userObj",new User());
                                return "Register";
                }
                
//=======register the buyer=========
                
                @RequestMapping(value="/registerUser",method=RequestMethod.POST)
                public String addRegister(@ModelAttribute User userObj )
                {
                                //if role
                                userService.addUser(userObj);    //method call to service method 
                                return "success";
                }
                
//=======open login form=========
                
                @RequestMapping(value="/getLoginForm",method=RequestMethod.GET)
                public String getLoginForm()
                {
                                return "LoginForm";
                }
                
                
//======login buyer==========
                
                @Autowired
                HttpSession session;
                
              @RequestMapping(value="/validate", method =RequestMethod.POST)
            public String validateUser(@RequestParam String email ,@RequestParam String password)
           	{
           		User uObj = userService.validateUser(email, password);
           		
           		if(uObj==null)
           		{
           			return "Register";
           		}
           		else {
           			
           			session.setAttribute("uObj",uObj);
           			if(uObj.getUserRole().equals("Buyer"))
           			{
           			
           			return "Buyerpage";
           			}
           			else if(uObj.getUserRole().equalsIgnoreCase("Vendor")) {
           				
           				return "VendorPage";
           			}
           			
           			else
           			{
           				return "Success";
           			}
           		}
           	}
           	
           }
