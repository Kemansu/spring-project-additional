package com.example.demo_2.api;

import com.example.demo_2.model.AnimalDtoCreateRequest;
import com.example.demo_2.model.AnimalDtoResponse;
import com.example.demo_2.model.AnimalDtoUpdateRequest;
import com.example.demo_2.model.AnimalDtoUpdateTypeRequest;
import com.example.demo_2.model.AnimalTypeDtoRequest;
import com.example.demo_2.model.AnimalTypeDtoResponse;
import com.example.demo_2.model.AnimalVisitedLocationsDtoRequest;
import com.example.demo_2.model.AnimalVisitedLocationsDtoResponse;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.context.request.NativeWebRequest;

import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-02-10T07:29:23.447541+03:00[Europe/Moscow]")
@Controller
@RequestMapping("${openapi.openAPIDefinition.base-path:}")
public class AnimalsApiController implements AnimalsApi {

    private final NativeWebRequest request;

    @Autowired
    public AnimalsApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
