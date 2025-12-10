package p046rx.internal.operators;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import p046rx.Observable;
import p046rx.Subscriber;
import p046rx.Subscription;
import p046rx.functions.Action0;
import p046rx.functions.Action1;
import p046rx.observables.ConnectableObservable;
import p046rx.subscriptions.CompositeSubscription;
import p046rx.subscriptions.Subscriptions;

/* renamed from: rx.internal.operators.OnSubscribeRefCount */
/* loaded from: classes7.dex */
public final class OnSubscribeRefCount<T> implements Observable.OnSubscribe<T> {

    /* renamed from: a */
    public final ConnectableObservable f78095a;

    /* renamed from: b */
    public volatile CompositeSubscription f78096b = new CompositeSubscription();

    /* renamed from: c */
    public final AtomicInteger f78097c = new AtomicInteger(0);

    /* renamed from: d */
    public final ReentrantLock f78098d = new ReentrantLock();

    /* renamed from: rx.internal.operators.OnSubscribeRefCount$a */
    /* loaded from: classes7.dex */
    public class C13508a implements Action1 {

        /* renamed from: a */
        public final /* synthetic */ Subscriber f78099a;

        /* renamed from: b */
        public final /* synthetic */ AtomicBoolean f78100b;

        public C13508a(Subscriber subscriber, AtomicBoolean atomicBoolean) {
            this.f78099a = subscriber;
            this.f78100b = atomicBoolean;
        }

        @Override // p046rx.functions.Action1
        /* renamed from: a */
        public void call(Subscription subscription) {
            try {
                OnSubscribeRefCount.this.f78096b.add(subscription);
                OnSubscribeRefCount onSubscribeRefCount = OnSubscribeRefCount.this;
                onSubscribeRefCount.m23102c(this.f78099a, onSubscribeRefCount.f78096b);
            } finally {
                OnSubscribeRefCount.this.f78098d.unlock();
                this.f78100b.set(false);
            }
        }
    }

    /* renamed from: rx.internal.operators.OnSubscribeRefCount$b */
    /* loaded from: classes7.dex */
    public class C13509b extends Subscriber {

        /* renamed from: a */
        public final /* synthetic */ Subscriber f78102a;

        /* renamed from: b */
        public final /* synthetic */ CompositeSubscription f78103b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13509b(Subscriber subscriber, Subscriber subscriber2, CompositeSubscription compositeSubscription) {
            super(subscriber);
            this.f78102a = subscriber2;
            this.f78103b = compositeSubscription;
        }

        /* renamed from: b */
        public void m23099b() {
            OnSubscribeRefCount.this.f78098d.lock();
            try {
                if (OnSubscribeRefCount.this.f78096b == this.f78103b) {
                    if (OnSubscribeRefCount.this.f78095a instanceof Subscription) {
                        ((Subscription) OnSubscribeRefCount.this.f78095a).unsubscribe();
                    }
                    OnSubscribeRefCount.this.f78096b.unsubscribe();
                    OnSubscribeRefCount.this.f78096b = new CompositeSubscription();
                    OnSubscribeRefCount.this.f78097c.set(0);
                }
                OnSubscribeRefCount.this.f78098d.unlock();
            } catch (Throwable th2) {
                OnSubscribeRefCount.this.f78098d.unlock();
                throw th2;
            }
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            m23099b();
            this.f78102a.onCompleted();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            m23099b();
            this.f78102a.onError(th2);
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            this.f78102a.onNext(obj);
        }
    }

    /* renamed from: rx.internal.operators.OnSubscribeRefCount$c */
    /* loaded from: classes7.dex */
    public class C13510c implements Action0 {

        /* renamed from: a */
        public final /* synthetic */ CompositeSubscription f78105a;

        public C13510c(CompositeSubscription compositeSubscription) {
            this.f78105a = compositeSubscription;
        }

        @Override // p046rx.functions.Action0
        public void call() {
            OnSubscribeRefCount.this.f78098d.lock();
            try {
                if (OnSubscribeRefCount.this.f78096b == this.f78105a && OnSubscribeRefCount.this.f78097c.decrementAndGet() == 0) {
                    if (OnSubscribeRefCount.this.f78095a instanceof Subscription) {
                        ((Subscription) OnSubscribeRefCount.this.f78095a).unsubscribe();
                    }
                    OnSubscribeRefCount.this.f78096b.unsubscribe();
                    OnSubscribeRefCount.this.f78096b = new CompositeSubscription();
                }
                OnSubscribeRefCount.this.f78098d.unlock();
            } catch (Throwable th2) {
                OnSubscribeRefCount.this.f78098d.unlock();
                throw th2;
            }
        }
    }

    public OnSubscribeRefCount(ConnectableObservable<? extends T> connectableObservable) {
        this.f78095a = connectableObservable;
    }

    /* renamed from: b */
    public final Subscription m23103b(CompositeSubscription compositeSubscription) {
        return Subscriptions.create(new C13510c(compositeSubscription));
    }

    /* renamed from: c */
    public void m23102c(Subscriber subscriber, CompositeSubscription compositeSubscription) {
        subscriber.add(m23103b(compositeSubscription));
        this.f78095a.unsafeSubscribe(new C13509b(subscriber, subscriber, compositeSubscription));
    }

    @Override // p046rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((Subscriber) ((Subscriber) obj));
    }

    /* renamed from: d */
    public final Action1 m23101d(Subscriber subscriber, AtomicBoolean atomicBoolean) {
        return new C13508a(subscriber, atomicBoolean);
    }

    public void call(Subscriber<? super T> subscriber) {
        boolean z;
        this.f78098d.lock();
        if (this.f78097c.incrementAndGet() == 1) {
            AtomicBoolean atomicBoolean = new AtomicBoolean(true);
            try {
                this.f78095a.connect(m23101d(subscriber, atomicBoolean));
                if (z) {
                    return;
                }
                return;
            } finally {
                if (atomicBoolean.get()) {
                }
            }
        }
        try {
            m23102c(subscriber, this.f78096b);
        } finally {
            this.f78098d.unlock();
        }
    }
}
