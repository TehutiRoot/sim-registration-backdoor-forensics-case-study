package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Predicate;

/* loaded from: classes5.dex */
public final class CompletableOnErrorComplete extends Completable {

    /* renamed from: a */
    public final CompletableSource f63959a;

    /* renamed from: b */
    public final Predicate f63960b;

    /* renamed from: io.reactivex.internal.operators.completable.CompletableOnErrorComplete$a */
    /* loaded from: classes5.dex */
    public final class C10798a implements CompletableObserver {

        /* renamed from: a */
        public final CompletableObserver f63961a;

        public C10798a(CompletableObserver completableObserver) {
            this.f63961a = completableObserver;
        }

        @Override // io.reactivex.CompletableObserver
        public void onComplete() {
            this.f63961a.onComplete();
        }

        @Override // io.reactivex.CompletableObserver
        public void onError(Throwable th2) {
            try {
                if (CompletableOnErrorComplete.this.f63960b.test(th2)) {
                    this.f63961a.onComplete();
                } else {
                    this.f63961a.onError(th2);
                }
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                this.f63961a.onError(new CompositeException(th2, th3));
            }
        }

        @Override // io.reactivex.CompletableObserver
        public void onSubscribe(Disposable disposable) {
            this.f63961a.onSubscribe(disposable);
        }
    }

    public CompletableOnErrorComplete(CompletableSource completableSource, Predicate<? super Throwable> predicate) {
        this.f63959a = completableSource;
        this.f63960b = predicate;
    }

    @Override // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        this.f63959a.subscribe(new C10798a(completableObserver));
    }
}
