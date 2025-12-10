package p046rx.internal.operators;

import p046rx.Observable;
import p046rx.Subscriber;
import p046rx.exceptions.Exceptions;
import p046rx.functions.Func1;
import p046rx.internal.operators.OperatorDebounceWithTime;
import p046rx.observers.SerializedSubscriber;
import p046rx.subscriptions.SerialSubscription;

/* renamed from: rx.internal.operators.OperatorDebounceWithSelector */
/* loaded from: classes7.dex */
public final class OperatorDebounceWithSelector<T, U> implements Observable.Operator<T, T> {

    /* renamed from: a */
    public final Func1 f78484a;

    /* renamed from: rx.internal.operators.OperatorDebounceWithSelector$a */
    /* loaded from: classes7.dex */
    public class C13546a extends Subscriber {

        /* renamed from: a */
        public final OperatorDebounceWithTime.C13550b f78485a;

        /* renamed from: b */
        public final Subscriber f78486b;

        /* renamed from: c */
        public final /* synthetic */ SerializedSubscriber f78487c;

        /* renamed from: d */
        public final /* synthetic */ SerialSubscription f78488d;

        /* renamed from: rx.internal.operators.OperatorDebounceWithSelector$a$a */
        /* loaded from: classes7.dex */
        public class C13547a extends Subscriber {

            /* renamed from: a */
            public final /* synthetic */ int f78490a;

            public C13547a(int i) {
                this.f78490a = i;
            }

            @Override // p046rx.Observer
            public void onCompleted() {
                C13546a c13546a = C13546a.this;
                c13546a.f78485a.m23258b(this.f78490a, c13546a.f78487c, c13546a.f78486b);
                unsubscribe();
            }

            @Override // p046rx.Observer
            public void onError(Throwable th2) {
                C13546a.this.f78486b.onError(th2);
            }

            @Override // p046rx.Observer
            public void onNext(Object obj) {
                onCompleted();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13546a(Subscriber subscriber, SerializedSubscriber serializedSubscriber, SerialSubscription serialSubscription) {
            super(subscriber);
            this.f78487c = serializedSubscriber;
            this.f78488d = serialSubscription;
            this.f78485a = new OperatorDebounceWithTime.C13550b();
            this.f78486b = this;
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            this.f78485a.m23257c(this.f78487c, this);
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.f78487c.onError(th2);
            unsubscribe();
            this.f78485a.m23259a();
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            try {
                Observable observable = (Observable) OperatorDebounceWithSelector.this.f78484a.call(obj);
                C13547a c13547a = new C13547a(this.f78485a.m23256d(obj));
                this.f78488d.set(c13547a);
                observable.unsafeSubscribe(c13547a);
            } catch (Throwable th2) {
                Exceptions.throwOrReport(th2, this);
            }
        }

        @Override // p046rx.Subscriber, p046rx.observers.AssertableSubscriber
        public void onStart() {
            request(Long.MAX_VALUE);
        }
    }

    public OperatorDebounceWithSelector(Func1<? super T, ? extends Observable<U>> func1) {
        this.f78484a = func1;
    }

    @Override // p046rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        SerializedSubscriber serializedSubscriber = new SerializedSubscriber(subscriber);
        SerialSubscription serialSubscription = new SerialSubscription();
        subscriber.add(serialSubscription);
        return new C13546a(subscriber, serializedSubscriber, serialSubscription);
    }
}