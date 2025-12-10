package androidx.work.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.work.Clock;
import androidx.work.Configuration;
import androidx.work.Data;
import androidx.work.InputMerger;
import androidx.work.ListenableWorker;
import androidx.work.Logger;
import androidx.work.WorkInfo;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkerWrapper;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.foreground.ForegroundProcessor;
import androidx.work.impl.model.DependencyDao;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.model.WorkSpecKt;
import androidx.work.impl.utils.PackageManagerHelper;
import androidx.work.impl.utils.SynchronousExecutor;
import androidx.work.impl.utils.WorkForegroundRunnable;
import androidx.work.impl.utils.WorkForegroundUpdater;
import androidx.work.impl.utils.WorkProgressUpdater;
import androidx.work.impl.utils.futures.SettableFuture;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class WorkerWrapper implements Runnable {

    /* renamed from: s */
    public static final String f38361s = Logger.tagWithPrefix("WorkerWrapper");

    /* renamed from: a */
    public Context f38362a;

    /* renamed from: b */
    public final String f38363b;

    /* renamed from: c */
    public WorkerParameters.RuntimeExtras f38364c;

    /* renamed from: d */
    public WorkSpec f38365d;

    /* renamed from: e */
    public ListenableWorker f38366e;

    /* renamed from: f */
    public TaskExecutor f38367f;

    /* renamed from: h */
    public Configuration f38369h;

    /* renamed from: i */
    public Clock f38370i;

    /* renamed from: j */
    public ForegroundProcessor f38371j;

    /* renamed from: k */
    public WorkDatabase f38372k;

    /* renamed from: l */
    public WorkSpecDao f38373l;

    /* renamed from: m */
    public DependencyDao f38374m;

    /* renamed from: n */
    public List f38375n;

    /* renamed from: o */
    public String f38376o;

    /* renamed from: g */
    public ListenableWorker.Result f38368g = ListenableWorker.Result.failure();

    /* renamed from: p */
    public SettableFuture f38377p = SettableFuture.create();

    /* renamed from: q */
    public final SettableFuture f38378q = SettableFuture.create();

    /* renamed from: r */
    public volatile int f38379r = -256;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes.dex */
    public static class Builder {

        /* renamed from: a */
        public Context f38380a;

        /* renamed from: b */
        public ListenableWorker f38381b;

        /* renamed from: c */
        public ForegroundProcessor f38382c;

        /* renamed from: d */
        public TaskExecutor f38383d;

        /* renamed from: e */
        public Configuration f38384e;

        /* renamed from: f */
        public WorkDatabase f38385f;

        /* renamed from: g */
        public WorkSpec f38386g;

        /* renamed from: h */
        public final List f38387h;

        /* renamed from: i */
        public WorkerParameters.RuntimeExtras f38388i = new WorkerParameters.RuntimeExtras();

        @SuppressLint({"LambdaLast"})
        public Builder(@NonNull Context context, @NonNull Configuration configuration, @NonNull TaskExecutor taskExecutor, @NonNull ForegroundProcessor foregroundProcessor, @NonNull WorkDatabase workDatabase, @NonNull WorkSpec workSpec, @NonNull List<String> list) {
            this.f38380a = context.getApplicationContext();
            this.f38383d = taskExecutor;
            this.f38382c = foregroundProcessor;
            this.f38384e = configuration;
            this.f38385f = workDatabase;
            this.f38386g = workSpec;
            this.f38387h = list;
        }

        @NonNull
        public WorkerWrapper build() {
            return new WorkerWrapper(this);
        }

        @NonNull
        public Builder withRuntimeExtras(@Nullable WorkerParameters.RuntimeExtras runtimeExtras) {
            if (runtimeExtras != null) {
                this.f38388i = runtimeExtras;
            }
            return this;
        }

        @NonNull
        @VisibleForTesting
        public Builder withWorker(@NonNull ListenableWorker listenableWorker) {
            this.f38381b = listenableWorker;
            return this;
        }
    }

    /* renamed from: androidx.work.impl.WorkerWrapper$a */
    /* loaded from: classes.dex */
    public class RunnableC5228a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ ListenableFuture f38389a;

        public RunnableC5228a(ListenableFuture listenableFuture) {
            WorkerWrapper.this = r1;
            this.f38389a = listenableFuture;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (WorkerWrapper.this.f38378q.isCancelled()) {
                return;
            }
            try {
                this.f38389a.get();
                Logger logger = Logger.get();
                String str = WorkerWrapper.f38361s;
                logger.debug(str, "Starting work for " + WorkerWrapper.this.f38365d.workerClassName);
                WorkerWrapper workerWrapper = WorkerWrapper.this;
                workerWrapper.f38378q.setFuture(workerWrapper.f38366e.startWork());
            } catch (Throwable th2) {
                WorkerWrapper.this.f38378q.setException(th2);
            }
        }
    }

    /* renamed from: androidx.work.impl.WorkerWrapper$b */
    /* loaded from: classes.dex */
    public class RunnableC5229b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ String f38391a;

        public RunnableC5229b(String str) {
            WorkerWrapper.this = r1;
            this.f38391a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                try {
                    ListenableWorker.Result result = (ListenableWorker.Result) WorkerWrapper.this.f38378q.get();
                    if (result == null) {
                        Logger logger = Logger.get();
                        String str = WorkerWrapper.f38361s;
                        logger.error(str, WorkerWrapper.this.f38365d.workerClassName + " returned a null result. Treating it as a failure.");
                    } else {
                        Logger logger2 = Logger.get();
                        String str2 = WorkerWrapper.f38361s;
                        logger2.debug(str2, WorkerWrapper.this.f38365d.workerClassName + " returned a " + result + ".");
                        WorkerWrapper.this.f38368g = result;
                    }
                } catch (InterruptedException e) {
                    e = e;
                    Logger logger3 = Logger.get();
                    String str3 = WorkerWrapper.f38361s;
                    logger3.error(str3, this.f38391a + " failed because it threw an exception/error", e);
                } catch (CancellationException e2) {
                    Logger logger4 = Logger.get();
                    String str4 = WorkerWrapper.f38361s;
                    logger4.info(str4, this.f38391a + " was cancelled", e2);
                } catch (ExecutionException e3) {
                    e = e3;
                    Logger logger32 = Logger.get();
                    String str32 = WorkerWrapper.f38361s;
                    logger32.error(str32, this.f38391a + " failed because it threw an exception/error", e);
                }
                WorkerWrapper.this.m52300g();
            } catch (Throwable th2) {
                WorkerWrapper.this.m52300g();
                throw th2;
            }
        }
    }

    public WorkerWrapper(Builder builder) {
        this.f38362a = builder.f38380a;
        this.f38367f = builder.f38383d;
        this.f38371j = builder.f38382c;
        WorkSpec workSpec = builder.f38386g;
        this.f38365d = workSpec;
        this.f38363b = workSpec.f38608id;
        this.f38364c = builder.f38388i;
        this.f38366e = builder.f38381b;
        Configuration configuration = builder.f38384e;
        this.f38369h = configuration;
        this.f38370i = configuration.getClock();
        WorkDatabase workDatabase = builder.f38385f;
        this.f38372k = workDatabase;
        this.f38373l = workDatabase.workSpecDao();
        this.f38374m = this.f38372k.dependencyDao();
        this.f38375n = builder.f38387h;
    }

    /* renamed from: a */
    public static /* synthetic */ void m52305a(WorkerWrapper workerWrapper, ListenableFuture listenableFuture) {
        workerWrapper.m52301f(listenableFuture);
    }

    /* renamed from: b */
    public final String m52304b(List list) {
        StringBuilder sb = new StringBuilder("Work [ id=");
        sb.append(this.f38363b);
        sb.append(", tags={ ");
        Iterator it = list.iterator();
        boolean z = true;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append(str);
        }
        sb.append(" } ]");
        return sb.toString();
    }

    /* renamed from: c */
    public final void m52303c(ListenableWorker.Result result) {
        if (result instanceof ListenableWorker.Result.Success) {
            Logger logger = Logger.get();
            String str = f38361s;
            logger.info(str, "Worker result SUCCESS for " + this.f38376o);
            if (this.f38365d.isPeriodic()) {
                m52298j();
            } else {
                m52293o();
            }
        } else if (result instanceof ListenableWorker.Result.Retry) {
            Logger logger2 = Logger.get();
            String str2 = f38361s;
            logger2.info(str2, "Worker result RETRY for " + this.f38376o);
            m52299i();
        } else {
            Logger logger3 = Logger.get();
            String str3 = f38361s;
            logger3.info(str3, "Worker result FAILURE for " + this.f38376o);
            if (this.f38365d.isPeriodic()) {
                m52298j();
            } else {
                m52294n();
            }
        }
    }

    /* renamed from: d */
    public final void m52302d(String str) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            if (this.f38373l.getState(str2) != WorkInfo.State.CANCELLED) {
                this.f38373l.setState(WorkInfo.State.FAILED, str2);
            }
            linkedList.addAll(this.f38374m.getDependentWorkIds(str2));
        }
    }

    /* renamed from: f */
    public final /* synthetic */ void m52301f(ListenableFuture listenableFuture) {
        if (this.f38378q.isCancelled()) {
            listenableFuture.cancel(true);
        }
    }

    /* renamed from: g */
    public void m52300g() {
        if (!m52292p()) {
            this.f38372k.beginTransaction();
            try {
                WorkInfo.State state = this.f38373l.getState(this.f38363b);
                this.f38372k.workProgressDao().delete(this.f38363b);
                if (state == null) {
                    m52297k(false);
                } else if (state == WorkInfo.State.RUNNING) {
                    m52303c(this.f38368g);
                } else if (!state.isFinished()) {
                    this.f38379r = WorkInfo.STOP_REASON_UNKNOWN;
                    m52299i();
                }
                this.f38372k.setTransactionSuccessful();
                this.f38372k.endTransaction();
            } catch (Throwable th2) {
                this.f38372k.endTransaction();
                throw th2;
            }
        }
    }

    @NonNull
    public ListenableFuture<Boolean> getFuture() {
        return this.f38377p;
    }

    @NonNull
    public WorkGenerationalId getWorkGenerationalId() {
        return WorkSpecKt.generationalId(this.f38365d);
    }

    @NonNull
    public WorkSpec getWorkSpec() {
        return this.f38365d;
    }

    /* renamed from: i */
    public final void m52299i() {
        this.f38372k.beginTransaction();
        try {
            this.f38373l.setState(WorkInfo.State.ENQUEUED, this.f38363b);
            this.f38373l.setLastEnqueueTime(this.f38363b, this.f38370i.currentTimeMillis());
            this.f38373l.resetWorkSpecNextScheduleTimeOverride(this.f38363b, this.f38365d.getNextScheduleTimeOverrideGeneration());
            this.f38373l.markWorkSpecScheduled(this.f38363b, -1L);
            this.f38372k.setTransactionSuccessful();
        } finally {
            this.f38372k.endTransaction();
            m52297k(true);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void interrupt(int i) {
        this.f38379r = i;
        m52292p();
        this.f38378q.cancel(true);
        if (this.f38366e != null && this.f38378q.isCancelled()) {
            this.f38366e.stop(i);
            return;
        }
        Logger.get().debug(f38361s, "WorkSpec " + this.f38365d + " is already done. Not interrupting.");
    }

    /* renamed from: j */
    public final void m52298j() {
        this.f38372k.beginTransaction();
        try {
            this.f38373l.setLastEnqueueTime(this.f38363b, this.f38370i.currentTimeMillis());
            this.f38373l.setState(WorkInfo.State.ENQUEUED, this.f38363b);
            this.f38373l.resetWorkSpecRunAttemptCount(this.f38363b);
            this.f38373l.resetWorkSpecNextScheduleTimeOverride(this.f38363b, this.f38365d.getNextScheduleTimeOverrideGeneration());
            this.f38373l.incrementPeriodCount(this.f38363b);
            this.f38373l.markWorkSpecScheduled(this.f38363b, -1L);
            this.f38372k.setTransactionSuccessful();
        } finally {
            this.f38372k.endTransaction();
            m52297k(false);
        }
    }

    /* renamed from: k */
    public final void m52297k(boolean z) {
        this.f38372k.beginTransaction();
        try {
            if (!this.f38372k.workSpecDao().hasUnfinishedWork()) {
                PackageManagerHelper.setComponentEnabled(this.f38362a, RescheduleReceiver.class, false);
            }
            if (z) {
                this.f38373l.setState(WorkInfo.State.ENQUEUED, this.f38363b);
                this.f38373l.setStopReason(this.f38363b, this.f38379r);
                this.f38373l.markWorkSpecScheduled(this.f38363b, -1L);
            }
            this.f38372k.setTransactionSuccessful();
            this.f38372k.endTransaction();
            this.f38377p.set(Boolean.valueOf(z));
        } catch (Throwable th2) {
            this.f38372k.endTransaction();
            throw th2;
        }
    }

    /* renamed from: l */
    public final void m52296l() {
        WorkInfo.State state = this.f38373l.getState(this.f38363b);
        if (state == WorkInfo.State.RUNNING) {
            Logger logger = Logger.get();
            String str = f38361s;
            logger.debug(str, "Status for " + this.f38363b + " is RUNNING; not doing any work and rescheduling for later execution");
            m52297k(true);
            return;
        }
        Logger logger2 = Logger.get();
        String str2 = f38361s;
        logger2.debug(str2, "Status for " + this.f38363b + " is " + state + " ; not doing any work");
        m52297k(false);
    }

    /* renamed from: m */
    public final void m52295m() {
        Data merge;
        if (m52292p()) {
            return;
        }
        this.f38372k.beginTransaction();
        try {
            WorkSpec workSpec = this.f38365d;
            if (workSpec.state != WorkInfo.State.ENQUEUED) {
                m52296l();
                this.f38372k.setTransactionSuccessful();
                Logger logger = Logger.get();
                String str = f38361s;
                logger.debug(str, this.f38365d.workerClassName + " is not in ENQUEUED state. Nothing more to do");
            } else if ((workSpec.isPeriodic() || this.f38365d.isBackedOff()) && this.f38370i.currentTimeMillis() < this.f38365d.calculateNextRunTime()) {
                Logger.get().debug(f38361s, String.format("Delaying execution for %s because it is being executed before schedule.", this.f38365d.workerClassName));
                m52297k(true);
                this.f38372k.setTransactionSuccessful();
            } else {
                this.f38372k.setTransactionSuccessful();
                this.f38372k.endTransaction();
                if (this.f38365d.isPeriodic()) {
                    merge = this.f38365d.input;
                } else {
                    InputMerger createInputMergerWithDefaultFallback = this.f38369h.getInputMergerFactory().createInputMergerWithDefaultFallback(this.f38365d.inputMergerClassName);
                    if (createInputMergerWithDefaultFallback == null) {
                        Logger logger2 = Logger.get();
                        String str2 = f38361s;
                        logger2.error(str2, "Could not create Input Merger " + this.f38365d.inputMergerClassName);
                        m52294n();
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(this.f38365d.input);
                    arrayList.addAll(this.f38373l.getInputsFromPrerequisites(this.f38363b));
                    merge = createInputMergerWithDefaultFallback.merge(arrayList);
                }
                Data data = merge;
                UUID fromString = UUID.fromString(this.f38363b);
                List list = this.f38375n;
                WorkerParameters.RuntimeExtras runtimeExtras = this.f38364c;
                WorkSpec workSpec2 = this.f38365d;
                WorkerParameters workerParameters = new WorkerParameters(fromString, data, list, runtimeExtras, workSpec2.runAttemptCount, workSpec2.getGeneration(), this.f38369h.getExecutor(), this.f38367f, this.f38369h.getWorkerFactory(), new WorkProgressUpdater(this.f38372k, this.f38367f), new WorkForegroundUpdater(this.f38372k, this.f38371j, this.f38367f));
                if (this.f38366e == null) {
                    this.f38366e = this.f38369h.getWorkerFactory().createWorkerWithDefaultFallback(this.f38362a, this.f38365d.workerClassName, workerParameters);
                }
                ListenableWorker listenableWorker = this.f38366e;
                if (listenableWorker == null) {
                    Logger logger3 = Logger.get();
                    String str3 = f38361s;
                    logger3.error(str3, "Could not create Worker " + this.f38365d.workerClassName);
                    m52294n();
                } else if (listenableWorker.isUsed()) {
                    Logger logger4 = Logger.get();
                    String str4 = f38361s;
                    logger4.error(str4, "Received an already-used Worker " + this.f38365d.workerClassName + "; Worker Factory should return new instances");
                    m52294n();
                } else {
                    this.f38366e.setUsed();
                    if (m52291q()) {
                        if (m52292p()) {
                            return;
                        }
                        WorkForegroundRunnable workForegroundRunnable = new WorkForegroundRunnable(this.f38362a, this.f38365d, this.f38366e, workerParameters.getForegroundUpdater(), this.f38367f);
                        this.f38367f.getMainThreadExecutor().execute(workForegroundRunnable);
                        final ListenableFuture<Void> future = workForegroundRunnable.getFuture();
                        this.f38378q.addListener(new Runnable() { // from class: w62
                            {
                                WorkerWrapper.this = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                WorkerWrapper.m52305a(WorkerWrapper.this, future);
                            }
                        }, new SynchronousExecutor());
                        future.addListener(new RunnableC5228a(future), this.f38367f.getMainThreadExecutor());
                        this.f38378q.addListener(new RunnableC5229b(this.f38376o), this.f38367f.getSerialTaskExecutor());
                        return;
                    }
                    m52296l();
                }
            }
        } finally {
            this.f38372k.endTransaction();
        }
    }

    /* renamed from: n */
    public void m52294n() {
        this.f38372k.beginTransaction();
        try {
            m52302d(this.f38363b);
            Data outputData = ((ListenableWorker.Result.Failure) this.f38368g).getOutputData();
            this.f38373l.resetWorkSpecNextScheduleTimeOverride(this.f38363b, this.f38365d.getNextScheduleTimeOverrideGeneration());
            this.f38373l.setOutput(this.f38363b, outputData);
            this.f38372k.setTransactionSuccessful();
        } finally {
            this.f38372k.endTransaction();
            m52297k(false);
        }
    }

    /* renamed from: o */
    public final void m52293o() {
        this.f38372k.beginTransaction();
        try {
            this.f38373l.setState(WorkInfo.State.SUCCEEDED, this.f38363b);
            this.f38373l.setOutput(this.f38363b, ((ListenableWorker.Result.Success) this.f38368g).getOutputData());
            long currentTimeMillis = this.f38370i.currentTimeMillis();
            for (String str : this.f38374m.getDependentWorkIds(this.f38363b)) {
                if (this.f38373l.getState(str) == WorkInfo.State.BLOCKED && this.f38374m.hasCompletedAllPrerequisites(str)) {
                    Logger logger = Logger.get();
                    String str2 = f38361s;
                    logger.info(str2, "Setting status to enqueued for " + str);
                    this.f38373l.setState(WorkInfo.State.ENQUEUED, str);
                    this.f38373l.setLastEnqueueTime(str, currentTimeMillis);
                }
            }
            this.f38372k.setTransactionSuccessful();
            this.f38372k.endTransaction();
            m52297k(false);
        } catch (Throwable th2) {
            this.f38372k.endTransaction();
            m52297k(false);
            throw th2;
        }
    }

    /* renamed from: p */
    public final boolean m52292p() {
        if (this.f38379r == -256) {
            return false;
        }
        Logger logger = Logger.get();
        String str = f38361s;
        logger.debug(str, "Work interrupted for " + this.f38376o);
        WorkInfo.State state = this.f38373l.getState(this.f38363b);
        if (state == null) {
            m52297k(false);
        } else {
            m52297k(!state.isFinished());
        }
        return true;
    }

    /* renamed from: q */
    public final boolean m52291q() {
        boolean z;
        this.f38372k.beginTransaction();
        try {
            if (this.f38373l.getState(this.f38363b) == WorkInfo.State.ENQUEUED) {
                this.f38373l.setState(WorkInfo.State.RUNNING, this.f38363b);
                this.f38373l.incrementWorkSpecRunAttemptCount(this.f38363b);
                this.f38373l.setStopReason(this.f38363b, -256);
                z = true;
            } else {
                z = false;
            }
            this.f38372k.setTransactionSuccessful();
            this.f38372k.endTransaction();
            return z;
        } catch (Throwable th2) {
            this.f38372k.endTransaction();
            throw th2;
        }
    }

    @Override // java.lang.Runnable
    @WorkerThread
    public void run() {
        this.f38376o = m52304b(this.f38375n);
        m52295m();
    }
}
