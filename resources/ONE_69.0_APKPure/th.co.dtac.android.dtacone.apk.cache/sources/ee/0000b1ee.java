package com.google.firebase.perf.network;

import com.google.firebase.perf.metrics.NetworkRequestMetricBuilder;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes4.dex */
public final class InstrHttpOutputStream extends OutputStream {

    /* renamed from: a */
    public final OutputStream f56230a;

    /* renamed from: b */
    public final Timer f56231b;

    /* renamed from: c */
    public NetworkRequestMetricBuilder f56232c;

    /* renamed from: d */
    public long f56233d = -1;

    public InstrHttpOutputStream(OutputStream outputStream, NetworkRequestMetricBuilder networkRequestMetricBuilder, Timer timer) {
        this.f56230a = outputStream;
        this.f56232c = networkRequestMetricBuilder;
        this.f56231b = timer;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        long j = this.f56233d;
        if (j != -1) {
            this.f56232c.setRequestPayloadBytes(j);
        }
        this.f56232c.setTimeToRequestCompletedMicros(this.f56231b.getDurationMicros());
        try {
            this.f56230a.close();
        } catch (IOException e) {
            this.f56232c.setTimeToResponseCompletedMicros(this.f56231b.getDurationMicros());
            NetworkRequestMetricBuilderUtil.logError(this.f56232c);
            throw e;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        try {
            this.f56230a.flush();
        } catch (IOException e) {
            this.f56232c.setTimeToResponseCompletedMicros(this.f56231b.getDurationMicros());
            NetworkRequestMetricBuilderUtil.logError(this.f56232c);
            throw e;
        }
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        try {
            this.f56230a.write(i);
            long j = this.f56233d + 1;
            this.f56233d = j;
            this.f56232c.setRequestPayloadBytes(j);
        } catch (IOException e) {
            this.f56232c.setTimeToResponseCompletedMicros(this.f56231b.getDurationMicros());
            NetworkRequestMetricBuilderUtil.logError(this.f56232c);
            throw e;
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        try {
            this.f56230a.write(bArr);
            long length = this.f56233d + bArr.length;
            this.f56233d = length;
            this.f56232c.setRequestPayloadBytes(length);
        } catch (IOException e) {
            this.f56232c.setTimeToResponseCompletedMicros(this.f56231b.getDurationMicros());
            NetworkRequestMetricBuilderUtil.logError(this.f56232c);
            throw e;
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        try {
            this.f56230a.write(bArr, i, i2);
            long j = this.f56233d + i2;
            this.f56233d = j;
            this.f56232c.setRequestPayloadBytes(j);
        } catch (IOException e) {
            this.f56232c.setTimeToResponseCompletedMicros(this.f56231b.getDurationMicros());
            NetworkRequestMetricBuilderUtil.logError(this.f56232c);
            throw e;
        }
    }
}