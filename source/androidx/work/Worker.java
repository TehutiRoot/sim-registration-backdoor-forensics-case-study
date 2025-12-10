package androidx.work;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import androidx.work.ListenableWorker;
import androidx.work.impl.utils.futures.SettableFuture;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: classes2.dex */
public abstract class Worker extends ListenableWorker {

    /* renamed from: e */
    public SettableFuture f38281e;

    /* renamed from: androidx.work.Worker$a */
    /* loaded from: classes2.dex */
    public class RunnableC5221a implements Runnable {
        public RunnableC5221a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Worker.this.f38281e.set(Worker.this.doWork());
            } catch (Throwable th2) {
                Worker.this.f38281e.setException(th2);
            }
        }
    }

    /* renamed from: androidx.work.Worker$b */
    /* loaded from: classes2.dex */
    public class RunnableC5222b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ SettableFuture f38283a;

        public RunnableC5222b(SettableFuture settableFuture) {
            this.f38283a = settableFuture;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f38283a.set(Worker.this.getForegroundInfo());
            } catch (Throwable th2) {
                this.f38283a.setException(th2);
            }
        }
    }

    public Worker(@NonNull Context context, @NonNull WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @NonNull
    @WorkerThread
    public abstract ListenableWorker.Result doWork();

    @NonNull
    @WorkerThread
    public ForegroundInfo getForegroundInfo() {
        throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for \n `getForegroundInfo()`");
    }

    @Override // androidx.work.ListenableWorker
    @NonNull
    public ListenableFuture<ForegroundInfo> getForegroundInfoAsync() {
        SettableFuture create = SettableFuture.create();
        getBackgroundExecutor().execute(new RunnableC5222b(create));
        return create;
    }

    @Override // androidx.work.ListenableWorker
    @NonNull
    public final ListenableFuture<ListenableWorker.Result> startWork() {
        this.f38281e = SettableFuture.create();
        getBackgroundExecutor().execute(new RunnableC5221a());
        return this.f38281e;
    }
}
