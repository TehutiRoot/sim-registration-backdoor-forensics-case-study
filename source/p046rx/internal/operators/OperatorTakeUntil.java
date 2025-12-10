package p046rx.internal.operators;

import p046rx.Observable;
import p046rx.Subscriber;
import p046rx.observers.SerializedSubscriber;

/* renamed from: rx.internal.operators.OperatorTakeUntil */
/* loaded from: classes7.dex */
public final class OperatorTakeUntil<T, E> implements Observable.Operator<T, T> {

    /* renamed from: a */
    public final Observable f78755a;

    /* renamed from: rx.internal.operators.OperatorTakeUntil$a */
    /* loaded from: classes7.dex */
    public class C13663a extends Subscriber {

        /* renamed from: a */
        public final /* synthetic */ Subscriber f78756a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13663a(Subscriber subscriber, boolean z, Subscriber subscriber2) {
            super(subscriber, z);
            this.f78756a = subscriber2;
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            try {
                this.f78756a.onCompleted();
            } finally {
                this.f78756a.unsubscribe();
            }
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            try {
                this.f78756a.onError(th2);
            } finally {
                this.f78756a.unsubscribe();
            }
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            this.f78756a.onNext(obj);
        }
    }

    /* renamed from: rx.internal.operators.OperatorTakeUntil$b */
    /* loaded from: classes7.dex */
    public class C13664b extends Subscriber {

        /* renamed from: a */
        public final /* synthetic */ Subscriber f78758a;

        public C13664b(Subscriber subscriber) {
            this.f78758a = subscriber;
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            this.f78758a.onCompleted();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.f78758a.onError(th2);
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            onCompleted();
        }

        @Override // p046rx.Subscriber, p046rx.observers.AssertableSubscriber
        public void onStart() {
            request(Long.MAX_VALUE);
        }
    }

    public OperatorTakeUntil(Observable<? extends E> observable) {
        this.f78755a = observable;
    }

    @Override // p046rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        SerializedSubscriber serializedSubscriber = new SerializedSubscriber(subscriber, false);
        C13663a c13663a = new C13663a(serializedSubscriber, false, serializedSubscriber);
        C13664b c13664b = new C13664b(c13663a);
        serializedSubscriber.add(c13663a);
        serializedSubscriber.add(c13664b);
        subscriber.add(serializedSubscriber);
        this.f78755a.unsafeSubscribe(c13664b);
        return c13663a;
    }
}
