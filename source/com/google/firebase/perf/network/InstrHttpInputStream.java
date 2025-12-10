package com.google.firebase.perf.network;

import com.google.firebase.perf.metrics.NetworkRequestMetricBuilder;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes4.dex */
public final class InstrHttpInputStream extends InputStream {

    /* renamed from: a */
    public final InputStream f56212a;

    /* renamed from: b */
    public final NetworkRequestMetricBuilder f56213b;

    /* renamed from: c */
    public final Timer f56214c;

    /* renamed from: e */
    public long f56216e;

    /* renamed from: d */
    public long f56215d = -1;

    /* renamed from: f */
    public long f56217f = -1;

    public InstrHttpInputStream(InputStream inputStream, NetworkRequestMetricBuilder networkRequestMetricBuilder, Timer timer) {
        this.f56214c = timer;
        this.f56212a = inputStream;
        this.f56213b = networkRequestMetricBuilder;
        this.f56216e = networkRequestMetricBuilder.getTimeToResponseInitiatedMicros();
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        try {
            return this.f56212a.available();
        } catch (IOException e) {
            this.f56213b.setTimeToResponseCompletedMicros(this.f56214c.getDurationMicros());
            NetworkRequestMetricBuilderUtil.logError(this.f56213b);
            throw e;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        long durationMicros = this.f56214c.getDurationMicros();
        if (this.f56217f == -1) {
            this.f56217f = durationMicros;
        }
        try {
            this.f56212a.close();
            long j = this.f56215d;
            if (j != -1) {
                this.f56213b.setResponsePayloadBytes(j);
            }
            long j2 = this.f56216e;
            if (j2 != -1) {
                this.f56213b.setTimeToResponseInitiatedMicros(j2);
            }
            this.f56213b.setTimeToResponseCompletedMicros(this.f56217f);
            this.f56213b.build();
        } catch (IOException e) {
            this.f56213b.setTimeToResponseCompletedMicros(this.f56214c.getDurationMicros());
            NetworkRequestMetricBuilderUtil.logError(this.f56213b);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public void mark(int i) {
        this.f56212a.mark(i);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f56212a.markSupported();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        try {
            int read = this.f56212a.read();
            long durationMicros = this.f56214c.getDurationMicros();
            if (this.f56216e == -1) {
                this.f56216e = durationMicros;
            }
            if (read == -1 && this.f56217f == -1) {
                this.f56217f = durationMicros;
                this.f56213b.setTimeToResponseCompletedMicros(durationMicros);
                this.f56213b.build();
            } else {
                long j = this.f56215d + 1;
                this.f56215d = j;
                this.f56213b.setResponsePayloadBytes(j);
            }
            return read;
        } catch (IOException e) {
            this.f56213b.setTimeToResponseCompletedMicros(this.f56214c.getDurationMicros());
            NetworkRequestMetricBuilderUtil.logError(this.f56213b);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public void reset() throws IOException {
        try {
            this.f56212a.reset();
        } catch (IOException e) {
            this.f56213b.setTimeToResponseCompletedMicros(this.f56214c.getDurationMicros());
            NetworkRequestMetricBuilderUtil.logError(this.f56213b);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        try {
            long skip = this.f56212a.skip(j);
            long durationMicros = this.f56214c.getDurationMicros();
            if (this.f56216e == -1) {
                this.f56216e = durationMicros;
            }
            if (skip == -1 && this.f56217f == -1) {
                this.f56217f = durationMicros;
                this.f56213b.setTimeToResponseCompletedMicros(durationMicros);
            } else {
                long j2 = this.f56215d + skip;
                this.f56215d = j2;
                this.f56213b.setResponsePayloadBytes(j2);
            }
            return skip;
        } catch (IOException e) {
            this.f56213b.setTimeToResponseCompletedMicros(this.f56214c.getDurationMicros());
            NetworkRequestMetricBuilderUtil.logError(this.f56213b);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        try {
            int read = this.f56212a.read(bArr, i, i2);
            long durationMicros = this.f56214c.getDurationMicros();
            if (this.f56216e == -1) {
                this.f56216e = durationMicros;
            }
            if (read == -1 && this.f56217f == -1) {
                this.f56217f = durationMicros;
                this.f56213b.setTimeToResponseCompletedMicros(durationMicros);
                this.f56213b.build();
            } else {
                long j = this.f56215d + read;
                this.f56215d = j;
                this.f56213b.setResponsePayloadBytes(j);
            }
            return read;
        } catch (IOException e) {
            this.f56213b.setTimeToResponseCompletedMicros(this.f56214c.getDurationMicros());
            NetworkRequestMetricBuilderUtil.logError(this.f56213b);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        try {
            int read = this.f56212a.read(bArr);
            long durationMicros = this.f56214c.getDurationMicros();
            if (this.f56216e == -1) {
                this.f56216e = durationMicros;
            }
            if (read == -1 && this.f56217f == -1) {
                this.f56217f = durationMicros;
                this.f56213b.setTimeToResponseCompletedMicros(durationMicros);
                this.f56213b.build();
            } else {
                long j = this.f56215d + read;
                this.f56215d = j;
                this.f56213b.setResponsePayloadBytes(j);
            }
            return read;
        } catch (IOException e) {
            this.f56213b.setTimeToResponseCompletedMicros(this.f56214c.getDurationMicros());
            NetworkRequestMetricBuilderUtil.logError(this.f56213b);
            throw e;
        }
    }
}
