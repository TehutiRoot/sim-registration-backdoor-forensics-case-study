package p046rx.internal.operators;

import java.util.ArrayList;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;
import p046rx.Observable;
import p046rx.Producer;
import p046rx.Subscriber;
import p046rx.exceptions.CompositeException;
import p046rx.exceptions.MissingBackpressureException;
import p046rx.exceptions.OnErrorThrowable;
import p046rx.internal.util.RxRingBuffer;
import p046rx.internal.util.ScalarSynchronousObservable;
import p046rx.internal.util.atomic.SpscAtomicArrayQueue;
import p046rx.internal.util.atomic.SpscExactAtomicArrayQueue;
import p046rx.internal.util.atomic.SpscUnboundedAtomicArrayQueue;
import p046rx.internal.util.unsafe.Pow2;
import p046rx.internal.util.unsafe.SpscArrayQueue;
import p046rx.internal.util.unsafe.UnsafeAccess;
import p046rx.subscriptions.CompositeSubscription;

/* renamed from: rx.internal.operators.OperatorMerge */
/* loaded from: classes7.dex */
public final class OperatorMerge<T> implements Observable.Operator<T, Observable<? extends T>> {

    /* renamed from: a */
    public final boolean f78459a;

    /* renamed from: b */
    public final int f78460b;

    /* renamed from: rx.internal.operators.OperatorMerge$MergeProducer */
    /* loaded from: classes7.dex */
    public static final class MergeProducer<T> extends AtomicLong implements Producer {
        private static final long serialVersionUID = -1214379189873595503L;
        final C13589d subscriber;

        public MergeProducer(C13589d c13589d) {
            this.subscriber = c13589d;
        }

        public long produced(int i) {
            return addAndGet(-i);
        }

        @Override // p046rx.Producer
        public void request(long j) {
            int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            if (i > 0) {
                if (get() == Long.MAX_VALUE) {
                    return;
                }
                BackpressureUtils.getAndAddRequest(this, j);
                this.subscriber.m23042d();
            } else if (i >= 0) {
            } else {
                throw new IllegalArgumentException("n >= 0 required");
            }
        }
    }

    /* renamed from: rx.internal.operators.OperatorMerge$a */
    /* loaded from: classes7.dex */
    public static final class C13586a {

        /* renamed from: a */
        public static final OperatorMerge f78461a = new OperatorMerge(true, Integer.MAX_VALUE);
    }

    /* renamed from: rx.internal.operators.OperatorMerge$b */
    /* loaded from: classes7.dex */
    public static final class C13587b {

        /* renamed from: a */
        public static final OperatorMerge f78462a = new OperatorMerge(false, Integer.MAX_VALUE);
    }

    /* renamed from: rx.internal.operators.OperatorMerge$c */
    /* loaded from: classes7.dex */
    public static final class C13588c extends Subscriber {

        /* renamed from: f */
        public static final int f78463f = RxRingBuffer.SIZE / 4;

        /* renamed from: a */
        public final C13589d f78464a;

        /* renamed from: b */
        public final long f78465b;

        /* renamed from: c */
        public volatile boolean f78466c;

        /* renamed from: d */
        public volatile RxRingBuffer f78467d;

        /* renamed from: e */
        public int f78468e;

        public C13588c(C13589d c13589d, long j) {
            this.f78464a = c13589d;
            this.f78465b = j;
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            this.f78466c = true;
            this.f78464a.m23042d();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.f78464a.m23036j().offer(th2);
            this.f78466c = true;
            this.f78464a.m23042d();
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            this.f78464a.m23029q(this, obj);
        }

        @Override // p046rx.Subscriber, p046rx.observers.AssertableSubscriber
        public void onStart() {
            int i = RxRingBuffer.SIZE;
            this.f78468e = i;
            request(i);
        }

        public void requestMore(long j) {
            int i = this.f78468e - ((int) j);
            if (i > f78463f) {
                this.f78468e = i;
                return;
            }
            int i2 = RxRingBuffer.SIZE;
            this.f78468e = i2;
            int i3 = i2 - i;
            if (i3 > 0) {
                request(i3);
            }
        }
    }

