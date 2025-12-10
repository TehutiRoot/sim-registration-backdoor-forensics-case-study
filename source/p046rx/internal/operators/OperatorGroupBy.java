package p046rx.internal.operators;

import java.util.ArrayList;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p046rx.Observable;
import p046rx.Producer;
import p046rx.Subscriber;
import p046rx.Subscription;
import p046rx.exceptions.Exceptions;
import p046rx.functions.Action0;
import p046rx.functions.Action1;
import p046rx.functions.Func1;
import p046rx.internal.producers.ProducerArbiter;
import p046rx.internal.util.RxRingBuffer;
import p046rx.internal.util.UtilityFunctions;
import p046rx.observables.GroupedObservable;
import p046rx.observers.Subscribers;
import p046rx.plugins.RxJavaHooks;
import p046rx.subscriptions.Subscriptions;

@Deprecated
/* renamed from: rx.internal.operators.OperatorGroupBy */
/* loaded from: classes7.dex */
public final class OperatorGroupBy<T, K, V> implements Observable.Operator<GroupedObservable<K, V>, T> {

    /* renamed from: a */
    public final Func1 f78370a;

    /* renamed from: b */
    public final Func1 f78371b;

    /* renamed from: c */
    public final int f78372c;

    /* renamed from: d */
    public final boolean f78373d;

    /* renamed from: e */
    public final Func1 f78374e;

    /* renamed from: rx.internal.operators.OperatorGroupBy$GroupByProducer */
    /* loaded from: classes7.dex */
    public static final class GroupByProducer implements Producer {

        /* renamed from: a */
        public final GroupBySubscriber f78375a;

        public GroupByProducer(GroupBySubscriber<?, ?, ?> groupBySubscriber) {
            this.f78375a = groupBySubscriber;
        }

        @Override // p046rx.Producer
        public void request(long j) {
            this.f78375a.requestMore(j);
        }
    }

    /* renamed from: rx.internal.operators.OperatorGroupBy$State */
    /* loaded from: classes7.dex */
    public static final class State<T, K> extends AtomicInteger implements Producer, Subscription, Observable.OnSubscribe<T> {
        private static final long serialVersionUID = -3852313036005250360L;
        final boolean delayError;
        volatile boolean done;
        Throwable error;
        final K key;
        final GroupBySubscriber<?, K, T> parent;
        final Queue<Object> queue = new ConcurrentLinkedQueue();
        final AtomicBoolean cancelled = new AtomicBoolean();
        final AtomicReference<Subscriber<? super T>> actual = new AtomicReference<>();
        final AtomicBoolean once = new AtomicBoolean();
        final AtomicLong requested = new AtomicLong();

        public State(int i, GroupBySubscriber<?, K, T> groupBySubscriber, K k, boolean z) {
            this.parent = groupBySubscriber;
            this.key = k;
            this.delayError = z;
        }

        @Override // p046rx.functions.Action1
        public /* bridge */ /* synthetic */ void call(Object obj) {
            call((Subscriber) ((Subscriber) obj));
        }

