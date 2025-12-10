package p046rx.internal.operators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p046rx.Observable;
import p046rx.Scheduler;
import p046rx.Subscriber;
import p046rx.exceptions.Exceptions;
import p046rx.functions.Action0;
import p046rx.observers.SerializedSubscriber;

/* renamed from: rx.internal.operators.OperatorBufferWithTime */
/* loaded from: classes7.dex */
public final class OperatorBufferWithTime<T> implements Observable.Operator<List<T>, T> {

    /* renamed from: a */
    public final long f78255a;

    /* renamed from: b */
    public final long f78256b;

    /* renamed from: c */
    public final TimeUnit f78257c;

    /* renamed from: d */
    public final int f78258d;

    /* renamed from: e */
    public final Scheduler f78259e;

    /* renamed from: rx.internal.operators.OperatorBufferWithTime$a */
    /* loaded from: classes7.dex */
    public final class C13539a extends Subscriber {

        /* renamed from: a */
        public final Subscriber f78260a;

        /* renamed from: b */
        public final Scheduler.Worker f78261b;

        /* renamed from: c */
        public List f78262c = new ArrayList();

        /* renamed from: d */
        public boolean f78263d;

        /* renamed from: rx.internal.operators.OperatorBufferWithTime$a$a */
        /* loaded from: classes7.dex */
        public class C13540a implements Action0 {
            public C13540a() {
            }

            @Override // p046rx.functions.Action0
            public void call() {
                C13539a.this.m23076b();
            }
        }

        public C13539a(Subscriber subscriber, Scheduler.Worker worker) {
            this.f78260a = subscriber;
            this.f78261b = worker;
        }

