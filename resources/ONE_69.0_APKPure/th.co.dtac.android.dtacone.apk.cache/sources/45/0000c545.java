package p000;

import android.os.Handler;
import android.os.Process;
import androidx.core.util.Consumer;
import androidx.core.util.Preconditions;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: dy1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC19664dy1 {

    /* renamed from: dy1$a */
    /* loaded from: classes2.dex */
    public static class ThreadFactoryC10108a implements ThreadFactory {

        /* renamed from: a */
        public String f61422a;

        /* renamed from: b */
        public int f61423b;

        /* renamed from: dy1$a$a */
        /* loaded from: classes2.dex */
        public static class C10109a extends Thread {

            /* renamed from: a */
            public final int f61424a;

            public C10109a(Runnable runnable, String str, int i) {
                super(runnable, str);
                this.f61424a = i;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(this.f61424a);
                super.run();
            }
        }

        public ThreadFactoryC10108a(String str, int i) {
            this.f61422a = str;
            this.f61423b = i;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new C10109a(runnable, this.f61422a, this.f61423b);
        }
    }

    /* renamed from: dy1$b */
    /* loaded from: classes2.dex */
    public static class ExecutorC10110b implements Executor {

        /* renamed from: a */
        public final Handler f61425a;

        public ExecutorC10110b(Handler handler) {
            this.f61425a = (Handler) Preconditions.checkNotNull(handler);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            if (this.f61425a.post((Runnable) Preconditions.checkNotNull(runnable))) {
                return;
            }
            throw new RejectedExecutionException(this.f61425a + " is shutting down");
        }
    }

    /* renamed from: dy1$c */
    /* loaded from: classes2.dex */
    public static class RunnableC10111c implements Runnable {

        /* renamed from: a */
        public Callable f61426a;

        /* renamed from: b */
        public Consumer f61427b;

        /* renamed from: c */
        public Handler f61428c;

        /* renamed from: dy1$c$a */
        /* loaded from: classes2.dex */
        public class RunnableC10112a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ Consumer f61429a;

            /* renamed from: b */
            public final /* synthetic */ Object f61430b;

            public RunnableC10112a(Consumer consumer, Object obj) {
                this.f61429a = consumer;
                this.f61430b = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f61429a.accept(this.f61430b);
            }
        }

        public RunnableC10111c(Handler handler, Callable callable, Consumer consumer) {
            this.f61426a = callable;
            this.f61427b = consumer;
            this.f61428c = handler;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            try {
                obj = this.f61426a.call();
            } catch (Exception unused) {
                obj = null;
            }
            this.f61428c.post(new RunnableC10112a(this.f61427b, obj));
        }
    }

    /* renamed from: a */
    public static ThreadPoolExecutor m31745a(String str, int i, int i2) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, i2, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new ThreadFactoryC10108a(str, i));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    /* renamed from: b */
    public static Executor m31744b(Handler handler) {
        return new ExecutorC10110b(handler);
    }

    /* renamed from: c */
    public static void m31743c(Executor executor, Callable callable, Consumer consumer) {
        executor.execute(new RunnableC10111c(AbstractC12457oh.m26087a(), callable, consumer));
    }

    /* renamed from: d */
    public static Object m31742d(ExecutorService executorService, Callable callable, int i) {
        try {
            return executorService.submit(callable).get(i, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            throw e;
        } catch (ExecutionException e2) {
            throw new RuntimeException(e2);
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }
}