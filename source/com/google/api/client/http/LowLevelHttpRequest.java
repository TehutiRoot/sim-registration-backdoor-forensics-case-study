package com.google.api.client.http;

import com.google.api.client.util.StreamingContent;
import java.io.IOException;

/* loaded from: classes4.dex */
public abstract class LowLevelHttpRequest {

    /* renamed from: a */
    public long f52145a = -1;

    /* renamed from: b */
    public String f52146b;

    /* renamed from: c */
    public String f52147c;

    /* renamed from: d */
    public StreamingContent f52148d;

    public abstract void addHeader(String str, String str2) throws IOException;

    public abstract LowLevelHttpResponse execute() throws IOException;

    public final String getContentEncoding() {
        return this.f52146b;
    }

    public final long getContentLength() {
        return this.f52145a;
    }

    public final String getContentType() {
        return this.f52147c;
    }

    public final StreamingContent getStreamingContent() {
        return this.f52148d;
    }

    public final void setContentEncoding(String str) throws IOException {
        this.f52146b = str;
    }

    public final void setContentLength(long j) throws IOException {
        this.f52145a = j;
    }

    public final void setContentType(String str) throws IOException {
        this.f52147c = str;
    }

    public final void setStreamingContent(StreamingContent streamingContent) throws IOException {
        this.f52148d = streamingContent;
    }

    public void setTimeout(int i, int i2) throws IOException {
    }

    public void setWriteTimeout(int i) throws IOException {
    }
}
