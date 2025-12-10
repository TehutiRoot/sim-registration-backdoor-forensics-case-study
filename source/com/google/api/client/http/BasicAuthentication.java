package com.google.api.client.http;

import com.google.api.client.util.Preconditions;
import java.io.IOException;

/* loaded from: classes4.dex */
public final class BasicAuthentication implements HttpRequestInitializer, HttpExecuteInterceptor {

    /* renamed from: a */
    public final String f52026a;

    /* renamed from: b */
    public final String f52027b;

    public BasicAuthentication(String str, String str2) {
        this.f52026a = (String) Preconditions.checkNotNull(str);
        this.f52027b = (String) Preconditions.checkNotNull(str2);
    }

    public String getPassword() {
        return this.f52027b;
    }

    public String getUsername() {
        return this.f52026a;
    }

    @Override // com.google.api.client.http.HttpRequestInitializer
    public void initialize(HttpRequest httpRequest) throws IOException {
        httpRequest.setInterceptor(this);
    }

    @Override // com.google.api.client.http.HttpExecuteInterceptor
    public void intercept(HttpRequest httpRequest) throws IOException {
        httpRequest.getHeaders().setBasicAuthentication(this.f52026a, this.f52027b);
    }
}
