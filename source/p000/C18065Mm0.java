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

/* renamed from: Mm0  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C18065Mm0 extends Scheduler {

    /* renamed from: a */
    public final Handler f3876a;

    /* renamed from: Mm0$b */
    /* loaded from: classes5.dex */
    public static final class RunnableC0896b implements Runnable, Subscription {

        /* renamed from: a */
        public final Action0 f3880a;

        /* renamed from: b */
        public final Handler f3881b;

        /* renamed from: c */
        public volatile boolean f3882c;

        public RunnableC0896b(Action0 action0, Handler handler) {
            this.f3880a = action0;
            this.f3881b = handler;
        }

        @Override // p046rx.Subscription
        public boolean isUnsubscribed() {
            return this.f3882c;
        }

        @Override // java.lang.Runnable
        public void run() {
            IllegalStateException illegalStateException;
            try {
                this.f3880a.call();
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
            this.f3882c = true;
            this.f3881b.removeCallbacks(this);
        }
    }

    public C18065Mm0(Looper looper) {
        this.f3876a = new Handler(looper);
    }

    @Override // p046rx.Scheduler
    public Scheduler.Worker createWorker() {
        return new C0895a(this.f3876a);
    }

    public C18065Mm0(Handler handler) {
        this.f3876a = handler;
    }

    /* renamed from: Mm0$a */
    /* loaded from: classes5.dex */
    public static class C0895a extends Scheduler.Worker {

        /* renamed from: a */
        public final Handler f3877a;

        /* renamed from: b */
        public final RxAndroidSchedulersHook f3878b = RxAndroidPlugins.getInstance().getSchedulersHook();

        /* renamed from: c */
        public volatile boolean f3879c;

        public C0895a(Handler handler) {
            this.f3877a = handler;
        }

        @Override // p046rx.Subscription
        public boolean isUnsubscribed() {
            return this.f3879c;
        }

        @Override // p046rx.Scheduler.Worker
        public Subscription schedule(Action0 action0, long j, TimeUnit timeUnit) {
            if (this.f3879c) {
                return Subscriptions.unsubscribed();
            }
            RunnableC0896b runnableC0896b = new RunnableC0896b(this.f3878b.onSchedule(action0), this.f3877a);
            Message obtain = Message.obtain(this.f3877a, runnableC0896b);
            obtain.obj = this;
            this.f3877a.sendMessageDelayed(obtain, timeUnit.toMillis(j));
            if (this.f3879c) {
                this.f3877a.removeCallbacks(runnableC0896b);
                return Subscriptions.unsubscribed();
            }
            return runnableC0896b;
        }

        @Override // p046rx.Subscription
        public void unsubscribe() {
            this.f3879c = true;
            this.f3877a.removeCallbacksAndMessages(this);
        }

        @Override // p046rx.Scheduler.Worker
        public Subscription schedule(Action0 action0) {
            return schedule(action0, 0L, TimeUnit.MILLISECONDS);
        }
    }
}
