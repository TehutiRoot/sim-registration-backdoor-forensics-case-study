package com.google.api.client.http;

import com.google.api.client.util.Preconditions;
import com.google.api.client.util.StreamingContent;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes4.dex */
public final class HttpEncodingStreamingContent implements StreamingContent {

    /* renamed from: a */
    public final StreamingContent f52060a;

    /* renamed from: b */
    public final HttpEncoding f52061b;

    public HttpEncodingStreamingContent(StreamingContent streamingContent, HttpEncoding httpEncoding) {
        this.f52060a = (StreamingContent) Preconditions.checkNotNull(streamingContent);
        this.f52061b = (HttpEncoding) Preconditions.checkNotNull(httpEncoding);
    }

    public StreamingContent getContent() {
        return this.f52060a;
    }

    public HttpEncoding getEncoding() {
        return this.f52061b;
    }

    @Override // com.google.api.client.util.StreamingContent
    public void writeTo(OutputStream outputStream) throws IOException {
        this.f52061b.encode(this.f52060a, outputStream);
    }
}