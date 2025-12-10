package p046rx.internal.operators;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import p046rx.Completable;
import p046rx.CompletableSubscriber;
import p046rx.Subscription;
import p046rx.internal.subscriptions.SequentialSubscription;
import p046rx.subscriptions.Subscriptions;

/* renamed from: rx.internal.operators.CompletableOnSubscribeConcatIterable */
/* loaded from: classes7.dex */
public final class CompletableOnSubscribeConcatIterable implements Completable.OnSubscribe {

    /* renamed from: a */
    public final Iterable f77808a;

    /* renamed from: rx.internal.operators.CompletableOnSubscribeConcatIterable$ConcatInnerSubscriber */
    /* loaded from: classes7.dex */
    public static final class ConcatInnerSubscriber extends AtomicInteger implements CompletableSubscriber {
        private static final long serialVersionUID = -7965400327305809232L;
        final CompletableSubscriber actual;

        /* renamed from: sd */
        final SequentialSubscription f77809sd = new SequentialSubscription();
        final Iterator<? extends Completable> sources;

        public ConcatInnerSubscriber(CompletableSubscriber completableSubscriber, Iterator<? extends Completable> it) {
            this.actual = completableSubscriber;
            this.sources = it;
        }

        public void next() {
            if (this.f77809sd.isUnsubscribed() || getAndIncrement() != 0) {
                return;
            }
            Iterator<? extends Completable> it = this.sources;
            while (!this.f77809sd.isUnsubscribed()) {
                try {
                    if (!it.hasNext()) {
                        this.actual.onCompleted();
                        return;
                    }
                    try {
                        Completable next = it.next();
                        if (next == null) {
                            this.actual.onError(new NullPointerException("The completable returned is null"));
                            return;
                        }
                        next.unsafeSubscribe(this);
                        if (decrementAndGet() == 0) {
                            return;
                        }
                    } catch (Throwable th2) {
                        this.actual.onError(th2);
                        return;
                    }
                } catch (Throwable th3) {
                    this.actual.onError(th3);
                    return;
                }
            }
        }

        @Override // p046rx.CompletableSubscriber
        public void onCompleted() {
            next();
        }

        @Override // p046rx.CompletableSubscriber
        public void onError(Throwable th2) {
            this.actual.onError(th2);
        }

        @Override // p046rx.CompletableSubscriber
        public void onSubscribe(Subscription subscription) {
            this.f77809sd.replace(subscription);
        }
    }

    public CompletableOnSubscribeConcatIterable(Iterable<? extends Completable> iterable) {
        this.f77808a = iterable;
    }

    @Override // p046rx.functions.Action1
    public void call(CompletableSubscriber completableSubscriber) {
        try {
            Iterator it = this.f77808a.iterator();
            if (it == null) {
                completableSubscriber.onSubscribe(Subscriptions.unsubscribed());
                completableSubscriber.onError(new NullPointerException("The iterator returned is null"));
                return;
            }
            ConcatInnerSubscriber concatInnerSubscriber = new ConcatInnerSubscriber(completableSubscriber, it);
            completableSubscriber.onSubscribe(concatInnerSubscriber.f77809sd);
            concatInnerSubscriber.next();
        } catch (Throwable th2) {
            completableSubscriber.onSubscribe(Subscriptions.unsubscribed());
            completableSubscriber.onError(th2);
        }
    }
}
