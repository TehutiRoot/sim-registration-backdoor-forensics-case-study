package com.google.api.client.auth.oauth2;

import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpExecuteInterceptor;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.util.Preconditions;
import java.util.Collection;

/* loaded from: classes4.dex */
public class AuthorizationCodeTokenRequest extends TokenRequest {

    /* renamed from: j */
    public String f51706j;

    /* renamed from: k */
    public String f51707k;

    public AuthorizationCodeTokenRequest(HttpTransport httpTransport, JsonFactory jsonFactory, GenericUrl genericUrl, String str) {
        super(httpTransport, jsonFactory, genericUrl, "authorization_code");
        setCode(str);
    }

    public final String getCode() {
        return this.f51706j;
    }

    public final String getRedirectUri() {
        return this.f51707k;
    }

    public AuthorizationCodeTokenRequest setCode(String str) {
        this.f51706j = (String) Preconditions.checkNotNull(str);
        return this;
    }

    public AuthorizationCodeTokenRequest setRedirectUri(String str) {
        this.f51707k = str;
        return this;
    }

    @Override // com.google.api.client.auth.oauth2.TokenRequest
    public /* bridge */ /* synthetic */ TokenRequest setResponseClass(Class cls) {
        return setResponseClass((Class<? extends TokenResponse>) cls);
    }

    @Override // com.google.api.client.auth.oauth2.TokenRequest
    public /* bridge */ /* synthetic */ TokenRequest setScopes(Collection collection) {
        return setScopes((Collection<String>) collection);
    }

    @Override // com.google.api.client.auth.oauth2.TokenRequest
    public AuthorizationCodeTokenRequest setClientAuthentication(HttpExecuteInterceptor httpExecuteInterceptor) {
        return (AuthorizationCodeTokenRequest) super.setClientAuthentication(httpExecuteInterceptor);
    }

    @Override // com.google.api.client.auth.oauth2.TokenRequest
    public AuthorizationCodeTokenRequest setGrantType(String str) {
        return (AuthorizationCodeTokenRequest) super.setGrantType(str);
    }

    @Override // com.google.api.client.auth.oauth2.TokenRequest
    public AuthorizationCodeTokenRequest setRequestInitializer(HttpRequestInitializer httpRequestInitializer) {
        return (AuthorizationCodeTokenRequest) super.setRequestInitializer(httpRequestInitializer);
    }

    @Override // com.google.api.client.auth.oauth2.TokenRequest
    public AuthorizationCodeTokenRequest setResponseClass(Class<? extends TokenResponse> cls) {
        return (AuthorizationCodeTokenRequest) super.setResponseClass(cls);
    }

    @Override // com.google.api.client.auth.oauth2.TokenRequest
    public AuthorizationCodeTokenRequest setScopes(Collection<String> collection) {
        return (AuthorizationCodeTokenRequest) super.setScopes(collection);
    }

    @Override // com.google.api.client.auth.oauth2.TokenRequest
    public AuthorizationCodeTokenRequest setTokenServerUrl(GenericUrl genericUrl) {
        return (AuthorizationCodeTokenRequest) super.setTokenServerUrl(genericUrl);
    }

    @Override // com.google.api.client.auth.oauth2.TokenRequest, com.google.api.client.util.GenericData
    public AuthorizationCodeTokenRequest set(String str, Object obj) {
        return (AuthorizationCodeTokenRequest) super.set(str, obj);
    }
}
