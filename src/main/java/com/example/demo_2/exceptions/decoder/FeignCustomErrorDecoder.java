package com.example.demo_2.exceptions.decoder;

import com.example.demo_2.exceptions.ConflictDataException;
import com.example.demo_2.exceptions.ForbiddenException;
import com.example.demo_2.exceptions.ObjectNotFoundException;
import com.example.demo_2.exceptions.RequestValidationException;
import feign.FeignException;
import feign.Response;
import feign.codec.ErrorDecoder;
import org.apache.tomcat.websocket.AuthenticationException;
import org.springframework.stereotype.Component;


@Component
public class FeignCustomErrorDecoder implements ErrorDecoder {

    @Override
    public Exception decode(String methodKey, Response response) {
        int status = response.status();
        if (status == 404) {
            return new ObjectNotFoundException("");
        } else if (status == 401) {
            return new AuthenticationException("");
        } else if (status == 400) {
            return new RequestValidationException("");
        } else if (status == 403) {
            return new ForbiddenException("");
        }  else if (status == 409) {
            return new ConflictDataException("");
        }


        return FeignException.errorStatus(methodKey, response);
    }
}

