package com.inventory.service.medical.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MedicalController {

    @GetMapping("/inventory")
    public String inventory_data(){
        return "list of inventory";
    }
}
