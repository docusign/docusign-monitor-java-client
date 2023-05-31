package com.docusign.monitor.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.monitor.model.AggregateResultResult;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * AggregateResult.
 *
 */

public class AggregateResult {
  @JsonProperty("result")
  private java.util.List<AggregateResultResult> result = null;


  /**
   * result.
   *
   * @return AggregateResult
   **/
  public AggregateResult result(java.util.List<AggregateResultResult> result) {
    this.result = result;
    return this;
  }
  
  /**
   * addResultItem.
   *
   * @return AggregateResult
   **/
  public AggregateResult addResultItem(AggregateResultResult resultItem) {
    if (this.result == null) {
      this.result = new java.util.ArrayList<>();
    }
    this.result.add(resultItem);
    return this;
  }

  /**
   * Get result.
   * @return result
   **/
  @Schema(description = "")
  public java.util.List<AggregateResultResult> getResult() {
    return result;
  }

  /**
   * setResult.
   **/
  public void setResult(java.util.List<AggregateResultResult> result) {
    this.result = result;
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
    AggregateResult aggregateResult = (AggregateResult) o;
    return Objects.equals(this.result, aggregateResult.result);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(result);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AggregateResult {\n");
    
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
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

