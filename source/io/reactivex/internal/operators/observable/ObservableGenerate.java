package io.reactivex.internal.operators.observable;

import io.reactivex.Emitter;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;

/* loaded from: classes5.dex */
public final class ObservableGenerate<T, S> extends Observable<T> {

    /* renamed from: a */
    public final Callable f65299a;

    /* renamed from: b */
    public final BiFunction f65300b;

    /* renamed from: c */
    public final Consumer f65301c;

    /* renamed from: io.reactivex.internal.operators.observable.ObservableGenerate$a */
    /* loaded from: classes5.dex */
    public static final class C11007a implements Emitter, Disposable {

        /* renamed from: a */
        public final Observer f65302a;

        /* renamed from: b */
        public final BiFunction f65303b;

        /* renamed from: c */
        public final Consumer f65304c;

        /* renamed from: d */
        public Object f65305d;

        /* renamed from: e */
        public volatile boolean f65306e;

        /* renamed from: f */
        public boolean f65307f;

        /* renamed from: g */
        public boolean f65308g;

        public C11007a(Observer observer, BiFunction biFunction, Consumer consumer, Object obj) {
            this.f65302a = observer;
            this.f65303b = biFunction;
            this.f65304c = consumer;
            this.f65305d = obj;
        }

        /* renamed from: a */
        public final void m29971a(Object obj) {
            try {
                this.f65304c.accept(obj);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                RxJavaPlugins.onError(th2);
            }
        }

        /* renamed from: b */
        public void m29970b() {
            Object obj = this.f65305d;
            if (this.f65306e) {
                this.f65305d = null;
                m29971a(obj);
                return;
            }
            BiFunction biFunction = this.f65303b;
            while (!this.f65306e) {
                this.f65308g = false;
                try {
                    obj = biFunction.apply(obj, this);
                    if (this.f65307f) {
                        this.f65306e = true;
                        this.f65305d = null;
                        m29971a(obj);
                        return;
                    }
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    this.f65305d = null;
                    this.f65306e = true;
                    onError(th2);
                    m29971a(obj);
                    return;
                }
            }
            this.f65305d = null;
            m29971a(obj);
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f65306e = true;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f65306e;
        }

        @Override // io.reactivex.Emitter
        public void onComplete() {
            if (!this.f65307f) {
                this.f65307f = true;
                this.f65302a.onComplete();
            }
        }

        @Override // io.reactivex.Emitter
        public void onError(Throwable th2) {
            if (this.f65307f) {
                RxJavaPlugins.onError(th2);
                return;
            }
            if (th2 == null) {
                th2 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            this.f65307f = true;
            this.f65302a.onError(th2);
        }

        @Override // io.reactivex.Emitter
        public void onNext(Object obj) {
            if (!this.f65307f) {
                if (this.f65308g) {
                    onError(new IllegalStateException("onNext already called in this generate turn"));
                } else if (obj == null) {
                    onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                } else {
                    this.f65308g = true;
                    this.f65302a.onNext(obj);
                }
            }
        }
    }

    public ObservableGenerate(Callable<S> callable, BiFunction<S, Emitter<T>, S> biFunction, Consumer<? super S> consumer) {
        this.f65299a = callable;
        this.f65300b = biFunction;
        this.f65301c = consumer;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        try {
            C11007a c11007a = new C11007a(observer, this.f65300b, this.f65301c, this.f65299a.call());
            observer.onSubscribe(c11007a);
            c11007a.m29970b();
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            EmptyDisposable.error(th2, observer);
        }
    }
}
