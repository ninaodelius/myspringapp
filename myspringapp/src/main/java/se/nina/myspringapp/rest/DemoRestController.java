package se.nina.myspringapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class DemoRestController {

    //inject properties for villager and island
    @Value("${villager.name}")
    private String villagerName;
    @Value("${island.name}")
    private String islandName;

    //expose new endpoint for "islandinfo"
    @GetMapping("/islandinfo")
    public String getIslandInfo() {
        return "Villager: " + villagerName + ", Island name: " + islandName;
    }

    @GetMapping("/")
    public String sayHello() {
        return "Hello World! Time on server is " + LocalDateTime.now();
    }

    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "run run run";
    }

    @GetMapping("/fortune")
    public String getDailyFortune() {
        return "heres a fortune";
    }

}



