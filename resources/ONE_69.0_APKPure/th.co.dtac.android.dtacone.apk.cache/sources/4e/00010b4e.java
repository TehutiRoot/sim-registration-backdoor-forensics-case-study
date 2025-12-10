package p046rx.internal.operators;

import p046rx.Observable;
import p046rx.Subscriber;
import p046rx.observers.SerializedSubscriber;

/* renamed from: rx.internal.operators.OperatorTakeUntil */
/* loaded from: classes7.dex */
public final class OperatorTakeUntil<T, E> implements Observable.Operator<T, T> {

    /* renamed from: a */
    public final Observable f78961a;

    /* renamed from: rx.internal.operators.OperatorTakeUntil$a */
    /* loaded from: classes7.dex */
    public class C13664a extends Subscriber {

        /* renamed from: a */
        public final /* synthetic */ Subscriber f78962a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13664a(Subscriber subscriber, boolean z, Subscriber subscriber2) {
            super(subscriber, z);
            this.f78962a = subscriber2;
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            try {
                this.f78962a.onCompleted();
            } finally {
                this.f78962a.unsubscribe();
            }
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            try {
                this.f78962a.onError(th2);
            } finally {
                this.f78962a.unsubscribe();
            }
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            this.f78962a.onNext(obj);
        }
    }

    /* renamed from: rx.internal.operators.OperatorTakeUntil$b */
    /* loaded from: classes7.dex */
    public class C13665b extends Subscriber {

        /* renamed from: a */
        public final /* synthetic */ Subscriber f78964a;

        public C13665b(Subscriber subscriber) {
            this.f78964a = subscriber;
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            this.f78964a.onCompleted();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.f78964a.onError(th2);
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
        this.f78961a = observable;
    }

    @Override // p046rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        SerializedSubscriber serializedSubscriber = new SerializedSubscriber(subscriber, false);
        C13664a c13664a = new C13664a(serializedSubscriber, false, serializedSubscriber);
        C13665b c13665b = new C13665b(c13664a);
        serializedSubscriber.add(c13664a);
        serializedSubscriber.add(c13665b);
        subscriber.add(serializedSubscriber);
        this.f78961a.unsafeSubscribe(c13665b);
        return c13664a;
    }
}