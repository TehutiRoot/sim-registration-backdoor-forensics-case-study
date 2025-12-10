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
public final class MaybePeek<T> extends AbstractC1716Y {

    /* renamed from: a */
    public final Consumer f64866a;

    /* renamed from: b */
    public final Consumer f64867b;

    /* renamed from: c */
    public final Consumer f64868c;

    /* renamed from: d */
    public final Action f64869d;

    /* renamed from: e */
    public final Action f64870e;

    /* renamed from: f */
    public final Action f64871f;

    /* renamed from: io.reactivex.internal.operators.maybe.MaybePeek$a */
    /* loaded from: classes5.dex */
    public static final class C10952a implements MaybeObserver, Disposable {

        /* renamed from: a */
        public final MaybeObserver f64872a;

        /* renamed from: b */
        public final MaybePeek f64873b;

        /* renamed from: c */
        public Disposable f64874c;

        public C10952a(MaybeObserver maybeObserver, MaybePeek maybePeek) {
            this.f64872a = maybeObserver;
            this.f64873b = maybePeek;
        }

        /* renamed from: a */
        public void m30007a() {
            try {
                this.f64873b.f64870e.run();
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                RxJavaPlugins.onError(th2);
            }
        }

        /* renamed from: b */
        public void m30006b(Throwable th2) {
            try {
                this.f64873b.f64868c.accept(th2);
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                th2 = new CompositeException(th2, th3);
            }
            this.f64874c = DisposableHelper.DISPOSED;
            this.f64872a.onError(th2);
            m30007a();
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            try {
                this.f64873b.f64871f.run();
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                RxJavaPlugins.onError(th2);
            }
            this.f64874c.dispose();
            this.f64874c = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f64874c.isDisposed();
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
            Disposable disposable = this.f64874c;
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (disposable == disposableHelper) {
                return;
            }
            try {
                this.f64873b.f64869d.run();
                this.f64874c = disposableHelper;
                this.f64872a.onComplete();
                m30007a();
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                m30006b(th2);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(Throwable th2) {
            if (this.f64874c == DisposableHelper.DISPOSED) {
                RxJavaPlugins.onError(th2);
            } else {
                m30006b(th2);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f64874c, disposable)) {
                try {
                    this.f64873b.f64866a.accept(disposable);
                    this.f64874c = disposable;
                    this.f64872a.onSubscribe(this);
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    disposable.dispose();
                    this.f64874c = DisposableHelper.DISPOSED;
                    EmptyDisposable.error(th2, this.f64872a);
                }
            }
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(Object obj) {
            Disposable disposable = this.f64874c;
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (disposable == disposableHelper) {
                return;
            }
            try {
                this.f64873b.f64867b.accept(obj);
                this.f64874c = disposableHelper;
                this.f64872a.onSuccess(obj);
                m30007a();
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                m30006b(th2);
            }
        }
    }

    public MaybePeek(MaybeSource<T> maybeSource, Consumer<? super Disposable> consumer, Consumer<? super T> consumer2, Consumer<? super Throwable> consumer3, Action action, Action action2, Action action3) {
        super(maybeSource);
        this.f64866a = consumer;
        this.f64867b = consumer2;
        this.f64868c = consumer3;
        this.f64869d = action;
        this.f64870e = action2;
        this.f64871f = action3;
    }

    @Override // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        this.source.subscribe(new C10952a(maybeObserver, this));
    }
}
