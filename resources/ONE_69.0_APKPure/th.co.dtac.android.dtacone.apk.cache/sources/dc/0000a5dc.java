package com.google.api.client.http;

import com.google.api.client.util.StreamingContent;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;

/* loaded from: classes4.dex */
public class GZipEncoding implements HttpEncoding {

    /* renamed from: com.google.api.client.http.GZipEncoding$a */
    /* loaded from: classes4.dex */
    public class C7281a extends BufferedOutputStream {
        public C7281a(OutputStream outputStream) {
            super(outputStream);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            try {
                flush();
            } catch (IOException unused) {
            }
        }
    }

    @Override // com.google.api.client.http.HttpEncoding
    public void encode(StreamingContent streamingContent, OutputStream outputStream) throws IOException {
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(new C7281a(outputStream));
        streamingContent.writeTo(gZIPOutputStream);
        gZIPOutputStream.close();
    }

    @Override // com.google.api.client.http.HttpEncoding
    public String getName() {
        return "gzip";
    }
}