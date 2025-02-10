package com.example.demo_2.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AnimalDtoCreateRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-02-10T07:29:23.447541+03:00[Europe/Moscow]")
public class AnimalDtoCreateRequest {

  private JsonNullable<Object> animalTypes = JsonNullable.undefined();

  private JsonNullable<Object> weight = JsonNullable.undefined();

  private JsonNullable<Object> length = JsonNullable.undefined();

  private JsonNullable<Object> height = JsonNullable.undefined();

  /**
   * Gets or Sets gender
   */
  public enum GenderEnum {
    MALE("MALE"),
    
    FEMALE("FEMALE"),
    
    OTHER("OTHER");

    private Object value;

    GenderEnum(Object value) {
      this.value = value;
    }

    @JsonValue
    public Object getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static GenderEnum fromValue(Object value) {
      for (GenderEnum b : GenderEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  private JsonNullable<GenderEnum> gender = JsonNullable.undefined();

  private JsonNullable<Object> chipperId = JsonNullable.undefined();

  private JsonNullable<Object> chippingLocationId = JsonNullable.undefined();

  public AnimalDtoCreateRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AnimalDtoCreateRequest(Object animalTypes, Object weight, Object length, Object height, GenderEnum gender, Object chipperId, Object chippingLocationId) {
    this.animalTypes = JsonNullable.of(animalTypes);
    this.weight = JsonNullable.of(weight);
    this.length = JsonNullable.of(length);
    this.height = JsonNullable.of(height);
    this.gender = JsonNullable.of(gender);
    this.chipperId = JsonNullable.of(chipperId);
    this.chippingLocationId = JsonNullable.of(chippingLocationId);
  }

  public AnimalDtoCreateRequest animalTypes(Object animalTypes) {
    this.animalTypes = JsonNullable.of(animalTypes);
    return this;
  }

  /**
   * Get animalTypes
   * @return animalTypes
  */
  @NotNull 
  @Schema(name = "animalTypes", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("animalTypes")
  public JsonNullable<Object> getAnimalTypes() {
    return animalTypes;
  }

  public void setAnimalTypes(JsonNullable<Object> animalTypes) {
    this.animalTypes = animalTypes;
  }

  public AnimalDtoCreateRequest weight(Object weight) {
    this.weight = JsonNullable.of(weight);
    return this;
  }

  /**
   * Get weight
   * minimum: 0
   * @return weight
  */
  @NotNull @DecimalMin("0") 
  @Schema(name = "weight", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("weight")
  public JsonNullable<Object> getWeight() {
    return weight;
  }

  public void setWeight(JsonNullable<Object> weight) {
    this.weight = weight;
  }

  public AnimalDtoCreateRequest length(Object length) {
    this.length = JsonNullable.of(length);
    return this;
  }

  /**
   * Get length
   * minimum: 0
   * @return length
  */
  @NotNull @DecimalMin("0") 
  @Schema(name = "length", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("length")
  public JsonNullable<Object> getLength() {
    return length;
  }

  public void setLength(JsonNullable<Object> length) {
    this.length = length;
  }

  public AnimalDtoCreateRequest height(Object height) {
    this.height = JsonNullable.of(height);
    return this;
  }

  /**
   * Get height
   * minimum: 0
   * @return height
  */
  @NotNull @DecimalMin("0") 
  @Schema(name = "height", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("height")
  public JsonNullable<Object> getHeight() {
    return height;
  }

  public void setHeight(JsonNullable<Object> height) {
    this.height = height;
  }

  public AnimalDtoCreateRequest gender(GenderEnum gender) {
    this.gender = JsonNullable.of(gender);
    return this;
  }

  /**
   * Get gender
   * @return gender
  */
  @NotNull 
  @Schema(name = "gender", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("gender")
  public JsonNullable<GenderEnum> getGender() {
    return gender;
  }

  public void setGender(JsonNullable<GenderEnum> gender) {
    this.gender = gender;
  }

  public AnimalDtoCreateRequest chipperId(Object chipperId) {
    this.chipperId = JsonNullable.of(chipperId);
    return this;
  }

  /**
   * Get chipperId
   * minimum: 1
   * @return chipperId
  */
  @NotNull @DecimalMin("1") 
  @Schema(name = "chipperId", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("chipperId")
  public JsonNullable<Object> getChipperId() {
    return chipperId;
  }

  public void setChipperId(JsonNullable<Object> chipperId) {
    this.chipperId = chipperId;
  }

  public AnimalDtoCreateRequest chippingLocationId(Object chippingLocationId) {
    this.chippingLocationId = JsonNullable.of(chippingLocationId);
    return this;
  }

  /**
   * Get chippingLocationId
   * minimum: 1
   * @return chippingLocationId
  */
  @NotNull @DecimalMin("1") 
  @Schema(name = "chippingLocationId", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("chippingLocationId")
  public JsonNullable<Object> getChippingLocationId() {
    return chippingLocationId;
  }

  public void setChippingLocationId(JsonNullable<Object> chippingLocationId) {
    this.chippingLocationId = chippingLocationId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnimalDtoCreateRequest animalDtoCreateRequest = (AnimalDtoCreateRequest) o;
    return Objects.equals(this.animalTypes, animalDtoCreateRequest.animalTypes) &&
        Objects.equals(this.weight, animalDtoCreateRequest.weight) &&
        Objects.equals(this.length, animalDtoCreateRequest.length) &&
        Objects.equals(this.height, animalDtoCreateRequest.height) &&
        Objects.equals(this.gender, animalDtoCreateRequest.gender) &&
        Objects.equals(this.chipperId, animalDtoCreateRequest.chipperId) &&
        Objects.equals(this.chippingLocationId, animalDtoCreateRequest.chippingLocationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(animalTypes, weight, length, height, gender, chipperId, chippingLocationId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnimalDtoCreateRequest {\n");
    sb.append("    animalTypes: ").append(toIndentedString(animalTypes)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    length: ").append(toIndentedString(length)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    chipperId: ").append(toIndentedString(chipperId)).append("\n");
    sb.append("    chippingLocationId: ").append(toIndentedString(chippingLocationId)).append("\n");
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

