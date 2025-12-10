package com.google.api.client.googleapis.testing.auth.oauth2;

import ch.qos.logback.core.joran.action.Action;
import com.google.api.client.googleapis.auth.oauth2.GoogleOAuthConstants;
import com.google.api.client.googleapis.testing.TestUtils;
import com.google.api.client.http.LowLevelHttpRequest;
import com.google.api.client.http.LowLevelHttpResponse;
import com.google.api.client.json.GenericJson;
import com.google.api.client.json.Json;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.gson.GsonFactory;
import com.google.api.client.json.webtoken.JsonWebSignature;
import com.google.api.client.testing.http.MockHttpTransport;
import com.google.api.client.testing.http.MockLowLevelHttpRequest;
import com.google.api.client.testing.http.MockLowLevelHttpResponse;
import com.google.api.client.util.Beta;
import com.google.auth.http.AuthHttpConstants;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;
import org.joda.time.DateTimeConstants;

@Beta
/* loaded from: classes4.dex */
public class MockTokenServerTransport extends MockHttpTransport {

    /* renamed from: j */
    public static final Logger f52006j = Logger.getLogger(MockTokenServerTransport.class.getName());

    /* renamed from: k */
    public static final JsonFactory f52007k = new GsonFactory();

    /* renamed from: f */
    public final String f52008f;

    /* renamed from: g */
    public Map f52009g;

    /* renamed from: h */
    public Map f52010h;

    /* renamed from: i */
    public Map f52011i;

    /* renamed from: com.google.api.client.googleapis.testing.auth.oauth2.MockTokenServerTransport$a */
    /* loaded from: classes4.dex */
    public class C7287a extends MockLowLevelHttpRequest {
        public C7287a(String str) {
            super(str);
        }

        @Override // com.google.api.client.testing.http.MockLowLevelHttpRequest, com.google.api.client.http.LowLevelHttpRequest
        public LowLevelHttpResponse execute() {
            String str;
            Map<String, String> parseQuery = TestUtils.parseQuery(getContentAsString());
            String str2 = parseQuery.get("client_id");
            if (str2 != null) {
                if (MockTokenServerTransport.this.f52010h.containsKey(str2)) {
                    String str3 = parseQuery.get("client_secret");
                    String str4 = (String) MockTokenServerTransport.this.f52010h.get(str2);
                    if (str3 != null && str3.equals(str4)) {
                        String str5 = parseQuery.get("refresh_token");
                        if (MockTokenServerTransport.this.f52011i.containsKey(str5)) {
                            str = (String) MockTokenServerTransport.this.f52011i.get(str5);
                        } else {
                            throw new IOException("Refresh Token not found.");
                        }
                    } else {
                        throw new IOException("Client secret not found.");
                    }
                } else {
                    throw new IOException("Client ID not found.");
                }
            } else if (parseQuery.containsKey("grant_type")) {
                if ("urn:ietf:params:oauth:grant-type:jwt-bearer".equals(parseQuery.get("grant_type"))) {
                    JsonWebSignature parse = JsonWebSignature.parse(MockTokenServerTransport.f52007k, parseQuery.get("assertion"));
                    String issuer = parse.getPayload().getIssuer();
                    if (MockTokenServerTransport.this.f52009g.containsKey(issuer)) {
                        String str6 = (String) MockTokenServerTransport.this.f52009g.get(issuer);
                        String str7 = (String) parse.getPayload().get(Action.SCOPE_ATTRIBUTE);
                        if (str7 != null && str7.length() != 0) {
                            str = str6;
                        } else {
                            throw new IOException("Scopes not found.");
                        }
                    } else {
                        throw new IOException("Service Account Email not found as issuer.");
                    }
                } else {
                    throw new IOException("Unexpected Grant Type.");
                }
            } else {
                throw new IOException("Unknown token type.");
            }
            GenericJson genericJson = new GenericJson();
            genericJson.setFactory(MockTokenServerTransport.f52007k);
            genericJson.put("access_token", (Object) str);
            genericJson.put("expires_in", (Object) Integer.valueOf((int) DateTimeConstants.SECONDS_PER_HOUR));
            genericJson.put("token_type", (Object) AuthHttpConstants.BEARER);
            return new MockLowLevelHttpResponse().setContentType(Json.MEDIA_TYPE).setContent(genericJson.toPrettyString());
        }
    }

    public MockTokenServerTransport() {
        this(GoogleOAuthConstants.TOKEN_SERVER_URL);
    }

    public void addClient(String str, String str2) {
        this.f52010h.put(str, str2);
    }

    public void addRefreshToken(String str, String str2) {
        this.f52011i.put(str, str2);
    }

    public void addServiceAccount(String str, String str2) {
        this.f52009g.put(str, str2);
    }

    /* renamed from: b */
    public final MockLowLevelHttpRequest m41772b(String str) {
        return new C7287a(str);
    }

    @Override // com.google.api.client.testing.http.MockHttpTransport, com.google.api.client.http.HttpTransport
    public LowLevelHttpRequest buildRequest(String str, String str2) throws IOException {
        if (str2.equals(this.f52008f)) {
            return m41772b(str2);
        }
        if (str2.equals("https://accounts.google.com/o/oauth2/token")) {
            f52006j.warning("Your configured token_uri is using a legacy endpoint. You may want to redownload your credentials.");
            return m41772b(str2);
        }
        return super.buildRequest(str, str2);
    }

    public MockTokenServerTransport(String str) {
        this.f52009g = new HashMap();
        this.f52010h = new HashMap();
        this.f52011i = new HashMap();
        this.f52008f = str;
    }
}
