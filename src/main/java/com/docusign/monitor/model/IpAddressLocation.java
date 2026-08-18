package com.docusign.monitor.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * IpAddressLocation.
 *
 */

public class IpAddressLocation implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("latitude")
  private Double latitude = null;

  @JsonProperty("longitude")
  private Double longitude = null;

  @JsonProperty("country")
  private String country = null;

  @JsonProperty("state")
  private String state = null;

  @JsonProperty("city")
  private String city = null;


  /**
   * latitude.
   *
   * @return IpAddressLocation
   **/
  public IpAddressLocation latitude(Double latitude) {
    this.latitude = latitude;
    return this;
  }

  /**
   * Get latitude.
   * @return latitude
   **/
  @Schema(description = "")
  public Double getLatitude() {
    return latitude;
  }

  /**
   * setLatitude.
   **/
  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }


  /**
   * longitude.
   *
   * @return IpAddressLocation
   **/
  public IpAddressLocation longitude(Double longitude) {
    this.longitude = longitude;
    return this;
  }

  /**
   * Get longitude.
   * @return longitude
   **/
  @Schema(description = "")
  public Double getLongitude() {
    return longitude;
  }

  /**
   * setLongitude.
   **/
  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }


  /**
   * country.
   *
   * @return IpAddressLocation
   **/
  public IpAddressLocation country(String country) {
    this.country = country;
    return this;
  }

  /**
   * Get country.
   * @return country
   **/
  @Schema(description = "")
  public String getCountry() {
    return country;
  }

  /**
   * setCountry.
   **/
  public void setCountry(String country) {
    this.country = country;
  }


  /**
   * state.
   *
   * @return IpAddressLocation
   **/
  public IpAddressLocation state(String state) {
    this.state = state;
    return this;
  }

  /**
   * Get state.
   * @return state
   **/
  @Schema(description = "")
  public String getState() {
    return state;
  }

  /**
   * setState.
   **/
  public void setState(String state) {
    this.state = state;
  }


  /**
   * city.
   *
   * @return IpAddressLocation
   **/
  public IpAddressLocation city(String city) {
    this.city = city;
    return this;
  }

  /**
   * Get city.
   * @return city
   **/
  @Schema(description = "")
  public String getCity() {
    return city;
  }

  /**
   * setCity.
   **/
  public void setCity(String city) {
    this.city = city;
  }


  /**
   * Compares objects.
   *
   * @return true or false depending on comparison result.
   */
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IpAddressLocation ipAddressLocation = (IpAddressLocation) o;
    return Objects.equals(this.latitude, ipAddressLocation.latitude) &&
        Objects.equals(this.longitude, ipAddressLocation.longitude) &&
        Objects.equals(this.country, ipAddressLocation.country) &&
        Objects.equals(this.state, ipAddressLocation.state) &&
        Objects.equals(this.city, ipAddressLocation.city);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(latitude, longitude, country, state, city);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IpAddressLocation {\n");
    
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

