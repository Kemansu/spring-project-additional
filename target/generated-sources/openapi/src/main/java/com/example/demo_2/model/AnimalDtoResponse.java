package com.example.demo_2.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
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
 * AnimalDtoResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-02-10T07:29:23.447541+03:00[Europe/Moscow]")
public class AnimalDtoResponse {

  private JsonNullable<Object> id = JsonNullable.undefined();

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

  private JsonNullable<Object> chippingDateTime = JsonNullable.undefined();

  private JsonNullable<Object> chipperId = JsonNullable.undefined();

  private JsonNullable<Object> chippingLocationId = JsonNullable.undefined();

  private JsonNullable<Object> visitedLocations = JsonNullable.undefined();

  private JsonNullable<Object> deathDateTime = JsonNullable.undefined();

  public AnimalDtoResponse id(Object id) {
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

  public AnimalDtoResponse animalTypes(Object animalTypes) {
    this.animalTypes = JsonNullable.of(animalTypes);
    return this;
  }

  /**
   * Get animalTypes
   * @return animalTypes
  */
  
  @Schema(name = "animalTypes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("animalTypes")
  public JsonNullable<Object> getAnimalTypes() {
    return animalTypes;
  }

  public void setAnimalTypes(JsonNullable<Object> animalTypes) {
    this.animalTypes = animalTypes;
  }

  public AnimalDtoResponse weight(Object weight) {
    this.weight = JsonNullable.of(weight);
    return this;
  }

  /**
   * Get weight
   * @return weight
  */
  
  @Schema(name = "weight", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("weight")
  public JsonNullable<Object> getWeight() {
    return weight;
  }

  public void setWeight(JsonNullable<Object> weight) {
    this.weight = weight;
  }

  public AnimalDtoResponse length(Object length) {
    this.length = JsonNullable.of(length);
    return this;
  }

  /**
   * Get length
   * @return length
  */
  
  @Schema(name = "length", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("length")
  public JsonNullable<Object> getLength() {
    return length;
  }

  public void setLength(JsonNullable<Object> length) {
    this.length = length;
  }

  public AnimalDtoResponse height(Object height) {
    this.height = JsonNullable.of(height);
    return this;
  }

  /**
   * Get height
   * @return height
  */
  
  @Schema(name = "height", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("height")
  public JsonNullable<Object> getHeight() {
    return height;
  }

  public void setHeight(JsonNullable<Object> height) {
    this.height = height;
  }

  public AnimalDtoResponse gender(GenderEnum gender) {
    this.gender = JsonNullable.of(gender);
    return this;
  }

  /**
   * Get gender
   * @return gender
  */
  
  @Schema(name = "gender", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("gender")
  public JsonNullable<GenderEnum> getGender() {
    return gender;
  }

  public void setGender(JsonNullable<GenderEnum> gender) {
    this.gender = gender;
  }

  public AnimalDtoResponse lifeStatus(LifeStatusEnum lifeStatus) {
    this.lifeStatus = JsonNullable.of(lifeStatus);
    return this;
  }

  /**
   * Get lifeStatus
   * @return lifeStatus
  */
  
  @Schema(name = "lifeStatus", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lifeStatus")
  public JsonNullable<LifeStatusEnum> getLifeStatus() {
    return lifeStatus;
  }

  public void setLifeStatus(JsonNullable<LifeStatusEnum> lifeStatus) {
    this.lifeStatus = lifeStatus;
  }

  public AnimalDtoResponse chippingDateTime(Object chippingDateTime) {
    this.chippingDateTime = JsonNullable.of(chippingDateTime);
    return this;
  }

  /**
   * Get chippingDateTime
   * @return chippingDateTime
  */
  
  @Schema(name = "chippingDateTime", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("chippingDateTime")
  public JsonNullable<Object> getChippingDateTime() {
    return chippingDateTime;
  }

  public void setChippingDateTime(JsonNullable<Object> chippingDateTime) {
    this.chippingDateTime = chippingDateTime;
  }

  public AnimalDtoResponse chipperId(Object chipperId) {
    this.chipperId = JsonNullable.of(chipperId);
    return this;
  }

  /**
   * Get chipperId
   * @return chipperId
  */
  
  @Schema(name = "chipperId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("chipperId")
  public JsonNullable<Object> getChipperId() {
    return chipperId;
  }

  public void setChipperId(JsonNullable<Object> chipperId) {
    this.chipperId = chipperId;
  }

  public AnimalDtoResponse chippingLocationId(Object chippingLocationId) {
    this.chippingLocationId = JsonNullable.of(chippingLocationId);
    return this;
  }

  /**
   * Get chippingLocationId
   * @return chippingLocationId
  */
  
  @Schema(name = "chippingLocationId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("chippingLocationId")
  public JsonNullable<Object> getChippingLocationId() {
    return chippingLocationId;
  }

  public void setChippingLocationId(JsonNullable<Object> chippingLocationId) {
    this.chippingLocationId = chippingLocationId;
  }

  public AnimalDtoResponse visitedLocations(Object visitedLocations) {
    this.visitedLocations = JsonNullable.of(visitedLocations);
    return this;
  }

  /**
   * Get visitedLocations
   * @return visitedLocations
  */
  
  @Schema(name = "visitedLocations", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("visitedLocations")
  public JsonNullable<Object> getVisitedLocations() {
    return visitedLocations;
  }

  public void setVisitedLocations(JsonNullable<Object> visitedLocations) {
    this.visitedLocations = visitedLocations;
  }

  public AnimalDtoResponse deathDateTime(Object deathDateTime) {
    this.deathDateTime = JsonNullable.of(deathDateTime);
    return this;
  }

  /**
   * Get deathDateTime
   * @return deathDateTime
  */
  
  @Schema(name = "deathDateTime", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deathDateTime")
  public JsonNullable<Object> getDeathDateTime() {
    return deathDateTime;
  }

  public void setDeathDateTime(JsonNullable<Object> deathDateTime) {
    this.deathDateTime = deathDateTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnimalDtoResponse animalDtoResponse = (AnimalDtoResponse) o;
    return equalsNullable(this.id, animalDtoResponse.id) &&
        equalsNullable(this.animalTypes, animalDtoResponse.animalTypes) &&
        equalsNullable(this.weight, animalDtoResponse.weight) &&
        equalsNullable(this.length, animalDtoResponse.length) &&
        equalsNullable(this.height, animalDtoResponse.height) &&
        equalsNullable(this.gender, animalDtoResponse.gender) &&
        equalsNullable(this.lifeStatus, animalDtoResponse.lifeStatus) &&
        equalsNullable(this.chippingDateTime, animalDtoResponse.chippingDateTime) &&
        equalsNullable(this.chipperId, animalDtoResponse.chipperId) &&
        equalsNullable(this.chippingLocationId, animalDtoResponse.chippingLocationId) &&
        equalsNullable(this.visitedLocations, animalDtoResponse.visitedLocations) &&
        equalsNullable(this.deathDateTime, animalDtoResponse.deathDateTime);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(id), hashCodeNullable(animalTypes), hashCodeNullable(weight), hashCodeNullable(length), hashCodeNullable(height), hashCodeNullable(gender), hashCodeNullable(lifeStatus), hashCodeNullable(chippingDateTime), hashCodeNullable(chipperId), hashCodeNullable(chippingLocationId), hashCodeNullable(visitedLocations), hashCodeNullable(deathDateTime));
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
    sb.append("class AnimalDtoResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    animalTypes: ").append(toIndentedString(animalTypes)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    length: ").append(toIndentedString(length)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    lifeStatus: ").append(toIndentedString(lifeStatus)).append("\n");
    sb.append("    chippingDateTime: ").append(toIndentedString(chippingDateTime)).append("\n");
    sb.append("    chipperId: ").append(toIndentedString(chipperId)).append("\n");
    sb.append("    chippingLocationId: ").append(toIndentedString(chippingLocationId)).append("\n");
    sb.append("    visitedLocations: ").append(toIndentedString(visitedLocations)).append("\n");
    sb.append("    deathDateTime: ").append(toIndentedString(deathDateTime)).append("\n");
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

