package com.docusign.monitor.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.monitor.model.Aggregation;
import com.docusign.monitor.model.Filter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * WebQuery
 */

public class WebQuery {
  @JsonProperty("filters")
  private java.util.List<Filter> filters = null;

  @JsonProperty("aggregations")
  private java.util.List<Aggregation> aggregations = null;

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

  public WebQuery filters(java.util.List<Filter> filters) {
    this.filters = filters;
    return this;
  }

  public WebQuery addFiltersItem(Filter filtersItem) {
    if (this.filters == null) {
      this.filters = new java.util.ArrayList<Filter>();
    }
    this.filters.add(filtersItem);
    return this;
  }

   /**
   * Get filters
   * @return filters
  **/
  @ApiModelProperty(value = "")
  public java.util.List<Filter> getFilters() {
    return filters;
  }

  public void setFilters(java.util.List<Filter> filters) {
    this.filters = filters;
  }

  public WebQuery aggregations(java.util.List<Aggregation> aggregations) {
    this.aggregations = aggregations;
    return this;
  }

  public WebQuery addAggregationsItem(Aggregation aggregationsItem) {
    if (this.aggregations == null) {
      this.aggregations = new java.util.ArrayList<Aggregation>();
    }
    this.aggregations.add(aggregationsItem);
    return this;
  }

   /**
   * Get aggregations
   * @return aggregations
  **/
  @ApiModelProperty(value = "")
  public java.util.List<Aggregation> getAggregations() {
    return aggregations;
  }

  public void setAggregations(java.util.List<Aggregation> aggregations) {
    this.aggregations = aggregations;
  }

  public WebQuery queryScope(QueryScopeEnum queryScope) {
    this.queryScope = queryScope;
    return this;
  }

   /**
   * Get queryScope
   * @return queryScope
  **/
  @ApiModelProperty(value = "")
  public QueryScopeEnum getQueryScope() {
    return queryScope;
  }

  public void setQueryScope(QueryScopeEnum queryScope) {
    this.queryScope = queryScope;
  }

  public WebQuery queryScopeId(java.util.UUID queryScopeId) {
    this.queryScopeId = queryScopeId;
    return this;
  }

   /**
   * Get queryScopeId
   * @return queryScopeId
  **/
  @ApiModelProperty(value = "")
  public java.util.UUID getQueryScopeId() {
    return queryScopeId;
  }

  public void setQueryScopeId(java.util.UUID queryScopeId) {
    this.queryScopeId = queryScopeId;
  }


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

  @Override
  public int hashCode() {
    return Objects.hash(filters, aggregations, queryScope, queryScopeId);
  }


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

