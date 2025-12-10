package androidx.arch.core.executor;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.arch.core.executor.ArchTaskExecutor;
import java.util.concurrent.Executor;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class ArchTaskExecutor extends TaskExecutor {

    /* renamed from: c */
    public static volatile ArchTaskExecutor f10069c;

    /* renamed from: d */
    public static final Executor f10070d = new Executor() { // from class: n6
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            ArchTaskExecutor.m64086a(runnable);
        }
    };

    /* renamed from: e */
    public static final Executor f10071e = new Executor() { // from class: o6
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            ArchTaskExecutor.m64085b(runnable);
        }
    };

    /* renamed from: a */
    public TaskExecutor f10072a;

    /* renamed from: b */
    public final TaskExecutor f10073b;

    public ArchTaskExecutor() {
        DefaultTaskExecutor defaultTaskExecutor = new DefaultTaskExecutor();
        this.f10073b = defaultTaskExecutor;
        this.f10072a = defaultTaskExecutor;
    }

    /* renamed from: a */
    public static /* synthetic */ void m64086a(Runnable runnable) {
        m64084c(runnable);
    }

    /* renamed from: b */
    public static /* synthetic */ void m64085b(Runnable runnable) {
        m64083d(runnable);
    }

    /* renamed from: c */
    public static /* synthetic */ void m64084c(Runnable runnable) {
        getInstance().postToMainThread(runnable);
    }

    /* renamed from: d */
    public static /* synthetic */ void m64083d(Runnable runnable) {
        getInstance().executeOnDiskIO(runnable);
    }

    @NonNull
    public static Executor getIOThreadExecutor() {
        return f10071e;
    }

    @NonNull
    public static ArchTaskExecutor getInstance() {
        if (f10069c != null) {
            return f10069c;
        }
        synchronized (ArchTaskExecutor.class) {
            try {
                if (f10069c == null) {
                    f10069c = new ArchTaskExecutor();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f10069c;
    }

    @NonNull
    public static Executor getMainThreadExecutor() {
        return f10070d;
    }

    @Override // androidx.arch.core.executor.TaskExecutor
    public void executeOnDiskIO(@NonNull Runnable runnable) {
        this.f10072a.executeOnDiskIO(runnable);
    }

    @Override // androidx.arch.core.executor.TaskExecutor
    public boolean isMainThread() {
        return this.f10072a.isMainThread();
    }

    @Override // androidx.arch.core.executor.TaskExecutor
    public void postToMainThread(@NonNull Runnable runnable) {
        this.f10072a.postToMainThread(runnable);
    }

    public void setDelegate(@Nullable TaskExecutor taskExecutor) {
        if (taskExecutor == null) {
            taskExecutor = this.f10073b;
        }
        this.f10072a = taskExecutor;
    }
}
