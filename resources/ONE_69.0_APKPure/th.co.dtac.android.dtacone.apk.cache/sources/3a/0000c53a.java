package p000;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.DoNotInline;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: dw */
/* loaded from: classes2.dex */
public abstract class AbstractC10104dw {

    /* renamed from: dw$a */
    /* loaded from: classes2.dex */
    public static class C10105a {
        @DoNotInline
        /* renamed from: a */
        public static Handler m31749a(Looper looper) {
            Handler createAsync;
            createAsync = Handler.createAsync(looper);
            return createAsync;
        }
    }

    /* renamed from: a */
    public static /* synthetic */ Thread m31754a(String str, Runnable runnable) {
        return m31751d(str, runnable);
    }

    /* renamed from: b */
    public static Executor m31753b(final Handler handler) {
        Objects.requireNonNull(handler);
        return new Executor() { // from class: aw
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        };
    }

    /* renamed from: c */
    public static ThreadPoolExecutor m31752c(final String str) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactory() { // from class: bw
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return AbstractC10104dw.m31754a(str, runnable);
            }
        });
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    /* renamed from: d */
    public static /* synthetic */ Thread m31751d(String str, Runnable runnable) {
        Thread thread = new Thread(runnable, str);
        thread.setPriority(10);
        return thread;
    }

    /* renamed from: e */
    public static Handler m31750e() {
        if (Build.VERSION.SDK_INT >= 28) {
            return C10105a.m31749a(Looper.getMainLooper());
        }
        return new Handler(Looper.getMainLooper());
    }
}