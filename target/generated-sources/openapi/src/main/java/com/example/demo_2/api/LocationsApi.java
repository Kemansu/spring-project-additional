/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.0.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.example.demo_2.api;

import com.example.demo_2.model.LocationDtoRequest;
import com.example.demo_2.model.LocationDtoResponse;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-02-10T07:29:23.447541+03:00[Europe/Moscow]")
@Validated
@Tag(name = "Локации", description = "Управление точками локаций")
public interface LocationsApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /locations : Добавить локацию
     * Создает новую локацию по введенным параметрам и возвращает добавленную локацию
     *
     * @param locationDtoRequest  (required)
     * @return Точка локации с такими latitude и longitude уже сущесвтует (status code 409)
     *         or Невалидные параметры запроса (status code 400)
     *         or Неверные авторизационные данные (status code 401)
     *         or Локация успешно создана (status code 201)
     */
    @Operation(
        operationId = "addLocation",
        summary = "Добавить локацию",
        description = "Создает новую локацию по введенным параметрам и возвращает добавленную локацию",
        tags = { "Локации" },
        responses = {
            @ApiResponse(responseCode = "409", description = "Точка локации с такими latitude и longitude уже сущесвтует", content = {
                @Content(mediaType = "*/*", schema = @Schema(implementation = LocationDtoResponse.class))
            }),
            @ApiResponse(responseCode = "400", description = "Невалидные параметры запроса", content = {
                @Content(mediaType = "*/*", schema = @Schema(implementation = LocationDtoResponse.class))
            }),
            @ApiResponse(responseCode = "401", description = "Неверные авторизационные данные", content = {
                @Content(mediaType = "*/*", schema = @Schema(implementation = LocationDtoResponse.class))
            }),
            @ApiResponse(responseCode = "201", description = "Локация успешно создана", content = {
                @Content(mediaType = "*/*", schema = @Schema(implementation = LocationDtoResponse.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/locations",
        produces = { "*/*" },
        consumes = { "application/json" }
    )
    default ResponseEntity<LocationDtoResponse> addLocation(
        @Parameter(name = "LocationDtoRequest", description = "", required = true) @Valid @RequestBody LocationDtoRequest locationDtoRequest
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("*/*"))) {
                    String exampleString = "{ \"latitude\" : \"\", \"id\" : \"\", \"longitude\" : \"\" }";
                    ApiUtil.setExampleResponse(request, "*/*", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * DELETE /locations/{pointId} : Удалить локацию
     * удаляет локацию по ID
     *
     * @param pointId  (required)
     * @return Невалидные параметры запроса (status code 400)
     *         or Неверные авторизационные данные (status code 401)
     *         or Локация успешно удалена (status code 200)
     *         or Точка локации с таким ID не найдена (status code 404)
     */
    @Operation(
        operationId = "deleteLocation",
        summary = "Удалить локацию",
        description = "удаляет локацию по ID",
        tags = { "Локации" },
        responses = {
            @ApiResponse(responseCode = "400", description = "Невалидные параметры запроса"),
            @ApiResponse(responseCode = "401", description = "Неверные авторизационные данные"),
            @ApiResponse(responseCode = "200", description = "Локация успешно удалена"),
            @ApiResponse(responseCode = "404", description = "Точка локации с таким ID не найдена")
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/locations/{pointId}"
    )
    default ResponseEntity<Void> deleteLocation(
        @DecimalMin("1") @Parameter(name = "pointId", description = "", required = true, in = ParameterIn.PATH) @PathVariable("pointId") Object pointId
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /locations/{id} : Получение локации
     * Возвращает локацию по ID
     *
     * @param id  (required)
     * @return Запрос успешно выполнен (status code 200)
     *         or Невалидные параметры запроса (status code 400)
     *         or Неверные авторизационные данные (status code 401)
     *         or Точка локации с таким ID не найдена (status code 404)
     */
    @Operation(
        operationId = "getLocation",
        summary = "Получение локации",
        description = "Возвращает локацию по ID",
        tags = { "Локации" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Запрос успешно выполнен", content = {
                @Content(mediaType = "*/*", schema = @Schema(implementation = LocationDtoResponse.class))
            }),
            @ApiResponse(responseCode = "400", description = "Невалидные параметры запроса", content = {
                @Content(mediaType = "*/*", schema = @Schema(implementation = LocationDtoResponse.class))
            }),
            @ApiResponse(responseCode = "401", description = "Неверные авторизационные данные", content = {
                @Content(mediaType = "*/*", schema = @Schema(implementation = LocationDtoResponse.class))
            }),
            @ApiResponse(responseCode = "404", description = "Точка локации с таким ID не найдена", content = {
                @Content(mediaType = "*/*", schema = @Schema(implementation = LocationDtoResponse.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/locations/{id}",
        produces = { "*/*" }
    )
    default ResponseEntity<LocationDtoResponse> getLocation(
        @DecimalMin("1") @Parameter(name = "id", description = "", required = true, in = ParameterIn.PATH) @PathVariable("id") Object id
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("*/*"))) {
                    String exampleString = "{ \"latitude\" : \"\", \"id\" : \"\", \"longitude\" : \"\" }";
                    ApiUtil.setExampleResponse(request, "*/*", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /locations/{pointId} : Обновить данные локации
     * Обновляет данные локации и возвращает обновленные данные
     *
     * @param pointId  (required)
     * @param locationDtoRequest  (required)
     * @return Точка локации с такими latitude и longitude уже сущесвтует (status code 409)
     *         or Локация успешно обновлена (status code 200)
     *         or Невалидные параметры запроса (status code 400)
     *         or Точка локации с таким ID не найдена (status code 404)
     */
    @Operation(
        operationId = "updateLocation",
        summary = "Обновить данные локации",
        description = "Обновляет данные локации и возвращает обновленные данные",
        tags = { "Локации" },
        responses = {
            @ApiResponse(responseCode = "409", description = "Точка локации с такими latitude и longitude уже сущесвтует", content = {
                @Content(mediaType = "*/*", schema = @Schema(implementation = LocationDtoResponse.class))
            }),
            @ApiResponse(responseCode = "200", description = "Локация успешно обновлена", content = {
                @Content(mediaType = "*/*", schema = @Schema(implementation = LocationDtoResponse.class))
            }),
            @ApiResponse(responseCode = "400", description = "Невалидные параметры запроса", content = {
                @Content(mediaType = "*/*", schema = @Schema(implementation = LocationDtoResponse.class))
            }),
            @ApiResponse(responseCode = "404", description = "Точка локации с таким ID не найдена", content = {
                @Content(mediaType = "*/*", schema = @Schema(implementation = LocationDtoResponse.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/locations/{pointId}",
        produces = { "*/*" },
        consumes = { "application/json" }
    )
    default ResponseEntity<LocationDtoResponse> updateLocation(
        @DecimalMin("1") @Parameter(name = "pointId", description = "", required = true, in = ParameterIn.PATH) @PathVariable("pointId") Object pointId,
        @Parameter(name = "LocationDtoRequest", description = "", required = true) @Valid @RequestBody LocationDtoRequest locationDtoRequest
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("*/*"))) {
                    String exampleString = "{ \"latitude\" : \"\", \"id\" : \"\", \"longitude\" : \"\" }";
                    ApiUtil.setExampleResponse(request, "*/*", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
