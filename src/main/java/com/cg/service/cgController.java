package com.cg.service;

import com.cg.json.jsonThings;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URISyntaxException;

@RestController
public class cgController {

    @GetMapping(value="/")
    public String nothing(){
        return "default!";
    }

    @GetMapping("/startFile")
    public String startFile() throws URISyntaxException {
        return new jsonThings().startProcess();
    }
}
