package com.docusign.monitor.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * AggregateResultResult.
 *
 */

public class AggregateResultResult {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("data")
  private java.util.List<Object> data = null;


  /**
   * name.
   *
   * @return AggregateResultResult
   **/
  public AggregateResultResult name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name.
   * @return name
   **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  /**
   * setName.
   **/
  public void setName(String name) {
    this.name = name;
  }


  /**
   * data.
   *
   * @return AggregateResultResult
   **/
  public AggregateResultResult data(java.util.List<Object> data) {
    this.data = data;
    return this;
  }
  
  /**
   * addDataItem.
   *
   * @return AggregateResultResult
   **/
  public AggregateResultResult addDataItem(Object dataItem) {
    if (this.data == null) {
      this.data = new java.util.ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

  /**
   * Get data.
   * @return data
   **/
  @Schema(description = "")
  public java.util.List<Object> getData() {
    return data;
  }

  /**
   * setData.
   **/
  public void setData(java.util.List<Object> data) {
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
    AggregateResultResult aggregateResultResult = (AggregateResultResult) o;
    return Objects.equals(this.name, aggregateResultResult.name) &&
        Objects.equals(this.data, aggregateResultResult.data);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(name, data);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AggregateResultResult {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

