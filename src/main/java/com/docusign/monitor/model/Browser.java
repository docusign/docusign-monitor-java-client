package com.docusign.monitor.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.monitor.model.Version;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * Browser.
 *
 */

public class Browser implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("family")
  private String family = null;

  @JsonProperty("version")
  private Version version = null;


  /**
   * family.
   *
   * @return Browser
   **/
  public Browser family(String family) {
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
   * version.
   *
   * @return Browser
   **/
  public Browser version(Version version) {
    this.version = version;
    return this;
  }

  /**
   * Get version.
   * @return version
   **/
  @Schema(description = "")
  public Version getVersion() {
    return version;
  }

  /**
   * setVersion.
   **/
  public void setVersion(Version version) {
    this.version = version;
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
    Browser browser = (Browser) o;
    return Objects.equals(this.family, browser.family) &&
        Objects.equals(this.version, browser.version);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(family, version);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Browser {\n");
    
    sb.append("    family: ").append(toIndentedString(family)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