    /* renamed from: rx.internal.operators.OperatorMerge$d */
    /* loaded from: classes7.dex */
    public static final class C13589d extends Subscriber {

        /* renamed from: r */
        public static final C13588c[] f78469r = new C13588c[0];

        /* renamed from: a */
        public final Subscriber f78470a;

        /* renamed from: b */
        public final boolean f78471b;

        /* renamed from: c */
        public final int f78472c;

        /* renamed from: d */
        public MergeProducer f78473d;

        /* renamed from: e */
        public volatile Queue f78474e;

        /* renamed from: f */
        public volatile CompositeSubscription f78475f;

        /* renamed from: g */
        public volatile ConcurrentLinkedQueue f78476g;

        /* renamed from: h */
        public volatile boolean f78477h;

        /* renamed from: i */
        public boolean f78478i;

        /* renamed from: j */
        public boolean f78479j;

        /* renamed from: k */
        public final Object f78480k = new Object();

        /* renamed from: l */
        public volatile C13588c[] f78481l = f78469r;

        /* renamed from: m */
        public long f78482m;

        /* renamed from: n */
        public long f78483n;

        /* renamed from: o */
        public int f78484o;

        /* renamed from: p */
        public final int f78485p;

        /* renamed from: q */
        public int f78486q;

        public C13589d(Subscriber subscriber, boolean z, int i) {
            this.f78470a = subscriber;
            this.f78471b = z;
            this.f78472c = i;
            if (i == Integer.MAX_VALUE) {
                this.f78485p = Integer.MAX_VALUE;
                request(Long.MAX_VALUE);
                return;
            }
            this.f78485p = Math.max(1, i >> 1);
            request(i);
        }

        /* renamed from: b */
        public void m23044b(C13588c c13588c) {
            m23037i().add(c13588c);
            synchronized (this.f78480k) {
                C13588c[] c13588cArr = this.f78481l;
                int length = c13588cArr.length;
                C13588c[] c13588cArr2 = new C13588c[length + 1];
                System.arraycopy(c13588cArr, 0, c13588cArr2, 0, length);
                c13588cArr2[length] = c13588c;
                this.f78481l = c13588cArr2;
            }
        }

        /* renamed from: c */
        public boolean m23043c() {
            if (this.f78470a.isUnsubscribed()) {
                return true;
            }
            ConcurrentLinkedQueue concurrentLinkedQueue = this.f78476g;
            if (!this.f78471b && concurrentLinkedQueue != null && !concurrentLinkedQueue.isEmpty()) {
                try {
                    m23031o();
                    return true;
                } finally {
                    unsubscribe();
                }
            }
            return false;
        }

