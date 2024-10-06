package com.klu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.klu.entity.TrainingCenter;

public interface TrainingCenterRepository extends JpaRepository<TrainingCenter, Long> {
}
