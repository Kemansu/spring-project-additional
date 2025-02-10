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
 * AnimalDtoUpdateRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-02-10T07:29:23.447541+03:00[Europe/Moscow]")
public class AnimalDtoUpdateRequest {

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

  /**
   * Gets or Sets lifeStatus
   */
  public enum LifeStatusEnum {
    ALIVE("ALIVE"),
    
    DEAD("DEAD");

    private Object value;

    LifeStatusEnum(Object value) {
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
    public static LifeStatusEnum fromValue(Object value) {
      for (LifeStatusEnum b : LifeStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  private JsonNullable<LifeStatusEnum> lifeStatus = JsonNullable.undefined();

  public AnimalDtoUpdateRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AnimalDtoUpdateRequest(Object weight, Object length, Object height, GenderEnum gender, Object chipperId, Object chippingLocationId, LifeStatusEnum lifeStatus) {
    this.weight = JsonNullable.of(weight);
    this.length = JsonNullable.of(length);
    this.height = JsonNullable.of(height);
    this.gender = JsonNullable.of(gender);
    this.chipperId = JsonNullable.of(chipperId);
    this.chippingLocationId = JsonNullable.of(chippingLocationId);
    this.lifeStatus = JsonNullable.of(lifeStatus);
  }

  public AnimalDtoUpdateRequest weight(Object weight) {
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

  public AnimalDtoUpdateRequest length(Object length) {
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

  public AnimalDtoUpdateRequest height(Object height) {
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

  public AnimalDtoUpdateRequest gender(GenderEnum gender) {
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

  public AnimalDtoUpdateRequest chipperId(Object chipperId) {
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

  public AnimalDtoUpdateRequest chippingLocationId(Object chippingLocationId) {
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

  public AnimalDtoUpdateRequest lifeStatus(LifeStatusEnum lifeStatus) {
    this.lifeStatus = JsonNullable.of(lifeStatus);
    return this;
  }

  /**
   * Get lifeStatus
   * @return lifeStatus
  */
  @NotNull 
  @Schema(name = "lifeStatus", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("lifeStatus")
  public JsonNullable<LifeStatusEnum> getLifeStatus() {
    return lifeStatus;
  }

  public void setLifeStatus(JsonNullable<LifeStatusEnum> lifeStatus) {
    this.lifeStatus = lifeStatus;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnimalDtoUpdateRequest animalDtoUpdateRequest = (AnimalDtoUpdateRequest) o;
    return Objects.equals(this.weight, animalDtoUpdateRequest.weight) &&
        Objects.equals(this.length, animalDtoUpdateRequest.length) &&
        Objects.equals(this.height, animalDtoUpdateRequest.height) &&
        Objects.equals(this.gender, animalDtoUpdateRequest.gender) &&
        Objects.equals(this.chipperId, animalDtoUpdateRequest.chipperId) &&
        Objects.equals(this.chippingLocationId, animalDtoUpdateRequest.chippingLocationId) &&
        Objects.equals(this.lifeStatus, animalDtoUpdateRequest.lifeStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(weight, length, height, gender, chipperId, chippingLocationId, lifeStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnimalDtoUpdateRequest {\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    length: ").append(toIndentedString(length)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    chipperId: ").append(toIndentedString(chipperId)).append("\n");
    sb.append("    chippingLocationId: ").append(toIndentedString(chippingLocationId)).append("\n");
    sb.append("    lifeStatus: ").append(toIndentedString(lifeStatus)).append("\n");
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

