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

/* renamed from: ax1 */
/* loaded from: classes4.dex */
public final class C19095ax1 {

    /* renamed from: a */
    public final double f38868a;

    /* renamed from: b */
    public final double f38869b;

    /* renamed from: c */
    public final long f38870c;

    /* renamed from: d */
    public final long f38871d;

    /* renamed from: e */
    public final int f38872e;

    /* renamed from: f */
    public final BlockingQueue f38873f;

    /* renamed from: g */
    public final ThreadPoolExecutor f38874g;

    /* renamed from: h */
    public final Transport f38875h;

    /* renamed from: i */
    public final OnDemandCounter f38876i;

    /* renamed from: j */
    public int f38877j;

    /* renamed from: k */
    public long f38878k;

    /* renamed from: ax1$b */
    /* loaded from: classes4.dex */
    public final class RunnableC5336b implements Runnable {

        /* renamed from: a */
        public final CrashlyticsReportWithSessionId f38879a;

        /* renamed from: b */
        public final TaskCompletionSource f38880b;

        @Override // java.lang.Runnable
        public void run() {
            C19095ax1.this.m52064p(this.f38879a, this.f38880b);
            C19095ax1.this.f38876i.resetDroppedOnDemandExceptions();
            double m52073g = C19095ax1.this.m52073g();
            Logger logger = Logger.getLogger();
            logger.m39140d("Delay for: " + String.format(Locale.US, "%.2f", Double.valueOf(m52073g / 1000.0d)) + " s for report: " + this.f38879a.getSessionId());
            C19095ax1.m52063q(m52073g);
        }

        public RunnableC5336b(CrashlyticsReportWithSessionId crashlyticsReportWithSessionId, TaskCompletionSource taskCompletionSource) {
            C19095ax1.this = r1;
            this.f38879a = crashlyticsReportWithSessionId;
            this.f38880b = taskCompletionSource;
        }
    }

    public C19095ax1(Transport transport, Settings settings, OnDemandCounter onDemandCounter) {
        this(settings.onDemandUploadRatePerMinute, settings.onDemandBackoffBase, settings.onDemandBackoffStepDurationSeconds * 1000, transport, onDemandCounter);
    }

    /* renamed from: a */
    public static /* synthetic */ void m52079a(C19095ax1 c19095ax1, TaskCompletionSource taskCompletionSource, boolean z, CrashlyticsReportWithSessionId crashlyticsReportWithSessionId, Exception exc) {
        c19095ax1.m52066n(taskCompletionSource, z, crashlyticsReportWithSessionId, exc);
    }

    /* renamed from: b */
    public static /* synthetic */ void m52078b(C19095ax1 c19095ax1, CountDownLatch countDownLatch) {
        c19095ax1.m52067m(countDownLatch);
    }

    /* renamed from: q */
    public static void m52063q(double d) {
        try {
            Thread.sleep((long) d);
        } catch (InterruptedException unused) {
        }
    }

    /* renamed from: g */
    public final double m52073g() {
        return Math.min(3600000.0d, (60000.0d / this.f38868a) * Math.pow(this.f38869b, m52072h()));
    }

    /* renamed from: h */
    public final int m52072h() {
        int max;
        if (this.f38878k == 0) {
            this.f38878k = m52065o();
        }
        int m52065o = (int) ((m52065o() - this.f38878k) / this.f38870c);
        if (m52068l()) {
            max = Math.min(100, this.f38877j + m52065o);
        } else {
            max = Math.max(0, this.f38877j - m52065o);
        }
        if (this.f38877j != max) {
            this.f38877j = max;
            this.f38878k = m52065o();
        }
        return max;
    }

