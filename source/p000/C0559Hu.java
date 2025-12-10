package p000;

import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.disposables.Disposable;
import p046rx.Completable;
import p046rx.CompletableSubscriber;
import p046rx.Subscription;

/* renamed from: Hu */
/* loaded from: classes5.dex */
public final class C0559Hu implements Completable.OnSubscribe {

    /* renamed from: a */
    public final CompletableSource f2343a;

    /* renamed from: Hu$a */
    /* loaded from: classes5.dex */
    public static final class C0560a implements CompletableObserver, Subscription {

        /* renamed from: a */
        public final CompletableSubscriber f2344a;

        /* renamed from: b */
        public Disposable f2345b;

        public C0560a(CompletableSubscriber completableSubscriber) {
            this.f2344a = completableSubscriber;
        }

        @Override // p046rx.Subscription
        public boolean isUnsubscribed() {
            return this.f2345b.isDisposed();
        }

        @Override // io.reactivex.CompletableObserver
        public void onComplete() {
            this.f2344a.onCompleted();
        }

        @Override // io.reactivex.CompletableObserver
        public void onError(Throwable th2) {
            this.f2344a.onError(th2);
        }

        @Override // io.reactivex.CompletableObserver
        public void onSubscribe(Disposable disposable) {
            this.f2345b = disposable;
            this.f2344a.onSubscribe(this);
        }

        @Override // p046rx.Subscription
        public void unsubscribe() {
            this.f2345b.dispose();
        }
    }

    public C0559Hu(CompletableSource completableSource) {
        this.f2343a = completableSource;
    }

    @Override // p046rx.functions.Action1
    /* renamed from: a */
    public void call(CompletableSubscriber completableSubscriber) {
        this.f2343a.subscribe(new C0560a(completableSubscriber));
    }
}
