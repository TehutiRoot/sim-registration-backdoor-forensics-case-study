package p046rx.internal.operators;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import p046rx.Observable;
import p046rx.Producer;
import p046rx.Subscriber;
import p046rx.Subscription;
import p046rx.functions.Action0;
import p046rx.internal.util.atomic.SpscLinkedArrayQueue;
import p046rx.subjects.Subject;
import p046rx.subjects.UnicastSubject;
import p046rx.subscriptions.Subscriptions;

/* renamed from: rx.internal.operators.OperatorWindowWithSize */
/* loaded from: classes7.dex */
public final class OperatorWindowWithSize<T> implements Observable.Operator<Observable<T>, T> {

    /* renamed from: a */
    public final int f78828a;

    /* renamed from: b */
    public final int f78829b;

    /* renamed from: rx.internal.operators.OperatorWindowWithSize$WindowOverlap */
    /* loaded from: classes7.dex */
    public static final class WindowOverlap extends Subscriber implements Action0 {

        /* renamed from: a */
        public final Subscriber f78830a;

        /* renamed from: b */
        public final int f78831b;

        /* renamed from: c */
        public final int f78832c;

        /* renamed from: e */
        public final Subscription f78834e;

        /* renamed from: i */
        public final Queue f78838i;

        /* renamed from: j */
        public Throwable f78839j;

        /* renamed from: k */
        public volatile boolean f78840k;

        /* renamed from: l */
        public int f78841l;

        /* renamed from: m */
        public int f78842m;

        /* renamed from: d */
        public final AtomicInteger f78833d = new AtomicInteger(1);

        /* renamed from: f */
        public final ArrayDeque f78835f = new ArrayDeque();

        /* renamed from: h */
        public final AtomicInteger f78837h = new AtomicInteger();

        /* renamed from: g */
        public final AtomicLong f78836g = new AtomicLong();

        /* renamed from: rx.internal.operators.OperatorWindowWithSize$WindowOverlap$WindowOverlapProducer */
        /* loaded from: classes7.dex */
        public final class WindowOverlapProducer extends AtomicBoolean implements Producer {
            private static final long serialVersionUID = 4625807964358024108L;

            public WindowOverlapProducer() {
            }

