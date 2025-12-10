package p046rx.observers;

import java.util.concurrent.atomic.AtomicReference;
import p046rx.CompletableSubscriber;
import p046rx.Subscription;
import p046rx.plugins.RxJavaHooks;

/* renamed from: rx.observers.AsyncCompletableSubscriber */
/* loaded from: classes7.dex */
public abstract class AsyncCompletableSubscriber implements CompletableSubscriber, Subscription {

    /* renamed from: b */
    public static final C13826a f79562b = new C13826a();

    /* renamed from: a */
    public final AtomicReference f79563a = new AtomicReference();

    /* renamed from: rx.observers.AsyncCompletableSubscriber$a */
    /* loaded from: classes7.dex */
    public static final class C13826a implements Subscription {
        @Override // p046rx.Subscription
        public boolean isUnsubscribed() {
            return true;
        }

        @Override // p046rx.Subscription
        public void unsubscribe() {
        }
    }

    public final void clear() {
        this.f79563a.set(f79562b);
    }

    @Override // p046rx.Subscription
    public final boolean isUnsubscribed() {
        if (this.f79563a.get() == f79562b) {
            return true;
        }
        return false;
    }

    public void onStart() {
    }

    @Override // p046rx.CompletableSubscriber
    public final void onSubscribe(Subscription subscription) {
        if (!AbstractC23094xo1.m479a(this.f79563a, null, subscription)) {
            subscription.unsubscribe();
            if (this.f79563a.get() != f79562b) {
                RxJavaHooks.onError(new IllegalStateException("Subscription already set!"));
                return;
            }
            return;
        }
        onStart();
    }

    @Override // p046rx.Subscription
    public final void unsubscribe() {
        Subscription subscription;
        Subscription subscription2 = (Subscription) this.f79563a.get();
        C13826a c13826a = f79562b;
        if (subscription2 != c13826a && (subscription = (Subscription) this.f79563a.getAndSet(c13826a)) != null && subscription != c13826a) {
            subscription.unsubscribe();
        }
    }
}