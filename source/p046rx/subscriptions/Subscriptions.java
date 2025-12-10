package p046rx.subscriptions;

import java.util.concurrent.Future;
import p046rx.Subscription;
import p046rx.functions.Action0;

/* renamed from: rx.subscriptions.Subscriptions */
/* loaded from: classes7.dex */
public final class Subscriptions {

    /* renamed from: a */
    public static final C13878b f79520a = new C13878b();

    /* renamed from: rx.subscriptions.Subscriptions$a */
    /* loaded from: classes7.dex */
    public static final class C13877a implements Subscription {

        /* renamed from: a */
        public final Future f79521a;

        public C13877a(Future future) {
            this.f79521a = future;
        }

        @Override // p046rx.Subscription
        public boolean isUnsubscribed() {
            return this.f79521a.isCancelled();
        }

        @Override // p046rx.Subscription
        public void unsubscribe() {
            this.f79521a.cancel(true);
        }
    }

    /* renamed from: rx.subscriptions.Subscriptions$b */
    /* loaded from: classes7.dex */
    public static final class C13878b implements Subscription {
        @Override // p046rx.Subscription
        public boolean isUnsubscribed() {
            return true;
        }

        @Override // p046rx.Subscription
        public void unsubscribe() {
        }
    }

    public static Subscription create(Action0 action0) {
        return BooleanSubscription.create(action0);
    }

    public static Subscription empty() {
        return BooleanSubscription.create();
    }

    public static Subscription from(Future<?> future) {
        return new C13877a(future);
    }

    public static Subscription unsubscribed() {
        return f79520a;
    }

    public static CompositeSubscription from(Subscription... subscriptionArr) {
        return new CompositeSubscription(subscriptionArr);
    }
}
