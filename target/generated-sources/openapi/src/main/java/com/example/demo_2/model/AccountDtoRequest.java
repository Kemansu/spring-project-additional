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
 * AccountDtoRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-02-10T07:29:23.447541+03:00[Europe/Moscow]")
public class AccountDtoRequest {

  private JsonNullable<Object> firstName = JsonNullable.undefined();

  private JsonNullable<Object> lastName = JsonNullable.undefined();

  private JsonNullable<Object> email = JsonNullable.undefined();

  private JsonNullable<Object> password = JsonNullable.undefined();

  public AccountDtoRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AccountDtoRequest(Object firstName, Object lastName, Object email, Object password) {
    this.firstName = JsonNullable.of(firstName);
    this.lastName = JsonNullable.of(lastName);
    this.email = JsonNullable.of(email);
    this.password = JsonNullable.of(password);
  }

  public AccountDtoRequest firstName(Object firstName) {
    this.firstName = JsonNullable.of(firstName);
    return this;
  }

  /**
   * Get firstName
   * @return firstName
  */
  @NotNull 
  @Schema(name = "firstName", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("firstName")
  public JsonNullable<Object> getFirstName() {
    return firstName;
  }

  public void setFirstName(JsonNullable<Object> firstName) {
    this.firstName = firstName;
  }

  public AccountDtoRequest lastName(Object lastName) {
    this.lastName = JsonNullable.of(lastName);
    return this;
  }

  /**
   * Get lastName
   * @return lastName
  */
  @NotNull 
  @Schema(name = "lastName", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("lastName")
  public JsonNullable<Object> getLastName() {
    return lastName;
  }

  public void setLastName(JsonNullable<Object> lastName) {
    this.lastName = lastName;
  }

  public AccountDtoRequest email(Object email) {
    this.email = JsonNullable.of(email);
    return this;
  }

  /**
   * Get email
   * @return email
  */
  @NotNull 
  @Schema(name = "email", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("email")
  public JsonNullable<Object> getEmail() {
    return email;
  }

  public void setEmail(JsonNullable<Object> email) {
    this.email = email;
  }

  public AccountDtoRequest password(Object password) {
    this.password = JsonNullable.of(password);
    return this;
  }

  /**
   * Get password
   * @return password
  */
  @NotNull 
  @Schema(name = "password", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("password")
  public JsonNullable<Object> getPassword() {
    return password;
  }

  public void setPassword(JsonNullable<Object> password) {
    this.password = password;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountDtoRequest accountDtoRequest = (AccountDtoRequest) o;
    return Objects.equals(this.firstName, accountDtoRequest.firstName) &&
        Objects.equals(this.lastName, accountDtoRequest.lastName) &&
        Objects.equals(this.email, accountDtoRequest.email) &&
        Objects.equals(this.password, accountDtoRequest.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, email, password);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountDtoRequest {\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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

