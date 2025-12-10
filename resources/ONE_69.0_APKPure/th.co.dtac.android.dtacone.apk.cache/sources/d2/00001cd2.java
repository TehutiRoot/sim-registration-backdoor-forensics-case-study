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
    public static volatile ArchTaskExecutor f10157c;

    /* renamed from: d */
    public static final Executor f10158d = new Executor() { // from class: n6
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            ArchTaskExecutor.m64037a(runnable);
        }
    };

    /* renamed from: e */
    public static final Executor f10159e = new Executor() { // from class: o6
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            ArchTaskExecutor.m64036b(runnable);
        }
    };

    /* renamed from: a */
    public TaskExecutor f10160a;

    /* renamed from: b */
    public final TaskExecutor f10161b;

    public ArchTaskExecutor() {
        DefaultTaskExecutor defaultTaskExecutor = new DefaultTaskExecutor();
        this.f10161b = defaultTaskExecutor;
        this.f10160a = defaultTaskExecutor;
    }

    /* renamed from: a */
    public static /* synthetic */ void m64037a(Runnable runnable) {
        m64035c(runnable);
    }

    /* renamed from: b */
    public static /* synthetic */ void m64036b(Runnable runnable) {
        m64034d(runnable);
    }

    /* renamed from: c */
    public static /* synthetic */ void m64035c(Runnable runnable) {
        getInstance().postToMainThread(runnable);
    }

    /* renamed from: d */
    public static /* synthetic */ void m64034d(Runnable runnable) {
        getInstance().executeOnDiskIO(runnable);
    }

    @NonNull
    public static Executor getIOThreadExecutor() {
        return f10159e;
    }

    @NonNull
    public static ArchTaskExecutor getInstance() {
        if (f10157c != null) {
            return f10157c;
        }
        synchronized (ArchTaskExecutor.class) {
            try {
                if (f10157c == null) {
                    f10157c = new ArchTaskExecutor();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f10157c;
    }

    @NonNull
    public static Executor getMainThreadExecutor() {
        return f10158d;
    }

    @Override // androidx.arch.core.executor.TaskExecutor
    public void executeOnDiskIO(@NonNull Runnable runnable) {
        this.f10160a.executeOnDiskIO(runnable);
    }

    @Override // androidx.arch.core.executor.TaskExecutor
    public boolean isMainThread() {
        return this.f10160a.isMainThread();
    }

    @Override // androidx.arch.core.executor.TaskExecutor
    public void postToMainThread(@NonNull Runnable runnable) {
        this.f10160a.postToMainThread(runnable);
    }

    public void setDelegate(@Nullable TaskExecutor taskExecutor) {
        if (taskExecutor == null) {
            taskExecutor = this.f10161b;
        }
        this.f10160a = taskExecutor;
    }
}