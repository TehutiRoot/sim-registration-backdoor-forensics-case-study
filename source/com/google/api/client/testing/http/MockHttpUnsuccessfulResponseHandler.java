package com.google.api.client.testing.http;

import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpUnsuccessfulResponseHandler;
import com.google.api.client.util.Beta;
import java.io.IOException;

@Beta
/* loaded from: classes4.dex */
public class MockHttpUnsuccessfulResponseHandler implements HttpUnsuccessfulResponseHandler {

    /* renamed from: a */
    public boolean f52236a;

    /* renamed from: b */
    public boolean f52237b;

    public MockHttpUnsuccessfulResponseHandler(boolean z) {
        this.f52237b = z;
    }

    @Override // com.google.api.client.http.HttpUnsuccessfulResponseHandler
    public boolean handleResponse(HttpRequest httpRequest, HttpResponse httpResponse, boolean z) throws IOException {
        this.f52236a = true;
        return this.f52237b;
    }

    public boolean isCalled() {
        return this.f52236a;
    }
}
