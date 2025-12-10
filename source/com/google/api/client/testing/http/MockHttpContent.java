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
    public String f52228b;

    /* renamed from: a */
    public long f52227a = -1;

    /* renamed from: c */
    public byte[] f52229c = new byte[0];

    public final byte[] getContent() {
        return this.f52229c;
    }

    @Override // com.google.api.client.http.HttpContent
    public long getLength() throws IOException {
        return this.f52227a;
    }

    @Override // com.google.api.client.http.HttpContent
    public String getType() {
        return this.f52228b;
    }

    @Override // com.google.api.client.http.HttpContent
    public boolean retrySupported() {
        return true;
    }

    public MockHttpContent setContent(byte[] bArr) {
        this.f52229c = (byte[]) Preconditions.checkNotNull(bArr);
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
        this.f52227a = j;
        return this;
    }

    public MockHttpContent setType(String str) {
        this.f52228b = str;
        return this;
    }

    @Override // com.google.api.client.http.HttpContent, com.google.api.client.util.StreamingContent
    public void writeTo(OutputStream outputStream) throws IOException {
        outputStream.write(this.f52229c);
        outputStream.flush();
    }
}
