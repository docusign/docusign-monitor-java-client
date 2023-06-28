
package com.docusign.monitor.api;

import jakarta.ws.rs.core.GenericType;

import com.docusign.monitor.client.ApiException;
import com.docusign.monitor.client.ApiClient;
import com.docusign.monitor.client.Configuration;
import com.docusign.monitor.model.*;
import com.docusign.monitor.client.Pair;
import com.docusign.monitor.client.ApiResponse;




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
  /// Gets customer event data for an organization. Gets customer event data for the organization that owns the integration key.  The results for this endpoint are paginated by event timestamp. Use the &#x60;cursor&#x60; parameter to specify where the query begins in the dataset. Use the &#x60;limit&#x60; parameter to set the number of records returned. 
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
   * Gets customer event data for an organization..
   * Gets customer event data for the organization that owns the integration key.  The results for this endpoint are paginated by event timestamp. Use the &#x60;cursor&#x60; parameter to specify where the query begins in the dataset. Use the &#x60;limit&#x60; parameter to set the number of records returned. 
   * @param version Must be &#x60;2&#x60;.  (required)
   * @param dataSetName Must be &#x60;monitor&#x60;. (required)
   * @return CursoredResult
   */ 
  public CursoredResult getStream(String version, String dataSetName) throws ApiException {
    return getStream(version, dataSetName, null);
  }

  /**
   * Gets customer event data for an organization..
   * Gets customer event data for the organization that owns the integration key.  The results for this endpoint are paginated by event timestamp. Use the &#x60;cursor&#x60; parameter to specify where the query begins in the dataset. Use the &#x60;limit&#x60; parameter to set the number of records returned. 
   * @param version Must be &#x60;2&#x60;.  (required)
   * @param dataSetName Must be &#x60;monitor&#x60;. (required)
   * @param options for modifying the method behavior.
   * @return CursoredResult
   * @throws ApiException if fails to make API call
   */
  public CursoredResult getStream(String version, String dataSetName, DataSetApi.GetStreamOptions options) throws ApiException {
    ApiResponse<CursoredResult> localVarResponse = getStreamWithHttpInfo(version, dataSetName, options);
    return localVarResponse.getData();
  }

  /**
   * Gets customer event data for an organization.
   * Gets customer event data for the organization that owns the integration key.  The results for this endpoint are paginated by event timestamp. Use the &#x60;cursor&#x60; parameter to specify where the query begins in the dataset. Use the &#x60;limit&#x60; parameter to set the number of records returned. 
   * @param version Must be &#x60;2&#x60;.  (required)
   * @param dataSetName Must be &#x60;monitor&#x60;. (required)
   * @param options for modifying the method behavior.
   * @return CursoredResult
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CursoredResult > getStreamWithHttpInfo(String version, String dataSetName, DataSetApi.GetStreamOptions options) throws ApiException {
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

    String[] localVarAuthNames = new String[] {  };
    
    GenericType<CursoredResult> localVarReturnType = new GenericType<CursoredResult>() {};
    CursoredResult localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<CursoredResult>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
}
