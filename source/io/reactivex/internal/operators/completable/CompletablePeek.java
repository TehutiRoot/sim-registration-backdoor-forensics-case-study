package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: classes5.dex */
public final class CompletablePeek extends Completable {

    /* renamed from: a */
    public final CompletableSource f63963a;

    /* renamed from: b */
    public final Consumer f63964b;

    /* renamed from: c */
    public final Consumer f63965c;

    /* renamed from: d */
    public final Action f63966d;

    /* renamed from: e */
    public final Action f63967e;

    /* renamed from: f */
    public final Action f63968f;

    /* renamed from: g */
    public final Action f63969g;

    /* renamed from: io.reactivex.internal.operators.completable.CompletablePeek$a */
    /* loaded from: classes5.dex */
    public final class C10799a implements CompletableObserver, Disposable {

        /* renamed from: a */
        public final CompletableObserver f63970a;

        /* renamed from: b */
        public Disposable f63971b;

        public C10799a(CompletableObserver completableObserver) {
            this.f63970a = completableObserver;
        }

        /* renamed from: a */
        public void m30072a() {
            try {
                CompletablePeek.this.f63968f.run();
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                RxJavaPlugins.onError(th2);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            try {
                CompletablePeek.this.f63969g.run();
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                RxJavaPlugins.onError(th2);
            }
            this.f63971b.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f63971b.isDisposed();
        }

        @Override // io.reactivex.CompletableObserver
        public void onComplete() {
            if (this.f63971b == DisposableHelper.DISPOSED) {
                return;
            }
            try {
                CompletablePeek.this.f63966d.run();
                CompletablePeek.this.f63967e.run();
                this.f63970a.onComplete();
                m30072a();
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f63970a.onError(th2);
            }
        }

        @Override // io.reactivex.CompletableObserver
        public void onError(Throwable th2) {
            if (this.f63971b == DisposableHelper.DISPOSED) {
                RxJavaPlugins.onError(th2);
                return;
            }
            try {
                CompletablePeek.this.f63965c.accept(th2);
                CompletablePeek.this.f63967e.run();
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                th2 = new CompositeException(th2, th3);
            }
            this.f63970a.onError(th2);
            m30072a();
        }

        @Override // io.reactivex.CompletableObserver
        public void onSubscribe(Disposable disposable) {
            try {
                CompletablePeek.this.f63964b.accept(disposable);
                if (DisposableHelper.validate(this.f63971b, disposable)) {
                    this.f63971b = disposable;
                    this.f63970a.onSubscribe(this);
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                disposable.dispose();
                this.f63971b = DisposableHelper.DISPOSED;
                EmptyDisposable.error(th2, this.f63970a);
            }
        }
    }

    public CompletablePeek(CompletableSource completableSource, Consumer<? super Disposable> consumer, Consumer<? super Throwable> consumer2, Action action, Action action2, Action action3, Action action4) {
        this.f63963a = completableSource;
        this.f63964b = consumer;
        this.f63965c = consumer2;
        this.f63966d = action;
        this.f63967e = action2;
        this.f63968f = action3;
        this.f63969g = action4;
    }

    @Override // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        this.f63963a.subscribe(new C10799a(completableObserver));
    }
}
