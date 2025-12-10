package androidx.arch.core.executor;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class DefaultTaskExecutor extends TaskExecutor {

    /* renamed from: a */
    public final Object f10074a = new Object();

    /* renamed from: b */
    public final ExecutorService f10075b = Executors.newFixedThreadPool(4, new ThreadFactoryC2272a());

    /* renamed from: c */
    public volatile Handler f10076c;

    /* renamed from: androidx.arch.core.executor.DefaultTaskExecutor$a */
    /* loaded from: classes.dex */
    public class ThreadFactoryC2272a implements ThreadFactory {

        /* renamed from: a */
        public final AtomicInteger f10077a = new AtomicInteger(0);

        public ThreadFactoryC2272a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName("arch_disk_io_" + this.f10077a.getAndIncrement());
            return thread;
        }
    }

    /* renamed from: androidx.arch.core.executor.DefaultTaskExecutor$b */
    /* loaded from: classes.dex */
    public static class C2273b {
        /* renamed from: a */
        public static Handler m64081a(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    /* renamed from: a */
    public static Handler m64082a(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C2273b.m64081a(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }

    @Override // androidx.arch.core.executor.TaskExecutor
    public void executeOnDiskIO(@NonNull Runnable runnable) {
        this.f10075b.execute(runnable);
    }

    @Override // androidx.arch.core.executor.TaskExecutor
    public boolean isMainThread() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return true;
        }
        return false;
    }

    @Override // androidx.arch.core.executor.TaskExecutor
    public void postToMainThread(@NonNull Runnable runnable) {
        if (this.f10076c == null) {
            synchronized (this.f10074a) {
                try {
                    if (this.f10076c == null) {
                        this.f10076c = m64082a(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        this.f10076c.post(runnable);
    }
}
