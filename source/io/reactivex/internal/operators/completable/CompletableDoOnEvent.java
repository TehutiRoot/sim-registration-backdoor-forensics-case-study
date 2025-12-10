package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Consumer;

/* loaded from: classes5.dex */
public final class CompletableDoOnEvent extends Completable {

    /* renamed from: a */
    public final CompletableSource f63923a;

    /* renamed from: b */
    public final Consumer f63924b;

    /* renamed from: io.reactivex.internal.operators.completable.CompletableDoOnEvent$a */
    /* loaded from: classes5.dex */
    public final class C10792a implements CompletableObserver {

        /* renamed from: a */
        public final CompletableObserver f63925a;

        public C10792a(CompletableObserver completableObserver) {
            this.f63925a = completableObserver;
        }

        @Override // io.reactivex.CompletableObserver
        public void onComplete() {
            try {
                CompletableDoOnEvent.this.f63924b.accept(null);
                this.f63925a.onComplete();
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f63925a.onError(th2);
            }
        }

        @Override // io.reactivex.CompletableObserver
        public void onError(Throwable th2) {
            try {
                CompletableDoOnEvent.this.f63924b.accept(th2);
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                th2 = new CompositeException(th2, th3);
            }
            this.f63925a.onError(th2);
        }

        @Override // io.reactivex.CompletableObserver
        public void onSubscribe(Disposable disposable) {
            this.f63925a.onSubscribe(disposable);
        }
    }

    public CompletableDoOnEvent(CompletableSource completableSource, Consumer<? super Throwable> consumer) {
        this.f63923a = completableSource;
        this.f63924b = consumer;
    }

    @Override // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        this.f63923a.subscribe(new C10792a(completableObserver));
    }
}
