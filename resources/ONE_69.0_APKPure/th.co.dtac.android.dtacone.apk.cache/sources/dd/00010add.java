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
    public final boolean f78665a;

    /* renamed from: b */
    public final int f78666b;

    /* renamed from: rx.internal.operators.OperatorMerge$MergeProducer */
    /* loaded from: classes7.dex */
    public static final class MergeProducer<T> extends AtomicLong implements Producer {
        private static final long serialVersionUID = -1214379189873595503L;
        final C13590d subscriber;

        public MergeProducer(C13590d c13590d) {
            this.subscriber = c13590d;
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
                this.subscriber.m23230d();
            } else if (i >= 0) {
            } else {
                throw new IllegalArgumentException("n >= 0 required");
            }
        }
    }

    /* renamed from: rx.internal.operators.OperatorMerge$a */
    /* loaded from: classes7.dex */
    public static final class C13587a {

        /* renamed from: a */
        public static final OperatorMerge f78667a = new OperatorMerge(true, Integer.MAX_VALUE);
    }

    /* renamed from: rx.internal.operators.OperatorMerge$b */
    /* loaded from: classes7.dex */
    public static final class C13588b {

        /* renamed from: a */
        public static final OperatorMerge f78668a = new OperatorMerge(false, Integer.MAX_VALUE);
    }

    /* renamed from: rx.internal.operators.OperatorMerge$c */
    /* loaded from: classes7.dex */
    public static final class C13589c extends Subscriber {

        /* renamed from: f */
        public static final int f78669f = RxRingBuffer.SIZE / 4;

        /* renamed from: a */
        public final C13590d f78670a;

        /* renamed from: b */
        public final long f78671b;

        /* renamed from: c */
        public volatile boolean f78672c;

        /* renamed from: d */
        public volatile RxRingBuffer f78673d;

        /* renamed from: e */
        public int f78674e;

        public C13589c(C13590d c13590d, long j) {
            this.f78670a = c13590d;
            this.f78671b = j;
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            this.f78672c = true;
            this.f78670a.m23230d();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.f78670a.m23224j().offer(th2);
            this.f78672c = true;
            this.f78670a.m23230d();
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            this.f78670a.m23217q(this, obj);
        }

        @Override // p046rx.Subscriber, p046rx.observers.AssertableSubscriber
        public void onStart() {
            int i = RxRingBuffer.SIZE;
            this.f78674e = i;
            request(i);
        }

        public void requestMore(long j) {
            int i = this.f78674e - ((int) j);
            if (i > f78669f) {
                this.f78674e = i;
                return;
            }
            int i2 = RxRingBuffer.SIZE;
            this.f78674e = i2;
            int i3 = i2 - i;
            if (i3 > 0) {
                request(i3);
            }
        }
    }

    /* renamed from: rx.internal.operators.OperatorMerge$d */
    /* loaded from: classes7.dex */
    public static final class C13590d extends Subscriber {

        /* renamed from: r */
        public static final C13589c[] f78675r = new C13589c[0];

        /* renamed from: a */
        public final Subscriber f78676a;

        /* renamed from: b */
        public final boolean f78677b;

        /* renamed from: c */
        public final int f78678c;

        /* renamed from: d */
        public MergeProducer f78679d;

        /* renamed from: e */
        public volatile Queue f78680e;

        /* renamed from: f */
        public volatile CompositeSubscription f78681f;

        /* renamed from: g */
        public volatile ConcurrentLinkedQueue f78682g;

        /* renamed from: h */
        public volatile boolean f78683h;

        /* renamed from: i */
        public boolean f78684i;

        /* renamed from: j */
        public boolean f78685j;

        /* renamed from: k */
        public final Object f78686k = new Object();

        /* renamed from: l */
        public volatile C13589c[] f78687l = f78675r;

        /* renamed from: m */
        public long f78688m;

        /* renamed from: n */
        public long f78689n;

        /* renamed from: o */
        public int f78690o;

        /* renamed from: p */
        public final int f78691p;

        /* renamed from: q */
        public int f78692q;

        public C13590d(Subscriber subscriber, boolean z, int i) {
            this.f78676a = subscriber;
            this.f78677b = z;
            this.f78678c = i;
            if (i == Integer.MAX_VALUE) {
                this.f78691p = Integer.MAX_VALUE;
                request(Long.MAX_VALUE);
                return;
            }
            this.f78691p = Math.max(1, i >> 1);
            request(i);
        }

        /* renamed from: b */
        public void m23232b(C13589c c13589c) {
            m23225i().add(c13589c);
            synchronized (this.f78686k) {
                C13589c[] c13589cArr = this.f78687l;
                int length = c13589cArr.length;
                C13589c[] c13589cArr2 = new C13589c[length + 1];
                System.arraycopy(c13589cArr, 0, c13589cArr2, 0, length);
                c13589cArr2[length] = c13589c;
                this.f78687l = c13589cArr2;
            }
        }

        /* renamed from: c */
        public boolean m23231c() {
            if (this.f78676a.isUnsubscribed()) {
                return true;
            }
            ConcurrentLinkedQueue concurrentLinkedQueue = this.f78682g;
            if (!this.f78677b && concurrentLinkedQueue != null && !concurrentLinkedQueue.isEmpty()) {
                try {
                    m23219o();
                    return true;
                } finally {
                    unsubscribe();
                }
            }
            return false;
        }

        /* renamed from: d */
        public void m23230d() {
            synchronized (this) {
                try {
                    if (this.f78684i) {
                        this.f78685j = true;
                        return;
                    }
                    this.f78684i = true;
                    m23228f();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* renamed from: e */
        public void m23229e() {
            int i = this.f78692q + 1;
            if (i == this.f78691p) {
                this.f78692q = 0;
                requestMore(i);
                return;
            }
            this.f78692q = i;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: f */
        public void m23228f() {
            boolean z;
            boolean z2;
            long j;
            int i;
            boolean z3;
            int i2;
            try {
                Subscriber subscriber = this.f78676a;
                while (!m23231c()) {
                    Queue queue = this.f78680e;
                    long j2 = this.f78679d.get();
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
                                if (m23231c()) {
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
                                    j = this.f78679d.produced(i4);
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
                    boolean z4 = this.f78683h;
                    Queue queue2 = this.f78680e;
                    C13589c[] c13589cArr = this.f78687l;
                    int length = c13589cArr.length;
                    if (z4 && ((queue2 == null || queue2.isEmpty()) && length == 0)) {
                        ConcurrentLinkedQueue concurrentLinkedQueue = this.f78682g;
                        if (concurrentLinkedQueue != null && !concurrentLinkedQueue.isEmpty()) {
                            m23219o();
                            return;
                        }
                        subscriber.onCompleted();
                        return;
                    }
                    if (length > 0) {
                        boolean z5 = z2;
                        long j3 = this.f78689n;
                        int i5 = this.f78690o;
                        if (length <= i5 || c13589cArr[i5].f78671b != j3) {
                            if (length <= i5) {
                                i5 = 0;
                            }
                            for (int i6 = 0; i6 < length && c13589cArr[i5].f78671b != j3; i6++) {
                                i5++;
                                if (i5 == length) {
                                    i5 = 0;
                                }
                            }
                            this.f78690o = i5;
                            this.f78689n = c13589cArr[i5].f78671b;
                        }
                        z3 = false;
                        for (int i7 = 0; i7 < length; i7++) {
                            if (m23231c()) {
                                return;
                            }
                            C13589c c13589c = c13589cArr[i5];
                            Object obj2 = null;
                            do {
                                int i8 = 0;
                                while (j > 0) {
                                    if (m23231c()) {
                                        return;
                                    }
                                    RxRingBuffer rxRingBuffer = c13589c.f78673d;
                                    if (rxRingBuffer == null || (obj2 = rxRingBuffer.poll()) == null) {
                                        break;
                                    }
                                    subscriber.onNext(NotificationLite.getValue(obj2));
                                    j--;
                                    i8++;
                                }
                                if (i8 > 0) {
                                    if (!z5) {
                                        j = this.f78679d.produced(i8);
                                    } else {
                                        j = Long.MAX_VALUE;
                                    }
                                    c13589c.requestMore(i8);
                                }
                                i2 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
                                if (i2 == 0) {
                                    break;
                                }
                            } while (obj2 != null);
                            boolean z6 = c13589c.f78672c;
                            RxRingBuffer rxRingBuffer2 = c13589c.f78673d;
                            if (z6 && (rxRingBuffer2 == null || rxRingBuffer2.isEmpty())) {
                                m23220n(c13589c);
                                if (m23231c()) {
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
                        this.f78690o = i5;
                        this.f78689n = c13589cArr[i5].f78671b;
                    } else {
                        z3 = false;
                    }
                    if (i > 0) {
                        request(i);
                    }
                    if (!z3) {
                        synchronized (this) {
                            try {
                                if (!this.f78685j) {
                                    try {
                                        this.f78684i = false;
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
                                this.f78685j = false;
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
                                    this.f78684i = false;
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
        public void m23227g(Object obj, long j) {
            try {
                this.f78676a.onNext(obj);
                if (j != Long.MAX_VALUE) {
                    try {
                        this.f78679d.produced(1);
                    }
                }
                int i = this.f78692q + 1;
                if (i == this.f78691p) {
                    this.f78692q = 0;
                    requestMore(i);
                } else {
                    this.f78692q = i;
                }
                synchronized (this) {
                    if (!this.f78685j) {
                        this.f78684i = false;
                        return;
                    }
                    this.f78685j = false;
                    m23228f();
                }
            }
        }

        /* renamed from: h */
        public void m23226h(C13589c c13589c, Object obj, long j) {
            try {
                this.f78676a.onNext(obj);
                if (j != Long.MAX_VALUE) {
                    try {
                        this.f78679d.produced(1);
                    }
                }
                c13589c.requestMore(1L);
                synchronized (this) {
                    if (!this.f78685j) {
                        this.f78684i = false;
                        return;
                    }
                    this.f78685j = false;
                    m23228f();
                }
            }
        }

        /* renamed from: i */
        public CompositeSubscription m23225i() {
            boolean z;
            CompositeSubscription compositeSubscription = this.f78681f;
            if (compositeSubscription == null) {
                synchronized (this) {
                    try {
                        compositeSubscription = this.f78681f;
                        if (compositeSubscription == null) {
                            compositeSubscription = new CompositeSubscription();
                            this.f78681f = compositeSubscription;
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
        public Queue m23224j() {
            ConcurrentLinkedQueue concurrentLinkedQueue = this.f78682g;
            if (concurrentLinkedQueue == null) {
                synchronized (this) {
                    try {
                        concurrentLinkedQueue = this.f78682g;
                        if (concurrentLinkedQueue == null) {
                            concurrentLinkedQueue = new ConcurrentLinkedQueue();
                            this.f78682g = concurrentLinkedQueue;
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
                m23229e();
            } else if (observable instanceof ScalarSynchronousObservable) {
                m23218p(((ScalarSynchronousObservable) observable).get());
            } else {
                long j = this.f78688m;
                this.f78688m = 1 + j;
                C13589c c13589c = new C13589c(this, j);
                m23232b(c13589c);
                observable.unsafeSubscribe(c13589c);
                m23230d();
            }
        }

        /* renamed from: l */
        public void m23222l(Object obj) {
            Queue spscExactAtomicArrayQueue;
            Queue queue = this.f78680e;
            if (queue == null) {
                int i = this.f78678c;
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
                this.f78680e = queue;
            }
            if (!queue.offer(NotificationLite.next(obj))) {
                unsubscribe();
                onError(OnErrorThrowable.addValueAsLastCause(new MissingBackpressureException(), obj));
            }
        }

        /* renamed from: m */
        public void m23221m(C13589c c13589c, Object obj) {
            RxRingBuffer rxRingBuffer = c13589c.f78673d;
            if (rxRingBuffer == null) {
                rxRingBuffer = RxRingBuffer.getSpscInstance();
                c13589c.add(rxRingBuffer);
                c13589c.f78673d = rxRingBuffer;
            }
            try {
                rxRingBuffer.onNext(NotificationLite.next(obj));
            } catch (IllegalStateException e) {
                if (!c13589c.isUnsubscribed()) {
                    c13589c.unsubscribe();
                    c13589c.onError(e);
                }
            } catch (MissingBackpressureException e2) {
                c13589c.unsubscribe();
                c13589c.onError(e2);
            }
        }

        /* renamed from: n */
        public void m23220n(C13589c c13589c) {
            RxRingBuffer rxRingBuffer = c13589c.f78673d;
            if (rxRingBuffer != null) {
                rxRingBuffer.release();
            }
            this.f78681f.remove(c13589c);
            synchronized (this.f78686k) {
                try {
                    C13589c[] c13589cArr = this.f78687l;
                    int length = c13589cArr.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            if (!c13589c.equals(c13589cArr[i])) {
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
                        this.f78687l = f78675r;
                        return;
                    }
                    C13589c[] c13589cArr2 = new C13589c[length - 1];
                    System.arraycopy(c13589cArr, 0, c13589cArr2, 0, i);
                    System.arraycopy(c13589cArr, i + 1, c13589cArr2, i, (length - i) - 1);
                    this.f78687l = c13589cArr2;
                } finally {
                }
            }
        }

        /* renamed from: o */
        public final void m23219o() {
            ArrayList arrayList = new ArrayList(this.f78682g);
            if (arrayList.size() == 1) {
                this.f78676a.onError((Throwable) arrayList.get(0));
            } else {
                this.f78676a.onError(new CompositeException(arrayList));
            }
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            this.f78683h = true;
            m23230d();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            m23224j().offer(th2);
            this.f78683h = true;
            m23230d();
        }

        /* renamed from: p */
        public void m23218p(Object obj) {
            long j = this.f78679d.get();
            boolean z = false;
            if (j != 0) {
                synchronized (this) {
                    try {
                        j = this.f78679d.get();
                        if (!this.f78684i && j != 0) {
                            z = true;
                            this.f78684i = true;
                        }
                    } finally {
                    }
                }
            }
            if (z) {
                Queue queue = this.f78680e;
                if (queue != null && !queue.isEmpty()) {
                    m23222l(obj);
                    m23228f();
                    return;
                }
                m23227g(obj, j);
                return;
            }
            m23222l(obj);
            m23230d();
        }

        /* renamed from: q */
        public void m23217q(C13589c c13589c, Object obj) {
            long j = this.f78679d.get();
            boolean z = false;
            if (j != 0) {
                synchronized (this) {
                    try {
                        j = this.f78679d.get();
                        if (!this.f78684i && j != 0) {
                            z = true;
                            this.f78684i = true;
                        }
                    } finally {
                    }
                }
            }
            if (z) {
                RxRingBuffer rxRingBuffer = c13589c.f78673d;
                if (rxRingBuffer != null && !rxRingBuffer.isEmpty()) {
                    m23221m(c13589c, obj);
                    m23228f();
                    return;
                }
                m23226h(c13589c, obj, j);
                return;
            }
            m23221m(c13589c, obj);
            m23230d();
        }

        public void requestMore(long j) {
            request(j);
        }
    }

    public OperatorMerge(boolean z, int i) {
        this.f78665a = z;
        this.f78666b = i;
    }

    public static <T> OperatorMerge<T> instance(boolean z) {
        if (z) {
            return C13587a.f78667a;
        }
        return C13588b.f78668a;
    }

    @Override // p046rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public Subscriber<Observable<? extends T>> call(Subscriber<? super T> subscriber) {
        C13590d c13590d = new C13590d(subscriber, this.f78665a, this.f78666b);
        MergeProducer mergeProducer = new MergeProducer(c13590d);
        c13590d.f78679d = mergeProducer;
        subscriber.add(c13590d);
        subscriber.setProducer(mergeProducer);
        return c13590d;
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