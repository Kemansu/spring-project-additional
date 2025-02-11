package com.example.demo_2.service;

import com.example.demo_2.feign.AnimalTrackingClient;
import com.example.demo_2.model.AccountDtoRequest;
import com.example.demo_2.model.AccountDtoResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimalTrackingService {
    private final AnimalTrackingClient animalTrackingClient;

    @Autowired
    public AnimalTrackingService(AnimalTrackingClient animalTrackingClient) {
        this.animalTrackingClient = animalTrackingClient;
    }

    public List<AccountDtoResponse> getAllUsers() {
        return  animalTrackingClient.getTenAccounts();
    }

    public List<AccountDtoResponse> createUser(AccountDtoRequest accountDTORequest) {
        animalTrackingClient.createUser(accountDTORequest);
        return getAllUsers();
    }
}

