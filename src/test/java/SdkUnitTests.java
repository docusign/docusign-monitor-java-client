import com.docusign.monitor.api.*;
import com.docusign.monitor.client.*;
import com.docusign.monitor.client.auth.OAuth;
import com.docusign.monitor.client.auth.OAuth.UserInfo;

import com.docusign.monitor.model.CursoredResult;
import org.junit.*;
import org.junit.runners.MethodSorters;

//import java.awt.*;
//import java.net.URI;
import java.util.ArrayList;

import com.migcomponents.migbase64.Base64;

import jakarta.ws.rs.core.UriBuilderException;

/**
 *
 * @author majid.mallis
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SdkUnitTests {

	//private static final String UserName = System.getenv("USER_NAME");
	private static final String UserId = System.getenv("USER_ID");
	private static final String IntegratorKey = System.getenv("INTEGRATOR_KEY_JWT");
	//private static final String IntegratorKeyImplicit = System.getenv("INTEGRATOR_KEY_IMPLICIT");
	//private static final String ClientSecret = System.getenv("CLIENT_SECRET");
	//private static final String RedirectURI = System.getenv("REDIRECT_URI");

	private static final String BaseUrl = ApiClient.DEMO_REST_BASEPATH;
	//private static final String OAuthBaseUrl = OAuth.DEMO_OAUTH_BASEPATH;
    private static final byte[] privateKeyBytes = Base64.decode(System.getenv("PRIVATE_KEY"));
	// JUnit 4.12 runs test cases in parallel, so the envelope ID needs to be initiated as well.

	// private JSON json = new JSON();

	public SdkUnitTests() {
	}

	@BeforeClass
	public static void setUpClass() {
	}

	@AfterClass
	public static void tearDownClass() {
	}

	@After
	public void tearDown() {
	}

	// The methods must be annotated with annotation @Test. For example:
	//
	@Test
	public void JWTLoginTest() {
		System.out.println("\nJWTLoginTest:\n" + "===========================================");
		ApiClient apiClient = new ApiClient(BaseUrl);
		//String currentDir = System.getenv("user.dir");

		try {
			java.util.List<String> scopes = new ArrayList<String>();
			scopes.add(OAuth.Scope_SIGNATURE);
			scopes.add(OAuth.Scope_IMPERSONATION);

			// IMPORTANT NOTE:
			// the first time you ask for a JWT access token, you should grant access by making the following call
			// get DocuSign OAuth authorization url:
			//String oauthLoginUrl = apiClient.getJWTUri(IntegratorKey, RedirectURI, OAuthBaseUrl, scopes);
			// open DocuSign OAuth authorization url in the browser, login and grant access
			//Desktop.getDesktop().browse(URI.create(oauthLoginUrl));
			// END OF NOTE

			OAuth.OAuthToken oAuthToken = apiClient.requestJWTUserToken(IntegratorKey, UserId, scopes, privateKeyBytes, 3600);
			Assert.assertNotSame(null, oAuthToken);
			// now that the API client has an OAuth token, let's use it in all
			// DocuSign APIs
			apiClient.setAccessToken(oAuthToken.getAccessToken(), oAuthToken.getExpiresIn());
			UserInfo userInfo = apiClient.getUserInfo(oAuthToken.getAccessToken());
			Assert.assertNotSame(null, userInfo);
			Assert.assertNotNull(userInfo.getAccounts());
			Assert.assertTrue(userInfo.getAccounts().size() > 0);

			System.out.println("UserInfo: " + userInfo);
			Configuration.setDefaultApiClient(apiClient);
		} catch (ApiException ex) {
			Assert.fail("Exception: " + ex);
		} catch (Exception e) {
			Assert.fail("Exception: " + e.getLocalizedMessage());
		}
	}

	@Test
	public void AuthorizationCodeLoginTest() {
		System.out.println("\nAuthorizationCodeLoginTest:\n" + "===========================================");
		ApiClient apiClient = new ApiClient(BaseUrl);
		try {
			// after successful login you should compare the value of URI decoded "state" query param
			// with the one you create here; they should match.
			java.util.List<String> scopes = new ArrayList<String>();
			scopes.add(OAuth.Scope_SIGNATURE);
			scopes.add(OAuth.Scope_IMPERSONATION);
			// get DocuSign OAuth authorization url
			//URI oauthLoginUrl = apiClient.getAuthorizationUri(IntegratorKey, scopes, RedirectURI, OAuth.CODE, null);
			// open DocuSign OAuth login in the browser
			//Desktop.getDesktop().browse(oauthLoginUrl);
			// IMPORTANT: after the login, DocuSign will send back a fresh
			// authorization code as a query param of the redirect URI.
			// You should set up a route that handles the redirect call to get
			// that code and pass it to token endpoint as shown in the next
			// lines:
			/*String code = "<once_you_get_the_oauth_code_put_it_here>";
			OAuth.OAuthToken oAuthToken = apiClient.generateAccessToken(IntegratorKey, ClientSecret, code);
			Assert.assertNotSame(null, oAuthToken);
			Assert.assertNotNull(oAuthToken.getAccessToken());
			Assert.assertTrue(oAuthToken.getExpiresIn() > 0L);

			// now that the API client has an OAuth token, let's use it in all
			// DocuSign APIs
			apiClient.setAccessToken(oAuthToken.getAccessToken(), oAuthToken.getExpiresIn());
			UserInfo userInfo = apiClient.getUserInfo(oAuthToken.getAccessToken());
			Assert.assertNotSame(null, userInfo);
			Assert.assertNotNull(userInfo.getAccounts());
			Assert.assertTrue(userInfo.getAccounts().size() > 0);

			System.out.println("UserInfo: " + userInfo);
			Configuration.setDefaultApiClient(apiClient);
		} catch (ApiException ex) {
			Assert.fail("Exception: " + ex);*/
		} catch (Exception e) {
			Assert.fail("Exception: " + e.getLocalizedMessage());
		}
	}

	@Test
	public void ImplicitLoginTest() {
		System.out.println("\nImplicitLoginTest:\n" + "===========================================");
		//ApiClient apiClient = new ApiClient(BaseUrl);
		try {
			// after successful login you should compare the value of URI decoded "state" query param
			// with the one you create here; they should match.
			//String randomState = "*^.$DGj*)+}Jk";
			java.util.List<String> scopes = new ArrayList<String>();
			scopes.add(OAuth.Scope_SIGNATURE);
			scopes.add(OAuth.Scope_IMPERSONATION);
			// get DocuSign OAuth authorization url
			//URI oAuthLoginUri = apiClient.getAuthorizationUri(IntegratorKeyImplicit, scopes, RedirectURI, OAuth.TOKEN, randomState);
			// open DocuSign OAuth login in the browser
			//Desktop.getDesktop().browse(oAuthLoginUri);
			// IMPORTANT: after the login, DocuSign will send back a new
			// access token in the hash fragment of the redirect URI.
			// You should set up a client-side handler that handles window.location change to get
			// that token and pass it to the ApiClient object as shown in the next
			// lines:
			//String token = "<once_you_get_the_oauth_token_put_it_here>";
			// now that the API client has an OAuth token, let's use it in all
			// DocuSign APIs
			/*apiClient.setAccessToken(oAuthToken.getAccessToken(), oAuthToken.getExpiresIn());
			UserInfo userInfo = apiClient.getUserInfo(token);
			Assert.assertNotSame(null, userInfo);
			Assert.assertNotNull(userInfo.getAccounts());
			Assert.assertTrue(userInfo.getAccounts().size() > 0);

			System.out.println("UserInfo: " + userInfo);
			Configuration.setDefaultApiClient(apiClient);*/
		} catch (UriBuilderException ex) {
			System.out.println("UriBuilderException: " + ex);
		} catch (Exception e) {
			Assert.fail("Exception: " + e.getLocalizedMessage());
		}
	}
	
	@Test
	public void GetStreamTest() {
		System.out.println("\nGetStreamTest:\n" + "===========================================");
		ApiClient apiClient = new ApiClient(BaseUrl);
		//String currentDir = System.getProperty("user.dir");

		try {
			// IMPORTANT NOTE:
			// the first time you ask for a JWT access token, you should grant access by making the following call
			// get DocuSign OAuth authorization url:
			//String oauthLoginUrl = apiClient.getJWTUri(IntegratorKey, RedirectURI, OAuthBaseUrl);
			// open DocuSign OAuth authorization url in the browser, login and grant access
			//Desktop.getDesktop().browse(URI.create(oauthLoginUrl));
			// END OF NOTE

			java.util.List<String> scopes = new ArrayList<String>();
			scopes.add(OAuth.Scope_SIGNATURE);
			scopes.add(OAuth.Scope_IMPERSONATION);

			OAuth.OAuthToken oAuthToken = apiClient.requestJWTUserToken(IntegratorKey, UserId, scopes, privateKeyBytes, 3600);
			Assert.assertNotSame(null, oAuthToken);
			// now that the API client has an OAuth token, let's use it in all
			// DocuSign APIs
			apiClient.setAccessToken(oAuthToken.getAccessToken(), oAuthToken.getExpiresIn());
			
			UserInfo userInfo = apiClient.getUserInfo(oAuthToken.getAccessToken());
			Assert.assertNotSame(null, userInfo);
			Assert.assertNotNull(userInfo.getAccounts());
			Assert.assertTrue(userInfo.getAccounts().size() > 0);

			System.out.println("UserInfo: " + userInfo);
			
			Configuration.setDefaultApiClient(apiClient);

			DataSetApi dataSetApi = new DataSetApi();
			String dataSetName = "monitor";
			String version = "2.0";
			CursoredResult cursoredResult = dataSetApi.getStream(version, dataSetName);
			Assert.assertNotNull(cursoredResult.getData());

			System.out.println("CursoredResult - first row: " + cursoredResult.getData().get(0));
		} catch (ApiException ex) {
			Assert.fail("ApiException: " + ex.getLocalizedMessage());
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail("Exception: " + e.getLocalizedMessage());
		}
	}
}