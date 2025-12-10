package p046rx.internal.operators;

import p046rx.Subscriber;
import p046rx.plugins.RxJavaHooks;

/* renamed from: rx.internal.operators.DeferredScalarSubscriberSafe */
/* loaded from: classes7.dex */
public abstract class DeferredScalarSubscriberSafe<T, R> extends DeferredScalarSubscriber<T, R> {
    protected boolean done;

    public DeferredScalarSubscriberSafe(Subscriber<? super R> subscriber) {
        super(subscriber);
    }

    @Override // p046rx.internal.operators.DeferredScalarSubscriber, p046rx.Observer
    public void onCompleted() {
        if (this.done) {
            return;
        }
        this.done = true;
        super.onCompleted();
    }

    @Override // p046rx.internal.operators.DeferredScalarSubscriber, p046rx.Observer
    public void onError(Throwable th2) {
        if (!this.done) {
            this.done = true;
            super.onError(th2);
            return;
        }
        RxJavaHooks.onError(th2);
    }
}
