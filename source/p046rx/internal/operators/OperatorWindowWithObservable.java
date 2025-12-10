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
    public static final Object f78807b = new Object();

    /* renamed from: a */
    public final Observable f78808a;

    /* renamed from: rx.internal.operators.OperatorWindowWithObservable$a */
    /* loaded from: classes7.dex */
    public static final class C13680a extends Subscriber {

        /* renamed from: a */
        public final C13681b f78809a;

        public C13680a(C13681b c13681b) {
            this.f78809a = c13681b;
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            this.f78809a.onCompleted();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.f78809a.onError(th2);
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            this.f78809a.m22967g();
        }

        @Override // p046rx.Subscriber, p046rx.observers.AssertableSubscriber
        public void onStart() {
            request(Long.MAX_VALUE);
        }
    }

    /* renamed from: rx.internal.operators.OperatorWindowWithObservable$b */
    /* loaded from: classes7.dex */
    public static final class C13681b extends Subscriber {

        /* renamed from: a */
        public final Subscriber f78810a;

        /* renamed from: b */
        public final Object f78811b = new Object();

        /* renamed from: c */
        public Observer f78812c;

        /* renamed from: d */
        public Observable f78813d;

        /* renamed from: e */
        public boolean f78814e;

        /* renamed from: f */
        public List f78815f;

        public C13681b(Subscriber subscriber) {
            this.f78810a = new SerializedSubscriber(subscriber);
        }

        /* renamed from: b */
        public void m22972b() {
            UnicastSubject create = UnicastSubject.create();
            this.f78812c = create;
            this.f78813d = create;
        }

        /* renamed from: c */
        public void m22971c(List list) {
            if (list == null) {
                return;
            }
            for (Object obj : list) {
                if (obj == OperatorWindowWithObservable.f78807b) {
                    m22968f();
                } else if (NotificationLite.isError(obj)) {
                    m22969e(NotificationLite.getError(obj));
                    return;
                } else if (NotificationLite.isCompleted(obj)) {
                    complete();
                    return;
                } else {
                    m22970d(obj);
                }
            }
        }

        public void complete() {
            Observer observer = this.f78812c;
            this.f78812c = null;
            this.f78813d = null;
            if (observer != null) {
                observer.onCompleted();
            }
            this.f78810a.onCompleted();
            unsubscribe();
        }

        /* renamed from: d */
        public void m22970d(Object obj) {
            Observer observer = this.f78812c;
            if (observer != null) {
                observer.onNext(obj);
            }
        }

        /* renamed from: e */
        public void m22969e(Throwable th2) {
            Observer observer = this.f78812c;
            this.f78812c = null;
            this.f78813d = null;
            if (observer != null) {
                observer.onError(th2);
            }
            this.f78810a.onError(th2);
            unsubscribe();
        }

        /* renamed from: f */
        public void m22968f() {
            Observer observer = this.f78812c;
            if (observer != null) {
                observer.onCompleted();
            }
            m22972b();
            this.f78810a.onNext(this.f78813d);
        }

        /* renamed from: g */
        public void m22967g() {
            synchronized (this.f78811b) {
                try {
                    if (this.f78814e) {
                        if (this.f78815f == null) {
                            this.f78815f = new ArrayList();
                        }
                        this.f78815f.add(OperatorWindowWithObservable.f78807b);
                        return;
                    }
                    List list = this.f78815f;
                    this.f78815f = null;
                    boolean z = true;
                    this.f78814e = true;
                    boolean z2 = true;
                    while (true) {
                        try {
                            m22971c(list);
                            if (z2) {
                                m22968f();
                                z2 = false;
                            }
                            try {
                                synchronized (this.f78811b) {
                                    try {
                                        List list2 = this.f78815f;
                                        this.f78815f = null;
                                        if (list2 == null) {
                                            this.f78814e = false;
                                            return;
                                        } else if (this.f78810a.isUnsubscribed()) {
                                            synchronized (this.f78811b) {
                                                this.f78814e = false;
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
                                                synchronized (this.f78811b) {
                                                    this.f78814e = false;
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
            synchronized (this.f78811b) {
                try {
                    if (this.f78814e) {
                        if (this.f78815f == null) {
                            this.f78815f = new ArrayList();
                        }
                        this.f78815f.add(NotificationLite.completed());
                        return;
                    }
                    List list = this.f78815f;
                    this.f78815f = null;
                    this.f78814e = true;
                    try {
                        m22971c(list);
                        complete();
                    } catch (Throwable th2) {
                        m22969e(th2);
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            synchronized (this.f78811b) {
                try {
                    if (this.f78814e) {
                        this.f78815f = Collections.singletonList(NotificationLite.error(th2));
                        return;
                    }
                    this.f78815f = null;
                    this.f78814e = true;
                    m22969e(th2);
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            synchronized (this.f78811b) {
                try {
                    if (this.f78814e) {
                        if (this.f78815f == null) {
                            this.f78815f = new ArrayList();
                        }
                        this.f78815f.add(obj);
                        return;
                    }
                    List list = this.f78815f;
                    this.f78815f = null;
                    boolean z = true;
                    this.f78814e = true;
                    boolean z2 = true;
                    while (true) {
                        try {
                            m22971c(list);
                            if (z2) {
                                m22970d(obj);
                                z2 = false;
                            }
                            try {
                                synchronized (this.f78811b) {
                                    try {
                                        List list2 = this.f78815f;
                                        this.f78815f = null;
                                        if (list2 == null) {
                                            this.f78814e = false;
                                            return;
                                        } else if (this.f78810a.isUnsubscribed()) {
                                            synchronized (this.f78811b) {
                                                this.f78814e = false;
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
                                                synchronized (this.f78811b) {
                                                    this.f78814e = false;
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
        this.f78808a = observable;
    }

    @Override // p046rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public Subscriber<? super T> call(Subscriber<? super Observable<T>> subscriber) {
        C13681b c13681b = new C13681b(subscriber);
        C13680a c13680a = new C13680a(c13681b);
        subscriber.add(c13681b);
        subscriber.add(c13680a);
        c13681b.m22967g();
        this.f78808a.unsafeSubscribe(c13680a);
        return c13681b;
    }
}
