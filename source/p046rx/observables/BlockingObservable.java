package p046rx.observables;

import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicReference;
import p046rx.Observable;
import p046rx.Observer;
import p046rx.Producer;
import p046rx.Subscriber;
import p046rx.Subscription;
import p046rx.exceptions.Exceptions;
import p046rx.exceptions.OnErrorNotImplementedException;
import p046rx.functions.Action0;
import p046rx.functions.Action1;
import p046rx.functions.Actions;
import p046rx.functions.Func1;
import p046rx.internal.operators.BlockingOperatorLatest;
import p046rx.internal.operators.BlockingOperatorMostRecent;
import p046rx.internal.operators.BlockingOperatorNext;
import p046rx.internal.operators.BlockingOperatorToFuture;
import p046rx.internal.operators.BlockingOperatorToIterator;
import p046rx.internal.operators.NotificationLite;
import p046rx.internal.util.BlockingUtils;
import p046rx.internal.util.UtilityFunctions;
import p046rx.subscriptions.Subscriptions;

/* renamed from: rx.observables.BlockingObservable */
/* loaded from: classes7.dex */
public final class BlockingObservable<T> {

    /* renamed from: b */
    public static final Object f79316b = new Object();

    /* renamed from: c */
    public static final Object f79317c = new Object();

    /* renamed from: d */
    public static final Object f79318d = new Object();

    /* renamed from: a */
    public final Observable f79319a;

    /* renamed from: rx.observables.BlockingObservable$a */
    /* loaded from: classes7.dex */
    public class C13808a extends Subscriber {

        /* renamed from: a */
        public final /* synthetic */ CountDownLatch f79320a;

        /* renamed from: b */
        public final /* synthetic */ AtomicReference f79321b;

        /* renamed from: c */
        public final /* synthetic */ Action1 f79322c;

        public C13808a(CountDownLatch countDownLatch, AtomicReference atomicReference, Action1 action1) {
            this.f79320a = countDownLatch;
            this.f79321b = atomicReference;
            this.f79322c = action1;
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            this.f79320a.countDown();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.f79321b.set(th2);
            this.f79320a.countDown();
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            this.f79322c.call(obj);
        }
    }

    /* renamed from: rx.observables.BlockingObservable$b */
    /* loaded from: classes7.dex */
    public class C13809b implements Iterable {
        public C13809b() {
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return BlockingObservable.this.getIterator();
        }
    }

    /* renamed from: rx.observables.BlockingObservable$c */
    /* loaded from: classes7.dex */
    public class C13810c extends Subscriber {

        /* renamed from: a */
        public final /* synthetic */ CountDownLatch f79325a;

        /* renamed from: b */
        public final /* synthetic */ AtomicReference f79326b;

        /* renamed from: c */
        public final /* synthetic */ AtomicReference f79327c;

        public C13810c(CountDownLatch countDownLatch, AtomicReference atomicReference, AtomicReference atomicReference2) {
            this.f79325a = countDownLatch;
            this.f79326b = atomicReference;
            this.f79327c = atomicReference2;
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            this.f79325a.countDown();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.f79326b.set(th2);
            this.f79325a.countDown();
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            this.f79327c.set(obj);
        }
    }

    /* renamed from: rx.observables.BlockingObservable$d */
    /* loaded from: classes7.dex */
    public class C13811d extends Subscriber {

        /* renamed from: a */
        public final /* synthetic */ Throwable[] f79329a;

        /* renamed from: b */
        public final /* synthetic */ CountDownLatch f79330b;

        public C13811d(Throwable[] thArr, CountDownLatch countDownLatch) {
            this.f79329a = thArr;
            this.f79330b = countDownLatch;
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            this.f79330b.countDown();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.f79329a[0] = th2;
            this.f79330b.countDown();
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
        }
    }

    /* renamed from: rx.observables.BlockingObservable$e */
    /* loaded from: classes7.dex */
    public class C13812e extends Subscriber {

        /* renamed from: a */
        public final /* synthetic */ BlockingQueue f79332a;

        public C13812e(BlockingQueue blockingQueue) {
            this.f79332a = blockingQueue;
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            this.f79332a.offer(NotificationLite.completed());
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.f79332a.offer(NotificationLite.error(th2));
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            this.f79332a.offer(NotificationLite.next(obj));
        }
    }

