package com.google.api.client.testing.http;

import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.LowLevelHttpRequest;
import com.google.api.client.util.Beta;
import com.google.api.client.util.Preconditions;
import java.io.IOException;
import java.util.Collections;
import java.util.Set;

@Beta
/* loaded from: classes4.dex */
public class MockHttpTransport extends HttpTransport {

    /* renamed from: c */
    public Set f52230c;

    /* renamed from: d */
    public MockLowLevelHttpRequest f52231d;

    /* renamed from: e */
    public MockLowLevelHttpResponse f52232e;

    @Beta
    /* loaded from: classes4.dex */
    public static class Builder {

        /* renamed from: a */
        public Set f52233a;

        /* renamed from: b */
        public MockLowLevelHttpRequest f52234b;

        /* renamed from: c */
        public MockLowLevelHttpResponse f52235c;

        public MockHttpTransport build() {
            return new MockHttpTransport(this);
        }

        public final MockLowLevelHttpRequest getLowLevelHttpRequest() {
            return this.f52234b;
        }

        public final Set<String> getSupportedMethods() {
            return this.f52233a;
        }

        public final Builder setLowLevelHttpRequest(MockLowLevelHttpRequest mockLowLevelHttpRequest) {
            boolean z;
            if (this.f52235c == null) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkState(z, "Cannnot set a low level HTTP request when a low level HTTP response has been set.");
            this.f52234b = mockLowLevelHttpRequest;
            return this;
        }

        public final Builder setLowLevelHttpResponse(MockLowLevelHttpResponse mockLowLevelHttpResponse) {
            boolean z;
            if (this.f52234b == null) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkState(z, "Cannot set a low level HTTP response when a low level HTTP request has been set.");
            this.f52235c = mockLowLevelHttpResponse;
            return this;
        }

        public final Builder setSupportedMethods(Set<String> set) {
            this.f52233a = set;
            return this;
        }
    }

    public MockHttpTransport() {
    }

    @Override // com.google.api.client.http.HttpTransport
    public LowLevelHttpRequest buildRequest(String str, String str2) throws IOException {
        Preconditions.checkArgument(supportsMethod(str), "HTTP method %s not supported", str);
        MockLowLevelHttpRequest mockLowLevelHttpRequest = this.f52231d;
        if (mockLowLevelHttpRequest != null) {
            return mockLowLevelHttpRequest;
        }
        MockLowLevelHttpRequest mockLowLevelHttpRequest2 = new MockLowLevelHttpRequest(str2);
        this.f52231d = mockLowLevelHttpRequest2;
        MockLowLevelHttpResponse mockLowLevelHttpResponse = this.f52232e;
        if (mockLowLevelHttpResponse != null) {
            mockLowLevelHttpRequest2.setResponse(mockLowLevelHttpResponse);
        }
        return this.f52231d;
    }

    public final MockLowLevelHttpRequest getLowLevelHttpRequest() {
        return this.f52231d;
    }

    public final Set<String> getSupportedMethods() {
        Set set = this.f52230c;
        if (set == null) {
            return null;
        }
        return Collections.unmodifiableSet(set);
    }

    @Override // com.google.api.client.http.HttpTransport
    public boolean supportsMethod(String str) throws IOException {
        Set set = this.f52230c;
        if (set != null && !set.contains(str)) {
            return false;
        }
        return true;
    }

    public MockHttpTransport(Builder builder) {
        this.f52230c = builder.f52233a;
        this.f52231d = builder.f52234b;
        this.f52232e = builder.f52235c;
    }
}
