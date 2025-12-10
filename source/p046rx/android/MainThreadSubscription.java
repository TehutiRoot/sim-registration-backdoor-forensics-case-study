package p046rx.android;

import android.os.Looper;
import java.util.concurrent.atomic.AtomicBoolean;
import p046rx.Subscription;
import p046rx.android.schedulers.AndroidSchedulers;
import p046rx.functions.Action0;

/* renamed from: rx.android.MainThreadSubscription */
/* loaded from: classes5.dex */
public abstract class MainThreadSubscription implements Subscription {

    /* renamed from: a */
    public final AtomicBoolean f77699a = new AtomicBoolean();

    /* renamed from: rx.android.MainThreadSubscription$a */
    /* loaded from: classes5.dex */
    public class C13397a implements Action0 {
        public C13397a() {
        }

        @Override // p046rx.functions.Action0
        public void call() {
            MainThreadSubscription.this.onUnsubscribe();
        }
    }

    public static void verifyMainThread() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        throw new IllegalStateException("Expected to be called on the main thread but was " + Thread.currentThread().getName());
    }

    @Override // p046rx.Subscription
    public final boolean isUnsubscribed() {
        return this.f77699a.get();
    }

    public abstract void onUnsubscribe();

    @Override // p046rx.Subscription
    public final void unsubscribe() {
        if (this.f77699a.compareAndSet(false, true)) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                onUnsubscribe();
            } else {
                AndroidSchedulers.mainThread().createWorker().schedule(new C13397a());
            }
        }
    }
}
