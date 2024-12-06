package com.steadfast.NinjaRegistration.Ninjas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    @GetMapping("/welcome")
    public String welcome() {
        return "This is my first message";
    }

    @PostMapping("/registerNinja")
    public String register_ninja(){
        return "Ninja registered";
    };

    @GetMapping("/showAll")
    public String showAll() {
        return "These are all the ninjas";
    }

    @GetMapping("/showAllById")
    public String showAllById() {
        return "These are all the ninjas ids";
    }

    @PutMapping("/alterId")
    public String alterId() {
        return "Alter Ninja by id";
    }

    @DeleteMapping("/deleteID")
    public String deleteId() {
        return "Id deleted";
    };



}
