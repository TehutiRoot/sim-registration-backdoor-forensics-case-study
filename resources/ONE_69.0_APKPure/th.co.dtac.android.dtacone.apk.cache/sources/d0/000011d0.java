package p000;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.concurrent.TimeUnit;
import p046rx.Scheduler;
import p046rx.Subscription;
import p046rx.android.plugins.RxAndroidPlugins;
import p046rx.android.plugins.RxAndroidSchedulersHook;
import p046rx.exceptions.OnErrorNotImplementedException;
import p046rx.functions.Action0;
import p046rx.plugins.RxJavaPlugins;
import p046rx.subscriptions.Subscriptions;

/* renamed from: Sm0  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C18490Sm0 extends Scheduler {

    /* renamed from: a */
    public final Handler f5931a;

    /* renamed from: Sm0$b */
    /* loaded from: classes5.dex */
    public static final class RunnableC1316b implements Runnable, Subscription {

        /* renamed from: a */
        public final Action0 f5935a;

        /* renamed from: b */
        public final Handler f5936b;

        /* renamed from: c */
        public volatile boolean f5937c;

        public RunnableC1316b(Action0 action0, Handler handler) {
            this.f5935a = action0;
            this.f5936b = handler;
        }

        @Override // p046rx.Subscription
        public boolean isUnsubscribed() {
            return this.f5937c;
        }

        @Override // java.lang.Runnable
        public void run() {
            IllegalStateException illegalStateException;
            try {
                this.f5935a.call();
            } catch (Throwable th2) {
                if (th2 instanceof OnErrorNotImplementedException) {
                    illegalStateException = new IllegalStateException("Exception thrown on Scheduler.Worker thread. Add `onError` handling.", th2);
                } else {
                    illegalStateException = new IllegalStateException("Fatal Exception thrown on Scheduler.Worker thread.", th2);
                }
                RxJavaPlugins.getInstance().getErrorHandler().handleError(illegalStateException);
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, illegalStateException);
            }
        }

        @Override // p046rx.Subscription
        public void unsubscribe() {
            this.f5937c = true;
            this.f5936b.removeCallbacks(this);
        }
    }

    public C18490Sm0(Looper looper) {
        this.f5931a = new Handler(looper);
    }

    @Override // p046rx.Scheduler
    public Scheduler.Worker createWorker() {
        return new C1315a(this.f5931a);
    }

    public C18490Sm0(Handler handler) {
        this.f5931a = handler;
    }

    /* renamed from: Sm0$a */
    /* loaded from: classes5.dex */
    public static class C1315a extends Scheduler.Worker {

        /* renamed from: a */
        public final Handler f5932a;

        /* renamed from: b */
        public final RxAndroidSchedulersHook f5933b = RxAndroidPlugins.getInstance().getSchedulersHook();

        /* renamed from: c */
        public volatile boolean f5934c;

        public C1315a(Handler handler) {
            this.f5932a = handler;
        }

        @Override // p046rx.Subscription
        public boolean isUnsubscribed() {
            return this.f5934c;
        }

        @Override // p046rx.Scheduler.Worker
        public Subscription schedule(Action0 action0, long j, TimeUnit timeUnit) {
            if (this.f5934c) {
                return Subscriptions.unsubscribed();
            }
            RunnableC1316b runnableC1316b = new RunnableC1316b(this.f5933b.onSchedule(action0), this.f5932a);
            Message obtain = Message.obtain(this.f5932a, runnableC1316b);
            obtain.obj = this;
            this.f5932a.sendMessageDelayed(obtain, timeUnit.toMillis(j));
            if (this.f5934c) {
                this.f5932a.removeCallbacks(runnableC1316b);
                return Subscriptions.unsubscribed();
            }
            return runnableC1316b;
        }

        @Override // p046rx.Subscription
        public void unsubscribe() {
            this.f5934c = true;
            this.f5932a.removeCallbacksAndMessages(this);
        }

        @Override // p046rx.Scheduler.Worker
        public Subscription schedule(Action0 action0) {
            return schedule(action0, 0L, TimeUnit.MILLISECONDS);
        }
    }
}