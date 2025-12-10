package p046rx.internal.operators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p046rx.Observable;
import p046rx.Observer;
import p046rx.Subscriber;
import p046rx.observers.SerializedSubscriber;
import p046rx.subjects.UnicastSubject;

/* renamed from: rx.internal.operators.OperatorWindowWithObservable */
/* loaded from: classes7.dex */
public final class OperatorWindowWithObservable<T, U> implements Observable.Operator<Observable<T>, T> {

    /* renamed from: b */
    public static final Object f79013b = new Object();

    /* renamed from: a */
    public final Observable f79014a;

    /* renamed from: rx.internal.operators.OperatorWindowWithObservable$a */
    /* loaded from: classes7.dex */
    public static final class C13681a extends Subscriber {

        /* renamed from: a */
        public final C13682b f79015a;

        public C13681a(C13682b c13682b) {
            this.f79015a = c13682b;
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            this.f79015a.onCompleted();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.f79015a.onError(th2);
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            this.f79015a.m23155g();
        }

        @Override // p046rx.Subscriber, p046rx.observers.AssertableSubscriber
        public void onStart() {
            request(Long.MAX_VALUE);
        }
    }

    /* renamed from: rx.internal.operators.OperatorWindowWithObservable$b */
    /* loaded from: classes7.dex */
    public static final class C13682b extends Subscriber {

        /* renamed from: a */
        public final Subscriber f79016a;

        /* renamed from: b */
        public final Object f79017b = new Object();

        /* renamed from: c */
        public Observer f79018c;

        /* renamed from: d */
        public Observable f79019d;

        /* renamed from: e */
        public boolean f79020e;

        /* renamed from: f */
        public List f79021f;

        public C13682b(Subscriber subscriber) {
            this.f79016a = new SerializedSubscriber(subscriber);
        }

        /* renamed from: b */
        public void m23160b() {
            UnicastSubject create = UnicastSubject.create();
            this.f79018c = create;
            this.f79019d = create;
        }

        /* renamed from: c */
        public void m23159c(List list) {
            if (list == null) {
                return;
            }
            for (Object obj : list) {
                if (obj == OperatorWindowWithObservable.f79013b) {
                    m23156f();
                } else if (NotificationLite.isError(obj)) {
                    m23157e(NotificationLite.getError(obj));
                    return;
                } else if (NotificationLite.isCompleted(obj)) {
                    complete();
                    return;
                } else {
                    m23158d(obj);
                }
            }
        }

        public void complete() {
            Observer observer = this.f79018c;
            this.f79018c = null;
            this.f79019d = null;
            if (observer != null) {
                observer.onCompleted();
            }
            this.f79016a.onCompleted();
            unsubscribe();
        }

        /* renamed from: d */
        public void m23158d(Object obj) {
            Observer observer = this.f79018c;
            if (observer != null) {
                observer.onNext(obj);
            }
        }

        /* renamed from: e */
        public void m23157e(Throwable th2) {
            Observer observer = this.f79018c;
            this.f79018c = null;
            this.f79019d = null;
            if (observer != null) {
                observer.onError(th2);
            }
            this.f79016a.onError(th2);
            unsubscribe();
        }

        /* renamed from: f */
        public void m23156f() {
            Observer observer = this.f79018c;
            if (observer != null) {
                observer.onCompleted();
            }
            m23160b();
            this.f79016a.onNext(this.f79019d);
        }

        /* renamed from: g */
        public void m23155g() {
            synchronized (this.f79017b) {
                try {
                    if (this.f79020e) {
                        if (this.f79021f == null) {
                            this.f79021f = new ArrayList();
                        }
                        this.f79021f.add(OperatorWindowWithObservable.f79013b);
                        return;
                    }
                    List list = this.f79021f;
                    this.f79021f = null;
                    boolean z = true;
                    this.f79020e = true;
                    boolean z2 = true;
                    while (true) {
                        try {
                            m23159c(list);
                            if (z2) {
                                m23156f();
                                z2 = false;
                            }
                            try {
                                synchronized (this.f79017b) {
                                    try {
                                        List list2 = this.f79021f;
                                        this.f79021f = null;
                                        if (list2 == null) {
                                            this.f79020e = false;
                                            return;
                                        } else if (this.f79016a.isUnsubscribed()) {
                                            synchronized (this.f79017b) {
                                                this.f79020e = false;
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
                                                synchronized (this.f79017b) {
                                                    this.f79020e = false;
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
            synchronized (this.f79017b) {
                try {
                    if (this.f79020e) {
                        if (this.f79021f == null) {
                            this.f79021f = new ArrayList();
                        }
                        this.f79021f.add(NotificationLite.completed());
                        return;
                    }
                    List list = this.f79021f;
                    this.f79021f = null;
                    this.f79020e = true;
                    try {
                        m23159c(list);
                        complete();
                    } catch (Throwable th2) {
                        m23157e(th2);
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            synchronized (this.f79017b) {
                try {
                    if (this.f79020e) {
                        this.f79021f = Collections.singletonList(NotificationLite.error(th2));
                        return;
                    }
                    this.f79021f = null;
                    this.f79020e = true;
                    m23157e(th2);
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            synchronized (this.f79017b) {
                try {
                    if (this.f79020e) {
                        if (this.f79021f == null) {
                            this.f79021f = new ArrayList();
                        }
                        this.f79021f.add(obj);
                        return;
                    }
                    List list = this.f79021f;
                    this.f79021f = null;
                    boolean z = true;
                    this.f79020e = true;
                    boolean z2 = true;
                    while (true) {
                        try {
                            m23159c(list);
                            if (z2) {
                                m23158d(obj);
                                z2 = false;
                            }
                            try {
                                synchronized (this.f79017b) {
                                    try {
                                        List list2 = this.f79021f;
                                        this.f79021f = null;
                                        if (list2 == null) {
                                            this.f79020e = false;
                                            return;
                                        } else if (this.f79016a.isUnsubscribed()) {
                                            synchronized (this.f79017b) {
                                                this.f79020e = false;
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
                                                synchronized (this.f79017b) {
                                                    this.f79020e = false;
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

    public OperatorWindowWithObservable(Observable<U> observable) {
        this.f79014a = observable;
    }

    @Override // p046rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public Subscriber<? super T> call(Subscriber<? super Observable<T>> subscriber) {
        C13682b c13682b = new C13682b(subscriber);
        C13681a c13681a = new C13681a(c13682b);
        subscriber.add(c13682b);
        subscriber.add(c13681a);
        c13682b.m23155g();
        this.f79014a.unsafeSubscribe(c13681a);
        return c13682b;
    }
}