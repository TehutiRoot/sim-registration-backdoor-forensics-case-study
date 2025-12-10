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
    public static final AndroidLogger f56256e = AndroidLogger.getInstance();

    /* renamed from: a */
    public final ScheduledExecutorService f56257a;

    /* renamed from: b */
    public final Runtime f56258b;

    /* renamed from: c */
    public ScheduledFuture f56259c;

    /* renamed from: d */
    public long f56260d;
    public final ConcurrentLinkedQueue<AndroidMemoryReading> memoryMetricReadings;

    public MemoryGaugeCollector() {
        this(Executors.newSingleThreadScheduledExecutor(), Runtime.getRuntime());
    }

    /* renamed from: a */
    public static /* synthetic */ void m38189a(MemoryGaugeCollector memoryGaugeCollector, Timer timer) {
        memoryGaugeCollector.m38185e(timer);
    }

    /* renamed from: b */
    public static /* synthetic */ void m38188b(MemoryGaugeCollector memoryGaugeCollector, Timer timer) {
        memoryGaugeCollector.m38186d(timer);
    }

    public static boolean isInvalidCollectionFrequency(long j) {
        return j <= 0;
    }

    /* renamed from: c */
    public final int m38187c() {
        return Utils.saturatedIntCast(StorageUnit.BYTES.toKilobytes(this.f56258b.totalMemory() - this.f56258b.freeMemory()));
    }

    public void collectOnce(Timer timer) {
        m38184f(timer);
    }

    /* renamed from: d */
    public final /* synthetic */ void m38186d(Timer timer) {
        AndroidMemoryReading m38182h = m38182h(timer);
        if (m38182h != null) {
            this.memoryMetricReadings.add(m38182h);
        }
    }

    /* renamed from: e */
    public final /* synthetic */ void m38185e(Timer timer) {
        AndroidMemoryReading m38182h = m38182h(timer);
        if (m38182h != null) {
            this.memoryMetricReadings.add(m38182h);
        }
    }

    /* renamed from: f */
    public final synchronized void m38184f(final Timer timer) {
        try {
            this.f56257a.schedule(new Runnable() { // from class: ds0
                @Override // java.lang.Runnable
                public final void run() {
                    MemoryGaugeCollector.m38188b(MemoryGaugeCollector.this, timer);
                }
            }, 0L, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            AndroidLogger androidLogger = f56256e;
            androidLogger.warn("Unable to collect Memory Metric: " + e.getMessage());
        }
    }

    /* renamed from: g */
    public final synchronized void m38183g(long j, final Timer timer) {
        this.f56260d = j;
        try {
            this.f56259c = this.f56257a.scheduleAtFixedRate(new Runnable() { // from class: cs0
                @Override // java.lang.Runnable
                public final void run() {
                    MemoryGaugeCollector.m38189a(MemoryGaugeCollector.this, timer);
                }
            }, 0L, j, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            AndroidLogger androidLogger = f56256e;
            androidLogger.warn("Unable to start collecting Memory Metrics: " + e.getMessage());
        }
    }

    /* renamed from: h */
    public final AndroidMemoryReading m38182h(Timer timer) {
        if (timer == null) {
            return null;
        }
        return AndroidMemoryReading.newBuilder().setClientTimeUs(timer.getCurrentTimestampMicros()).setUsedAppJavaHeapMemoryKb(m38187c()).build();
    }

    public void startCollecting(long j, Timer timer) {
        if (isInvalidCollectionFrequency(j)) {
            return;
        }
        if (this.f56259c != null) {
            if (this.f56260d != j) {
                stopCollecting();
                m38183g(j, timer);
                return;
            }
            return;
        }
        m38183g(j, timer);
    }

    public void stopCollecting() {
        ScheduledFuture scheduledFuture = this.f56259c;
        if (scheduledFuture == null) {
            return;
        }
        scheduledFuture.cancel(false);
        this.f56259c = null;
        this.f56260d = -1L;
    }

    public MemoryGaugeCollector(ScheduledExecutorService scheduledExecutorService, Runtime runtime) {
        this.f56259c = null;
        this.f56260d = -1L;
        this.f56257a = scheduledExecutorService;
        this.memoryMetricReadings = new ConcurrentLinkedQueue<>();
        this.f56258b = runtime;
    }
}