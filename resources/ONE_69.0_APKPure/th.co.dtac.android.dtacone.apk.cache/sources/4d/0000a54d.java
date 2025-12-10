package com.google.api.client.auth.oauth2;

import com.google.api.client.http.HttpExecuteInterceptor;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.UrlEncodedContent;
import com.google.api.client.util.Data;
import com.google.api.client.util.Preconditions;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes4.dex */
public class ClientParametersAuthentication implements HttpRequestInitializer, HttpExecuteInterceptor {

    /* renamed from: a */
    public final String f51726a;

    /* renamed from: b */
    public final String f51727b;

    public ClientParametersAuthentication(String str, String str2) {
        this.f51726a = (String) Preconditions.checkNotNull(str);
        this.f51727b = str2;
    }

    public final String getClientId() {
        return this.f51726a;
    }

    public final String getClientSecret() {
        return this.f51727b;
    }

    @Override // com.google.api.client.http.HttpRequestInitializer
    public void initialize(HttpRequest httpRequest) throws IOException {
        httpRequest.setInterceptor(this);
    }

    @Override // com.google.api.client.http.HttpExecuteInterceptor
    public void intercept(HttpRequest httpRequest) throws IOException {
        Map<String, Object> mapOf = Data.mapOf(UrlEncodedContent.getContent(httpRequest).getData());
        mapOf.put("client_id", this.f51726a);
        String str = this.f51727b;
        if (str != null) {
            mapOf.put("client_secret", str);
        }
    }
}