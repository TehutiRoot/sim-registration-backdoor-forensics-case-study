package p046rx.internal.operators;

import p046rx.Observable;
import p046rx.Subscriber;
import p046rx.exceptions.Exceptions;
import p046rx.functions.Func1;
import p046rx.observers.SerializedSubscriber;
import p046rx.observers.Subscribers;
import p046rx.subjects.PublishSubject;

/* renamed from: rx.internal.operators.OperatorDelayWithSelector */
/* loaded from: classes7.dex */
public final class OperatorDelayWithSelector<T, V> implements Observable.Operator<T, T> {

    /* renamed from: a */
    public final Observable f78314a;

    /* renamed from: b */
    public final Func1 f78315b;

    /* renamed from: rx.internal.operators.OperatorDelayWithSelector$a */
    /* loaded from: classes7.dex */
    public class C13554a extends Subscriber {

        /* renamed from: a */
        public final /* synthetic */ PublishSubject f78316a;

        /* renamed from: b */
        public final /* synthetic */ SerializedSubscriber f78317b;

        /* renamed from: rx.internal.operators.OperatorDelayWithSelector$a$a */
        /* loaded from: classes7.dex */
        public class C13555a implements Func1 {

            /* renamed from: a */
            public final /* synthetic */ Object f78319a;

            public C13555a(Object obj) {
                this.f78319a = obj;
            }

            @Override // p046rx.functions.Func1
            public Object call(Object obj) {
                return this.f78319a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13554a(Subscriber subscriber, PublishSubject publishSubject, SerializedSubscriber serializedSubscriber) {
            super(subscriber);
            this.f78316a = publishSubject;
            this.f78317b = serializedSubscriber;
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            this.f78316a.onCompleted();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.f78317b.onError(th2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p046rx.Observer
        public void onNext(Object obj) {
            try {
                this.f78316a.onNext(((Observable) OperatorDelayWithSelector.this.f78315b.call(obj)).take(1).defaultIfEmpty(null).map(new C13555a(obj)));
            } catch (Throwable th2) {
                Exceptions.throwOrReport(th2, this);
            }
        }
    }

    public OperatorDelayWithSelector(Observable<? extends T> observable, Func1<? super T, ? extends Observable<V>> func1) {
        this.f78314a = observable;
        this.f78315b = func1;
    }

    @Override // p046rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        SerializedSubscriber serializedSubscriber = new SerializedSubscriber(subscriber);
        PublishSubject create = PublishSubject.create();
        subscriber.add(Observable.merge(create).unsafeSubscribe(Subscribers.from(serializedSubscriber)));
        return new C13554a(subscriber, create, serializedSubscriber);
    }
}
