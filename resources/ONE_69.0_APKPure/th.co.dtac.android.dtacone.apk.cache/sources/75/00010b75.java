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
    public final Observable f79063a;

    /* renamed from: b */
    public final Func1 f79064b;

    /* renamed from: rx.internal.operators.OperatorWindowWithStartEndObservable$a */
    /* loaded from: classes7.dex */
    public class C13687a extends Subscriber {

        /* renamed from: a */
        public final /* synthetic */ C13689c f79065a;

        public C13687a(C13689c c13689c) {
            this.f79065a = c13689c;
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            this.f79065a.onCompleted();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.f79065a.onError(th2);
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            this.f79065a.m23138b(obj);
        }

        @Override // p046rx.Subscriber, p046rx.observers.AssertableSubscriber
        public void onStart() {
            request(Long.MAX_VALUE);
        }
    }

    /* renamed from: rx.internal.operators.OperatorWindowWithStartEndObservable$b */
    /* loaded from: classes7.dex */
    public static final class C13688b {

        /* renamed from: a */
        public final Observer f79067a;

        /* renamed from: b */
        public final Observable f79068b;

        public C13688b(Observer observer, Observable observable) {
            this.f79067a = new SerializedObserver(observer);
            this.f79068b = observable;
        }
    }

    /* renamed from: rx.internal.operators.OperatorWindowWithStartEndObservable$c */
    /* loaded from: classes7.dex */
    public final class C13689c extends Subscriber {

        /* renamed from: a */
        public final Subscriber f79069a;

        /* renamed from: b */
        public final CompositeSubscription f79070b;

        /* renamed from: c */
        public final Object f79071c = new Object();

        /* renamed from: d */
        public final List f79072d = new LinkedList();

        /* renamed from: e */
        public boolean f79073e;

        /* renamed from: rx.internal.operators.OperatorWindowWithStartEndObservable$c$a */
        /* loaded from: classes7.dex */
        public class C13690a extends Subscriber {

            /* renamed from: a */
            public boolean f79075a = true;

            /* renamed from: b */
            public final /* synthetic */ C13688b f79076b;

            public C13690a(C13688b c13688b) {
                this.f79076b = c13688b;
            }

            @Override // p046rx.Observer
            public void onCompleted() {
                if (this.f79075a) {
                    this.f79075a = false;
                    C13689c.this.m23136d(this.f79076b);
                    C13689c.this.f79070b.remove(this);
                }
            }

            @Override // p046rx.Observer
            public void onError(Throwable th2) {
                C13689c.this.onError(th2);
            }

            @Override // p046rx.Observer
            public void onNext(Object obj) {
                onCompleted();
            }
        }

        public C13689c(Subscriber subscriber, CompositeSubscription compositeSubscription) {
            this.f79069a = new SerializedSubscriber(subscriber);
            this.f79070b = compositeSubscription;
        }

        /* renamed from: b */
        public void m23138b(Object obj) {
            C13688b m23137c = m23137c();
            synchronized (this.f79071c) {
                try {
                    if (this.f79073e) {
                        return;
                    }
                    this.f79072d.add(m23137c);
                    this.f79069a.onNext(m23137c.f79068b);
                    try {
                        Observable observable = (Observable) OperatorWindowWithStartEndObservable.this.f79064b.call(obj);
                        C13690a c13690a = new C13690a(m23137c);
                        this.f79070b.add(c13690a);
                        observable.unsafeSubscribe(c13690a);
                    } catch (Throwable th2) {
                        onError(th2);
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        /* renamed from: c */
        public C13688b m23137c() {
            UnicastSubject create = UnicastSubject.create();
            return new C13688b(create, create);
        }

        /* renamed from: d */
        public void m23136d(C13688b c13688b) {
            boolean z;
            synchronized (this.f79071c) {
                try {
                    if (this.f79073e) {
                        return;
                    }
                    Iterator it = this.f79072d.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((C13688b) it.next()) == c13688b) {
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
                        c13688b.f79067a.onCompleted();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            try {
                synchronized (this.f79071c) {
                    if (this.f79073e) {
                        this.f79070b.unsubscribe();
                        return;
                    }
                    this.f79073e = true;
                    ArrayList<C13688b> arrayList = new ArrayList(this.f79072d);
                    this.f79072d.clear();
                    for (C13688b c13688b : arrayList) {
                        c13688b.f79067a.onCompleted();
                    }
                    this.f79069a.onCompleted();
                    this.f79070b.unsubscribe();
                }
            } catch (Throwable th2) {
                this.f79070b.unsubscribe();
                throw th2;
            }
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            try {
                synchronized (this.f79071c) {
                    if (this.f79073e) {
                        this.f79070b.unsubscribe();
                        return;
                    }
                    this.f79073e = true;
                    ArrayList<C13688b> arrayList = new ArrayList(this.f79072d);
                    this.f79072d.clear();
                    for (C13688b c13688b : arrayList) {
                        c13688b.f79067a.onError(th2);
                    }
                    this.f79069a.onError(th2);
                    this.f79070b.unsubscribe();
                }
            } catch (Throwable th3) {
                this.f79070b.unsubscribe();
                throw th3;
            }
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            synchronized (this.f79071c) {
                try {
                    if (this.f79073e) {
                        return;
                    }
                    for (C13688b c13688b : new ArrayList(this.f79072d)) {
                        c13688b.f79067a.onNext(obj);
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
        this.f79063a = observable;
        this.f79064b = func1;
    }

    @Override // p046rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public Subscriber<? super T> call(Subscriber<? super Observable<T>> subscriber) {
        CompositeSubscription compositeSubscription = new CompositeSubscription();
        subscriber.add(compositeSubscription);
        C13689c c13689c = new C13689c(subscriber, compositeSubscription);
        C13687a c13687a = new C13687a(c13689c);
        compositeSubscription.add(c13689c);
        compositeSubscription.add(c13687a);
        this.f79063a.unsafeSubscribe(c13687a);
        return c13689c;
    }
}