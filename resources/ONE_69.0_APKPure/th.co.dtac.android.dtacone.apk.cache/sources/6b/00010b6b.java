package p046rx.internal.operators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p046rx.Observable;
import p046rx.Observer;
import p046rx.Subscriber;
import p046rx.functions.Func0;
import p046rx.observers.SerializedSubscriber;
import p046rx.subjects.UnicastSubject;
import p046rx.subscriptions.SerialSubscription;

/* renamed from: rx.internal.operators.OperatorWindowWithObservableFactory */
/* loaded from: classes7.dex */
public final class OperatorWindowWithObservableFactory<T, U> implements Observable.Operator<Observable<T>, T> {

    /* renamed from: b */
    public static final Object f79022b = new Object();

    /* renamed from: a */
    public final Func0 f79023a;

    /* renamed from: rx.internal.operators.OperatorWindowWithObservableFactory$a */
    /* loaded from: classes7.dex */
    public static final class C13683a extends Subscriber {

        /* renamed from: a */
        public final C13684b f79024a;

        /* renamed from: b */
        public boolean f79025b;

        public C13683a(C13684b c13684b) {
            this.f79024a = c13684b;
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            if (!this.f79025b) {
                this.f79025b = true;
                this.f79024a.onCompleted();
            }
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.f79024a.onError(th2);
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            if (!this.f79025b) {
                this.f79025b = true;
                this.f79024a.m23149g();
            }
        }

        @Override // p046rx.Subscriber, p046rx.observers.AssertableSubscriber
        public void onStart() {
            request(Long.MAX_VALUE);
        }
    }

    /* renamed from: rx.internal.operators.OperatorWindowWithObservableFactory$b */
    /* loaded from: classes7.dex */
    public static final class C13684b extends Subscriber {

        /* renamed from: a */
        public final Subscriber f79026a;

        /* renamed from: b */
        public final Object f79027b = new Object();

        /* renamed from: c */
        public Observer f79028c;

        /* renamed from: d */
        public Observable f79029d;

        /* renamed from: e */
        public boolean f79030e;

        /* renamed from: f */
        public List f79031f;

        /* renamed from: g */
        public final SerialSubscription f79032g;

        /* renamed from: h */
        public final Func0 f79033h;

        public C13684b(Subscriber subscriber, Func0 func0) {
            this.f79026a = new SerializedSubscriber(subscriber);
            SerialSubscription serialSubscription = new SerialSubscription();
            this.f79032g = serialSubscription;
            this.f79033h = func0;
            add(serialSubscription);
        }

        /* renamed from: b */
        public void m23154b() {
            UnicastSubject create = UnicastSubject.create();
            this.f79028c = create;
            this.f79029d = create;
            try {
                Observable observable = (Observable) this.f79033h.call();
                C13683a c13683a = new C13683a(this);
                this.f79032g.set(c13683a);
                observable.unsafeSubscribe(c13683a);
            } catch (Throwable th2) {
                this.f79026a.onError(th2);
                unsubscribe();
            }
        }

        /* renamed from: c */
        public void m23153c(List list) {
            if (list == null) {
                return;
            }
            for (Object obj : list) {
                if (obj == OperatorWindowWithObservableFactory.f79022b) {
                    m23150f();
                } else if (NotificationLite.isError(obj)) {
                    m23151e(NotificationLite.getError(obj));
                    return;
                } else if (NotificationLite.isCompleted(obj)) {
                    complete();
                    return;
                } else {
                    m23152d(obj);
                }
            }
        }

        public void complete() {
            Observer observer = this.f79028c;
            this.f79028c = null;
            this.f79029d = null;
            if (observer != null) {
                observer.onCompleted();
            }
            this.f79026a.onCompleted();
            unsubscribe();
        }

        /* renamed from: d */
        public void m23152d(Object obj) {
            Observer observer = this.f79028c;
            if (observer != null) {
                observer.onNext(obj);
            }
        }

        /* renamed from: e */
        public void m23151e(Throwable th2) {
            Observer observer = this.f79028c;
            this.f79028c = null;
            this.f79029d = null;
            if (observer != null) {
                observer.onError(th2);
            }
            this.f79026a.onError(th2);
            unsubscribe();
        }

