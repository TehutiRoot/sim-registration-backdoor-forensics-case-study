package p000;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import p046rx.Completable;
import p046rx.CompletableSubscriber;
import p046rx.Subscription;

/* renamed from: Gu */
/* loaded from: classes5.dex */
public final class C0482Gu extends Maybe {

    /* renamed from: a */
    public final Completable f2229a;

    /* renamed from: Gu$a */
    /* loaded from: classes5.dex */
    public static final class C0483a implements CompletableSubscriber, Disposable {

        /* renamed from: a */
        public final MaybeObserver f2230a;

        /* renamed from: b */
        public Subscription f2231b;

        public C0483a(MaybeObserver maybeObserver) {
            this.f2230a = maybeObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f2231b.unsubscribe();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f2231b.isUnsubscribed();
        }

        @Override // p046rx.CompletableSubscriber
        public void onCompleted() {
            this.f2230a.onComplete();
        }

        @Override // p046rx.CompletableSubscriber
        public void onError(Throwable th2) {
            this.f2230a.onError(th2);
        }

        @Override // p046rx.CompletableSubscriber
        public void onSubscribe(Subscription subscription) {
            this.f2231b = subscription;
            this.f2230a.onSubscribe(this);
        }
    }

    public C0482Gu(Completable completable) {
        this.f2229a = completable;
    }

    @Override // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver maybeObserver) {
        this.f2229a.subscribe(new C0483a(maybeObserver));
    }
}