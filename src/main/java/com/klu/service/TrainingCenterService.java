package com.klu.service;

import org.springframework.stereotype.Service;

import com.klu.entity.TrainingCenter;
import com.klu.repository.TrainingCenterRepository;

import java.util.List;

@Service
public class TrainingCenterService {

    private final TrainingCenterRepository repository;

    public TrainingCenterService(TrainingCenterRepository repository) {
        this.repository = repository;
    }

    public TrainingCenter createTrainingCenter(TrainingCenter trainingCenter) {
        trainingCenter.setCreatedOn(System.currentTimeMillis()); // Set createdOn timestamp
        return repository.save(trainingCenter);
    }

    public List<TrainingCenter> getAllTrainingCenters() {
        return repository.findAll();
    }
}
