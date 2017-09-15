package com.veo.pocation.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    private String googleMapApiKey;

    public HomeController( @Value("${google.map.api.key}") String googleMapApiKey) {
        this.googleMapApiKey = googleMapApiKey;
    }

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("googleApiKey", googleMapApiKey);
        return "index";
    }
}
