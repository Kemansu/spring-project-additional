package com.example.demo_2.controller;

import com.example.demo_2.model.AccountDtoRequest;
import com.example.demo_2.model.AccountDtoResponse;
import com.example.demo_2.service.AnimalTrackingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MainController {
    private final AnimalTrackingService animalTrackingService;

    @Autowired
    public MainController(AnimalTrackingService animalTrackingService) {
        this.animalTrackingService = animalTrackingService;
    }

    @PostMapping("/addAccount")
    public ResponseEntity<List<AccountDtoResponse>> add(@RequestBody AccountDtoRequest accountDTORequest) {
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(animalTrackingService.createUser(accountDTORequest));
    }
}
