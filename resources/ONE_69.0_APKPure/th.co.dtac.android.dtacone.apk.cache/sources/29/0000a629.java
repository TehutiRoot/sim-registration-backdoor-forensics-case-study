package com.google.api.client.testing.http;

import com.google.api.client.http.HttpContent;
import com.google.api.client.util.Beta;
import com.google.api.client.util.Preconditions;
import java.io.IOException;
import java.io.OutputStream;

@Beta
/* loaded from: classes4.dex */
public class MockHttpContent implements HttpContent {

    /* renamed from: b */
    public String f52240b;

    /* renamed from: a */
    public long f52239a = -1;

    /* renamed from: c */
    public byte[] f52241c = new byte[0];

    public final byte[] getContent() {
        return this.f52241c;
    }

    @Override // com.google.api.client.http.HttpContent
    public long getLength() throws IOException {
        return this.f52239a;
    }

    @Override // com.google.api.client.http.HttpContent
    public String getType() {
        return this.f52240b;
    }

    @Override // com.google.api.client.http.HttpContent
    public boolean retrySupported() {
        return true;
    }

    public MockHttpContent setContent(byte[] bArr) {
        this.f52241c = (byte[]) Preconditions.checkNotNull(bArr);
        return this;
    }

    public MockHttpContent setLength(long j) {
        boolean z;
        if (j >= -1) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z);
        this.f52239a = j;
        return this;
    }

    public MockHttpContent setType(String str) {
        this.f52240b = str;
        return this;
    }

    @Override // com.google.api.client.http.HttpContent, com.google.api.client.util.StreamingContent
    public void writeTo(OutputStream outputStream) throws IOException {
        outputStream.write(this.f52241c);
        outputStream.flush();
    }
}