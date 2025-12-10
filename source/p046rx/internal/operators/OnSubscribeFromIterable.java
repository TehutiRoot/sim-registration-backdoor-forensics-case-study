package p046rx.internal.operators;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import p046rx.Observable;
import p046rx.Producer;
import p046rx.Subscriber;
import p046rx.exceptions.Exceptions;

/* renamed from: rx.internal.operators.OnSubscribeFromIterable */
/* loaded from: classes7.dex */
public final class OnSubscribeFromIterable<T> implements Observable.OnSubscribe<T> {

    /* renamed from: a */
    public final Iterable f77989a;

    /* renamed from: rx.internal.operators.OnSubscribeFromIterable$IterableProducer */
    /* loaded from: classes7.dex */
    public static final class IterableProducer<T> extends AtomicLong implements Producer {
        private static final long serialVersionUID = -8730475647105475802L;

        /* renamed from: it */
        private final Iterator<? extends T> f77990it;

        /* renamed from: o */
        private final Subscriber<? super T> f77991o;

        public IterableProducer(Subscriber<? super T> subscriber, Iterator<? extends T> it) {
            this.f77991o = subscriber;
            this.f77990it = it;
        }

        public void fastPath() {
            Subscriber<? super T> subscriber = this.f77991o;
            Iterator<? extends T> it = this.f77990it;
            while (!subscriber.isUnsubscribed()) {
                try {
                    subscriber.onNext((T) it.next());
                    if (subscriber.isUnsubscribed()) {
                        return;
                    }
                    try {
                        if (!it.hasNext()) {
                            if (!subscriber.isUnsubscribed()) {
                                subscriber.onCompleted();
                                return;
                            }
                            return;
                        }
                    } catch (Throwable th2) {
                        Exceptions.throwOrReport(th2, subscriber);
                        return;
                    }
                } catch (Throwable th3) {
                    Exceptions.throwOrReport(th3, subscriber);
                    return;
                }
            }
        }

        @Override // p046rx.Producer
        public void request(long j) {
            if (get() == Long.MAX_VALUE) {
                return;
            }
            if (j == Long.MAX_VALUE && compareAndSet(0L, Long.MAX_VALUE)) {
                fastPath();
            } else if (j > 0 && BackpressureUtils.getAndAddRequest(this, j) == 0) {
                slowPath(j);
            }
        }

        public void slowPath(long j) {
            Subscriber<? super T> subscriber = this.f77991o;
            Iterator<? extends T> it = this.f77990it;
            do {
                long j2 = 0;
                while (true) {
                    if (j2 != j) {
                        if (subscriber.isUnsubscribed()) {
                            return;
                        }
                        try {
                            subscriber.onNext((T) it.next());
                            if (subscriber.isUnsubscribed()) {
                                return;
                            }
                            try {
                                if (!it.hasNext()) {
                                    if (!subscriber.isUnsubscribed()) {
                                        subscriber.onCompleted();
                                        return;
                                    }
                                    return;
                                }
                                j2++;
                            } catch (Throwable th2) {
                                Exceptions.throwOrReport(th2, subscriber);
                                return;
                            }
                        } catch (Throwable th3) {
                            Exceptions.throwOrReport(th3, subscriber);
                            return;
                        }
                    } else {
                        j = get();
                        if (j2 == j) {
                            j = BackpressureUtils.produced(this, j2);
                        }
                    }
                }
            } while (j != 0);
        }
    }

    public OnSubscribeFromIterable(Iterable<? extends T> iterable) {
        if (iterable != null) {
            this.f77989a = iterable;
            return;
        }
        throw new NullPointerException("iterable must not be null");
    }

    @Override // p046rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((Subscriber) ((Subscriber) obj));
    }

    public void call(Subscriber<? super T> subscriber) {
        try {
            Iterator<T> it = this.f77989a.iterator();
            boolean hasNext = it.hasNext();
            if (subscriber.isUnsubscribed()) {
                return;
            }
            if (!hasNext) {
                subscriber.onCompleted();
            } else {
                subscriber.setProducer(new IterableProducer(subscriber, it));
            }
        } catch (Throwable th2) {
            Exceptions.throwOrReport(th2, subscriber);
        }
    }
}
