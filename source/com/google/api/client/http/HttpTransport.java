package com.google.api.client.http;

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Logger;

/* loaded from: classes4.dex */
public abstract class HttpTransport {

    /* renamed from: a */
    public static final Logger f52140a = Logger.getLogger(HttpTransport.class.getName());

    /* renamed from: b */
    public static final String[] f52141b;

    static {
        String[] strArr = {"DELETE", "GET", "POST", "PUT"};
        f52141b = strArr;
        Arrays.sort(strArr);
    }

    /* renamed from: a */
    public HttpRequest m41749a() {
        return new HttpRequest(this, null);
    }

    public abstract LowLevelHttpRequest buildRequest(String str, String str2) throws IOException;

    public final HttpRequestFactory createRequestFactory() {
        return createRequestFactory(null);
    }

    public boolean isMtls() {
        return false;
    }

    public boolean isShutdown() {
        return true;
    }

    public void shutdown() throws IOException {
    }

    public boolean supportsMethod(String str) throws IOException {
        if (Arrays.binarySearch(f52141b, str) >= 0) {
            return true;
        }
        return false;
    }

    public final HttpRequestFactory createRequestFactory(HttpRequestInitializer httpRequestInitializer) {
        return new HttpRequestFactory(this, httpRequestInitializer);
    }
}
