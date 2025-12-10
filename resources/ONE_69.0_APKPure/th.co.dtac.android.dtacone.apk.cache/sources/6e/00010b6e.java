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
    public final int f79034a;

    /* renamed from: b */
    public final int f79035b;

    /* renamed from: rx.internal.operators.OperatorWindowWithSize$WindowOverlap */
    /* loaded from: classes7.dex */
    public static final class WindowOverlap extends Subscriber implements Action0 {

        /* renamed from: a */
        public final Subscriber f79036a;

        /* renamed from: b */
        public final int f79037b;

        /* renamed from: c */
        public final int f79038c;

        /* renamed from: e */
        public final Subscription f79040e;

        /* renamed from: i */
        public final Queue f79044i;

        /* renamed from: j */
        public Throwable f79045j;

        /* renamed from: k */
        public volatile boolean f79046k;

        /* renamed from: l */
        public int f79047l;

        /* renamed from: m */
        public int f79048m;

        /* renamed from: d */
        public final AtomicInteger f79039d = new AtomicInteger(1);

        /* renamed from: f */
        public final ArrayDeque f79041f = new ArrayDeque();

        /* renamed from: h */
        public final AtomicInteger f79043h = new AtomicInteger();

        /* renamed from: g */
        public final AtomicLong f79042g = new AtomicLong();

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
                            windowOverlap.request(BackpressureUtils.addCap(BackpressureUtils.multiplyCap(windowOverlap.f79038c, j - 1), windowOverlap.f79037b));
                        } else {
                            WindowOverlap.this.request(BackpressureUtils.multiplyCap(windowOverlap.f79038c, j));
                        }
                        BackpressureUtils.getAndAddRequest(windowOverlap.f79042g, j);
                        windowOverlap.m23144f();
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("n >= 0 required but it was " + j);
            }
        }

        public WindowOverlap(Subscriber subscriber, int i, int i2) {
            this.f79036a = subscriber;
            this.f79037b = i;
            this.f79038c = i2;
            Subscription create = Subscriptions.create(this);
            this.f79040e = create;
            add(create);
            request(0L);
            this.f79044i = new SpscLinkedArrayQueue((i + (i2 - 1)) / i2);
        }

        @Override // p046rx.functions.Action0
        public void call() {
            if (this.f79039d.decrementAndGet() == 0) {
                unsubscribe();
            }
        }

        /* renamed from: d */
        public boolean m23146d(boolean z, boolean z2, Subscriber subscriber, Queue queue) {
            if (subscriber.isUnsubscribed()) {
                queue.clear();
                return true;
            } else if (z) {
                Throwable th2 = this.f79045j;
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
        public Producer m23145e() {
            return new WindowOverlapProducer();
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
            if (r11 != 0) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
            if (m23146d(r15.f79046k, r2.isEmpty(), r1, r2) == false) goto L22;
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
            r15.f79042g.addAndGet(-r9);
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x005c, code lost:
            r4 = r0.addAndGet(-r4);
         */
        /* renamed from: f */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void m23144f() {
            /*
                r15 = this;
                java.util.concurrent.atomic.AtomicInteger r0 = r15.f79043h
                int r1 = r0.getAndIncrement()
                if (r1 == 0) goto L9
                return
            L9:
                rx.Subscriber r1 = r15.f79036a
                java.util.Queue r2 = r15.f79044i
                r3 = 1
                r4 = 1
            Lf:
                java.util.concurrent.atomic.AtomicLong r5 = r15.f79042g
                long r5 = r5.get()
                r7 = 0
                r9 = r7
            L18:
                int r11 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
                if (r11 == 0) goto L3a
                boolean r12 = r15.f79046k
                java.lang.Object r13 = r2.poll()
                rx.subjects.Subject r13 = (p046rx.subjects.Subject) r13
                if (r13 != 0) goto L28
                r14 = 1
                goto L29
            L28:
                r14 = 0
            L29:
                boolean r12 = r15.m23146d(r12, r14, r1, r2)
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
                boolean r11 = r15.f79046k
                boolean r12 = r2.isEmpty()
                boolean r11 = r15.m23146d(r11, r12, r1, r2)
                if (r11 == 0) goto L49
                return
            L49:
                int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
                if (r11 == 0) goto L5c
                r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r11 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r11 == 0) goto L5c
                java.util.concurrent.atomic.AtomicLong r5 = r15.f79042g
                long r6 = -r9
                r5.addAndGet(r6)
            L5c:
                int r4 = -r4
                int r4 = r0.addAndGet(r4)
                if (r4 != 0) goto Lf
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p046rx.internal.operators.OperatorWindowWithSize.WindowOverlap.m23144f():void");
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            Iterator it = this.f79041f.iterator();
            while (it.hasNext()) {
                ((Subject) it.next()).onCompleted();
            }
            this.f79041f.clear();
            this.f79046k = true;
            m23144f();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            Iterator it = this.f79041f.iterator();
            while (it.hasNext()) {
                ((Subject) it.next()).onError(th2);
            }
            this.f79041f.clear();
            this.f79045j = th2;
            this.f79046k = true;
            m23144f();
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            int i = this.f79047l;
            ArrayDeque arrayDeque = this.f79041f;
            if (i == 0 && !this.f79036a.isUnsubscribed()) {
                this.f79039d.getAndIncrement();
                UnicastSubject create = UnicastSubject.create(16, this);
                arrayDeque.offer(create);
                this.f79044i.offer(create);
                m23144f();
            }
            Iterator it = this.f79041f.iterator();
            while (it.hasNext()) {
                ((Subject) it.next()).onNext(obj);
            }
            int i2 = this.f79048m + 1;
            if (i2 == this.f79037b) {
                this.f79048m = i2 - this.f79038c;
                Subject subject = (Subject) arrayDeque.poll();
                if (subject != null) {
                    subject.onCompleted();
                }
            } else {
                this.f79048m = i2;
            }
            int i3 = i + 1;
            if (i3 == this.f79038c) {
                this.f79047l = 0;
            } else {
                this.f79047l = i3;
            }
        }
    }

    /* renamed from: rx.internal.operators.OperatorWindowWithSize$WindowSkip */
    /* loaded from: classes7.dex */
    public static final class WindowSkip extends Subscriber implements Action0 {

        /* renamed from: a */
        public final Subscriber f79049a;

        /* renamed from: b */
        public final int f79050b;

        /* renamed from: c */
        public final int f79051c;

        /* renamed from: d */
        public final AtomicInteger f79052d = new AtomicInteger(1);

        /* renamed from: e */
        public final Subscription f79053e;

        /* renamed from: f */
        public int f79054f;

        /* renamed from: g */
        public Subject f79055g;

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
                            windowSkip.request(BackpressureUtils.multiplyCap(j, windowSkip.f79051c));
                            return;
                        } else {
                            windowSkip.request(BackpressureUtils.addCap(BackpressureUtils.multiplyCap(j, windowSkip.f79050b), BackpressureUtils.multiplyCap(windowSkip.f79051c - windowSkip.f79050b, j - 1)));
                            return;
                        }
                    }
                    return;
                }
                throw new IllegalArgumentException("n >= 0 required but it was " + j);
            }
        }

        public WindowSkip(Subscriber subscriber, int i, int i2) {
            this.f79049a = subscriber;
            this.f79050b = i;
            this.f79051c = i2;
            Subscription create = Subscriptions.create(this);
            this.f79053e = create;
            add(create);
            request(0L);
        }

        @Override // p046rx.functions.Action0
        public void call() {
            if (this.f79052d.decrementAndGet() == 0) {
                unsubscribe();
            }
        }

        /* renamed from: d */
        public Producer m23141d() {
            return new WindowSkipProducer();
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            Subject subject = this.f79055g;
            if (subject != null) {
                this.f79055g = null;
                subject.onCompleted();
            }
            this.f79049a.onCompleted();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            Subject subject = this.f79055g;
            if (subject != null) {
                this.f79055g = null;
                subject.onError(th2);
            }
            this.f79049a.onError(th2);
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            int i = this.f79054f;
            Subject subject = this.f79055g;
            if (i == 0) {
                this.f79052d.getAndIncrement();
                subject = UnicastSubject.create(this.f79050b, this);
                this.f79055g = subject;
                this.f79049a.onNext(subject);
            }
            int i2 = i + 1;
            if (subject != null) {
                subject.onNext(obj);
            }
            if (i2 == this.f79050b) {
                this.f79054f = i2;
                this.f79055g = null;
                subject.onCompleted();
            } else if (i2 == this.f79051c) {
                this.f79054f = 0;
            } else {
                this.f79054f = i2;
            }
        }
    }

    /* renamed from: rx.internal.operators.OperatorWindowWithSize$a */
    /* loaded from: classes7.dex */
    public static final class C13685a extends Subscriber implements Action0 {

        /* renamed from: a */
        public final Subscriber f79056a;

        /* renamed from: b */
        public final int f79057b;

        /* renamed from: c */
        public final AtomicInteger f79058c = new AtomicInteger(1);

        /* renamed from: d */
        public final Subscription f79059d;

        /* renamed from: e */
        public int f79060e;

        /* renamed from: f */
        public Subject f79061f;

        /* renamed from: rx.internal.operators.OperatorWindowWithSize$a$a */
        /* loaded from: classes7.dex */
        public class C13686a implements Producer {
            public C13686a() {
            }

            @Override // p046rx.Producer
            public void request(long j) {
                int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
                if (i >= 0) {
                    if (i != 0) {
                        C13685a.this.request(BackpressureUtils.multiplyCap(C13685a.this.f79057b, j));
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("n >= 0 required but it was " + j);
            }
        }

        public C13685a(Subscriber subscriber, int i) {
            this.f79056a = subscriber;
            this.f79057b = i;
            Subscription create = Subscriptions.create(this);
            this.f79059d = create;
            add(create);
            request(0L);
        }

        /* renamed from: c */
        public Producer m23139c() {
            return new C13686a();
        }

        @Override // p046rx.functions.Action0
        public void call() {
            if (this.f79058c.decrementAndGet() == 0) {
                unsubscribe();
            }
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            Subject subject = this.f79061f;
            if (subject != null) {
                this.f79061f = null;
                subject.onCompleted();
            }
            this.f79056a.onCompleted();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            Subject subject = this.f79061f;
            if (subject != null) {
                this.f79061f = null;
                subject.onError(th2);
            }
            this.f79056a.onError(th2);
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            int i = this.f79060e;
            Subject subject = this.f79061f;
            if (i == 0) {
                this.f79058c.getAndIncrement();
                subject = UnicastSubject.create(this.f79057b, this);
                this.f79061f = subject;
                this.f79056a.onNext(subject);
            }
            int i2 = i + 1;
            subject.onNext(obj);
            if (i2 == this.f79057b) {
                this.f79060e = 0;
                this.f79061f = null;
                subject.onCompleted();
                return;
            }
            this.f79060e = i2;
        }
    }

    public OperatorWindowWithSize(int i, int i2) {
        this.f79034a = i;
        this.f79035b = i2;
    }

    @Override // p046rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public Subscriber<? super T> call(Subscriber<? super Observable<T>> subscriber) {
        int i = this.f79035b;
        int i2 = this.f79034a;
        if (i == i2) {
            C13685a c13685a = new C13685a(subscriber, i2);
            subscriber.add(c13685a.f79059d);
            subscriber.setProducer(c13685a.m23139c());
            return c13685a;
        } else if (i > i2) {
            WindowSkip windowSkip = new WindowSkip(subscriber, i2, i);
            subscriber.add(windowSkip.f79053e);
            subscriber.setProducer(windowSkip.m23141d());
            return windowSkip;
        } else {
            WindowOverlap windowOverlap = new WindowOverlap(subscriber, i2, i);
            subscriber.add(windowOverlap.f79040e);
            subscriber.setProducer(windowOverlap.m23145e());
            return windowOverlap;
        }
    }
}