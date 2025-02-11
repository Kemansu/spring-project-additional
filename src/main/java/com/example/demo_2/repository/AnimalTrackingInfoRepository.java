package com.example.demo_2.repository;

import com.example.demo_2.model.AnimalTrackingInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalTrackingInfoRepository extends JpaRepository<AnimalTrackingInfo, Integer> {

    @Query("select max(trackingInfo.numberOfAnimals) from AnimalTrackingInfo trackingInfo")
    Integer findMaxNumberOfAnimals();

    @Query("select min(trackingInfo.numberOfAnimals) from AnimalTrackingInfo trackingInfo")
    Integer findMinNumberOfAnimals();
}
