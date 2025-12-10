package p046rx.internal.operators;

import p046rx.Observable;
import p046rx.Producer;
import p046rx.Subscriber;

/* renamed from: rx.internal.operators.OperatorSkip */
/* loaded from: classes7.dex */
public final class OperatorSkip<T> implements Observable.Operator<T, T> {

    /* renamed from: a */
    public final int f78872a;

    /* renamed from: rx.internal.operators.OperatorSkip$a */
    /* loaded from: classes7.dex */
    public class C13641a extends Subscriber {

        /* renamed from: a */
        public int f78873a;

        /* renamed from: b */
        public final /* synthetic */ Subscriber f78874b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13641a(Subscriber subscriber, Subscriber subscriber2) {
            super(subscriber);
            this.f78874b = subscriber2;
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            this.f78874b.onCompleted();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.f78874b.onError(th2);
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            int i = this.f78873a;
            if (i >= OperatorSkip.this.f78872a) {
                this.f78874b.onNext(obj);
            } else {
                this.f78873a = i + 1;
            }
        }

        @Override // p046rx.Subscriber, p046rx.observers.AssertableSubscriber
        public void setProducer(Producer producer) {
            this.f78874b.setProducer(producer);
            producer.request(OperatorSkip.this.f78872a);
        }
    }

    public OperatorSkip(int i) {
        if (i >= 0) {
            this.f78872a = i;
            return;
        }
        throw new IllegalArgumentException("n >= 0 required but it was " + i);
    }

    @Override // p046rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        return new C13641a(subscriber, subscriber);
    }
}