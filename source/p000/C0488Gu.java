package p000;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import p046rx.Completable;
import p046rx.CompletableSubscriber;
import p046rx.Subscription;

/* renamed from: Gu */
/* loaded from: classes5.dex */
public final class C0488Gu extends Maybe {

    /* renamed from: a */
    public final Completable f2042a;

    /* renamed from: Gu$a */
    /* loaded from: classes5.dex */
    public static final class C0489a implements CompletableSubscriber, Disposable {

        /* renamed from: a */
        public final MaybeObserver f2043a;

        /* renamed from: b */
        public Subscription f2044b;

        public C0489a(MaybeObserver maybeObserver) {
            this.f2043a = maybeObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f2044b.unsubscribe();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f2044b.isUnsubscribed();
        }

        @Override // p046rx.CompletableSubscriber
        public void onCompleted() {
            this.f2043a.onComplete();
        }

        @Override // p046rx.CompletableSubscriber
        public void onError(Throwable th2) {
            this.f2043a.onError(th2);
        }

        @Override // p046rx.CompletableSubscriber
        public void onSubscribe(Subscription subscription) {
            this.f2044b = subscription;
            this.f2043a.onSubscribe(this);
        }
    }

    public C0488Gu(Completable completable) {
        this.f2042a = completable;
    }

    @Override // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver maybeObserver) {
        this.f2042a.subscribe(new C0489a(maybeObserver));
    }
}
