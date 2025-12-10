package androidx.work.impl.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.ForegroundInfo;
import androidx.work.ForegroundUpdater;
import androidx.work.Logger;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.ForegroundProcessor;
import androidx.work.impl.foreground.SystemForegroundDispatcher;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.model.WorkSpecKt;
import androidx.work.impl.utils.futures.SettableFuture;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.UUID;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class WorkForegroundUpdater implements ForegroundUpdater {

    /* renamed from: d */
    public static final String f38755d = Logger.tagWithPrefix("WMFgUpdater");

    /* renamed from: a */
    public final TaskExecutor f38756a;

    /* renamed from: b */
    public final ForegroundProcessor f38757b;

    /* renamed from: c */
    public final WorkSpecDao f38758c;

    /* renamed from: androidx.work.impl.utils.WorkForegroundUpdater$a */
    /* loaded from: classes.dex */
    public class RunnableC5309a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ SettableFuture f38759a;

        /* renamed from: b */
        public final /* synthetic */ UUID f38760b;

        /* renamed from: c */
        public final /* synthetic */ ForegroundInfo f38761c;

        /* renamed from: d */
        public final /* synthetic */ Context f38762d;

        public RunnableC5309a(SettableFuture settableFuture, UUID uuid, ForegroundInfo foregroundInfo, Context context) {
            this.f38759a = settableFuture;
            this.f38760b = uuid;
            this.f38761c = foregroundInfo;
            this.f38762d = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (!this.f38759a.isCancelled()) {
                    String uuid = this.f38760b.toString();
                    WorkSpec workSpec = WorkForegroundUpdater.this.f38758c.getWorkSpec(uuid);
                    if (workSpec != null && !workSpec.state.isFinished()) {
                        WorkForegroundUpdater.this.f38757b.startForeground(uuid, this.f38761c);
                        this.f38762d.startService(SystemForegroundDispatcher.createNotifyIntent(this.f38762d, WorkSpecKt.generationalId(workSpec), this.f38761c));
                    } else {
                        throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                    }
                }
                this.f38759a.set(null);
            } catch (Throwable th2) {
                this.f38759a.setException(th2);
            }
        }
    }

    @SuppressLint({"LambdaLast"})
    public WorkForegroundUpdater(@NonNull WorkDatabase workDatabase, @NonNull ForegroundProcessor foregroundProcessor, @NonNull TaskExecutor taskExecutor) {
        this.f38757b = foregroundProcessor;
        this.f38756a = taskExecutor;
        this.f38758c = workDatabase.workSpecDao();
    }

    @Override // androidx.work.ForegroundUpdater
    @NonNull
    public ListenableFuture<Void> setForegroundAsync(@NonNull Context context, @NonNull UUID uuid, @NonNull ForegroundInfo foregroundInfo) {
        SettableFuture create = SettableFuture.create();
        this.f38756a.executeOnTaskThread(new RunnableC5309a(create, uuid, foregroundInfo, context));
        return create;
    }
}