        /* renamed from: f */
        public void m23150f() {
            Observer observer = this.f79028c;
            if (observer != null) {
                observer.onCompleted();
            }
            m23154b();
            this.f79026a.onNext(this.f79029d);
        }

        /* renamed from: g */
        public void m23149g() {
            synchronized (this.f79027b) {
                try {
                    if (this.f79030e) {
                        if (this.f79031f == null) {
                            this.f79031f = new ArrayList();
                        }
                        this.f79031f.add(OperatorWindowWithObservableFactory.f79022b);
                        return;
                    }
                    List list = this.f79031f;
                    this.f79031f = null;
                    boolean z = true;
                    this.f79030e = true;
                    boolean z2 = true;
                    while (true) {
                        try {
                            m23153c(list);
                            if (z2) {
                                m23150f();
                                z2 = false;
                            }
                            try {
                                synchronized (this.f79027b) {
                                    try {
                                        List list2 = this.f79031f;
                                        this.f79031f = null;
                                        if (list2 == null) {
                                            this.f79030e = false;
                                            return;
                                        } else if (this.f79026a.isUnsubscribed()) {
                                            synchronized (this.f79027b) {
                                                this.f79030e = false;
                                            }
                                            return;
                                        } else {
                                            list = list2;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        z = false;
                                        try {
                                            throw th;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            if (!z) {
                                                synchronized (this.f79027b) {
                                                    this.f79030e = false;
                                                }
                                            }
                                            throw th;
                                        }
                                    }
                                }
                            } catch (Throwable th4) {
                                th = th4;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            z = false;
                        }
                    }
                } finally {
                }
            }
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            synchronized (this.f79027b) {
                try {
                    if (this.f79030e) {
                        if (this.f79031f == null) {
                            this.f79031f = new ArrayList();
                        }
                        this.f79031f.add(NotificationLite.completed());
                        return;
                    }
                    List list = this.f79031f;
                    this.f79031f = null;
                    this.f79030e = true;
                    try {
                        m23153c(list);
                        complete();
                    } catch (Throwable th2) {
                        m23151e(th2);
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            synchronized (this.f79027b) {
                try {
                    if (this.f79030e) {
                        this.f79031f = Collections.singletonList(NotificationLite.error(th2));
                        return;
                    }
                    this.f79031f = null;
                    this.f79030e = true;
                    m23151e(th2);
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            synchronized (this.f79027b) {
                try {
                    if (this.f79030e) {
                        if (this.f79031f == null) {
                            this.f79031f = new ArrayList();
                        }
                        this.f79031f.add(obj);
                        return;
                    }
                    List list = this.f79031f;
                    this.f79031f = null;
                    boolean z = true;
                    this.f79030e = true;
                    boolean z2 = true;
                    while (true) {
                        try {
                            m23153c(list);
                            if (z2) {
                                m23152d(obj);
                                z2 = false;
                            }
                            try {
                                synchronized (this.f79027b) {
                                    try {
                                        List list2 = this.f79031f;
                                        this.f79031f = null;
                                        if (list2 == null) {
                                            this.f79030e = false;
                                            return;
                                        } else if (this.f79026a.isUnsubscribed()) {
                                            synchronized (this.f79027b) {
                                                this.f79030e = false;
                                            }
                                            return;
                                        } else {
                                            list = list2;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        z = false;
                                        try {
                                            throw th;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            if (!z) {
                                                synchronized (this.f79027b) {
                                                    this.f79030e = false;
                                                }
                                            }
                                            throw th;
                                        }
                                    }
                                }
                            } catch (Throwable th4) {
                                th = th4;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            z = false;
                        }
                    }
                } finally {
                }
            }
        }

        @Override // p046rx.Subscriber, p046rx.observers.AssertableSubscriber
        public void onStart() {
            request(Long.MAX_VALUE);
        }
    }

    public OperatorWindowWithObservableFactory(Func0<? extends Observable<? extends U>> func0) {
        this.f79023a = func0;
    }

    @Override // p046rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public Subscriber<? super T> call(Subscriber<? super Observable<T>> subscriber) {
        C13684b c13684b = new C13684b(subscriber, this.f79023a);
        subscriber.add(c13684b);
        c13684b.m23149g();
        return c13684b;
    }
}