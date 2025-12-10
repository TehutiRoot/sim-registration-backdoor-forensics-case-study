package p046rx.internal.operators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p046rx.Observable;
import p046rx.Producer;
import p046rx.Subscriber;
import p046rx.Subscription;
import p046rx.exceptions.CompositeException;
import p046rx.functions.FuncN;
import p046rx.internal.util.RxRingBuffer;
import p046rx.internal.util.atomic.SpscLinkedArrayQueue;
import p046rx.plugins.RxJavaHooks;

/* renamed from: rx.internal.operators.OnSubscribeCombineLatest */
/* loaded from: classes7.dex */
public final class OnSubscribeCombineLatest<T, R> implements Observable.OnSubscribe<R> {

    /* renamed from: a */
    public final Observable[] f77878a;

    /* renamed from: b */
    public final Iterable f77879b;

    /* renamed from: c */
    public final FuncN f77880c;

    /* renamed from: d */
    public final int f77881d;

    /* renamed from: e */
    public final boolean f77882e;

    /* renamed from: rx.internal.operators.OnSubscribeCombineLatest$LatestCoordinator */
    /* loaded from: classes7.dex */
    public static final class LatestCoordinator<T, R> extends AtomicInteger implements Producer, Subscription {
        static final Object MISSING = new Object();
        private static final long serialVersionUID = 8567835998786448817L;
        int active;
        final Subscriber<? super R> actual;
        final int bufferSize;
        volatile boolean cancelled;
        final FuncN<? extends R> combiner;
        int complete;
        final boolean delayError;
        volatile boolean done;
        final AtomicReference<Throwable> error;
        final Object[] latest;
        final SpscLinkedArrayQueue<Object> queue;
        final AtomicLong requested;
        final C13462a[] subscribers;

        public LatestCoordinator(Subscriber<? super R> subscriber, FuncN<? extends R> funcN, int i, int i2, boolean z) {
            this.actual = subscriber;
            this.combiner = funcN;
            this.bufferSize = i2;
            this.delayError = z;
            Object[] objArr = new Object[i];
            this.latest = objArr;
            Arrays.fill(objArr, MISSING);
            this.subscribers = new C13462a[i];
            this.queue = new SpscLinkedArrayQueue<>(i2);
            this.requested = new AtomicLong();
            this.error = new AtomicReference<>();
        }

        public void cancel(Queue<?> queue) {
            queue.clear();
            for (C13462a c13462a : this.subscribers) {
                c13462a.unsubscribe();
            }
        }

