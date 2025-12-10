package io.reactivex.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes5.dex */
public final class SafeSubscriber<T> implements FlowableSubscriber<T>, Subscription {

    /* renamed from: a */
    public final Subscriber f66455a;

    /* renamed from: b */
    public Subscription f66456b;

    /* renamed from: c */
    public boolean f66457c;

    public SafeSubscriber(Subscriber<? super T> subscriber) {
        this.f66455a = subscriber;
    }

    /* renamed from: a */
    public void m29765a() {
        NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
        try {
            this.f66455a.onSubscribe(EmptySubscription.INSTANCE);
            try {
                this.f66455a.onError(nullPointerException);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                RxJavaPlugins.onError(new CompositeException(nullPointerException, th2));
            }
        } catch (Throwable th3) {
            Exceptions.throwIfFatal(th3);
            RxJavaPlugins.onError(new CompositeException(nullPointerException, th3));
        }
    }

    /* renamed from: b */
    public void m29764b() {
        this.f66457c = true;
        NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
        try {
            this.f66455a.onSubscribe(EmptySubscription.INSTANCE);
            try {
                this.f66455a.onError(nullPointerException);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                RxJavaPlugins.onError(new CompositeException(nullPointerException, th2));
            }
        } catch (Throwable th3) {
            Exceptions.throwIfFatal(th3);
            RxJavaPlugins.onError(new CompositeException(nullPointerException, th3));
        }
    }

    @Override // org.reactivestreams.Subscription
    public void cancel() {
        try {
            this.f66456b.cancel();
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            RxJavaPlugins.onError(th2);
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
        if (this.f66457c) {
            return;
        }
        this.f66457c = true;
        if (this.f66456b == null) {
            m29765a();
            return;
        }
        try {
            this.f66455a.onComplete();
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            RxJavaPlugins.onError(th2);
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(Throwable th2) {
        if (this.f66457c) {
            RxJavaPlugins.onError(th2);
            return;
        }
        this.f66457c = true;
        if (this.f66456b == null) {
            NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
            try {
                this.f66455a.onSubscribe(EmptySubscription.INSTANCE);
                try {
                    this.f66455a.onError(new CompositeException(th2, nullPointerException));
                    return;
                } catch (Throwable th3) {
                    Exceptions.throwIfFatal(th3);
                    RxJavaPlugins.onError(new CompositeException(th2, nullPointerException, th3));
                    return;
                }
            } catch (Throwable th4) {
                Exceptions.throwIfFatal(th4);
                RxJavaPlugins.onError(new CompositeException(th2, nullPointerException, th4));
                return;
            }
        }
        if (th2 == null) {
            th2 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        }
        try {
            this.f66455a.onError(th2);
        } catch (Throwable th5) {
            Exceptions.throwIfFatal(th5);
            RxJavaPlugins.onError(new CompositeException(th2, th5));
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(T t) {
        if (this.f66457c) {
            return;
        }
        if (this.f66456b == null) {
            m29764b();
        } else if (t == null) {
            NullPointerException nullPointerException = new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
            try {
                this.f66456b.cancel();
                onError(nullPointerException);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                onError(new CompositeException(nullPointerException, th2));
            }
        } else {
            try {
                this.f66455a.onNext(t);
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                try {
                    this.f66456b.cancel();
                    onError(th3);
                } catch (Throwable th4) {
                    Exceptions.throwIfFatal(th4);
                    onError(new CompositeException(th3, th4));
                }
            }
        }
    }

    @Override // io.reactivex.FlowableSubscriber
    public void onSubscribe(Subscription subscription) {
        if (SubscriptionHelper.validate(this.f66456b, subscription)) {
            this.f66456b = subscription;
            try {
                this.f66455a.onSubscribe(this);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f66457c = true;
                try {
                    subscription.cancel();
                    RxJavaPlugins.onError(th2);
                } catch (Throwable th3) {
                    Exceptions.throwIfFatal(th3);
                    RxJavaPlugins.onError(new CompositeException(th2, th3));
                }
            }
        }
    }

    @Override // org.reactivestreams.Subscription
    public void request(long j) {
        try {
            this.f66456b.request(j);
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            try {
                this.f66456b.cancel();
                RxJavaPlugins.onError(th2);
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                RxJavaPlugins.onError(new CompositeException(th2, th3));
            }
        }
    }
}
