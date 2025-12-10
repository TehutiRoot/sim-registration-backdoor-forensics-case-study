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
    public static final String f38771e = Logger.tagWithPrefix("WorkTimer");

    /* renamed from: a */
    public final RunnableScheduler f38772a;

    /* renamed from: b */
    public final Map f38773b = new HashMap();

    /* renamed from: c */
    public final Map f38774c = new HashMap();

    /* renamed from: d */
    public final Object f38775d = new Object();

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes.dex */
    public interface TimeLimitExceededListener {
        void onTimeLimitExceeded(@NonNull WorkGenerationalId workGenerationalId);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes.dex */
    public static class WorkTimerRunnable implements Runnable {

        /* renamed from: a */
        public final WorkTimer f38776a;

        /* renamed from: b */
        public final WorkGenerationalId f38777b;

        public WorkTimerRunnable(WorkTimer workTimer, WorkGenerationalId workGenerationalId) {
            this.f38776a = workTimer;
            this.f38777b = workGenerationalId;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f38776a.f38775d) {
                try {
                    if (((WorkTimerRunnable) this.f38776a.f38773b.remove(this.f38777b)) != null) {
                        TimeLimitExceededListener timeLimitExceededListener = (TimeLimitExceededListener) this.f38776a.f38774c.remove(this.f38777b);
                        if (timeLimitExceededListener != null) {
                            timeLimitExceededListener.onTimeLimitExceeded(this.f38777b);
                        }
                    } else {
                        Logger.get().debug("WrkTimerRunnable", String.format("Timer with %s is already marked as complete.", this.f38777b));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public WorkTimer(@NonNull RunnableScheduler runnableScheduler) {
        this.f38772a = runnableScheduler;
    }

    @NonNull
    @VisibleForTesting
    public Map<WorkGenerationalId, TimeLimitExceededListener> getListeners() {
        Map<WorkGenerationalId, TimeLimitExceededListener> map;
        synchronized (this.f38775d) {
            map = this.f38774c;
        }
        return map;
    }

    @NonNull
    @VisibleForTesting
    public Map<WorkGenerationalId, WorkTimerRunnable> getTimerMap() {
        Map<WorkGenerationalId, WorkTimerRunnable> map;
        synchronized (this.f38775d) {
            map = this.f38773b;
        }
        return map;
    }

    public void startTimer(@NonNull WorkGenerationalId workGenerationalId, long j, @NonNull TimeLimitExceededListener timeLimitExceededListener) {
        synchronized (this.f38775d) {
            Logger logger = Logger.get();
            String str = f38771e;
            logger.debug(str, "Starting timer for " + workGenerationalId);
            stopTimer(workGenerationalId);
            WorkTimerRunnable workTimerRunnable = new WorkTimerRunnable(this, workGenerationalId);
            this.f38773b.put(workGenerationalId, workTimerRunnable);
            this.f38774c.put(workGenerationalId, timeLimitExceededListener);
            this.f38772a.scheduleWithDelay(j, workTimerRunnable);
        }
    }

    public void stopTimer(@NonNull WorkGenerationalId workGenerationalId) {
        synchronized (this.f38775d) {
            try {
                if (((WorkTimerRunnable) this.f38773b.remove(workGenerationalId)) != null) {
                    Logger logger = Logger.get();
                    String str = f38771e;
                    logger.debug(str, "Stopping timer for " + workGenerationalId);
                    this.f38774c.remove(workGenerationalId);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
