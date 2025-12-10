package androidx.loader.content;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public abstract class ModernAsyncTask {

    /* renamed from: f */
    public static final ThreadFactory f35977f;

    /* renamed from: g */
    public static final BlockingQueue f35978g;

    /* renamed from: h */
    public static final Executor f35979h;

    /* renamed from: i */
    public static HandlerC4742f f35980i;

    /* renamed from: j */
    public static volatile Executor f35981j;

    /* renamed from: a */
    public final AbstractCallableC4743g f35982a;

    /* renamed from: b */
    public final FutureTask f35983b;

    /* renamed from: c */
    public volatile Status f35984c = Status.PENDING;

    /* renamed from: d */
    public final AtomicBoolean f35985d = new AtomicBoolean();

    /* renamed from: e */
    public final AtomicBoolean f35986e = new AtomicBoolean();

    /* loaded from: classes2.dex */
    public enum Status {
        PENDING,
        RUNNING,
        FINISHED
    }

    /* renamed from: androidx.loader.content.ModernAsyncTask$a */
    /* loaded from: classes2.dex */
    public static class ThreadFactoryC4737a implements ThreadFactory {

        /* renamed from: a */
        public final AtomicInteger f35987a = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "ModernAsyncTask #" + this.f35987a.getAndIncrement());
        }
    }

    /* renamed from: androidx.loader.content.ModernAsyncTask$b */
    /* loaded from: classes2.dex */
    public class C4738b extends AbstractCallableC4743g {
        public C4738b() {
        }

        @Override // java.util.concurrent.Callable
        public Object call() {
            ModernAsyncTask.this.f35986e.set(true);
            Object obj = null;
            try {
                Process.setThreadPriority(10);
                obj = ModernAsyncTask.this.mo54040b(this.f35993a);
                Binder.flushPendingCommands();
                return obj;
            } finally {
            }
        }
    }

    /* renamed from: androidx.loader.content.ModernAsyncTask$c */
    /* loaded from: classes2.dex */
    public class C4739c extends FutureTask {
        public C4739c(Callable callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        public void done() {
            try {
                ModernAsyncTask.this.m54030n(get());
            } catch (InterruptedException e) {
                Log.w("AsyncTask", e);
            } catch (CancellationException unused) {
                ModernAsyncTask.this.m54030n(null);
            } catch (ExecutionException e2) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e2.getCause());
            } catch (Throwable th2) {
                throw new RuntimeException("An error occurred while executing doInBackground()", th2);
            }
        }
    }

    /* renamed from: androidx.loader.content.ModernAsyncTask$d */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C4740d {

        /* renamed from: a */
        public static final /* synthetic */ int[] f35990a;

        static {
            int[] iArr = new int[Status.values().length];
            f35990a = iArr;
            try {
                iArr[Status.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35990a[Status.FINISHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: androidx.loader.content.ModernAsyncTask$e */
    /* loaded from: classes2.dex */
    public static class C4741e {

        /* renamed from: a */
        public final ModernAsyncTask f35991a;

        /* renamed from: b */
        public final Object[] f35992b;

        public C4741e(ModernAsyncTask modernAsyncTask, Object... objArr) {
            this.f35991a = modernAsyncTask;
            this.f35992b = objArr;
        }
    }

    /* renamed from: androidx.loader.content.ModernAsyncTask$f */
    /* loaded from: classes2.dex */
    public static class HandlerC4742f extends Handler {
        public HandlerC4742f() {
            super(Looper.getMainLooper());
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            C4741e c4741e = (C4741e) message.obj;
            int i = message.what;
            if (i != 1) {
                if (i == 2) {
                    c4741e.f35991a.m54032l(c4741e.f35992b);
                    return;
                }
                return;
            }
            c4741e.f35991a.m54038d(c4741e.f35992b[0]);
        }
    }

    /* renamed from: androidx.loader.content.ModernAsyncTask$g */
    /* loaded from: classes2.dex */
    public static abstract class AbstractCallableC4743g implements Callable {

        /* renamed from: a */
        public Object[] f35993a;
    }

    static {
        ThreadFactoryC4737a threadFactoryC4737a = new ThreadFactoryC4737a();
        f35977f = threadFactoryC4737a;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(10);
        f35978g = linkedBlockingQueue;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 128, 1L, TimeUnit.SECONDS, linkedBlockingQueue, threadFactoryC4737a);
        f35979h = threadPoolExecutor;
        f35981j = threadPoolExecutor;
    }

    public ModernAsyncTask() {
        C4738b c4738b = new C4738b();
        this.f35982a = c4738b;
        this.f35983b = new C4739c(c4738b);
    }

    /* renamed from: f */
    public static Handler m54037f() {
        HandlerC4742f handlerC4742f;
        synchronized (ModernAsyncTask.class) {
            try {
                if (f35980i == null) {
                    f35980i = new HandlerC4742f();
                }
                handlerC4742f = f35980i;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handlerC4742f;
    }

    /* renamed from: a */
    public final boolean m54041a(boolean z) {
        this.f35985d.set(true);
        return this.f35983b.cancel(z);
    }

    /* renamed from: b */
    public abstract Object mo54040b(Object... objArr);

    /* renamed from: c */
    public final ModernAsyncTask m54039c(Executor executor, Object... objArr) {
        if (this.f35984c != Status.PENDING) {
            int i = C4740d.f35990a[this.f35984c.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("We should never reach this state");
                }
                throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
            }
            throw new IllegalStateException("Cannot execute task: the task is already running.");
        }
        this.f35984c = Status.RUNNING;
        m54033k();
        this.f35982a.f35993a = objArr;
        executor.execute(this.f35983b);
        return this;
    }

    /* renamed from: d */
    public void m54038d(Object obj) {
        if (m54036g()) {
            mo54035i(obj);
        } else {
            mo54034j(obj);
        }
        this.f35984c = Status.FINISHED;
    }

    /* renamed from: g */
    public final boolean m54036g() {
        return this.f35985d.get();
    }

    /* renamed from: i */
    public abstract void mo54035i(Object obj);

    /* renamed from: j */
    public abstract void mo54034j(Object obj);

    /* renamed from: k */
    public void m54033k() {
    }

    /* renamed from: l */
    public void m54032l(Object... objArr) {
    }

    /* renamed from: m */
    public Object m54031m(Object obj) {
        m54037f().obtainMessage(1, new C4741e(this, obj)).sendToTarget();
        return obj;
    }

    /* renamed from: n */
    public void m54030n(Object obj) {
        if (!this.f35986e.get()) {
            m54031m(obj);
        }
    }
}
