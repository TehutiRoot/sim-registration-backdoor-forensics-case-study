package com.google.api.client.auth.oauth2;

import androidx.autofill.HintConstants;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpExecuteInterceptor;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.util.Preconditions;
import java.util.Collection;

/* loaded from: classes4.dex */
public class PasswordTokenRequest extends TokenRequest {

    /* renamed from: j */
    public String f51753j;

    /* renamed from: k */
    public String f51754k;

    public PasswordTokenRequest(HttpTransport httpTransport, JsonFactory jsonFactory, GenericUrl genericUrl, String str, String str2) {
        super(httpTransport, jsonFactory, genericUrl, HintConstants.AUTOFILL_HINT_PASSWORD);
        setUsername(str);
        setPassword(str2);
    }

    public final String getPassword() {
        return this.f51754k;
    }

    public final String getUsername() {
        return this.f51753j;
    }

    public PasswordTokenRequest setPassword(String str) {
        this.f51754k = (String) Preconditions.checkNotNull(str);
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

    public PasswordTokenRequest setUsername(String str) {
        this.f51753j = (String) Preconditions.checkNotNull(str);
        return this;
    }

    @Override // com.google.api.client.auth.oauth2.TokenRequest
    public PasswordTokenRequest setClientAuthentication(HttpExecuteInterceptor httpExecuteInterceptor) {
        return (PasswordTokenRequest) super.setClientAuthentication(httpExecuteInterceptor);
    }

    @Override // com.google.api.client.auth.oauth2.TokenRequest
    public PasswordTokenRequest setGrantType(String str) {
        return (PasswordTokenRequest) super.setGrantType(str);
    }

    @Override // com.google.api.client.auth.oauth2.TokenRequest
    public PasswordTokenRequest setRequestInitializer(HttpRequestInitializer httpRequestInitializer) {
        return (PasswordTokenRequest) super.setRequestInitializer(httpRequestInitializer);
    }

    @Override // com.google.api.client.auth.oauth2.TokenRequest
    public PasswordTokenRequest setResponseClass(Class<? extends TokenResponse> cls) {
        return (PasswordTokenRequest) super.setResponseClass(cls);
    }

    @Override // com.google.api.client.auth.oauth2.TokenRequest
    public PasswordTokenRequest setScopes(Collection<String> collection) {
        return (PasswordTokenRequest) super.setScopes(collection);
    }

    @Override // com.google.api.client.auth.oauth2.TokenRequest
    public PasswordTokenRequest setTokenServerUrl(GenericUrl genericUrl) {
        return (PasswordTokenRequest) super.setTokenServerUrl(genericUrl);
    }

    @Override // com.google.api.client.auth.oauth2.TokenRequest, com.google.api.client.util.GenericData
    public PasswordTokenRequest set(String str, Object obj) {
        return (PasswordTokenRequest) super.set(str, obj);
    }
}