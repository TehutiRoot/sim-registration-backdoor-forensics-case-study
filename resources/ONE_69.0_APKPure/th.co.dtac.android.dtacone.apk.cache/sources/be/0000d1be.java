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
    public final Callable f65362a;

    /* renamed from: b */
    public final BiFunction f65363b;

    /* renamed from: c */
    public final Consumer f65364c;

    /* renamed from: io.reactivex.internal.operators.observable.ObservableGenerate$a */
    /* loaded from: classes5.dex */
    public static final class C10994a implements Emitter, Disposable {

        /* renamed from: a */
        public final Observer f65365a;

        /* renamed from: b */
        public final BiFunction f65366b;

        /* renamed from: c */
        public final Consumer f65367c;

        /* renamed from: d */
        public Object f65368d;

        /* renamed from: e */
        public volatile boolean f65369e;

        /* renamed from: f */
        public boolean f65370f;

        /* renamed from: g */
        public boolean f65371g;

        public C10994a(Observer observer, BiFunction biFunction, Consumer consumer, Object obj) {
            this.f65365a = observer;
            this.f65366b = biFunction;
            this.f65367c = consumer;
            this.f65368d = obj;
        }

        /* renamed from: a */
        public final void m30311a(Object obj) {
            try {
                this.f65367c.accept(obj);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                RxJavaPlugins.onError(th2);
            }
        }

        /* renamed from: b */
        public void m30310b() {
            Object obj = this.f65368d;
            if (this.f65369e) {
                this.f65368d = null;
                m30311a(obj);
                return;
            }
            BiFunction biFunction = this.f65366b;
            while (!this.f65369e) {
                this.f65371g = false;
                try {
                    obj = biFunction.apply(obj, this);
                    if (this.f65370f) {
                        this.f65369e = true;
                        this.f65368d = null;
                        m30311a(obj);
                        return;
                    }
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    this.f65368d = null;
                    this.f65369e = true;
                    onError(th2);
                    m30311a(obj);
                    return;
                }
            }
            this.f65368d = null;
            m30311a(obj);
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f65369e = true;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f65369e;
        }

        @Override // io.reactivex.Emitter
        public void onComplete() {
            if (!this.f65370f) {
                this.f65370f = true;
                this.f65365a.onComplete();
            }
        }

        @Override // io.reactivex.Emitter
        public void onError(Throwable th2) {
            if (this.f65370f) {
                RxJavaPlugins.onError(th2);
                return;
            }
            if (th2 == null) {
                th2 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            this.f65370f = true;
            this.f65365a.onError(th2);
        }

        @Override // io.reactivex.Emitter
        public void onNext(Object obj) {
            if (!this.f65370f) {
                if (this.f65371g) {
                    onError(new IllegalStateException("onNext already called in this generate turn"));
                } else if (obj == null) {
                    onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                } else {
                    this.f65371g = true;
                    this.f65365a.onNext(obj);
                }
            }
        }
    }

    public ObservableGenerate(Callable<S> callable, BiFunction<S, Emitter<T>, S> biFunction, Consumer<? super S> consumer) {
        this.f65362a = callable;
        this.f65363b = biFunction;
        this.f65364c = consumer;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        try {
            C10994a c10994a = new C10994a(observer, this.f65363b, this.f65364c, this.f65362a.call());
            observer.onSubscribe(c10994a);
            c10994a.m30310b();
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            EmptyDisposable.error(th2, observer);
        }
    }
}