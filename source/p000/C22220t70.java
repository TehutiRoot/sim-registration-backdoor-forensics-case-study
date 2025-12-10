package p000;

import android.os.Handler;
import android.os.Message;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.TimeUnit;

/* renamed from: t70  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C22220t70 extends Scheduler {

    /* renamed from: b */
    public final Handler f80002b;

    /* renamed from: c */
    public final boolean f80003c;

    /* renamed from: t70$a */
    /* loaded from: classes5.dex */
    public static final class C13977a extends Scheduler.Worker {

        /* renamed from: a */
        public final Handler f80004a;

        /* renamed from: b */
        public final boolean f80005b;

        /* renamed from: c */
        public volatile boolean f80006c;

        public C13977a(Handler handler, boolean z) {
            this.f80004a = handler;
            this.f80005b = z;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f80006c = true;
            this.f80004a.removeCallbacksAndMessages(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f80006c;
        }

        @Override // io.reactivex.Scheduler.Worker
        public Disposable schedule(Runnable runnable, long j, TimeUnit timeUnit) {
            if (runnable != null) {
                if (timeUnit != null) {
                    if (this.f80006c) {
                        return Disposables.disposed();
                    }
                    RunnableC13978b runnableC13978b = new RunnableC13978b(this.f80004a, RxJavaPlugins.onSchedule(runnable));
                    Message obtain = Message.obtain(this.f80004a, runnableC13978b);
                    obtain.obj = this;
                    if (this.f80005b) {
                        obtain.setAsynchronous(true);
                    }
                    this.f80004a.sendMessageDelayed(obtain, timeUnit.toMillis(j));
                    if (this.f80006c) {
                        this.f80004a.removeCallbacks(runnableC13978b);
                        return Disposables.disposed();
                    }
                    return runnableC13978b;
                }
                throw new NullPointerException("unit == null");
            }
            throw new NullPointerException("run == null");
        }
    }

    /* renamed from: t70$b */
    /* loaded from: classes5.dex */
    public static final class RunnableC13978b implements Runnable, Disposable {

        /* renamed from: a */
        public final Handler f80007a;

        /* renamed from: b */
        public final Runnable f80008b;

        /* renamed from: c */
        public volatile boolean f80009c;

        public RunnableC13978b(Handler handler, Runnable runnable) {
            this.f80007a = handler;
            this.f80008b = runnable;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f80007a.removeCallbacks(this);
            this.f80009c = true;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f80009c;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f80008b.run();
            } catch (Throwable th2) {
                RxJavaPlugins.onError(th2);
            }
        }
    }

    public C22220t70(Handler handler, boolean z) {
        this.f80002b = handler;
        this.f80003c = z;
    }

    @Override // io.reactivex.Scheduler
    public Scheduler.Worker createWorker() {
        return new C13977a(this.f80002b, this.f80003c);
    }

    @Override // io.reactivex.Scheduler
    public Disposable scheduleDirect(Runnable runnable, long j, TimeUnit timeUnit) {
        if (runnable != null) {
            if (timeUnit != null) {
                RunnableC13978b runnableC13978b = new RunnableC13978b(this.f80002b, RxJavaPlugins.onSchedule(runnable));
                Message obtain = Message.obtain(this.f80002b, runnableC13978b);
                if (this.f80003c) {
                    obtain.setAsynchronous(true);
                }
                this.f80002b.sendMessageDelayed(obtain, timeUnit.toMillis(j));
                return runnableC13978b;
            }
            throw new NullPointerException("unit == null");
        }
        throw new NullPointerException("run == null");
    }
}
