package com.example.Bands.controller;

import com.example.Bands.domain.Band;
import com.example.Bands.repos.BandRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BandController {
    @Autowired
    private BandRepo bandRepo;

    @GetMapping("/adding")
    public String adding() {
        return "adding";
    }

    @PostMapping("/addBand")
    public String add(@RequestParam String name, @RequestParam String genre,
                      @RequestParam String origin, @RequestParam Integer foundation
    ) {
        Band band = new Band(name, genre, origin, foundation);

        bandRepo.save(band);

        return "adding";
    }
}
