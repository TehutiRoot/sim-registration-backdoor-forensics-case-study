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
    public static final AndroidLogger f56236f = AndroidLogger.getInstance();

    /* renamed from: g */
    public static final long f56237g = TimeUnit.SECONDS.toMicros(1);

    /* renamed from: b */
    public final String f56239b;

    /* renamed from: c */
    public final long f56240c;

    /* renamed from: d */
    public ScheduledFuture f56241d = null;

    /* renamed from: e */
    public long f56242e = -1;
    public final ConcurrentLinkedQueue<CpuMetricReading> cpuMetricReadings = new ConcurrentLinkedQueue<>();

    /* renamed from: a */
    public final ScheduledExecutorService f56238a = Executors.newSingleThreadScheduledExecutor();

    public CpuGaugeCollector() {
        int myPid = Process.myPid();
        this.f56239b = "/proc/" + Integer.toString(myPid) + "/stat";
        this.f56240c = m38207d();
    }

    /* renamed from: a */
    public static /* synthetic */ void m38210a(CpuGaugeCollector cpuGaugeCollector, Timer timer) {
        cpuGaugeCollector.m38205f(timer);
    }

    /* renamed from: b */
    public static /* synthetic */ void m38209b(CpuGaugeCollector cpuGaugeCollector, Timer timer) {
        cpuGaugeCollector.m38206e(timer);
    }

    public static boolean isInvalidCollectionFrequency(long j) {
        return j <= 0;
    }

    /* renamed from: c */
    public final long m38208c(long j) {
        return Math.round((j / this.f56240c) * f56237g);
    }

    public void collectOnce(Timer timer) {
        m38204g(timer);
    }

    /* renamed from: d */
    public final long m38207d() {
        return Os.sysconf(OsConstants._SC_CLK_TCK);
    }

    /* renamed from: e */
    public final /* synthetic */ void m38206e(Timer timer) {
        CpuMetricReading m38202i = m38202i(timer);
        if (m38202i != null) {
            this.cpuMetricReadings.add(m38202i);
        }
    }

    /* renamed from: f */
    public final /* synthetic */ void m38205f(Timer timer) {
        CpuMetricReading m38202i = m38202i(timer);
        if (m38202i != null) {
            this.cpuMetricReadings.add(m38202i);
        }
    }

    /* renamed from: g */
    public final synchronized void m38204g(final Timer timer) {
        try {
            this.f56238a.schedule(new Runnable() { // from class: Ry
                {
                    CpuGaugeCollector.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    CpuGaugeCollector.m38209b(CpuGaugeCollector.this, timer);
                }
            }, 0L, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            AndroidLogger androidLogger = f56236f;
            androidLogger.warn("Unable to collect Cpu Metric: " + e.getMessage());
        }
    }

    /* renamed from: h */
    public final synchronized void m38203h(long j, final Timer timer) {
        this.f56242e = j;
        try {
            this.f56241d = this.f56238a.scheduleAtFixedRate(new Runnable() { // from class: Qy
                {
                    CpuGaugeCollector.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    CpuGaugeCollector.m38210a(CpuGaugeCollector.this, timer);
                }
            }, 0L, j, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            AndroidLogger androidLogger = f56236f;
            androidLogger.warn("Unable to start collecting Cpu Metrics: " + e.getMessage());
        }
    }

    /* renamed from: i */
    public final CpuMetricReading m38202i(Timer timer) {
        if (timer == null) {
            return null;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(this.f56239b));
            try {
                long currentTimestampMicros = timer.getCurrentTimestampMicros();
                String[] split = bufferedReader.readLine().split(HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR);
                long parseLong = Long.parseLong(split[13]);
                long parseLong2 = Long.parseLong(split[15]);
                CpuMetricReading build = CpuMetricReading.newBuilder().setClientTimeUs(currentTimestampMicros).setSystemTimeUs(m38208c(Long.parseLong(split[14]) + Long.parseLong(split[16]))).setUserTimeUs(m38208c(parseLong + parseLong2)).build();
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
            AndroidLogger androidLogger = f56236f;
            androidLogger.warn("Unable to read 'proc/[pid]/stat' file: " + e.getMessage());
            return null;
        } catch (ArrayIndexOutOfBoundsException e2) {
            e = e2;
            AndroidLogger androidLogger2 = f56236f;
            androidLogger2.warn("Unexpected '/proc/[pid]/stat' file format encountered: " + e.getMessage());
            return null;
        } catch (NullPointerException e3) {
            e = e3;
            AndroidLogger androidLogger22 = f56236f;
            androidLogger22.warn("Unexpected '/proc/[pid]/stat' file format encountered: " + e.getMessage());
            return null;
        } catch (NumberFormatException e4) {
            e = e4;
            AndroidLogger androidLogger222 = f56236f;
            androidLogger222.warn("Unexpected '/proc/[pid]/stat' file format encountered: " + e.getMessage());
            return null;
        }
    }

    public void startCollecting(long j, Timer timer) {
        long j2 = this.f56240c;
        if (j2 == -1 || j2 == 0 || isInvalidCollectionFrequency(j)) {
            return;
        }
        if (this.f56241d != null) {
            if (this.f56242e != j) {
                stopCollecting();
                m38203h(j, timer);
                return;
            }
            return;
        }
        m38203h(j, timer);
    }

    public void stopCollecting() {
        ScheduledFuture scheduledFuture = this.f56241d;
        if (scheduledFuture == null) {
            return;
        }
        scheduledFuture.cancel(false);
        this.f56241d = null;
        this.f56242e = -1L;
    }
}
