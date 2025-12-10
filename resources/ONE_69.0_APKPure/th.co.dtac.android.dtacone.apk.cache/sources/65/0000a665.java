package com.google.api.client.util;

import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes4.dex */
public final class LoggingStreamingContent implements StreamingContent {

    /* renamed from: a */
    public final StreamingContent f52349a;

    /* renamed from: b */
    public final int f52350b;

    /* renamed from: c */
    public final Level f52351c;

    /* renamed from: d */
    public final Logger f52352d;

    public LoggingStreamingContent(StreamingContent streamingContent, Logger logger, Level level, int i) {
        this.f52349a = streamingContent;
        this.f52352d = logger;
        this.f52351c = level;
        this.f52350b = i;
    }

    @Override // com.google.api.client.util.StreamingContent
    public void writeTo(OutputStream outputStream) throws IOException {
        LoggingOutputStream loggingOutputStream = new LoggingOutputStream(outputStream, this.f52352d, this.f52351c, this.f52350b);
        try {
            this.f52349a.writeTo(loggingOutputStream);
            loggingOutputStream.getLogStream().close();
            outputStream.flush();
        } catch (Throwable th2) {
            loggingOutputStream.getLogStream().close();
            throw th2;
        }
    }
}