package com.docusign.monitor.client.auth;

import com.docusign.monitor.client.auth.OAuth.OAuthToken;

public interface AccessTokenListener {
  void notify(OAuthToken token);
}