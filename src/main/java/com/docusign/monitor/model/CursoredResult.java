package com.docusign.monitor.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * CursoredResult
 */

public class CursoredResult {
  @JsonProperty("endCursor")
  private String endCursor = null;

  @JsonProperty("data")
  private java.util.List<Object> data = null;

  public CursoredResult endCursor(String endCursor) {
    this.endCursor = endCursor;
    return this;
  }

   /**
   * Get endCursor
   * @return endCursor
  **/
  @ApiModelProperty(value = "")
  public String getEndCursor() {
    return endCursor;
  }

  public void setEndCursor(String endCursor) {
    this.endCursor = endCursor;
  }

  public CursoredResult data(java.util.List<Object> data) {
    this.data = data;
    return this;
  }

  public CursoredResult addDataItem(Object dataItem) {
    if (this.data == null) {
      this.data = new java.util.ArrayList<Object>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(value = "")
  public java.util.List<Object> getData() {
    return data;
  }

  public void setData(java.util.List<Object> data) {
    this.data = data;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CursoredResult cursoredResult = (CursoredResult) o;
    return Objects.equals(this.endCursor, cursoredResult.endCursor) &&
        Objects.equals(this.data, cursoredResult.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endCursor, data);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CursoredResult {\n");
    
    sb.append("    endCursor: ").append(toIndentedString(endCursor)).append("\n");
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

