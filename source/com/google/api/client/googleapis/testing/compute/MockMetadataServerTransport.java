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
    public static final String f52013h;

    /* renamed from: i */
    public static final String f52014i;

    /* renamed from: j */
    public static final JsonFactory f52015j;

    /* renamed from: f */
    public String f52016f;

    /* renamed from: g */
    public Integer f52017g;

    /* renamed from: com.google.api.client.googleapis.testing.compute.MockMetadataServerTransport$a */
    /* loaded from: classes4.dex */
    public class C7288a extends MockLowLevelHttpRequest {
        public C7288a(String str) {
            super(str);
        }

        @Override // com.google.api.client.testing.http.MockLowLevelHttpRequest, com.google.api.client.http.LowLevelHttpRequest
        public LowLevelHttpResponse execute() {
            if (MockMetadataServerTransport.this.f52017g != null) {
                return new MockLowLevelHttpResponse().setStatusCode(MockMetadataServerTransport.this.f52017g.intValue()).setContent("Token Fetch Error");
            }
            if ("Google".equals(getFirstHeaderValue("Metadata-Flavor"))) {
                GenericJson genericJson = new GenericJson();
                genericJson.setFactory(MockMetadataServerTransport.f52015j);
                genericJson.put("access_token", (Object) MockMetadataServerTransport.this.f52016f);
                genericJson.put("expires_in", (Object) Integer.valueOf((int) DateTimeConstants.MILLIS_PER_HOUR));
                genericJson.put("token_type", (Object) AuthHttpConstants.BEARER);
                return new MockLowLevelHttpResponse().setContentType(Json.MEDIA_TYPE).setContent(genericJson.toPrettyString());
            }
            throw new IOException("Metadata request header not found.");
        }
    }

    /* renamed from: com.google.api.client.googleapis.testing.compute.MockMetadataServerTransport$b */
    /* loaded from: classes4.dex */
    public class C7289b extends MockLowLevelHttpRequest {
        public C7289b(String str) {
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
        f52013h = metadataServerUrl;
        f52014i = metadataServerUrl + "/computeMetadata/v1/instance/service-accounts/default/token";
        f52015j = new GsonFactory();
    }

    public MockMetadataServerTransport(String str) {
        this.f52016f = str;
    }

    @Override // com.google.api.client.testing.http.MockHttpTransport, com.google.api.client.http.HttpTransport
    public LowLevelHttpRequest buildRequest(String str, String str2) throws IOException {
        if (str2.equals(f52014i)) {
            return new C7288a(str2);
        }
        if (str2.equals(f52013h)) {
            return new C7289b(str2);
        }
        return super.buildRequest(str, str2);
    }

    public void setTokenRequestStatusCode(Integer num) {
        this.f52017g = num;
    }
}
