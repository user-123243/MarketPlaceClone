package com.example.buysell.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ErrorController implements org.springframework.boot.web.servlet.error.ErrorController{
    @RequestMapping("/error")
    public String handleErrod(Model model){
        model.addAttribute("error", "Произошла ошибка. Пожалуйства проверьте запрос или попробуйте снова.");
        return "error";
    }

    public String getErrorPath() {
        return "/error";
    }

}
