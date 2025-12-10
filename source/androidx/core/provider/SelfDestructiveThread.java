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
    public HandlerThread f33981b;

    /* renamed from: c */
    public Handler f33982c;

    /* renamed from: f */
    public final int f33985f;

    /* renamed from: g */
    public final int f33986g;

    /* renamed from: h */
    public final String f33987h;

    /* renamed from: a */
    public final Object f33980a = new Object();

    /* renamed from: e */
    public Handler.Callback f33984e = new C4057a();

    /* renamed from: d */
    public int f33983d = 0;

    /* loaded from: classes2.dex */
    public interface ReplyCallback<T> {
        void onReply(T t);
    }

    /* renamed from: androidx.core.provider.SelfDestructiveThread$a */
    /* loaded from: classes2.dex */
    public class C4057a implements Handler.Callback {
        public C4057a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i != 0) {
                if (i != 1) {
                    return true;
                }
                SelfDestructiveThread.this.m57135b((Runnable) message.obj);
                return true;
            }
            SelfDestructiveThread.this.m57136a();
            return true;
        }
    }

    /* renamed from: androidx.core.provider.SelfDestructiveThread$b */
    /* loaded from: classes2.dex */
    public class RunnableC4058b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Callable f33989a;

        /* renamed from: b */
        public final /* synthetic */ Handler f33990b;

        /* renamed from: c */
        public final /* synthetic */ ReplyCallback f33991c;

        /* renamed from: androidx.core.provider.SelfDestructiveThread$b$a */
        /* loaded from: classes2.dex */
        public class RunnableC4059a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ Object f33993a;

            public RunnableC4059a(Object obj) {
                this.f33993a = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                RunnableC4058b.this.f33991c.onReply(this.f33993a);
            }
        }

        public RunnableC4058b(Callable callable, Handler handler, ReplyCallback replyCallback) {
            this.f33989a = callable;
            this.f33990b = handler;
            this.f33991c = replyCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            try {
                obj = this.f33989a.call();
            } catch (Exception unused) {
                obj = null;
            }
            this.f33990b.post(new RunnableC4059a(obj));
        }
    }

    /* renamed from: androidx.core.provider.SelfDestructiveThread$c */
    /* loaded from: classes2.dex */
    public class RunnableC4060c implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ AtomicReference f33995a;

        /* renamed from: b */
        public final /* synthetic */ Callable f33996b;

        /* renamed from: c */
        public final /* synthetic */ ReentrantLock f33997c;

        /* renamed from: d */
        public final /* synthetic */ AtomicBoolean f33998d;

        /* renamed from: e */
        public final /* synthetic */ Condition f33999e;

        public RunnableC4060c(AtomicReference atomicReference, Callable callable, ReentrantLock reentrantLock, AtomicBoolean atomicBoolean, Condition condition) {
            this.f33995a = atomicReference;
            this.f33996b = callable;
            this.f33997c = reentrantLock;
            this.f33998d = atomicBoolean;
            this.f33999e = condition;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f33995a.set(this.f33996b.call());
            } catch (Exception unused) {
            }
            this.f33997c.lock();
            try {
                this.f33998d.set(false);
                this.f33999e.signal();
            } finally {
                this.f33997c.unlock();
            }
        }
    }

    public SelfDestructiveThread(String str, int i, int i2) {
        this.f33987h = str;
        this.f33986g = i;
        this.f33985f = i2;
    }

    /* renamed from: a */
    public void m57136a() {
        synchronized (this.f33980a) {
            try {
                if (this.f33982c.hasMessages(1)) {
                    return;
                }
                this.f33981b.quit();
                this.f33981b = null;
                this.f33982c = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: b */
    public void m57135b(Runnable runnable) {
        runnable.run();
        synchronized (this.f33980a) {
            this.f33982c.removeMessages(0);
            Handler handler = this.f33982c;
            handler.sendMessageDelayed(handler.obtainMessage(0), this.f33985f);
        }
    }

    /* renamed from: c */
    public final void m57134c(Runnable runnable) {
        synchronized (this.f33980a) {
            try {
                if (this.f33981b == null) {
                    HandlerThread handlerThread = new HandlerThread(this.f33987h, this.f33986g);
                    this.f33981b = handlerThread;
                    handlerThread.start();
                    this.f33982c = new Handler(this.f33981b.getLooper(), this.f33984e);
                    this.f33983d++;
                }
                this.f33982c.removeMessages(0);
                Handler handler = this.f33982c;
                handler.sendMessage(handler.obtainMessage(1, runnable));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @VisibleForTesting
    public int getGeneration() {
        int i;
        synchronized (this.f33980a) {
            i = this.f33983d;
        }
        return i;
    }

    @VisibleForTesting
    public boolean isRunning() {
        boolean z;
        synchronized (this.f33980a) {
            if (this.f33981b != null) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public <T> void postAndReply(Callable<T> callable, ReplyCallback<T> replyCallback) {
        m57134c(new RunnableC4058b(callable, AbstractC12457oh.m25886a(), replyCallback));
    }

    public <T> T postAndWait(Callable<T> callable, int i) throws InterruptedException {
        ReentrantLock reentrantLock = new ReentrantLock();
        Condition newCondition = reentrantLock.newCondition();
        AtomicReference atomicReference = new AtomicReference();
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        m57134c(new RunnableC4060c(atomicReference, callable, reentrantLock, atomicBoolean, newCondition));
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
