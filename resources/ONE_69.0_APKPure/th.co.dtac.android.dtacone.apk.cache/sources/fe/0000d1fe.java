package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: classes5.dex */
public final class ObservableOnErrorNext<T> extends AbstractC11078a {

    /* renamed from: a */
    public final Function f65458a;

    /* renamed from: b */
    public final boolean f65459b;

    /* renamed from: io.reactivex.internal.operators.observable.ObservableOnErrorNext$a */
    /* loaded from: classes5.dex */
    public static final class C11020a implements Observer {

        /* renamed from: a */
        public final Observer f65460a;

        /* renamed from: b */
        public final Function f65461b;

        /* renamed from: c */
        public final boolean f65462c;

        /* renamed from: d */
        public final SequentialDisposable f65463d = new SequentialDisposable();

        /* renamed from: e */
        public boolean f65464e;

        /* renamed from: f */
        public boolean f65465f;

        public C11020a(Observer observer, Function function, boolean z) {
            this.f65460a = observer;
            this.f65461b = function;
            this.f65462c = z;
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.f65465f) {
                return;
            }
            this.f65465f = true;
            this.f65464e = true;
            this.f65460a.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            if (this.f65464e) {
                if (this.f65465f) {
                    RxJavaPlugins.onError(th2);
                    return;
                } else {
                    this.f65460a.onError(th2);
                    return;
                }
            }
            this.f65464e = true;
            if (this.f65462c && !(th2 instanceof Exception)) {
                this.f65460a.onError(th2);
                return;
            }
            try {
                ObservableSource observableSource = (ObservableSource) this.f65461b.apply(th2);
                if (observableSource == null) {
                    NullPointerException nullPointerException = new NullPointerException("Observable is null");
                    nullPointerException.initCause(th2);
                    this.f65460a.onError(nullPointerException);
                    return;
                }
                observableSource.subscribe(this);
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                this.f65460a.onError(new CompositeException(th2, th3));
            }
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            if (this.f65465f) {
                return;
            }
            this.f65460a.onNext(obj);
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            this.f65463d.replace(disposable);
        }
    }

    public ObservableOnErrorNext(ObservableSource<T> observableSource, Function<? super Throwable, ? extends ObservableSource<? extends T>> function, boolean z) {
        super(observableSource);
        this.f65458a = function;
        this.f65459b = z;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        C11020a c11020a = new C11020a(observer, this.f65458a, this.f65459b);
        observer.onSubscribe(c11020a.f65463d);
        this.source.subscribe(c11020a);
    }
}