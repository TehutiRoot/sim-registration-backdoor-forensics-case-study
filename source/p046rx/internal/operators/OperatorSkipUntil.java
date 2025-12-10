package p046rx.internal.operators;

import java.util.concurrent.atomic.AtomicBoolean;
import p046rx.Observable;
import p046rx.Subscriber;
import p046rx.observers.SerializedSubscriber;

/* renamed from: rx.internal.operators.OperatorSkipUntil */
/* loaded from: classes7.dex */
public final class OperatorSkipUntil<T, U> implements Observable.Operator<T, T> {

    /* renamed from: a */
    public final Observable f78679a;

    /* renamed from: rx.internal.operators.OperatorSkipUntil$a */
    /* loaded from: classes7.dex */
    public class C13643a extends Subscriber {

        /* renamed from: a */
        public final /* synthetic */ AtomicBoolean f78680a;

        /* renamed from: b */
        public final /* synthetic */ SerializedSubscriber f78681b;

        public C13643a(AtomicBoolean atomicBoolean, SerializedSubscriber serializedSubscriber) {
            this.f78680a = atomicBoolean;
            this.f78681b = serializedSubscriber;
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            unsubscribe();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.f78681b.onError(th2);
            this.f78681b.unsubscribe();
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            this.f78680a.set(true);
            unsubscribe();
        }
    }

    /* renamed from: rx.internal.operators.OperatorSkipUntil$b */
    /* loaded from: classes7.dex */
    public class C13644b extends Subscriber {

        /* renamed from: a */
        public final /* synthetic */ AtomicBoolean f78683a;

        /* renamed from: b */
        public final /* synthetic */ SerializedSubscriber f78684b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13644b(Subscriber subscriber, AtomicBoolean atomicBoolean, SerializedSubscriber serializedSubscriber) {
            super(subscriber);
            this.f78683a = atomicBoolean;
            this.f78684b = serializedSubscriber;
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            this.f78684b.onCompleted();
            unsubscribe();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.f78684b.onError(th2);
            unsubscribe();
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            if (this.f78683a.get()) {
                this.f78684b.onNext(obj);
            } else {
                request(1L);
            }
        }
    }

    public OperatorSkipUntil(Observable<U> observable) {
        this.f78679a = observable;
    }

    @Override // p046rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        SerializedSubscriber serializedSubscriber = new SerializedSubscriber(subscriber);
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        C13643a c13643a = new C13643a(atomicBoolean, serializedSubscriber);
        subscriber.add(c13643a);
        this.f78679a.unsafeSubscribe(c13643a);
        return new C13644b(subscriber, atomicBoolean, serializedSubscriber);
    }
}
