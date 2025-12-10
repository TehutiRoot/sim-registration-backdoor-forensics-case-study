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
    public final Func1 f78278a;

    /* renamed from: rx.internal.operators.OperatorDebounceWithSelector$a */
    /* loaded from: classes7.dex */
    public class C13545a extends Subscriber {

        /* renamed from: a */
        public final OperatorDebounceWithTime.C13549b f78279a;

        /* renamed from: b */
        public final Subscriber f78280b;

        /* renamed from: c */
        public final /* synthetic */ SerializedSubscriber f78281c;

        /* renamed from: d */
        public final /* synthetic */ SerialSubscription f78282d;

        /* renamed from: rx.internal.operators.OperatorDebounceWithSelector$a$a */
        /* loaded from: classes7.dex */
        public class C13546a extends Subscriber {

            /* renamed from: a */
            public final /* synthetic */ int f78284a;

            public C13546a(int i) {
                this.f78284a = i;
            }

            @Override // p046rx.Observer
            public void onCompleted() {
                C13545a c13545a = C13545a.this;
                c13545a.f78279a.m23070b(this.f78284a, c13545a.f78281c, c13545a.f78280b);
                unsubscribe();
            }

            @Override // p046rx.Observer
            public void onError(Throwable th2) {
                C13545a.this.f78280b.onError(th2);
            }

            @Override // p046rx.Observer
            public void onNext(Object obj) {
                onCompleted();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13545a(Subscriber subscriber, SerializedSubscriber serializedSubscriber, SerialSubscription serialSubscription) {
            super(subscriber);
            this.f78281c = serializedSubscriber;
            this.f78282d = serialSubscription;
            this.f78279a = new OperatorDebounceWithTime.C13549b();
            this.f78280b = this;
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            this.f78279a.m23069c(this.f78281c, this);
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.f78281c.onError(th2);
            unsubscribe();
            this.f78279a.m23071a();
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            try {
                Observable observable = (Observable) OperatorDebounceWithSelector.this.f78278a.call(obj);
                C13546a c13546a = new C13546a(this.f78279a.m23068d(obj));
                this.f78282d.set(c13546a);
                observable.unsafeSubscribe(c13546a);
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
        this.f78278a = func1;
    }

    @Override // p046rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        SerializedSubscriber serializedSubscriber = new SerializedSubscriber(subscriber);
        SerialSubscription serialSubscription = new SerialSubscription();
        subscriber.add(serialSubscription);
        return new C13545a(subscriber, serializedSubscriber, serialSubscription);
    }
}
