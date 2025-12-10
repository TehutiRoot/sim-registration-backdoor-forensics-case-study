package p000;

import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.disposables.Disposable;
import p046rx.Completable;
import p046rx.CompletableSubscriber;
import p046rx.Subscription;

/* renamed from: Hu */
/* loaded from: classes5.dex */
public final class C0551Hu implements Completable.OnSubscribe {

    /* renamed from: a */
    public final CompletableSource f2507a;

    /* renamed from: Hu$a */
    /* loaded from: classes5.dex */
    public static final class C0552a implements CompletableObserver, Subscription {

        /* renamed from: a */
        public final CompletableSubscriber f2508a;

        /* renamed from: b */
        public Disposable f2509b;

        public C0552a(CompletableSubscriber completableSubscriber) {
            this.f2508a = completableSubscriber;
        }

        @Override // p046rx.Subscription
        public boolean isUnsubscribed() {
            return this.f2509b.isDisposed();
        }

        @Override // io.reactivex.CompletableObserver
        public void onComplete() {
            this.f2508a.onCompleted();
        }

        @Override // io.reactivex.CompletableObserver
        public void onError(Throwable th2) {
            this.f2508a.onError(th2);
        }

        @Override // io.reactivex.CompletableObserver
        public void onSubscribe(Disposable disposable) {
            this.f2509b = disposable;
            this.f2508a.onSubscribe(this);
        }

        @Override // p046rx.Subscription
        public void unsubscribe() {
            this.f2509b.dispose();
        }
    }

    public C0551Hu(CompletableSource completableSource) {
        this.f2507a = completableSource;
    }

    @Override // p046rx.functions.Action1
    /* renamed from: a */
    public void call(CompletableSubscriber completableSubscriber) {
        this.f2507a.subscribe(new C0552a(completableSubscriber));
    }
}