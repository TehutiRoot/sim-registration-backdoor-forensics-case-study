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
    public final Observable f78450a;

    /* renamed from: b */
    public final Func1 f78451b;

    /* renamed from: rx.internal.operators.OperatorBufferWithStartEndObservable$a */
    /* loaded from: classes7.dex */
    public class C13537a extends Subscriber {

        /* renamed from: a */
        public final /* synthetic */ C13538b f78452a;

        public C13537a(C13538b c13538b) {
            this.f78452a = c13538b;
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            this.f78452a.onCompleted();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.f78452a.onError(th2);
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            this.f78452a.m23265c(obj);
        }
    }

    /* renamed from: rx.internal.operators.OperatorBufferWithStartEndObservable$b */
    /* loaded from: classes7.dex */
    public final class C13538b extends Subscriber {

        /* renamed from: a */
        public final Subscriber f78454a;

        /* renamed from: b */
        public final List f78455b = new LinkedList();

        /* renamed from: c */
        public boolean f78456c;

        /* renamed from: d */
        public final CompositeSubscription f78457d;

        /* renamed from: rx.internal.operators.OperatorBufferWithStartEndObservable$b$a */
        /* loaded from: classes7.dex */
        public class C13539a extends Subscriber {

            /* renamed from: a */
            public final /* synthetic */ List f78459a;

            public C13539a(List list) {
                this.f78459a = list;
            }

            @Override // p046rx.Observer
            public void onCompleted() {
                C13538b.this.f78457d.remove(this);
                C13538b.this.m23266b(this.f78459a);
            }

            @Override // p046rx.Observer
            public void onError(Throwable th2) {
                C13538b.this.onError(th2);
            }

            @Override // p046rx.Observer
            public void onNext(Object obj) {
                C13538b.this.f78457d.remove(this);
                C13538b.this.m23266b(this.f78459a);
            }
        }

        public C13538b(Subscriber subscriber) {
            this.f78454a = subscriber;
            CompositeSubscription compositeSubscription = new CompositeSubscription();
            this.f78457d = compositeSubscription;
            add(compositeSubscription);
        }

        /* renamed from: b */
        public void m23266b(List list) {
            boolean z;
            synchronized (this) {
                try {
                    if (this.f78456c) {
                        return;
                    }
                    Iterator it = this.f78455b.iterator();
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
                        this.f78454a.onNext(list);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* renamed from: c */
        public void m23265c(Object obj) {
            ArrayList arrayList = new ArrayList();
            synchronized (this) {
                try {
                    if (this.f78456c) {
                        return;
                    }
                    this.f78455b.add(arrayList);
                    try {
                        Observable observable = (Observable) OperatorBufferWithStartEndObservable.this.f78451b.call(obj);
                        C13539a c13539a = new C13539a(arrayList);
                        this.f78457d.add(c13539a);
                        observable.unsafeSubscribe(c13539a);
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
                    if (this.f78456c) {
                        return;
                    }
                    this.f78456c = true;
                    LinkedList<List> linkedList = new LinkedList(this.f78455b);
                    this.f78455b.clear();
                    for (List list : linkedList) {
                        this.f78454a.onNext(list);
                    }
                    this.f78454a.onCompleted();
                    unsubscribe();
                }
            } catch (Throwable th2) {
                Exceptions.throwOrReport(th2, this.f78454a);
            }
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            synchronized (this) {
                try {
                    if (this.f78456c) {
                        return;
                    }
                    this.f78456c = true;
                    this.f78455b.clear();
                    this.f78454a.onError(th2);
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
                    for (List list : this.f78455b) {
                        list.add(obj);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public OperatorBufferWithStartEndObservable(Observable<? extends TOpening> observable, Func1<? super TOpening, ? extends Observable<? extends TClosing>> func1) {
        this.f78450a = observable;
        this.f78451b = func1;
    }

    @Override // p046rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public Subscriber<? super T> call(Subscriber<? super List<T>> subscriber) {
        C13538b c13538b = new C13538b(new SerializedSubscriber(subscriber));
        C13537a c13537a = new C13537a(c13538b);
        subscriber.add(c13537a);
        subscriber.add(c13538b);
        this.f78450a.unsafeSubscribe(c13537a);
        return c13538b;
    }
}