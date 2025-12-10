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
    public static final String f38393e = Logger.tagWithPrefix("DelayedWorkTracker");

    /* renamed from: a */
    public final Scheduler f38394a;

    /* renamed from: b */
    public final RunnableScheduler f38395b;

    /* renamed from: c */
    public final Clock f38396c;

    /* renamed from: d */
    public final Map f38397d = new HashMap();

    /* renamed from: androidx.work.impl.background.greedy.DelayedWorkTracker$a */
    /* loaded from: classes.dex */
    public class RunnableC5230a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ WorkSpec f38398a;

        public RunnableC5230a(WorkSpec workSpec) {
            this.f38398a = workSpec;
        }

        @Override // java.lang.Runnable
        public void run() {
            Logger logger = Logger.get();
            String str = DelayedWorkTracker.f38393e;
            logger.debug(str, "Scheduling work " + this.f38398a.f38608id);
            DelayedWorkTracker.this.f38394a.schedule(this.f38398a);
        }
    }

    public DelayedWorkTracker(@NonNull Scheduler scheduler, @NonNull RunnableScheduler runnableScheduler, @NonNull Clock clock) {
        this.f38394a = scheduler;
        this.f38395b = runnableScheduler;
        this.f38396c = clock;
    }

    public void schedule(@NonNull WorkSpec workSpec, long j) {
        Runnable runnable = (Runnable) this.f38397d.remove(workSpec.f38608id);
        if (runnable != null) {
            this.f38395b.cancel(runnable);
        }
        RunnableC5230a runnableC5230a = new RunnableC5230a(workSpec);
        this.f38397d.put(workSpec.f38608id, runnableC5230a);
        this.f38395b.scheduleWithDelay(j - this.f38396c.currentTimeMillis(), runnableC5230a);
    }

    public void unschedule(@NonNull String str) {
        Runnable runnable = (Runnable) this.f38397d.remove(str);
        if (runnable != null) {
            this.f38395b.cancel(runnable);
        }
    }
}
