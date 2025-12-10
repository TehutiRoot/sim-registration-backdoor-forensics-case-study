package com.google.api.client.util;

import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes4.dex */
public final class LoggingStreamingContent implements StreamingContent {

    /* renamed from: a */
    public final StreamingContent f52337a;

    /* renamed from: b */
    public final int f52338b;

    /* renamed from: c */
    public final Level f52339c;

    /* renamed from: d */
    public final Logger f52340d;

    public LoggingStreamingContent(StreamingContent streamingContent, Logger logger, Level level, int i) {
        this.f52337a = streamingContent;
        this.f52340d = logger;
        this.f52339c = level;
        this.f52338b = i;
    }

    @Override // com.google.api.client.util.StreamingContent
    public void writeTo(OutputStream outputStream) throws IOException {
        LoggingOutputStream loggingOutputStream = new LoggingOutputStream(outputStream, this.f52340d, this.f52339c, this.f52338b);
        try {
            this.f52337a.writeTo(loggingOutputStream);
            loggingOutputStream.getLogStream().close();
            outputStream.flush();
        } catch (Throwable th2) {
            loggingOutputStream.getLogStream().close();
            throw th2;
        }
    }
}
