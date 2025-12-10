package androidx.work.impl.background.greedy;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.work.Configuration;
import androidx.work.Logger;
import androidx.work.RunnableScheduler;
import androidx.work.WorkInfo;
import androidx.work.impl.ExecutionListener;
import androidx.work.impl.Processor;
import androidx.work.impl.Scheduler;
import androidx.work.impl.StartStopToken;
import androidx.work.impl.StartStopTokens;
import androidx.work.impl.WorkLauncher;
import androidx.work.impl.constraints.ConstraintsState;
import androidx.work.impl.constraints.OnConstraintsStateChangedListener;
import androidx.work.impl.constraints.WorkConstraintsTracker;
import androidx.work.impl.constraints.WorkConstraintsTrackerKt;
import androidx.work.impl.constraints.trackers.Trackers;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecKt;
import androidx.work.impl.utils.ProcessUtils;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.Job;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class GreedyScheduler implements Scheduler, OnConstraintsStateChangedListener, ExecutionListener {

    /* renamed from: o */
    public static final String f38400o = Logger.tagWithPrefix("GreedyScheduler");

    /* renamed from: a */
    public final Context f38401a;

    /* renamed from: c */
    public DelayedWorkTracker f38403c;

    /* renamed from: d */
    public boolean f38404d;

    /* renamed from: g */
    public final Processor f38407g;

    /* renamed from: h */
    public final WorkLauncher f38408h;

    /* renamed from: i */
    public final Configuration f38409i;

    /* renamed from: k */
    public Boolean f38411k;

    /* renamed from: l */
    public final WorkConstraintsTracker f38412l;

    /* renamed from: m */
    public final TaskExecutor f38413m;

    /* renamed from: n */
    public final TimeLimiter f38414n;

    /* renamed from: b */
    public final Map f38402b = new HashMap();

    /* renamed from: e */
    public final Object f38405e = new Object();

    /* renamed from: f */
    public final StartStopTokens f38406f = new StartStopTokens();

    /* renamed from: j */
    public final Map f38410j = new HashMap();

    /* renamed from: androidx.work.impl.background.greedy.GreedyScheduler$b */
    /* loaded from: classes.dex */
    public static class C5232b {

        /* renamed from: a */
        public final int f38415a;

        /* renamed from: b */
        public final long f38416b;

        public C5232b(int i, long j) {
            this.f38415a = i;
            this.f38416b = j;
        }
    }

    public GreedyScheduler(@NonNull Context context, @NonNull Configuration configuration, @NonNull Trackers trackers, @NonNull Processor processor, @NonNull WorkLauncher workLauncher, @NonNull TaskExecutor taskExecutor) {
        this.f38401a = context;
        RunnableScheduler runnableScheduler = configuration.getRunnableScheduler();
        this.f38403c = new DelayedWorkTracker(this, runnableScheduler, configuration.getClock());
        this.f38414n = new TimeLimiter(runnableScheduler, workLauncher);
        this.f38413m = taskExecutor;
        this.f38412l = new WorkConstraintsTracker(trackers);
        this.f38409i = configuration;
        this.f38407g = processor;
        this.f38408h = workLauncher;
    }

    /* renamed from: a */
    public final void m52289a() {
        this.f38411k = Boolean.valueOf(ProcessUtils.isDefaultProcess(this.f38401a, this.f38409i));
    }

    /* renamed from: b */
    public final void m52288b() {
        if (!this.f38404d) {
            this.f38407g.addExecutionListener(this);
            this.f38404d = true;
        }
    }

    /* renamed from: c */
    public final void m52287c(WorkGenerationalId workGenerationalId) {
        Job job;
        synchronized (this.f38405e) {
            job = (Job) this.f38402b.remove(workGenerationalId);
        }
        if (job != null) {
            Logger logger = Logger.get();
            String str = f38400o;
            logger.debug(str, "Stopping tracking for " + workGenerationalId);
            job.cancel((CancellationException) null);
        }
    }

    @Override // androidx.work.impl.Scheduler
    public void cancel(@NonNull String str) {
        if (this.f38411k == null) {
            m52289a();
        }
        if (!this.f38411k.booleanValue()) {
            Logger.get().info(f38400o, "Ignoring schedule request in non-main process");
            return;
        }
        m52288b();
        Logger logger = Logger.get();
        String str2 = f38400o;
        logger.debug(str2, "Cancelling work ID " + str);
        DelayedWorkTracker delayedWorkTracker = this.f38403c;
        if (delayedWorkTracker != null) {
            delayedWorkTracker.unschedule(str);
        }
        for (StartStopToken startStopToken : this.f38406f.remove(str)) {
            this.f38414n.cancel(startStopToken);
            this.f38408h.stopWork(startStopToken);
        }
    }

    /* renamed from: d */
    public final long m52286d(WorkSpec workSpec) {
        long max;
        synchronized (this.f38405e) {
            try {
                WorkGenerationalId generationalId = WorkSpecKt.generationalId(workSpec);
                C5232b c5232b = (C5232b) this.f38410j.get(generationalId);
                if (c5232b == null) {
                    c5232b = new C5232b(workSpec.runAttemptCount, this.f38409i.getClock().currentTimeMillis());
                    this.f38410j.put(generationalId, c5232b);
                }
                max = c5232b.f38416b + (Math.max((workSpec.runAttemptCount - c5232b.f38415a) - 5, 0) * 30000);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return max;
    }

    @Override // androidx.work.impl.Scheduler
    public boolean hasLimitedSchedulingSlots() {
        return false;
    }

    @Override // androidx.work.impl.constraints.OnConstraintsStateChangedListener
    public void onConstraintsStateChanged(@NonNull WorkSpec workSpec, @NonNull ConstraintsState constraintsState) {
        WorkGenerationalId generationalId = WorkSpecKt.generationalId(workSpec);
        if (constraintsState instanceof ConstraintsState.ConstraintsMet) {
            if (!this.f38406f.contains(generationalId)) {
                Logger logger = Logger.get();
                String str = f38400o;
                logger.debug(str, "Constraints met: Scheduling work ID " + generationalId);
                StartStopToken startStopToken = this.f38406f.tokenFor(generationalId);
                this.f38414n.track(startStopToken);
                this.f38408h.startWork(startStopToken);
                return;
            }
            return;
        }
        Logger logger2 = Logger.get();
        String str2 = f38400o;
        logger2.debug(str2, "Constraints not met: Cancelling work ID " + generationalId);
        StartStopToken remove = this.f38406f.remove(generationalId);
        if (remove != null) {
            this.f38414n.cancel(remove);
            this.f38408h.stopWorkWithReason(remove, ((ConstraintsState.ConstraintsNotMet) constraintsState).getReason());
        }
    }

    @Override // androidx.work.impl.ExecutionListener
    public void onExecuted(@NonNull WorkGenerationalId workGenerationalId, boolean z) {
        StartStopToken remove = this.f38406f.remove(workGenerationalId);
        if (remove != null) {
            this.f38414n.cancel(remove);
        }
        m52287c(workGenerationalId);
        if (!z) {
            synchronized (this.f38405e) {
                this.f38410j.remove(workGenerationalId);
            }
        }
    }

    @Override // androidx.work.impl.Scheduler
    public void schedule(@NonNull WorkSpec... workSpecArr) {
        if (this.f38411k == null) {
            m52289a();
        }
        if (!this.f38411k.booleanValue()) {
            Logger.get().info(f38400o, "Ignoring schedule request in a secondary process");
            return;
        }
        m52288b();
        HashSet<WorkSpec> hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (WorkSpec workSpec : workSpecArr) {
            if (!this.f38406f.contains(WorkSpecKt.generationalId(workSpec))) {
                long max = Math.max(workSpec.calculateNextRunTime(), m52286d(workSpec));
                long currentTimeMillis = this.f38409i.getClock().currentTimeMillis();
                if (workSpec.state == WorkInfo.State.ENQUEUED) {
                    if (currentTimeMillis < max) {
                        DelayedWorkTracker delayedWorkTracker = this.f38403c;
                        if (delayedWorkTracker != null) {
                            delayedWorkTracker.schedule(workSpec, max);
                        }
                    } else if (workSpec.hasConstraints()) {
                        int i = Build.VERSION.SDK_INT;
                        if (i >= 23 && workSpec.constraints.requiresDeviceIdle()) {
                            Logger.get().debug(f38400o, "Ignoring " + workSpec + ". Requires device idle.");
                        } else if (i >= 24 && workSpec.constraints.hasContentUriTriggers()) {
                            Logger.get().debug(f38400o, "Ignoring " + workSpec + ". Requires ContentUri triggers.");
                        } else {
                            hashSet.add(workSpec);
                            hashSet2.add(workSpec.f38608id);
                        }
                    } else if (!this.f38406f.contains(WorkSpecKt.generationalId(workSpec))) {
                        Logger.get().debug(f38400o, "Starting work for " + workSpec.f38608id);
                        StartStopToken startStopToken = this.f38406f.tokenFor(workSpec);
                        this.f38414n.track(startStopToken);
                        this.f38408h.startWork(startStopToken);
                    }
                }
            }
        }
        synchronized (this.f38405e) {
            try {
                if (!hashSet.isEmpty()) {
                    String join = TextUtils.join(",", hashSet2);
                    Logger.get().debug(f38400o, "Starting tracking for " + join);
                    for (WorkSpec workSpec2 : hashSet) {
                        WorkGenerationalId generationalId = WorkSpecKt.generationalId(workSpec2);
                        if (!this.f38402b.containsKey(generationalId)) {
                            this.f38402b.put(generationalId, WorkConstraintsTrackerKt.listen(this.f38412l, workSpec2, this.f38413m.getTaskCoroutineDispatcher(), this));
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @VisibleForTesting
    public void setDelayedWorkTracker(@NonNull DelayedWorkTracker delayedWorkTracker) {
        this.f38403c = delayedWorkTracker;
    }
}
