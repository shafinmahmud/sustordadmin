/*
 */
package me.shafin.sustordadmin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author SHAFIN
 */
@Controller
public class TestController {
    
    @RequestMapping("/")
    public String showHome(Model model) {
        model.addAttribute("name", "Shafin");
        return "home";
    }
  
    
}
