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
    public final CompletableSource f64022a;

    /* renamed from: b */
    public final Predicate f64023b;

    /* renamed from: io.reactivex.internal.operators.completable.CompletableOnErrorComplete$a */
    /* loaded from: classes5.dex */
    public final class C10785a implements CompletableObserver {

        /* renamed from: a */
        public final CompletableObserver f64024a;

        public C10785a(CompletableObserver completableObserver) {
            this.f64024a = completableObserver;
        }

        @Override // io.reactivex.CompletableObserver
        public void onComplete() {
            this.f64024a.onComplete();
        }

        @Override // io.reactivex.CompletableObserver
        public void onError(Throwable th2) {
            try {
                if (CompletableOnErrorComplete.this.f64023b.test(th2)) {
                    this.f64024a.onComplete();
                } else {
                    this.f64024a.onError(th2);
                }
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                this.f64024a.onError(new CompositeException(th2, th3));
            }
        }

        @Override // io.reactivex.CompletableObserver
        public void onSubscribe(Disposable disposable) {
            this.f64024a.onSubscribe(disposable);
        }
    }

    public CompletableOnErrorComplete(CompletableSource completableSource, Predicate<? super Throwable> predicate) {
        this.f64022a = completableSource;
        this.f64023b = predicate;
    }

    @Override // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        this.f64022a.subscribe(new C10785a(completableObserver));
    }
}