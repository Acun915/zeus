package com.przemyslawmarciniec.module.home;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String getHome(Model model) {

        PersonDto person = new PersonDto(
                "Przemyslaw",
                "Marciniec",
                24
        );
        model.addAttribute("person", person);
        return "home";
    }
}
