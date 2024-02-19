package com.controllercongetepost.controllercongetepost;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
public class NameController {

    @GetMapping("/name")
    public String getName(@RequestParam String name){
        return "Name: " + name;
    }

    @PostMapping("reverse-name")
    public String postName(@RequestParam String name){
        StringBuilder reverseName = new StringBuilder(name).reverse();
        return "Reserve Name: " + reverseName.toString();
    }

}
