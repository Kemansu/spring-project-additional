package com.example.demo_2.feign;

import com.example.demo_2.model.AccountDtoRequest;
import com.example.demo_2.model.AccountDtoResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@FeignClient(name = "animal-tracking-service")
public interface AnimalTrackingClient {

    @GetMapping("accounts/search")
    List<AccountDtoResponse> getTenAccounts();

    @PostMapping("/registration")
    AccountDtoResponse createUser(AccountDtoRequest accountDTORequest);

    @GetMapping("animals/getNumberOfAnimals")
    Integer getNumberOfAnimals();


}

