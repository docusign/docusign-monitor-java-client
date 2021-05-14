
package com.docusign.monitor.api;

import javax.ws.rs.core.GenericType;

import com.docusign.monitor.client.ApiException;
import com.docusign.monitor.client.ApiClient;
import com.docusign.monitor.client.Configuration;
import com.docusign.monitor.model.*;
import com.docusign.monitor.client.Pair;



public class DataSetApi {
  private ApiClient apiClient;

  public DataSetApi() {
    this(Configuration.getDefaultApiClient());
  }

  public DataSetApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /// <summary>
  ///  Allows for the streaming of data as it becomes available  Required scopes: impersonation
  /// </summary>
  public class GetStreamOptions
  {
  private String cursor = null;
  private Integer limit = null;
  /*
   * The cursor value to continue querying the data with. For an intial call, use empty string 
   */
  public void setCursor(String cursor) {
    this.cursor = cursor;
  }

  public String getCursor() {
    return this.cursor;
  }
  /*
   * The maximum number of records to return, minimum of 1, maximum of 2000. Defaults to 1000 if no value is provided 
   */
  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  public Integer getLimit() {
    return this.limit;
  }
  }

   /**
   * 
   * Allows for the streaming of data as it becomes available  Required scopes: impersonation
   * @param version The requested API version (required)
   * @param dataSetName The name of the dataset to stream (required)
   * @return CursoredResult
   */ 
  public CursoredResult getStream(String version, String dataSetName) throws ApiException {
    return getStream(version, dataSetName, null);
  }

  /**
   * 
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
}
