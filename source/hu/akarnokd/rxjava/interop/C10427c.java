package hu.akarnokd.rxjava.interop;

import hu.akarnokd.rxjava.interop.C10422a;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.processors.FlowableProcessor;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import p046rx.subjects.Subject;

/* renamed from: hu.akarnokd.rxjava.interop.c */
/* loaded from: classes5.dex */
public final class C10427c extends FlowableProcessor {

    /* renamed from: b */
    public final Subject f62646b;

    /* renamed from: c */
    public volatile boolean f62647c;

    /* renamed from: d */
    public Throwable f62648d;

    public C10427c(Subject subject) {
        this.f62646b = subject;
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public Throwable getThrowable() {
        if (this.f62647c) {
            return this.f62648d;
        }
        return null;
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasComplete() {
        if (this.f62647c && this.f62648d == null) {
            return true;
        }
        return false;
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasSubscribers() {
        return this.f62646b.hasObservers();
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasThrowable() {
        if (this.f62647c && this.f62648d != null) {
            return true;
        }
        return false;
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
        if (!this.f62647c) {
            this.f62647c = true;
            this.f62646b.onCompleted();
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(Throwable th2) {
        if (!this.f62647c) {
            if (th2 == null) {
                th2 = new NullPointerException("Throwable was null");
            }
            this.f62648d = th2;
            this.f62647c = true;
            this.f62646b.onError(th2);
            return;
        }
        RxJavaPlugins.onError(th2);
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(Object obj) {
        if (!this.f62647c) {
            if (obj == null) {
                onError(new NullPointerException());
            } else {
                this.f62646b.onNext(obj);
            }
        }
    }

    @Override // org.reactivestreams.Subscriber, io.reactivex.FlowableSubscriber
    public void onSubscribe(Subscription subscription) {
        if (this.f62647c) {
            subscription.cancel();
        } else {
            subscription.request(Long.MAX_VALUE);
        }
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber) {
        C10422a.C10423a c10423a = new C10422a.C10423a(subscriber);
        subscriber.onSubscribe(new C10422a.C10424b(c10423a));
        this.f62646b.unsafeSubscribe(c10423a);
    }
}
