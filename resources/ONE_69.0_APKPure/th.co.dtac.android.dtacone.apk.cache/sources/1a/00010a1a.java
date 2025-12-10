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
    public final Observable f78148a;

    /* renamed from: b */
    public final Func1 f78149b;

    /* renamed from: c */
    public final boolean f78150c;

    /* renamed from: d */
    public final int f78151d;

    /* renamed from: rx.internal.operators.OnSubscribeFlatMapCompletable$FlatMapCompletableSubscriber */
    /* loaded from: classes7.dex */
    public static final class FlatMapCompletableSubscriber extends Subscriber {

        /* renamed from: a */
        public final Subscriber f78152a;

        /* renamed from: b */
        public final Func1 f78153b;

        /* renamed from: c */
        public final boolean f78154c;

        /* renamed from: d */
        public final int f78155d;

        /* renamed from: e */
        public final AtomicInteger f78156e = new AtomicInteger(1);

        /* renamed from: g */
        public final AtomicReference f78158g = new AtomicReference();

        /* renamed from: f */
        public final CompositeSubscription f78157f = new CompositeSubscription();

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
                FlatMapCompletableSubscriber.this.m23311c(this);
            }

            @Override // p046rx.CompletableSubscriber
            public void onError(Throwable th2) {
                FlatMapCompletableSubscriber.this.m23310d(this, th2);
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
            this.f78152a = subscriber;
            this.f78153b = func1;
            this.f78154c = z;
            this.f78155d = i;
            if (i != Integer.MAX_VALUE) {
                j = i;
            } else {
                j = Long.MAX_VALUE;
            }
            request(j);
        }

        /* renamed from: b */
        public boolean m23312b() {
            if (this.f78156e.decrementAndGet() == 0) {
                Throwable terminate = ExceptionsUtils.terminate(this.f78158g);
                if (terminate != null) {
                    this.f78152a.onError(terminate);
                    return true;
                }
                this.f78152a.onCompleted();
                return true;
            }
            return false;
        }

        /* renamed from: c */
        public void m23311c(InnerSubscriber innerSubscriber) {
            this.f78157f.remove(innerSubscriber);
            if (!m23312b() && this.f78155d != Integer.MAX_VALUE) {
                request(1L);
            }
        }

        /* renamed from: d */
        public void m23310d(InnerSubscriber innerSubscriber, Throwable th2) {
            this.f78157f.remove(innerSubscriber);
            if (this.f78154c) {
                ExceptionsUtils.addThrowable(this.f78158g, th2);
                if (!m23312b() && this.f78155d != Integer.MAX_VALUE) {
                    request(1L);
                    return;
                }
                return;
            }
            this.f78157f.unsubscribe();
            unsubscribe();
            if (AbstractC23094xo1.m479a(this.f78158g, null, th2)) {
                this.f78152a.onError(ExceptionsUtils.terminate(this.f78158g));
            } else {
                RxJavaHooks.onError(th2);
            }
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            m23312b();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            if (this.f78154c) {
                ExceptionsUtils.addThrowable(this.f78158g, th2);
                onCompleted();
                return;
            }
            this.f78157f.unsubscribe();
            if (AbstractC23094xo1.m479a(this.f78158g, null, th2)) {
                this.f78152a.onError(ExceptionsUtils.terminate(this.f78158g));
            } else {
                RxJavaHooks.onError(th2);
            }
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            try {
                Completable completable = (Completable) this.f78153b.call(obj);
                if (completable != null) {
                    InnerSubscriber innerSubscriber = new InnerSubscriber();
                    this.f78157f.add(innerSubscriber);
                    this.f78156e.getAndIncrement();
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
                this.f78148a = observable;
                this.f78149b = func1;
                this.f78150c = z;
                this.f78151d = i;
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
        FlatMapCompletableSubscriber flatMapCompletableSubscriber = new FlatMapCompletableSubscriber(subscriber, this.f78149b, this.f78150c, this.f78151d);
        subscriber.add(flatMapCompletableSubscriber);
        subscriber.add(flatMapCompletableSubscriber.f78157f);
        this.f78148a.unsafeSubscribe(flatMapCompletableSubscriber);
    }
}