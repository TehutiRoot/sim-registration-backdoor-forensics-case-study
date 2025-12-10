package p046rx.internal.operators;

import java.util.concurrent.atomic.AtomicReference;
import p046rx.Observable;
import p046rx.Subscriber;
import p046rx.Subscription;
import p046rx.observers.SerializedSubscriber;

/* renamed from: rx.internal.operators.OperatorSampleWithObservable */
/* loaded from: classes7.dex */
public final class OperatorSampleWithObservable<T, U> implements Observable.Operator<T, T> {

    /* renamed from: b */
    public static final Object f78615b = new Object();

    /* renamed from: a */
    public final Observable f78616a;

    /* renamed from: rx.internal.operators.OperatorSampleWithObservable$a */
    /* loaded from: classes7.dex */
    public class C13628a extends Subscriber {

        /* renamed from: a */
        public final /* synthetic */ AtomicReference f78617a;

        /* renamed from: b */
        public final /* synthetic */ SerializedSubscriber f78618b;

        /* renamed from: c */
        public final /* synthetic */ AtomicReference f78619c;

        public C13628a(AtomicReference atomicReference, SerializedSubscriber serializedSubscriber, AtomicReference atomicReference2) {
            this.f78617a = atomicReference;
            this.f78618b = serializedSubscriber;
            this.f78619c = atomicReference2;
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            onNext(null);
            this.f78618b.onCompleted();
            ((Subscription) this.f78619c.get()).unsubscribe();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.f78618b.onError(th2);
            ((Subscription) this.f78619c.get()).unsubscribe();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p046rx.Observer
        public void onNext(Object obj) {
            AtomicReference atomicReference = this.f78617a;
            Object obj2 = OperatorSampleWithObservable.f78615b;
            Object andSet = atomicReference.getAndSet(obj2);
            if (andSet != obj2) {
                this.f78618b.onNext(andSet);
            }
        }
    }

    /* renamed from: rx.internal.operators.OperatorSampleWithObservable$b */
    /* loaded from: classes7.dex */
    public class C13629b extends Subscriber {

        /* renamed from: a */
        public final /* synthetic */ AtomicReference f78621a;

        /* renamed from: b */
        public final /* synthetic */ SerializedSubscriber f78622b;

        /* renamed from: c */
        public final /* synthetic */ Subscriber f78623c;

        public C13629b(AtomicReference atomicReference, SerializedSubscriber serializedSubscriber, Subscriber subscriber) {
            this.f78621a = atomicReference;
            this.f78622b = serializedSubscriber;
            this.f78623c = subscriber;
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            this.f78623c.onNext(null);
            this.f78622b.onCompleted();
            this.f78623c.unsubscribe();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.f78622b.onError(th2);
            this.f78623c.unsubscribe();
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            this.f78621a.set(obj);
        }
    }

    public OperatorSampleWithObservable(Observable<U> observable) {
        this.f78616a = observable;
    }

    @Override // p046rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        SerializedSubscriber serializedSubscriber = new SerializedSubscriber(subscriber);
        AtomicReference atomicReference = new AtomicReference(f78615b);
        AtomicReference atomicReference2 = new AtomicReference();
        C13628a c13628a = new C13628a(atomicReference, serializedSubscriber, atomicReference2);
        C13629b c13629b = new C13629b(atomicReference, serializedSubscriber, c13628a);
        atomicReference2.lazySet(c13629b);
        subscriber.add(c13629b);
        subscriber.add(c13628a);
        this.f78616a.unsafeSubscribe(c13628a);
        return c13629b;
    }
}
