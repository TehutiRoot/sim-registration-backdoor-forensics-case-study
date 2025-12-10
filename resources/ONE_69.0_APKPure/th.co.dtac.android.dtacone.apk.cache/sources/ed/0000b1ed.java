package com.google.firebase.perf.network;

import com.google.firebase.perf.metrics.NetworkRequestMetricBuilder;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes4.dex */
public final class InstrHttpInputStream extends InputStream {

    /* renamed from: a */
    public final InputStream f56224a;

    /* renamed from: b */
    public final NetworkRequestMetricBuilder f56225b;

    /* renamed from: c */
    public final Timer f56226c;

    /* renamed from: e */
    public long f56228e;

    /* renamed from: d */
    public long f56227d = -1;

    /* renamed from: f */
    public long f56229f = -1;

    public InstrHttpInputStream(InputStream inputStream, NetworkRequestMetricBuilder networkRequestMetricBuilder, Timer timer) {
        this.f56226c = timer;
        this.f56224a = inputStream;
        this.f56225b = networkRequestMetricBuilder;
        this.f56228e = networkRequestMetricBuilder.getTimeToResponseInitiatedMicros();
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        try {
            return this.f56224a.available();
        } catch (IOException e) {
            this.f56225b.setTimeToResponseCompletedMicros(this.f56226c.getDurationMicros());
            NetworkRequestMetricBuilderUtil.logError(this.f56225b);
            throw e;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        long durationMicros = this.f56226c.getDurationMicros();
        if (this.f56229f == -1) {
            this.f56229f = durationMicros;
        }
        try {
            this.f56224a.close();
            long j = this.f56227d;
            if (j != -1) {
                this.f56225b.setResponsePayloadBytes(j);
            }
            long j2 = this.f56228e;
            if (j2 != -1) {
                this.f56225b.setTimeToResponseInitiatedMicros(j2);
            }
            this.f56225b.setTimeToResponseCompletedMicros(this.f56229f);
            this.f56225b.build();
        } catch (IOException e) {
            this.f56225b.setTimeToResponseCompletedMicros(this.f56226c.getDurationMicros());
            NetworkRequestMetricBuilderUtil.logError(this.f56225b);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public void mark(int i) {
        this.f56224a.mark(i);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f56224a.markSupported();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        try {
            int read = this.f56224a.read();
            long durationMicros = this.f56226c.getDurationMicros();
            if (this.f56228e == -1) {
                this.f56228e = durationMicros;
            }
            if (read == -1 && this.f56229f == -1) {
                this.f56229f = durationMicros;
                this.f56225b.setTimeToResponseCompletedMicros(durationMicros);
                this.f56225b.build();
            } else {
                long j = this.f56227d + 1;
                this.f56227d = j;
                this.f56225b.setResponsePayloadBytes(j);
            }
            return read;
        } catch (IOException e) {
            this.f56225b.setTimeToResponseCompletedMicros(this.f56226c.getDurationMicros());
            NetworkRequestMetricBuilderUtil.logError(this.f56225b);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public void reset() throws IOException {
        try {
            this.f56224a.reset();
        } catch (IOException e) {
            this.f56225b.setTimeToResponseCompletedMicros(this.f56226c.getDurationMicros());
            NetworkRequestMetricBuilderUtil.logError(this.f56225b);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        try {
            long skip = this.f56224a.skip(j);
            long durationMicros = this.f56226c.getDurationMicros();
            if (this.f56228e == -1) {
                this.f56228e = durationMicros;
            }
            if (skip == -1 && this.f56229f == -1) {
                this.f56229f = durationMicros;
                this.f56225b.setTimeToResponseCompletedMicros(durationMicros);
            } else {
                long j2 = this.f56227d + skip;
                this.f56227d = j2;
                this.f56225b.setResponsePayloadBytes(j2);
            }
            return skip;
        } catch (IOException e) {
            this.f56225b.setTimeToResponseCompletedMicros(this.f56226c.getDurationMicros());
            NetworkRequestMetricBuilderUtil.logError(this.f56225b);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        try {
            int read = this.f56224a.read(bArr, i, i2);
            long durationMicros = this.f56226c.getDurationMicros();
            if (this.f56228e == -1) {
                this.f56228e = durationMicros;
            }
            if (read == -1 && this.f56229f == -1) {
                this.f56229f = durationMicros;
                this.f56225b.setTimeToResponseCompletedMicros(durationMicros);
                this.f56225b.build();
            } else {
                long j = this.f56227d + read;
                this.f56227d = j;
                this.f56225b.setResponsePayloadBytes(j);
            }
            return read;
        } catch (IOException e) {
            this.f56225b.setTimeToResponseCompletedMicros(this.f56226c.getDurationMicros());
            NetworkRequestMetricBuilderUtil.logError(this.f56225b);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        try {
            int read = this.f56224a.read(bArr);
            long durationMicros = this.f56226c.getDurationMicros();
            if (this.f56228e == -1) {
                this.f56228e = durationMicros;
            }
            if (read == -1 && this.f56229f == -1) {
                this.f56229f = durationMicros;
                this.f56225b.setTimeToResponseCompletedMicros(durationMicros);
                this.f56225b.build();
            } else {
                long j = this.f56227d + read;
                this.f56227d = j;
                this.f56225b.setResponsePayloadBytes(j);
            }
            return read;
        } catch (IOException e) {
            this.f56225b.setTimeToResponseCompletedMicros(this.f56226c.getDurationMicros());
            NetworkRequestMetricBuilderUtil.logError(this.f56225b);
            throw e;
        }
    }
}