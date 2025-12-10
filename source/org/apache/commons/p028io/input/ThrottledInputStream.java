package org.apache.commons.p028io.input;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.TimeUnit;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.apache.commons.p028io.function.IOIntConsumer;
import org.apache.commons.p028io.input.ProxyInputStream;

/* renamed from: org.apache.commons.io.input.ThrottledInputStream */
/* loaded from: classes6.dex */
public final class ThrottledInputStream extends CountingInputStream {

    /* renamed from: e */
    public final long f73478e;

    /* renamed from: f */
    public final long f73479f;

    /* renamed from: g */
    public Duration f73480g;

    /* renamed from: org.apache.commons.io.input.ThrottledInputStream$Builder */
    /* loaded from: classes6.dex */
    public static class Builder extends ProxyInputStream.AbstractBuilder<ThrottledInputStream, Builder> {

        /* renamed from: l */
        public long f73481l = Long.MAX_VALUE;

        @Override // org.apache.commons.p028io.input.ProxyInputStream.AbstractBuilder
        public /* bridge */ /* synthetic */ IOIntConsumer getAfterRead() {
            return super.getAfterRead();
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [org.apache.commons.io.build.AbstractStreamBuilder, org.apache.commons.io.input.ThrottledInputStream$Builder] */
        @Override // org.apache.commons.p028io.input.ProxyInputStream.AbstractBuilder
        public /* bridge */ /* synthetic */ Builder setAfterRead(IOIntConsumer iOIntConsumer) {
            return super.setAfterRead(iOIntConsumer);
        }

        public void setMaxBytesPerSecond(long j) {
            this.f73481l = j;
        }

        @Override // org.apache.commons.p028io.function.IOSupplier
        public ThrottledInputStream get() throws IOException {
            return new ThrottledInputStream(this);
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    /* renamed from: j */
    public static long m25046j(long j, long j2, long j3) {
        int i = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i >= 0) {
            if (j <= 0 || j2 <= 0 || i == 0) {
                return 0L;
            }
            long j4 = (long) (((j / j2) * 1000.0d) - j3);
            if (j4 <= 0) {
                return 0L;
            }
            return j4;
        }
        throw new IllegalArgumentException("The elapsed time should be greater or equal to zero");
    }

    @Override // org.apache.commons.p028io.input.ProxyInputStream
    public void beforeRead(int i) throws IOException {
        m25047i();
    }

    /* renamed from: d */
    public final long m25049d() {
        long currentTimeMillis = (System.currentTimeMillis() - this.f73479f) / 1000;
        if (currentTimeMillis == 0) {
            return getByteCount();
        }
        return getByteCount() / currentTimeMillis;
    }

    /* renamed from: g */
    public final long m25048g() {
        return m25046j(getByteCount(), this.f73478e, System.currentTimeMillis() - this.f73479f);
    }

    /* renamed from: i */
    public final void m25047i() {
        ChronoUnit chronoUnit;
        Duration plus;
        long m25048g = m25048g();
        if (m25048g > 0) {
            Duration duration = this.f73480g;
            chronoUnit = ChronoUnit.MILLIS;
            plus = duration.plus(m25048g, chronoUnit);
            this.f73480g = plus;
            try {
                TimeUnit.MILLISECONDS.sleep(m25048g);
            } catch (InterruptedException unused) {
                throw new InterruptedIOException("Thread aborted");
            }
        }
    }

    public String toString() {
        return "ThrottledInputStream[bytesRead=" + getByteCount() + ", maxBytesPerSec=" + this.f73478e + ", bytesPerSec=" + m25049d() + ", totalSleepDuration=" + this.f73480g + AbstractJsonLexerKt.END_LIST;
    }

    public ThrottledInputStream(Builder builder) {
        super(builder);
        Duration duration;
        this.f73479f = System.currentTimeMillis();
        duration = Duration.ZERO;
        this.f73480g = duration;
        if (builder.f73481l > 0) {
            this.f73478e = builder.f73481l;
            return;
        }
        throw new IllegalArgumentException("Bandwidth " + builder.f73481l + " is invalid.");
    }
}
