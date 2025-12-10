package p000;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.disposables.Disposable;
import p046rx.CompletableSubscriber;
import p046rx.Subscription;

/* renamed from: Fu */
/* loaded from: classes5.dex */
public final class C0412Fu extends Completable {

    /* renamed from: a */
    public final p046rx.Completable f1804a;

    /* renamed from: Fu$a */
    /* loaded from: classes5.dex */
    public static final class C0413a implements CompletableSubscriber, Disposable {

        /* renamed from: a */
        public final CompletableObserver f1805a;

        /* renamed from: b */
        public Subscription f1806b;

        public C0413a(CompletableObserver completableObserver) {
            this.f1805a = completableObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f1806b.unsubscribe();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f1806b.isUnsubscribed();
        }

        @Override // p046rx.CompletableSubscriber
        public void onCompleted() {
            this.f1805a.onComplete();
        }

        @Override // p046rx.CompletableSubscriber
        public void onError(Throwable th2) {
            this.f1805a.onError(th2);
        }

        @Override // p046rx.CompletableSubscriber
        public void onSubscribe(Subscription subscription) {
            this.f1806b = subscription;
            this.f1805a.onSubscribe(this);
        }
    }

    public C0412Fu(p046rx.Completable completable) {
        this.f1804a = completable;
    }

    @Override // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        this.f1804a.subscribe(new C0413a(completableObserver));
    }
}