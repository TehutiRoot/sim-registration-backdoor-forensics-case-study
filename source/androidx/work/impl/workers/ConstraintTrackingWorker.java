package androidx.work.impl.workers;

import android.content.Context;
import android.os.Build;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.work.ListenableWorker;
import androidx.work.Logger;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.constraints.ConstraintsState;
import androidx.work.impl.constraints.OnConstraintsStateChangedListener;
import androidx.work.impl.constraints.WorkConstraintsTracker;
import androidx.work.impl.constraints.WorkConstraintsTrackerKt;
import androidx.work.impl.constraints.trackers.Trackers;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.utils.SynchronousExecutor;
import androidx.work.impl.utils.futures.SettableFuture;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0016\u0010\u000fR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR8\u0010%\u001a&\u0012\f\u0012\n \"*\u0004\u0018\u00010\n0\n \"*\u0012\u0012\f\u0012\n \"*\u0004\u0018\u00010\n0\n\u0018\u00010!0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R(\u0010+\u001a\u0004\u0018\u00010\u00012\b\u0010&\u001a\u0004\u0018\u00010\u00018G@BX\u0086\u000e¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006,"}, m28850d2 = {"Landroidx/work/impl/workers/ConstraintTrackingWorker;", "Landroidx/work/ListenableWorker;", "Landroidx/work/impl/constraints/OnConstraintsStateChangedListener;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Lcom/google/common/util/concurrent/ListenableFuture;", "Landroidx/work/ListenableWorker$Result;", "startWork", "()Lcom/google/common/util/concurrent/ListenableFuture;", "", "onStopped", "()V", "Landroidx/work/impl/model/WorkSpec;", "workSpec", "Landroidx/work/impl/constraints/ConstraintsState;", RemoteConfigConstants.ResponseFieldKey.STATE, "onConstraintsStateChanged", "(Landroidx/work/impl/model/WorkSpec;Landroidx/work/impl/constraints/ConstraintsState;)V", "d", "e", "Landroidx/work/WorkerParameters;", "", OperatorName.FILL_NON_ZERO, "Ljava/lang/Object;", "lock", "", OperatorName.NON_STROKING_GRAY, "Z", "areConstraintsUnmet", "Landroidx/work/impl/utils/futures/SettableFuture;", "kotlin.jvm.PlatformType", OperatorName.CLOSE_PATH, "Landroidx/work/impl/utils/futures/SettableFuture;", "future", "<set-?>", "i", "Landroidx/work/ListenableWorker;", "getDelegate", "()Landroidx/work/ListenableWorker;", "delegate", "work-runtime_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@SourceDebugExtension({"SMAP\nConstraintTrackingWorker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConstraintTrackingWorker.kt\nandroidx/work/impl/workers/ConstraintTrackingWorker\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,167:1\n1#2:168\n*E\n"})
/* loaded from: classes.dex */
public final class ConstraintTrackingWorker extends ListenableWorker implements OnConstraintsStateChangedListener {

    /* renamed from: e */
    public final WorkerParameters f38810e;

    /* renamed from: f */
    public final Object f38811f;

    /* renamed from: g */
    public volatile boolean f38812g;

    /* renamed from: h */
    public final SettableFuture f38813h;

    /* renamed from: i */
    public ListenableWorker f38814i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintTrackingWorker(@NotNull Context appContext, @NotNull WorkerParameters workerParameters) {
        super(appContext, workerParameters);
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(workerParameters, "workerParameters");
        this.f38810e = workerParameters;
        this.f38811f = new Object();
        this.f38813h = SettableFuture.create();
    }

    /* renamed from: a */
    public static /* synthetic */ void m52131a(Job job) {
        m52127e(job);
    }

    /* renamed from: b */
    public static /* synthetic */ void m52130b(ConstraintTrackingWorker constraintTrackingWorker) {
        m52125g(constraintTrackingWorker);
    }

    /* renamed from: c */
    public static /* synthetic */ void m52129c(ConstraintTrackingWorker constraintTrackingWorker, ListenableFuture listenableFuture) {
        m52126f(constraintTrackingWorker, listenableFuture);
    }

    /* renamed from: e */
    public static final void m52127e(Job job) {
        Intrinsics.checkNotNullParameter(job, "$job");
        job.cancel((CancellationException) null);
    }

    /* renamed from: f */
    public static final void m52126f(ConstraintTrackingWorker this$0, ListenableFuture innerFuture) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(innerFuture, "$innerFuture");
        synchronized (this$0.f38811f) {
            try {
                if (this$0.f38812g) {
                    SettableFuture future = this$0.f38813h;
                    Intrinsics.checkNotNullExpressionValue(future, "future");
                    ConstraintTrackingWorkerKt.m52123b(future);
                } else {
                    this$0.f38813h.setFuture(innerFuture);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: g */
    public static final void m52125g(ConstraintTrackingWorker this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m52128d();
    }

    /* renamed from: d */
    public final void m52128d() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        if (this.f38813h.isCancelled()) {
            return;
        }
        String string = getInputData().getString(ConstraintTrackingWorkerKt.ARGUMENT_CLASS_NAME);
        Logger logger = Logger.get();
        Intrinsics.checkNotNullExpressionValue(logger, "get()");
        if (string == null || string.length() == 0) {
            str = ConstraintTrackingWorkerKt.f38815a;
            logger.error(str, "No worker to delegate to.");
            SettableFuture future = this.f38813h;
            Intrinsics.checkNotNullExpressionValue(future, "future");
            ConstraintTrackingWorkerKt.m52124a(future);
            return;
        }
        ListenableWorker createWorkerWithDefaultFallback = getWorkerFactory().createWorkerWithDefaultFallback(getApplicationContext(), string, this.f38810e);
        this.f38814i = createWorkerWithDefaultFallback;
        if (createWorkerWithDefaultFallback == null) {
            str6 = ConstraintTrackingWorkerKt.f38815a;
            logger.debug(str6, "No worker to delegate to.");
            SettableFuture future2 = this.f38813h;
            Intrinsics.checkNotNullExpressionValue(future2, "future");
            ConstraintTrackingWorkerKt.m52124a(future2);
            return;
        }
        WorkManagerImpl workManagerImpl = WorkManagerImpl.getInstance(getApplicationContext());
        Intrinsics.checkNotNullExpressionValue(workManagerImpl, "getInstance(applicationContext)");
        WorkSpecDao workSpecDao = workManagerImpl.getWorkDatabase().workSpecDao();
        String uuid = getId().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "id.toString()");
        WorkSpec workSpec = workSpecDao.getWorkSpec(uuid);
        if (workSpec == null) {
            SettableFuture future3 = this.f38813h;
            Intrinsics.checkNotNullExpressionValue(future3, "future");
            ConstraintTrackingWorkerKt.m52124a(future3);
            return;
        }
        Trackers trackers = workManagerImpl.getTrackers();
        Intrinsics.checkNotNullExpressionValue(trackers, "workManagerImpl.trackers");
        WorkConstraintsTracker workConstraintsTracker = new WorkConstraintsTracker(trackers);
        CoroutineDispatcher taskCoroutineDispatcher = workManagerImpl.getWorkTaskExecutor().getTaskCoroutineDispatcher();
        Intrinsics.checkNotNullExpressionValue(taskCoroutineDispatcher, "workManagerImpl.workTask…r.taskCoroutineDispatcher");
        final Job listen = WorkConstraintsTrackerKt.listen(workConstraintsTracker, workSpec, taskCoroutineDispatcher, this);
        this.f38813h.addListener(new Runnable() { // from class: px
            @Override // java.lang.Runnable
            public final void run() {
                ConstraintTrackingWorker.m52131a(Job.this);
            }
        }, new SynchronousExecutor());
        if (workConstraintsTracker.areAllConstraintsMet(workSpec)) {
            str3 = ConstraintTrackingWorkerKt.f38815a;
            logger.debug(str3, "Constraints met for delegate " + string);
            try {
                ListenableWorker listenableWorker = this.f38814i;
                Intrinsics.checkNotNull(listenableWorker);
                final ListenableFuture<ListenableWorker.Result> startWork = listenableWorker.startWork();
                Intrinsics.checkNotNullExpressionValue(startWork, "delegate!!.startWork()");
                startWork.addListener(new Runnable() { // from class: qx
                    {
                        ConstraintTrackingWorker.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ConstraintTrackingWorker.m52129c(ConstraintTrackingWorker.this, startWork);
                    }
                }, getBackgroundExecutor());
                return;
            } catch (Throwable th2) {
                str4 = ConstraintTrackingWorkerKt.f38815a;
                logger.debug(str4, "Delegated worker " + string + " threw exception in startWork.", th2);
                synchronized (this.f38811f) {
                    try {
                        if (this.f38812g) {
                            str5 = ConstraintTrackingWorkerKt.f38815a;
                            logger.debug(str5, "Constraints were unmet, Retrying.");
                            SettableFuture future4 = this.f38813h;
                            Intrinsics.checkNotNullExpressionValue(future4, "future");
                            ConstraintTrackingWorkerKt.m52123b(future4);
                            return;
                        }
                        SettableFuture future5 = this.f38813h;
                        Intrinsics.checkNotNullExpressionValue(future5, "future");
                        ConstraintTrackingWorkerKt.m52124a(future5);
                        return;
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            }
        }
        str2 = ConstraintTrackingWorkerKt.f38815a;
        logger.debug(str2, "Constraints not met for delegate " + string + ". Requesting retry.");
        SettableFuture future6 = this.f38813h;
        Intrinsics.checkNotNullExpressionValue(future6, "future");
        ConstraintTrackingWorkerKt.m52123b(future6);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @VisibleForTesting
    @Nullable
    public final ListenableWorker getDelegate() {
        return this.f38814i;
    }

    @Override // androidx.work.impl.constraints.OnConstraintsStateChangedListener
    public void onConstraintsStateChanged(@NotNull WorkSpec workSpec, @NotNull ConstraintsState state) {
        String str;
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        Intrinsics.checkNotNullParameter(state, "state");
        Logger logger = Logger.get();
        str = ConstraintTrackingWorkerKt.f38815a;
        logger.debug(str, "Constraints changed for " + workSpec);
        if (state instanceof ConstraintsState.ConstraintsNotMet) {
            synchronized (this.f38811f) {
                this.f38812g = true;
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    @Override // androidx.work.ListenableWorker
    public void onStopped() {
        int i;
        super.onStopped();
        ListenableWorker listenableWorker = this.f38814i;
        if (listenableWorker != null && !listenableWorker.isStopped()) {
            if (Build.VERSION.SDK_INT >= 31) {
                i = getStopReason();
            } else {
                i = 0;
            }
            listenableWorker.stop(i);
        }
    }

    @Override // androidx.work.ListenableWorker
    @NotNull
    public ListenableFuture<ListenableWorker.Result> startWork() {
        getBackgroundExecutor().execute(new Runnable() { // from class: ox
            {
                ConstraintTrackingWorker.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ConstraintTrackingWorker.m52130b(ConstraintTrackingWorker.this);
            }
        });
        SettableFuture future = this.f38813h;
        Intrinsics.checkNotNullExpressionValue(future, "future");
        return future;
    }
}
