package p046rx.internal.operators;

import java.util.concurrent.atomic.AtomicBoolean;
import p046rx.Single;
import p046rx.SingleEmitter;
import p046rx.SingleSubscriber;
import p046rx.Subscription;
import p046rx.exceptions.Exceptions;
import p046rx.functions.Action1;
import p046rx.functions.Cancellable;
import p046rx.internal.subscriptions.CancellableSubscription;
import p046rx.internal.subscriptions.SequentialSubscription;
import p046rx.plugins.RxJavaHooks;

/* renamed from: rx.internal.operators.SingleFromEmitter */
/* loaded from: classes7.dex */
public final class SingleFromEmitter<T> implements Single.OnSubscribe<T> {

    /* renamed from: a */
    public final Action1 f78964a;

    /* renamed from: rx.internal.operators.SingleFromEmitter$SingleEmitterImpl */
    /* loaded from: classes7.dex */
    public static final class SingleEmitterImpl<T> extends AtomicBoolean implements SingleEmitter<T>, Subscription {
        private static final long serialVersionUID = 8082834163465882809L;
        final SingleSubscriber<? super T> actual;
        final SequentialSubscription resource = new SequentialSubscription();

        public SingleEmitterImpl(SingleSubscriber<? super T> singleSubscriber) {
            this.actual = singleSubscriber;
        }

        @Override // p046rx.Subscription
        public boolean isUnsubscribed() {
            return get();
        }

        @Override // p046rx.SingleEmitter
        public void onError(Throwable th2) {
            if (th2 == null) {
                th2 = new NullPointerException();
            }
            if (compareAndSet(false, true)) {
                try {
                    this.actual.onError(th2);
                    return;
                } finally {
                    this.resource.unsubscribe();
                }
            }
            RxJavaHooks.onError(th2);
        }

        @Override // p046rx.SingleEmitter
        public void onSuccess(T t) {
            if (compareAndSet(false, true)) {
                try {
                    this.actual.onSuccess(t);
                } finally {
                    this.resource.unsubscribe();
                }
            }
        }

        @Override // p046rx.SingleEmitter
        public void setCancellation(Cancellable cancellable) {
            setSubscription(new CancellableSubscription(cancellable));
        }

        @Override // p046rx.SingleEmitter
        public void setSubscription(Subscription subscription) {
            this.resource.update(subscription);
        }

        @Override // p046rx.Subscription
        public void unsubscribe() {
            if (compareAndSet(false, true)) {
                this.resource.unsubscribe();
            }
        }
    }

    public SingleFromEmitter(Action1<SingleEmitter<T>> action1) {
        this.f78964a = action1;
    }

    @Override // p046rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((SingleSubscriber) ((SingleSubscriber) obj));
    }

    public void call(SingleSubscriber<? super T> singleSubscriber) {
        SingleEmitterImpl singleEmitterImpl = new SingleEmitterImpl(singleSubscriber);
        singleSubscriber.add(singleEmitterImpl);
        try {
            this.f78964a.call(singleEmitterImpl);
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            singleEmitterImpl.onError(th2);
        }
    }
}
