package com.example.indiatour;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class flight {
    @GetMapping("/myflight")
    public String getdata()
    {
        return "Please book pune to goa flight ticket";
    }
}
