package androidx.work.impl.utils;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.Data;
import androidx.work.Logger;
import androidx.work.ProgressUpdater;
import androidx.work.WorkInfo;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.WorkProgress;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.futures.SettableFuture;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.UUID;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class WorkProgressUpdater implements ProgressUpdater {

    /* renamed from: c */
    public static final String f38764c = Logger.tagWithPrefix("WorkProgressUpdater");

    /* renamed from: a */
    public final WorkDatabase f38765a;

    /* renamed from: b */
    public final TaskExecutor f38766b;

    /* renamed from: androidx.work.impl.utils.WorkProgressUpdater$a */
    /* loaded from: classes.dex */
    public class RunnableC5310a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ UUID f38767a;

        /* renamed from: b */
        public final /* synthetic */ Data f38768b;

        /* renamed from: c */
        public final /* synthetic */ SettableFuture f38769c;

        public RunnableC5310a(UUID uuid, Data data, SettableFuture settableFuture) {
            this.f38767a = uuid;
            this.f38768b = data;
            this.f38769c = settableFuture;
        }

        @Override // java.lang.Runnable
        public void run() {
            WorkSpec workSpec;
            String uuid = this.f38767a.toString();
            Logger logger = Logger.get();
            String str = WorkProgressUpdater.f38764c;
            logger.debug(str, "Updating progress for " + this.f38767a + " (" + this.f38768b + ")");
            WorkProgressUpdater.this.f38765a.beginTransaction();
            try {
                workSpec = WorkProgressUpdater.this.f38765a.workSpecDao().getWorkSpec(uuid);
            } finally {
                try {
                    return;
                } finally {
                }
            }
            if (workSpec != null) {
                if (workSpec.state == WorkInfo.State.RUNNING) {
                    WorkProgressUpdater.this.f38765a.workProgressDao().insert(new WorkProgress(uuid, this.f38768b));
                } else {
                    Logger logger2 = Logger.get();
                    logger2.warning(str, "Ignoring setProgressAsync(...). WorkSpec (" + uuid + ") is not in a RUNNING state.");
                }
                this.f38769c.set(null);
                WorkProgressUpdater.this.f38765a.setTransactionSuccessful();
                return;
            }
            throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
        }
    }

    public WorkProgressUpdater(@NonNull WorkDatabase workDatabase, @NonNull TaskExecutor taskExecutor) {
        this.f38765a = workDatabase;
        this.f38766b = taskExecutor;
    }

    @Override // androidx.work.ProgressUpdater
    @NonNull
    public ListenableFuture<Void> updateProgress(@NonNull Context context, @NonNull UUID uuid, @NonNull Data data) {
        SettableFuture create = SettableFuture.create();
        this.f38766b.executeOnTaskThread(new RunnableC5310a(uuid, data, create));
        return create;
    }
}
