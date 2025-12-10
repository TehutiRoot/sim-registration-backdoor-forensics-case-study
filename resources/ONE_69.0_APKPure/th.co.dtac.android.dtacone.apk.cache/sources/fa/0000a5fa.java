package com.google.api.client.http;

import com.google.api.client.util.StreamingContent;
import java.io.IOException;

/* loaded from: classes4.dex */
public abstract class LowLevelHttpRequest {

    /* renamed from: a */
    public long f52157a = -1;

    /* renamed from: b */
    public String f52158b;

    /* renamed from: c */
    public String f52159c;

    /* renamed from: d */
    public StreamingContent f52160d;

    public abstract void addHeader(String str, String str2) throws IOException;

    public abstract LowLevelHttpResponse execute() throws IOException;

    public final String getContentEncoding() {
        return this.f52158b;
    }

    public final long getContentLength() {
        return this.f52157a;
    }

    public final String getContentType() {
        return this.f52159c;
    }

    public final StreamingContent getStreamingContent() {
        return this.f52160d;
    }

    public final void setContentEncoding(String str) throws IOException {
        this.f52158b = str;
    }

    public final void setContentLength(long j) throws IOException {
        this.f52157a = j;
    }

    public final void setContentType(String str) throws IOException {
        this.f52159c = str;
    }

    public final void setStreamingContent(StreamingContent streamingContent) throws IOException {
        this.f52160d = streamingContent;
    }

    public void setTimeout(int i, int i2) throws IOException {
    }

    public void setWriteTimeout(int i) throws IOException {
    }
}