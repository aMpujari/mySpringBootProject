package com.example.mySpringBootProject;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author pc1
 */
@Controller
public class HelloController {
      
  
    
      @RequestMapping(value = "", method = RequestMethod.GET)
    public String index() {
        return "welcome";
    }
    
     
   @RequestMapping(value = "/welcome", method = RequestMethod.GET)
    public String welcome() {
        return "welcome";
    }


    
}
