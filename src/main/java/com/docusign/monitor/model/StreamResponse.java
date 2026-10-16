package com.docusign.monitor.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.monitor.model.StreamingEventRow;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * StreamResponse.
 *
 */

public class StreamResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("resultData")
  private java.util.List<StreamingEventRow> resultData = null;

  @JsonProperty("endCursor")
  private String endCursor = null;


  /**
   * resultData.
   *
   * @return StreamResponse
   **/
  public StreamResponse resultData(java.util.List<StreamingEventRow> resultData) {
    this.resultData = resultData;
    return this;
  }
  
  /**
   * addResultDataItem.
   *
   * @return StreamResponse
   **/
  public StreamResponse addResultDataItem(StreamingEventRow resultDataItem) {
    if (this.resultData == null) {
      this.resultData = new java.util.ArrayList<>();
    }
    this.resultData.add(resultDataItem);
    return this;
  }

  /**
   * Get resultData.
   * @return resultData
   **/
  @Schema(description = "")
  public java.util.List<StreamingEventRow> getResultData() {
    return resultData;
  }

  /**
   * setResultData.
   **/
  public void setResultData(java.util.List<StreamingEventRow> resultData) {
    this.resultData = resultData;
  }


  /**
   * endCursor.
   *
   * @return StreamResponse
   **/
  public StreamResponse endCursor(String endCursor) {
    this.endCursor = endCursor;
    return this;
  }

  /**
   * Get endCursor.
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
    StreamResponse streamResponse = (StreamResponse) o;
    return Objects.equals(this.resultData, streamResponse.resultData) &&
        Objects.equals(this.endCursor, streamResponse.endCursor);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(resultData, endCursor);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StreamResponse {\n");
    
    sb.append("    resultData: ").append(toIndentedString(resultData)).append("\n");
    sb.append("    endCursor: ").append(toIndentedString(endCursor)).append("\n");
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

