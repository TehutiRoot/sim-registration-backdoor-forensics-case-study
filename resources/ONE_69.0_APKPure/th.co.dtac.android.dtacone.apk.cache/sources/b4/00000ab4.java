package p000;

import io.reactivex.internal.util.AppendOnlyLinkedArrayList;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.processors.FlowableProcessor;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* renamed from: LG1 */
/* loaded from: classes5.dex */
public final class LG1 extends FlowableProcessor {

    /* renamed from: b */
    public final FlowableProcessor f3560b;

    /* renamed from: c */
    public boolean f3561c;

    /* renamed from: d */
    public AppendOnlyLinkedArrayList f3562d;

    /* renamed from: e */
    public volatile boolean f3563e;

    public LG1(FlowableProcessor flowableProcessor) {
        this.f3560b = flowableProcessor;
    }

    /* renamed from: e */
    public void m67611e() {
        AppendOnlyLinkedArrayList appendOnlyLinkedArrayList;
        while (true) {
            synchronized (this) {
                try {
                    appendOnlyLinkedArrayList = this.f3562d;
                    if (appendOnlyLinkedArrayList == null) {
                        this.f3561c = false;
                        return;
                    }
                    this.f3562d = null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            appendOnlyLinkedArrayList.accept(this.f3560b);
        }
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public Throwable getThrowable() {
        return this.f3560b.getThrowable();
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasComplete() {
        return this.f3560b.hasComplete();
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasSubscribers() {
        return this.f3560b.hasSubscribers();
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasThrowable() {
        return this.f3560b.hasThrowable();
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
        if (this.f3563e) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f3563e) {
                    return;
                }
                this.f3563e = true;
                if (this.f3561c) {
                    AppendOnlyLinkedArrayList appendOnlyLinkedArrayList = this.f3562d;
                    if (appendOnlyLinkedArrayList == null) {
                        appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList(4);
                        this.f3562d = appendOnlyLinkedArrayList;
                    }
                    appendOnlyLinkedArrayList.add(NotificationLite.complete());
                    return;
                }
                this.f3561c = true;
                this.f3560b.onComplete();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(Throwable th2) {
        if (this.f3563e) {
            RxJavaPlugins.onError(th2);
            return;
        }
        synchronized (this) {
            try {
                boolean z = true;
                if (!this.f3563e) {
                    this.f3563e = true;
                    if (this.f3561c) {
                        AppendOnlyLinkedArrayList appendOnlyLinkedArrayList = this.f3562d;
                        if (appendOnlyLinkedArrayList == null) {
                            appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList(4);
                            this.f3562d = appendOnlyLinkedArrayList;
                        }
                        appendOnlyLinkedArrayList.setFirst(NotificationLite.error(th2));
                        return;
                    }
                    this.f3561c = true;
                    z = false;
                }
                if (z) {
                    RxJavaPlugins.onError(th2);
                } else {
                    this.f3560b.onError(th2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(Object obj) {
        if (this.f3563e) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f3563e) {
                    return;
                }
                if (this.f3561c) {
                    AppendOnlyLinkedArrayList appendOnlyLinkedArrayList = this.f3562d;
                    if (appendOnlyLinkedArrayList == null) {
                        appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList(4);
                        this.f3562d = appendOnlyLinkedArrayList;
                    }
                    appendOnlyLinkedArrayList.add(NotificationLite.next(obj));
                    return;
                }
                this.f3561c = true;
                this.f3560b.onNext(obj);
                m67611e();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // org.reactivestreams.Subscriber, io.reactivex.FlowableSubscriber
    public void onSubscribe(Subscription subscription) {
        boolean z = true;
        if (!this.f3563e) {
            synchronized (this) {
                try {
                    if (!this.f3563e) {
                        if (this.f3561c) {
                            AppendOnlyLinkedArrayList appendOnlyLinkedArrayList = this.f3562d;
                            if (appendOnlyLinkedArrayList == null) {
                                appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList(4);
                                this.f3562d = appendOnlyLinkedArrayList;
                            }
                            appendOnlyLinkedArrayList.add(NotificationLite.subscription(subscription));
                            return;
                        }
                        this.f3561c = true;
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
        this.f3560b.onSubscribe(subscription);
        m67611e();
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber) {
        this.f3560b.subscribe(subscriber);
    }
}