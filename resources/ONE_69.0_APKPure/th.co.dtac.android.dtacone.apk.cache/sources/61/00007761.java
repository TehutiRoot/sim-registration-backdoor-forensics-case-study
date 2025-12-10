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
    public static final String f38843d = Logger.tagWithPrefix("WMFgUpdater");

    /* renamed from: a */
    public final TaskExecutor f38844a;

    /* renamed from: b */
    public final ForegroundProcessor f38845b;

    /* renamed from: c */
    public final WorkSpecDao f38846c;

    /* renamed from: androidx.work.impl.utils.WorkForegroundUpdater$a */
    /* loaded from: classes.dex */
    public class RunnableC5291a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ SettableFuture f38847a;

        /* renamed from: b */
        public final /* synthetic */ UUID f38848b;

        /* renamed from: c */
        public final /* synthetic */ ForegroundInfo f38849c;

        /* renamed from: d */
        public final /* synthetic */ Context f38850d;

        public RunnableC5291a(SettableFuture settableFuture, UUID uuid, ForegroundInfo foregroundInfo, Context context) {
            this.f38847a = settableFuture;
            this.f38848b = uuid;
            this.f38849c = foregroundInfo;
            this.f38850d = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (!this.f38847a.isCancelled()) {
                    String uuid = this.f38848b.toString();
                    WorkSpec workSpec = WorkForegroundUpdater.this.f38846c.getWorkSpec(uuid);
                    if (workSpec != null && !workSpec.state.isFinished()) {
                        WorkForegroundUpdater.this.f38845b.startForeground(uuid, this.f38849c);
                        this.f38850d.startService(SystemForegroundDispatcher.createNotifyIntent(this.f38850d, WorkSpecKt.generationalId(workSpec), this.f38849c));
                    } else {
                        throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                    }
                }
                this.f38847a.set(null);
            } catch (Throwable th2) {
                this.f38847a.setException(th2);
            }
        }
    }

    @SuppressLint({"LambdaLast"})
    public WorkForegroundUpdater(@NonNull WorkDatabase workDatabase, @NonNull ForegroundProcessor foregroundProcessor, @NonNull TaskExecutor taskExecutor) {
        this.f38845b = foregroundProcessor;
        this.f38844a = taskExecutor;
        this.f38846c = workDatabase.workSpecDao();
    }

    @Override // androidx.work.ForegroundUpdater
    @NonNull
    public ListenableFuture<Void> setForegroundAsync(@NonNull Context context, @NonNull UUID uuid, @NonNull ForegroundInfo foregroundInfo) {
        SettableFuture create = SettableFuture.create();
        this.f38844a.executeOnTaskThread(new RunnableC5291a(create, uuid, foregroundInfo, context));
        return create;
    }
}