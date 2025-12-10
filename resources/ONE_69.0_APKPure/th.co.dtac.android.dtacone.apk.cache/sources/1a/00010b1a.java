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
    public static final Object f78821b = new Object();

    /* renamed from: a */
    public final Observable f78822a;

    /* renamed from: rx.internal.operators.OperatorSampleWithObservable$a */
    /* loaded from: classes7.dex */
    public class C13629a extends Subscriber {

        /* renamed from: a */
        public final /* synthetic */ AtomicReference f78823a;

        /* renamed from: b */
        public final /* synthetic */ SerializedSubscriber f78824b;

        /* renamed from: c */
        public final /* synthetic */ AtomicReference f78825c;

        public C13629a(AtomicReference atomicReference, SerializedSubscriber serializedSubscriber, AtomicReference atomicReference2) {
            this.f78823a = atomicReference;
            this.f78824b = serializedSubscriber;
            this.f78825c = atomicReference2;
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            onNext(null);
            this.f78824b.onCompleted();
            ((Subscription) this.f78825c.get()).unsubscribe();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.f78824b.onError(th2);
            ((Subscription) this.f78825c.get()).unsubscribe();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p046rx.Observer
        public void onNext(Object obj) {
            AtomicReference atomicReference = this.f78823a;
            Object obj2 = OperatorSampleWithObservable.f78821b;
            Object andSet = atomicReference.getAndSet(obj2);
            if (andSet != obj2) {
                this.f78824b.onNext(andSet);
            }
        }
    }

    /* renamed from: rx.internal.operators.OperatorSampleWithObservable$b */
    /* loaded from: classes7.dex */
    public class C13630b extends Subscriber {

        /* renamed from: a */
        public final /* synthetic */ AtomicReference f78827a;

        /* renamed from: b */
        public final /* synthetic */ SerializedSubscriber f78828b;

        /* renamed from: c */
        public final /* synthetic */ Subscriber f78829c;

        public C13630b(AtomicReference atomicReference, SerializedSubscriber serializedSubscriber, Subscriber subscriber) {
            this.f78827a = atomicReference;
            this.f78828b = serializedSubscriber;
            this.f78829c = subscriber;
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            this.f78829c.onNext(null);
            this.f78828b.onCompleted();
            this.f78829c.unsubscribe();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.f78828b.onError(th2);
            this.f78829c.unsubscribe();
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            this.f78827a.set(obj);
        }
    }

    public OperatorSampleWithObservable(Observable<U> observable) {
        this.f78822a = observable;
    }

    @Override // p046rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        SerializedSubscriber serializedSubscriber = new SerializedSubscriber(subscriber);
        AtomicReference atomicReference = new AtomicReference(f78821b);
        AtomicReference atomicReference2 = new AtomicReference();
        C13629a c13629a = new C13629a(atomicReference, serializedSubscriber, atomicReference2);
        C13630b c13630b = new C13630b(atomicReference, serializedSubscriber, c13629a);
        atomicReference2.lazySet(c13630b);
        subscriber.add(c13630b);
        subscriber.add(c13629a);
        this.f78822a.unsafeSubscribe(c13629a);
        return c13630b;
    }
}