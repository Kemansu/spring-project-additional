package com.example.demo_2.model;

import jakarta.persistence.*;

import java.time.ZonedDateTime;

@Entity()
@Table(name = "animal_tracking_info")
public class AnimalTrackingInfo {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "number_of_animals")
    private Integer numberOfAnimals;

    @Column(name = "date_of_scanning")
    private ZonedDateTime dateOfScanning;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumberOfAnimals() {
        return numberOfAnimals;
    }

    public void setNumberOfAnimals(Integer numberOfAnimals) {
        this.numberOfAnimals = numberOfAnimals;
    }

    public ZonedDateTime getDateOfScanning() {
        return dateOfScanning;
    }

    public void setDateOfScanning(ZonedDateTime dateOfScanning) {
        this.dateOfScanning = dateOfScanning;
    }
}
