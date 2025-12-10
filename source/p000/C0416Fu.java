package p000;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.disposables.Disposable;
import p046rx.CompletableSubscriber;
import p046rx.Subscription;

/* renamed from: Fu */
/* loaded from: classes5.dex */
public final class C0416Fu extends Completable {

    /* renamed from: a */
    public final p046rx.Completable f1739a;

    /* renamed from: Fu$a */
    /* loaded from: classes5.dex */
    public static final class C0417a implements CompletableSubscriber, Disposable {

        /* renamed from: a */
        public final CompletableObserver f1740a;

        /* renamed from: b */
        public Subscription f1741b;

        public C0417a(CompletableObserver completableObserver) {
            this.f1740a = completableObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f1741b.unsubscribe();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f1741b.isUnsubscribed();
        }

        @Override // p046rx.CompletableSubscriber
        public void onCompleted() {
            this.f1740a.onComplete();
        }

        @Override // p046rx.CompletableSubscriber
        public void onError(Throwable th2) {
            this.f1740a.onError(th2);
        }

        @Override // p046rx.CompletableSubscriber
        public void onSubscribe(Subscription subscription) {
            this.f1741b = subscription;
            this.f1740a.onSubscribe(this);
        }
    }

    public C0416Fu(p046rx.Completable completable) {
        this.f1739a = completable;
    }

    @Override // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        this.f1739a.subscribe(new C0417a(completableObserver));
    }
}
