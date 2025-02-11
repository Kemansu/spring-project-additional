package com.example.demo_2.service;

import com.example.demo_2.feign.AnimalTrackingClient;
import com.example.demo_2.model.AnimalTrackingInfo;
import com.example.demo_2.repository.AnimalTrackingInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.ZonedDateTime;

@Service
@Transactional(readOnly = true)
public class AnimalTrackingInfoService {

    private final AnimalTrackingInfoRepository trackingInfoRepository;

    private final AnimalTrackingClient animalTrackingClient;


    @Autowired
    public AnimalTrackingInfoService(AnimalTrackingInfoRepository trackingInfoRepository,
                                     AnimalTrackingClient animalTrackingClient) {
        this.trackingInfoRepository = trackingInfoRepository;
        this.animalTrackingClient = animalTrackingClient;
    }

    @Transactional
    public void saveInfo(AnimalTrackingInfo trackingInfo) {
        trackingInfoRepository.save(trackingInfo);
    }

    @Transactional
    @Scheduled(fixedRate = 5000)
    public void counter() {
        var trackingInfo = new AnimalTrackingInfo();

        trackingInfo.setNumberOfAnimals(animalTrackingClient.getNumberOfAnimals());
        trackingInfo.setDateOfScanning(ZonedDateTime.now());

        saveInfo(trackingInfo);
        try {
            HttpClient client = HttpClient.newHttpClient();

            // Если работает страничка с результатами - значит, тесты завершились
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("http://localhost:8090/index.html"))
                    .GET()
                    .build();

            client.send(request, HttpResponse.BodyHandlers.ofString());

            // если завершились автотесты, тогда выводим
            System.out.println("автотесты закончили свою работу");
            System.out.println("максимальное количсетво животных - " + trackingInfoRepository.findMaxNumberOfAnimals());
            System.out.println("минимальное количсетво животных - " + trackingInfoRepository.findMinNumberOfAnimals());
            System.exit(1);
        } catch (Exception e) {
            System.out.println("автотесты еще работают");
        }
    }
}
