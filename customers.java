package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class customers {
    ArrayList<newCustomer> user= new ArrayList<>();
    @GetMapping ("/c")
    public ArrayList<newCustomer> getCustomers(){
        return user;
    }

    @PostMapping("/c")
    public String addCustomer(@RequestBody newCustomer list){
        user.add(list);
        return "customer added";
    }
    @PutMapping("/c/{index}")
    public String updateCustomer(@RequestBody newCustomer list, @PathVariable int index){
        user.set(index,list);
    return "customer updated";
    }

    @DeleteMapping("/c/{index}")
    public String DelteCustromer(@RequestBody newCustomer List, @PathVariable int index){
        user.remove(index);
        return "customer Delte";
    }


}
