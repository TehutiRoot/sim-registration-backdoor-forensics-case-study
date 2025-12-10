package p046rx.observers;

import p046rx.CompletableSubscriber;
import p046rx.Subscription;
import p046rx.exceptions.CompositeException;
import p046rx.exceptions.Exceptions;
import p046rx.exceptions.OnCompletedFailedException;
import p046rx.exceptions.OnErrorFailedException;
import p046rx.plugins.RxJavaHooks;

/* renamed from: rx.observers.SafeCompletableSubscriber */
/* loaded from: classes7.dex */
public final class SafeCompletableSubscriber implements CompletableSubscriber, Subscription {

    /* renamed from: a */
    public final CompletableSubscriber f79571a;

    /* renamed from: b */
    public Subscription f79572b;

    /* renamed from: c */
    public boolean f79573c;

    public SafeCompletableSubscriber(CompletableSubscriber completableSubscriber) {
        this.f79571a = completableSubscriber;
    }

    @Override // p046rx.Subscription
    public boolean isUnsubscribed() {
        if (!this.f79573c && !this.f79572b.isUnsubscribed()) {
            return false;
        }
        return true;
    }

    @Override // p046rx.CompletableSubscriber
    public void onCompleted() {
        if (this.f79573c) {
            return;
        }
        this.f79573c = true;
        try {
            this.f79571a.onCompleted();
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            throw new OnCompletedFailedException(th2);
        }
    }

    @Override // p046rx.CompletableSubscriber
    public void onError(Throwable th2) {
        if (this.f79573c) {
            RxJavaHooks.onError(th2);
            return;
        }
        this.f79573c = true;
        try {
            this.f79571a.onError(th2);
        } catch (Throwable th3) {
            Exceptions.throwIfFatal(th3);
            throw new OnErrorFailedException(new CompositeException(th2, th3));
        }
    }

    @Override // p046rx.CompletableSubscriber
    public void onSubscribe(Subscription subscription) {
        this.f79572b = subscription;
        try {
            this.f79571a.onSubscribe(this);
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            subscription.unsubscribe();
            onError(th2);
        }
    }

    @Override // p046rx.Subscription
    public void unsubscribe() {
        this.f79572b.unsubscribe();
    }
}