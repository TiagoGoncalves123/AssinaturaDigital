package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ControllerDA {

    @GetMapping("/")
    public String greetingForm(Model model) {
        model.addAttribute("phone", new Phone());
        return "main";
    }

    @PostMapping("/showNumber")
    public String greetingSubmit(@ModelAttribute Phone phone, Model model, HttpServletRequest request, BindingResult br) {
        model.addAttribute("phone", phone);
        int phoneNumber = Integer.parseInt(request.getParameter("phoneNumber"));
        
         if (br.hasErrors()) {  
            return "error";  
        }  
        return "showNumber";
    }

}
