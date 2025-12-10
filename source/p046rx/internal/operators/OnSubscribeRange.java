package p046rx.internal.operators;

import java.util.concurrent.atomic.AtomicLong;
import p046rx.Observable;
import p046rx.Producer;
import p046rx.Subscriber;

/* renamed from: rx.internal.operators.OnSubscribeRange */
/* loaded from: classes7.dex */
public final class OnSubscribeRange implements Observable.OnSubscribe<Integer> {

    /* renamed from: a */
    public final int f78043a;

    /* renamed from: b */
    public final int f78044b;

    /* renamed from: rx.internal.operators.OnSubscribeRange$RangeProducer */
    /* loaded from: classes7.dex */
    public static final class RangeProducer extends AtomicLong implements Producer {
        private static final long serialVersionUID = 4114392207069098388L;
        private final Subscriber<? super Integer> childSubscriber;
        private long currentIndex;
        private final int endOfRange;

        public RangeProducer(Subscriber<? super Integer> subscriber, int i, int i2) {
            this.childSubscriber = subscriber;
            this.currentIndex = i;
            this.endOfRange = i2;
        }

        public void fastPath() {
            long j = this.endOfRange + 1;
            Subscriber<? super Integer> subscriber = this.childSubscriber;
            for (long j2 = this.currentIndex; j2 != j; j2++) {
                if (subscriber.isUnsubscribed()) {
                    return;
                }
                subscriber.onNext(Integer.valueOf((int) j2));
            }
            if (!subscriber.isUnsubscribed()) {
                subscriber.onCompleted();
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
            long j2 = this.endOfRange + 1;
            long j3 = this.currentIndex;
            Subscriber<? super Integer> subscriber = this.childSubscriber;
            do {
                long j4 = 0;
                while (true) {
                    if (j4 != j && j3 != j2) {
                        if (subscriber.isUnsubscribed()) {
                            return;
                        }
                        subscriber.onNext(Integer.valueOf((int) j3));
                        j3++;
                        j4++;
                    } else if (subscriber.isUnsubscribed()) {
                        return;
                    } else {
                        if (j3 == j2) {
                            subscriber.onCompleted();
                            return;
                        }
                        j = get();
                        if (j == j4) {
                            this.currentIndex = j3;
                            j = addAndGet(-j4);
                        }
                    }
                }
            } while (j != 0);
        }
    }

    public OnSubscribeRange(int i, int i2) {
        this.f78043a = i;
        this.f78044b = i2;
    }

    @Override // p046rx.functions.Action1
    public void call(Subscriber<? super Integer> subscriber) {
        subscriber.setProducer(new RangeProducer(subscriber, this.f78043a, this.f78044b));
    }
}
