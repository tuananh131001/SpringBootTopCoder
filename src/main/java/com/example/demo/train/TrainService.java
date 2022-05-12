package com.example.demo.train;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainService {
    private final TrainRepository trainRepository;

    public TrainService(TrainRepository trainRepository){
        this.trainRepository = trainRepository;
    }
    public Iterable<Train> list(){
        return trainRepository.findAll();
    }
    public Iterable<Train> save(List<Train> trainList){
        return trainRepository.saveAll(trainList);
    }
}
