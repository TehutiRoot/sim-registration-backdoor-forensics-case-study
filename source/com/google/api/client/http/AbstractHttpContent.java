package com.google.api.client.http;

import com.google.api.client.util.IOUtils;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* loaded from: classes4.dex */
public abstract class AbstractHttpContent implements HttpContent {

    /* renamed from: a */
    public HttpMediaType f52022a;

    /* renamed from: b */
    public long f52023b;

    public AbstractHttpContent(String str) {
        this(str == null ? null : new HttpMediaType(str));
    }

    public long computeLength() throws IOException {
        return computeLength(this);
    }

    public final Charset getCharset() {
        HttpMediaType httpMediaType = this.f52022a;
        if (httpMediaType != null && httpMediaType.getCharsetParameter() != null) {
            return this.f52022a.getCharsetParameter();
        }
        return StandardCharsets.ISO_8859_1;
    }

    @Override // com.google.api.client.http.HttpContent
    public long getLength() throws IOException {
        if (this.f52023b == -1) {
            this.f52023b = computeLength();
        }
        return this.f52023b;
    }

    public final HttpMediaType getMediaType() {
        return this.f52022a;
    }

    @Override // com.google.api.client.http.HttpContent
    public String getType() {
        HttpMediaType httpMediaType = this.f52022a;
        if (httpMediaType == null) {
            return null;
        }
        return httpMediaType.build();
    }

    @Override // com.google.api.client.http.HttpContent
    public boolean retrySupported() {
        return true;
    }

    public AbstractHttpContent setMediaType(HttpMediaType httpMediaType) {
        this.f52022a = httpMediaType;
        return this;
    }

    public AbstractHttpContent(HttpMediaType httpMediaType) {
        this.f52023b = -1L;
        this.f52022a = httpMediaType;
    }

    public static long computeLength(HttpContent httpContent) throws IOException {
        if (httpContent.retrySupported()) {
            return IOUtils.computeLength(httpContent);
        }
        return -1L;
    }
}
