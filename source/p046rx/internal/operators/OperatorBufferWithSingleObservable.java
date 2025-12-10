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
    public final Func0 f78216a;

    /* renamed from: b */
    public final int f78217b;

    /* renamed from: rx.internal.operators.OperatorBufferWithSingleObservable$a */
    /* loaded from: classes7.dex */
    public class C13531a implements Func0 {

        /* renamed from: a */
        public final /* synthetic */ Observable f78218a;

        public C13531a(Observable observable) {
            this.f78218a = observable;
        }

        @Override // p046rx.functions.Func0, java.util.concurrent.Callable
        /* renamed from: a */
        public Observable call() {
            return this.f78218a;
        }
    }

    /* renamed from: rx.internal.operators.OperatorBufferWithSingleObservable$b */
    /* loaded from: classes7.dex */
    public class C13532b extends Subscriber {

        /* renamed from: a */
        public final /* synthetic */ C13533c f78220a;

        public C13532b(C13533c c13533c) {
            this.f78220a = c13533c;
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            this.f78220a.onCompleted();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.f78220a.onError(th2);
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            this.f78220a.m23087b();
        }
    }

    /* renamed from: rx.internal.operators.OperatorBufferWithSingleObservable$c */
    /* loaded from: classes7.dex */
    public final class C13533c extends Subscriber {

        /* renamed from: a */
        public final Subscriber f78222a;

        /* renamed from: b */
        public List f78223b;

        /* renamed from: c */
        public boolean f78224c;

        public C13533c(Subscriber subscriber) {
            this.f78222a = subscriber;
            this.f78223b = new ArrayList(OperatorBufferWithSingleObservable.this.f78217b);
        }

        /* renamed from: b */
        public void m23087b() {
            synchronized (this) {
                try {
                    if (this.f78224c) {
                        return;
                    }
                    List list = this.f78223b;
                    this.f78223b = new ArrayList(OperatorBufferWithSingleObservable.this.f78217b);
                    try {
                        this.f78222a.onNext(list);
                    } catch (Throwable th2) {
                        unsubscribe();
                        synchronized (this) {
                            try {
                                if (this.f78224c) {
                                    return;
                                }
                                this.f78224c = true;
                                Exceptions.throwOrReport(th2, this.f78222a);
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
                    if (this.f78224c) {
                        return;
                    }
                    this.f78224c = true;
                    List list = this.f78223b;
                    this.f78223b = null;
                    this.f78222a.onNext(list);
                    this.f78222a.onCompleted();
                    unsubscribe();
                }
            } catch (Throwable th2) {
                Exceptions.throwOrReport(th2, this.f78222a);
            }
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            synchronized (this) {
                try {
                    if (this.f78224c) {
                        return;
                    }
                    this.f78224c = true;
                    this.f78223b = null;
                    this.f78222a.onError(th2);
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
                    if (this.f78224c) {
                        return;
                    }
                    this.f78223b.add(obj);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public OperatorBufferWithSingleObservable(Func0<? extends Observable<? extends TClosing>> func0, int i) {
        this.f78216a = func0;
        this.f78217b = i;
    }

    @Override // p046rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public Subscriber<? super T> call(Subscriber<? super List<T>> subscriber) {
        try {
            Observable observable = (Observable) this.f78216a.call();
            C13533c c13533c = new C13533c(new SerializedSubscriber(subscriber));
            C13532b c13532b = new C13532b(c13533c);
            subscriber.add(c13532b);
            subscriber.add(c13533c);
            observable.unsafeSubscribe(c13532b);
            return c13533c;
        } catch (Throwable th2) {
            Exceptions.throwOrReport(th2, subscriber);
            return Subscribers.empty();
        }
    }

    public OperatorBufferWithSingleObservable(Observable<? extends TClosing> observable, int i) {
        this.f78216a = new C13531a(observable);
        this.f78217b = i;
    }
}
