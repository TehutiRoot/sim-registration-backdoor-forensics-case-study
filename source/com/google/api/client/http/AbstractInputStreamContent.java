package com.google.api.client.http;

import com.google.api.client.util.IOUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes4.dex */
public abstract class AbstractInputStreamContent implements HttpContent {

    /* renamed from: a */
    public String f52024a;

    /* renamed from: b */
    public boolean f52025b = true;

    public AbstractInputStreamContent(String str) {
        setType(str);
    }

    public final boolean getCloseInputStream() {
        return this.f52025b;
    }

    public abstract InputStream getInputStream() throws IOException;

    @Override // com.google.api.client.http.HttpContent
    public String getType() {
        return this.f52024a;
    }

    public AbstractInputStreamContent setCloseInputStream(boolean z) {
        this.f52025b = z;
        return this;
    }

    public AbstractInputStreamContent setType(String str) {
        this.f52024a = str;
        return this;
    }

    @Override // com.google.api.client.http.HttpContent, com.google.api.client.util.StreamingContent
    public void writeTo(OutputStream outputStream) throws IOException {
        IOUtils.copy(getInputStream(), outputStream, this.f52025b);
        outputStream.flush();
    }
}
