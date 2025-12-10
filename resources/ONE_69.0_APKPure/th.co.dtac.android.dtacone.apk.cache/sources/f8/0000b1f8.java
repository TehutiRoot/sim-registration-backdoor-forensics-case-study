package com.google.firebase.perf.session.gauges;

import android.os.Process;
import android.system.Os;
import android.system.OsConstants;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.p016v1.CpuMetricReading;
import com.google.firebase.perf.session.gauges.CpuGaugeCollector;
import com.google.firebase.perf.util.Timer;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.apache.commons.cli.HelpFormatter;

/* loaded from: classes4.dex */
public class CpuGaugeCollector {
    public static final long INVALID_CPU_COLLECTION_FREQUENCY = -1;

    /* renamed from: f */
    public static final AndroidLogger f56248f = AndroidLogger.getInstance();

    /* renamed from: g */
    public static final long f56249g = TimeUnit.SECONDS.toMicros(1);

    /* renamed from: b */
    public final String f56251b;

    /* renamed from: c */
    public final long f56252c;

    /* renamed from: d */
    public ScheduledFuture f56253d = null;

    /* renamed from: e */
    public long f56254e = -1;
    public final ConcurrentLinkedQueue<CpuMetricReading> cpuMetricReadings = new ConcurrentLinkedQueue<>();

    /* renamed from: a */
    public final ScheduledExecutorService f56250a = Executors.newSingleThreadScheduledExecutor();

    public CpuGaugeCollector() {
        int myPid = Process.myPid();
        this.f56251b = "/proc/" + Integer.toString(myPid) + "/stat";
        this.f56252c = m38199d();
    }

    /* renamed from: a */
    public static /* synthetic */ void m38202a(CpuGaugeCollector cpuGaugeCollector, Timer timer) {
        cpuGaugeCollector.m38197f(timer);
    }

    /* renamed from: b */
    public static /* synthetic */ void m38201b(CpuGaugeCollector cpuGaugeCollector, Timer timer) {
        cpuGaugeCollector.m38198e(timer);
    }

    public static boolean isInvalidCollectionFrequency(long j) {
        return j <= 0;
    }

    /* renamed from: c */
    public final long m38200c(long j) {
        return Math.round((j / this.f56252c) * f56249g);
    }

    public void collectOnce(Timer timer) {
        m38196g(timer);
    }

    /* renamed from: d */
    public final long m38199d() {
        return Os.sysconf(OsConstants._SC_CLK_TCK);
    }

    /* renamed from: e */
    public final /* synthetic */ void m38198e(Timer timer) {
        CpuMetricReading m38194i = m38194i(timer);
        if (m38194i != null) {
            this.cpuMetricReadings.add(m38194i);
        }
    }

    /* renamed from: f */
    public final /* synthetic */ void m38197f(Timer timer) {
        CpuMetricReading m38194i = m38194i(timer);
        if (m38194i != null) {
            this.cpuMetricReadings.add(m38194i);
        }
    }

    /* renamed from: g */
    public final synchronized void m38196g(final Timer timer) {
        try {
            this.f56250a.schedule(new Runnable() { // from class: Ry
                @Override // java.lang.Runnable
                public final void run() {
                    CpuGaugeCollector.m38201b(CpuGaugeCollector.this, timer);
                }
            }, 0L, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            AndroidLogger androidLogger = f56248f;
            androidLogger.warn("Unable to collect Cpu Metric: " + e.getMessage());
        }
    }

    /* renamed from: h */
    public final synchronized void m38195h(long j, final Timer timer) {
        this.f56254e = j;
        try {
            this.f56253d = this.f56250a.scheduleAtFixedRate(new Runnable() { // from class: Qy
                @Override // java.lang.Runnable
                public final void run() {
                    CpuGaugeCollector.m38202a(CpuGaugeCollector.this, timer);
                }
            }, 0L, j, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            AndroidLogger androidLogger = f56248f;
            androidLogger.warn("Unable to start collecting Cpu Metrics: " + e.getMessage());
        }
    }

    /* renamed from: i */
    public final CpuMetricReading m38194i(Timer timer) {
        if (timer == null) {
            return null;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(this.f56251b));
            try {
                long currentTimestampMicros = timer.getCurrentTimestampMicros();
                String[] split = bufferedReader.readLine().split(HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR);
                long parseLong = Long.parseLong(split[13]);
                long parseLong2 = Long.parseLong(split[15]);
                CpuMetricReading build = CpuMetricReading.newBuilder().setClientTimeUs(currentTimestampMicros).setSystemTimeUs(m38200c(Long.parseLong(split[14]) + Long.parseLong(split[16]))).setUserTimeUs(m38200c(parseLong + parseLong2)).build();
                bufferedReader.close();
                return build;
            } catch (Throwable th2) {
                try {
                    bufferedReader.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IOException e) {
            AndroidLogger androidLogger = f56248f;
            androidLogger.warn("Unable to read 'proc/[pid]/stat' file: " + e.getMessage());
            return null;
        } catch (ArrayIndexOutOfBoundsException e2) {
            e = e2;
            AndroidLogger androidLogger2 = f56248f;
            androidLogger2.warn("Unexpected '/proc/[pid]/stat' file format encountered: " + e.getMessage());
            return null;
        } catch (NullPointerException e3) {
            e = e3;
            AndroidLogger androidLogger22 = f56248f;
            androidLogger22.warn("Unexpected '/proc/[pid]/stat' file format encountered: " + e.getMessage());
            return null;
        } catch (NumberFormatException e4) {
            e = e4;
            AndroidLogger androidLogger222 = f56248f;
            androidLogger222.warn("Unexpected '/proc/[pid]/stat' file format encountered: " + e.getMessage());
            return null;
        }
    }

    public void startCollecting(long j, Timer timer) {
        long j2 = this.f56252c;
        if (j2 == -1 || j2 == 0 || isInvalidCollectionFrequency(j)) {
            return;
        }
        if (this.f56253d != null) {
            if (this.f56254e != j) {
                stopCollecting();
                m38195h(j, timer);
                return;
            }
            return;
        }
        m38195h(j, timer);
    }

    public void stopCollecting() {
        ScheduledFuture scheduledFuture = this.f56253d;
        if (scheduledFuture == null) {
            return;
        }
        scheduledFuture.cancel(false);
        this.f56253d = null;
        this.f56254e = -1L;
    }
}