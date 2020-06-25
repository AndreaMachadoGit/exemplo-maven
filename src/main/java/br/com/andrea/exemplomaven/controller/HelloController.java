package br.com.andrea.exemplomaven.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String helloMessage() {
        return "Hello, da Andrea pelo curso da DIO. ;-)";
    }

}
