package p046rx.internal.operators;

import java.util.concurrent.atomic.AtomicBoolean;
import p046rx.Completable;
import p046rx.CompletableEmitter;
import p046rx.CompletableSubscriber;
import p046rx.Subscription;
import p046rx.exceptions.Exceptions;
import p046rx.functions.Action1;
import p046rx.functions.Cancellable;
import p046rx.internal.subscriptions.CancellableSubscription;
import p046rx.internal.subscriptions.SequentialSubscription;
import p046rx.plugins.RxJavaHooks;

/* renamed from: rx.internal.operators.CompletableFromEmitter */
/* loaded from: classes7.dex */
public final class CompletableFromEmitter implements Completable.OnSubscribe {

    /* renamed from: a */
    public final Action1 f77796a;

    /* renamed from: rx.internal.operators.CompletableFromEmitter$FromEmitter */
    /* loaded from: classes7.dex */
    public static final class FromEmitter extends AtomicBoolean implements CompletableEmitter, Subscription {
        private static final long serialVersionUID = 5539301318568668881L;
        final CompletableSubscriber actual;
        final SequentialSubscription resource = new SequentialSubscription();

        public FromEmitter(CompletableSubscriber completableSubscriber) {
            this.actual = completableSubscriber;
        }

        @Override // p046rx.Subscription
        public boolean isUnsubscribed() {
            return get();
        }

        @Override // p046rx.CompletableEmitter
        public void onCompleted() {
            if (compareAndSet(false, true)) {
                try {
                    this.actual.onCompleted();
                } finally {
                    this.resource.unsubscribe();
                }
            }
        }

        @Override // p046rx.CompletableEmitter
        public void onError(Throwable th2) {
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

        @Override // p046rx.CompletableEmitter
        public void setCancellation(Cancellable cancellable) {
            setSubscription(new CancellableSubscription(cancellable));
        }

        @Override // p046rx.CompletableEmitter
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

    public CompletableFromEmitter(Action1<CompletableEmitter> action1) {
        this.f77796a = action1;
    }

    @Override // p046rx.functions.Action1
    public void call(CompletableSubscriber completableSubscriber) {
        FromEmitter fromEmitter = new FromEmitter(completableSubscriber);
        completableSubscriber.onSubscribe(fromEmitter);
        try {
            this.f77796a.call(fromEmitter);
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            fromEmitter.onError(th2);
        }
    }
}
