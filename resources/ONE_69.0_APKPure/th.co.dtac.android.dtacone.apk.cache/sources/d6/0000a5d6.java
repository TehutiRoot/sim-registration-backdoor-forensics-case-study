package com.google.api.client.http;

import com.google.api.client.util.Preconditions;
import java.io.IOException;

/* loaded from: classes4.dex */
public final class BasicAuthentication implements HttpRequestInitializer, HttpExecuteInterceptor {

    /* renamed from: a */
    public final String f52038a;

    /* renamed from: b */
    public final String f52039b;

    public BasicAuthentication(String str, String str2) {
        this.f52038a = (String) Preconditions.checkNotNull(str);
        this.f52039b = (String) Preconditions.checkNotNull(str2);
    }

    public String getPassword() {
        return this.f52039b;
    }

    public String getUsername() {
        return this.f52038a;
    }

    @Override // com.google.api.client.http.HttpRequestInitializer
    public void initialize(HttpRequest httpRequest) throws IOException {
        httpRequest.setInterceptor(this);
    }

    @Override // com.google.api.client.http.HttpExecuteInterceptor
    public void intercept(HttpRequest httpRequest) throws IOException {
        httpRequest.getHeaders().setBasicAuthentication(this.f52038a, this.f52039b);
    }
}