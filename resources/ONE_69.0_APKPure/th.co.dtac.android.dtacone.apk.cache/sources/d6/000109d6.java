package p046rx.internal.operators;

import java.util.concurrent.atomic.AtomicInteger;
import p046rx.Completable;
import p046rx.CompletableSubscriber;
import p046rx.Subscription;
import p046rx.internal.subscriptions.SequentialSubscription;

/* renamed from: rx.internal.operators.CompletableOnSubscribeConcatArray */
/* loaded from: classes7.dex */
public final class CompletableOnSubscribeConcatArray implements Completable.OnSubscribe {

    /* renamed from: a */
    public final Completable[] f78012a;

    /* renamed from: rx.internal.operators.CompletableOnSubscribeConcatArray$ConcatInnerSubscriber */
    /* loaded from: classes7.dex */
    public static final class ConcatInnerSubscriber extends AtomicInteger implements CompletableSubscriber {
        private static final long serialVersionUID = -7965400327305809232L;
        final CompletableSubscriber actual;
        int index;

        /* renamed from: sd */
        final SequentialSubscription f78013sd = new SequentialSubscription();
        final Completable[] sources;

        public ConcatInnerSubscriber(CompletableSubscriber completableSubscriber, Completable[] completableArr) {
            this.actual = completableSubscriber;
            this.sources = completableArr;
        }

        public void next() {
            if (this.f78013sd.isUnsubscribed() || getAndIncrement() != 0) {
                return;
            }
            Completable[] completableArr = this.sources;
            while (!this.f78013sd.isUnsubscribed()) {
                int i = this.index;
                this.index = i + 1;
                if (i == completableArr.length) {
                    this.actual.onCompleted();
                    return;
                }
                completableArr[i].unsafeSubscribe(this);
                if (decrementAndGet() == 0) {
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
            this.f78013sd.replace(subscription);
        }
    }

    public CompletableOnSubscribeConcatArray(Completable[] completableArr) {
        this.f78012a = completableArr;
    }

    @Override // p046rx.functions.Action1
    public void call(CompletableSubscriber completableSubscriber) {
        ConcatInnerSubscriber concatInnerSubscriber = new ConcatInnerSubscriber(completableSubscriber, this.f78012a);
        completableSubscriber.onSubscribe(concatInnerSubscriber.f78013sd);
        concatInnerSubscriber.next();
    }
}