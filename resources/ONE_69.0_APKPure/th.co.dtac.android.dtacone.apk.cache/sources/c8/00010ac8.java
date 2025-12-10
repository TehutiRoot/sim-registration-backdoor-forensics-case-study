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

/* renamed from: rx.internal.operators.OperatorGroupByEvicting */
/* loaded from: classes7.dex */
public final class OperatorGroupByEvicting<T, K, V> implements Observable.Operator<GroupedObservable<K, V>, T> {

    /* renamed from: a */
    public final Func1 f78604a;

    /* renamed from: b */
    public final Func1 f78605b;

    /* renamed from: c */
    public final int f78606c;

    /* renamed from: d */
    public final boolean f78607d;

    /* renamed from: e */
    public final Func1 f78608e;

    /* renamed from: rx.internal.operators.OperatorGroupByEvicting$GroupByProducer */
    /* loaded from: classes7.dex */
    public static final class GroupByProducer implements Producer {

        /* renamed from: a */
        public final GroupBySubscriber f78609a;

        public GroupByProducer(GroupBySubscriber<?, ?, ?> groupBySubscriber) {
            this.f78609a = groupBySubscriber;
        }

        @Override // p046rx.Producer
        public void request(long j) {
            this.f78609a.requestMore(j);
        }
    }

