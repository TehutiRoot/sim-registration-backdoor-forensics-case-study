package p046rx.internal.operators;

import java.util.ArrayList;
import java.util.List;
import p046rx.Observable;
import p046rx.Subscriber;
import p046rx.exceptions.Exceptions;
import p046rx.functions.Func0;
import p046rx.observers.SerializedSubscriber;
import p046rx.observers.Subscribers;

/* renamed from: rx.internal.operators.OperatorBufferWithSingleObservable */
/* loaded from: classes7.dex */
public final class OperatorBufferWithSingleObservable<T, TClosing> implements Observable.Operator<List<T>, T> {

    /* renamed from: a */
    public final Func0 f78422a;

    /* renamed from: b */
    public final int f78423b;

    /* renamed from: rx.internal.operators.OperatorBufferWithSingleObservable$a */
    /* loaded from: classes7.dex */
    public class C13532a implements Func0 {

        /* renamed from: a */
        public final /* synthetic */ Observable f78424a;

        public C13532a(Observable observable) {
            this.f78424a = observable;
        }

        @Override // p046rx.functions.Func0, java.util.concurrent.Callable
        /* renamed from: a */
        public Observable call() {
            return this.f78424a;
        }
    }

    /* renamed from: rx.internal.operators.OperatorBufferWithSingleObservable$b */
    /* loaded from: classes7.dex */
    public class C13533b extends Subscriber {

        /* renamed from: a */
        public final /* synthetic */ C13534c f78426a;

        public C13533b(C13534c c13534c) {
            this.f78426a = c13534c;
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            this.f78426a.onCompleted();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.f78426a.onError(th2);
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            this.f78426a.m23275b();
        }
    }

    /* renamed from: rx.internal.operators.OperatorBufferWithSingleObservable$c */
    /* loaded from: classes7.dex */
    public final class C13534c extends Subscriber {

        /* renamed from: a */
        public final Subscriber f78428a;

        /* renamed from: b */
        public List f78429b;

        /* renamed from: c */
        public boolean f78430c;

        public C13534c(Subscriber subscriber) {
            this.f78428a = subscriber;
            this.f78429b = new ArrayList(OperatorBufferWithSingleObservable.this.f78423b);
        }

        /* renamed from: b */
        public void m23275b() {
            synchronized (this) {
                try {
                    if (this.f78430c) {
                        return;
                    }
                    List list = this.f78429b;
                    this.f78429b = new ArrayList(OperatorBufferWithSingleObservable.this.f78423b);
                    try {
                        this.f78428a.onNext(list);
                    } catch (Throwable th2) {
                        unsubscribe();
                        synchronized (this) {
                            try {
                                if (this.f78430c) {
                                    return;
                                }
                                this.f78430c = true;
                                Exceptions.throwOrReport(th2, this.f78428a);
                            } finally {
                            }
                        }
                    }
                } finally {
                }
            }
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            try {
                synchronized (this) {
                    if (this.f78430c) {
                        return;
                    }
                    this.f78430c = true;
                    List list = this.f78429b;
                    this.f78429b = null;
                    this.f78428a.onNext(list);
                    this.f78428a.onCompleted();
                    unsubscribe();
                }
            } catch (Throwable th2) {
                Exceptions.throwOrReport(th2, this.f78428a);
            }
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            synchronized (this) {
                try {
                    if (this.f78430c) {
                        return;
                    }
                    this.f78430c = true;
                    this.f78429b = null;
                    this.f78428a.onError(th2);
                    unsubscribe();
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            synchronized (this) {
                try {
                    if (this.f78430c) {
                        return;
                    }
                    this.f78429b.add(obj);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public OperatorBufferWithSingleObservable(Func0<? extends Observable<? extends TClosing>> func0, int i) {
        this.f78422a = func0;
        this.f78423b = i;
    }

    @Override // p046rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public Subscriber<? super T> call(Subscriber<? super List<T>> subscriber) {
        try {
            Observable observable = (Observable) this.f78422a.call();
            C13534c c13534c = new C13534c(new SerializedSubscriber(subscriber));
            C13533b c13533b = new C13533b(c13534c);
            subscriber.add(c13533b);
            subscriber.add(c13534c);
            observable.unsafeSubscribe(c13533b);
            return c13534c;
        } catch (Throwable th2) {
            Exceptions.throwOrReport(th2, subscriber);
            return Subscribers.empty();
        }
    }

    public OperatorBufferWithSingleObservable(Observable<? extends TClosing> observable, int i) {
        this.f78422a = new C13532a(observable);
        this.f78423b = i;
    }
}