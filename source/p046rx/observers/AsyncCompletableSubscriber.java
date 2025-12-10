package p046rx.observers;

import java.util.concurrent.atomic.AtomicReference;
import p046rx.CompletableSubscriber;
import p046rx.Subscription;
import p046rx.plugins.RxJavaHooks;

/* renamed from: rx.observers.AsyncCompletableSubscriber */
/* loaded from: classes7.dex */
public abstract class AsyncCompletableSubscriber implements CompletableSubscriber, Subscription {

    /* renamed from: b */
    public static final C13825a f79356b = new C13825a();

    /* renamed from: a */
    public final AtomicReference f79357a = new AtomicReference();

    /* renamed from: rx.observers.AsyncCompletableSubscriber$a */
    /* loaded from: classes7.dex */
    public static final class C13825a implements Subscription {
        @Override // p046rx.Subscription
        public boolean isUnsubscribed() {
            return true;
        }

        @Override // p046rx.Subscription
        public void unsubscribe() {
        }
    }

    public final void clear() {
        this.f79357a.set(f79356b);
    }

    @Override // p046rx.Subscription
    public final boolean isUnsubscribed() {
        if (this.f79357a.get() == f79356b) {
            return true;
        }
        return false;
    }

    public void onStart() {
    }

    @Override // p046rx.CompletableSubscriber
    public final void onSubscribe(Subscription subscription) {
        if (!AbstractC17300An1.m69050a(this.f79357a, null, subscription)) {
            subscription.unsubscribe();
            if (this.f79357a.get() != f79356b) {
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
        Subscription subscription2 = (Subscription) this.f79357a.get();
        C13825a c13825a = f79356b;
        if (subscription2 != c13825a && (subscription = (Subscription) this.f79357a.getAndSet(c13825a)) != null && subscription != c13825a) {
            subscription.unsubscribe();
        }
    }
}
