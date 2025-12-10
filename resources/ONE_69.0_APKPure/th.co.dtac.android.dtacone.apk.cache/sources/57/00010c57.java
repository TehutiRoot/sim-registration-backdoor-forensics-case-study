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
    public static final Object f79522b = new Object();

    /* renamed from: c */
    public static final Object f79523c = new Object();

    /* renamed from: d */
    public static final Object f79524d = new Object();

    /* renamed from: a */
    public final Observable f79525a;

    /* renamed from: rx.observables.BlockingObservable$a */
    /* loaded from: classes7.dex */
    public class C13809a extends Subscriber {

        /* renamed from: a */
        public final /* synthetic */ CountDownLatch f79526a;

        /* renamed from: b */
        public final /* synthetic */ AtomicReference f79527b;

        /* renamed from: c */
        public final /* synthetic */ Action1 f79528c;

        public C13809a(CountDownLatch countDownLatch, AtomicReference atomicReference, Action1 action1) {
            this.f79526a = countDownLatch;
            this.f79527b = atomicReference;
            this.f79528c = action1;
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            this.f79526a.countDown();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.f79527b.set(th2);
            this.f79526a.countDown();
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            this.f79528c.call(obj);
        }
    }

    /* renamed from: rx.observables.BlockingObservable$b */
    /* loaded from: classes7.dex */
    public class C13810b implements Iterable {
        public C13810b() {
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return BlockingObservable.this.getIterator();
        }
    }

    /* renamed from: rx.observables.BlockingObservable$c */
    /* loaded from: classes7.dex */
    public class C13811c extends Subscriber {

        /* renamed from: a */
        public final /* synthetic */ CountDownLatch f79531a;

        /* renamed from: b */
        public final /* synthetic */ AtomicReference f79532b;

        /* renamed from: c */
        public final /* synthetic */ AtomicReference f79533c;

        public C13811c(CountDownLatch countDownLatch, AtomicReference atomicReference, AtomicReference atomicReference2) {
            this.f79531a = countDownLatch;
            this.f79532b = atomicReference;
            this.f79533c = atomicReference2;
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            this.f79531a.countDown();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.f79532b.set(th2);
            this.f79531a.countDown();
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            this.f79533c.set(obj);
        }
    }

    /* renamed from: rx.observables.BlockingObservable$d */
    /* loaded from: classes7.dex */
    public class C13812d extends Subscriber {

        /* renamed from: a */
        public final /* synthetic */ Throwable[] f79535a;

        /* renamed from: b */
        public final /* synthetic */ CountDownLatch f79536b;

        public C13812d(Throwable[] thArr, CountDownLatch countDownLatch) {
            this.f79535a = thArr;
            this.f79536b = countDownLatch;
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            this.f79536b.countDown();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.f79535a[0] = th2;
            this.f79536b.countDown();
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
        }
    }

    /* renamed from: rx.observables.BlockingObservable$e */
    /* loaded from: classes7.dex */
    public class C13813e extends Subscriber {

        /* renamed from: a */
        public final /* synthetic */ BlockingQueue f79538a;

        public C13813e(BlockingQueue blockingQueue) {
            this.f79538a = blockingQueue;
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            this.f79538a.offer(NotificationLite.completed());
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.f79538a.offer(NotificationLite.error(th2));
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            this.f79538a.offer(NotificationLite.next(obj));
        }
    }

    /* renamed from: rx.observables.BlockingObservable$f */
    /* loaded from: classes7.dex */
    public class C13814f extends Subscriber {

        /* renamed from: a */
        public final /* synthetic */ BlockingQueue f79540a;

        /* renamed from: b */
        public final /* synthetic */ Producer[] f79541b;

        public C13814f(BlockingQueue blockingQueue, Producer[] producerArr) {
            this.f79540a = blockingQueue;
            this.f79541b = producerArr;
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            this.f79540a.offer(NotificationLite.completed());
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.f79540a.offer(NotificationLite.error(th2));
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            this.f79540a.offer(NotificationLite.next(obj));
        }

        @Override // p046rx.Subscriber, p046rx.observers.AssertableSubscriber
        public void onStart() {
            this.f79540a.offer(BlockingObservable.f79522b);
        }

        @Override // p046rx.Subscriber, p046rx.observers.AssertableSubscriber
        public void setProducer(Producer producer) {
            this.f79541b[0] = producer;
            this.f79540a.offer(BlockingObservable.f79523c);
        }
    }

    /* renamed from: rx.observables.BlockingObservable$g */
    /* loaded from: classes7.dex */
    public class C13815g implements Action0 {

        /* renamed from: a */
        public final /* synthetic */ BlockingQueue f79543a;

        public C13815g(BlockingQueue blockingQueue) {
            this.f79543a = blockingQueue;
        }

        @Override // p046rx.functions.Action0
        public void call() {
            this.f79543a.offer(BlockingObservable.f79524d);
        }
    }

    /* renamed from: rx.observables.BlockingObservable$h */
    /* loaded from: classes7.dex */
    public class C13816h implements Action1 {
        public C13816h() {
        }

        @Override // p046rx.functions.Action1
        /* renamed from: a */
        public void call(Throwable th2) {
            throw new OnErrorNotImplementedException(th2);
        }
    }

    /* renamed from: rx.observables.BlockingObservable$i */
    /* loaded from: classes7.dex */
    public class C13817i implements Observer {

        /* renamed from: a */
        public final /* synthetic */ Action1 f79546a;

        /* renamed from: b */
        public final /* synthetic */ Action1 f79547b;

        /* renamed from: c */
        public final /* synthetic */ Action0 f79548c;

        public C13817i(Action1 action1, Action1 action12, Action0 action0) {
            this.f79546a = action1;
            this.f79547b = action12;
            this.f79548c = action0;
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            this.f79548c.call();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.f79547b.call(th2);
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            this.f79546a.call(obj);
        }
    }

    public BlockingObservable(Observable observable) {
        this.f79525a = observable;
    }

    public static <T> BlockingObservable<T> from(Observable<? extends T> observable) {
        return new BlockingObservable<>(observable);
    }

    /* renamed from: a */
    public final Object m22983a(Observable observable) {
        AtomicReference atomicReference = new AtomicReference();
        AtomicReference atomicReference2 = new AtomicReference();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        BlockingUtils.awaitForComplete(countDownLatch, observable.subscribe((Subscriber) new C13811c(countDownLatch, atomicReference2, atomicReference)));
        if (atomicReference2.get() != null) {
            Exceptions.propagate((Throwable) atomicReference2.get());
        }
        return atomicReference.get();
    }

    public T first() {
        return (T) m22983a(this.f79525a.first());
    }

    public T firstOrDefault(T t) {
        return (T) m22983a(this.f79525a.map(UtilityFunctions.identity()).firstOrDefault(t));
    }

    public void forEach(Action1<? super T> action1) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        AtomicReference atomicReference = new AtomicReference();
        BlockingUtils.awaitForComplete(countDownLatch, this.f79525a.subscribe((Subscriber) new C13809a(countDownLatch, atomicReference, action1)));
        if (atomicReference.get() != null) {
            Exceptions.propagate((Throwable) atomicReference.get());
        }
    }

    public Iterator<T> getIterator() {
        return BlockingOperatorToIterator.toIterator(this.f79525a);
    }

    public T last() {
        return (T) m22983a(this.f79525a.last());
    }

    public T lastOrDefault(T t) {
        return (T) m22983a(this.f79525a.map(UtilityFunctions.identity()).lastOrDefault(t));
    }

    public Iterable<T> latest() {
        return BlockingOperatorLatest.latest(this.f79525a);
    }

    public Iterable<T> mostRecent(T t) {
        return BlockingOperatorMostRecent.mostRecent(this.f79525a, t);
    }

    public Iterable<T> next() {
        return BlockingOperatorNext.next(this.f79525a);
    }

    public T single() {
        return (T) m22983a(this.f79525a.single());
    }

    public T singleOrDefault(T t) {
        return (T) m22983a(this.f79525a.map(UtilityFunctions.identity()).singleOrDefault(t));
    }

    public void subscribe() {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Throwable[] thArr = {null};
        BlockingUtils.awaitForComplete(countDownLatch, this.f79525a.subscribe((Subscriber) new C13812d(thArr, countDownLatch)));
        Throwable th2 = thArr[0];
        if (th2 != null) {
            Exceptions.propagate(th2);
        }
    }

    public Future<T> toFuture() {
        return BlockingOperatorToFuture.toFuture(this.f79525a);
    }

    public Iterable<T> toIterable() {
        return new C13810b();
    }

    public T first(Func1<? super T, Boolean> func1) {
        return (T) m22983a(this.f79525a.first(func1));
    }

    public T firstOrDefault(T t, Func1<? super T, Boolean> func1) {
        return (T) m22983a(this.f79525a.filter(func1).map(UtilityFunctions.identity()).firstOrDefault(t));
    }

    public T last(Func1<? super T, Boolean> func1) {
        return (T) m22983a(this.f79525a.last(func1));
    }

    public T lastOrDefault(T t, Func1<? super T, Boolean> func1) {
        return (T) m22983a(this.f79525a.filter(func1).map(UtilityFunctions.identity()).lastOrDefault(t));
    }

    public T single(Func1<? super T, Boolean> func1) {
        return (T) m22983a(this.f79525a.single(func1));
    }

    public T singleOrDefault(T t, Func1<? super T, Boolean> func1) {
        return (T) m22983a(this.f79525a.filter(func1).map(UtilityFunctions.identity()).singleOrDefault(t));
    }

    public void subscribe(Observer<? super T> observer) {
        Object poll;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        Subscription subscribe = this.f79525a.subscribe((Subscriber) new C13813e(linkedBlockingQueue));
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
        C13814f c13814f = new C13814f(linkedBlockingQueue, producerArr);
        subscriber.add(c13814f);
        subscriber.add(Subscriptions.create(new C13815g(linkedBlockingQueue)));
        this.f79525a.subscribe((Subscriber) c13814f);
        while (!subscriber.isUnsubscribed()) {
            try {
                try {
                    Object poll = linkedBlockingQueue.poll();
                    if (poll == null) {
                        poll = linkedBlockingQueue.take();
                    }
                    if (subscriber.isUnsubscribed() || poll == f79524d) {
                        break;
                    } else if (poll == f79522b) {
                        subscriber.onStart();
                    } else if (poll == f79523c) {
                        subscriber.setProducer(producerArr[0]);
                    } else if (NotificationLite.accept(subscriber, poll)) {
                        c13814f.unsubscribe();
                        return;
                    }
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    subscriber.onError(e);
                }
            } finally {
                c13814f.unsubscribe();
            }
        }
    }

    public void subscribe(Action1<? super T> action1) {
        subscribe(action1, new C13816h(), Actions.empty());
    }

    public void subscribe(Action1<? super T> action1, Action1<? super Throwable> action12) {
        subscribe(action1, action12, Actions.empty());
    }

    public void subscribe(Action1<? super T> action1, Action1<? super Throwable> action12, Action0 action0) {
        subscribe(new C13817i(action1, action12, action0));
    }
}