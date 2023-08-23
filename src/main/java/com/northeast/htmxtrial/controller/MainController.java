package com.northeast.htmxtrial.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
public class MainController {

    @GetMapping("/magic-button")
    public String getMagicButtonContent() {
        return "I told you.";
    }
}