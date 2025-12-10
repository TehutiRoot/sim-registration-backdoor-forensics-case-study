package p000;

import io.reactivex.internal.util.AppendOnlyLinkedArrayList;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.processors.FlowableProcessor;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* renamed from: OF1 */
/* loaded from: classes5.dex */
public final class OF1 extends FlowableProcessor {

    /* renamed from: b */
    public final FlowableProcessor f4352b;

    /* renamed from: c */
    public boolean f4353c;

    /* renamed from: d */
    public AppendOnlyLinkedArrayList f4354d;

    /* renamed from: e */
    public volatile boolean f4355e;

    public OF1(FlowableProcessor flowableProcessor) {
        this.f4352b = flowableProcessor;
    }

    /* renamed from: e */
    public void m67106e() {
        AppendOnlyLinkedArrayList appendOnlyLinkedArrayList;
        while (true) {
            synchronized (this) {
                try {
                    appendOnlyLinkedArrayList = this.f4354d;
                    if (appendOnlyLinkedArrayList == null) {
                        this.f4353c = false;
                        return;
                    }
                    this.f4354d = null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            appendOnlyLinkedArrayList.accept(this.f4352b);
        }
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public Throwable getThrowable() {
        return this.f4352b.getThrowable();
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasComplete() {
        return this.f4352b.hasComplete();
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasSubscribers() {
        return this.f4352b.hasSubscribers();
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasThrowable() {
        return this.f4352b.hasThrowable();
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
        if (this.f4355e) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f4355e) {
                    return;
                }
                this.f4355e = true;
                if (this.f4353c) {
                    AppendOnlyLinkedArrayList appendOnlyLinkedArrayList = this.f4354d;
                    if (appendOnlyLinkedArrayList == null) {
                        appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList(4);
                        this.f4354d = appendOnlyLinkedArrayList;
                    }
                    appendOnlyLinkedArrayList.add(NotificationLite.complete());
                    return;
                }
                this.f4353c = true;
                this.f4352b.onComplete();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(Throwable th2) {
        if (this.f4355e) {
            RxJavaPlugins.onError(th2);
            return;
        }
        synchronized (this) {
            try {
                boolean z = true;
                if (!this.f4355e) {
                    this.f4355e = true;
                    if (this.f4353c) {
                        AppendOnlyLinkedArrayList appendOnlyLinkedArrayList = this.f4354d;
                        if (appendOnlyLinkedArrayList == null) {
                            appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList(4);
                            this.f4354d = appendOnlyLinkedArrayList;
                        }
                        appendOnlyLinkedArrayList.setFirst(NotificationLite.error(th2));
                        return;
                    }
                    this.f4353c = true;
                    z = false;
                }
                if (z) {
                    RxJavaPlugins.onError(th2);
                } else {
                    this.f4352b.onError(th2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(Object obj) {
        if (this.f4355e) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f4355e) {
                    return;
                }
                if (this.f4353c) {
                    AppendOnlyLinkedArrayList appendOnlyLinkedArrayList = this.f4354d;
                    if (appendOnlyLinkedArrayList == null) {
                        appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList(4);
                        this.f4354d = appendOnlyLinkedArrayList;
                    }
                    appendOnlyLinkedArrayList.add(NotificationLite.next(obj));
                    return;
                }
                this.f4353c = true;
                this.f4352b.onNext(obj);
                m67106e();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // org.reactivestreams.Subscriber, io.reactivex.FlowableSubscriber
    public void onSubscribe(Subscription subscription) {
        boolean z = true;
        if (!this.f4355e) {
            synchronized (this) {
                try {
                    if (!this.f4355e) {
                        if (this.f4353c) {
                            AppendOnlyLinkedArrayList appendOnlyLinkedArrayList = this.f4354d;
                            if (appendOnlyLinkedArrayList == null) {
                                appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList(4);
                                this.f4354d = appendOnlyLinkedArrayList;
                            }
                            appendOnlyLinkedArrayList.add(NotificationLite.subscription(subscription));
                            return;
                        }
                        this.f4353c = true;
                        z = false;
                    }
                } finally {
                }
            }
        }
        if (z) {
            subscription.cancel();
            return;
        }
        this.f4352b.onSubscribe(subscription);
        m67106e();
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber) {
        this.f4352b.subscribe(subscriber);
    }
}
