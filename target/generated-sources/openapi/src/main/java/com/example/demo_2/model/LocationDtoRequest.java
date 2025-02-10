package com.example.demo_2.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * LocationDtoRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-02-10T07:29:23.447541+03:00[Europe/Moscow]")
public class LocationDtoRequest {

  private JsonNullable<Object> latitude = JsonNullable.undefined();

  private JsonNullable<Object> longitude = JsonNullable.undefined();

  public LocationDtoRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public LocationDtoRequest(Object latitude, Object longitude) {
    this.latitude = JsonNullable.of(latitude);
    this.longitude = JsonNullable.of(longitude);
  }

  public LocationDtoRequest latitude(Object latitude) {
    this.latitude = JsonNullable.of(latitude);
    return this;
  }

  /**
   * Get latitude
   * minimum: -90
   * maximum: 90
   * @return latitude
  */
  @NotNull @DecimalMin("-90") @DecimalMax("90") 
  @Schema(name = "latitude", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("latitude")
  public JsonNullable<Object> getLatitude() {
    return latitude;
  }

  public void setLatitude(JsonNullable<Object> latitude) {
    this.latitude = latitude;
  }

  public LocationDtoRequest longitude(Object longitude) {
    this.longitude = JsonNullable.of(longitude);
    return this;
  }

  /**
   * Get longitude
   * minimum: -180
   * maximum: 180
   * @return longitude
  */
  @NotNull @DecimalMin("-180") @DecimalMax("180") 
  @Schema(name = "longitude", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("longitude")
  public JsonNullable<Object> getLongitude() {
    return longitude;
  }

  public void setLongitude(JsonNullable<Object> longitude) {
    this.longitude = longitude;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocationDtoRequest locationDtoRequest = (LocationDtoRequest) o;
    return Objects.equals(this.latitude, locationDtoRequest.latitude) &&
        Objects.equals(this.longitude, locationDtoRequest.longitude);
  }

  @Override
  public int hashCode() {
    return Objects.hash(latitude, longitude);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocationDtoRequest {\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

