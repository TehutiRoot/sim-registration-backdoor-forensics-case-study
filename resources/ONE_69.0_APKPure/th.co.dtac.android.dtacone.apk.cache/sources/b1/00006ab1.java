package androidx.core.provider;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
@Deprecated
/* loaded from: classes2.dex */
public class SelfDestructiveThread {

    /* renamed from: b */
    public HandlerThread f34069b;

    /* renamed from: c */
    public Handler f34070c;

    /* renamed from: f */
    public final int f34073f;

    /* renamed from: g */
    public final int f34074g;

    /* renamed from: h */
    public final String f34075h;

    /* renamed from: a */
    public final Object f34068a = new Object();

    /* renamed from: e */
    public Handler.Callback f34072e = new C4039a();

    /* renamed from: d */
    public int f34071d = 0;

    /* loaded from: classes2.dex */
    public interface ReplyCallback<T> {
        void onReply(T t);
    }

    /* renamed from: androidx.core.provider.SelfDestructiveThread$a */
    /* loaded from: classes2.dex */
    public class C4039a implements Handler.Callback {
        public C4039a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i != 0) {
                if (i != 1) {
                    return true;
                }
                SelfDestructiveThread.this.m57085b((Runnable) message.obj);
                return true;
            }
            SelfDestructiveThread.this.m57086a();
            return true;
        }
    }

    /* renamed from: androidx.core.provider.SelfDestructiveThread$b */
    /* loaded from: classes2.dex */
    public class RunnableC4040b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Callable f34077a;

        /* renamed from: b */
        public final /* synthetic */ Handler f34078b;

        /* renamed from: c */
        public final /* synthetic */ ReplyCallback f34079c;

        /* renamed from: androidx.core.provider.SelfDestructiveThread$b$a */
        /* loaded from: classes2.dex */
        public class RunnableC4041a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ Object f34081a;

            public RunnableC4041a(Object obj) {
                this.f34081a = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                RunnableC4040b.this.f34079c.onReply(this.f34081a);
            }
        }

        public RunnableC4040b(Callable callable, Handler handler, ReplyCallback replyCallback) {
            this.f34077a = callable;
            this.f34078b = handler;
            this.f34079c = replyCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            try {
                obj = this.f34077a.call();
            } catch (Exception unused) {
                obj = null;
            }
            this.f34078b.post(new RunnableC4041a(obj));
        }
    }

    /* renamed from: androidx.core.provider.SelfDestructiveThread$c */
    /* loaded from: classes2.dex */
    public class RunnableC4042c implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ AtomicReference f34083a;

        /* renamed from: b */
        public final /* synthetic */ Callable f34084b;

        /* renamed from: c */
        public final /* synthetic */ ReentrantLock f34085c;

        /* renamed from: d */
        public final /* synthetic */ AtomicBoolean f34086d;

        /* renamed from: e */
        public final /* synthetic */ Condition f34087e;

        public RunnableC4042c(AtomicReference atomicReference, Callable callable, ReentrantLock reentrantLock, AtomicBoolean atomicBoolean, Condition condition) {
            this.f34083a = atomicReference;
            this.f34084b = callable;
            this.f34085c = reentrantLock;
            this.f34086d = atomicBoolean;
            this.f34087e = condition;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f34083a.set(this.f34084b.call());
            } catch (Exception unused) {
            }
            this.f34085c.lock();
            try {
                this.f34086d.set(false);
                this.f34087e.signal();
            } finally {
                this.f34085c.unlock();
            }
        }
    }

    public SelfDestructiveThread(String str, int i, int i2) {
        this.f34075h = str;
        this.f34074g = i;
        this.f34073f = i2;
    }

    /* renamed from: a */
    public void m57086a() {
        synchronized (this.f34068a) {
            try {
                if (this.f34070c.hasMessages(1)) {
                    return;
                }
                this.f34069b.quit();
                this.f34069b = null;
                this.f34070c = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: b */
    public void m57085b(Runnable runnable) {
        runnable.run();
        synchronized (this.f34068a) {
            this.f34070c.removeMessages(0);
            Handler handler = this.f34070c;
            handler.sendMessageDelayed(handler.obtainMessage(0), this.f34073f);
        }
    }

    /* renamed from: c */
    public final void m57084c(Runnable runnable) {
        synchronized (this.f34068a) {
            try {
                if (this.f34069b == null) {
                    HandlerThread handlerThread = new HandlerThread(this.f34075h, this.f34074g);
                    this.f34069b = handlerThread;
                    handlerThread.start();
                    this.f34070c = new Handler(this.f34069b.getLooper(), this.f34072e);
                    this.f34071d++;
                }
                this.f34070c.removeMessages(0);
                Handler handler = this.f34070c;
                handler.sendMessage(handler.obtainMessage(1, runnable));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @VisibleForTesting
    public int getGeneration() {
        int i;
        synchronized (this.f34068a) {
            i = this.f34071d;
        }
        return i;
    }

    @VisibleForTesting
    public boolean isRunning() {
        boolean z;
        synchronized (this.f34068a) {
            if (this.f34069b != null) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public <T> void postAndReply(Callable<T> callable, ReplyCallback<T> replyCallback) {
        m57084c(new RunnableC4040b(callable, AbstractC12457oh.m26087a(), replyCallback));
    }

    public <T> T postAndWait(Callable<T> callable, int i) throws InterruptedException {
        ReentrantLock reentrantLock = new ReentrantLock();
        Condition newCondition = reentrantLock.newCondition();
        AtomicReference atomicReference = new AtomicReference();
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        m57084c(new RunnableC4042c(atomicReference, callable, reentrantLock, atomicBoolean, newCondition));
        reentrantLock.lock();
        try {
            if (!atomicBoolean.get()) {
                return (T) atomicReference.get();
            }
            long nanos = TimeUnit.MILLISECONDS.toNanos(i);
            do {
                try {
                    nanos = newCondition.awaitNanos(nanos);
                } catch (InterruptedException unused) {
                }
                if (!atomicBoolean.get()) {
                    return (T) atomicReference.get();
                }
            } while (nanos > 0);
            throw new InterruptedException("timeout");
        } finally {
            reentrantLock.unlock();
        }
    }
}