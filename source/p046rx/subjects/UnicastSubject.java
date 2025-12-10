package p046rx.subjects;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p046rx.Observable;
import p046rx.Observer;
import p046rx.Producer;
import p046rx.Subscriber;
import p046rx.Subscription;
import p046rx.exceptions.Exceptions;
import p046rx.functions.Action0;
import p046rx.internal.operators.BackpressureUtils;
import p046rx.internal.operators.NotificationLite;
import p046rx.internal.util.atomic.SpscLinkedAtomicQueue;
import p046rx.internal.util.atomic.SpscUnboundedAtomicArrayQueue;
import p046rx.internal.util.unsafe.SpscLinkedQueue;
import p046rx.internal.util.unsafe.SpscUnboundedArrayQueue;
import p046rx.internal.util.unsafe.UnsafeAccess;

/* renamed from: rx.subjects.UnicastSubject */
/* loaded from: classes7.dex */
public final class UnicastSubject<T> extends Subject<T, T> {

    /* renamed from: b */
    public final State f79508b;

    /* renamed from: rx.subjects.UnicastSubject$State */
    /* loaded from: classes7.dex */
    public static final class State<T> extends AtomicLong implements Producer, Observer<T>, Observable.OnSubscribe<T>, Subscription {
        private static final long serialVersionUID = -9044104859202255786L;
        volatile boolean caughtUp;
        final boolean delayError;
        volatile boolean done;
        boolean emitting;
        Throwable error;
        boolean missed;
        final Queue<Object> queue;
        final AtomicReference<Subscriber<? super T>> subscriber = new AtomicReference<>();
        final AtomicReference<Action0> terminateOnce;

        public State(int i, boolean z, Action0 action0) {
            AtomicReference<Action0> atomicReference;
            Queue<Object> spscLinkedAtomicQueue;
            Queue<Object> queue;
            if (action0 != null) {
                atomicReference = new AtomicReference<>(action0);
            } else {
                atomicReference = null;
            }
            this.terminateOnce = atomicReference;
            this.delayError = z;
            if (i > 1) {
                if (UnsafeAccess.isUnsafeAvailable()) {
                    queue = new SpscUnboundedArrayQueue<>(i);
                } else {
                    queue = new SpscUnboundedAtomicArrayQueue<>(i);
                }
            } else {
                if (UnsafeAccess.isUnsafeAvailable()) {
                    spscLinkedAtomicQueue = new SpscLinkedQueue<>();
                } else {
                    spscLinkedAtomicQueue = new SpscLinkedAtomicQueue<>();
                }
                queue = spscLinkedAtomicQueue;
            }
            this.queue = queue;
        }

        @Override // p046rx.functions.Action1
        public /* bridge */ /* synthetic */ void call(Object obj) {
            call((Subscriber) ((Subscriber) obj));
        }

