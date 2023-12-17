package com.external;

import com.springboot.DemoProject.Sports;
import org.springframework.stereotype.Component;

@Component
public class Football implements Sports {

    @Override
    public String sport() {
        return "Football is played as Rugby in India";
    }
}
