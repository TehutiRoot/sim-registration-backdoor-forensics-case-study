package com.google.api.client.googleapis.testing.compute;

import com.google.api.client.googleapis.auth.oauth2.OAuth2Utils;
import com.google.api.client.http.LowLevelHttpRequest;
import com.google.api.client.http.LowLevelHttpResponse;
import com.google.api.client.json.GenericJson;
import com.google.api.client.json.Json;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.gson.GsonFactory;
import com.google.api.client.testing.http.MockHttpTransport;
import com.google.api.client.testing.http.MockLowLevelHttpRequest;
import com.google.api.client.testing.http.MockLowLevelHttpResponse;
import com.google.api.client.util.Beta;
import com.google.auth.http.AuthHttpConstants;
import java.io.IOException;
import org.joda.time.DateTimeConstants;

@Beta
/* loaded from: classes4.dex */
public class MockMetadataServerTransport extends MockHttpTransport {

    /* renamed from: h */
    public static final String f52025h;

    /* renamed from: i */
    public static final String f52026i;

    /* renamed from: j */
    public static final JsonFactory f52027j;

    /* renamed from: f */
    public String f52028f;

    /* renamed from: g */
    public Integer f52029g;

    /* renamed from: com.google.api.client.googleapis.testing.compute.MockMetadataServerTransport$a */
    /* loaded from: classes4.dex */
    public class C7277a extends MockLowLevelHttpRequest {
        public C7277a(String str) {
            super(str);
        }

        @Override // com.google.api.client.testing.http.MockLowLevelHttpRequest, com.google.api.client.http.LowLevelHttpRequest
        public LowLevelHttpResponse execute() {
            if (MockMetadataServerTransport.this.f52029g != null) {
                return new MockLowLevelHttpResponse().setStatusCode(MockMetadataServerTransport.this.f52029g.intValue()).setContent("Token Fetch Error");
            }
            if ("Google".equals(getFirstHeaderValue("Metadata-Flavor"))) {
                GenericJson genericJson = new GenericJson();
                genericJson.setFactory(MockMetadataServerTransport.f52027j);
                genericJson.put("access_token", (Object) MockMetadataServerTransport.this.f52028f);
                genericJson.put("expires_in", (Object) Integer.valueOf((int) DateTimeConstants.MILLIS_PER_HOUR));
                genericJson.put("token_type", (Object) AuthHttpConstants.BEARER);
                return new MockLowLevelHttpResponse().setContentType(Json.MEDIA_TYPE).setContent(genericJson.toPrettyString());
            }
            throw new IOException("Metadata request header not found.");
        }
    }

    /* renamed from: com.google.api.client.googleapis.testing.compute.MockMetadataServerTransport$b */
    /* loaded from: classes4.dex */
    public class C7278b extends MockLowLevelHttpRequest {
        public C7278b(String str) {
            super(str);
        }

        @Override // com.google.api.client.testing.http.MockLowLevelHttpRequest, com.google.api.client.http.LowLevelHttpRequest
        public LowLevelHttpResponse execute() {
            MockLowLevelHttpResponse mockLowLevelHttpResponse = new MockLowLevelHttpResponse();
            mockLowLevelHttpResponse.addHeader("Metadata-Flavor", "Google");
            return mockLowLevelHttpResponse;
        }
    }

    static {
        String metadataServerUrl = OAuth2Utils.getMetadataServerUrl();
        f52025h = metadataServerUrl;
        f52026i = metadataServerUrl + "/computeMetadata/v1/instance/service-accounts/default/token";
        f52027j = new GsonFactory();
    }

    public MockMetadataServerTransport(String str) {
        this.f52028f = str;
    }

    @Override // com.google.api.client.testing.http.MockHttpTransport, com.google.api.client.http.HttpTransport
    public LowLevelHttpRequest buildRequest(String str, String str2) throws IOException {
        if (str2.equals(f52026i)) {
            return new C7277a(str2);
        }
        if (str2.equals(f52025h)) {
            return new C7278b(str2);
        }
        return super.buildRequest(str, str2);
    }

    public void setTokenRequestStatusCode(Integer num) {
        this.f52029g = num;
    }
}