package com.springboot.DemoProject;

import com.external.Football;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SportsController {
    private final Sports sports;
    @Autowired
    SportsController(Sports sports) {
        this.sports = sports;
    }
    @GetMapping("/mysport")
    public String getMySport() {
        return sports.sport();
    }
}
