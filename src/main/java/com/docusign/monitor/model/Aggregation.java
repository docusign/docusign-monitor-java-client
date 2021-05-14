package com.docusign.monitor.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Aggregation
 */

public class Aggregation {
  @JsonProperty("aggregationName")
  private String aggregationName = null;

   /**
   * Get aggregationName
   * @return aggregationName
  **/
  @ApiModelProperty(value = "")
  public String getAggregationName() {
    return aggregationName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Aggregation aggregation = (Aggregation) o;
    return Objects.equals(this.aggregationName, aggregation.aggregationName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aggregationName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Aggregation {\n");
    
    sb.append("    aggregationName: ").append(toIndentedString(aggregationName)).append("\n");
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

