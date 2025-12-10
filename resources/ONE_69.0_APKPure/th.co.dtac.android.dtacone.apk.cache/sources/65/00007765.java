package androidx.work.impl.utils;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.work.Logger;
import androidx.work.RunnableScheduler;
import androidx.work.impl.model.WorkGenerationalId;
import java.util.HashMap;
import java.util.Map;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class WorkTimer {

    /* renamed from: e */
    public static final String f38859e = Logger.tagWithPrefix("WorkTimer");

    /* renamed from: a */
    public final RunnableScheduler f38860a;

    /* renamed from: b */
    public final Map f38861b = new HashMap();

    /* renamed from: c */
    public final Map f38862c = new HashMap();

    /* renamed from: d */
    public final Object f38863d = new Object();

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes.dex */
    public interface TimeLimitExceededListener {
        void onTimeLimitExceeded(@NonNull WorkGenerationalId workGenerationalId);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes.dex */
    public static class WorkTimerRunnable implements Runnable {

        /* renamed from: a */
        public final WorkTimer f38864a;

        /* renamed from: b */
        public final WorkGenerationalId f38865b;

        public WorkTimerRunnable(WorkTimer workTimer, WorkGenerationalId workGenerationalId) {
            this.f38864a = workTimer;
            this.f38865b = workGenerationalId;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f38864a.f38863d) {
                try {
                    if (((WorkTimerRunnable) this.f38864a.f38861b.remove(this.f38865b)) != null) {
                        TimeLimitExceededListener timeLimitExceededListener = (TimeLimitExceededListener) this.f38864a.f38862c.remove(this.f38865b);
                        if (timeLimitExceededListener != null) {
                            timeLimitExceededListener.onTimeLimitExceeded(this.f38865b);
                        }
                    } else {
                        Logger.get().debug("WrkTimerRunnable", String.format("Timer with %s is already marked as complete.", this.f38865b));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public WorkTimer(@NonNull RunnableScheduler runnableScheduler) {
        this.f38860a = runnableScheduler;
    }

    @NonNull
    @VisibleForTesting
    public Map<WorkGenerationalId, TimeLimitExceededListener> getListeners() {
        Map<WorkGenerationalId, TimeLimitExceededListener> map;
        synchronized (this.f38863d) {
            map = this.f38862c;
        }
        return map;
    }

    @NonNull
    @VisibleForTesting
    public Map<WorkGenerationalId, WorkTimerRunnable> getTimerMap() {
        Map<WorkGenerationalId, WorkTimerRunnable> map;
        synchronized (this.f38863d) {
            map = this.f38861b;
        }
        return map;
    }

    public void startTimer(@NonNull WorkGenerationalId workGenerationalId, long j, @NonNull TimeLimitExceededListener timeLimitExceededListener) {
        synchronized (this.f38863d) {
            Logger logger = Logger.get();
            String str = f38859e;
            logger.debug(str, "Starting timer for " + workGenerationalId);
            stopTimer(workGenerationalId);
            WorkTimerRunnable workTimerRunnable = new WorkTimerRunnable(this, workGenerationalId);
            this.f38861b.put(workGenerationalId, workTimerRunnable);
            this.f38862c.put(workGenerationalId, timeLimitExceededListener);
            this.f38860a.scheduleWithDelay(j, workTimerRunnable);
        }
    }

    public void stopTimer(@NonNull WorkGenerationalId workGenerationalId) {
        synchronized (this.f38863d) {
            try {
                if (((WorkTimerRunnable) this.f38861b.remove(workGenerationalId)) != null) {
                    Logger logger = Logger.get();
                    String str = f38859e;
                    logger.debug(str, "Stopping timer for " + workGenerationalId);
                    this.f38862c.remove(workGenerationalId);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}