    /* renamed from: rx.observables.BlockingObservable$f */
    /* loaded from: classes7.dex */
    public class C13813f extends Subscriber {

        /* renamed from: a */
        public final /* synthetic */ BlockingQueue f79334a;

        /* renamed from: b */
        public final /* synthetic */ Producer[] f79335b;

        public C13813f(BlockingQueue blockingQueue, Producer[] producerArr) {
            this.f79334a = blockingQueue;
            this.f79335b = producerArr;
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            this.f79334a.offer(NotificationLite.completed());
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.f79334a.offer(NotificationLite.error(th2));
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            this.f79334a.offer(NotificationLite.next(obj));
        }

        @Override // p046rx.Subscriber, p046rx.observers.AssertableSubscriber
        public void onStart() {
            this.f79334a.offer(BlockingObservable.f79316b);
        }

        @Override // p046rx.Subscriber, p046rx.observers.AssertableSubscriber
        public void setProducer(Producer producer) {
            this.f79335b[0] = producer;
            this.f79334a.offer(BlockingObservable.f79317c);
        }
    }

    /* renamed from: rx.observables.BlockingObservable$g */
    /* loaded from: classes7.dex */
    public class C13814g implements Action0 {

        /* renamed from: a */
        public final /* synthetic */ BlockingQueue f79337a;

        public C13814g(BlockingQueue blockingQueue) {
            this.f79337a = blockingQueue;
        }

        @Override // p046rx.functions.Action0
        public void call() {
            this.f79337a.offer(BlockingObservable.f79318d);
        }
    }

    /* renamed from: rx.observables.BlockingObservable$h */
    /* loaded from: classes7.dex */
    public class C13815h implements Action1 {
        public C13815h() {
        }

        @Override // p046rx.functions.Action1
        /* renamed from: a */
        public void call(Throwable th2) {
            throw new OnErrorNotImplementedException(th2);
        }
    }

    /* renamed from: rx.observables.BlockingObservable$i */
    /* loaded from: classes7.dex */
    public class C13816i implements Observer {

        /* renamed from: a */
        public final /* synthetic */ Action1 f79340a;

        /* renamed from: b */
        public final /* synthetic */ Action1 f79341b;

        /* renamed from: c */
        public final /* synthetic */ Action0 f79342c;

        public C13816i(Action1 action1, Action1 action12, Action0 action0) {
            this.f79340a = action1;
            this.f79341b = action12;
            this.f79342c = action0;
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            this.f79342c.call();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.f79341b.call(th2);
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            this.f79340a.call(obj);
        }
    }

    public BlockingObservable(Observable observable) {
        this.f79319a = observable;
    }

    public static <T> BlockingObservable<T> from(Observable<? extends T> observable) {
        return new BlockingObservable<>(observable);
    }

    /* renamed from: a */
    public final Object m22795a(Observable observable) {
        AtomicReference atomicReference = new AtomicReference();
        AtomicReference atomicReference2 = new AtomicReference();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        BlockingUtils.awaitForComplete(countDownLatch, observable.subscribe((Subscriber) new C13810c(countDownLatch, atomicReference2, atomicReference)));
        if (atomicReference2.get() != null) {
            Exceptions.propagate((Throwable) atomicReference2.get());
        }
        return atomicReference.get();
    }

    public T first() {
        return (T) m22795a(this.f79319a.first());
    }

    public T firstOrDefault(T t) {
        return (T) m22795a(this.f79319a.map(UtilityFunctions.identity()).firstOrDefault(t));
    }

