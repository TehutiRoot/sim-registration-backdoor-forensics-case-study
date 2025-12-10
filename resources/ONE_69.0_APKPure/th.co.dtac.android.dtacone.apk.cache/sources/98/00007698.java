package androidx.work.impl.background.greedy;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.Clock;
import androidx.work.Logger;
import androidx.work.RunnableScheduler;
import androidx.work.impl.Scheduler;
import androidx.work.impl.model.WorkSpec;
import java.util.HashMap;
import java.util.Map;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class DelayedWorkTracker {

    /* renamed from: e */
    public static final String f38481e = Logger.tagWithPrefix("DelayedWorkTracker");

    /* renamed from: a */
    public final Scheduler f38482a;

    /* renamed from: b */
    public final RunnableScheduler f38483b;

    /* renamed from: c */
    public final Clock f38484c;

    /* renamed from: d */
    public final Map f38485d = new HashMap();

    /* renamed from: androidx.work.impl.background.greedy.DelayedWorkTracker$a */
    /* loaded from: classes.dex */
    public class RunnableC5212a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ WorkSpec f38486a;

        public RunnableC5212a(WorkSpec workSpec) {
            this.f38486a = workSpec;
        }

        @Override // java.lang.Runnable
        public void run() {
            Logger logger = Logger.get();
            String str = DelayedWorkTracker.f38481e;
            logger.debug(str, "Scheduling work " + this.f38486a.f38696id);
            DelayedWorkTracker.this.f38482a.schedule(this.f38486a);
        }
    }

    public DelayedWorkTracker(@NonNull Scheduler scheduler, @NonNull RunnableScheduler runnableScheduler, @NonNull Clock clock) {
        this.f38482a = scheduler;
        this.f38483b = runnableScheduler;
        this.f38484c = clock;
    }

    public void schedule(@NonNull WorkSpec workSpec, long j) {
        Runnable runnable = (Runnable) this.f38485d.remove(workSpec.f38696id);
        if (runnable != null) {
            this.f38483b.cancel(runnable);
        }
        RunnableC5212a runnableC5212a = new RunnableC5212a(workSpec);
        this.f38485d.put(workSpec.f38696id, runnableC5212a);
        this.f38483b.scheduleWithDelay(j - this.f38484c.currentTimeMillis(), runnableC5212a);
    }

    public void unschedule(@NonNull String str) {
        Runnable runnable = (Runnable) this.f38485d.remove(str);
        if (runnable != null) {
            this.f38483b.cancel(runnable);
        }
    }
}