        public boolean checkTerminated(boolean z, boolean z2, boolean z3, Subscriber<? super T> subscriber) {
            if (subscriber.isUnsubscribed()) {
                this.queue.clear();
                return true;
            } else if (z) {
                Throwable th2 = this.error;
                if (th2 != null && !z3) {
                    this.queue.clear();
                    subscriber.onError(th2);
                    return true;
                } else if (z2) {
                    if (th2 != null) {
                        subscriber.onError(th2);
                    } else {
                        subscriber.onCompleted();
                    }
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }

        public void doTerminate() {
            Action0 action0;
            AtomicReference<Action0> atomicReference = this.terminateOnce;
            if (atomicReference != null && (action0 = atomicReference.get()) != null && AbstractC17300An1.m69050a(atomicReference, action0, null)) {
                action0.call();
            }
        }

        @Override // p046rx.Subscription
        public boolean isUnsubscribed() {
            return this.done;
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            boolean z;
            if (!this.done) {
                doTerminate();
                this.done = true;
                if (!this.caughtUp) {
                    synchronized (this) {
                        z = true ^ this.caughtUp;
                    }
                    if (z) {
                        replay();
                        return;
                    }
                }
                this.subscriber.get().onCompleted();
            }
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            boolean z;
            if (!this.done) {
                doTerminate();
                this.error = th2;
                this.done = true;
                if (!this.caughtUp) {
                    synchronized (this) {
                        z = true ^ this.caughtUp;
                    }
                    if (z) {
                        replay();
                        return;
                    }
                }
                this.subscriber.get().onError(th2);
            }
        }

        @Override // p046rx.Observer
        public void onNext(T t) {
            boolean z;
            if (!this.done) {
                if (!this.caughtUp) {
                    synchronized (this) {
                        try {
                            if (!this.caughtUp) {
                                this.queue.offer(NotificationLite.next(t));
                                z = true;
                            } else {
                                z = false;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    if (z) {
                        replay();
                        return;
                    }
                }
                Subscriber<? super T> subscriber = this.subscriber.get();
                try {
                    subscriber.onNext(t);
                } catch (Throwable th3) {
                    Exceptions.throwOrReport(th3, subscriber, t);
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:48:0x0084, code lost:
            if (r7 == false) goto L53;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x008a, code lost:
            if (r0.isEmpty() == false) goto L53;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x008c, code lost:
            r15.caughtUp = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x0091, code lost:
            r15.emitting = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x0094, code lost:
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void replay() {
            /*
                r15 = this;
                monitor-enter(r15)
                boolean r0 = r15.emitting     // Catch: java.lang.Throwable -> La
                r1 = 1
                if (r0 == 0) goto Ld
                r15.missed = r1     // Catch: java.lang.Throwable -> La
                monitor-exit(r15)     // Catch: java.lang.Throwable -> La
                return
            La:
                r0 = move-exception
                goto L9c
            Ld:
                r15.emitting = r1     // Catch: java.lang.Throwable -> La
                monitor-exit(r15)     // Catch: java.lang.Throwable -> La
                java.util.Queue<java.lang.Object> r0 = r15.queue
                boolean r2 = r15.delayError
            L14:
                java.util.concurrent.atomic.AtomicReference<rx.Subscriber<? super T>> r3 = r15.subscriber
                java.lang.Object r3 = r3.get()
                rx.Subscriber r3 = (p046rx.Subscriber) r3
                r4 = 0
                if (r3 == 0) goto L7e
                boolean r5 = r15.done
                boolean r6 = r0.isEmpty()
                boolean r5 = r15.checkTerminated(r5, r6, r2, r3)
                if (r5 == 0) goto L2c
                return
            L2c:
                long r5 = r15.get()
                r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r9 != 0) goto L3b
                r7 = 1
                goto L3c
            L3b:
                r7 = 0
            L3c:
                r8 = 0
                r10 = r8
            L3f:
                int r12 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
                if (r12 == 0) goto L73
                boolean r12 = r15.done
                java.lang.Object r13 = r0.poll()
                if (r13 != 0) goto L4d
                r14 = 1
                goto L4e
            L4d:
                r14 = 0
            L4e:
                boolean r12 = r15.checkTerminated(r12, r14, r2, r3)
                if (r12 == 0) goto L55
                return
            L55:
                if (r14 == 0) goto L58
                goto L73
            L58:
                java.lang.Object r12 = p046rx.internal.operators.NotificationLite.getValue(r13)
                r3.onNext(r12)     // Catch: java.lang.Throwable -> L64
                r12 = 1
                long r5 = r5 - r12
                long r10 = r10 + r12
                goto L3f
            L64:
                r1 = move-exception
                r0.clear()
                p046rx.exceptions.Exceptions.throwIfFatal(r1)
                java.lang.Throwable r0 = p046rx.exceptions.OnErrorThrowable.addValueAsLastCause(r1, r12)
                r3.onError(r0)
                return
            L73:
                if (r7 != 0) goto L7f
                int r3 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
                if (r3 == 0) goto L7f
                long r5 = -r10
                r15.addAndGet(r5)
                goto L7f
            L7e:
                r7 = 0
            L7f:
                monitor-enter(r15)
                boolean r3 = r15.missed     // Catch: java.lang.Throwable -> L8f
                if (r3 != 0) goto L95
                if (r7 == 0) goto L91
                boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L8f
                if (r0 == 0) goto L91
                r15.caughtUp = r1     // Catch: java.lang.Throwable -> L8f
                goto L91
            L8f:
                r0 = move-exception
                goto L9a
            L91:
                r15.emitting = r4     // Catch: java.lang.Throwable -> L8f
                monitor-exit(r15)     // Catch: java.lang.Throwable -> L8f
                return
            L95:
                r15.missed = r4     // Catch: java.lang.Throwable -> L8f
                monitor-exit(r15)     // Catch: java.lang.Throwable -> L8f
                goto L14
            L9a:
                monitor-exit(r15)     // Catch: java.lang.Throwable -> L8f
                throw r0
            L9c:
                monitor-exit(r15)     // Catch: java.lang.Throwable -> La
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p046rx.subjects.UnicastSubject.State.replay():void");
        }

        @Override // p046rx.Producer
        public void request(long j) {
            int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            if (i >= 0) {
                if (i > 0) {
                    BackpressureUtils.getAndAddRequest(this, j);
                    replay();
                    return;
                } else if (this.done) {
                    replay();
                    return;
                } else {
                    return;
                }
            }
            throw new IllegalArgumentException("n >= 0 required");
        }

        @Override // p046rx.Subscription
        public void unsubscribe() {
            doTerminate();
            this.done = true;
            synchronized (this) {
                try {
                    if (this.emitting) {
                        return;
                    }
                    this.emitting = true;
                    this.queue.clear();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public void call(Subscriber<? super T> subscriber) {
            if (AbstractC17300An1.m69050a(this.subscriber, null, subscriber)) {
                subscriber.add(this);
                subscriber.setProducer(this);
                return;
            }
            subscriber.onError(new IllegalStateException("Only a single subscriber is allowed"));
        }
    }

    public UnicastSubject(State state) {
        super(state);
        this.f79508b = state;
    }

    public static <T> UnicastSubject<T> create() {
        return create(16);
    }

    @Override // p046rx.subjects.Subject
    public boolean hasObservers() {
        if (this.f79508b.subscriber.get() != null) {
            return true;
        }
        return false;
    }

    @Override // p046rx.Observer
    public void onCompleted() {
        this.f79508b.onCompleted();
    }

    @Override // p046rx.Observer
    public void onError(Throwable th2) {
        this.f79508b.onError(th2);
    }

    @Override // p046rx.Observer
    public void onNext(T t) {
        this.f79508b.onNext(t);
    }

    public static <T> UnicastSubject<T> create(int i) {
        return new UnicastSubject<>(new State(i, false, null));
    }

    public static <T> UnicastSubject<T> create(boolean z) {
        return new UnicastSubject<>(new State(16, z, null));
    }

    public static <T> UnicastSubject<T> create(int i, Action0 action0) {
        return new UnicastSubject<>(new State(i, false, action0));
    }

    public static <T> UnicastSubject<T> create(int i, Action0 action0, boolean z) {
        return new UnicastSubject<>(new State(i, z, action0));
    }
}
