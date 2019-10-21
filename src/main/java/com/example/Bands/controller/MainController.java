package com.example.Bands.controller;

import com.example.Bands.domain.Band;
import com.example.Bands.repos.BandRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class MainController {
    @Autowired
    private BandRepo bandRepo;

    @GetMapping("/greeting")
    public String greeting(
            @RequestParam(name = "name", required = false, defaultValue = "Guest") String name,
            Map<String, Object> model
    ) {
        model.put("name", name);
        return "greeting";
    }

    @GetMapping
    public String main(Model model) {
        Iterable<Band> bands = bandRepo.findAll();

        model.addAttribute("bands", bands);

        return "main";
    }
}
