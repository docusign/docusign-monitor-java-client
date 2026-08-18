package com.docusign.monitor.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * Device.
 *
 */

public class Device implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("family")
  private String family = null;

  @JsonProperty("brand")
  private String brand = null;

  @JsonProperty("model")
  private String model = null;


  /**
   * family.
   *
   * @return Device
   **/
  public Device family(String family) {
    this.family = family;
    return this;
  }

  /**
   * Get family.
   * @return family
   **/
  @Schema(description = "")
  public String getFamily() {
    return family;
  }

  /**
   * setFamily.
   **/
  public void setFamily(String family) {
    this.family = family;
  }


  /**
   * brand.
   *
   * @return Device
   **/
  public Device brand(String brand) {
    this.brand = brand;
    return this;
  }

  /**
   * Get brand.
   * @return brand
   **/
  @Schema(description = "")
  public String getBrand() {
    return brand;
  }

  /**
   * setBrand.
   **/
  public void setBrand(String brand) {
    this.brand = brand;
  }


  /**
   * model.
   *
   * @return Device
   **/
  public Device model(String model) {
    this.model = model;
    return this;
  }

  /**
   * Get model.
   * @return model
   **/
  @Schema(description = "")
  public String getModel() {
    return model;
  }

  /**
   * setModel.
   **/
  public void setModel(String model) {
    this.model = model;
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
    Device device = (Device) o;
    return Objects.equals(this.family, device.family) &&
        Objects.equals(this.brand, device.brand) &&
        Objects.equals(this.model, device.model);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(family, brand, model);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Device {\n");
    
    sb.append("    family: ").append(toIndentedString(family)).append("\n");
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
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

