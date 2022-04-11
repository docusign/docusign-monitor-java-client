
package com.docusign.monitor.api;

import javax.ws.rs.core.GenericType;

import com.docusign.monitor.client.ApiException;
import com.docusign.monitor.client.ApiClient;
import com.docusign.monitor.client.Configuration;
import com.docusign.monitor.model.*;
import com.docusign.monitor.client.Pair;




/**
 * DataSetApi class.
 *
 **/
public class DataSetApi {
  private ApiClient apiClient;

 /**
  * DataSetApi.
  *
  **/
  public DataSetApi() {
    this(Configuration.getDefaultApiClient());
  }

 /**
  * DataSetApi.
  *
  **/
  public DataSetApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

 /**
  * getApiClient Method.
  *
  * @return ApiClient
  **/
  public ApiClient getApiClient() {
    return apiClient;
  }

 /**
  * setApiClient Method.
  *
  **/
  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /// <summary>
  ///  Allows for the streaming of data as it becomes available  Required scopes: impersonation
  /// </summary>

 /**
  * GetStreamOptions Class.
  *
  **/
  public class GetStreamOptions
  {
  private String cursor = null;
  private Integer limit = null;

 /**
  * setCursor method.
  */
  public void setCursor(String cursor) {
    this.cursor = cursor;
  }

 /**
  * getCursor method.
  *
  * @return String
  */
  public String getCursor() {
    return this.cursor;
  }

 /**
  * setLimit method.
  */
  public void setLimit(Integer limit) {
    this.limit = limit;
  }

 /**
  * getLimit method.
  *
  * @return Integer
  */
  public Integer getLimit() {
    return this.limit;
  }
  }

   /**
   * .
   * Allows for the streaming of data as it becomes available  Required scopes: impersonation
   * @param version The requested API version (required)
   * @param dataSetName The name of the dataset to stream (required)
   * @return CursoredResult
   */
  public CursoredResult getStream(String version, String dataSetName) throws ApiException {
    return getStream(version, dataSetName, null);
  }

  /**
   * .
   * Allows for the streaming of data as it becomes available  Required scopes: impersonation
   * @param version The requested API version (required)
   * @param dataSetName The name of the dataset to stream (required)
   * @param options for modifying the method behavior.
   * @return CursoredResult
   * @throws ApiException if fails to make API call
   */
  public CursoredResult getStream(String version, String dataSetName, DataSetApi.GetStreamOptions options) throws ApiException {
    Object localVarPostBody = "{}";

    // verify the required parameter 'version' is set
    if (version == null) {
      throw new ApiException(400, "Missing the required parameter 'version' when calling getStream");
    }

    // verify the required parameter 'dataSetName' is set
    if (dataSetName == null) {
      throw new ApiException(400, "Missing the required parameter 'dataSetName' when calling getStream");
    }

    // create path and map variables
    String localVarPath = "/api/v{version}/datasets/{dataSetName}/stream"
      .replaceAll("\\{" + "version" + "\\}", apiClient.escapeString(version.toString()))
      .replaceAll("\\{" + "dataSetName" + "\\}", apiClient.escapeString(dataSetName.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("cursor", options.cursor));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("limit", options.limit));
    }





    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<CursoredResult> localVarReturnType = new GenericType<CursoredResult>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * .
   * Allows for querying existing data using filter and aggregation clauses  Required scopes: impersonation
   * @param version The requested API version (required)
   * @param dataSetName The name of the dataset to query (required)
   * @param webQuery A collection of filter clauses and aggregations scoped to one or more organizations. The fields queryScope and queryScopeId may be omitted defaulting to all applicable organizations (required)
   * @return AggregateResult
   * @throws ApiException if fails to make API call
   */
  public AggregateResult postWebQuery(String version, String dataSetName, WebQuery webQuery) throws ApiException {
    Object localVarPostBody = webQuery;

    // verify the required parameter 'version' is set
    if (version == null) {
      throw new ApiException(400, "Missing the required parameter 'version' when calling postWebQuery");
    }

    // verify the required parameter 'dataSetName' is set
    if (dataSetName == null) {
      throw new ApiException(400, "Missing the required parameter 'dataSetName' when calling postWebQuery");
    }

    // verify the required parameter 'webQuery' is set
    if (webQuery == null) {
      throw new ApiException(400, "Missing the required parameter 'webQuery' when calling postWebQuery");
    }

    // create path and map variables
    String localVarPath = "/api/v{version}/datasets/{dataSetName}/web_query"
      .replaceAll("\\{" + "version" + "\\}", apiClient.escapeString(version.toString()))
      .replaceAll("\\{" + "dataSetName" + "\\}", apiClient.escapeString(dataSetName.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();







    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<AggregateResult> localVarReturnType = new GenericType<AggregateResult>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
