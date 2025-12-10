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
    public final ConnectableObservable f78301a;

    /* renamed from: b */
    public volatile CompositeSubscription f78302b = new CompositeSubscription();

    /* renamed from: c */
    public final AtomicInteger f78303c = new AtomicInteger(0);

    /* renamed from: d */
    public final ReentrantLock f78304d = new ReentrantLock();

    /* renamed from: rx.internal.operators.OnSubscribeRefCount$a */
    /* loaded from: classes7.dex */
    public class C13509a implements Action1 {

        /* renamed from: a */
        public final /* synthetic */ Subscriber f78305a;

        /* renamed from: b */
        public final /* synthetic */ AtomicBoolean f78306b;

        public C13509a(Subscriber subscriber, AtomicBoolean atomicBoolean) {
            this.f78305a = subscriber;
            this.f78306b = atomicBoolean;
        }

        @Override // p046rx.functions.Action1
        /* renamed from: a */
        public void call(Subscription subscription) {
            try {
                OnSubscribeRefCount.this.f78302b.add(subscription);
                OnSubscribeRefCount onSubscribeRefCount = OnSubscribeRefCount.this;
                onSubscribeRefCount.m23290c(this.f78305a, onSubscribeRefCount.f78302b);
            } finally {
                OnSubscribeRefCount.this.f78304d.unlock();
                this.f78306b.set(false);
            }
        }
    }

    /* renamed from: rx.internal.operators.OnSubscribeRefCount$b */
    /* loaded from: classes7.dex */
    public class C13510b extends Subscriber {

        /* renamed from: a */
        public final /* synthetic */ Subscriber f78308a;

        /* renamed from: b */
        public final /* synthetic */ CompositeSubscription f78309b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13510b(Subscriber subscriber, Subscriber subscriber2, CompositeSubscription compositeSubscription) {
            super(subscriber);
            this.f78308a = subscriber2;
            this.f78309b = compositeSubscription;
        }

        /* renamed from: b */
        public void m23287b() {
            OnSubscribeRefCount.this.f78304d.lock();
            try {
                if (OnSubscribeRefCount.this.f78302b == this.f78309b) {
                    if (OnSubscribeRefCount.this.f78301a instanceof Subscription) {
                        ((Subscription) OnSubscribeRefCount.this.f78301a).unsubscribe();
                    }
                    OnSubscribeRefCount.this.f78302b.unsubscribe();
                    OnSubscribeRefCount.this.f78302b = new CompositeSubscription();
                    OnSubscribeRefCount.this.f78303c.set(0);
                }
                OnSubscribeRefCount.this.f78304d.unlock();
            } catch (Throwable th2) {
                OnSubscribeRefCount.this.f78304d.unlock();
                throw th2;
            }
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            m23287b();
            this.f78308a.onCompleted();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            m23287b();
            this.f78308a.onError(th2);
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            this.f78308a.onNext(obj);
        }
    }

    /* renamed from: rx.internal.operators.OnSubscribeRefCount$c */
    /* loaded from: classes7.dex */
    public class C13511c implements Action0 {

        /* renamed from: a */
        public final /* synthetic */ CompositeSubscription f78311a;

        public C13511c(CompositeSubscription compositeSubscription) {
            this.f78311a = compositeSubscription;
        }

        @Override // p046rx.functions.Action0
        public void call() {
            OnSubscribeRefCount.this.f78304d.lock();
            try {
                if (OnSubscribeRefCount.this.f78302b == this.f78311a && OnSubscribeRefCount.this.f78303c.decrementAndGet() == 0) {
                    if (OnSubscribeRefCount.this.f78301a instanceof Subscription) {
                        ((Subscription) OnSubscribeRefCount.this.f78301a).unsubscribe();
                    }
                    OnSubscribeRefCount.this.f78302b.unsubscribe();
                    OnSubscribeRefCount.this.f78302b = new CompositeSubscription();
                }
                OnSubscribeRefCount.this.f78304d.unlock();
            } catch (Throwable th2) {
                OnSubscribeRefCount.this.f78304d.unlock();
                throw th2;
            }
        }
    }

    public OnSubscribeRefCount(ConnectableObservable<? extends T> connectableObservable) {
        this.f78301a = connectableObservable;
    }

    /* renamed from: b */
    public final Subscription m23291b(CompositeSubscription compositeSubscription) {
        return Subscriptions.create(new C13511c(compositeSubscription));
    }

    /* renamed from: c */
    public void m23290c(Subscriber subscriber, CompositeSubscription compositeSubscription) {
        subscriber.add(m23291b(compositeSubscription));
        this.f78301a.unsafeSubscribe(new C13510b(subscriber, subscriber, compositeSubscription));
    }

    @Override // p046rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((Subscriber) ((Subscriber) obj));
    }

    /* renamed from: d */
    public final Action1 m23289d(Subscriber subscriber, AtomicBoolean atomicBoolean) {
        return new C13509a(subscriber, atomicBoolean);
    }

    public void call(Subscriber<? super T> subscriber) {
        boolean z;
        this.f78304d.lock();
        if (this.f78303c.incrementAndGet() == 1) {
            AtomicBoolean atomicBoolean = new AtomicBoolean(true);
            try {
                this.f78301a.connect(m23289d(subscriber, atomicBoolean));
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
            m23290c(subscriber, this.f78302b);
        } finally {
            this.f78304d.unlock();
        }
    }
}