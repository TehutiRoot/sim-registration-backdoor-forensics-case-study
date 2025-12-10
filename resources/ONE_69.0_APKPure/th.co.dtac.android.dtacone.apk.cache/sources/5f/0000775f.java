package androidx.work.impl.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.ForegroundInfo;
import androidx.work.ForegroundUpdater;
import androidx.work.ListenableWorker;
import androidx.work.Logger;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.WorkForegroundRunnable;
import androidx.work.impl.utils.futures.SettableFuture;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import com.google.common.util.concurrent.ListenableFuture;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class WorkForegroundRunnable implements Runnable {

    /* renamed from: g */
    public static final String f38834g = Logger.tagWithPrefix("WorkForegroundRunnable");

    /* renamed from: a */
    public final SettableFuture f38835a = SettableFuture.create();

    /* renamed from: b */
    public final Context f38836b;

    /* renamed from: c */
    public final WorkSpec f38837c;

    /* renamed from: d */
    public final ListenableWorker f38838d;

    /* renamed from: e */
    public final ForegroundUpdater f38839e;

    /* renamed from: f */
    public final TaskExecutor f38840f;

    /* renamed from: androidx.work.impl.utils.WorkForegroundRunnable$a */
    /* loaded from: classes.dex */
    public class RunnableC5290a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ SettableFuture f38841a;

        public RunnableC5290a(SettableFuture settableFuture) {
            WorkForegroundRunnable.this = r1;
            this.f38841a = settableFuture;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (WorkForegroundRunnable.this.f38835a.isCancelled()) {
                return;
            }
            try {
                ForegroundInfo foregroundInfo = (ForegroundInfo) this.f38841a.get();
                if (foregroundInfo != null) {
                    Logger logger = Logger.get();
                    String str = WorkForegroundRunnable.f38834g;
                    logger.debug(str, "Updating notification for " + WorkForegroundRunnable.this.f38837c.workerClassName);
                    WorkForegroundRunnable workForegroundRunnable = WorkForegroundRunnable.this;
                    workForegroundRunnable.f38835a.setFuture(workForegroundRunnable.f38839e.setForegroundAsync(workForegroundRunnable.f38836b, workForegroundRunnable.f38838d.getId(), foregroundInfo));
                    return;
                }
                throw new IllegalStateException("Worker was marked important (" + WorkForegroundRunnable.this.f38837c.workerClassName + ") but did not provide ForegroundInfo");
            } catch (Throwable th2) {
                WorkForegroundRunnable.this.f38835a.setException(th2);
            }
        }
    }

    @SuppressLint({"LambdaLast"})
    public WorkForegroundRunnable(@NonNull Context context, @NonNull WorkSpec workSpec, @NonNull ListenableWorker listenableWorker, @NonNull ForegroundUpdater foregroundUpdater, @NonNull TaskExecutor taskExecutor) {
        this.f38836b = context;
        this.f38837c = workSpec;
        this.f38838d = listenableWorker;
        this.f38839e = foregroundUpdater;
        this.f38840f = taskExecutor;
    }

    /* renamed from: a */
    public static /* synthetic */ void m52104a(WorkForegroundRunnable workForegroundRunnable, SettableFuture settableFuture) {
        workForegroundRunnable.m52103b(settableFuture);
    }

    /* renamed from: b */
    public final /* synthetic */ void m52103b(SettableFuture settableFuture) {
        if (!this.f38835a.isCancelled()) {
            settableFuture.setFuture(this.f38838d.getForegroundInfoAsync());
        } else {
            settableFuture.cancel(true);
        }
    }

    @NonNull
    public ListenableFuture<Void> getFuture() {
        return this.f38835a;
    }

    @Override // java.lang.Runnable
    @SuppressLint({"UnsafeExperimentalUsageError"})
    public void run() {
        if (this.f38837c.expedited && Build.VERSION.SDK_INT < 31) {
            final SettableFuture create = SettableFuture.create();
            this.f38840f.getMainThreadExecutor().execute(new Runnable() { // from class: h72
                @Override // java.lang.Runnable
                public final void run() {
                    WorkForegroundRunnable.m52104a(WorkForegroundRunnable.this, create);
                }
            });
            create.addListener(new RunnableC5290a(create), this.f38840f.getMainThreadExecutor());
            return;
        }
        this.f38835a.set(null);
    }
}