package com.example.indiatour;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hotel {
    @GetMapping("/myhotel")
    public String getdata() {
        return "Please book hotel room A3";
    }
}
