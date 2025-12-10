package p046rx.subscriptions;

import java.util.concurrent.atomic.AtomicReference;
import p046rx.Subscription;
import p046rx.functions.Action0;

/* renamed from: rx.subscriptions.BooleanSubscription */
/* loaded from: classes7.dex */
public final class BooleanSubscription implements Subscription {

    /* renamed from: b */
    public static final Action0 f79509b = new C13875a();

    /* renamed from: a */
    public final AtomicReference f79510a;

    /* renamed from: rx.subscriptions.BooleanSubscription$a */
    /* loaded from: classes7.dex */
    public static class C13875a implements Action0 {
        @Override // p046rx.functions.Action0
        public void call() {
        }
    }

    public BooleanSubscription() {
        this.f79510a = new AtomicReference();
    }

    public static BooleanSubscription create() {
        return new BooleanSubscription();
    }

    @Override // p046rx.Subscription
    public boolean isUnsubscribed() {
        if (this.f79510a.get() == f79509b) {
            return true;
        }
        return false;
    }

    @Override // p046rx.Subscription
    public void unsubscribe() {
        Action0 action0;
        Action0 action02 = (Action0) this.f79510a.get();
        Action0 action03 = f79509b;
        if (action02 != action03 && (action0 = (Action0) this.f79510a.getAndSet(action03)) != null && action0 != action03) {
            action0.call();
        }
    }

    public static BooleanSubscription create(Action0 action0) {
        return new BooleanSubscription(action0);
    }

    public BooleanSubscription(Action0 action0) {
        this.f79510a = new AtomicReference(action0);
    }
}
