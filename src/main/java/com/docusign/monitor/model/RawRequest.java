package com.docusign.monitor.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * RawRequest
 */

public class RawRequest {
  /**
   * Gets or Sets queryScope
   */
  public enum QueryScopeEnum {
    ACCOUNTID("AccountId"),
    
    ORGANIZATIONID("OrganizationId"),
    
    NONE("None");

    private String value;

    QueryScopeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static QueryScopeEnum fromValue(String text) {
      for (QueryScopeEnum b : QueryScopeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("queryScope")
  private QueryScopeEnum queryScope = null;

  @JsonProperty("queryScopeId")
  private java.util.UUID queryScopeId = null;

  @JsonProperty("query")
  private String query = null;

  public RawRequest queryScope(QueryScopeEnum queryScope) {
    this.queryScope = queryScope;
    return this;
  }

   /**
   * Get queryScope
   * @return queryScope
  **/
  @Schema(description = "")
  public QueryScopeEnum getQueryScope() {
    return queryScope;
  }

  public void setQueryScope(QueryScopeEnum queryScope) {
    this.queryScope = queryScope;
  }

  public RawRequest queryScopeId(java.util.UUID queryScopeId) {
    this.queryScopeId = queryScopeId;
    return this;
  }

   /**
   * Get queryScopeId
   * @return queryScopeId
  **/
  @Schema(description = "")
  public java.util.UUID getQueryScopeId() {
    return queryScopeId;
  }

  public void setQueryScopeId(java.util.UUID queryScopeId) {
    this.queryScopeId = queryScopeId;
  }

  public RawRequest query(String query) {
    this.query = query;
    return this;
  }

   /**
   * Get query
   * @return query
  **/
  @Schema(description = "")
  public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RawRequest rawRequest = (RawRequest) o;
    return Objects.equals(this.queryScope, rawRequest.queryScope) &&
        Objects.equals(this.queryScopeId, rawRequest.queryScopeId) &&
        Objects.equals(this.query, rawRequest.query);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queryScope, queryScopeId, query);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RawRequest {\n");
    
    sb.append("    queryScope: ").append(toIndentedString(queryScope)).append("\n");
    sb.append("    queryScopeId: ").append(toIndentedString(queryScopeId)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
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

