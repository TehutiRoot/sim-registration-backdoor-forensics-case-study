package com.google.api.client.auth.oauth2;

import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.http.HttpHeaders;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.UrlEncodedContent;
import com.google.api.client.util.Data;
import com.google.api.client.util.Preconditions;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public class BearerToken {

    /* renamed from: a */
    public static final Pattern f51725a = Pattern.compile("\\s*error\\s*=\\s*\"?invalid_token\"?");

    /* renamed from: com.google.api.client.auth.oauth2.BearerToken$a */
    /* loaded from: classes4.dex */
    public static final class C7250a implements Credential.AccessMethod {
        @Override // com.google.api.client.auth.oauth2.Credential.AccessMethod
        public String getAccessTokenFromRequest(HttpRequest httpRequest) {
            List<String> authorizationAsList = httpRequest.getHeaders().getAuthorizationAsList();
            if (authorizationAsList != null) {
                for (String str : authorizationAsList) {
                    if (str.startsWith("Bearer ")) {
                        return str.substring(7);
                    }
                }
                return null;
            }
            return null;
        }

        @Override // com.google.api.client.auth.oauth2.Credential.AccessMethod
        public void intercept(HttpRequest httpRequest, String str) {
            HttpHeaders headers = httpRequest.getHeaders();
            headers.setAuthorization("Bearer " + str);
        }
    }

    /* renamed from: com.google.api.client.auth.oauth2.BearerToken$b */
    /* loaded from: classes4.dex */
    public static final class C7251b implements Credential.AccessMethod {
        /* renamed from: a */
        public static Map m41836a(HttpRequest httpRequest) {
            return Data.mapOf(UrlEncodedContent.getContent(httpRequest).getData());
        }

        @Override // com.google.api.client.auth.oauth2.Credential.AccessMethod
        public String getAccessTokenFromRequest(HttpRequest httpRequest) {
            Object obj = m41836a(httpRequest).get("access_token");
            if (obj == null) {
                return null;
            }
            return obj.toString();
        }

        @Override // com.google.api.client.auth.oauth2.Credential.AccessMethod
        public void intercept(HttpRequest httpRequest, String str) {
            Preconditions.checkArgument(!"GET".equals(httpRequest.getRequestMethod()), "HTTP GET method is not supported");
            m41836a(httpRequest).put("access_token", str);
        }
    }

    /* renamed from: com.google.api.client.auth.oauth2.BearerToken$c */
    /* loaded from: classes4.dex */
    public static final class C7252c implements Credential.AccessMethod {
        @Override // com.google.api.client.auth.oauth2.Credential.AccessMethod
        public String getAccessTokenFromRequest(HttpRequest httpRequest) {
            Object obj = httpRequest.getUrl().get("access_token");
            if (obj == null) {
                return null;
            }
            return obj.toString();
        }

        @Override // com.google.api.client.auth.oauth2.Credential.AccessMethod
        public void intercept(HttpRequest httpRequest, String str) {
            httpRequest.getUrl().set("access_token", (Object) str);
        }
    }

    public static Credential.AccessMethod authorizationHeaderAccessMethod() {
        return new C7250a();
    }

    public static Credential.AccessMethod formEncodedBodyAccessMethod() {
        return new C7251b();
    }

    public static Credential.AccessMethod queryParameterAccessMethod() {
        return new C7252c();
    }
}