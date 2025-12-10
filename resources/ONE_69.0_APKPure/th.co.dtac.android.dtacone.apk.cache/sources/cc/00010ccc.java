package p046rx.subscriptions;

import java.util.concurrent.atomic.AtomicReference;
import p046rx.Subscription;
import p046rx.functions.Action0;

/* renamed from: rx.subscriptions.BooleanSubscription */
/* loaded from: classes7.dex */
public final class BooleanSubscription implements Subscription {

    /* renamed from: b */
    public static final Action0 f79715b = new C13876a();

    /* renamed from: a */
    public final AtomicReference f79716a;

    /* renamed from: rx.subscriptions.BooleanSubscription$a */
    /* loaded from: classes7.dex */
    public static class C13876a implements Action0 {
        @Override // p046rx.functions.Action0
        public void call() {
        }
    }

    public BooleanSubscription() {
        this.f79716a = new AtomicReference();
    }

    public static BooleanSubscription create() {
        return new BooleanSubscription();
    }

    @Override // p046rx.Subscription
    public boolean isUnsubscribed() {
        if (this.f79716a.get() == f79715b) {
            return true;
        }
        return false;
    }

    @Override // p046rx.Subscription
    public void unsubscribe() {
        Action0 action0;
        Action0 action02 = (Action0) this.f79716a.get();
        Action0 action03 = f79715b;
        if (action02 != action03 && (action0 = (Action0) this.f79716a.getAndSet(action03)) != null && action0 != action03) {
            action0.call();
        }
    }

    public static BooleanSubscription create(Action0 action0) {
        return new BooleanSubscription(action0);
    }

    public BooleanSubscription(Action0 action0) {
        this.f79716a = new AtomicReference(action0);
    }
}