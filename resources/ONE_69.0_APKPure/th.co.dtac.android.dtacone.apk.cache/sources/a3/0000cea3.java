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
    public final CompletableSource f64026a;

    /* renamed from: b */
    public final Consumer f64027b;

    /* renamed from: c */
    public final Consumer f64028c;

    /* renamed from: d */
    public final Action f64029d;

    /* renamed from: e */
    public final Action f64030e;

    /* renamed from: f */
    public final Action f64031f;

    /* renamed from: g */
    public final Action f64032g;

    /* renamed from: io.reactivex.internal.operators.completable.CompletablePeek$a */
    /* loaded from: classes5.dex */
    public final class C10786a implements CompletableObserver, Disposable {

        /* renamed from: a */
        public final CompletableObserver f64033a;

        /* renamed from: b */
        public Disposable f64034b;

        public C10786a(CompletableObserver completableObserver) {
            this.f64033a = completableObserver;
        }

        /* renamed from: a */
        public void m30412a() {
            try {
                CompletablePeek.this.f64031f.run();
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                RxJavaPlugins.onError(th2);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            try {
                CompletablePeek.this.f64032g.run();
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                RxJavaPlugins.onError(th2);
            }
            this.f64034b.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f64034b.isDisposed();
        }

        @Override // io.reactivex.CompletableObserver
        public void onComplete() {
            if (this.f64034b == DisposableHelper.DISPOSED) {
                return;
            }
            try {
                CompletablePeek.this.f64029d.run();
                CompletablePeek.this.f64030e.run();
                this.f64033a.onComplete();
                m30412a();
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f64033a.onError(th2);
            }
        }

        @Override // io.reactivex.CompletableObserver
        public void onError(Throwable th2) {
            if (this.f64034b == DisposableHelper.DISPOSED) {
                RxJavaPlugins.onError(th2);
                return;
            }
            try {
                CompletablePeek.this.f64028c.accept(th2);
                CompletablePeek.this.f64030e.run();
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                th2 = new CompositeException(th2, th3);
            }
            this.f64033a.onError(th2);
            m30412a();
        }

        @Override // io.reactivex.CompletableObserver
        public void onSubscribe(Disposable disposable) {
            try {
                CompletablePeek.this.f64027b.accept(disposable);
                if (DisposableHelper.validate(this.f64034b, disposable)) {
                    this.f64034b = disposable;
                    this.f64033a.onSubscribe(this);
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                disposable.dispose();
                this.f64034b = DisposableHelper.DISPOSED;
                EmptyDisposable.error(th2, this.f64033a);
            }
        }
    }

    public CompletablePeek(CompletableSource completableSource, Consumer<? super Disposable> consumer, Consumer<? super Throwable> consumer2, Action action, Action action2, Action action3, Action action4) {
        this.f64026a = completableSource;
        this.f64027b = consumer;
        this.f64028c = consumer2;
        this.f64029d = action;
        this.f64030e = action2;
        this.f64031f = action3;
        this.f64032g = action4;
    }

    @Override // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        this.f64026a.subscribe(new C10786a(completableObserver));
    }
}