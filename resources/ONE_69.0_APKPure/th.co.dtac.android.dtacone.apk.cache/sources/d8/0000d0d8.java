package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: classes5.dex */
public final class MaybePeek<T> extends AbstractC1707Y {

    /* renamed from: a */
    public final Consumer f64929a;

    /* renamed from: b */
    public final Consumer f64930b;

    /* renamed from: c */
    public final Consumer f64931c;

    /* renamed from: d */
    public final Action f64932d;

    /* renamed from: e */
    public final Action f64933e;

    /* renamed from: f */
    public final Action f64934f;

    /* renamed from: io.reactivex.internal.operators.maybe.MaybePeek$a */
    /* loaded from: classes5.dex */
    public static final class C10939a implements MaybeObserver, Disposable {

        /* renamed from: a */
        public final MaybeObserver f64935a;

        /* renamed from: b */
        public final MaybePeek f64936b;

        /* renamed from: c */
        public Disposable f64937c;

        public C10939a(MaybeObserver maybeObserver, MaybePeek maybePeek) {
            this.f64935a = maybeObserver;
            this.f64936b = maybePeek;
        }

        /* renamed from: a */
        public void m30347a() {
            try {
                this.f64936b.f64933e.run();
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                RxJavaPlugins.onError(th2);
            }
        }

        /* renamed from: b */
        public void m30346b(Throwable th2) {
            try {
                this.f64936b.f64931c.accept(th2);
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                th2 = new CompositeException(th2, th3);
            }
            this.f64937c = DisposableHelper.DISPOSED;
            this.f64935a.onError(th2);
            m30347a();
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            try {
                this.f64936b.f64934f.run();
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                RxJavaPlugins.onError(th2);
            }
            this.f64937c.dispose();
            this.f64937c = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f64937c.isDisposed();
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
            Disposable disposable = this.f64937c;
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (disposable == disposableHelper) {
                return;
            }
            try {
                this.f64936b.f64932d.run();
                this.f64937c = disposableHelper;
                this.f64935a.onComplete();
                m30347a();
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                m30346b(th2);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(Throwable th2) {
            if (this.f64937c == DisposableHelper.DISPOSED) {
                RxJavaPlugins.onError(th2);
            } else {
                m30346b(th2);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f64937c, disposable)) {
                try {
                    this.f64936b.f64929a.accept(disposable);
                    this.f64937c = disposable;
                    this.f64935a.onSubscribe(this);
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    disposable.dispose();
                    this.f64937c = DisposableHelper.DISPOSED;
                    EmptyDisposable.error(th2, this.f64935a);
                }
            }
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(Object obj) {
            Disposable disposable = this.f64937c;
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (disposable == disposableHelper) {
                return;
            }
            try {
                this.f64936b.f64930b.accept(obj);
                this.f64937c = disposableHelper;
                this.f64935a.onSuccess(obj);
                m30347a();
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                m30346b(th2);
            }
        }
    }

    public MaybePeek(MaybeSource<T> maybeSource, Consumer<? super Disposable> consumer, Consumer<? super T> consumer2, Consumer<? super Throwable> consumer3, Action action, Action action2, Action action3) {
        super(maybeSource);
        this.f64929a = consumer;
        this.f64930b = consumer2;
        this.f64931c = consumer3;
        this.f64932d = action;
        this.f64933e = action2;
        this.f64934f = action3;
    }

    @Override // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        this.source.subscribe(new C10939a(maybeObserver, this));
    }
}