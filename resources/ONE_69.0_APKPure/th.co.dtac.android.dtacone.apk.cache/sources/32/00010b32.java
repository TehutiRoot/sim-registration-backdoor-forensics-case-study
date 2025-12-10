package p046rx.internal.operators;

import java.util.concurrent.atomic.AtomicBoolean;
import p046rx.Observable;
import p046rx.Subscriber;
import p046rx.observers.SerializedSubscriber;

/* renamed from: rx.internal.operators.OperatorSkipUntil */
/* loaded from: classes7.dex */
public final class OperatorSkipUntil<T, U> implements Observable.Operator<T, T> {

    /* renamed from: a */
    public final Observable f78885a;

    /* renamed from: rx.internal.operators.OperatorSkipUntil$a */
    /* loaded from: classes7.dex */
    public class C13644a extends Subscriber {

        /* renamed from: a */
        public final /* synthetic */ AtomicBoolean f78886a;

        /* renamed from: b */
        public final /* synthetic */ SerializedSubscriber f78887b;

        public C13644a(AtomicBoolean atomicBoolean, SerializedSubscriber serializedSubscriber) {
            this.f78886a = atomicBoolean;
            this.f78887b = serializedSubscriber;
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            unsubscribe();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.f78887b.onError(th2);
            this.f78887b.unsubscribe();
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            this.f78886a.set(true);
            unsubscribe();
        }
    }

    /* renamed from: rx.internal.operators.OperatorSkipUntil$b */
    /* loaded from: classes7.dex */
    public class C13645b extends Subscriber {

        /* renamed from: a */
        public final /* synthetic */ AtomicBoolean f78889a;

        /* renamed from: b */
        public final /* synthetic */ SerializedSubscriber f78890b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13645b(Subscriber subscriber, AtomicBoolean atomicBoolean, SerializedSubscriber serializedSubscriber) {
            super(subscriber);
            this.f78889a = atomicBoolean;
            this.f78890b = serializedSubscriber;
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            this.f78890b.onCompleted();
            unsubscribe();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.f78890b.onError(th2);
            unsubscribe();
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            if (this.f78889a.get()) {
                this.f78890b.onNext(obj);
            } else {
                request(1L);
            }
        }
    }

    public OperatorSkipUntil(Observable<U> observable) {
        this.f78885a = observable;
    }

    @Override // p046rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        SerializedSubscriber serializedSubscriber = new SerializedSubscriber(subscriber);
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        C13644a c13644a = new C13644a(atomicBoolean, serializedSubscriber);
        subscriber.add(c13644a);
        this.f78885a.unsafeSubscribe(c13644a);
        return new C13645b(subscriber, atomicBoolean, serializedSubscriber);
    }
}