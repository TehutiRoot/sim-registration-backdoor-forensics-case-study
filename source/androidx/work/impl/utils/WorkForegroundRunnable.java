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
    public static final String f38746g = Logger.tagWithPrefix("WorkForegroundRunnable");

    /* renamed from: a */
    public final SettableFuture f38747a = SettableFuture.create();

    /* renamed from: b */
    public final Context f38748b;

    /* renamed from: c */
    public final WorkSpec f38749c;

    /* renamed from: d */
    public final ListenableWorker f38750d;

    /* renamed from: e */
    public final ForegroundUpdater f38751e;

    /* renamed from: f */
    public final TaskExecutor f38752f;

    /* renamed from: androidx.work.impl.utils.WorkForegroundRunnable$a */
    /* loaded from: classes.dex */
    public class RunnableC5308a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ SettableFuture f38753a;

        public RunnableC5308a(SettableFuture settableFuture) {
            WorkForegroundRunnable.this = r1;
            this.f38753a = settableFuture;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (WorkForegroundRunnable.this.f38747a.isCancelled()) {
                return;
            }
            try {
                ForegroundInfo foregroundInfo = (ForegroundInfo) this.f38753a.get();
                if (foregroundInfo != null) {
                    Logger logger = Logger.get();
                    String str = WorkForegroundRunnable.f38746g;
                    logger.debug(str, "Updating notification for " + WorkForegroundRunnable.this.f38749c.workerClassName);
                    WorkForegroundRunnable workForegroundRunnable = WorkForegroundRunnable.this;
                    workForegroundRunnable.f38747a.setFuture(workForegroundRunnable.f38751e.setForegroundAsync(workForegroundRunnable.f38748b, workForegroundRunnable.f38750d.getId(), foregroundInfo));
                    return;
                }
                throw new IllegalStateException("Worker was marked important (" + WorkForegroundRunnable.this.f38749c.workerClassName + ") but did not provide ForegroundInfo");
            } catch (Throwable th2) {
                WorkForegroundRunnable.this.f38747a.setException(th2);
            }
        }
    }

    @SuppressLint({"LambdaLast"})
    public WorkForegroundRunnable(@NonNull Context context, @NonNull WorkSpec workSpec, @NonNull ListenableWorker listenableWorker, @NonNull ForegroundUpdater foregroundUpdater, @NonNull TaskExecutor taskExecutor) {
        this.f38748b = context;
        this.f38749c = workSpec;
        this.f38750d = listenableWorker;
        this.f38751e = foregroundUpdater;
        this.f38752f = taskExecutor;
    }

    /* renamed from: a */
    public static /* synthetic */ void m52152a(WorkForegroundRunnable workForegroundRunnable, SettableFuture settableFuture) {
        workForegroundRunnable.m52151b(settableFuture);
    }

    /* renamed from: b */
    public final /* synthetic */ void m52151b(SettableFuture settableFuture) {
        if (!this.f38747a.isCancelled()) {
            settableFuture.setFuture(this.f38750d.getForegroundInfoAsync());
        } else {
            settableFuture.cancel(true);
        }
    }

    @NonNull
    public ListenableFuture<Void> getFuture() {
        return this.f38747a;
    }

    @Override // java.lang.Runnable
    @SuppressLint({"UnsafeExperimentalUsageError"})
    public void run() {
        if (this.f38749c.expedited && Build.VERSION.SDK_INT < 31) {
            final SettableFuture create = SettableFuture.create();
            this.f38752f.getMainThreadExecutor().execute(new Runnable() { // from class: k62
                {
                    WorkForegroundRunnable.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    WorkForegroundRunnable.m52152a(WorkForegroundRunnable.this, create);
                }
            });
            create.addListener(new RunnableC5308a(create), this.f38752f.getMainThreadExecutor());
            return;
        }
        this.f38747a.set(null);
    }
}
