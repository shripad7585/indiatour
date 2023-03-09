package com.example.indiatour;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class holidaypackage {
    @GetMapping("/holiday")
    public String getdata() {
        return "Please select holiday package";
    }
}