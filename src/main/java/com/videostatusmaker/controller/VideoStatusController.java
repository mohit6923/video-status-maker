package com.videostatusmaker.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VideoStatusController {

    @RequestMapping("/getGreet")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}
