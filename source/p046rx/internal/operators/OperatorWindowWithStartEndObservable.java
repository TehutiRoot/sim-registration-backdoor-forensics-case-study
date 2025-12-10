package p046rx.internal.operators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import p046rx.Observable;
import p046rx.Observer;
import p046rx.Subscriber;
import p046rx.functions.Func1;
import p046rx.observers.SerializedObserver;
import p046rx.observers.SerializedSubscriber;
import p046rx.subjects.UnicastSubject;
import p046rx.subscriptions.CompositeSubscription;

/* renamed from: rx.internal.operators.OperatorWindowWithStartEndObservable */
/* loaded from: classes7.dex */
public final class OperatorWindowWithStartEndObservable<T, U, V> implements Observable.Operator<Observable<T>, T> {

    /* renamed from: a */
    public final Observable f78857a;

    /* renamed from: b */
    public final Func1 f78858b;

    /* renamed from: rx.internal.operators.OperatorWindowWithStartEndObservable$a */
    /* loaded from: classes7.dex */
    public class C13686a extends Subscriber {

        /* renamed from: a */
        public final /* synthetic */ C13688c f78859a;

        public C13686a(C13688c c13688c) {
            this.f78859a = c13688c;
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            this.f78859a.onCompleted();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.f78859a.onError(th2);
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            this.f78859a.m22950b(obj);
        }

        @Override // p046rx.Subscriber, p046rx.observers.AssertableSubscriber
        public void onStart() {
            request(Long.MAX_VALUE);
        }
    }

    /* renamed from: rx.internal.operators.OperatorWindowWithStartEndObservable$b */
    /* loaded from: classes7.dex */
    public static final class C13687b {

        /* renamed from: a */
        public final Observer f78861a;

        /* renamed from: b */
        public final Observable f78862b;

        public C13687b(Observer observer, Observable observable) {
            this.f78861a = new SerializedObserver(observer);
            this.f78862b = observable;
        }
    }

    /* renamed from: rx.internal.operators.OperatorWindowWithStartEndObservable$c */
    /* loaded from: classes7.dex */
    public final class C13688c extends Subscriber {

        /* renamed from: a */
        public final Subscriber f78863a;

        /* renamed from: b */
        public final CompositeSubscription f78864b;

        /* renamed from: c */
        public final Object f78865c = new Object();

        /* renamed from: d */
        public final List f78866d = new LinkedList();

        /* renamed from: e */
        public boolean f78867e;

        /* renamed from: rx.internal.operators.OperatorWindowWithStartEndObservable$c$a */
        /* loaded from: classes7.dex */
        public class C13689a extends Subscriber {

            /* renamed from: a */
            public boolean f78869a = true;

            /* renamed from: b */
            public final /* synthetic */ C13687b f78870b;

            public C13689a(C13687b c13687b) {
                this.f78870b = c13687b;
            }

            @Override // p046rx.Observer
            public void onCompleted() {
                if (this.f78869a) {
                    this.f78869a = false;
                    C13688c.this.m22948d(this.f78870b);
                    C13688c.this.f78864b.remove(this);
                }
            }

            @Override // p046rx.Observer
            public void onError(Throwable th2) {
                C13688c.this.onError(th2);
            }

            @Override // p046rx.Observer
            public void onNext(Object obj) {
                onCompleted();
            }
        }

        public C13688c(Subscriber subscriber, CompositeSubscription compositeSubscription) {
            this.f78863a = new SerializedSubscriber(subscriber);
            this.f78864b = compositeSubscription;
        }

        /* renamed from: b */
        public void m22950b(Object obj) {
            C13687b m22949c = m22949c();
            synchronized (this.f78865c) {
                try {
                    if (this.f78867e) {
                        return;
                    }
                    this.f78866d.add(m22949c);
                    this.f78863a.onNext(m22949c.f78862b);
                    try {
                        Observable observable = (Observable) OperatorWindowWithStartEndObservable.this.f78858b.call(obj);
                        C13689a c13689a = new C13689a(m22949c);
                        this.f78864b.add(c13689a);
                        observable.unsafeSubscribe(c13689a);
                    } catch (Throwable th2) {
                        onError(th2);
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        /* renamed from: c */
        public C13687b m22949c() {
            UnicastSubject create = UnicastSubject.create();
            return new C13687b(create, create);
        }

        /* renamed from: d */
        public void m22948d(C13687b c13687b) {
            boolean z;
            synchronized (this.f78865c) {
                try {
                    if (this.f78867e) {
                        return;
                    }
                    Iterator it = this.f78866d.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((C13687b) it.next()) == c13687b) {
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
                        c13687b.f78861a.onCompleted();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            try {
                synchronized (this.f78865c) {
                    if (this.f78867e) {
                        this.f78864b.unsubscribe();
                        return;
                    }
                    this.f78867e = true;
                    ArrayList<C13687b> arrayList = new ArrayList(this.f78866d);
                    this.f78866d.clear();
                    for (C13687b c13687b : arrayList) {
                        c13687b.f78861a.onCompleted();
                    }
                    this.f78863a.onCompleted();
                    this.f78864b.unsubscribe();
                }
            } catch (Throwable th2) {
                this.f78864b.unsubscribe();
                throw th2;
            }
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            try {
                synchronized (this.f78865c) {
                    if (this.f78867e) {
                        this.f78864b.unsubscribe();
                        return;
                    }
                    this.f78867e = true;
                    ArrayList<C13687b> arrayList = new ArrayList(this.f78866d);
                    this.f78866d.clear();
                    for (C13687b c13687b : arrayList) {
                        c13687b.f78861a.onError(th2);
                    }
                    this.f78863a.onError(th2);
                    this.f78864b.unsubscribe();
                }
            } catch (Throwable th3) {
                this.f78864b.unsubscribe();
                throw th3;
            }
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            synchronized (this.f78865c) {
                try {
                    if (this.f78867e) {
                        return;
                    }
                    for (C13687b c13687b : new ArrayList(this.f78866d)) {
                        c13687b.f78861a.onNext(obj);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // p046rx.Subscriber, p046rx.observers.AssertableSubscriber
        public void onStart() {
            request(Long.MAX_VALUE);
        }
    }

    public OperatorWindowWithStartEndObservable(Observable<? extends U> observable, Func1<? super U, ? extends Observable<? extends V>> func1) {
        this.f78857a = observable;
        this.f78858b = func1;
    }

    @Override // p046rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public Subscriber<? super T> call(Subscriber<? super Observable<T>> subscriber) {
        CompositeSubscription compositeSubscription = new CompositeSubscription();
        subscriber.add(compositeSubscription);
        C13688c c13688c = new C13688c(subscriber, compositeSubscription);
        C13686a c13686a = new C13686a(c13688c);
        compositeSubscription.add(c13688c);
        compositeSubscription.add(c13686a);
        this.f78857a.unsafeSubscribe(c13686a);
        return c13688c;
    }
}
