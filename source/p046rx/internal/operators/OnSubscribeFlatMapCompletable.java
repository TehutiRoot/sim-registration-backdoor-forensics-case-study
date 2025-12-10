package p046rx.internal.operators;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p046rx.Completable;
import p046rx.CompletableSubscriber;
import p046rx.Observable;
import p046rx.Subscriber;
import p046rx.Subscription;
import p046rx.exceptions.Exceptions;
import p046rx.functions.Func1;
import p046rx.internal.util.ExceptionsUtils;
import p046rx.plugins.RxJavaHooks;
import p046rx.subscriptions.CompositeSubscription;

/* renamed from: rx.internal.operators.OnSubscribeFlatMapCompletable */
/* loaded from: classes7.dex */
public final class OnSubscribeFlatMapCompletable<T> implements Observable.OnSubscribe<T> {

    /* renamed from: a */
    public final Observable f77942a;

    /* renamed from: b */
    public final Func1 f77943b;

    /* renamed from: c */
    public final boolean f77944c;

    /* renamed from: d */
    public final int f77945d;

    /* renamed from: rx.internal.operators.OnSubscribeFlatMapCompletable$FlatMapCompletableSubscriber */
    /* loaded from: classes7.dex */
    public static final class FlatMapCompletableSubscriber extends Subscriber {

        /* renamed from: a */
        public final Subscriber f77946a;

        /* renamed from: b */
        public final Func1 f77947b;

        /* renamed from: c */
        public final boolean f77948c;

        /* renamed from: d */
        public final int f77949d;

        /* renamed from: e */
        public final AtomicInteger f77950e = new AtomicInteger(1);

        /* renamed from: g */
        public final AtomicReference f77952g = new AtomicReference();

        /* renamed from: f */
        public final CompositeSubscription f77951f = new CompositeSubscription();

        /* renamed from: rx.internal.operators.OnSubscribeFlatMapCompletable$FlatMapCompletableSubscriber$InnerSubscriber */
        /* loaded from: classes7.dex */
        public final class InnerSubscriber extends AtomicReference<Subscription> implements CompletableSubscriber, Subscription {
            private static final long serialVersionUID = -8588259593722659900L;

            public InnerSubscriber() {
            }

            @Override // p046rx.Subscription
            public boolean isUnsubscribed() {
                if (get() == this) {
                    return true;
                }
                return false;
            }

            @Override // p046rx.CompletableSubscriber
            public void onCompleted() {
                FlatMapCompletableSubscriber.this.m23123c(this);
            }

            @Override // p046rx.CompletableSubscriber
            public void onError(Throwable th2) {
                FlatMapCompletableSubscriber.this.m23122d(this, th2);
            }

            @Override // p046rx.CompletableSubscriber
            public void onSubscribe(Subscription subscription) {
                if (!compareAndSet(null, subscription)) {
                    subscription.unsubscribe();
                    if (get() != this) {
                        RxJavaHooks.onError(new IllegalStateException("Subscription already set!"));
                    }
                }
            }

            @Override // p046rx.Subscription
            public void unsubscribe() {
                Subscription andSet = getAndSet(this);
                if (andSet != null && andSet != this) {
                    andSet.unsubscribe();
                }
            }
        }

        public FlatMapCompletableSubscriber(Subscriber subscriber, Func1 func1, boolean z, int i) {
            long j;
            this.f77946a = subscriber;
            this.f77947b = func1;
            this.f77948c = z;
            this.f77949d = i;
            if (i != Integer.MAX_VALUE) {
                j = i;
            } else {
                j = Long.MAX_VALUE;
            }
            request(j);
        }

        /* renamed from: b */
        public boolean m23124b() {
            if (this.f77950e.decrementAndGet() == 0) {
                Throwable terminate = ExceptionsUtils.terminate(this.f77952g);
                if (terminate != null) {
                    this.f77946a.onError(terminate);
                    return true;
                }
                this.f77946a.onCompleted();
                return true;
            }
            return false;
        }

        /* renamed from: c */
        public void m23123c(InnerSubscriber innerSubscriber) {
            this.f77951f.remove(innerSubscriber);
            if (!m23124b() && this.f77949d != Integer.MAX_VALUE) {
                request(1L);
            }
        }

        /* renamed from: d */
        public void m23122d(InnerSubscriber innerSubscriber, Throwable th2) {
            this.f77951f.remove(innerSubscriber);
            if (this.f77948c) {
                ExceptionsUtils.addThrowable(this.f77952g, th2);
                if (!m23124b() && this.f77949d != Integer.MAX_VALUE) {
                    request(1L);
                    return;
                }
                return;
            }
            this.f77951f.unsubscribe();
            unsubscribe();
            if (AbstractC17300An1.m69050a(this.f77952g, null, th2)) {
                this.f77946a.onError(ExceptionsUtils.terminate(this.f77952g));
            } else {
                RxJavaHooks.onError(th2);
            }
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            m23124b();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            if (this.f77948c) {
                ExceptionsUtils.addThrowable(this.f77952g, th2);
                onCompleted();
                return;
            }
            this.f77951f.unsubscribe();
            if (AbstractC17300An1.m69050a(this.f77952g, null, th2)) {
                this.f77946a.onError(ExceptionsUtils.terminate(this.f77952g));
            } else {
                RxJavaHooks.onError(th2);
            }
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            try {
                Completable completable = (Completable) this.f77947b.call(obj);
                if (completable != null) {
                    InnerSubscriber innerSubscriber = new InnerSubscriber();
                    this.f77951f.add(innerSubscriber);
                    this.f77950e.getAndIncrement();
                    completable.unsafeSubscribe(innerSubscriber);
                    return;
                }
                throw new NullPointerException("The mapper returned a null Completable");
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                unsubscribe();
                onError(th2);
            }
        }
    }

    public OnSubscribeFlatMapCompletable(Observable<T> observable, Func1<? super T, ? extends Completable> func1, boolean z, int i) {
        if (func1 != null) {
            if (i > 0) {
                this.f77942a = observable;
                this.f77943b = func1;
                this.f77944c = z;
                this.f77945d = i;
                return;
            }
            throw new IllegalArgumentException("maxConcurrency > 0 required but it was " + i);
        }
        throw new NullPointerException("mapper is null");
    }

    @Override // p046rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((Subscriber) ((Subscriber) obj));
    }

    public void call(Subscriber<? super T> subscriber) {
        FlatMapCompletableSubscriber flatMapCompletableSubscriber = new FlatMapCompletableSubscriber(subscriber, this.f77943b, this.f77944c, this.f77945d);
        subscriber.add(flatMapCompletableSubscriber);
        subscriber.add(flatMapCompletableSubscriber.f77951f);
        this.f77942a.unsafeSubscribe(flatMapCompletableSubscriber);
    }
}
