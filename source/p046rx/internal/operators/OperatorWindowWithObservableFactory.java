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
    public static final Object f78816b = new Object();

    /* renamed from: a */
    public final Func0 f78817a;

    /* renamed from: rx.internal.operators.OperatorWindowWithObservableFactory$a */
    /* loaded from: classes7.dex */
    public static final class C13682a extends Subscriber {

        /* renamed from: a */
        public final C13683b f78818a;

        /* renamed from: b */
        public boolean f78819b;

        public C13682a(C13683b c13683b) {
            this.f78818a = c13683b;
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            if (!this.f78819b) {
                this.f78819b = true;
                this.f78818a.onCompleted();
            }
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.f78818a.onError(th2);
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            if (!this.f78819b) {
                this.f78819b = true;
                this.f78818a.m22961g();
            }
        }

        @Override // p046rx.Subscriber, p046rx.observers.AssertableSubscriber
        public void onStart() {
            request(Long.MAX_VALUE);
        }
    }

    /* renamed from: rx.internal.operators.OperatorWindowWithObservableFactory$b */
    /* loaded from: classes7.dex */
    public static final class C13683b extends Subscriber {

        /* renamed from: a */
        public final Subscriber f78820a;

        /* renamed from: b */
        public final Object f78821b = new Object();

        /* renamed from: c */
        public Observer f78822c;

        /* renamed from: d */
        public Observable f78823d;

        /* renamed from: e */
        public boolean f78824e;

        /* renamed from: f */
        public List f78825f;

        /* renamed from: g */
        public final SerialSubscription f78826g;

        /* renamed from: h */
        public final Func0 f78827h;

        public C13683b(Subscriber subscriber, Func0 func0) {
            this.f78820a = new SerializedSubscriber(subscriber);
            SerialSubscription serialSubscription = new SerialSubscription();
            this.f78826g = serialSubscription;
            this.f78827h = func0;
            add(serialSubscription);
        }

        /* renamed from: b */
        public void m22966b() {
            UnicastSubject create = UnicastSubject.create();
            this.f78822c = create;
            this.f78823d = create;
            try {
                Observable observable = (Observable) this.f78827h.call();
                C13682a c13682a = new C13682a(this);
                this.f78826g.set(c13682a);
                observable.unsafeSubscribe(c13682a);
            } catch (Throwable th2) {
                this.f78820a.onError(th2);
                unsubscribe();
            }
        }

        /* renamed from: c */
        public void m22965c(List list) {
            if (list == null) {
                return;
            }
            for (Object obj : list) {
                if (obj == OperatorWindowWithObservableFactory.f78816b) {
                    m22962f();
                } else if (NotificationLite.isError(obj)) {
                    m22963e(NotificationLite.getError(obj));
                    return;
                } else if (NotificationLite.isCompleted(obj)) {
                    complete();
                    return;
                } else {
                    m22964d(obj);
                }
            }
        }

        public void complete() {
            Observer observer = this.f78822c;
            this.f78822c = null;
            this.f78823d = null;
            if (observer != null) {
                observer.onCompleted();
            }
            this.f78820a.onCompleted();
            unsubscribe();
        }

        /* renamed from: d */
        public void m22964d(Object obj) {
            Observer observer = this.f78822c;
            if (observer != null) {
                observer.onNext(obj);
            }
        }

        /* renamed from: e */
        public void m22963e(Throwable th2) {
            Observer observer = this.f78822c;
            this.f78822c = null;
            this.f78823d = null;
            if (observer != null) {
                observer.onError(th2);
            }
            this.f78820a.onError(th2);
            unsubscribe();
        }

        /* renamed from: f */
        public void m22962f() {
            Observer observer = this.f78822c;
            if (observer != null) {
                observer.onCompleted();
            }
            m22966b();
            this.f78820a.onNext(this.f78823d);
        }

        /* renamed from: g */
        public void m22961g() {
            synchronized (this.f78821b) {
                try {
                    if (this.f78824e) {
                        if (this.f78825f == null) {
                            this.f78825f = new ArrayList();
                        }
                        this.f78825f.add(OperatorWindowWithObservableFactory.f78816b);
                        return;
                    }
                    List list = this.f78825f;
                    this.f78825f = null;
                    boolean z = true;
                    this.f78824e = true;
                    boolean z2 = true;
                    while (true) {
                        try {
                            m22965c(list);
                            if (z2) {
                                m22962f();
                                z2 = false;
                            }
                            try {
                                synchronized (this.f78821b) {
                                    try {
                                        List list2 = this.f78825f;
                                        this.f78825f = null;
                                        if (list2 == null) {
                                            this.f78824e = false;
                                            return;
                                        } else if (this.f78820a.isUnsubscribed()) {
                                            synchronized (this.f78821b) {
                                                this.f78824e = false;
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
                                                synchronized (this.f78821b) {
                                                    this.f78824e = false;
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
            synchronized (this.f78821b) {
                try {
                    if (this.f78824e) {
                        if (this.f78825f == null) {
                            this.f78825f = new ArrayList();
                        }
                        this.f78825f.add(NotificationLite.completed());
                        return;
                    }
                    List list = this.f78825f;
                    this.f78825f = null;
                    this.f78824e = true;
                    try {
                        m22965c(list);
                        complete();
                    } catch (Throwable th2) {
                        m22963e(th2);
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            synchronized (this.f78821b) {
                try {
                    if (this.f78824e) {
                        this.f78825f = Collections.singletonList(NotificationLite.error(th2));
                        return;
                    }
                    this.f78825f = null;
                    this.f78824e = true;
                    m22963e(th2);
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            synchronized (this.f78821b) {
                try {
                    if (this.f78824e) {
                        if (this.f78825f == null) {
                            this.f78825f = new ArrayList();
                        }
                        this.f78825f.add(obj);
                        return;
                    }
                    List list = this.f78825f;
                    this.f78825f = null;
                    boolean z = true;
                    this.f78824e = true;
                    boolean z2 = true;
                    while (true) {
                        try {
                            m22965c(list);
                            if (z2) {
                                m22964d(obj);
                                z2 = false;
                            }
                            try {
                                synchronized (this.f78821b) {
                                    try {
                                        List list2 = this.f78825f;
                                        this.f78825f = null;
                                        if (list2 == null) {
                                            this.f78824e = false;
                                            return;
                                        } else if (this.f78820a.isUnsubscribed()) {
                                            synchronized (this.f78821b) {
                                                this.f78824e = false;
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
                                                synchronized (this.f78821b) {
                                                    this.f78824e = false;
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
        this.f78817a = func0;
    }

    @Override // p046rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public Subscriber<? super T> call(Subscriber<? super Observable<T>> subscriber) {
        C13683b c13683b = new C13683b(subscriber, this.f78817a);
        subscriber.add(c13683b);
        c13683b.m22961g();
        return c13683b;
    }
}
