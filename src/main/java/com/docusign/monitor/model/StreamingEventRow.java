package com.docusign.monitor.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.monitor.model.IpAddressLocation;
import com.docusign.monitor.model.UserAgentClientInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.OffsetDateTime;
import java.io.Serializable;

/**
 * StreamingEventRow.
 *
 */

public class StreamingEventRow implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("timestamp")
  private String timestamp = null;

  @JsonProperty("eventId")
  private String eventId = null;

  @JsonProperty("site")
  private String site = null;

  @JsonProperty("accountId")
  private String accountId = null;

  @JsonProperty("organizationId")
  private String organizationId = null;

  @JsonProperty("userId")
  private String userId = null;

  @JsonProperty("integratorKey")
  private String integratorKey = null;

  @JsonProperty("userAgent")
  private String userAgent = null;

  @JsonProperty("userAgentClientInfo")
  private UserAgentClientInfo userAgentClientInfo = null;

  @JsonProperty("ipAddress")
  private String ipAddress = null;

  @JsonProperty("ipAddressLocation")
  private IpAddressLocation ipAddressLocation = null;

  @JsonProperty("object")
  private String object = null;

  @JsonProperty("action")
  private String action = null;

  @JsonProperty("property")
  private String property = null;

  @JsonProperty("field")
  private String field = null;

  @JsonProperty("result")
  private String result = null;

  @JsonProperty("source")
  private String source = null;

  @JsonProperty("isUserMemberOfDomain")
  private Boolean isUserMemberOfDomain = null;

  @JsonProperty("referencedUserIsMemberOfDomain")
  private Boolean referencedUserIsMemberOfDomain = null;

  @JsonProperty("referencedUserId")
  private String referencedUserId = null;

  @JsonProperty("proxyStatus")
  private String proxyStatus = null;

  @JsonProperty("proxyType")
  private String proxyType = null;

  @JsonProperty("proxyLevel")
  private String proxyLevel = null;

  @JsonProperty("latitude")
  private Double latitude = null;

  @JsonProperty("longitude")
  private Double longitude = null;

  @JsonProperty("city")
  private String city = null;

  @JsonProperty("state")
  private String state = null;

  @JsonProperty("country")
  private String country = null;

  @JsonProperty("device")
  private String device = null;

  @JsonProperty("browser")
  private String browser = null;

  @JsonProperty("os")
  private String os = null;

  @JsonProperty("affectedUserId")
  private String affectedUserId = null;

  @JsonProperty("affectedUserIsMemberOfDomain")
  private Boolean affectedUserIsMemberOfDomain = null;

  @JsonProperty("data")
  private java.util.Map<String, Object> data = null;


  /**
   * timestamp.
   *
   * @return StreamingEventRow
   **/
  public StreamingEventRow timestamp(String timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * Get timestamp.
   * @return timestamp
   **/
  @Schema(description = "")
  public String getTimestamp() {
    return timestamp;
  }

  /**
   * setTimestamp.
   **/
  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }


  /**
   * eventId.
   *
   * @return StreamingEventRow
   **/
  public StreamingEventRow eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

  /**
   * Get eventId.
   * @return eventId
   **/
  @Schema(description = "")
  public String getEventId() {
    return eventId;
  }

  /**
   * setEventId.
   **/
  public void setEventId(String eventId) {
    this.eventId = eventId;
  }


  /**
   * site.
   *
   * @return StreamingEventRow
   **/
  public StreamingEventRow site(String site) {
    this.site = site;
    return this;
  }

  /**
   * Get site.
   * @return site
   **/
  @Schema(description = "")
  public String getSite() {
    return site;
  }

  /**
   * setSite.
   **/
  public void setSite(String site) {
    this.site = site;
  }


  /**
   * accountId.
   *
   * @return StreamingEventRow
   **/
  public StreamingEventRow accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * Get accountId.
   * @return accountId
   **/
  @Schema(description = "")
  public String getAccountId() {
    return accountId;
  }

  /**
   * setAccountId.
   **/
  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  /**
   * organizationId.
   *
   * @return StreamingEventRow
   **/
  public StreamingEventRow organizationId(String organizationId) {
    this.organizationId = organizationId;
    return this;
  }

  /**
   * Get organizationId.
   * @return organizationId
   **/
  @Schema(description = "")
  public String getOrganizationId() {
    return organizationId;
  }

  /**
   * setOrganizationId.
   **/
  public void setOrganizationId(String organizationId) {
    this.organizationId = organizationId;
  }


  /**
   * userId.
   *
   * @return StreamingEventRow
   **/
  public StreamingEventRow userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId.
   * @return userId
   **/
  @Schema(description = "")
  public String getUserId() {
    return userId;
  }

  /**
   * setUserId.
   **/
  public void setUserId(String userId) {
    this.userId = userId;
  }


  /**
   * integratorKey.
   *
   * @return StreamingEventRow
   **/
  public StreamingEventRow integratorKey(String integratorKey) {
    this.integratorKey = integratorKey;
    return this;
  }

  /**
   * Get integratorKey.
   * @return integratorKey
   **/
  @Schema(description = "")
  public String getIntegratorKey() {
    return integratorKey;
  }

  /**
   * setIntegratorKey.
   **/
  public void setIntegratorKey(String integratorKey) {
    this.integratorKey = integratorKey;
  }


  /**
   * userAgent.
   *
   * @return StreamingEventRow
   **/
  public StreamingEventRow userAgent(String userAgent) {
    this.userAgent = userAgent;
    return this;
  }

  /**
   * Get userAgent.
   * @return userAgent
   **/
  @Schema(description = "")
  public String getUserAgent() {
    return userAgent;
  }

  /**
   * setUserAgent.
   **/
  public void setUserAgent(String userAgent) {
    this.userAgent = userAgent;
  }


  /**
   * userAgentClientInfo.
   *
   * @return StreamingEventRow
   **/
  public StreamingEventRow userAgentClientInfo(UserAgentClientInfo userAgentClientInfo) {
    this.userAgentClientInfo = userAgentClientInfo;
    return this;
  }

  /**
   * Get userAgentClientInfo.
   * @return userAgentClientInfo
   **/
  @Schema(description = "")
  public UserAgentClientInfo getUserAgentClientInfo() {
    return userAgentClientInfo;
  }

  /**
   * setUserAgentClientInfo.
   **/
  public void setUserAgentClientInfo(UserAgentClientInfo userAgentClientInfo) {
    this.userAgentClientInfo = userAgentClientInfo;
  }


  /**
   * ipAddress.
   *
   * @return StreamingEventRow
   **/
  public StreamingEventRow ipAddress(String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

  /**
   * Get ipAddress.
   * @return ipAddress
   **/
  @Schema(description = "")
  public String getIpAddress() {
    return ipAddress;
  }

  /**
   * setIpAddress.
   **/
  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }


  /**
   * ipAddressLocation.
   *
   * @return StreamingEventRow
   **/
  public StreamingEventRow ipAddressLocation(IpAddressLocation ipAddressLocation) {
    this.ipAddressLocation = ipAddressLocation;
    return this;
  }

  /**
   * Get ipAddressLocation.
   * @return ipAddressLocation
   **/
  @Schema(description = "")
  public IpAddressLocation getIpAddressLocation() {
    return ipAddressLocation;
  }

  /**
   * setIpAddressLocation.
   **/
  public void setIpAddressLocation(IpAddressLocation ipAddressLocation) {
    this.ipAddressLocation = ipAddressLocation;
  }


  /**
   * object.
   *
   * @return StreamingEventRow
   **/
  public StreamingEventRow object(String object) {
    this.object = object;
    return this;
  }

  /**
   * Get object.
   * @return object
   **/
  @Schema(description = "")
  public String getObject() {
    return object;
  }

  /**
   * setObject.
   **/
  public void setObject(String object) {
    this.object = object;
  }


  /**
   * action.
   *
   * @return StreamingEventRow
   **/
  public StreamingEventRow action(String action) {
    this.action = action;
    return this;
  }

  /**
   * Get action.
   * @return action
   **/
  @Schema(description = "")
  public String getAction() {
    return action;
  }

  /**
   * setAction.
   **/
  public void setAction(String action) {
    this.action = action;
  }


  /**
   * property.
   *
   * @return StreamingEventRow
   **/
  public StreamingEventRow property(String property) {
    this.property = property;
    return this;
  }

  /**
   * Get property.
   * @return property
   **/
  @Schema(description = "")
  public String getProperty() {
    return property;
  }

  /**
   * setProperty.
   **/
  public void setProperty(String property) {
    this.property = property;
  }


  /**
   * field.
   *
   * @return StreamingEventRow
   **/
  public StreamingEventRow field(String field) {
    this.field = field;
    return this;
  }

  /**
   * Get field.
   * @return field
   **/
  @Schema(description = "")
  public String getField() {
    return field;
  }

  /**
   * setField.
   **/
  public void setField(String field) {
    this.field = field;
  }


  /**
   * result.
   *
   * @return StreamingEventRow
   **/
  public StreamingEventRow result(String result) {
    this.result = result;
    return this;
  }

  /**
   * Get result.
   * @return result
   **/
  @Schema(description = "")
  public String getResult() {
    return result;
  }

  /**
   * setResult.
   **/
  public void setResult(String result) {
    this.result = result;
  }


  /**
   * source.
   *
   * @return StreamingEventRow
   **/
  public StreamingEventRow source(String source) {
    this.source = source;
    return this;
  }

  /**
   * Get source.
   * @return source
   **/
  @Schema(description = "")
  public String getSource() {
    return source;
  }

  /**
   * setSource.
   **/
  public void setSource(String source) {
    this.source = source;
  }


  /**
   * isUserMemberOfDomain.
   *
   * @return StreamingEventRow
   **/
  public StreamingEventRow isUserMemberOfDomain(Boolean isUserMemberOfDomain) {
    this.isUserMemberOfDomain = isUserMemberOfDomain;
    return this;
  }

  /**
   * Get isUserMemberOfDomain.
   * @return isUserMemberOfDomain
   **/
  @Schema(description = "")
  public Boolean isIsUserMemberOfDomain() {
    return isUserMemberOfDomain;
  }

  /**
   * setIsUserMemberOfDomain.
   **/
  public void setIsUserMemberOfDomain(Boolean isUserMemberOfDomain) {
    this.isUserMemberOfDomain = isUserMemberOfDomain;
  }


  /**
   * referencedUserIsMemberOfDomain.
   *
   * @return StreamingEventRow
   **/
  public StreamingEventRow referencedUserIsMemberOfDomain(Boolean referencedUserIsMemberOfDomain) {
    this.referencedUserIsMemberOfDomain = referencedUserIsMemberOfDomain;
    return this;
  }

  /**
   * Get referencedUserIsMemberOfDomain.
   * @return referencedUserIsMemberOfDomain
   **/
  @Schema(description = "")
  public Boolean isReferencedUserIsMemberOfDomain() {
    return referencedUserIsMemberOfDomain;
  }

  /**
   * setReferencedUserIsMemberOfDomain.
   **/
  public void setReferencedUserIsMemberOfDomain(Boolean referencedUserIsMemberOfDomain) {
    this.referencedUserIsMemberOfDomain = referencedUserIsMemberOfDomain;
  }


  /**
   * referencedUserId.
   *
   * @return StreamingEventRow
   **/
  public StreamingEventRow referencedUserId(String referencedUserId) {
    this.referencedUserId = referencedUserId;
    return this;
  }

  /**
   * Get referencedUserId.
   * @return referencedUserId
   **/
  @Schema(description = "")
  public String getReferencedUserId() {
    return referencedUserId;
  }

  /**
   * setReferencedUserId.
   **/
  public void setReferencedUserId(String referencedUserId) {
    this.referencedUserId = referencedUserId;
  }


  /**
   * proxyStatus.
   *
   * @return StreamingEventRow
   **/
  public StreamingEventRow proxyStatus(String proxyStatus) {
    this.proxyStatus = proxyStatus;
    return this;
  }

  /**
   * Get proxyStatus.
   * @return proxyStatus
   **/
  @Schema(description = "")
  public String getProxyStatus() {
    return proxyStatus;
  }

  /**
   * setProxyStatus.
   **/
  public void setProxyStatus(String proxyStatus) {
    this.proxyStatus = proxyStatus;
  }


  /**
   * proxyType.
   *
   * @return StreamingEventRow
   **/
  public StreamingEventRow proxyType(String proxyType) {
    this.proxyType = proxyType;
    return this;
  }

  /**
   * Get proxyType.
   * @return proxyType
   **/
  @Schema(description = "")
  public String getProxyType() {
    return proxyType;
  }

  /**
   * setProxyType.
   **/
  public void setProxyType(String proxyType) {
    this.proxyType = proxyType;
  }


  /**
   * proxyLevel.
   *
   * @return StreamingEventRow
   **/
  public StreamingEventRow proxyLevel(String proxyLevel) {
    this.proxyLevel = proxyLevel;
    return this;
  }

  /**
   * Get proxyLevel.
   * @return proxyLevel
   **/
  @Schema(description = "")
  public String getProxyLevel() {
    return proxyLevel;
  }

  /**
   * setProxyLevel.
   **/
  public void setProxyLevel(String proxyLevel) {
    this.proxyLevel = proxyLevel;
  }


  /**
   * latitude.
   *
   * @return StreamingEventRow
   **/
  public StreamingEventRow latitude(Double latitude) {
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
   * @return StreamingEventRow
   **/
  public StreamingEventRow longitude(Double longitude) {
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
   * city.
   *
   * @return StreamingEventRow
   **/
  public StreamingEventRow city(String city) {
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
   * state.
   *
   * @return StreamingEventRow
   **/
  public StreamingEventRow state(String state) {
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
   * country.
   *
   * @return StreamingEventRow
   **/
  public StreamingEventRow country(String country) {
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
   * device.
   *
   * @return StreamingEventRow
   **/
  public StreamingEventRow device(String device) {
    this.device = device;
    return this;
  }

  /**
   * Get device.
   * @return device
   **/
  @Schema(description = "")
  public String getDevice() {
    return device;
  }

  /**
   * setDevice.
   **/
  public void setDevice(String device) {
    this.device = device;
  }


  /**
   * browser.
   *
   * @return StreamingEventRow
   **/
  public StreamingEventRow browser(String browser) {
    this.browser = browser;
    return this;
  }

  /**
   * Get browser.
   * @return browser
   **/
  @Schema(description = "")
  public String getBrowser() {
    return browser;
  }

  /**
   * setBrowser.
   **/
  public void setBrowser(String browser) {
    this.browser = browser;
  }


  /**
   * os.
   *
   * @return StreamingEventRow
   **/
  public StreamingEventRow os(String os) {
    this.os = os;
    return this;
  }

  /**
   * Get os.
   * @return os
   **/
  @Schema(description = "")
  public String getOs() {
    return os;
  }

  /**
   * setOs.
   **/
  public void setOs(String os) {
    this.os = os;
  }


  /**
   * affectedUserId.
   *
   * @return StreamingEventRow
   **/
  public StreamingEventRow affectedUserId(String affectedUserId) {
    this.affectedUserId = affectedUserId;
    return this;
  }

  /**
   * Get affectedUserId.
   * @return affectedUserId
   **/
  @Schema(description = "")
  public String getAffectedUserId() {
    return affectedUserId;
  }

  /**
   * setAffectedUserId.
   **/
  public void setAffectedUserId(String affectedUserId) {
    this.affectedUserId = affectedUserId;
  }


  /**
   * affectedUserIsMemberOfDomain.
   *
   * @return StreamingEventRow
   **/
  public StreamingEventRow affectedUserIsMemberOfDomain(Boolean affectedUserIsMemberOfDomain) {
    this.affectedUserIsMemberOfDomain = affectedUserIsMemberOfDomain;
    return this;
  }

  /**
   * Get affectedUserIsMemberOfDomain.
   * @return affectedUserIsMemberOfDomain
   **/
  @Schema(description = "")
  public Boolean isAffectedUserIsMemberOfDomain() {
    return affectedUserIsMemberOfDomain;
  }

  /**
   * setAffectedUserIsMemberOfDomain.
   **/
  public void setAffectedUserIsMemberOfDomain(Boolean affectedUserIsMemberOfDomain) {
    this.affectedUserIsMemberOfDomain = affectedUserIsMemberOfDomain;
  }


  /**
   * data.
   *
   * @return StreamingEventRow
   **/
  public StreamingEventRow data(java.util.Map<String, Object> data) {
    this.data = data;
    return this;
  }

  /**
   * putDataItem.
   *
   * @return StreamingEventRow
   **/
  public StreamingEventRow putDataItem(String key, Object dataItem) {
    if (this.data == null) {
      this.data = new java.util.HashMap<>();
    }
    this.data.put(key, dataItem);
    return this;
  }

  /**
   * Get data.
   * @return data
   **/
  @Schema(description = "")
  public java.util.Map<String, Object> getData() {
    return data;
  }

  /**
   * setData.
   **/
  public void setData(java.util.Map<String, Object> data) {
    this.data = data;
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
    StreamingEventRow streamingEventRow = (StreamingEventRow) o;
    return Objects.equals(this.timestamp, streamingEventRow.timestamp) &&
        Objects.equals(this.eventId, streamingEventRow.eventId) &&
        Objects.equals(this.site, streamingEventRow.site) &&
        Objects.equals(this.accountId, streamingEventRow.accountId) &&
        Objects.equals(this.organizationId, streamingEventRow.organizationId) &&
        Objects.equals(this.userId, streamingEventRow.userId) &&
        Objects.equals(this.integratorKey, streamingEventRow.integratorKey) &&
        Objects.equals(this.userAgent, streamingEventRow.userAgent) &&
        Objects.equals(this.userAgentClientInfo, streamingEventRow.userAgentClientInfo) &&
        Objects.equals(this.ipAddress, streamingEventRow.ipAddress) &&
        Objects.equals(this.ipAddressLocation, streamingEventRow.ipAddressLocation) &&
        Objects.equals(this.object, streamingEventRow.object) &&
        Objects.equals(this.action, streamingEventRow.action) &&
        Objects.equals(this.property, streamingEventRow.property) &&
        Objects.equals(this.field, streamingEventRow.field) &&
        Objects.equals(this.result, streamingEventRow.result) &&
        Objects.equals(this.source, streamingEventRow.source) &&
        Objects.equals(this.isUserMemberOfDomain, streamingEventRow.isUserMemberOfDomain) &&
        Objects.equals(this.referencedUserIsMemberOfDomain, streamingEventRow.referencedUserIsMemberOfDomain) &&
        Objects.equals(this.referencedUserId, streamingEventRow.referencedUserId) &&
        Objects.equals(this.proxyStatus, streamingEventRow.proxyStatus) &&
        Objects.equals(this.proxyType, streamingEventRow.proxyType) &&
        Objects.equals(this.proxyLevel, streamingEventRow.proxyLevel) &&
        Objects.equals(this.latitude, streamingEventRow.latitude) &&
        Objects.equals(this.longitude, streamingEventRow.longitude) &&
        Objects.equals(this.city, streamingEventRow.city) &&
        Objects.equals(this.state, streamingEventRow.state) &&
        Objects.equals(this.country, streamingEventRow.country) &&
        Objects.equals(this.device, streamingEventRow.device) &&
        Objects.equals(this.browser, streamingEventRow.browser) &&
        Objects.equals(this.os, streamingEventRow.os) &&
        Objects.equals(this.affectedUserId, streamingEventRow.affectedUserId) &&
        Objects.equals(this.affectedUserIsMemberOfDomain, streamingEventRow.affectedUserIsMemberOfDomain) &&
        Objects.equals(this.data, streamingEventRow.data);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(timestamp, eventId, site, accountId, organizationId, userId, integratorKey, userAgent, userAgentClientInfo, ipAddress, ipAddressLocation, object, action, property, field, result, source, isUserMemberOfDomain, referencedUserIsMemberOfDomain, referencedUserId, proxyStatus, proxyType, proxyLevel, latitude, longitude, city, state, country, device, browser, os, affectedUserId, affectedUserIsMemberOfDomain, data);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StreamingEventRow {\n");
    
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    site: ").append(toIndentedString(site)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    integratorKey: ").append(toIndentedString(integratorKey)).append("\n");
    sb.append("    userAgent: ").append(toIndentedString(userAgent)).append("\n");
    sb.append("    userAgentClientInfo: ").append(toIndentedString(userAgentClientInfo)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    ipAddressLocation: ").append(toIndentedString(ipAddressLocation)).append("\n");
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    property: ").append(toIndentedString(property)).append("\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    isUserMemberOfDomain: ").append(toIndentedString(isUserMemberOfDomain)).append("\n");
    sb.append("    referencedUserIsMemberOfDomain: ").append(toIndentedString(referencedUserIsMemberOfDomain)).append("\n");
    sb.append("    referencedUserId: ").append(toIndentedString(referencedUserId)).append("\n");
    sb.append("    proxyStatus: ").append(toIndentedString(proxyStatus)).append("\n");
    sb.append("    proxyType: ").append(toIndentedString(proxyType)).append("\n");
    sb.append("    proxyLevel: ").append(toIndentedString(proxyLevel)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
    sb.append("    browser: ").append(toIndentedString(browser)).append("\n");
    sb.append("    os: ").append(toIndentedString(os)).append("\n");
    sb.append("    affectedUserId: ").append(toIndentedString(affectedUserId)).append("\n");
    sb.append("    affectedUserIsMemberOfDomain: ").append(toIndentedString(affectedUserIsMemberOfDomain)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

