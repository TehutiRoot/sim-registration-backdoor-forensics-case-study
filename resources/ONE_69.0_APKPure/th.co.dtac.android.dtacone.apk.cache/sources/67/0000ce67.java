package io.reactivex.internal.observers;

import io.reactivex.CompletableObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes5.dex */
public final class SubscriberCompletableObserver<T> implements CompletableObserver, Subscription {

    /* renamed from: a */
    public final Subscriber f63944a;

    /* renamed from: b */
    public Disposable f63945b;

    public SubscriberCompletableObserver(Subscriber<? super T> subscriber) {
        this.f63944a = subscriber;
    }

    @Override // org.reactivestreams.Subscription
    public void cancel() {
        this.f63945b.dispose();
    }

    @Override // io.reactivex.CompletableObserver
    public void onComplete() {
        this.f63944a.onComplete();
    }

    @Override // io.reactivex.CompletableObserver
    public void onError(Throwable th2) {
        this.f63944a.onError(th2);
    }

    @Override // io.reactivex.CompletableObserver
    public void onSubscribe(Disposable disposable) {
        if (DisposableHelper.validate(this.f63945b, disposable)) {
            this.f63945b = disposable;
            this.f63944a.onSubscribe(this);
        }
    }

    @Override // org.reactivestreams.Subscription
    public void request(long j) {
    }
}