        public boolean checkTerminated(boolean z, boolean z2, Subscriber<?> subscriber, Queue<?> queue, boolean z3) {
            if (this.cancelled) {
                cancel(queue);
                return true;
            } else if (z) {
                if (z3) {
                    if (z2) {
                        Throwable th2 = this.error.get();
                        if (th2 != null) {
                            subscriber.onError(th2);
                        } else {
                            subscriber.onCompleted();
                        }
                        return true;
                    }
                    return false;
                }
                Throwable th3 = this.error.get();
                if (th3 != null) {
                    cancel(queue);
                    subscriber.onError(th3);
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

        public void combine(Object obj, int i) {
            boolean z;
            C13462a c13462a = this.subscribers[i];
            synchronized (this) {
                try {
                    Object[] objArr = this.latest;
                    int length = objArr.length;
                    Object obj2 = objArr[i];
                    int i2 = this.active;
                    Object obj3 = MISSING;
                    if (obj2 == obj3) {
                        i2++;
                        this.active = i2;
                    }
                    int i3 = this.complete;
                    if (obj == null) {
                        i3++;
                        this.complete = i3;
                    } else {
                        objArr[i] = NotificationLite.getValue(obj);
                    }
                    if (i2 == length) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (i3 != length && (obj != null || obj2 != obj3)) {
                        if (obj != null && z) {
                            this.queue.offer(c13462a, this.latest.clone());
                        } else if (obj == null && this.error.get() != null && (obj2 == obj3 || !this.delayError)) {
                            this.done = true;
                        }
                    }
                    this.done = true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (!z && obj != null) {
                c13462a.requestMore(1L);
            } else {
                drain();
            }
        }

        public void drain() {
            long j;
            boolean z;
            if (getAndIncrement() != 0) {
                return;
            }
            SpscLinkedArrayQueue<Object> spscLinkedArrayQueue = this.queue;
            Subscriber<? super R> subscriber = this.actual;
            boolean z2 = this.delayError;
            AtomicLong atomicLong = this.requested;
            int i = 1;
            while (!checkTerminated(this.done, spscLinkedArrayQueue.isEmpty(), subscriber, spscLinkedArrayQueue, z2)) {
                long j2 = atomicLong.get();
                long j3 = 0;
                while (true) {
                    if (j3 != j2) {
                        boolean z3 = this.done;
                        C13462a c13462a = (C13462a) spscLinkedArrayQueue.peek();
                        if (c13462a == null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        long j4 = j3;
                        if (checkTerminated(z3, z, subscriber, spscLinkedArrayQueue, z2)) {
                            return;
                        }
                        if (z) {
                            j = j4;
                            break;
                        }
                        spscLinkedArrayQueue.poll();
                        Object[] objArr = (Object[]) spscLinkedArrayQueue.poll();
                        if (objArr == null) {
                            this.cancelled = true;
                            cancel(spscLinkedArrayQueue);
                            subscriber.onError(new IllegalStateException("Broken queue?! Sender received but not the array."));
                            return;
                        }
                        try {
                            subscriber.onNext((R) this.combiner.call(objArr));
                            c13462a.requestMore(1L);
                            j3 = j4 + 1;
                        } catch (Throwable th2) {
                            this.cancelled = true;
                            cancel(spscLinkedArrayQueue);
                            subscriber.onError(th2);
                            return;
                        }
                    } else {
                        j = j3;
                        break;
                    }
                }
                if (j != 0 && j2 != Long.MAX_VALUE) {
                    BackpressureUtils.produced(atomicLong, j);
                }
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
            }
        }

        @Override // p046rx.Subscription
        public boolean isUnsubscribed() {
            return this.cancelled;
        }

        public void onError(Throwable th2) {
            Throwable th3;
            Throwable th4;
            AtomicReference<Throwable> atomicReference = this.error;
            do {
                th3 = atomicReference.get();
                if (th3 != null) {
                    if (th3 instanceof CompositeException) {
                        ArrayList arrayList = new ArrayList(((CompositeException) th3).getExceptions());
                        arrayList.add(th2);
                        th4 = new CompositeException(arrayList);
                    } else {
                        th4 = new CompositeException(Arrays.asList(th3, th2));
                    }
                } else {
                    th4 = th2;
                }
            } while (!AbstractC17300An1.m69050a(atomicReference, th3, th4));
        }

        @Override // p046rx.Producer
        public void request(long j) {
            int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            if (i >= 0) {
                if (i != 0) {
                    BackpressureUtils.getAndAddRequest(this.requested, j);
                    drain();
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("n >= required but it was " + j);
        }

        public void subscribe(Observable<? extends T>[] observableArr) {
            C13462a[] c13462aArr = this.subscribers;
            int length = c13462aArr.length;
            for (int i = 0; i < length; i++) {
                c13462aArr[i] = new C13462a(this, i);
            }
            lazySet(0);
            this.actual.add(this);
            this.actual.setProducer(this);
            for (int i2 = 0; i2 < length && !this.cancelled; i2++) {
                observableArr[i2].subscribe((Subscriber<? super Object>) c13462aArr[i2]);
            }
        }

        @Override // p046rx.Subscription
        public void unsubscribe() {
            if (!this.cancelled) {
                this.cancelled = true;
                if (getAndIncrement() == 0) {
                    cancel(this.queue);
                }
            }
        }
    }

    /* renamed from: rx.internal.operators.OnSubscribeCombineLatest$a */
    /* loaded from: classes7.dex */
    public static final class C13462a extends Subscriber {

        /* renamed from: a */
        public final LatestCoordinator f77883a;

        /* renamed from: b */
        public final int f77884b;

        /* renamed from: c */
        public boolean f77885c;

        public C13462a(LatestCoordinator latestCoordinator, int i) {
            this.f77883a = latestCoordinator;
            this.f77884b = i;
            request(latestCoordinator.bufferSize);
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            if (this.f77885c) {
                return;
            }
            this.f77885c = true;
            this.f77883a.combine(null, this.f77884b);
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            if (this.f77885c) {
                RxJavaHooks.onError(th2);
                return;
            }
            this.f77883a.onError(th2);
            this.f77885c = true;
            this.f77883a.combine(null, this.f77884b);
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            if (this.f77885c) {
                return;
            }
            this.f77883a.combine(NotificationLite.next(obj), this.f77884b);
        }

        public void requestMore(long j) {
            request(j);
        }
    }

    public OnSubscribeCombineLatest(Iterable<? extends Observable<? extends T>> iterable, FuncN<? extends R> funcN) {
        this(null, iterable, funcN, RxRingBuffer.SIZE, false);
    }

    @Override // p046rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((Subscriber) ((Subscriber) obj));
    }

    public OnSubscribeCombineLatest(Observable<? extends T>[] observableArr, Iterable<? extends Observable<? extends T>> iterable, FuncN<? extends R> funcN, int i, boolean z) {
        this.f77878a = observableArr;
        this.f77879b = iterable;
        this.f77880c = funcN;
        this.f77881d = i;
        this.f77882e = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void call(p046rx.Subscriber<? super R> r9) {
        /*
            r8 = this;
            rx.Observable[] r0 = r8.f77878a
            if (r0 != 0) goto L46
            java.lang.Iterable r0 = r8.f77879b
            boolean r1 = r0 instanceof java.util.List
            if (r1 == 0) goto L1b
            java.util.List r0 = (java.util.List) r0
            int r1 = r0.size()
            rx.Observable[] r1 = new p046rx.Observable[r1]
            java.lang.Object[] r0 = r0.toArray(r1)
            rx.Observable[] r0 = (p046rx.Observable[]) r0
            int r1 = r0.length
        L19:
            r4 = r1
            goto L48
        L1b:
            r1 = 8
            rx.Observable[] r1 = new p046rx.Observable[r1]
            java.util.Iterator r0 = r0.iterator()
            r2 = 0
            r3 = 0
        L25:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L43
            java.lang.Object r4 = r0.next()
            rx.Observable r4 = (p046rx.Observable) r4
            int r5 = r1.length
            if (r3 != r5) goto L3d
            int r5 = r3 >> 2
            int r5 = r5 + r3
            rx.Observable[] r5 = new p046rx.Observable[r5]
            java.lang.System.arraycopy(r1, r2, r5, r2, r3)
            r1 = r5
        L3d:
            int r5 = r3 + 1
            r1[r3] = r4
            r3 = r5
            goto L25
        L43:
            r0 = r1
            r4 = r3
            goto L48
        L46:
            int r1 = r0.length
            goto L19
        L48:
            if (r4 != 0) goto L4e
            r9.onCompleted()
            return
        L4e:
            rx.internal.operators.OnSubscribeCombineLatest$LatestCoordinator r7 = new rx.internal.operators.OnSubscribeCombineLatest$LatestCoordinator
            rx.functions.FuncN r3 = r8.f77880c
            int r5 = r8.f77881d
            boolean r6 = r8.f77882e
            r1 = r7
            r2 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            r7.subscribe(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p046rx.internal.operators.OnSubscribeCombineLatest.call(rx.Subscriber):void");
    }
}