        /* renamed from: d */
        public void m23042d() {
            synchronized (this) {
                try {
                    if (this.f78478i) {
                        this.f78479j = true;
                        return;
                    }
                    this.f78478i = true;
                    m23040f();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* renamed from: e */
        public void m23041e() {
            int i = this.f78486q + 1;
            if (i == this.f78485p) {
                this.f78486q = 0;
                requestMore(i);
                return;
            }
            this.f78486q = i;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: f */
        public void m23040f() {
            boolean z;
            boolean z2;
            long j;
            int i;
            boolean z3;
            int i2;
            try {
                Subscriber subscriber = this.f78470a;
                while (!m23043c()) {
                    Queue queue = this.f78474e;
                    long j2 = this.f78473d.get();
                    if (j2 == Long.MAX_VALUE) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (queue != null) {
                        int i3 = 0;
                        while (true) {
                            j = j2;
                            int i4 = 0;
                            i = i3;
                            Object obj = null;
                            while (true) {
                                if (j <= 0) {
                                    break;
                                }
                                Object poll = queue.poll();
                                if (m23043c()) {
                                    return;
                                }
                                if (poll == null) {
                                    obj = poll;
                                    break;
                                }
                                try {
                                    subscriber.onNext(NotificationLite.getValue(poll));
                                    i++;
                                    i4++;
                                    j--;
                                    obj = poll;
                                }
                            }
                            if (i4 > 0) {
                                if (z2) {
                                    j = Long.MAX_VALUE;
                                } else {
                                    j = this.f78473d.produced(i4);
                                }
                            }
                            if (j == 0 || obj == null) {
                                break;
                            }
                            i3 = i;
                            j2 = j;
                        }
                    } else {
                        j = j2;
                        i = 0;
                    }
                    boolean z4 = this.f78477h;
                    Queue queue2 = this.f78474e;
                    C13588c[] c13588cArr = this.f78481l;
                    int length = c13588cArr.length;
                    if (z4 && ((queue2 == null || queue2.isEmpty()) && length == 0)) {
                        ConcurrentLinkedQueue concurrentLinkedQueue = this.f78476g;
                        if (concurrentLinkedQueue != null && !concurrentLinkedQueue.isEmpty()) {
                            m23031o();
                            return;
                        }
                        subscriber.onCompleted();
                        return;
                    }
                    if (length > 0) {
                        boolean z5 = z2;
                        long j3 = this.f78483n;
                        int i5 = this.f78484o;
                        if (length <= i5 || c13588cArr[i5].f78465b != j3) {
                            if (length <= i5) {
                                i5 = 0;
                            }
                            for (int i6 = 0; i6 < length && c13588cArr[i5].f78465b != j3; i6++) {
                                i5++;
                                if (i5 == length) {
                                    i5 = 0;
                                }
                            }
                            this.f78484o = i5;
                            this.f78483n = c13588cArr[i5].f78465b;
                        }
                        z3 = false;
                        for (int i7 = 0; i7 < length; i7++) {
                            if (m23043c()) {
                                return;
                            }
                            C13588c c13588c = c13588cArr[i5];
                            Object obj2 = null;
                            do {
                                int i8 = 0;
                                while (j > 0) {
                                    if (m23043c()) {
                                        return;
                                    }
                                    RxRingBuffer rxRingBuffer = c13588c.f78467d;
                                    if (rxRingBuffer == null || (obj2 = rxRingBuffer.poll()) == null) {
                                        break;
                                    }
                                    subscriber.onNext(NotificationLite.getValue(obj2));
                                    j--;
                                    i8++;
                                }
                                if (i8 > 0) {
                                    if (!z5) {
                                        j = this.f78473d.produced(i8);
                                    } else {
                                        j = Long.MAX_VALUE;
                                    }
                                    c13588c.requestMore(i8);
                                }
                                i2 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
                                if (i2 == 0) {
                                    break;
                                }
                            } while (obj2 != null);
                            boolean z6 = c13588c.f78466c;
                            RxRingBuffer rxRingBuffer2 = c13588c.f78467d;
                            if (z6 && (rxRingBuffer2 == null || rxRingBuffer2.isEmpty())) {
                                m23032n(c13588c);
                                if (m23043c()) {
                                    return;
                                }
                                i++;
                                z3 = true;
                            }
                            if (i2 == 0) {
                                break;
                            }
                            i5++;
                            if (i5 == length) {
                                i5 = 0;
                            }
                        }
                        this.f78484o = i5;
                        this.f78483n = c13588cArr[i5].f78465b;
                    } else {
                        z3 = false;
                    }
                    if (i > 0) {
                        request(i);
                    }
                    if (!z3) {
                        synchronized (this) {
                            try {
                                if (!this.f78479j) {
                                    try {
                                        this.f78478i = false;
                                        return;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        z = true;
                                        while (true) {
                                            try {
                                                break;
                                            } catch (Throwable th3) {
                                                th = th3;
                                            }
                                        }
                                        throw th;
                                    }
                                }
                                this.f78479j = false;
                            } catch (Throwable th4) {
                                th = th4;
                                z = false;
                            }
                        }
                        try {
                            break;
                            throw th;
                        } catch (Throwable th5) {
                            th = th5;
                            if (!z) {
                                synchronized (this) {
                                    this.f78478i = false;
                                }
                            }
                            throw th;
                        }
                    }
                }
            } catch (Throwable th6) {
                th = th6;
                z = false;
            }
        }

        /* renamed from: g */
        public void m23039g(Object obj, long j) {
            try {
                this.f78470a.onNext(obj);
                if (j != Long.MAX_VALUE) {
                    try {
                        this.f78473d.produced(1);
                    }
                }
                int i = this.f78486q + 1;
                if (i == this.f78485p) {
                    this.f78486q = 0;
                    requestMore(i);
                } else {
                    this.f78486q = i;
                }
                synchronized (this) {
                    if (!this.f78479j) {
                        this.f78478i = false;
                        return;
                    }
                    this.f78479j = false;
                    m23040f();
                }
            }
        }

        /* renamed from: h */
        public void m23038h(C13588c c13588c, Object obj, long j) {
            try {
                this.f78470a.onNext(obj);
                if (j != Long.MAX_VALUE) {
                    try {
                        this.f78473d.produced(1);
                    }
                }
                c13588c.requestMore(1L);
                synchronized (this) {
                    if (!this.f78479j) {
                        this.f78478i = false;
                        return;
                    }
                    this.f78479j = false;
                    m23040f();
                }
            }
        }

        /* renamed from: i */
        public CompositeSubscription m23037i() {
            boolean z;
            CompositeSubscription compositeSubscription = this.f78475f;
            if (compositeSubscription == null) {
                synchronized (this) {
                    try {
                        compositeSubscription = this.f78475f;
                        if (compositeSubscription == null) {
                            compositeSubscription = new CompositeSubscription();
                            this.f78475f = compositeSubscription;
                            z = true;
                        } else {
                            z = false;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (z) {
                    add(compositeSubscription);
                }
            }
            return compositeSubscription;
        }

        /* renamed from: j */
        public Queue m23036j() {
            ConcurrentLinkedQueue concurrentLinkedQueue = this.f78476g;
            if (concurrentLinkedQueue == null) {
                synchronized (this) {
                    try {
                        concurrentLinkedQueue = this.f78476g;
                        if (concurrentLinkedQueue == null) {
                            concurrentLinkedQueue = new ConcurrentLinkedQueue();
                            this.f78476g = concurrentLinkedQueue;
                        }
                    } finally {
                    }
                }
            }
            return concurrentLinkedQueue;
        }

        @Override // p046rx.Observer
        /* renamed from: k */
        public void onNext(Observable observable) {
            if (observable == null) {
                return;
            }
            if (observable == Observable.empty()) {
                m23041e();
            } else if (observable instanceof ScalarSynchronousObservable) {
                m23030p(((ScalarSynchronousObservable) observable).get());
            } else {
                long j = this.f78482m;
                this.f78482m = 1 + j;
                C13588c c13588c = new C13588c(this, j);
                m23044b(c13588c);
                observable.unsafeSubscribe(c13588c);
                m23042d();
            }
        }

        /* renamed from: l */
        public void m23034l(Object obj) {
            Queue spscExactAtomicArrayQueue;
            Queue queue = this.f78474e;
            if (queue == null) {
                int i = this.f78472c;
                if (i == Integer.MAX_VALUE) {
                    queue = new SpscUnboundedAtomicArrayQueue(RxRingBuffer.SIZE);
                } else {
                    if (Pow2.isPowerOfTwo(i)) {
                        if (UnsafeAccess.isUnsafeAvailable()) {
                            spscExactAtomicArrayQueue = new SpscArrayQueue(i);
                        } else {
                            spscExactAtomicArrayQueue = new SpscAtomicArrayQueue(i);
                        }
                    } else {
                        spscExactAtomicArrayQueue = new SpscExactAtomicArrayQueue(i);
                    }
                    queue = spscExactAtomicArrayQueue;
                }
                this.f78474e = queue;
            }
            if (!queue.offer(NotificationLite.next(obj))) {
                unsubscribe();
                onError(OnErrorThrowable.addValueAsLastCause(new MissingBackpressureException(), obj));
            }
        }

        /* renamed from: m */
        public void m23033m(C13588c c13588c, Object obj) {
            RxRingBuffer rxRingBuffer = c13588c.f78467d;
            if (rxRingBuffer == null) {
                rxRingBuffer = RxRingBuffer.getSpscInstance();
                c13588c.add(rxRingBuffer);
                c13588c.f78467d = rxRingBuffer;
            }
            try {
                rxRingBuffer.onNext(NotificationLite.next(obj));
            } catch (IllegalStateException e) {
                if (!c13588c.isUnsubscribed()) {
                    c13588c.unsubscribe();
                    c13588c.onError(e);
                }
            } catch (MissingBackpressureException e2) {
                c13588c.unsubscribe();
                c13588c.onError(e2);
            }
        }

        /* renamed from: n */
        public void m23032n(C13588c c13588c) {
            RxRingBuffer rxRingBuffer = c13588c.f78467d;
            if (rxRingBuffer != null) {
                rxRingBuffer.release();
            }
            this.f78475f.remove(c13588c);
            synchronized (this.f78480k) {
                try {
                    C13588c[] c13588cArr = this.f78481l;
                    int length = c13588cArr.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            if (!c13588c.equals(c13588cArr[i])) {
                                i++;
                            }
                        } else {
                            i = -1;
                            break;
                        }
                    }
                    if (i < 0) {
                        return;
                    }
                    if (length == 1) {
                        this.f78481l = f78469r;
                        return;
                    }
                    C13588c[] c13588cArr2 = new C13588c[length - 1];
                    System.arraycopy(c13588cArr, 0, c13588cArr2, 0, i);
                    System.arraycopy(c13588cArr, i + 1, c13588cArr2, i, (length - i) - 1);
                    this.f78481l = c13588cArr2;
                } finally {
                }
            }
        }

        /* renamed from: o */
        public final void m23031o() {
            ArrayList arrayList = new ArrayList(this.f78476g);
            if (arrayList.size() == 1) {
                this.f78470a.onError((Throwable) arrayList.get(0));
            } else {
                this.f78470a.onError(new CompositeException(arrayList));
            }
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            this.f78477h = true;
            m23042d();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            m23036j().offer(th2);
            this.f78477h = true;
            m23042d();
        }

        /* renamed from: p */
        public void m23030p(Object obj) {
            long j = this.f78473d.get();
            boolean z = false;
            if (j != 0) {
                synchronized (this) {
                    try {
                        j = this.f78473d.get();
                        if (!this.f78478i && j != 0) {
                            z = true;
                            this.f78478i = true;
                        }
                    } finally {
                    }
                }
            }
            if (z) {
                Queue queue = this.f78474e;
                if (queue != null && !queue.isEmpty()) {
                    m23034l(obj);
                    m23040f();
                    return;
                }
                m23039g(obj, j);
                return;
            }
            m23034l(obj);
            m23042d();
        }

        /* renamed from: q */
        public void m23029q(C13588c c13588c, Object obj) {
            long j = this.f78473d.get();
            boolean z = false;
            if (j != 0) {
                synchronized (this) {
                    try {
                        j = this.f78473d.get();
                        if (!this.f78478i && j != 0) {
                            z = true;
                            this.f78478i = true;
                        }
                    } finally {
                    }
                }
            }
            if (z) {
                RxRingBuffer rxRingBuffer = c13588c.f78467d;
                if (rxRingBuffer != null && !rxRingBuffer.isEmpty()) {
                    m23033m(c13588c, obj);
                    m23040f();
                    return;
                }
                m23038h(c13588c, obj, j);
                return;
            }
            m23033m(c13588c, obj);
            m23042d();
        }

        public void requestMore(long j) {
            request(j);
        }
    }

    public OperatorMerge(boolean z, int i) {
        this.f78459a = z;
        this.f78460b = i;
    }

    public static <T> OperatorMerge<T> instance(boolean z) {
        if (z) {
            return C13586a.f78461a;
        }
        return C13587b.f78462a;
    }

    @Override // p046rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public Subscriber<Observable<? extends T>> call(Subscriber<? super T> subscriber) {
        C13589d c13589d = new C13589d(subscriber, this.f78459a, this.f78460b);
        MergeProducer mergeProducer = new MergeProducer(c13589d);
        c13589d.f78473d = mergeProducer;
        subscriber.add(c13589d);
        subscriber.setProducer(mergeProducer);
        return c13589d;
    }

    public static <T> OperatorMerge<T> instance(boolean z, int i) {
        if (i > 0) {
            if (i == Integer.MAX_VALUE) {
                return instance(z);
            }
            return new OperatorMerge<>(z, i);
        }
        throw new IllegalArgumentException("maxConcurrent > 0 required but it was " + i);
    }
}
