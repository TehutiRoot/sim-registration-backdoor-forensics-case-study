package p046rx.internal.operators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p046rx.Observable;
import p046rx.Observer;
import p046rx.Scheduler;
import p046rx.Subscriber;
import p046rx.functions.Action0;
import p046rx.observers.SerializedObserver;
import p046rx.observers.SerializedSubscriber;
import p046rx.subjects.UnicastSubject;
import p046rx.subscriptions.Subscriptions;

/* renamed from: rx.internal.operators.OperatorWindowWithTime */
/* loaded from: classes7.dex */
public final class OperatorWindowWithTime<T> implements Observable.Operator<Observable<T>, T> {

    /* renamed from: f */
    public static final Object f78872f = new Object();

    /* renamed from: a */
    public final long f78873a;

    /* renamed from: b */
    public final long f78874b;

    /* renamed from: c */
    public final TimeUnit f78875c;

    /* renamed from: d */
    public final Scheduler f78876d;

    /* renamed from: e */
    public final int f78877e;

    /* renamed from: rx.internal.operators.OperatorWindowWithTime$a */
    /* loaded from: classes7.dex */
    public static final class C13690a {

        /* renamed from: a */
        public final Observer f78878a;

        /* renamed from: b */
        public final Observable f78879b;

        /* renamed from: c */
        public int f78880c;

        public C13690a(Observer observer, Observable observable) {
            this.f78878a = new SerializedObserver(observer);
            this.f78879b = observable;
        }
    }

    /* renamed from: rx.internal.operators.OperatorWindowWithTime$b */
    /* loaded from: classes7.dex */
    public final class C13691b extends Subscriber {

        /* renamed from: a */
        public final Subscriber f78881a;

        /* renamed from: b */
        public final Scheduler.Worker f78882b;

        /* renamed from: d */
        public List f78884d;

        /* renamed from: e */
        public boolean f78885e;

        /* renamed from: c */
        public final Object f78883c = new Object();

        /* renamed from: f */
        public volatile C13697d f78886f = C13697d.m22935c();

        /* renamed from: rx.internal.operators.OperatorWindowWithTime$b$a */
        /* loaded from: classes7.dex */
        public class C13692a implements Action0 {

            /* renamed from: a */
            public final /* synthetic */ OperatorWindowWithTime f78888a;

            public C13692a(OperatorWindowWithTime operatorWindowWithTime) {
                this.f78888a = operatorWindowWithTime;
            }

            @Override // p046rx.functions.Action0
            public void call() {
                if (C13691b.this.f78886f.f78901a == null) {
                    C13691b.this.unsubscribe();
                }
            }
        }

        /* renamed from: rx.internal.operators.OperatorWindowWithTime$b$b */
        /* loaded from: classes7.dex */
        public class C13693b implements Action0 {
            public C13693b() {
            }

            @Override // p046rx.functions.Action0
            public void call() {
                C13691b.this.m22944e();
            }
        }

