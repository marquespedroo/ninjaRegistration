package com.steadfast.NinjaRegistration.Missions;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("missions")

public class MissionsController {


    @GetMapping("listMissions")
    public String listMissions() {
        return "These are the missions";
    }

    @PostMapping("/add")
    public String addMission() {
        return "Mission added.";
    }

    @PutMapping("alter")
    public String alterMission() {
        return "Mission altered";
    }

}