    public void forEach(Action1<? super T> action1) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        AtomicReference atomicReference = new AtomicReference();
        BlockingUtils.awaitForComplete(countDownLatch, this.f79319a.subscribe((Subscriber) new C13808a(countDownLatch, atomicReference, action1)));
        if (atomicReference.get() != null) {
            Exceptions.propagate((Throwable) atomicReference.get());
        }
    }

    public Iterator<T> getIterator() {
        return BlockingOperatorToIterator.toIterator(this.f79319a);
    }

    public T last() {
        return (T) m22795a(this.f79319a.last());
    }

    public T lastOrDefault(T t) {
        return (T) m22795a(this.f79319a.map(UtilityFunctions.identity()).lastOrDefault(t));
    }

    public Iterable<T> latest() {
        return BlockingOperatorLatest.latest(this.f79319a);
    }

    public Iterable<T> mostRecent(T t) {
        return BlockingOperatorMostRecent.mostRecent(this.f79319a, t);
    }

    public Iterable<T> next() {
        return BlockingOperatorNext.next(this.f79319a);
    }

    public T single() {
        return (T) m22795a(this.f79319a.single());
    }

    public T singleOrDefault(T t) {
        return (T) m22795a(this.f79319a.map(UtilityFunctions.identity()).singleOrDefault(t));
    }

    public void subscribe() {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Throwable[] thArr = {null};
        BlockingUtils.awaitForComplete(countDownLatch, this.f79319a.subscribe((Subscriber) new C13811d(thArr, countDownLatch)));
        Throwable th2 = thArr[0];
        if (th2 != null) {
            Exceptions.propagate(th2);
        }
    }

    public Future<T> toFuture() {
        return BlockingOperatorToFuture.toFuture(this.f79319a);
    }

    public Iterable<T> toIterable() {
        return new C13809b();
    }

    public T first(Func1<? super T, Boolean> func1) {
        return (T) m22795a(this.f79319a.first(func1));
    }

    public T firstOrDefault(T t, Func1<? super T, Boolean> func1) {
        return (T) m22795a(this.f79319a.filter(func1).map(UtilityFunctions.identity()).firstOrDefault(t));
    }

    public T last(Func1<? super T, Boolean> func1) {
        return (T) m22795a(this.f79319a.last(func1));
    }

    public T lastOrDefault(T t, Func1<? super T, Boolean> func1) {
        return (T) m22795a(this.f79319a.filter(func1).map(UtilityFunctions.identity()).lastOrDefault(t));
    }

    public T single(Func1<? super T, Boolean> func1) {
        return (T) m22795a(this.f79319a.single(func1));
    }

    public T singleOrDefault(T t, Func1<? super T, Boolean> func1) {
        return (T) m22795a(this.f79319a.filter(func1).map(UtilityFunctions.identity()).singleOrDefault(t));
    }

    public void subscribe(Observer<? super T> observer) {
        Object poll;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        Subscription subscribe = this.f79319a.subscribe((Subscriber) new C13812e(linkedBlockingQueue));
        do {
            try {
                try {
                    poll = linkedBlockingQueue.poll();
                    if (poll == null) {
                        poll = linkedBlockingQueue.take();
                    }
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    observer.onError(e);
                    subscribe.unsubscribe();
                    return;
                }
            } catch (Throwable th2) {
                subscribe.unsubscribe();
                throw th2;
            }
        } while (!NotificationLite.accept(observer, poll));
        subscribe.unsubscribe();
    }

    public void subscribe(Subscriber<? super T> subscriber) {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        Producer[] producerArr = {null};
        C13813f c13813f = new C13813f(linkedBlockingQueue, producerArr);
        subscriber.add(c13813f);
        subscriber.add(Subscriptions.create(new C13814g(linkedBlockingQueue)));
        this.f79319a.subscribe((Subscriber) c13813f);
        while (!subscriber.isUnsubscribed()) {
            try {
                try {
                    Object poll = linkedBlockingQueue.poll();
                    if (poll == null) {
                        poll = linkedBlockingQueue.take();
                    }
                    if (subscriber.isUnsubscribed() || poll == f79318d) {
                        break;
                    } else if (poll == f79316b) {
                        subscriber.onStart();
                    } else if (poll == f79317c) {
                        subscriber.setProducer(producerArr[0]);
                    } else if (NotificationLite.accept(subscriber, poll)) {
                        c13813f.unsubscribe();
                        return;
                    }
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    subscriber.onError(e);
                }
            } finally {
                c13813f.unsubscribe();
            }
        }
    }

    public void subscribe(Action1<? super T> action1) {
        subscribe(action1, new C13815h(), Actions.empty());
    }

    public void subscribe(Action1<? super T> action1, Action1<? super Throwable> action12) {
        subscribe(action1, action12, Actions.empty());
    }

    public void subscribe(Action1<? super T> action1, Action1<? super Throwable> action12, Action0 action0) {
        subscribe(new C13816i(action1, action12, action0));
    }
}