        public C13691b(Subscriber subscriber, Scheduler.Worker worker) {
            this.f78881a = new SerializedSubscriber(subscriber);
            this.f78882b = worker;
            subscriber.add(Subscriptions.create(new C13692a(OperatorWindowWithTime.this)));
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x003d, code lost:
            return true;
         */
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean m22947b(java.util.List r5) {
            /*
                r4 = this;
                r0 = 1
                if (r5 != 0) goto L4
                return r0
            L4:
                java.util.Iterator r5 = r5.iterator()
            L8:
                boolean r1 = r5.hasNext()
                if (r1 == 0) goto L3d
                java.lang.Object r1 = r5.next()
                java.lang.Object r2 = p046rx.internal.operators.OperatorWindowWithTime.f78872f
                r3 = 0
                if (r1 != r2) goto L1e
                boolean r1 = r4.m22943f()
                if (r1 != 0) goto L8
                return r3
            L1e:
                boolean r2 = p046rx.internal.operators.NotificationLite.isError(r1)
                if (r2 == 0) goto L2c
                java.lang.Throwable r5 = p046rx.internal.operators.NotificationLite.getError(r1)
                r4.m22945d(r5)
                goto L3d
            L2c:
                boolean r2 = p046rx.internal.operators.NotificationLite.isCompleted(r1)
                if (r2 == 0) goto L36
                r4.complete()
                goto L3d
            L36:
                boolean r1 = r4.m22946c(r1)
                if (r1 != 0) goto L8
                return r3
            L3d:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p046rx.internal.operators.OperatorWindowWithTime.C13691b.m22947b(java.util.List):boolean");
        }

        /* renamed from: c */
        public boolean m22946c(Object obj) {
            C13697d m22934d;
            C13697d c13697d = this.f78886f;
            if (c13697d.f78901a == null) {
                if (!m22943f()) {
                    return false;
                }
                c13697d = this.f78886f;
            }
            c13697d.f78901a.onNext(obj);
            if (c13697d.f78903c == OperatorWindowWithTime.this.f78877e - 1) {
                c13697d.f78901a.onCompleted();
                m22934d = c13697d.m22937a();
            } else {
                m22934d = c13697d.m22934d();
            }
            this.f78886f = m22934d;
            return true;
        }

        public void complete() {
            Observer observer = this.f78886f.f78901a;
            this.f78886f = this.f78886f.m22937a();
            if (observer != null) {
                observer.onCompleted();
            }
            this.f78881a.onCompleted();
            unsubscribe();
        }

        /* renamed from: d */
        public void m22945d(Throwable th2) {
            Observer observer = this.f78886f.f78901a;
            this.f78886f = this.f78886f.m22937a();
            if (observer != null) {
                observer.onError(th2);
            }
            this.f78881a.onError(th2);
            unsubscribe();
        }

        /* renamed from: e */
        public void m22944e() {
            boolean z;
            List list;
            synchronized (this.f78883c) {
                try {
                    if (this.f78885e) {
                        if (this.f78884d == null) {
                            this.f78884d = new ArrayList();
                        }
                        this.f78884d.add(OperatorWindowWithTime.f78872f);
                        return;
                    }
                    boolean z2 = true;
                    this.f78885e = true;
                    try {
                        if (!m22943f()) {
                            synchronized (this.f78883c) {
                                this.f78885e = false;
                            }
                            return;
                        }
                        do {
                            try {
                                synchronized (this.f78883c) {
                                    try {
                                        list = this.f78884d;
                                        if (list == null) {
                                            this.f78885e = false;
                                            return;
                                        }
                                        this.f78884d = null;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        z2 = false;
                                        try {
                                            throw th;
                                        } catch (Throwable th3) {
                                            z = z2;
                                            th = th3;
                                            if (!z) {
                                                synchronized (this.f78883c) {
                                                    this.f78885e = false;
                                                }
                                            }
                                            throw th;
                                        }
                                    }
                                }
                            } catch (Throwable th4) {
                                th = th4;
                            }
                        } while (m22947b(list));
                        synchronized (this.f78883c) {
                            this.f78885e = false;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        z = false;
                    }
                } finally {
                }
            }
        }

        /* renamed from: f */
        public boolean m22943f() {
            Observer observer = this.f78886f.f78901a;
            if (observer != null) {
                observer.onCompleted();
            }
            if (this.f78881a.isUnsubscribed()) {
                this.f78886f = this.f78886f.m22937a();
                unsubscribe();
                return false;
            }
            UnicastSubject create = UnicastSubject.create();
            this.f78886f = this.f78886f.m22936b(create, create);
            this.f78881a.onNext(create);
            return true;
        }

        /* renamed from: g */
        public void m22942g() {
            Scheduler.Worker worker = this.f78882b;
            C13693b c13693b = new C13693b();
            OperatorWindowWithTime operatorWindowWithTime = OperatorWindowWithTime.this;
            worker.schedulePeriodically(c13693b, 0L, operatorWindowWithTime.f78873a, operatorWindowWithTime.f78875c);
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            synchronized (this.f78883c) {
                try {
                    if (this.f78885e) {
                        if (this.f78884d == null) {
                            this.f78884d = new ArrayList();
                        }
                        this.f78884d.add(NotificationLite.completed());
                        return;
                    }
                    List list = this.f78884d;
                    this.f78884d = null;
                    this.f78885e = true;
                    try {
                        m22947b(list);
                        complete();
                    } catch (Throwable th2) {
                        m22945d(th2);
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            synchronized (this.f78883c) {
                try {
                    if (this.f78885e) {
                        this.f78884d = Collections.singletonList(NotificationLite.error(th2));
                        return;
                    }
                    this.f78884d = null;
                    this.f78885e = true;
                    m22945d(th2);
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            List list;
            synchronized (this.f78883c) {
                try {
                    if (this.f78885e) {
                        if (this.f78884d == null) {
                            this.f78884d = new ArrayList();
                        }
                        this.f78884d.add(obj);
                        return;
                    }
                    boolean z = true;
                    this.f78885e = true;
                    try {
                        if (!m22946c(obj)) {
                            synchronized (this.f78883c) {
                                this.f78885e = false;
                            }
                            return;
                        }
                        do {
                            try {
                                synchronized (this.f78883c) {
                                    try {
                                        list = this.f78884d;
                                        if (list == null) {
                                            this.f78885e = false;
                                            return;
                                        }
                                        this.f78884d = null;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        z = false;
                                        try {
                                            throw th;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            if (!z) {
                                                synchronized (this.f78883c) {
                                                    this.f78885e = false;
                                                }
                                            }
                                            throw th;
                                        }
                                    }
                                }
                            } catch (Throwable th4) {
                                th = th4;
                            }
                        } while (m22947b(list));
                        synchronized (this.f78883c) {
                            this.f78885e = false;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        z = false;
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

    /* renamed from: rx.internal.operators.OperatorWindowWithTime$c */
    /* loaded from: classes7.dex */
    public final class C13694c extends Subscriber {

        /* renamed from: a */
        public final Subscriber f78891a;

        /* renamed from: b */
        public final Scheduler.Worker f78892b;

        /* renamed from: c */
        public final Object f78893c;

        /* renamed from: d */
        public final List f78894d;

        /* renamed from: e */
        public boolean f78895e;

        /* renamed from: rx.internal.operators.OperatorWindowWithTime$c$a */
        /* loaded from: classes7.dex */
        public class C13695a implements Action0 {
            public C13695a() {
            }

            @Override // p046rx.functions.Action0
            public void call() {
                C13694c.this.m22939d();
            }
        }

        /* renamed from: rx.internal.operators.OperatorWindowWithTime$c$b */
        /* loaded from: classes7.dex */
        public class C13696b implements Action0 {

            /* renamed from: a */
            public final /* synthetic */ C13690a f78898a;

            public C13696b(C13690a c13690a) {
                this.f78898a = c13690a;
            }

            @Override // p046rx.functions.Action0
            public void call() {
                C13694c.this.m22938e(this.f78898a);
            }
        }

        public C13694c(Subscriber subscriber, Scheduler.Worker worker) {
            super(subscriber);
            this.f78891a = subscriber;
            this.f78892b = worker;
            this.f78893c = new Object();
            this.f78894d = new LinkedList();
        }

        /* renamed from: b */
        public C13690a m22941b() {
            UnicastSubject create = UnicastSubject.create();
            return new C13690a(create, create);
        }

        /* renamed from: c */
        public void m22940c() {
            Scheduler.Worker worker = this.f78892b;
            C13695a c13695a = new C13695a();
            OperatorWindowWithTime operatorWindowWithTime = OperatorWindowWithTime.this;
            long j = operatorWindowWithTime.f78874b;
            worker.schedulePeriodically(c13695a, j, j, operatorWindowWithTime.f78875c);
        }

        /* renamed from: d */
        public void m22939d() {
            C13690a m22941b = m22941b();
            synchronized (this.f78893c) {
                try {
                    if (this.f78895e) {
                        return;
                    }
                    this.f78894d.add(m22941b);
                    try {
                        this.f78891a.onNext(m22941b.f78879b);
                        Scheduler.Worker worker = this.f78892b;
                        C13696b c13696b = new C13696b(m22941b);
                        OperatorWindowWithTime operatorWindowWithTime = OperatorWindowWithTime.this;
                        worker.schedule(c13696b, operatorWindowWithTime.f78873a, operatorWindowWithTime.f78875c);
                    } catch (Throwable th2) {
                        onError(th2);
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        /* renamed from: e */
        public void m22938e(C13690a c13690a) {
            boolean z;
            synchronized (this.f78893c) {
                try {
                    if (this.f78895e) {
                        return;
                    }
                    Iterator it = this.f78894d.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((C13690a) it.next()) == c13690a) {
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
                        c13690a.f78878a.onCompleted();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            synchronized (this.f78893c) {
                try {
                    if (this.f78895e) {
                        return;
                    }
                    this.f78895e = true;
                    ArrayList<C13690a> arrayList = new ArrayList(this.f78894d);
                    this.f78894d.clear();
                    for (C13690a c13690a : arrayList) {
                        c13690a.f78878a.onCompleted();
                    }
                    this.f78891a.onCompleted();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            synchronized (this.f78893c) {
                try {
                    if (this.f78895e) {
                        return;
                    }
                    this.f78895e = true;
                    ArrayList<C13690a> arrayList = new ArrayList(this.f78894d);
                    this.f78894d.clear();
                    for (C13690a c13690a : arrayList) {
                        c13690a.f78878a.onError(th2);
                    }
                    this.f78891a.onError(th2);
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            synchronized (this.f78893c) {
                try {
                    if (this.f78895e) {
                        return;
                    }
                    ArrayList<C13690a> arrayList = new ArrayList(this.f78894d);
                    Iterator it = this.f78894d.iterator();
                    while (it.hasNext()) {
                        C13690a c13690a = (C13690a) it.next();
                        int i = c13690a.f78880c + 1;
                        c13690a.f78880c = i;
                        if (i == OperatorWindowWithTime.this.f78877e) {
                            it.remove();
                        }
                    }
                    for (C13690a c13690a2 : arrayList) {
                        c13690a2.f78878a.onNext(obj);
                        if (c13690a2.f78880c == OperatorWindowWithTime.this.f78877e) {
                            c13690a2.f78878a.onCompleted();
                        }
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

    /* renamed from: rx.internal.operators.OperatorWindowWithTime$d */
    /* loaded from: classes7.dex */
    public static final class C13697d {

        /* renamed from: d */
        public static final C13697d f78900d = new C13697d(null, null, 0);

        /* renamed from: a */
        public final Observer f78901a;

        /* renamed from: b */
        public final Observable f78902b;

        /* renamed from: c */
        public final int f78903c;

        public C13697d(Observer observer, Observable observable, int i) {
            this.f78901a = observer;
            this.f78902b = observable;
            this.f78903c = i;
        }

        /* renamed from: c */
        public static C13697d m22935c() {
            return f78900d;
        }

        /* renamed from: a */
        public C13697d m22937a() {
            return m22935c();
        }

        /* renamed from: b */
        public C13697d m22936b(Observer observer, Observable observable) {
            return new C13697d(observer, observable, 0);
        }

        /* renamed from: d */
        public C13697d m22934d() {
            return new C13697d(this.f78901a, this.f78902b, this.f78903c + 1);
        }
    }

    public OperatorWindowWithTime(long j, long j2, TimeUnit timeUnit, int i, Scheduler scheduler) {
        this.f78873a = j;
        this.f78874b = j2;
        this.f78875c = timeUnit;
        this.f78877e = i;
        this.f78876d = scheduler;
    }

    @Override // p046rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public Subscriber<? super T> call(Subscriber<? super Observable<T>> subscriber) {
        Scheduler.Worker createWorker = this.f78876d.createWorker();
        if (this.f78873a == this.f78874b) {
            C13691b c13691b = new C13691b(subscriber, createWorker);
            c13691b.add(createWorker);
            c13691b.m22942g();
            return c13691b;
        }
        C13694c c13694c = new C13694c(subscriber, createWorker);
        c13694c.add(createWorker);
        c13694c.m22939d();
        c13694c.m22940c();
        return c13694c;
    }
}
