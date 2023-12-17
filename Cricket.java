package com.springboot.DemoProject;

import org.springframework.stereotype.Component;

@Component
public class Cricket implements Sports {
        @Override
        public String sport() {
            return "Cricket is popular in India.";
    }
}
