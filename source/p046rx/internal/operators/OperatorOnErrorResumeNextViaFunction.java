package p046rx.internal.operators;

import p046rx.Observable;
import p046rx.Producer;
import p046rx.Subscriber;
import p046rx.exceptions.Exceptions;
import p046rx.functions.Func1;
import p046rx.internal.producers.ProducerArbiter;
import p046rx.plugins.RxJavaHooks;
import p046rx.subscriptions.SerialSubscription;

/* renamed from: rx.internal.operators.OperatorOnErrorResumeNextViaFunction */
/* loaded from: classes7.dex */
public final class OperatorOnErrorResumeNextViaFunction<T> implements Observable.Operator<T, T> {

    /* renamed from: a */
    public final Func1 f78537a;

    /* renamed from: rx.internal.operators.OperatorOnErrorResumeNextViaFunction$a */
    /* loaded from: classes7.dex */
    public static class C13603a implements Func1 {

        /* renamed from: a */
        public final /* synthetic */ Func1 f78538a;

        public C13603a(Func1 func1) {
            this.f78538a = func1;
        }

        @Override // p046rx.functions.Func1
        /* renamed from: a */
        public Observable call(Throwable th2) {
            return Observable.just(this.f78538a.call(th2));
        }
    }

    /* renamed from: rx.internal.operators.OperatorOnErrorResumeNextViaFunction$b */
    /* loaded from: classes7.dex */
    public static class C13604b implements Func1 {

        /* renamed from: a */
        public final /* synthetic */ Observable f78539a;

        public C13604b(Observable observable) {
            this.f78539a = observable;
        }

        @Override // p046rx.functions.Func1
        /* renamed from: a */
        public Observable call(Throwable th2) {
            return this.f78539a;
        }
    }

    /* renamed from: rx.internal.operators.OperatorOnErrorResumeNextViaFunction$c */
    /* loaded from: classes7.dex */
    public static class C13605c implements Func1 {

        /* renamed from: a */
        public final /* synthetic */ Observable f78540a;

        public C13605c(Observable observable) {
            this.f78540a = observable;
        }

        @Override // p046rx.functions.Func1
        /* renamed from: a */
        public Observable call(Throwable th2) {
            if (th2 instanceof Exception) {
                return this.f78540a;
            }
            return Observable.error(th2);
        }
    }

    /* renamed from: rx.internal.operators.OperatorOnErrorResumeNextViaFunction$d */
    /* loaded from: classes7.dex */
    public class C13606d extends Subscriber {

        /* renamed from: a */
        public boolean f78541a;

        /* renamed from: b */
        public long f78542b;

        /* renamed from: c */
        public final /* synthetic */ Subscriber f78543c;

        /* renamed from: d */
        public final /* synthetic */ ProducerArbiter f78544d;

        /* renamed from: e */
        public final /* synthetic */ SerialSubscription f78545e;

        /* renamed from: rx.internal.operators.OperatorOnErrorResumeNextViaFunction$d$a */
        /* loaded from: classes7.dex */
        public class C13607a extends Subscriber {
            public C13607a() {
            }

            @Override // p046rx.Observer
            public void onCompleted() {
                C13606d.this.f78543c.onCompleted();
            }

            @Override // p046rx.Observer
            public void onError(Throwable th2) {
                C13606d.this.f78543c.onError(th2);
            }

            @Override // p046rx.Observer
            public void onNext(Object obj) {
                C13606d.this.f78543c.onNext(obj);
            }

            @Override // p046rx.Subscriber, p046rx.observers.AssertableSubscriber
            public void setProducer(Producer producer) {
                C13606d.this.f78544d.setProducer(producer);
            }
        }

        public C13606d(Subscriber subscriber, ProducerArbiter producerArbiter, SerialSubscription serialSubscription) {
            this.f78543c = subscriber;
            this.f78544d = producerArbiter;
            this.f78545e = serialSubscription;
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            if (this.f78541a) {
                return;
            }
            this.f78541a = true;
            this.f78543c.onCompleted();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            if (this.f78541a) {
                Exceptions.throwIfFatal(th2);
                RxJavaHooks.onError(th2);
                return;
            }
            this.f78541a = true;
            try {
                unsubscribe();
                C13607a c13607a = new C13607a();
                this.f78545e.set(c13607a);
                long j = this.f78542b;
                if (j != 0) {
                    this.f78544d.produced(j);
                }
                ((Observable) OperatorOnErrorResumeNextViaFunction.this.f78537a.call(th2)).unsafeSubscribe(c13607a);
            } catch (Throwable th3) {
                Exceptions.throwOrReport(th3, this.f78543c);
            }
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            if (this.f78541a) {
                return;
            }
            this.f78542b++;
            this.f78543c.onNext(obj);
        }

        @Override // p046rx.Subscriber, p046rx.observers.AssertableSubscriber
        public void setProducer(Producer producer) {
            this.f78544d.setProducer(producer);
        }
    }

    public OperatorOnErrorResumeNextViaFunction(Func1<? super Throwable, ? extends Observable<? extends T>> func1) {
        this.f78537a = func1;
    }

    public static <T> OperatorOnErrorResumeNextViaFunction<T> withException(Observable<? extends T> observable) {
        return new OperatorOnErrorResumeNextViaFunction<>(new C13605c(observable));
    }

    public static <T> OperatorOnErrorResumeNextViaFunction<T> withOther(Observable<? extends T> observable) {
        return new OperatorOnErrorResumeNextViaFunction<>(new C13604b(observable));
    }

    public static <T> OperatorOnErrorResumeNextViaFunction<T> withSingle(Func1<? super Throwable, ? extends T> func1) {
        return new OperatorOnErrorResumeNextViaFunction<>(new C13603a(func1));
    }

    @Override // p046rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        ProducerArbiter producerArbiter = new ProducerArbiter();
        SerialSubscription serialSubscription = new SerialSubscription();
        C13606d c13606d = new C13606d(subscriber, producerArbiter, serialSubscription);
        serialSubscription.set(c13606d);
        subscriber.add(serialSubscription);
        subscriber.setProducer(producerArbiter);
        return c13606d;
    }
}
