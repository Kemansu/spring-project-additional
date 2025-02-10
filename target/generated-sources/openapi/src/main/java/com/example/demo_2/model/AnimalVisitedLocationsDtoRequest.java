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
 * AnimalVisitedLocationsDtoRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-02-10T07:29:23.447541+03:00[Europe/Moscow]")
public class AnimalVisitedLocationsDtoRequest {

  private JsonNullable<Object> visitedLocationPointId = JsonNullable.undefined();

  private JsonNullable<Object> locationPointId = JsonNullable.undefined();

  public AnimalVisitedLocationsDtoRequest visitedLocationPointId(Object visitedLocationPointId) {
    this.visitedLocationPointId = JsonNullable.of(visitedLocationPointId);
    return this;
  }

  /**
   * Get visitedLocationPointId
   * minimum: 1
   * @return visitedLocationPointId
  */
  @DecimalMin("1") 
  @Schema(name = "visitedLocationPointId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("visitedLocationPointId")
  public JsonNullable<Object> getVisitedLocationPointId() {
    return visitedLocationPointId;
  }

  public void setVisitedLocationPointId(JsonNullable<Object> visitedLocationPointId) {
    this.visitedLocationPointId = visitedLocationPointId;
  }

  public AnimalVisitedLocationsDtoRequest locationPointId(Object locationPointId) {
    this.locationPointId = JsonNullable.of(locationPointId);
    return this;
  }

  /**
   * Get locationPointId
   * minimum: 1
   * @return locationPointId
  */
  @DecimalMin("1") 
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
    AnimalVisitedLocationsDtoRequest animalVisitedLocationsDtoRequest = (AnimalVisitedLocationsDtoRequest) o;
    return equalsNullable(this.visitedLocationPointId, animalVisitedLocationsDtoRequest.visitedLocationPointId) &&
        equalsNullable(this.locationPointId, animalVisitedLocationsDtoRequest.locationPointId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(visitedLocationPointId), hashCodeNullable(locationPointId));
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
    sb.append("class AnimalVisitedLocationsDtoRequest {\n");
    sb.append("    visitedLocationPointId: ").append(toIndentedString(visitedLocationPointId)).append("\n");
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

