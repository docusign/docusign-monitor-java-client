
package com.docusign.monitor.api;

import jakarta.ws.rs.core.GenericType;

import com.docusign.monitor.client.ApiException;
import com.docusign.monitor.client.ApiClient;
import com.docusign.monitor.client.Configuration;
import com.docusign.monitor.model.*;
import com.docusign.monitor.client.Pair;
import com.docusign.monitor.client.ApiResponse;




/**
 * DocuMonitorApi class.
 *
 **/
public class DocuMonitorApi {
  private ApiClient apiClient;

 /**
  * DocuMonitorApi.
  *
  **/
  public DocuMonitorApi() {
    this(Configuration.getDefaultApiClient());
  }

 /**
  * DocuMonitorApi.
  *
  **/
  public DocuMonitorApi(ApiClient apiClient) {
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
  /// Gets customer event data for an organization. Gets customer event data for the organization that owns the integration key.  The results for this endpoint are paginated by their event ingestion time, which can be up to five minutes after the event originally occurred. Use the &#x60;cursor&#x60; parameter to specify where the query begins in the dataset. Use the &#x60;limit&#x60; parameter to set the number of records returned.  For a detailed example of how to use &#x60;getStream&#x60; and retrieve monitoring data, see our guides [How to get monitoring data](/docs/monitor-api/how-to/get-monitoring-data/) and  [Tracking data and handling alerts](/docs/monitor-api/monitor101/tracking-data-handling-alerts/).  **Note**: data is not guaranteed to be in the order of the timestamp of the events. It is returned in the order it was inserted into our database.  ### Related topics  - [How to get monitoring data](/docs/monitor-api/how-to/get-monitoring-data/) - [Tracking data and handling alerts](/docs/monitor-api/monitor101/tracking-data-handling-alerts/)
  /// </summary>

 /**
  * StreamOptions Class.
  *
  **/
  public class StreamOptions
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
   * Gets customer event data for the organization that owns the integration key.  The results for this endpoint are paginated by their event ingestion time, which can be up to five minutes after the event originally occurred. Use the &#x60;cursor&#x60; parameter to specify where the query begins in the dataset. Use the &#x60;limit&#x60; parameter to set the number of records returned.  For a detailed example of how to use &#x60;getStream&#x60; and retrieve monitoring data, see our guides [How to get monitoring data](/docs/monitor-api/how-to/get-monitoring-data/) and  [Tracking data and handling alerts](/docs/monitor-api/monitor101/tracking-data-handling-alerts/).  **Note**: data is not guaranteed to be in the order of the timestamp of the events. It is returned in the order it was inserted into our database.  ### Related topics  - [How to get monitoring data](/docs/monitor-api/how-to/get-monitoring-data/) - [Tracking data and handling alerts](/docs/monitor-api/monitor101/tracking-data-handling-alerts/)
   * @param organizationId  (required)
   * @return StreamResponse
   */ 
  public StreamResponse stream(java.util.UUID organizationId) throws ApiException {
    return stream(organizationId, null);
  }

  /**
   * Gets customer event data for an organization..
   * Gets customer event data for the organization that owns the integration key.  The results for this endpoint are paginated by their event ingestion time, which can be up to five minutes after the event originally occurred. Use the &#x60;cursor&#x60; parameter to specify where the query begins in the dataset. Use the &#x60;limit&#x60; parameter to set the number of records returned.  For a detailed example of how to use &#x60;getStream&#x60; and retrieve monitoring data, see our guides [How to get monitoring data](/docs/monitor-api/how-to/get-monitoring-data/) and  [Tracking data and handling alerts](/docs/monitor-api/monitor101/tracking-data-handling-alerts/).  **Note**: data is not guaranteed to be in the order of the timestamp of the events. It is returned in the order it was inserted into our database.  ### Related topics  - [How to get monitoring data](/docs/monitor-api/how-to/get-monitoring-data/) - [Tracking data and handling alerts](/docs/monitor-api/monitor101/tracking-data-handling-alerts/)
   * @param organizationId  (required)
   * @param options for modifying the method behavior.
   * @return StreamResponse
   * @throws ApiException if fails to make API call
   */
  public StreamResponse stream(java.util.UUID organizationId, DocuMonitorApi.StreamOptions options) throws ApiException {
    ApiResponse<StreamResponse> localVarResponse = streamWithHttpInfo(organizationId, options);
    return localVarResponse.getData();
  }

  /**
   * Gets customer event data for an organization.
   * Gets customer event data for the organization that owns the integration key.  The results for this endpoint are paginated by their event ingestion time, which can be up to five minutes after the event originally occurred. Use the &#x60;cursor&#x60; parameter to specify where the query begins in the dataset. Use the &#x60;limit&#x60; parameter to set the number of records returned.  For a detailed example of how to use &#x60;getStream&#x60; and retrieve monitoring data, see our guides [How to get monitoring data](/docs/monitor-api/how-to/get-monitoring-data/) and  [Tracking data and handling alerts](/docs/monitor-api/monitor101/tracking-data-handling-alerts/).  **Note**: data is not guaranteed to be in the order of the timestamp of the events. It is returned in the order it was inserted into our database.  ### Related topics  - [How to get monitoring data](/docs/monitor-api/how-to/get-monitoring-data/) - [Tracking data and handling alerts](/docs/monitor-api/monitor101/tracking-data-handling-alerts/)
   * @param organizationId  (required)
   * @param options for modifying the method behavior.
   * @return StreamResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<StreamResponse > streamWithHttpInfo(java.util.UUID organizationId, DocuMonitorApi.StreamOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'organizationId' is set
    if (organizationId == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationId' when calling stream");
    }
    
    // create path and map variables
    String localVarPath = "/v1/organizations/{organizationId}/stream"
      .replaceAll("\\{" + "organizationId" + "\\}", apiClient.escapeString(organizationId.toString()));

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
    
    GenericType<StreamResponse> localVarReturnType = new GenericType<StreamResponse>() {};
    StreamResponse localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<StreamResponse>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
}
