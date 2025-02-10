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
 * AnimalDtoUpdateTypeRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-02-10T07:29:23.447541+03:00[Europe/Moscow]")
public class AnimalDtoUpdateTypeRequest {

  private JsonNullable<Object> oldTypeId = JsonNullable.undefined();

  private JsonNullable<Object> newTypeId = JsonNullable.undefined();

  public AnimalDtoUpdateTypeRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AnimalDtoUpdateTypeRequest(Object oldTypeId, Object newTypeId) {
    this.oldTypeId = JsonNullable.of(oldTypeId);
    this.newTypeId = JsonNullable.of(newTypeId);
  }

  public AnimalDtoUpdateTypeRequest oldTypeId(Object oldTypeId) {
    this.oldTypeId = JsonNullable.of(oldTypeId);
    return this;
  }

  /**
   * Get oldTypeId
   * minimum: 1
   * @return oldTypeId
  */
  @NotNull @DecimalMin("1") 
  @Schema(name = "oldTypeId", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("oldTypeId")
  public JsonNullable<Object> getOldTypeId() {
    return oldTypeId;
  }

  public void setOldTypeId(JsonNullable<Object> oldTypeId) {
    this.oldTypeId = oldTypeId;
  }

  public AnimalDtoUpdateTypeRequest newTypeId(Object newTypeId) {
    this.newTypeId = JsonNullable.of(newTypeId);
    return this;
  }

  /**
   * Get newTypeId
   * minimum: 1
   * @return newTypeId
  */
  @NotNull @DecimalMin("1") 
  @Schema(name = "newTypeId", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("newTypeId")
  public JsonNullable<Object> getNewTypeId() {
    return newTypeId;
  }

  public void setNewTypeId(JsonNullable<Object> newTypeId) {
    this.newTypeId = newTypeId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnimalDtoUpdateTypeRequest animalDtoUpdateTypeRequest = (AnimalDtoUpdateTypeRequest) o;
    return Objects.equals(this.oldTypeId, animalDtoUpdateTypeRequest.oldTypeId) &&
        Objects.equals(this.newTypeId, animalDtoUpdateTypeRequest.newTypeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oldTypeId, newTypeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnimalDtoUpdateTypeRequest {\n");
    sb.append("    oldTypeId: ").append(toIndentedString(oldTypeId)).append("\n");
    sb.append("    newTypeId: ").append(toIndentedString(newTypeId)).append("\n");
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

