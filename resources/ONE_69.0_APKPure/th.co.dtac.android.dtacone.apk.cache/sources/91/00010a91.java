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
    public final long f78461a;

    /* renamed from: b */
    public final long f78462b;

    /* renamed from: c */
    public final TimeUnit f78463c;

    /* renamed from: d */
    public final int f78464d;

    /* renamed from: e */
    public final Scheduler f78465e;

    /* renamed from: rx.internal.operators.OperatorBufferWithTime$a */
    /* loaded from: classes7.dex */
    public final class C13540a extends Subscriber {

        /* renamed from: a */
        public final Subscriber f78466a;

        /* renamed from: b */
        public final Scheduler.Worker f78467b;

        /* renamed from: c */
        public List f78468c = new ArrayList();

        /* renamed from: d */
        public boolean f78469d;

        /* renamed from: rx.internal.operators.OperatorBufferWithTime$a$a */
        /* loaded from: classes7.dex */
        public class C13541a implements Action0 {
            public C13541a() {
            }

            @Override // p046rx.functions.Action0
            public void call() {
                C13540a.this.m23264b();
            }
        }

        public C13540a(Subscriber subscriber, Scheduler.Worker worker) {
            this.f78466a = subscriber;
            this.f78467b = worker;
        }

        /* renamed from: b */
        public void m23264b() {
            synchronized (this) {
                try {
                    if (this.f78469d) {
                        return;
                    }
                    List list = this.f78468c;
                    this.f78468c = new ArrayList();
                    try {
                        this.f78466a.onNext(list);
                    } catch (Throwable th2) {
                        Exceptions.throwOrReport(th2, this);
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        /* renamed from: c */
        public void m23263c() {
            Scheduler.Worker worker = this.f78467b;
            C13541a c13541a = new C13541a();
            OperatorBufferWithTime operatorBufferWithTime = OperatorBufferWithTime.this;
            long j = operatorBufferWithTime.f78461a;
            worker.schedulePeriodically(c13541a, j, j, operatorBufferWithTime.f78463c);
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            try {
                this.f78467b.unsubscribe();
                synchronized (this) {
                    if (this.f78469d) {
                        return;
                    }
                    this.f78469d = true;
                    List list = this.f78468c;
                    this.f78468c = null;
                    this.f78466a.onNext(list);
                    this.f78466a.onCompleted();
                    unsubscribe();
                }
            } catch (Throwable th2) {
                Exceptions.throwOrReport(th2, this.f78466a);
            }
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            synchronized (this) {
                try {
                    if (this.f78469d) {
                        return;
                    }
                    this.f78469d = true;
                    this.f78468c = null;
                    this.f78466a.onError(th2);
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
                    if (this.f78469d) {
                        return;
                    }
                    this.f78468c.add(obj);
                    if (this.f78468c.size() == OperatorBufferWithTime.this.f78464d) {
                        list = this.f78468c;
                        this.f78468c = new ArrayList();
                    } else {
                        list = null;
                    }
                    if (list != null) {
                        this.f78466a.onNext(list);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* renamed from: rx.internal.operators.OperatorBufferWithTime$b */
    /* loaded from: classes7.dex */
    public final class C13542b extends Subscriber {

        /* renamed from: a */
        public final Subscriber f78472a;

        /* renamed from: b */
        public final Scheduler.Worker f78473b;

        /* renamed from: c */
        public final List f78474c = new LinkedList();

        /* renamed from: d */
        public boolean f78475d;

        /* renamed from: rx.internal.operators.OperatorBufferWithTime$b$a */
        /* loaded from: classes7.dex */
        public class C13543a implements Action0 {
            public C13543a() {
            }

            @Override // p046rx.functions.Action0
            public void call() {
                C13542b.this.m23260d();
            }
        }

        /* renamed from: rx.internal.operators.OperatorBufferWithTime$b$b */
        /* loaded from: classes7.dex */
        public class C13544b implements Action0 {

            /* renamed from: a */
            public final /* synthetic */ List f78478a;

            public C13544b(List list) {
                this.f78478a = list;
            }

            @Override // p046rx.functions.Action0
            public void call() {
                C13542b.this.m23262b(this.f78478a);
            }
        }

        public C13542b(Subscriber subscriber, Scheduler.Worker worker) {
            this.f78472a = subscriber;
            this.f78473b = worker;
        }

        /* renamed from: b */
        public void m23262b(List list) {
            boolean z;
            synchronized (this) {
                try {
                    if (this.f78475d) {
                        return;
                    }
                    Iterator it = this.f78474c.iterator();
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
                            this.f78472a.onNext(list);
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
        public void m23261c() {
            Scheduler.Worker worker = this.f78473b;
            C13543a c13543a = new C13543a();
            OperatorBufferWithTime operatorBufferWithTime = OperatorBufferWithTime.this;
            long j = operatorBufferWithTime.f78462b;
            worker.schedulePeriodically(c13543a, j, j, operatorBufferWithTime.f78463c);
        }

        /* renamed from: d */
        public void m23260d() {
            ArrayList arrayList = new ArrayList();
            synchronized (this) {
                try {
                    if (this.f78475d) {
                        return;
                    }
                    this.f78474c.add(arrayList);
                    Scheduler.Worker worker = this.f78473b;
                    C13544b c13544b = new C13544b(arrayList);
                    OperatorBufferWithTime operatorBufferWithTime = OperatorBufferWithTime.this;
                    worker.schedule(c13544b, operatorBufferWithTime.f78461a, operatorBufferWithTime.f78463c);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            try {
                synchronized (this) {
                    if (this.f78475d) {
                        return;
                    }
                    this.f78475d = true;
                    LinkedList<List> linkedList = new LinkedList(this.f78474c);
                    this.f78474c.clear();
                    for (List list : linkedList) {
                        this.f78472a.onNext(list);
                    }
                    this.f78472a.onCompleted();
                    unsubscribe();
                }
            } catch (Throwable th2) {
                Exceptions.throwOrReport(th2, this.f78472a);
            }
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            synchronized (this) {
                try {
                    if (this.f78475d) {
                        return;
                    }
                    this.f78475d = true;
                    this.f78474c.clear();
                    this.f78472a.onError(th2);
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
                    if (this.f78475d) {
                        return;
                    }
                    Iterator it = this.f78474c.iterator();
                    LinkedList<List> linkedList = null;
                    while (it.hasNext()) {
                        List list = (List) it.next();
                        list.add(obj);
                        if (list.size() == OperatorBufferWithTime.this.f78464d) {
                            it.remove();
                            if (linkedList == null) {
                                linkedList = new LinkedList();
                            }
                            linkedList.add(list);
                        }
                    }
                    if (linkedList != null) {
                        for (List list2 : linkedList) {
                            this.f78472a.onNext(list2);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public OperatorBufferWithTime(long j, long j2, TimeUnit timeUnit, int i, Scheduler scheduler) {
        this.f78461a = j;
        this.f78462b = j2;
        this.f78463c = timeUnit;
        this.f78464d = i;
        this.f78465e = scheduler;
    }

    @Override // p046rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public Subscriber<? super T> call(Subscriber<? super List<T>> subscriber) {
        Scheduler.Worker createWorker = this.f78465e.createWorker();
        SerializedSubscriber serializedSubscriber = new SerializedSubscriber(subscriber);
        if (this.f78461a == this.f78462b) {
            C13540a c13540a = new C13540a(serializedSubscriber, createWorker);
            c13540a.add(createWorker);
            subscriber.add(c13540a);
            c13540a.m23263c();
            return c13540a;
        }
        C13542b c13542b = new C13542b(serializedSubscriber, createWorker);
        c13542b.add(createWorker);
        subscriber.add(c13542b);
        c13542b.m23260d();
        c13542b.m23261c();
        return c13542b;
    }
}