            @Override // p046rx.Producer
            public void request(long j) {
                int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
                if (i >= 0) {
                    if (i != 0) {
                        WindowOverlap windowOverlap = WindowOverlap.this;
                        if (!get() && compareAndSet(false, true)) {
                            windowOverlap.request(BackpressureUtils.addCap(BackpressureUtils.multiplyCap(windowOverlap.f78832c, j - 1), windowOverlap.f78831b));
                        } else {
                            WindowOverlap.this.request(BackpressureUtils.multiplyCap(windowOverlap.f78832c, j));
                        }
                        BackpressureUtils.getAndAddRequest(windowOverlap.f78836g, j);
                        windowOverlap.m22956f();
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("n >= 0 required but it was " + j);
            }
        }

        public WindowOverlap(Subscriber subscriber, int i, int i2) {
            this.f78830a = subscriber;
            this.f78831b = i;
            this.f78832c = i2;
            Subscription create = Subscriptions.create(this);
            this.f78834e = create;
            add(create);
            request(0L);
            this.f78838i = new SpscLinkedArrayQueue((i + (i2 - 1)) / i2);
        }

        @Override // p046rx.functions.Action0
        public void call() {
            if (this.f78833d.decrementAndGet() == 0) {
                unsubscribe();
            }
        }

        /* renamed from: d */
        public boolean m22958d(boolean z, boolean z2, Subscriber subscriber, Queue queue) {
            if (subscriber.isUnsubscribed()) {
                queue.clear();
                return true;
            } else if (z) {
                Throwable th2 = this.f78839j;
                if (th2 != null) {
                    queue.clear();
                    subscriber.onError(th2);
                    return true;
                } else if (z2) {
                    subscriber.onCompleted();
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }

        /* renamed from: e */
        public Producer m22957e() {
            return new WindowOverlapProducer();
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
            if (r11 != 0) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
            if (m22958d(r15.f78840k, r2.isEmpty(), r1, r2) == false) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0048, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x004b, code lost:
            if (r9 == 0) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0054, code lost:
            if (r5 == Long.MAX_VALUE) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0056, code lost:
            r15.f78836g.addAndGet(-r9);
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x005c, code lost:
            r4 = r0.addAndGet(-r4);
         */
        /* renamed from: f */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void m22956f() {
            /*
                r15 = this;
                java.util.concurrent.atomic.AtomicInteger r0 = r15.f78837h
                int r1 = r0.getAndIncrement()
                if (r1 == 0) goto L9
                return
            L9:
                rx.Subscriber r1 = r15.f78830a
                java.util.Queue r2 = r15.f78838i
                r3 = 1
                r4 = 1
            Lf:
                java.util.concurrent.atomic.AtomicLong r5 = r15.f78836g
                long r5 = r5.get()
                r7 = 0
                r9 = r7
            L18:
                int r11 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
                if (r11 == 0) goto L3a
                boolean r12 = r15.f78840k
                java.lang.Object r13 = r2.poll()
                rx.subjects.Subject r13 = (p046rx.subjects.Subject) r13
                if (r13 != 0) goto L28
                r14 = 1
                goto L29
            L28:
                r14 = 0
            L29:
                boolean r12 = r15.m22958d(r12, r14, r1, r2)
                if (r12 == 0) goto L30
                return
            L30:
                if (r14 == 0) goto L33
                goto L3a
            L33:
                r1.onNext(r13)
                r11 = 1
                long r9 = r9 + r11
                goto L18
            L3a:
                if (r11 != 0) goto L49
                boolean r11 = r15.f78840k
                boolean r12 = r2.isEmpty()
                boolean r11 = r15.m22958d(r11, r12, r1, r2)
                if (r11 == 0) goto L49
                return
            L49:
                int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
                if (r11 == 0) goto L5c
                r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r11 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r11 == 0) goto L5c
                java.util.concurrent.atomic.AtomicLong r5 = r15.f78836g
                long r6 = -r9
                r5.addAndGet(r6)
            L5c:
                int r4 = -r4
                int r4 = r0.addAndGet(r4)
                if (r4 != 0) goto Lf
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p046rx.internal.operators.OperatorWindowWithSize.WindowOverlap.m22956f():void");
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            Iterator it = this.f78835f.iterator();
            while (it.hasNext()) {
                ((Subject) it.next()).onCompleted();
            }
            this.f78835f.clear();
            this.f78840k = true;
            m22956f();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            Iterator it = this.f78835f.iterator();
            while (it.hasNext()) {
                ((Subject) it.next()).onError(th2);
            }
            this.f78835f.clear();
            this.f78839j = th2;
            this.f78840k = true;
            m22956f();
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            int i = this.f78841l;
            ArrayDeque arrayDeque = this.f78835f;
            if (i == 0 && !this.f78830a.isUnsubscribed()) {
                this.f78833d.getAndIncrement();
                UnicastSubject create = UnicastSubject.create(16, this);
                arrayDeque.offer(create);
                this.f78838i.offer(create);
                m22956f();
            }
            Iterator it = this.f78835f.iterator();
            while (it.hasNext()) {
                ((Subject) it.next()).onNext(obj);
            }
            int i2 = this.f78842m + 1;
            if (i2 == this.f78831b) {
                this.f78842m = i2 - this.f78832c;
                Subject subject = (Subject) arrayDeque.poll();
                if (subject != null) {
                    subject.onCompleted();
                }
            } else {
                this.f78842m = i2;
            }
            int i3 = i + 1;
            if (i3 == this.f78832c) {
                this.f78841l = 0;
            } else {
                this.f78841l = i3;
            }
        }
    }

    /* renamed from: rx.internal.operators.OperatorWindowWithSize$WindowSkip */
    /* loaded from: classes7.dex */
    public static final class WindowSkip extends Subscriber implements Action0 {

        /* renamed from: a */
        public final Subscriber f78843a;

        /* renamed from: b */
        public final int f78844b;

        /* renamed from: c */
        public final int f78845c;

        /* renamed from: d */
        public final AtomicInteger f78846d = new AtomicInteger(1);

        /* renamed from: e */
        public final Subscription f78847e;

        /* renamed from: f */
        public int f78848f;

        /* renamed from: g */
        public Subject f78849g;

        /* renamed from: rx.internal.operators.OperatorWindowWithSize$WindowSkip$WindowSkipProducer */
        /* loaded from: classes7.dex */
        public final class WindowSkipProducer extends AtomicBoolean implements Producer {
            private static final long serialVersionUID = 4625807964358024108L;

            public WindowSkipProducer() {
            }

            @Override // p046rx.Producer
            public void request(long j) {
                int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
                if (i >= 0) {
                    if (i != 0) {
                        WindowSkip windowSkip = WindowSkip.this;
                        if (get() || !compareAndSet(false, true)) {
                            windowSkip.request(BackpressureUtils.multiplyCap(j, windowSkip.f78845c));
                            return;
                        } else {
                            windowSkip.request(BackpressureUtils.addCap(BackpressureUtils.multiplyCap(j, windowSkip.f78844b), BackpressureUtils.multiplyCap(windowSkip.f78845c - windowSkip.f78844b, j - 1)));
                            return;
                        }
                    }
                    return;
                }
                throw new IllegalArgumentException("n >= 0 required but it was " + j);
            }
        }

        public WindowSkip(Subscriber subscriber, int i, int i2) {
            this.f78843a = subscriber;
            this.f78844b = i;
            this.f78845c = i2;
            Subscription create = Subscriptions.create(this);
            this.f78847e = create;
            add(create);
            request(0L);
        }

        @Override // p046rx.functions.Action0
        public void call() {
            if (this.f78846d.decrementAndGet() == 0) {
                unsubscribe();
            }
        }

        /* renamed from: d */
        public Producer m22953d() {
            return new WindowSkipProducer();
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            Subject subject = this.f78849g;
            if (subject != null) {
                this.f78849g = null;
                subject.onCompleted();
            }
            this.f78843a.onCompleted();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            Subject subject = this.f78849g;
            if (subject != null) {
                this.f78849g = null;
                subject.onError(th2);
            }
            this.f78843a.onError(th2);
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            int i = this.f78848f;
            Subject subject = this.f78849g;
            if (i == 0) {
                this.f78846d.getAndIncrement();
                subject = UnicastSubject.create(this.f78844b, this);
                this.f78849g = subject;
                this.f78843a.onNext(subject);
            }
            int i2 = i + 1;
            if (subject != null) {
                subject.onNext(obj);
            }
            if (i2 == this.f78844b) {
                this.f78848f = i2;
                this.f78849g = null;
                subject.onCompleted();
            } else if (i2 == this.f78845c) {
                this.f78848f = 0;
            } else {
                this.f78848f = i2;
            }
        }
    }

    /* renamed from: rx.internal.operators.OperatorWindowWithSize$a */
    /* loaded from: classes7.dex */
    public static final class C13684a extends Subscriber implements Action0 {

        /* renamed from: a */
        public final Subscriber f78850a;

        /* renamed from: b */
        public final int f78851b;

        /* renamed from: c */
        public final AtomicInteger f78852c = new AtomicInteger(1);

        /* renamed from: d */
        public final Subscription f78853d;

        /* renamed from: e */
        public int f78854e;

        /* renamed from: f */
        public Subject f78855f;

        /* renamed from: rx.internal.operators.OperatorWindowWithSize$a$a */
        /* loaded from: classes7.dex */
        public class C13685a implements Producer {
            public C13685a() {
            }

            @Override // p046rx.Producer
            public void request(long j) {
                int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
                if (i >= 0) {
                    if (i != 0) {
                        C13684a.this.request(BackpressureUtils.multiplyCap(C13684a.this.f78851b, j));
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("n >= 0 required but it was " + j);
            }
        }

        public C13684a(Subscriber subscriber, int i) {
            this.f78850a = subscriber;
            this.f78851b = i;
            Subscription create = Subscriptions.create(this);
            this.f78853d = create;
            add(create);
            request(0L);
        }

        /* renamed from: c */
        public Producer m22951c() {
            return new C13685a();
        }

        @Override // p046rx.functions.Action0
        public void call() {
            if (this.f78852c.decrementAndGet() == 0) {
                unsubscribe();
            }
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            Subject subject = this.f78855f;
            if (subject != null) {
                this.f78855f = null;
                subject.onCompleted();
            }
            this.f78850a.onCompleted();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            Subject subject = this.f78855f;
            if (subject != null) {
                this.f78855f = null;
                subject.onError(th2);
            }
            this.f78850a.onError(th2);
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            int i = this.f78854e;
            Subject subject = this.f78855f;
            if (i == 0) {
                this.f78852c.getAndIncrement();
                subject = UnicastSubject.create(this.f78851b, this);
                this.f78855f = subject;
                this.f78850a.onNext(subject);
            }
            int i2 = i + 1;
            subject.onNext(obj);
            if (i2 == this.f78851b) {
                this.f78854e = 0;
                this.f78855f = null;
                subject.onCompleted();
                return;
            }
            this.f78854e = i2;
        }
    }

    public OperatorWindowWithSize(int i, int i2) {
        this.f78828a = i;
        this.f78829b = i2;
    }

    @Override // p046rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public Subscriber<? super T> call(Subscriber<? super Observable<T>> subscriber) {
        int i = this.f78829b;
        int i2 = this.f78828a;
        if (i == i2) {
            C13684a c13684a = new C13684a(subscriber, i2);
            subscriber.add(c13684a.f78853d);
            subscriber.setProducer(c13684a.m22951c());
            return c13684a;
        } else if (i > i2) {
            WindowSkip windowSkip = new WindowSkip(subscriber, i2, i);
            subscriber.add(windowSkip.f78847e);
            subscriber.setProducer(windowSkip.m22953d());
            return windowSkip;
        } else {
            WindowOverlap windowOverlap = new WindowOverlap(subscriber, i2, i);
            subscriber.add(windowOverlap.f78834e);
            subscriber.setProducer(windowOverlap.m22957e());
            return windowOverlap;
        }
    }
}
