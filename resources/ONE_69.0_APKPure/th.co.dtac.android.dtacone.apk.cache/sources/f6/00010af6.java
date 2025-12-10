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
    public final Func1 f78743a;

    /* renamed from: rx.internal.operators.OperatorOnErrorResumeNextViaFunction$a */
    /* loaded from: classes7.dex */
    public static class C13604a implements Func1 {

        /* renamed from: a */
        public final /* synthetic */ Func1 f78744a;

        public C13604a(Func1 func1) {
            this.f78744a = func1;
        }

        @Override // p046rx.functions.Func1
        /* renamed from: a */
        public Observable call(Throwable th2) {
            return Observable.just(this.f78744a.call(th2));
        }
    }

    /* renamed from: rx.internal.operators.OperatorOnErrorResumeNextViaFunction$b */
    /* loaded from: classes7.dex */
    public static class C13605b implements Func1 {

        /* renamed from: a */
        public final /* synthetic */ Observable f78745a;

        public C13605b(Observable observable) {
            this.f78745a = observable;
        }

        @Override // p046rx.functions.Func1
        /* renamed from: a */
        public Observable call(Throwable th2) {
            return this.f78745a;
        }
    }

    /* renamed from: rx.internal.operators.OperatorOnErrorResumeNextViaFunction$c */
    /* loaded from: classes7.dex */
    public static class C13606c implements Func1 {

        /* renamed from: a */
        public final /* synthetic */ Observable f78746a;

        public C13606c(Observable observable) {
            this.f78746a = observable;
        }

        @Override // p046rx.functions.Func1
        /* renamed from: a */
        public Observable call(Throwable th2) {
            if (th2 instanceof Exception) {
                return this.f78746a;
            }
            return Observable.error(th2);
        }
    }

    /* renamed from: rx.internal.operators.OperatorOnErrorResumeNextViaFunction$d */
    /* loaded from: classes7.dex */
    public class C13607d extends Subscriber {

        /* renamed from: a */
        public boolean f78747a;

        /* renamed from: b */
        public long f78748b;

        /* renamed from: c */
        public final /* synthetic */ Subscriber f78749c;

        /* renamed from: d */
        public final /* synthetic */ ProducerArbiter f78750d;

        /* renamed from: e */
        public final /* synthetic */ SerialSubscription f78751e;

        /* renamed from: rx.internal.operators.OperatorOnErrorResumeNextViaFunction$d$a */
        /* loaded from: classes7.dex */
        public class C13608a extends Subscriber {
            public C13608a() {
            }

            @Override // p046rx.Observer
            public void onCompleted() {
                C13607d.this.f78749c.onCompleted();
            }

            @Override // p046rx.Observer
            public void onError(Throwable th2) {
                C13607d.this.f78749c.onError(th2);
            }

            @Override // p046rx.Observer
            public void onNext(Object obj) {
                C13607d.this.f78749c.onNext(obj);
            }

            @Override // p046rx.Subscriber, p046rx.observers.AssertableSubscriber
            public void setProducer(Producer producer) {
                C13607d.this.f78750d.setProducer(producer);
            }
        }

        public C13607d(Subscriber subscriber, ProducerArbiter producerArbiter, SerialSubscription serialSubscription) {
            this.f78749c = subscriber;
            this.f78750d = producerArbiter;
            this.f78751e = serialSubscription;
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            if (this.f78747a) {
                return;
            }
            this.f78747a = true;
            this.f78749c.onCompleted();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            if (this.f78747a) {
                Exceptions.throwIfFatal(th2);
                RxJavaHooks.onError(th2);
                return;
            }
            this.f78747a = true;
            try {
                unsubscribe();
                C13608a c13608a = new C13608a();
                this.f78751e.set(c13608a);
                long j = this.f78748b;
                if (j != 0) {
                    this.f78750d.produced(j);
                }
                ((Observable) OperatorOnErrorResumeNextViaFunction.this.f78743a.call(th2)).unsafeSubscribe(c13608a);
            } catch (Throwable th3) {
                Exceptions.throwOrReport(th3, this.f78749c);
            }
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            if (this.f78747a) {
                return;
            }
            this.f78748b++;
            this.f78749c.onNext(obj);
        }

        @Override // p046rx.Subscriber, p046rx.observers.AssertableSubscriber
        public void setProducer(Producer producer) {
            this.f78750d.setProducer(producer);
        }
    }

    public OperatorOnErrorResumeNextViaFunction(Func1<? super Throwable, ? extends Observable<? extends T>> func1) {
        this.f78743a = func1;
    }

    public static <T> OperatorOnErrorResumeNextViaFunction<T> withException(Observable<? extends T> observable) {
        return new OperatorOnErrorResumeNextViaFunction<>(new C13606c(observable));
    }

    public static <T> OperatorOnErrorResumeNextViaFunction<T> withOther(Observable<? extends T> observable) {
        return new OperatorOnErrorResumeNextViaFunction<>(new C13605b(observable));
    }

    public static <T> OperatorOnErrorResumeNextViaFunction<T> withSingle(Func1<? super Throwable, ? extends T> func1) {
        return new OperatorOnErrorResumeNextViaFunction<>(new C13604a(func1));
    }

    @Override // p046rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        ProducerArbiter producerArbiter = new ProducerArbiter();
        SerialSubscription serialSubscription = new SerialSubscription();
        C13607d c13607d = new C13607d(subscriber, producerArbiter, serialSubscription);
        serialSubscription.set(c13607d);
        subscriber.add(serialSubscription);
        subscriber.setProducer(producerArbiter);
        return c13607d;
    }
}