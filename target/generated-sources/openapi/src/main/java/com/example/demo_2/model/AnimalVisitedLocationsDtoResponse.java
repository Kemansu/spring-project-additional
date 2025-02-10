package com.example.demo_2.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AnimalVisitedLocationsDtoResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-02-10T07:29:23.447541+03:00[Europe/Moscow]")
public class AnimalVisitedLocationsDtoResponse {

  private JsonNullable<Object> id = JsonNullable.undefined();

  private JsonNullable<Object> dateTimeOfVisitLocationPoint = JsonNullable.undefined();

  private JsonNullable<Object> locationPointId = JsonNullable.undefined();

  public AnimalVisitedLocationsDtoResponse id(Object id) {
    this.id = JsonNullable.of(id);
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public JsonNullable<Object> getId() {
    return id;
  }

  public void setId(JsonNullable<Object> id) {
    this.id = id;
  }

  public AnimalVisitedLocationsDtoResponse dateTimeOfVisitLocationPoint(Object dateTimeOfVisitLocationPoint) {
    this.dateTimeOfVisitLocationPoint = JsonNullable.of(dateTimeOfVisitLocationPoint);
    return this;
  }

  /**
   * Get dateTimeOfVisitLocationPoint
   * @return dateTimeOfVisitLocationPoint
  */
  
  @Schema(name = "dateTimeOfVisitLocationPoint", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dateTimeOfVisitLocationPoint")
  public JsonNullable<Object> getDateTimeOfVisitLocationPoint() {
    return dateTimeOfVisitLocationPoint;
  }

  public void setDateTimeOfVisitLocationPoint(JsonNullable<Object> dateTimeOfVisitLocationPoint) {
    this.dateTimeOfVisitLocationPoint = dateTimeOfVisitLocationPoint;
  }

  public AnimalVisitedLocationsDtoResponse locationPointId(Object locationPointId) {
    this.locationPointId = JsonNullable.of(locationPointId);
    return this;
  }

  /**
   * Get locationPointId
   * @return locationPointId
  */
  
  @Schema(name = "locationPointId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("locationPointId")
  public JsonNullable<Object> getLocationPointId() {
    return locationPointId;
  }

  public void setLocationPointId(JsonNullable<Object> locationPointId) {
    this.locationPointId = locationPointId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnimalVisitedLocationsDtoResponse animalVisitedLocationsDtoResponse = (AnimalVisitedLocationsDtoResponse) o;
    return equalsNullable(this.id, animalVisitedLocationsDtoResponse.id) &&
        equalsNullable(this.dateTimeOfVisitLocationPoint, animalVisitedLocationsDtoResponse.dateTimeOfVisitLocationPoint) &&
        equalsNullable(this.locationPointId, animalVisitedLocationsDtoResponse.locationPointId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(id), hashCodeNullable(dateTimeOfVisitLocationPoint), hashCodeNullable(locationPointId));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnimalVisitedLocationsDtoResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    dateTimeOfVisitLocationPoint: ").append(toIndentedString(dateTimeOfVisitLocationPoint)).append("\n");
    sb.append("    locationPointId: ").append(toIndentedString(locationPointId)).append("\n");
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

