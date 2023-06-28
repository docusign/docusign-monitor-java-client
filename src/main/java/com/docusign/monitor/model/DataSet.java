package com.docusign.monitor.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Methods to fetch organization event data..
 *
 */
@Schema(description = "Methods to fetch organization event data.")

public class DataSet {
  @JsonProperty("endCursor")
  private String endCursor = null;

  @JsonProperty("data")
  private java.util.List<Object> data = null;


  /**
   * endCursor.
   *
   * @return DataSet
   **/
  public DataSet endCursor(String endCursor) {
    this.endCursor = endCursor;
    return this;
  }

  /**
   * .
   * @return endCursor
   **/
  @Schema(description = "")
  public String getEndCursor() {
    return endCursor;
  }

  /**
   * setEndCursor.
   **/
  public void setEndCursor(String endCursor) {
    this.endCursor = endCursor;
  }


  /**
   * data.
   *
   * @return DataSet
   **/
  public DataSet data(java.util.List<Object> data) {
    this.data = data;
    return this;
  }
  
  /**
   * addDataItem.
   *
   * @return DataSet
   **/
  public DataSet addDataItem(Object dataItem) {
    if (this.data == null) {
      this.data = new java.util.ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

  /**
   * .
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
    DataSet dataSet = (DataSet) o;
    return Objects.equals(this.endCursor, dataSet.endCursor) &&
        Objects.equals(this.data, dataSet.data);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(endCursor, data);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataSet {\n");
    
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

