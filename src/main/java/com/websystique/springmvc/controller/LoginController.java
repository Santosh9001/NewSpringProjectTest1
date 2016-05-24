package com.websystique.springmvc.controller;

import java.util.ArrayList;
import java.util.List;

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
        model.addAttribute("sections",employee.getSections());
        model.addAttribute("countries",employee.getCountries());
        return "second";
    }
	@ModelAttribute("sections")
	//@RequestMapping(method=RequestMethod.GET)
    public List<String> initializeSections() {
 
        List<String> sections = new ArrayList<String>();
        sections.add("Graduate");
        sections.add("Post Graduate");
        sections.add("Research");
        return sections;
    }
	@ModelAttribute("countries")
	//@RequestMapping(method=RequestMethod.GET)
    public List<String> initializeCountries() {
 
        List<String> countries = new ArrayList<String>();
        countries.add("USA");
        countries.add("CANADA");
        countries.add("FRANCE");
        countries.add("GERMANY");
        countries.add("ITALY");
        countries.add("OTHER");
        return countries;
    }
	
	@ModelAttribute("genders")
	public List<String> identifyGender(){
		
		List<String> genders = new ArrayList<String>();
		genders.add("male");
		genders.add("female");
		return genders;
	}

}
