package com.google.firebase.perf.network;

import com.google.firebase.perf.metrics.NetworkRequestMetricBuilder;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes4.dex */
public final class InstrHttpOutputStream extends OutputStream {

    /* renamed from: a */
    public final OutputStream f56218a;

    /* renamed from: b */
    public final Timer f56219b;

    /* renamed from: c */
    public NetworkRequestMetricBuilder f56220c;

    /* renamed from: d */
    public long f56221d = -1;

    public InstrHttpOutputStream(OutputStream outputStream, NetworkRequestMetricBuilder networkRequestMetricBuilder, Timer timer) {
        this.f56218a = outputStream;
        this.f56220c = networkRequestMetricBuilder;
        this.f56219b = timer;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        long j = this.f56221d;
        if (j != -1) {
            this.f56220c.setRequestPayloadBytes(j);
        }
        this.f56220c.setTimeToRequestCompletedMicros(this.f56219b.getDurationMicros());
        try {
            this.f56218a.close();
        } catch (IOException e) {
            this.f56220c.setTimeToResponseCompletedMicros(this.f56219b.getDurationMicros());
            NetworkRequestMetricBuilderUtil.logError(this.f56220c);
            throw e;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        try {
            this.f56218a.flush();
        } catch (IOException e) {
            this.f56220c.setTimeToResponseCompletedMicros(this.f56219b.getDurationMicros());
            NetworkRequestMetricBuilderUtil.logError(this.f56220c);
            throw e;
        }
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        try {
            this.f56218a.write(i);
            long j = this.f56221d + 1;
            this.f56221d = j;
            this.f56220c.setRequestPayloadBytes(j);
        } catch (IOException e) {
            this.f56220c.setTimeToResponseCompletedMicros(this.f56219b.getDurationMicros());
            NetworkRequestMetricBuilderUtil.logError(this.f56220c);
            throw e;
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        try {
            this.f56218a.write(bArr);
            long length = this.f56221d + bArr.length;
            this.f56221d = length;
            this.f56220c.setRequestPayloadBytes(length);
        } catch (IOException e) {
            this.f56220c.setTimeToResponseCompletedMicros(this.f56219b.getDurationMicros());
            NetworkRequestMetricBuilderUtil.logError(this.f56220c);
            throw e;
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        try {
            this.f56218a.write(bArr, i, i2);
            long j = this.f56221d + i2;
            this.f56221d = j;
            this.f56220c.setRequestPayloadBytes(j);
        } catch (IOException e) {
            this.f56220c.setTimeToResponseCompletedMicros(this.f56219b.getDurationMicros());
            NetworkRequestMetricBuilderUtil.logError(this.f56220c);
            throw e;
        }
    }
}
