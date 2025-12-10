package com.google.firebase.perf.session.gauges;

import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.p016v1.AndroidMemoryReading;
import com.google.firebase.perf.session.gauges.MemoryGaugeCollector;
import com.google.firebase.perf.util.StorageUnit;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.util.Utils;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public class MemoryGaugeCollector {
    public static final long INVALID_MEMORY_COLLECTION_FREQUENCY = -1;

    /* renamed from: e */
    public static final AndroidLogger f56244e = AndroidLogger.getInstance();

    /* renamed from: a */
    public final ScheduledExecutorService f56245a;

    /* renamed from: b */
    public final Runtime f56246b;

    /* renamed from: c */
    public ScheduledFuture f56247c;

    /* renamed from: d */
    public long f56248d;
    public final ConcurrentLinkedQueue<AndroidMemoryReading> memoryMetricReadings;

    public MemoryGaugeCollector() {
        this(Executors.newSingleThreadScheduledExecutor(), Runtime.getRuntime());
    }

    /* renamed from: a */
    public static /* synthetic */ void m38197a(MemoryGaugeCollector memoryGaugeCollector, Timer timer) {
        memoryGaugeCollector.m38193e(timer);
    }

    /* renamed from: b */
    public static /* synthetic */ void m38196b(MemoryGaugeCollector memoryGaugeCollector, Timer timer) {
        memoryGaugeCollector.m38194d(timer);
    }

    public static boolean isInvalidCollectionFrequency(long j) {
        return j <= 0;
    }

    /* renamed from: c */
    public final int m38195c() {
        return Utils.saturatedIntCast(StorageUnit.BYTES.toKilobytes(this.f56246b.totalMemory() - this.f56246b.freeMemory()));
    }

    public void collectOnce(Timer timer) {
        m38192f(timer);
    }

    /* renamed from: d */
    public final /* synthetic */ void m38194d(Timer timer) {
        AndroidMemoryReading m38190h = m38190h(timer);
        if (m38190h != null) {
            this.memoryMetricReadings.add(m38190h);
        }
    }

    /* renamed from: e */
    public final /* synthetic */ void m38193e(Timer timer) {
        AndroidMemoryReading m38190h = m38190h(timer);
        if (m38190h != null) {
            this.memoryMetricReadings.add(m38190h);
        }
    }

    /* renamed from: f */
    public final synchronized void m38192f(final Timer timer) {
        try {
            this.f56245a.schedule(new Runnable() { // from class: Xr0
                {
                    MemoryGaugeCollector.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    MemoryGaugeCollector.m38196b(MemoryGaugeCollector.this, timer);
                }
            }, 0L, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            AndroidLogger androidLogger = f56244e;
            androidLogger.warn("Unable to collect Memory Metric: " + e.getMessage());
        }
    }

    /* renamed from: g */
    public final synchronized void m38191g(long j, final Timer timer) {
        this.f56248d = j;
        try {
            this.f56247c = this.f56245a.scheduleAtFixedRate(new Runnable() { // from class: Wr0
                {
                    MemoryGaugeCollector.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    MemoryGaugeCollector.m38197a(MemoryGaugeCollector.this, timer);
                }
            }, 0L, j, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            AndroidLogger androidLogger = f56244e;
            androidLogger.warn("Unable to start collecting Memory Metrics: " + e.getMessage());
        }
    }

    /* renamed from: h */
    public final AndroidMemoryReading m38190h(Timer timer) {
        if (timer == null) {
            return null;
        }
        return AndroidMemoryReading.newBuilder().setClientTimeUs(timer.getCurrentTimestampMicros()).setUsedAppJavaHeapMemoryKb(m38195c()).build();
    }

    public void startCollecting(long j, Timer timer) {
        if (isInvalidCollectionFrequency(j)) {
            return;
        }
        if (this.f56247c != null) {
            if (this.f56248d != j) {
                stopCollecting();
                m38191g(j, timer);
                return;
            }
            return;
        }
        m38191g(j, timer);
    }

    public void stopCollecting() {
        ScheduledFuture scheduledFuture = this.f56247c;
        if (scheduledFuture == null) {
            return;
        }
        scheduledFuture.cancel(false);
        this.f56247c = null;
        this.f56248d = -1L;
    }

    public MemoryGaugeCollector(ScheduledExecutorService scheduledExecutorService, Runtime runtime) {
        this.f56247c = null;
        this.f56248d = -1L;
        this.f56245a = scheduledExecutorService;
        this.memoryMetricReadings = new ConcurrentLinkedQueue<>();
        this.f56246b = runtime;
    }
}
