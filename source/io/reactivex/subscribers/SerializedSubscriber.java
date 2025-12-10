package io.reactivex.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AppendOnlyLinkedArrayList;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes5.dex */
public final class SerializedSubscriber<T> implements FlowableSubscriber<T>, Subscription {

    /* renamed from: a */
    public final Subscriber f66458a;

    /* renamed from: b */
    public final boolean f66459b;

    /* renamed from: c */
    public Subscription f66460c;

    /* renamed from: d */
    public boolean f66461d;

    /* renamed from: e */
    public AppendOnlyLinkedArrayList f66462e;

    /* renamed from: f */
    public volatile boolean f66463f;

    public SerializedSubscriber(Subscriber<? super T> subscriber) {
        this(subscriber, false);
    }

    /* renamed from: a */
    public void m29763a() {
        AppendOnlyLinkedArrayList appendOnlyLinkedArrayList;
        do {
            synchronized (this) {
                try {
                    appendOnlyLinkedArrayList = this.f66462e;
                    if (appendOnlyLinkedArrayList == null) {
                        this.f66461d = false;
                        return;
                    }
                    this.f66462e = null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } while (!appendOnlyLinkedArrayList.accept(this.f66458a));
    }

    @Override // org.reactivestreams.Subscription
    public void cancel() {
        this.f66460c.cancel();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
        if (this.f66463f) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f66463f) {
                    return;
                }
                if (this.f66461d) {
                    AppendOnlyLinkedArrayList appendOnlyLinkedArrayList = this.f66462e;
                    AppendOnlyLinkedArrayList appendOnlyLinkedArrayList2 = appendOnlyLinkedArrayList;
                    if (appendOnlyLinkedArrayList == null) {
                        AppendOnlyLinkedArrayList appendOnlyLinkedArrayList3 = new AppendOnlyLinkedArrayList(4);
                        this.f66462e = appendOnlyLinkedArrayList3;
                        appendOnlyLinkedArrayList2 = appendOnlyLinkedArrayList3;
                    }
                    appendOnlyLinkedArrayList2.add(NotificationLite.complete());
                    return;
                }
                this.f66463f = true;
                this.f66461d = true;
                this.f66458a.onComplete();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.reactivestreams.Subscriber
    public void onError(Throwable th2) {
        if (this.f66463f) {
            RxJavaPlugins.onError(th2);
            return;
        }
        synchronized (this) {
            try {
                boolean z = true;
                if (!this.f66463f) {
                    if (this.f66461d) {
                        this.f66463f = true;
                        AppendOnlyLinkedArrayList appendOnlyLinkedArrayList = this.f66462e;
                        AppendOnlyLinkedArrayList appendOnlyLinkedArrayList2 = appendOnlyLinkedArrayList;
                        if (appendOnlyLinkedArrayList == null) {
                            AppendOnlyLinkedArrayList appendOnlyLinkedArrayList3 = new AppendOnlyLinkedArrayList(4);
                            this.f66462e = appendOnlyLinkedArrayList3;
                            appendOnlyLinkedArrayList2 = appendOnlyLinkedArrayList3;
                        }
                        Object error = NotificationLite.error(th2);
                        if (this.f66459b) {
                            appendOnlyLinkedArrayList2.add(error);
                        } else {
                            appendOnlyLinkedArrayList2.setFirst(error);
                        }
                        return;
                    }
                    this.f66463f = true;
                    this.f66461d = true;
                    z = false;
                }
                if (z) {
                    RxJavaPlugins.onError(th2);
                } else {
                    this.f66458a.onError(th2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.reactivestreams.Subscriber
    public void onNext(T t) {
        if (this.f66463f) {
            return;
        }
        if (t == null) {
            this.f66460c.cancel();
            onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            return;
        }
        synchronized (this) {
            try {
                if (this.f66463f) {
                    return;
                }
                if (this.f66461d) {
                    AppendOnlyLinkedArrayList appendOnlyLinkedArrayList = this.f66462e;
                    AppendOnlyLinkedArrayList appendOnlyLinkedArrayList2 = appendOnlyLinkedArrayList;
                    if (appendOnlyLinkedArrayList == null) {
                        AppendOnlyLinkedArrayList appendOnlyLinkedArrayList3 = new AppendOnlyLinkedArrayList(4);
                        this.f66462e = appendOnlyLinkedArrayList3;
                        appendOnlyLinkedArrayList2 = appendOnlyLinkedArrayList3;
                    }
                    appendOnlyLinkedArrayList2.add(NotificationLite.next(t));
                    return;
                }
                this.f66461d = true;
                this.f66458a.onNext(t);
                m29763a();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.reactivex.FlowableSubscriber
    public void onSubscribe(Subscription subscription) {
        if (SubscriptionHelper.validate(this.f66460c, subscription)) {
            this.f66460c = subscription;
            this.f66458a.onSubscribe(this);
        }
    }

    @Override // org.reactivestreams.Subscription
    public void request(long j) {
        this.f66460c.request(j);
    }

    public SerializedSubscriber(Subscriber<? super T> subscriber, boolean z) {
        this.f66458a = subscriber;
        this.f66459b = z;
    }
}