    /* renamed from: rx.internal.operators.OperatorGroupByEvicting$State */
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
            boolean z2;
            if (getAndIncrement() != 0) {
                return;
            }
            Queue<Object> queue = this.queue;
            boolean z3 = this.delayError;
            Subscriber<? super T> subscriber = this.actual.get();
            int i = 1;
            while (true) {
                if (subscriber != null) {
                    if (checkTerminated(this.done, queue.isEmpty(), subscriber, z3)) {
                        return;
                    }
                    long j = this.requested.get();
                    if (j == Long.MAX_VALUE) {
                        z = true;
                    } else {
                        z = false;
                    }
                    long j2 = 0;
                    while (j != 0) {
                        boolean z4 = this.done;
                        Object poll = queue.poll();
                        if (poll == null) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (checkTerminated(z4, z2, subscriber, z3)) {
                            return;
                        }
                        if (z2) {
                            break;
                        }
                        subscriber.onNext((Object) NotificationLite.getValue(poll));
                        j--;
                        j2--;
                    }
                    if (j2 != 0) {
                        if (!z) {
                            this.requested.addAndGet(j2);
                        }
                        this.parent.f78620j.request(-j2);
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

    /* renamed from: rx.internal.operators.OperatorGroupByEvicting$a */
    /* loaded from: classes7.dex */
    public class C13574a implements Action0 {

        /* renamed from: a */
        public final /* synthetic */ GroupBySubscriber f78627a;

        public C13574a(GroupBySubscriber groupBySubscriber) {
            this.f78627a = groupBySubscriber;
        }

        @Override // p046rx.functions.Action0
        public void call() {
            this.f78627a.cancel();
        }
    }

    /* renamed from: rx.internal.operators.OperatorGroupByEvicting$b */
    /* loaded from: classes7.dex */
    public static class C13575b implements Action1 {

        /* renamed from: a */
        public final Queue f78629a;

        public C13575b(Queue queue) {
            this.f78629a = queue;
        }

        @Override // p046rx.functions.Action1
        /* renamed from: a */
        public void call(C13576c c13576c) {
            this.f78629a.offer(c13576c);
        }
    }

    /* renamed from: rx.internal.operators.OperatorGroupByEvicting$c */
    /* loaded from: classes7.dex */
    public static final class C13576c extends GroupedObservable {

        /* renamed from: c */
        public final State f78630c;

        public C13576c(Object obj, State state) {
            super(obj, state);
            this.f78630c = state;
        }

        /* renamed from: c */
        public static C13576c m23240c(Object obj, int i, GroupBySubscriber groupBySubscriber, boolean z) {
            return new C13576c(obj, new State(i, groupBySubscriber, obj, z));
        }

        /* renamed from: d */
        public void m23239d() {
            this.f78630c.onComplete();
        }

        public void onError(Throwable th2) {
            this.f78630c.onError(th2);
        }

        public void onNext(Object obj) {
            this.f78630c.onNext(obj);
        }
    }

    public OperatorGroupByEvicting(Func1<? super T, ? extends K> func1) {
        this(func1, UtilityFunctions.identity(), RxRingBuffer.SIZE, false, null);
    }

    @Override // p046rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public OperatorGroupByEvicting(Func1<? super T, ? extends K> func1, Func1<? super T, ? extends V> func12) {
        this(func1, func12, RxRingBuffer.SIZE, false, null);
    }

    public Subscriber<? super T> call(Subscriber<? super GroupedObservable<K, V>> subscriber) {
        ConcurrentLinkedQueue concurrentLinkedQueue;
        Map map;
        if (this.f78608e == null) {
            map = new ConcurrentHashMap();
            concurrentLinkedQueue = null;
        } else {
            concurrentLinkedQueue = new ConcurrentLinkedQueue();
            try {
                map = (Map) this.f78608e.call(new C13575b(concurrentLinkedQueue));
            } catch (Throwable th2) {
                Exceptions.throwOrReport(th2, subscriber);
                Subscriber<? super T> empty = Subscribers.empty();
                empty.unsubscribe();
                return empty;
            }
        }
        GroupBySubscriber groupBySubscriber = new GroupBySubscriber(subscriber, this.f78604a, this.f78605b, this.f78606c, this.f78607d, map, concurrentLinkedQueue);
        subscriber.add(Subscriptions.create(new C13574a(groupBySubscriber)));
        subscriber.setProducer(groupBySubscriber.f78618h);
        return groupBySubscriber;
    }

    /* renamed from: rx.internal.operators.OperatorGroupByEvicting$GroupBySubscriber */
    /* loaded from: classes7.dex */
    public static final class GroupBySubscriber<T, K, V> extends Subscriber<T> {

        /* renamed from: q */
        public static final Object f78610q = new Object();

        /* renamed from: a */
        public final Subscriber f78611a;

        /* renamed from: b */
        public final Func1 f78612b;

        /* renamed from: c */
        public final Func1 f78613c;

        /* renamed from: d */
        public final int f78614d;

        /* renamed from: e */
        public final boolean f78615e;

        /* renamed from: f */
        public final Map f78616f;

        /* renamed from: g */
        public final Queue f78617g = new ConcurrentLinkedQueue();

        /* renamed from: h */
        public final GroupByProducer f78618h;

        /* renamed from: i */
        public final Queue f78619i;

        /* renamed from: j */
        public final ProducerArbiter f78620j;

        /* renamed from: k */
        public final AtomicBoolean f78621k;

        /* renamed from: l */
        public final AtomicLong f78622l;

        /* renamed from: m */
        public final AtomicInteger f78623m;

        /* renamed from: n */
        public Throwable f78624n;

        /* renamed from: o */
        public volatile boolean f78625o;

        /* renamed from: p */
        public final AtomicInteger f78626p;

        public GroupBySubscriber(Subscriber<? super GroupedObservable<K, V>> subscriber, Func1<? super T, ? extends K> func1, Func1<? super T, ? extends V> func12, int i, boolean z, Map<K, C13576c> map, Queue<C13576c> queue) {
            this.f78611a = subscriber;
            this.f78612b = func1;
            this.f78613c = func12;
            this.f78614d = i;
            this.f78615e = z;
            ProducerArbiter producerArbiter = new ProducerArbiter();
            this.f78620j = producerArbiter;
            producerArbiter.request(i);
            this.f78618h = new GroupByProducer(this);
            this.f78621k = new AtomicBoolean();
            this.f78622l = new AtomicLong();
            this.f78623m = new AtomicInteger(1);
            this.f78626p = new AtomicInteger();
            this.f78616f = map;
            this.f78619i = queue;
        }

        /* renamed from: b */
        public boolean m23244b(boolean z, boolean z2, Subscriber subscriber, Queue queue) {
            if (z) {
                Throwable th2 = this.f78624n;
                if (th2 != null) {
                    m23242d(subscriber, queue, th2);
                    return true;
                } else if (z2) {
                    this.f78611a.onCompleted();
                    return true;
                } else {
                    return false;
                }
            }
            return false;
        }

        /* renamed from: c */
        public void m23243c() {
            boolean z;
            boolean z2;
            if (this.f78626p.getAndIncrement() != 0) {
                return;
            }
            Queue queue = this.f78617g;
            Subscriber subscriber = this.f78611a;
            int i = 1;
            while (!m23244b(this.f78625o, queue.isEmpty(), subscriber, queue)) {
                long j = this.f78622l.get();
                if (j == Long.MAX_VALUE) {
                    z = true;
                } else {
                    z = false;
                }
                long j2 = 0;
                while (j != 0) {
                    boolean z3 = this.f78625o;
                    GroupedObservable groupedObservable = (GroupedObservable) queue.poll();
                    if (groupedObservable == null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (m23244b(z3, z2, subscriber, queue)) {
                        return;
                    }
                    if (z2) {
                        break;
                    }
                    subscriber.onNext(groupedObservable);
                    j--;
                    j2--;
                }
                if (j2 != 0) {
                    if (!z) {
                        this.f78622l.addAndGet(j2);
                    }
                    this.f78620j.request(-j2);
                }
                i = this.f78626p.addAndGet(-i);
                if (i == 0) {
                    return;
                }
            }
        }

        public void cancel() {
            if (this.f78621k.compareAndSet(false, true) && this.f78623m.decrementAndGet() == 0) {
                unsubscribe();
            }
        }

        /* renamed from: d */
        public void m23242d(Subscriber subscriber, Queue queue, Throwable th2) {
            queue.clear();
            ArrayList<C13576c> arrayList = new ArrayList(this.f78616f.values());
            this.f78616f.clear();
            Queue queue2 = this.f78619i;
            if (queue2 != null) {
                queue2.clear();
            }
            for (C13576c c13576c : arrayList) {
                c13576c.onError(th2);
            }
            subscriber.onError(th2);
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            if (this.f78625o) {
                return;
            }
            for (V v : this.f78616f.values()) {
                v.m23239d();
            }
            this.f78616f.clear();
            Queue queue = this.f78619i;
            if (queue != null) {
                queue.clear();
            }
            this.f78625o = true;
            this.f78623m.decrementAndGet();
            m23243c();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            if (this.f78625o) {
                RxJavaHooks.onError(th2);
                return;
            }
            this.f78624n = th2;
            this.f78625o = true;
            this.f78623m.decrementAndGet();
            m23243c();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p046rx.Observer
        public void onNext(T t) {
            Object obj;
            if (this.f78625o) {
                return;
            }
            Queue queue = this.f78617g;
            Subscriber subscriber = this.f78611a;
            try {
                Object call = this.f78612b.call(t);
                if (call != null) {
                    obj = call;
                } else {
                    obj = f78610q;
                }
                C13576c c13576c = (C13576c) this.f78616f.get(obj);
                if (c13576c == null) {
                    if (!this.f78621k.get()) {
                        c13576c = C13576c.m23240c(call, this.f78614d, this, this.f78615e);
                        this.f78616f.put(obj, c13576c);
                        this.f78623m.getAndIncrement();
                        queue.offer(c13576c);
                        m23243c();
                    } else {
                        return;
                    }
                }
                try {
                    c13576c.onNext(this.f78613c.call(t));
                    if (this.f78619i == null) {
                        return;
                    }
                    while (true) {
                        C13576c c13576c2 = (C13576c) this.f78619i.poll();
                        if (c13576c2 != null) {
                            c13576c2.m23239d();
                        } else {
                            return;
                        }
                    }
                } catch (Throwable th2) {
                    unsubscribe();
                    m23242d(subscriber, queue, th2);
                }
            } catch (Throwable th3) {
                unsubscribe();
                m23242d(subscriber, queue, th3);
            }
        }

        public void requestMore(long j) {
            if (j >= 0) {
                BackpressureUtils.getAndAddRequest(this.f78622l, j);
                m23243c();
                return;
            }
            throw new IllegalArgumentException("n >= 0 required but it was " + j);
        }

        @Override // p046rx.Subscriber, p046rx.observers.AssertableSubscriber
        public void setProducer(Producer producer) {
            this.f78620j.setProducer(producer);
        }

        public void cancel(K k) {
            if (k == null) {
                k = (K) f78610q;
            }
            if (this.f78616f.remove(k) == null || this.f78623m.decrementAndGet() != 0) {
                return;
            }
            unsubscribe();
        }
    }

    public OperatorGroupByEvicting(Func1<? super T, ? extends K> func1, Func1<? super T, ? extends V> func12, int i, boolean z, Func1<Action1<Object>, Map<K, Object>> func13) {
        this.f78604a = func1;
        this.f78605b = func12;
        this.f78606c = i;
        this.f78607d = z;
        this.f78608e = func13;
    }
}