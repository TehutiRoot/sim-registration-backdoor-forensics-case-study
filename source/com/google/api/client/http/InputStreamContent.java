package com.google.api.client.http;

import com.google.api.client.util.Preconditions;
import java.io.InputStream;

/* loaded from: classes4.dex */
public final class InputStreamContent extends AbstractInputStreamContent {

    /* renamed from: c */
    public long f52142c;

    /* renamed from: d */
    public boolean f52143d;

    /* renamed from: e */
    public final InputStream f52144e;

    public InputStreamContent(String str, InputStream inputStream) {
        super(str);
        this.f52142c = -1L;
        this.f52144e = (InputStream) Preconditions.checkNotNull(inputStream);
    }

    @Override // com.google.api.client.http.AbstractInputStreamContent
    public InputStream getInputStream() {
        return this.f52144e;
    }

    @Override // com.google.api.client.http.HttpContent
    public long getLength() {
        return this.f52142c;
    }

    @Override // com.google.api.client.http.HttpContent
    public boolean retrySupported() {
        return this.f52143d;
    }

    public InputStreamContent setLength(long j) {
        this.f52142c = j;
        return this;
    }

    public InputStreamContent setRetrySupported(boolean z) {
        this.f52143d = z;
        return this;
    }

    @Override // com.google.api.client.http.AbstractInputStreamContent
    public InputStreamContent setCloseInputStream(boolean z) {
        return (InputStreamContent) super.setCloseInputStream(z);
    }

    @Override // com.google.api.client.http.AbstractInputStreamContent
    public InputStreamContent setType(String str) {
        return (InputStreamContent) super.setType(str);
    }
}