        /* renamed from: b */
        public void m23076b() {
            synchronized (this) {
                try {
                    if (this.f78263d) {
                        return;
                    }
                    List list = this.f78262c;
                    this.f78262c = new ArrayList();
                    try {
                        this.f78260a.onNext(list);
                    } catch (Throwable th2) {
                        Exceptions.throwOrReport(th2, this);
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        /* renamed from: c */
        public void m23075c() {
            Scheduler.Worker worker = this.f78261b;
            C13540a c13540a = new C13540a();
            OperatorBufferWithTime operatorBufferWithTime = OperatorBufferWithTime.this;
            long j = operatorBufferWithTime.f78255a;
            worker.schedulePeriodically(c13540a, j, j, operatorBufferWithTime.f78257c);
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            try {
                this.f78261b.unsubscribe();
                synchronized (this) {
                    if (this.f78263d) {
                        return;
                    }
                    this.f78263d = true;
                    List list = this.f78262c;
                    this.f78262c = null;
                    this.f78260a.onNext(list);
                    this.f78260a.onCompleted();
                    unsubscribe();
                }
            } catch (Throwable th2) {
                Exceptions.throwOrReport(th2, this.f78260a);
            }
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            synchronized (this) {
                try {
                    if (this.f78263d) {
                        return;
                    }
                    this.f78263d = true;
                    this.f78262c = null;
                    this.f78260a.onError(th2);
                    unsubscribe();
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            List list;
            synchronized (this) {
                try {
                    if (this.f78263d) {
                        return;
                    }
                    this.f78262c.add(obj);
                    if (this.f78262c.size() == OperatorBufferWithTime.this.f78258d) {
                        list = this.f78262c;
                        this.f78262c = new ArrayList();
                    } else {
                        list = null;
                    }
                    if (list != null) {
                        this.f78260a.onNext(list);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* renamed from: rx.internal.operators.OperatorBufferWithTime$b */
    /* loaded from: classes7.dex */
    public final class C13541b extends Subscriber {

        /* renamed from: a */
        public final Subscriber f78266a;

        /* renamed from: b */
        public final Scheduler.Worker f78267b;

        /* renamed from: c */
        public final List f78268c = new LinkedList();

        /* renamed from: d */
        public boolean f78269d;

        /* renamed from: rx.internal.operators.OperatorBufferWithTime$b$a */
        /* loaded from: classes7.dex */
        public class C13542a implements Action0 {
            public C13542a() {
            }

            @Override // p046rx.functions.Action0
            public void call() {
                C13541b.this.m23072d();
            }
        }

        /* renamed from: rx.internal.operators.OperatorBufferWithTime$b$b */
        /* loaded from: classes7.dex */
        public class C13543b implements Action0 {

            /* renamed from: a */
            public final /* synthetic */ List f78272a;

            public C13543b(List list) {
                this.f78272a = list;
            }

            @Override // p046rx.functions.Action0
            public void call() {
                C13541b.this.m23074b(this.f78272a);
            }
        }

        public C13541b(Subscriber subscriber, Scheduler.Worker worker) {
            this.f78266a = subscriber;
            this.f78267b = worker;
        }

        /* renamed from: b */
        public void m23074b(List list) {
            boolean z;
            synchronized (this) {
                try {
                    if (this.f78269d) {
                        return;
                    }
                    Iterator it = this.f78268c.iterator();
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
                        try {
                            this.f78266a.onNext(list);
                        } catch (Throwable th2) {
                            Exceptions.throwOrReport(th2, this);
                        }
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        /* renamed from: c */
        public void m23073c() {
            Scheduler.Worker worker = this.f78267b;
            C13542a c13542a = new C13542a();
            OperatorBufferWithTime operatorBufferWithTime = OperatorBufferWithTime.this;
            long j = operatorBufferWithTime.f78256b;
            worker.schedulePeriodically(c13542a, j, j, operatorBufferWithTime.f78257c);
        }

        /* renamed from: d */
        public void m23072d() {
            ArrayList arrayList = new ArrayList();
            synchronized (this) {
                try {
                    if (this.f78269d) {
                        return;
                    }
                    this.f78268c.add(arrayList);
                    Scheduler.Worker worker = this.f78267b;
                    C13543b c13543b = new C13543b(arrayList);
                    OperatorBufferWithTime operatorBufferWithTime = OperatorBufferWithTime.this;
                    worker.schedule(c13543b, operatorBufferWithTime.f78255a, operatorBufferWithTime.f78257c);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            try {
                synchronized (this) {
                    if (this.f78269d) {
                        return;
                    }
                    this.f78269d = true;
                    LinkedList<List> linkedList = new LinkedList(this.f78268c);
                    this.f78268c.clear();
                    for (List list : linkedList) {
                        this.f78266a.onNext(list);
                    }
                    this.f78266a.onCompleted();
                    unsubscribe();
                }
            } catch (Throwable th2) {
                Exceptions.throwOrReport(th2, this.f78266a);
            }
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            synchronized (this) {
                try {
                    if (this.f78269d) {
                        return;
                    }
                    this.f78269d = true;
                    this.f78268c.clear();
                    this.f78266a.onError(th2);
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
                    if (this.f78269d) {
                        return;
                    }
                    Iterator it = this.f78268c.iterator();
                    LinkedList<List> linkedList = null;
                    while (it.hasNext()) {
                        List list = (List) it.next();
                        list.add(obj);
                        if (list.size() == OperatorBufferWithTime.this.f78258d) {
                            it.remove();
                            if (linkedList == null) {
                                linkedList = new LinkedList();
                            }
                            linkedList.add(list);
                        }
                    }
                    if (linkedList != null) {
                        for (List list2 : linkedList) {
                            this.f78266a.onNext(list2);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public OperatorBufferWithTime(long j, long j2, TimeUnit timeUnit, int i, Scheduler scheduler) {
        this.f78255a = j;
        this.f78256b = j2;
        this.f78257c = timeUnit;
        this.f78258d = i;
        this.f78259e = scheduler;
    }

    @Override // p046rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public Subscriber<? super T> call(Subscriber<? super List<T>> subscriber) {
        Scheduler.Worker createWorker = this.f78259e.createWorker();
        SerializedSubscriber serializedSubscriber = new SerializedSubscriber(subscriber);
        if (this.f78255a == this.f78256b) {
            C13539a c13539a = new C13539a(serializedSubscriber, createWorker);
            c13539a.add(createWorker);
            subscriber.add(c13539a);
            c13539a.m23075c();
            return c13539a;
        }
        C13541b c13541b = new C13541b(serializedSubscriber, createWorker);
        c13541b.add(createWorker);
        subscriber.add(c13541b);
        c13541b.m23072d();
        c13541b.m23073c();
        return c13541b;
    }
}