    /* renamed from: i */
    public TaskCompletionSource m52071i(CrashlyticsReportWithSessionId crashlyticsReportWithSessionId, boolean z) {
        synchronized (this.f38873f) {
            try {
                TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                if (z) {
                    this.f38876i.incrementRecordedOnDemandExceptions();
                    if (m52069k()) {
                        Logger logger = Logger.getLogger();
                        logger.m39140d("Enqueueing report: " + crashlyticsReportWithSessionId.getSessionId());
                        Logger logger2 = Logger.getLogger();
                        logger2.m39140d("Queue size: " + this.f38873f.size());
                        this.f38874g.execute(new RunnableC5336b(crashlyticsReportWithSessionId, taskCompletionSource));
                        Logger logger3 = Logger.getLogger();
                        logger3.m39140d("Closing task for report: " + crashlyticsReportWithSessionId.getSessionId());
                        taskCompletionSource.trySetResult(crashlyticsReportWithSessionId);
                        return taskCompletionSource;
                    }
                    m52072h();
                    Logger logger4 = Logger.getLogger();
                    logger4.m39140d("Dropping report due to queue being full: " + crashlyticsReportWithSessionId.getSessionId());
                    this.f38876i.incrementDroppedOnDemandExceptions();
                    taskCompletionSource.trySetResult(crashlyticsReportWithSessionId);
                    return taskCompletionSource;
                }
                m52064p(crashlyticsReportWithSessionId, taskCompletionSource);
                return taskCompletionSource;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: j */
    public void m52070j() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        new Thread(new Runnable() { // from class: Zw1
            {
                C19095ax1.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C19095ax1.m52078b(C19095ax1.this, countDownLatch);
            }
        }).start();
        Utils.awaitUninterruptibly(countDownLatch, 2L, TimeUnit.SECONDS);
    }

    /* renamed from: k */
    public final boolean m52069k() {
        if (this.f38873f.size() < this.f38872e) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public final boolean m52068l() {
        if (this.f38873f.size() == this.f38872e) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public final /* synthetic */ void m52067m(CountDownLatch countDownLatch) {
        try {
            ForcedSender.sendBlocking(this.f38875h, Priority.HIGHEST);
        } catch (Exception unused) {
        }
        countDownLatch.countDown();
    }

    /* renamed from: n */
    public final /* synthetic */ void m52066n(TaskCompletionSource taskCompletionSource, boolean z, CrashlyticsReportWithSessionId crashlyticsReportWithSessionId, Exception exc) {
        if (exc != null) {
            taskCompletionSource.trySetException(exc);
            return;
        }
        if (z) {
            m52070j();
        }
        taskCompletionSource.trySetResult(crashlyticsReportWithSessionId);
    }

    /* renamed from: o */
    public final long m52065o() {
        return System.currentTimeMillis();
    }

    /* renamed from: p */
    public final void m52064p(final CrashlyticsReportWithSessionId crashlyticsReportWithSessionId, final TaskCompletionSource taskCompletionSource) {
        final boolean z;
        Logger logger = Logger.getLogger();
        logger.m39140d("Sending report through Google DataTransport: " + crashlyticsReportWithSessionId.getSessionId());
        if (SystemClock.elapsedRealtime() - this.f38871d < BuyDolAddBankAccountFragment.WAIT_MILLI) {
            z = true;
        } else {
            z = false;
        }
        this.f38875h.schedule(Event.ofUrgent(crashlyticsReportWithSessionId.getReport()), new TransportScheduleCallback() { // from class: Yw1
            @Override // com.google.android.datatransport.TransportScheduleCallback
            public final void onSchedule(Exception exc) {
                C19095ax1.m52079a(C19095ax1.this, taskCompletionSource, z, crashlyticsReportWithSessionId, exc);
            }
        });
    }

    public C19095ax1(double d, double d2, long j, Transport transport, OnDemandCounter onDemandCounter) {
        this.f38868a = d;
        this.f38869b = d2;
        this.f38870c = j;
        this.f38875h = transport;
        this.f38876i = onDemandCounter;
        this.f38871d = SystemClock.elapsedRealtime();
        int i = (int) d;
        this.f38872e = i;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i);
        this.f38873f = arrayBlockingQueue;
        this.f38874g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.f38877j = 0;
        this.f38878k = 0L;
    }
}
