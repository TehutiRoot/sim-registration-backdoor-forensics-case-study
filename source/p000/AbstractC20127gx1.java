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

/* renamed from: gx1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC20127gx1 {

    /* renamed from: gx1$a */
    /* loaded from: classes2.dex */
    public static class ThreadFactoryC10340a implements ThreadFactory {

        /* renamed from: a */
        public String f62348a;

        /* renamed from: b */
        public int f62349b;

        /* renamed from: gx1$a$a */
        /* loaded from: classes2.dex */
        public static class C10341a extends Thread {

            /* renamed from: a */
            public final int f62350a;

            public C10341a(Runnable runnable, String str, int i) {
                super(runnable, str);
                this.f62350a = i;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(this.f62350a);
                super.run();
            }
        }

        public ThreadFactoryC10340a(String str, int i) {
            this.f62348a = str;
            this.f62349b = i;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new C10341a(runnable, this.f62348a, this.f62349b);
        }
    }

    /* renamed from: gx1$b */
    /* loaded from: classes2.dex */
    public static class ExecutorC10342b implements Executor {

        /* renamed from: a */
        public final Handler f62351a;

        public ExecutorC10342b(Handler handler) {
            this.f62351a = (Handler) Preconditions.checkNotNull(handler);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            if (this.f62351a.post((Runnable) Preconditions.checkNotNull(runnable))) {
                return;
            }
            throw new RejectedExecutionException(this.f62351a + " is shutting down");
        }
    }

    /* renamed from: gx1$c */
    /* loaded from: classes2.dex */
    public static class RunnableC10343c implements Runnable {

        /* renamed from: a */
        public Callable f62352a;

        /* renamed from: b */
        public Consumer f62353b;

        /* renamed from: c */
        public Handler f62354c;

        /* renamed from: gx1$c$a */
        /* loaded from: classes2.dex */
        public class RunnableC10344a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ Consumer f62355a;

            /* renamed from: b */
            public final /* synthetic */ Object f62356b;

            public RunnableC10344a(Consumer consumer, Object obj) {
                this.f62355a = consumer;
                this.f62356b = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f62355a.accept(this.f62356b);
            }
        }

        public RunnableC10343c(Handler handler, Callable callable, Consumer consumer) {
            this.f62352a = callable;
            this.f62353b = consumer;
            this.f62354c = handler;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            try {
                obj = this.f62352a.call();
            } catch (Exception unused) {
                obj = null;
            }
            this.f62354c.post(new RunnableC10344a(this.f62353b, obj));
        }
    }

    /* renamed from: a */
    public static ThreadPoolExecutor m30945a(String str, int i, int i2) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, i2, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new ThreadFactoryC10340a(str, i));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    /* renamed from: b */
    public static Executor m30944b(Handler handler) {
        return new ExecutorC10342b(handler);
    }

    /* renamed from: c */
    public static void m30943c(Executor executor, Callable callable, Consumer consumer) {
        executor.execute(new RunnableC10343c(AbstractC12457oh.m25886a(), callable, consumer));
    }

    /* renamed from: d */
    public static Object m30942d(ExecutorService executorService, Callable callable, int i) {
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
