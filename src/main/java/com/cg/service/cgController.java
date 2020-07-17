package com.cg.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class cgController {

    @GetMapping(value="/")
    public String nothing(){
        return "default!";
    }

    @GetMapping("/startFile")
    public String startFile(){
        return "Done!";
    }
}