        public boolean checkTerminated(boolean z, boolean z2, Subscriber<? super T> subscriber, boolean z3) {
            if (this.cancelled.get()) {
                this.queue.clear();
                this.parent.cancel(this.key);
                return true;
            } else if (z) {
                if (z3) {
                    if (z2) {
                        Throwable th2 = this.error;
                        if (th2 != null) {
                            subscriber.onError(th2);
                        } else {
                            subscriber.onCompleted();
                        }
                        return true;
                    }
                    return false;
                }
                Throwable th3 = this.error;
                if (th3 != null) {
                    this.queue.clear();
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

        public void drain() {
            boolean z;
            if (getAndIncrement() != 0) {
                return;
            }
            Queue<Object> queue = this.queue;
            boolean z2 = this.delayError;
            Subscriber<? super T> subscriber = this.actual.get();
            int i = 1;
            while (true) {
                if (subscriber != null) {
                    if (checkTerminated(this.done, queue.isEmpty(), subscriber, z2)) {
                        return;
                    }
                    long j = this.requested.get();
                    long j2 = 0;
                    while (j2 != j) {
                        boolean z3 = this.done;
                        Object poll = queue.poll();
                        if (poll == null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (checkTerminated(z3, z, subscriber, z2)) {
                            return;
                        }
                        if (z) {
                            break;
                        }
                        subscriber.onNext((Object) NotificationLite.getValue(poll));
                        j2++;
                    }
                    if (j2 != 0) {
                        if (j != Long.MAX_VALUE) {
                            BackpressureUtils.produced(this.requested, j2);
                        }
                        this.parent.f78387k.request(j2);
                    }
                }
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
                if (subscriber == null) {
                    subscriber = this.actual.get();
                }
            }
        }

        @Override // p046rx.Subscription
        public boolean isUnsubscribed() {
            return this.cancelled.get();
        }

        public void onComplete() {
            this.done = true;
            drain();
        }

        public void onError(Throwable th2) {
            this.error = th2;
            this.done = true;
            drain();
        }

        public void onNext(T t) {
            if (t == null) {
                this.error = new NullPointerException();
                this.done = true;
            } else {
                this.queue.offer(NotificationLite.next(t));
            }
            drain();
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

        @Override // p046rx.Subscription
        public void unsubscribe() {
            if (this.cancelled.compareAndSet(false, true) && getAndIncrement() == 0) {
                this.parent.cancel(this.key);
            }
        }

        public void call(Subscriber<? super T> subscriber) {
            if (this.once.compareAndSet(false, true)) {
                subscriber.add(this);
                subscriber.setProducer(this);
                this.actual.lazySet(subscriber);
                drain();
                return;
            }
            subscriber.onError(new IllegalStateException("Only one Subscriber allowed!"));
        }
    }

    /* renamed from: rx.internal.operators.OperatorGroupBy$a */
    /* loaded from: classes7.dex */
    public class C13571a implements Action0 {

        /* renamed from: a */
        public final /* synthetic */ GroupBySubscriber f78395a;

        public C13571a(GroupBySubscriber groupBySubscriber) {
            this.f78395a = groupBySubscriber;
        }

        @Override // p046rx.functions.Action0
        public void call() {
            this.f78395a.cancel();
        }
    }

    /* renamed from: rx.internal.operators.OperatorGroupBy$b */
    /* loaded from: classes7.dex */
    public static final class C13572b extends GroupedObservable {

        /* renamed from: c */
        public final State f78397c;

        public C13572b(Object obj, State state) {
            super(obj, state);
            this.f78397c = state;
        }

        /* renamed from: c */
        public static C13572b m23058c(Object obj, int i, GroupBySubscriber groupBySubscriber, boolean z) {
            return new C13572b(obj, new State(i, groupBySubscriber, obj, z));
        }

        /* renamed from: d */
        public void m23057d() {
            this.f78397c.onComplete();
        }

        public void onError(Throwable th2) {
            this.f78397c.onError(th2);
        }

        public void onNext(Object obj) {
            this.f78397c.onNext(obj);
        }
    }

    public OperatorGroupBy(Func1<? super T, ? extends K> func1) {
        this(func1, UtilityFunctions.identity(), RxRingBuffer.SIZE, false, null);
    }

    @Override // p046rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public OperatorGroupBy(Func1<? super T, ? extends K> func1, Func1<? super T, ? extends V> func12) {
        this(func1, func12, RxRingBuffer.SIZE, false, null);
    }

    public Subscriber<? super T> call(Subscriber<? super GroupedObservable<K, V>> subscriber) {
        try {
            GroupBySubscriber groupBySubscriber = new GroupBySubscriber(subscriber, this.f78370a, this.f78371b, this.f78372c, this.f78373d, this.f78374e);
            subscriber.add(Subscriptions.create(new C13571a(groupBySubscriber)));
            subscriber.setProducer(groupBySubscriber.f78385i);
            return groupBySubscriber;
        } catch (Throwable th2) {
            Exceptions.throwOrReport(th2, subscriber);
            Subscriber<? super T> empty = Subscribers.empty();
            empty.unsubscribe();
            return empty;
        }
    }

    /* renamed from: rx.internal.operators.OperatorGroupBy$GroupBySubscriber */
    /* loaded from: classes7.dex */
    public static final class GroupBySubscriber<T, K, V> extends Subscriber<T> {

        /* renamed from: r */
        public static final Object f78376r = new Object();

        /* renamed from: a */
        public final Subscriber f78377a;

        /* renamed from: b */
        public final Func1 f78378b;

        /* renamed from: c */
        public final Func1 f78379c;

        /* renamed from: d */
        public final int f78380d;

        /* renamed from: e */
        public final boolean f78381e;

        /* renamed from: f */
        public final Map f78382f;

        /* renamed from: g */
        public final Map f78383g;

        /* renamed from: h */
        public final Queue f78384h = new ConcurrentLinkedQueue();

        /* renamed from: i */
        public final GroupByProducer f78385i;

        /* renamed from: j */
        public final Queue f78386j;

        /* renamed from: k */
        public final ProducerArbiter f78387k;

        /* renamed from: l */
        public final AtomicBoolean f78388l;

        /* renamed from: m */
        public final AtomicLong f78389m;

        /* renamed from: n */
        public final AtomicInteger f78390n;

        /* renamed from: o */
        public Throwable f78391o;

        /* renamed from: p */
        public volatile boolean f78392p;

        /* renamed from: q */
        public final AtomicInteger f78393q;

        /* renamed from: rx.internal.operators.OperatorGroupBy$GroupBySubscriber$a */
        /* loaded from: classes7.dex */
        public static class C13570a implements Action1 {

            /* renamed from: a */
            public final Queue f78394a;

            public C13570a(Queue queue) {
                this.f78394a = queue;
            }

            @Override // p046rx.functions.Action1
            public void call(Object obj) {
                this.f78394a.offer(obj);
            }
        }

        public GroupBySubscriber(Subscriber<? super GroupedObservable<K, V>> subscriber, Func1<? super T, ? extends K> func1, Func1<? super T, ? extends V> func12, int i, boolean z, Func1<Action1<K>, Map<K, Object>> func13) {
            this.f78377a = subscriber;
            this.f78378b = func1;
            this.f78379c = func12;
            this.f78380d = i;
            this.f78381e = z;
            ProducerArbiter producerArbiter = new ProducerArbiter();
            this.f78387k = producerArbiter;
            producerArbiter.request(i);
            this.f78385i = new GroupByProducer(this);
            this.f78388l = new AtomicBoolean();
            this.f78389m = new AtomicLong();
            this.f78390n = new AtomicInteger(1);
            this.f78393q = new AtomicInteger();
            if (func13 == null) {
                this.f78382f = new ConcurrentHashMap();
                this.f78386j = null;
            } else {
                ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
                this.f78386j = concurrentLinkedQueue;
                this.f78382f = m23061c(func13, new C13570a(concurrentLinkedQueue));
            }
            this.f78383g = new ConcurrentHashMap();
        }

        /* renamed from: b */
        public boolean m23062b(boolean z, boolean z2, Subscriber subscriber, Queue queue) {
            if (z) {
                Throwable th2 = this.f78391o;
                if (th2 != null) {
                    m23059e(subscriber, queue, th2);
                    return true;
                } else if (z2) {
                    this.f78377a.onCompleted();
                    return true;
                } else {
                    return false;
                }
            }
            return false;
        }

        /* renamed from: c */
        public final Map m23061c(Func1 func1, Action1 action1) {
            return (Map) func1.call(action1);
        }

        public void cancel() {
            if (this.f78388l.compareAndSet(false, true) && this.f78390n.decrementAndGet() == 0) {
                unsubscribe();
            }
        }

        /* renamed from: d */
        public void m23060d() {
            boolean z;
            if (this.f78393q.getAndIncrement() != 0) {
                return;
            }
            Queue queue = this.f78384h;
            Subscriber subscriber = this.f78377a;
            int i = 1;
            while (!m23062b(this.f78392p, queue.isEmpty(), subscriber, queue)) {
                long j = this.f78389m.get();
                long j2 = 0;
                while (j2 != j) {
                    boolean z2 = this.f78392p;
                    GroupedObservable groupedObservable = (GroupedObservable) queue.poll();
                    if (groupedObservable == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (m23062b(z2, z, subscriber, queue)) {
                        return;
                    }
                    if (z) {
                        break;
                    }
                    subscriber.onNext(groupedObservable);
                    j2++;
                }
                if (j2 != 0) {
                    if (j != Long.MAX_VALUE) {
                        BackpressureUtils.produced(this.f78389m, j2);
                    }
                    this.f78387k.request(j2);
                }
                i = this.f78393q.addAndGet(-i);
                if (i == 0) {
                    return;
                }
            }
        }

        /* renamed from: e */
        public void m23059e(Subscriber subscriber, Queue queue, Throwable th2) {
            queue.clear();
            ArrayList<C13572b> arrayList = new ArrayList(this.f78382f.values());
            this.f78382f.clear();
            if (this.f78386j != null) {
                this.f78383g.clear();
                this.f78386j.clear();
            }
            for (C13572b c13572b : arrayList) {
                c13572b.onError(th2);
            }
            subscriber.onError(th2);
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            if (this.f78392p) {
                return;
            }
            for (V v : this.f78382f.values()) {
                v.m23057d();
            }
            this.f78382f.clear();
            if (this.f78386j != null) {
                this.f78383g.clear();
                this.f78386j.clear();
            }
            this.f78392p = true;
            this.f78390n.decrementAndGet();
            m23060d();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            if (this.f78392p) {
                RxJavaHooks.onError(th2);
                return;
            }
            this.f78391o = th2;
            this.f78392p = true;
            this.f78390n.decrementAndGet();
            m23060d();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p046rx.Observer
        public void onNext(T t) {
            Object obj;
            boolean z;
            if (this.f78392p) {
                return;
            }
            Queue queue = this.f78384h;
            Subscriber subscriber = this.f78377a;
            try {
                Object call = this.f78378b.call(t);
                if (call != null) {
                    obj = call;
                } else {
                    obj = f78376r;
                }
                C13572b c13572b = (C13572b) this.f78382f.get(obj);
                if (c13572b == null) {
                    if (!this.f78388l.get()) {
                        c13572b = C13572b.m23058c(call, this.f78380d, this, this.f78381e);
                        this.f78382f.put(obj, c13572b);
                        if (this.f78386j != null) {
                            this.f78383g.put(obj, c13572b);
                        }
                        this.f78390n.getAndIncrement();
                        z = true;
                    } else {
                        return;
                    }
                } else {
                    z = false;
                }
                try {
                    c13572b.onNext(this.f78379c.call(t));
                    if (this.f78386j != null) {
                        while (true) {
                            Object poll = this.f78386j.poll();
                            if (poll == null) {
                                break;
                            }
                            C13572b c13572b2 = (C13572b) this.f78383g.remove(poll);
                            if (c13572b2 != null) {
                                c13572b2.m23057d();
                            }
                        }
                    }
                    if (z) {
                        queue.offer(c13572b);
                        m23060d();
                    }
                } catch (Throwable th2) {
                    unsubscribe();
                    m23059e(subscriber, queue, th2);
                }
            } catch (Throwable th3) {
                unsubscribe();
                m23059e(subscriber, queue, th3);
            }
        }

        public void requestMore(long j) {
            if (j >= 0) {
                BackpressureUtils.getAndAddRequest(this.f78389m, j);
                m23060d();
                return;
            }
            throw new IllegalArgumentException("n >= 0 required but it was " + j);
        }

        @Override // p046rx.Subscriber, p046rx.observers.AssertableSubscriber
        public void setProducer(Producer producer) {
            this.f78387k.setProducer(producer);
        }

        public void cancel(K k) {
            if (k == null) {
                k = (K) f78376r;
            }
            if (this.f78382f.remove(k) != null && this.f78390n.decrementAndGet() == 0) {
                unsubscribe();
            }
            if (this.f78386j != null) {
                this.f78383g.remove(k);
            }
        }
    }

    public OperatorGroupBy(Func1<? super T, ? extends K> func1, Func1<? super T, ? extends V> func12, Func1<Action1<K>, Map<K, Object>> func13) {
        this(func1, func12, RxRingBuffer.SIZE, false, func13);
    }

    public OperatorGroupBy(Func1<? super T, ? extends K> func1, Func1<? super T, ? extends V> func12, int i, boolean z, Func1<Action1<K>, Map<K, Object>> func13) {
        this.f78370a = func1;
        this.f78371b = func12;
        this.f78372c = i;
        this.f78373d = z;
        this.f78374e = func13;
    }
}
