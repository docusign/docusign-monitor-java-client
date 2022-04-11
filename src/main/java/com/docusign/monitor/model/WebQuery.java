package com.docusign.monitor.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * WebQuery.
 *
 */

public class WebQuery {
  @JsonProperty("filters")
  private java.util.List<Object> filters = null;

  @JsonProperty("aggregations")
  private java.util.List<Object> aggregations = null;

  /**
   * Gets or Sets queryScope
   */
  public enum QueryScopeEnum {
    ORGANIZATIONID("OrganizationId");

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
    public static QueryScopeEnum fromValue(String value) {
      for (QueryScopeEnum b : QueryScopeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("queryScope")
  private QueryScopeEnum queryScope = null;

  @JsonProperty("queryScopeId")
  private String queryScopeId = null;


  /**
   * filters.
   *
   * @return WebQuery
   **/
  public WebQuery filters(java.util.List<Object> filters) {
    this.filters = filters;
    return this;
  }
  
  /**
   * addFiltersItem.
   *
   * @return WebQuery
   **/
  public WebQuery addFiltersItem(Object filtersItem) {
    if (this.filters == null) {
      this.filters = new java.util.ArrayList<Object>();
    }
    this.filters.add(filtersItem);
    return this;
  }

  /**
   * Get filters.
   * @return filters
   **/
  @ApiModelProperty(value = "")
  public java.util.List<Object> getFilters() {
    return filters;
  }

  /**
   * setFilters.
   **/
  public void setFilters(java.util.List<Object> filters) {
    this.filters = filters;
  }


  /**
   * aggregations.
   *
   * @return WebQuery
   **/
  public WebQuery aggregations(java.util.List<Object> aggregations) {
    this.aggregations = aggregations;
    return this;
  }
  
  /**
   * addAggregationsItem.
   *
   * @return WebQuery
   **/
  public WebQuery addAggregationsItem(Object aggregationsItem) {
    if (this.aggregations == null) {
      this.aggregations = new java.util.ArrayList<Object>();
    }
    this.aggregations.add(aggregationsItem);
    return this;
  }

  /**
   * Get aggregations.
   * @return aggregations
   **/
  @ApiModelProperty(value = "")
  public java.util.List<Object> getAggregations() {
    return aggregations;
  }

  /**
   * setAggregations.
   **/
  public void setAggregations(java.util.List<Object> aggregations) {
    this.aggregations = aggregations;
  }


  /**
   * queryScope.
   *
   * @return WebQuery
   **/
  public WebQuery queryScope(QueryScopeEnum queryScope) {
    this.queryScope = queryScope;
    return this;
  }

  /**
   * Get queryScope.
   * @return queryScope
   **/
  @ApiModelProperty(value = "")
  public QueryScopeEnum getQueryScope() {
    return queryScope;
  }

  /**
   * setQueryScope.
   **/
  public void setQueryScope(QueryScopeEnum queryScope) {
    this.queryScope = queryScope;
  }


  /**
   * queryScopeId.
   *
   * @return WebQuery
   **/
  public WebQuery queryScopeId(String queryScopeId) {
    this.queryScopeId = queryScopeId;
    return this;
  }

  /**
   * Get queryScopeId.
   * @return queryScopeId
   **/
  @ApiModelProperty(value = "")
  public String getQueryScopeId() {
    return queryScopeId;
  }

  /**
   * setQueryScopeId.
   **/
  public void setQueryScopeId(String queryScopeId) {
    this.queryScopeId = queryScopeId;
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
    WebQuery webQuery = (WebQuery) o;
    return Objects.equals(this.filters, webQuery.filters) &&
        Objects.equals(this.aggregations, webQuery.aggregations) &&
        Objects.equals(this.queryScope, webQuery.queryScope) &&
        Objects.equals(this.queryScopeId, webQuery.queryScopeId);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(filters, aggregations, queryScope, queryScopeId);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebQuery {\n");
    
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    aggregations: ").append(toIndentedString(aggregations)).append("\n");
    sb.append("    queryScope: ").append(toIndentedString(queryScope)).append("\n");
    sb.append("    queryScopeId: ").append(toIndentedString(queryScopeId)).append("\n");
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

