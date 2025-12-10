package p000;

import android.os.SystemClock;
import com.google.android.datatransport.Event;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.Transport;
import com.google.android.datatransport.TransportScheduleCallback;
import com.google.android.datatransport.runtime.ForcedSender;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId;
import com.google.firebase.crashlytics.internal.common.OnDemandCounter;
import com.google.firebase.crashlytics.internal.common.Utils;
import com.google.firebase.crashlytics.internal.settings.Settings;
import java.util.Locale;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import th.p047co.dtac.android.dtacone.view.fragment.buy_dol.BuyDolAddBankAccountFragment;

/* renamed from: Xx1 */
/* loaded from: classes4.dex */
public final class C18839Xx1 {

    /* renamed from: a */
    public final double f7713a;

    /* renamed from: b */
    public final double f7714b;

    /* renamed from: c */
    public final long f7715c;

    /* renamed from: d */
    public final long f7716d;

    /* renamed from: e */
    public final int f7717e;

    /* renamed from: f */
    public final BlockingQueue f7718f;

    /* renamed from: g */
    public final ThreadPoolExecutor f7719g;

    /* renamed from: h */
    public final Transport f7720h;

    /* renamed from: i */
    public final OnDemandCounter f7721i;

    /* renamed from: j */
    public int f7722j;

    /* renamed from: k */
    public long f7723k;

    /* renamed from: Xx1$b */
    /* loaded from: classes4.dex */
    public final class RunnableC1704b implements Runnable {

        /* renamed from: a */
        public final CrashlyticsReportWithSessionId f7724a;

        /* renamed from: b */
        public final TaskCompletionSource f7725b;

        @Override // java.lang.Runnable
        public void run() {
            C18839Xx1.this.m65509p(this.f7724a, this.f7725b);
            C18839Xx1.this.f7721i.resetDroppedOnDemandExceptions();
            double m65518g = C18839Xx1.this.m65518g();
            Logger logger = Logger.getLogger();
            logger.m39132d("Delay for: " + String.format(Locale.US, "%.2f", Double.valueOf(m65518g / 1000.0d)) + " s for report: " + this.f7724a.getSessionId());
            C18839Xx1.m65508q(m65518g);
        }

        public RunnableC1704b(CrashlyticsReportWithSessionId crashlyticsReportWithSessionId, TaskCompletionSource taskCompletionSource) {
            C18839Xx1.this = r1;
            this.f7724a = crashlyticsReportWithSessionId;
            this.f7725b = taskCompletionSource;
        }
    }

    public C18839Xx1(Transport transport, Settings settings, OnDemandCounter onDemandCounter) {
        this(settings.onDemandUploadRatePerMinute, settings.onDemandBackoffBase, settings.onDemandBackoffStepDurationSeconds * 1000, transport, onDemandCounter);
    }

    /* renamed from: a */
    public static /* synthetic */ void m65524a(C18839Xx1 c18839Xx1, TaskCompletionSource taskCompletionSource, boolean z, CrashlyticsReportWithSessionId crashlyticsReportWithSessionId, Exception exc) {
        c18839Xx1.m65511n(taskCompletionSource, z, crashlyticsReportWithSessionId, exc);
    }

    /* renamed from: b */
    public static /* synthetic */ void m65523b(C18839Xx1 c18839Xx1, CountDownLatch countDownLatch) {
        c18839Xx1.m65512m(countDownLatch);
    }

    /* renamed from: q */
    public static void m65508q(double d) {
        try {
            Thread.sleep((long) d);
        } catch (InterruptedException unused) {
        }
    }

    /* renamed from: g */
    public final double m65518g() {
        return Math.min(3600000.0d, (60000.0d / this.f7713a) * Math.pow(this.f7714b, m65517h()));
    }

    /* renamed from: h */
    public final int m65517h() {
        int max;
        if (this.f7723k == 0) {
            this.f7723k = m65510o();
        }
        int m65510o = (int) ((m65510o() - this.f7723k) / this.f7715c);
        if (m65513l()) {
            max = Math.min(100, this.f7722j + m65510o);
        } else {
            max = Math.max(0, this.f7722j - m65510o);
        }
        if (this.f7722j != max) {
            this.f7722j = max;
            this.f7723k = m65510o();
        }
        return max;
    }

