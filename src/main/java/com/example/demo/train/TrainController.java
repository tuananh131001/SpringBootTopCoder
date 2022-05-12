package com.example.demo.train;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TrainController {
    private final TrainService trainService;

    public TrainController(TrainService trainService){
        this.trainService = trainService;
    }
    @GetMapping("/trains")
    public Iterable<Train> list(){
        return trainService.list();
    }
}
