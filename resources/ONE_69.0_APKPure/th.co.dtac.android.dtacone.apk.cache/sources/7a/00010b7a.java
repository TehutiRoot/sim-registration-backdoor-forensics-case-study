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
    public static final Object f79078f = new Object();

    /* renamed from: a */
    public final long f79079a;

    /* renamed from: b */
    public final long f79080b;

    /* renamed from: c */
    public final TimeUnit f79081c;

    /* renamed from: d */
    public final Scheduler f79082d;

    /* renamed from: e */
    public final int f79083e;

    /* renamed from: rx.internal.operators.OperatorWindowWithTime$a */
    /* loaded from: classes7.dex */
    public static final class C13691a {

        /* renamed from: a */
        public final Observer f79084a;

        /* renamed from: b */
        public final Observable f79085b;

        /* renamed from: c */
        public int f79086c;

        public C13691a(Observer observer, Observable observable) {
            this.f79084a = new SerializedObserver(observer);
            this.f79085b = observable;
        }
    }

    /* renamed from: rx.internal.operators.OperatorWindowWithTime$b */
    /* loaded from: classes7.dex */
    public final class C13692b extends Subscriber {

        /* renamed from: a */
        public final Subscriber f79087a;

        /* renamed from: b */
        public final Scheduler.Worker f79088b;

        /* renamed from: d */
        public List f79090d;

        /* renamed from: e */
        public boolean f79091e;

        /* renamed from: c */
        public final Object f79089c = new Object();

        /* renamed from: f */
        public volatile C13698d f79092f = C13698d.m23123c();

        /* renamed from: rx.internal.operators.OperatorWindowWithTime$b$a */
        /* loaded from: classes7.dex */
        public class C13693a implements Action0 {

            /* renamed from: a */
            public final /* synthetic */ OperatorWindowWithTime f79094a;

            public C13693a(OperatorWindowWithTime operatorWindowWithTime) {
                this.f79094a = operatorWindowWithTime;
            }

            @Override // p046rx.functions.Action0
            public void call() {
                if (C13692b.this.f79092f.f79107a == null) {
                    C13692b.this.unsubscribe();
                }
            }
        }

        /* renamed from: rx.internal.operators.OperatorWindowWithTime$b$b */
        /* loaded from: classes7.dex */
        public class C13694b implements Action0 {
            public C13694b() {
            }

            @Override // p046rx.functions.Action0
            public void call() {
                C13692b.this.m23132e();
            }
        }

        public C13692b(Subscriber subscriber, Scheduler.Worker worker) {
            this.f79087a = new SerializedSubscriber(subscriber);
            this.f79088b = worker;
            subscriber.add(Subscriptions.create(new C13693a(OperatorWindowWithTime.this)));
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x003d, code lost:
            return true;
         */
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean m23135b(java.util.List r5) {
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
                java.lang.Object r2 = p046rx.internal.operators.OperatorWindowWithTime.f79078f
                r3 = 0
                if (r1 != r2) goto L1e
                boolean r1 = r4.m23131f()
                if (r1 != 0) goto L8
                return r3
            L1e:
                boolean r2 = p046rx.internal.operators.NotificationLite.isError(r1)
                if (r2 == 0) goto L2c
                java.lang.Throwable r5 = p046rx.internal.operators.NotificationLite.getError(r1)
                r4.m23133d(r5)
                goto L3d
            L2c:
                boolean r2 = p046rx.internal.operators.NotificationLite.isCompleted(r1)
                if (r2 == 0) goto L36
                r4.complete()
                goto L3d
            L36:
                boolean r1 = r4.m23134c(r1)
                if (r1 != 0) goto L8
                return r3
            L3d:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p046rx.internal.operators.OperatorWindowWithTime.C13692b.m23135b(java.util.List):boolean");
        }

        /* renamed from: c */
        public boolean m23134c(Object obj) {
            C13698d m23122d;
            C13698d c13698d = this.f79092f;
            if (c13698d.f79107a == null) {
                if (!m23131f()) {
                    return false;
                }
                c13698d = this.f79092f;
            }
            c13698d.f79107a.onNext(obj);
            if (c13698d.f79109c == OperatorWindowWithTime.this.f79083e - 1) {
                c13698d.f79107a.onCompleted();
                m23122d = c13698d.m23125a();
            } else {
                m23122d = c13698d.m23122d();
            }
            this.f79092f = m23122d;
            return true;
        }

        public void complete() {
            Observer observer = this.f79092f.f79107a;
            this.f79092f = this.f79092f.m23125a();
            if (observer != null) {
                observer.onCompleted();
            }
            this.f79087a.onCompleted();
            unsubscribe();
        }

        /* renamed from: d */
        public void m23133d(Throwable th2) {
            Observer observer = this.f79092f.f79107a;
            this.f79092f = this.f79092f.m23125a();
            if (observer != null) {
                observer.onError(th2);
            }
            this.f79087a.onError(th2);
            unsubscribe();
        }

        /* renamed from: e */
        public void m23132e() {
            boolean z;
            List list;
            synchronized (this.f79089c) {
                try {
                    if (this.f79091e) {
                        if (this.f79090d == null) {
                            this.f79090d = new ArrayList();
                        }
                        this.f79090d.add(OperatorWindowWithTime.f79078f);
                        return;
                    }
                    boolean z2 = true;
                    this.f79091e = true;
                    try {
                        if (!m23131f()) {
                            synchronized (this.f79089c) {
                                this.f79091e = false;
                            }
                            return;
                        }
                        do {
                            try {
                                synchronized (this.f79089c) {
                                    try {
                                        list = this.f79090d;
                                        if (list == null) {
                                            this.f79091e = false;
                                            return;
                                        }
                                        this.f79090d = null;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        z2 = false;
                                        try {
                                            throw th;
                                        } catch (Throwable th3) {
                                            z = z2;
                                            th = th3;
                                            if (!z) {
                                                synchronized (this.f79089c) {
                                                    this.f79091e = false;
                                                }
                                            }
                                            throw th;
                                        }
                                    }
                                }
                            } catch (Throwable th4) {
                                th = th4;
                            }
                        } while (m23135b(list));
                        synchronized (this.f79089c) {
                            this.f79091e = false;
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
        public boolean m23131f() {
            Observer observer = this.f79092f.f79107a;
            if (observer != null) {
                observer.onCompleted();
            }
            if (this.f79087a.isUnsubscribed()) {
                this.f79092f = this.f79092f.m23125a();
                unsubscribe();
                return false;
            }
            UnicastSubject create = UnicastSubject.create();
            this.f79092f = this.f79092f.m23124b(create, create);
            this.f79087a.onNext(create);
            return true;
        }

        /* renamed from: g */
        public void m23130g() {
            Scheduler.Worker worker = this.f79088b;
            C13694b c13694b = new C13694b();
            OperatorWindowWithTime operatorWindowWithTime = OperatorWindowWithTime.this;
            worker.schedulePeriodically(c13694b, 0L, operatorWindowWithTime.f79079a, operatorWindowWithTime.f79081c);
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            synchronized (this.f79089c) {
                try {
                    if (this.f79091e) {
                        if (this.f79090d == null) {
                            this.f79090d = new ArrayList();
                        }
                        this.f79090d.add(NotificationLite.completed());
                        return;
                    }
                    List list = this.f79090d;
                    this.f79090d = null;
                    this.f79091e = true;
                    try {
                        m23135b(list);
                        complete();
                    } catch (Throwable th2) {
                        m23133d(th2);
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            synchronized (this.f79089c) {
                try {
                    if (this.f79091e) {
                        this.f79090d = Collections.singletonList(NotificationLite.error(th2));
                        return;
                    }
                    this.f79090d = null;
                    this.f79091e = true;
                    m23133d(th2);
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            List list;
            synchronized (this.f79089c) {
                try {
                    if (this.f79091e) {
                        if (this.f79090d == null) {
                            this.f79090d = new ArrayList();
                        }
                        this.f79090d.add(obj);
                        return;
                    }
                    boolean z = true;
                    this.f79091e = true;
                    try {
                        if (!m23134c(obj)) {
                            synchronized (this.f79089c) {
                                this.f79091e = false;
                            }
                            return;
                        }
                        do {
                            try {
                                synchronized (this.f79089c) {
                                    try {
                                        list = this.f79090d;
                                        if (list == null) {
                                            this.f79091e = false;
                                            return;
                                        }
                                        this.f79090d = null;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        z = false;
                                        try {
                                            throw th;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            if (!z) {
                                                synchronized (this.f79089c) {
                                                    this.f79091e = false;
                                                }
                                            }
                                            throw th;
                                        }
                                    }
                                }
                            } catch (Throwable th4) {
                                th = th4;
                            }
                        } while (m23135b(list));
                        synchronized (this.f79089c) {
                            this.f79091e = false;
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
    public final class C13695c extends Subscriber {

        /* renamed from: a */
        public final Subscriber f79097a;

        /* renamed from: b */
        public final Scheduler.Worker f79098b;

        /* renamed from: c */
        public final Object f79099c;

        /* renamed from: d */
        public final List f79100d;

        /* renamed from: e */
        public boolean f79101e;

        /* renamed from: rx.internal.operators.OperatorWindowWithTime$c$a */
        /* loaded from: classes7.dex */
        public class C13696a implements Action0 {
            public C13696a() {
            }

            @Override // p046rx.functions.Action0
            public void call() {
                C13695c.this.m23127d();
            }
        }

        /* renamed from: rx.internal.operators.OperatorWindowWithTime$c$b */
        /* loaded from: classes7.dex */
        public class C13697b implements Action0 {

            /* renamed from: a */
            public final /* synthetic */ C13691a f79104a;

            public C13697b(C13691a c13691a) {
                this.f79104a = c13691a;
            }

            @Override // p046rx.functions.Action0
            public void call() {
                C13695c.this.m23126e(this.f79104a);
            }
        }

        public C13695c(Subscriber subscriber, Scheduler.Worker worker) {
            super(subscriber);
            this.f79097a = subscriber;
            this.f79098b = worker;
            this.f79099c = new Object();
            this.f79100d = new LinkedList();
        }

        /* renamed from: b */
        public C13691a m23129b() {
            UnicastSubject create = UnicastSubject.create();
            return new C13691a(create, create);
        }

        /* renamed from: c */
        public void m23128c() {
            Scheduler.Worker worker = this.f79098b;
            C13696a c13696a = new C13696a();
            OperatorWindowWithTime operatorWindowWithTime = OperatorWindowWithTime.this;
            long j = operatorWindowWithTime.f79080b;
            worker.schedulePeriodically(c13696a, j, j, operatorWindowWithTime.f79081c);
        }

        /* renamed from: d */
        public void m23127d() {
            C13691a m23129b = m23129b();
            synchronized (this.f79099c) {
                try {
                    if (this.f79101e) {
                        return;
                    }
                    this.f79100d.add(m23129b);
                    try {
                        this.f79097a.onNext(m23129b.f79085b);
                        Scheduler.Worker worker = this.f79098b;
                        C13697b c13697b = new C13697b(m23129b);
                        OperatorWindowWithTime operatorWindowWithTime = OperatorWindowWithTime.this;
                        worker.schedule(c13697b, operatorWindowWithTime.f79079a, operatorWindowWithTime.f79081c);
                    } catch (Throwable th2) {
                        onError(th2);
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        /* renamed from: e */
        public void m23126e(C13691a c13691a) {
            boolean z;
            synchronized (this.f79099c) {
                try {
                    if (this.f79101e) {
                        return;
                    }
                    Iterator it = this.f79100d.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((C13691a) it.next()) == c13691a) {
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
                        c13691a.f79084a.onCompleted();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            synchronized (this.f79099c) {
                try {
                    if (this.f79101e) {
                        return;
                    }
                    this.f79101e = true;
                    ArrayList<C13691a> arrayList = new ArrayList(this.f79100d);
                    this.f79100d.clear();
                    for (C13691a c13691a : arrayList) {
                        c13691a.f79084a.onCompleted();
                    }
                    this.f79097a.onCompleted();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            synchronized (this.f79099c) {
                try {
                    if (this.f79101e) {
                        return;
                    }
                    this.f79101e = true;
                    ArrayList<C13691a> arrayList = new ArrayList(this.f79100d);
                    this.f79100d.clear();
                    for (C13691a c13691a : arrayList) {
                        c13691a.f79084a.onError(th2);
                    }
                    this.f79097a.onError(th2);
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            synchronized (this.f79099c) {
                try {
                    if (this.f79101e) {
                        return;
                    }
                    ArrayList<C13691a> arrayList = new ArrayList(this.f79100d);
                    Iterator it = this.f79100d.iterator();
                    while (it.hasNext()) {
                        C13691a c13691a = (C13691a) it.next();
                        int i = c13691a.f79086c + 1;
                        c13691a.f79086c = i;
                        if (i == OperatorWindowWithTime.this.f79083e) {
                            it.remove();
                        }
                    }
                    for (C13691a c13691a2 : arrayList) {
                        c13691a2.f79084a.onNext(obj);
                        if (c13691a2.f79086c == OperatorWindowWithTime.this.f79083e) {
                            c13691a2.f79084a.onCompleted();
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
    public static final class C13698d {

        /* renamed from: d */
        public static final C13698d f79106d = new C13698d(null, null, 0);

        /* renamed from: a */
        public final Observer f79107a;

        /* renamed from: b */
        public final Observable f79108b;

        /* renamed from: c */
        public final int f79109c;

        public C13698d(Observer observer, Observable observable, int i) {
            this.f79107a = observer;
            this.f79108b = observable;
            this.f79109c = i;
        }

        /* renamed from: c */
        public static C13698d m23123c() {
            return f79106d;
        }

        /* renamed from: a */
        public C13698d m23125a() {
            return m23123c();
        }

        /* renamed from: b */
        public C13698d m23124b(Observer observer, Observable observable) {
            return new C13698d(observer, observable, 0);
        }

        /* renamed from: d */
        public C13698d m23122d() {
            return new C13698d(this.f79107a, this.f79108b, this.f79109c + 1);
        }
    }

    public OperatorWindowWithTime(long j, long j2, TimeUnit timeUnit, int i, Scheduler scheduler) {
        this.f79079a = j;
        this.f79080b = j2;
        this.f79081c = timeUnit;
        this.f79083e = i;
        this.f79082d = scheduler;
    }

    @Override // p046rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public Subscriber<? super T> call(Subscriber<? super Observable<T>> subscriber) {
        Scheduler.Worker createWorker = this.f79082d.createWorker();
        if (this.f79079a == this.f79080b) {
            C13692b c13692b = new C13692b(subscriber, createWorker);
            c13692b.add(createWorker);
            c13692b.m23130g();
            return c13692b;
        }
        C13695c c13695c = new C13695c(subscriber, createWorker);
        c13695c.add(createWorker);
        c13695c.m23127d();
        c13695c.m23128c();
        return c13695c;
    }
}