    /* renamed from: i */
    public TaskCompletionSource m65516i(CrashlyticsReportWithSessionId crashlyticsReportWithSessionId, boolean z) {
        synchronized (this.f7718f) {
            try {
                TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                if (z) {
                    this.f7721i.incrementRecordedOnDemandExceptions();
                    if (m65514k()) {
                        Logger logger = Logger.getLogger();
                        logger.m39132d("Enqueueing report: " + crashlyticsReportWithSessionId.getSessionId());
                        Logger logger2 = Logger.getLogger();
                        logger2.m39132d("Queue size: " + this.f7718f.size());
                        this.f7719g.execute(new RunnableC1704b(crashlyticsReportWithSessionId, taskCompletionSource));
                        Logger logger3 = Logger.getLogger();
                        logger3.m39132d("Closing task for report: " + crashlyticsReportWithSessionId.getSessionId());
                        taskCompletionSource.trySetResult(crashlyticsReportWithSessionId);
                        return taskCompletionSource;
                    }
                    m65517h();
                    Logger logger4 = Logger.getLogger();
                    logger4.m39132d("Dropping report due to queue being full: " + crashlyticsReportWithSessionId.getSessionId());
                    this.f7721i.incrementDroppedOnDemandExceptions();
                    taskCompletionSource.trySetResult(crashlyticsReportWithSessionId);
                    return taskCompletionSource;
                }
                m65509p(crashlyticsReportWithSessionId, taskCompletionSource);
                return taskCompletionSource;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: j */
    public void m65515j() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        new Thread(new Runnable() { // from class: Wx1
            @Override // java.lang.Runnable
            public final void run() {
                C18839Xx1.m65523b(C18839Xx1.this, countDownLatch);
            }
        }).start();
        Utils.awaitUninterruptibly(countDownLatch, 2L, TimeUnit.SECONDS);
    }

    /* renamed from: k */
    public final boolean m65514k() {
        if (this.f7718f.size() < this.f7717e) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public final boolean m65513l() {
        if (this.f7718f.size() == this.f7717e) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public final /* synthetic */ void m65512m(CountDownLatch countDownLatch) {
        try {
            ForcedSender.sendBlocking(this.f7720h, Priority.HIGHEST);
        } catch (Exception unused) {
        }
        countDownLatch.countDown();
    }

    /* renamed from: n */
    public final /* synthetic */ void m65511n(TaskCompletionSource taskCompletionSource, boolean z, CrashlyticsReportWithSessionId crashlyticsReportWithSessionId, Exception exc) {
        if (exc != null) {
            taskCompletionSource.trySetException(exc);
            return;
        }
        if (z) {
            m65515j();
        }
        taskCompletionSource.trySetResult(crashlyticsReportWithSessionId);
    }

    /* renamed from: o */
    public final long m65510o() {
        return System.currentTimeMillis();
    }

    /* renamed from: p */
    public final void m65509p(final CrashlyticsReportWithSessionId crashlyticsReportWithSessionId, final TaskCompletionSource taskCompletionSource) {
        final boolean z;
        Logger logger = Logger.getLogger();
        logger.m39132d("Sending report through Google DataTransport: " + crashlyticsReportWithSessionId.getSessionId());
        if (SystemClock.elapsedRealtime() - this.f7716d < BuyDolAddBankAccountFragment.WAIT_MILLI) {
            z = true;
        } else {
            z = false;
        }
        this.f7720h.schedule(Event.ofUrgent(crashlyticsReportWithSessionId.getReport()), new TransportScheduleCallback() { // from class: Vx1
            @Override // com.google.android.datatransport.TransportScheduleCallback
            public final void onSchedule(Exception exc) {
                C18839Xx1.m65524a(C18839Xx1.this, taskCompletionSource, z, crashlyticsReportWithSessionId, exc);
            }
        });
    }

    public C18839Xx1(double d, double d2, long j, Transport transport, OnDemandCounter onDemandCounter) {
        this.f7713a = d;
        this.f7714b = d2;
        this.f7715c = j;
        this.f7720h = transport;
        this.f7721i = onDemandCounter;
        this.f7716d = SystemClock.elapsedRealtime();
        int i = (int) d;
        this.f7717e = i;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i);
        this.f7718f = arrayBlockingQueue;
        this.f7719g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.f7722j = 0;
        this.f7723k = 0L;
    }
}