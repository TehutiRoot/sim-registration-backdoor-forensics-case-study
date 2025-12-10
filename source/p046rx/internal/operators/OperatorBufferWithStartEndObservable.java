package p046rx.internal.operators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import p046rx.Observable;
import p046rx.Subscriber;
import p046rx.exceptions.Exceptions;
import p046rx.functions.Func1;
import p046rx.observers.SerializedSubscriber;
import p046rx.subscriptions.CompositeSubscription;

/* renamed from: rx.internal.operators.OperatorBufferWithStartEndObservable */
/* loaded from: classes7.dex */
public final class OperatorBufferWithStartEndObservable<T, TOpening, TClosing> implements Observable.Operator<List<T>, T> {

    /* renamed from: a */
    public final Observable f78244a;

    /* renamed from: b */
    public final Func1 f78245b;

    /* renamed from: rx.internal.operators.OperatorBufferWithStartEndObservable$a */
    /* loaded from: classes7.dex */
    public class C13536a extends Subscriber {

        /* renamed from: a */
        public final /* synthetic */ C13537b f78246a;

        public C13536a(C13537b c13537b) {
            this.f78246a = c13537b;
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            this.f78246a.onCompleted();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.f78246a.onError(th2);
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            this.f78246a.m23077c(obj);
        }
    }

    /* renamed from: rx.internal.operators.OperatorBufferWithStartEndObservable$b */
    /* loaded from: classes7.dex */
    public final class C13537b extends Subscriber {

        /* renamed from: a */
        public final Subscriber f78248a;

        /* renamed from: b */
        public final List f78249b = new LinkedList();

        /* renamed from: c */
        public boolean f78250c;

        /* renamed from: d */
        public final CompositeSubscription f78251d;

        /* renamed from: rx.internal.operators.OperatorBufferWithStartEndObservable$b$a */
        /* loaded from: classes7.dex */
        public class C13538a extends Subscriber {

            /* renamed from: a */
            public final /* synthetic */ List f78253a;

            public C13538a(List list) {
                this.f78253a = list;
            }

            @Override // p046rx.Observer
            public void onCompleted() {
                C13537b.this.f78251d.remove(this);
                C13537b.this.m23078b(this.f78253a);
            }

            @Override // p046rx.Observer
            public void onError(Throwable th2) {
                C13537b.this.onError(th2);
            }

            @Override // p046rx.Observer
            public void onNext(Object obj) {
                C13537b.this.f78251d.remove(this);
                C13537b.this.m23078b(this.f78253a);
            }
        }

        public C13537b(Subscriber subscriber) {
            this.f78248a = subscriber;
            CompositeSubscription compositeSubscription = new CompositeSubscription();
            this.f78251d = compositeSubscription;
            add(compositeSubscription);
        }

        /* renamed from: b */
        public void m23078b(List list) {
            boolean z;
            synchronized (this) {
                try {
                    if (this.f78250c) {
                        return;
                    }
                    Iterator it = this.f78249b.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((List) it.next()) == list) {
                                it.remove();
                                z = true;
                                break;
                            }
                        } else {
                            z = false;
                            break;
                        }
                    }
                    if (z) {
                        this.f78248a.onNext(list);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* renamed from: c */
        public void m23077c(Object obj) {
            ArrayList arrayList = new ArrayList();
            synchronized (this) {
                try {
                    if (this.f78250c) {
                        return;
                    }
                    this.f78249b.add(arrayList);
                    try {
                        Observable observable = (Observable) OperatorBufferWithStartEndObservable.this.f78245b.call(obj);
                        C13538a c13538a = new C13538a(arrayList);
                        this.f78251d.add(c13538a);
                        observable.unsafeSubscribe(c13538a);
                    } catch (Throwable th2) {
                        Exceptions.throwOrReport(th2, this);
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            try {
                synchronized (this) {
                    if (this.f78250c) {
                        return;
                    }
                    this.f78250c = true;
                    LinkedList<List> linkedList = new LinkedList(this.f78249b);
                    this.f78249b.clear();
                    for (List list : linkedList) {
                        this.f78248a.onNext(list);
                    }
                    this.f78248a.onCompleted();
                    unsubscribe();
                }
            } catch (Throwable th2) {
                Exceptions.throwOrReport(th2, this.f78248a);
            }
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            synchronized (this) {
                try {
                    if (this.f78250c) {
                        return;
                    }
                    this.f78250c = true;
                    this.f78249b.clear();
                    this.f78248a.onError(th2);
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
                    for (List list : this.f78249b) {
                        list.add(obj);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public OperatorBufferWithStartEndObservable(Observable<? extends TOpening> observable, Func1<? super TOpening, ? extends Observable<? extends TClosing>> func1) {
        this.f78244a = observable;
        this.f78245b = func1;
    }

    @Override // p046rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public Subscriber<? super T> call(Subscriber<? super List<T>> subscriber) {
        C13537b c13537b = new C13537b(new SerializedSubscriber(subscriber));
        C13536a c13536a = new C13536a(c13537b);
        subscriber.add(c13536a);
        subscriber.add(c13537b);
        this.f78244a.unsafeSubscribe(c13536a);
        return c13537b;
    }
}
