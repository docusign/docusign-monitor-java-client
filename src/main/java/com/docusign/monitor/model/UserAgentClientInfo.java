package com.docusign.monitor.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.monitor.model.Browser;
import com.docusign.monitor.model.Device;
import com.docusign.monitor.model.Os;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * UserAgentClientInfo.
 *
 */

public class UserAgentClientInfo implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("browser")
  private Browser browser = null;

  @JsonProperty("device")
  private Device device = null;

  @JsonProperty("os")
  private Os os = null;


  /**
   * browser.
   *
   * @return UserAgentClientInfo
   **/
  public UserAgentClientInfo browser(Browser browser) {
    this.browser = browser;
    return this;
  }

  /**
   * Get browser.
   * @return browser
   **/
  @Schema(description = "")
  public Browser getBrowser() {
    return browser;
  }

  /**
   * setBrowser.
   **/
  public void setBrowser(Browser browser) {
    this.browser = browser;
  }


  /**
   * device.
   *
   * @return UserAgentClientInfo
   **/
  public UserAgentClientInfo device(Device device) {
    this.device = device;
    return this;
  }

  /**
   * Get device.
   * @return device
   **/
  @Schema(description = "")
  public Device getDevice() {
    return device;
  }

  /**
   * setDevice.
   **/
  public void setDevice(Device device) {
    this.device = device;
  }


  /**
   * os.
   *
   * @return UserAgentClientInfo
   **/
  public UserAgentClientInfo os(Os os) {
    this.os = os;
    return this;
  }

  /**
   * Get os.
   * @return os
   **/
  @Schema(description = "")
  public Os getOs() {
    return os;
  }

  /**
   * setOs.
   **/
  public void setOs(Os os) {
    this.os = os;
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
    UserAgentClientInfo userAgentClientInfo = (UserAgentClientInfo) o;
    return Objects.equals(this.browser, userAgentClientInfo.browser) &&
        Objects.equals(this.device, userAgentClientInfo.device) &&
        Objects.equals(this.os, userAgentClientInfo.os);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(browser, device, os);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserAgentClientInfo {\n");
    
    sb.append("    browser: ").append(toIndentedString(browser)).append("\n");
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
    sb.append("    os: ").append(toIndentedString(os)).append("\n");
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

