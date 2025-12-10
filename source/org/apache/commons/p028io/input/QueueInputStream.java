package org.apache.commons.p028io.input;

import java.io.InputStream;
import java.time.Duration;
import java.util.Objects;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import org.apache.commons.p028io.build.AbstractStreamBuilder;
import org.apache.commons.p028io.output.QueueOutputStream;

/* renamed from: org.apache.commons.io.input.QueueInputStream */
/* loaded from: classes6.dex */
public class QueueInputStream extends InputStream {

    /* renamed from: a */
    public final BlockingQueue f73404a;

    /* renamed from: b */
    public final long f73405b;

    /* renamed from: org.apache.commons.io.input.QueueInputStream$Builder */
    /* loaded from: classes6.dex */
    public static class Builder extends AbstractStreamBuilder<QueueInputStream, Builder> {

        /* renamed from: k */
        public BlockingQueue f73406k = new LinkedBlockingQueue();

        /* renamed from: l */
        public Duration f73407l;

        public Builder() {
            Duration duration;
            duration = Duration.ZERO;
            this.f73407l = duration;
        }

        public Builder setBlockingQueue(BlockingQueue<Integer> blockingQueue) {
            if (blockingQueue == null) {
                blockingQueue = new LinkedBlockingQueue<>();
            }
            this.f73406k = blockingQueue;
            return this;
        }

        public Builder setTimeout(Duration duration) {
            long nanos;
            if (duration != null) {
                nanos = duration.toNanos();
                if (nanos < 0) {
                    throw new IllegalArgumentException("timeout must not be negative");
                }
            }
            if (duration == null) {
                duration = Duration.ZERO;
            }
            this.f73407l = duration;
            return this;
        }

        @Override // org.apache.commons.p028io.function.IOSupplier
        public QueueInputStream get() {
            return new QueueInputStream(this.f73406k, this.f73407l);
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    public QueueOutputStream newQueueOutputStream() {
        return new QueueOutputStream(this.f73404a);
    }

    @Override // java.io.InputStream
    public int read() {
        try {
            Integer num = (Integer) this.f73404a.poll(this.f73405b, TimeUnit.NANOSECONDS);
            if (num == null) {
                return -1;
            }
            return num.intValue() & 255;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new IllegalStateException(e);
        }
    }

    public QueueInputStream() {
        this(new LinkedBlockingQueue());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public QueueInputStream(java.util.concurrent.BlockingQueue<java.lang.Integer> r2) {
        /*
            r1 = this;
            java.time.Duration r0 = p000.ZS1.m65232a()
            r1.<init>(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.p028io.input.QueueInputStream.<init>(java.util.concurrent.BlockingQueue):void");
    }

    public QueueInputStream(BlockingQueue blockingQueue, Duration duration) {
        long nanos;
        Objects.requireNonNull(blockingQueue, "blockingQueue");
        this.f73404a = blockingQueue;
        Objects.requireNonNull(duration, "timeout");
        nanos = AbstractC23116yJ0.m310a(duration).toNanos();
        this.f73405b = nanos;
    }
}
