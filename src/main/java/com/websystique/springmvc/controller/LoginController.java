package com.websystique.springmvc.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.websystique.springmvc.model.Login;

@Controller
public class LoginController {
	
	@RequestMapping(value ="/login",method=RequestMethod.GET)
	public ModelAndView showLogin(){
		
		return new ModelAndView("login", "login", new Login());
	}
	
	@RequestMapping(value = "/second", method = RequestMethod.POST)
    public String submit(@Valid @ModelAttribute("login")Login employee, 
      BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "error";
        }
        model.addAttribute("name", employee.getUsername());
        model.addAttribute("contactNumber", employee.getPassword());        
        return "second";
    }

}
