package com.docusign.monitor.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * Version.
 *
 */

public class Version implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("major")
  private String major = null;

  @JsonProperty("minor")
  private String minor = null;

  @JsonProperty("patch")
  private String patch = null;


  /**
   * major.
   *
   * @return Version
   **/
  public Version major(String major) {
    this.major = major;
    return this;
  }

  /**
   * Get major.
   * @return major
   **/
  @Schema(description = "")
  public String getMajor() {
    return major;
  }

  /**
   * setMajor.
   **/
  public void setMajor(String major) {
    this.major = major;
  }


  /**
   * minor.
   *
   * @return Version
   **/
  public Version minor(String minor) {
    this.minor = minor;
    return this;
  }

  /**
   * Get minor.
   * @return minor
   **/
  @Schema(description = "")
  public String getMinor() {
    return minor;
  }

  /**
   * setMinor.
   **/
  public void setMinor(String minor) {
    this.minor = minor;
  }


  /**
   * patch.
   *
   * @return Version
   **/
  public Version patch(String patch) {
    this.patch = patch;
    return this;
  }

  /**
   * Get patch.
   * @return patch
   **/
  @Schema(description = "")
  public String getPatch() {
    return patch;
  }

  /**
   * setPatch.
   **/
  public void setPatch(String patch) {
    this.patch = patch;
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
    Version version = (Version) o;
    return Objects.equals(this.major, version.major) &&
        Objects.equals(this.minor, version.minor) &&
        Objects.equals(this.patch, version.patch);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(major, minor, patch);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Version {\n");
    
    sb.append("    major: ").append(toIndentedString(major)).append("\n");
    sb.append("    minor: ").append(toIndentedString(minor)).append("\n");
    sb.append("    patch: ").append(toIndentedString(patch)).append("\n");
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

