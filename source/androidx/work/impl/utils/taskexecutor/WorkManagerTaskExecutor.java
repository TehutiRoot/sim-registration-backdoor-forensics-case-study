package androidx.work.impl.utils.taskexecutor;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.impl.utils.SerialExecutorImpl;
import java.util.concurrent.Executor;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.ExecutorsKt;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class WorkManagerTaskExecutor implements TaskExecutor {

    /* renamed from: a */
    public final SerialExecutorImpl f38805a;

    /* renamed from: b */
    public final CoroutineDispatcher f38806b;

    /* renamed from: c */
    public final Handler f38807c = new Handler(Looper.getMainLooper());

    /* renamed from: d */
    public final Executor f38808d = new ExecutorC5320a();

    /* renamed from: androidx.work.impl.utils.taskexecutor.WorkManagerTaskExecutor$a */
    /* loaded from: classes.dex */
    public class ExecutorC5320a implements Executor {
        public ExecutorC5320a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            WorkManagerTaskExecutor.this.f38807c.post(runnable);
        }
    }

    public WorkManagerTaskExecutor(@NonNull Executor executor) {
        SerialExecutorImpl serialExecutorImpl = new SerialExecutorImpl(executor);
        this.f38805a = serialExecutorImpl;
        this.f38806b = ExecutorsKt.from(serialExecutorImpl);
    }

    @Override // androidx.work.impl.utils.taskexecutor.TaskExecutor
    public /* synthetic */ void executeOnTaskThread(Runnable runnable) {
        AbstractC19180bR1.m52011a(this, runnable);
    }

    @Override // androidx.work.impl.utils.taskexecutor.TaskExecutor
    @NonNull
    public Executor getMainThreadExecutor() {
        return this.f38808d;
    }

    @Override // androidx.work.impl.utils.taskexecutor.TaskExecutor
    @NonNull
    public CoroutineDispatcher getTaskCoroutineDispatcher() {
        return this.f38806b;
    }

    @Override // androidx.work.impl.utils.taskexecutor.TaskExecutor
    @NonNull
    public SerialExecutorImpl getSerialTaskExecutor() {
        return this.f38805a;
    }
}
