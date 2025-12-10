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
    public static final ThreadFactory f36065f;

    /* renamed from: g */
    public static final BlockingQueue f36066g;

    /* renamed from: h */
    public static final Executor f36067h;

    /* renamed from: i */
    public static HandlerC4724f f36068i;

    /* renamed from: j */
    public static volatile Executor f36069j;

    /* renamed from: a */
    public final AbstractCallableC4725g f36070a;

    /* renamed from: b */
    public final FutureTask f36071b;

    /* renamed from: c */
    public volatile Status f36072c = Status.PENDING;

    /* renamed from: d */
    public final AtomicBoolean f36073d = new AtomicBoolean();

    /* renamed from: e */
    public final AtomicBoolean f36074e = new AtomicBoolean();

    /* loaded from: classes2.dex */
    public enum Status {
        PENDING,
        RUNNING,
        FINISHED
    }

    /* renamed from: androidx.loader.content.ModernAsyncTask$a */
    /* loaded from: classes2.dex */
    public static class ThreadFactoryC4719a implements ThreadFactory {

        /* renamed from: a */
        public final AtomicInteger f36075a = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "ModernAsyncTask #" + this.f36075a.getAndIncrement());
        }
    }

    /* renamed from: androidx.loader.content.ModernAsyncTask$b */
    /* loaded from: classes2.dex */
    public class C4720b extends AbstractCallableC4725g {
        public C4720b() {
        }

        @Override // java.util.concurrent.Callable
        public Object call() {
            ModernAsyncTask.this.f36074e.set(true);
            Object obj = null;
            try {
                Process.setThreadPriority(10);
                obj = ModernAsyncTask.this.mo53991b(this.f36081a);
                Binder.flushPendingCommands();
                return obj;
            } finally {
            }
        }
    }

    /* renamed from: androidx.loader.content.ModernAsyncTask$c */
    /* loaded from: classes2.dex */
    public class C4721c extends FutureTask {
        public C4721c(Callable callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        public void done() {
            try {
                ModernAsyncTask.this.m53981n(get());
            } catch (InterruptedException e) {
                Log.w("AsyncTask", e);
            } catch (CancellationException unused) {
                ModernAsyncTask.this.m53981n(null);
            } catch (ExecutionException e2) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e2.getCause());
            } catch (Throwable th2) {
                throw new RuntimeException("An error occurred while executing doInBackground()", th2);
            }
        }
    }

    /* renamed from: androidx.loader.content.ModernAsyncTask$d */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C4722d {

        /* renamed from: a */
        public static final /* synthetic */ int[] f36078a;

        static {
            int[] iArr = new int[Status.values().length];
            f36078a = iArr;
            try {
                iArr[Status.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f36078a[Status.FINISHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: androidx.loader.content.ModernAsyncTask$e */
    /* loaded from: classes2.dex */
    public static class C4723e {

        /* renamed from: a */
        public final ModernAsyncTask f36079a;

        /* renamed from: b */
        public final Object[] f36080b;

        public C4723e(ModernAsyncTask modernAsyncTask, Object... objArr) {
            this.f36079a = modernAsyncTask;
            this.f36080b = objArr;
        }
    }

    /* renamed from: androidx.loader.content.ModernAsyncTask$f */
    /* loaded from: classes2.dex */
    public static class HandlerC4724f extends Handler {
        public HandlerC4724f() {
            super(Looper.getMainLooper());
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            C4723e c4723e = (C4723e) message.obj;
            int i = message.what;
            if (i != 1) {
                if (i == 2) {
                    c4723e.f36079a.m53983l(c4723e.f36080b);
                    return;
                }
                return;
            }
            c4723e.f36079a.m53989d(c4723e.f36080b[0]);
        }
    }

    /* renamed from: androidx.loader.content.ModernAsyncTask$g */
    /* loaded from: classes2.dex */
    public static abstract class AbstractCallableC4725g implements Callable {

        /* renamed from: a */
        public Object[] f36081a;
    }

    static {
        ThreadFactoryC4719a threadFactoryC4719a = new ThreadFactoryC4719a();
        f36065f = threadFactoryC4719a;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(10);
        f36066g = linkedBlockingQueue;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 128, 1L, TimeUnit.SECONDS, linkedBlockingQueue, threadFactoryC4719a);
        f36067h = threadPoolExecutor;
        f36069j = threadPoolExecutor;
    }

    public ModernAsyncTask() {
        C4720b c4720b = new C4720b();
        this.f36070a = c4720b;
        this.f36071b = new C4721c(c4720b);
    }

    /* renamed from: f */
    public static Handler m53988f() {
        HandlerC4724f handlerC4724f;
        synchronized (ModernAsyncTask.class) {
            try {
                if (f36068i == null) {
                    f36068i = new HandlerC4724f();
                }
                handlerC4724f = f36068i;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handlerC4724f;
    }

    /* renamed from: a */
    public final boolean m53992a(boolean z) {
        this.f36073d.set(true);
        return this.f36071b.cancel(z);
    }

    /* renamed from: b */
    public abstract Object mo53991b(Object... objArr);

    /* renamed from: c */
    public final ModernAsyncTask m53990c(Executor executor, Object... objArr) {
        if (this.f36072c != Status.PENDING) {
            int i = C4722d.f36078a[this.f36072c.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("We should never reach this state");
                }
                throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
            }
            throw new IllegalStateException("Cannot execute task: the task is already running.");
        }
        this.f36072c = Status.RUNNING;
        m53984k();
        this.f36070a.f36081a = objArr;
        executor.execute(this.f36071b);
        return this;
    }

    /* renamed from: d */
    public void m53989d(Object obj) {
        if (m53987g()) {
            mo53986i(obj);
        } else {
            mo53985j(obj);
        }
        this.f36072c = Status.FINISHED;
    }

    /* renamed from: g */
    public final boolean m53987g() {
        return this.f36073d.get();
    }

    /* renamed from: i */
    public abstract void mo53986i(Object obj);

    /* renamed from: j */
    public abstract void mo53985j(Object obj);

    /* renamed from: k */
    public void m53984k() {
    }

    /* renamed from: l */
    public void m53983l(Object... objArr) {
    }

    /* renamed from: m */
    public Object m53982m(Object obj) {
        m53988f().obtainMessage(1, new C4723e(this, obj)).sendToTarget();
        return obj;
    }

    /* renamed from: n */
    public void m53981n(Object obj) {
        if (!this.f36074e.get()) {
            m53982m(obj);
        }
    }
}