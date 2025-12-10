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
public final class ObservableOnErrorNext<T> extends AbstractC11091a {

    /* renamed from: a */
    public final Function f65395a;

    /* renamed from: b */
    public final boolean f65396b;

    /* renamed from: io.reactivex.internal.operators.observable.ObservableOnErrorNext$a */
    /* loaded from: classes5.dex */
    public static final class C11033a implements Observer {

        /* renamed from: a */
        public final Observer f65397a;

        /* renamed from: b */
        public final Function f65398b;

        /* renamed from: c */
        public final boolean f65399c;

        /* renamed from: d */
        public final SequentialDisposable f65400d = new SequentialDisposable();

        /* renamed from: e */
        public boolean f65401e;

        /* renamed from: f */
        public boolean f65402f;

        public C11033a(Observer observer, Function function, boolean z) {
            this.f65397a = observer;
            this.f65398b = function;
            this.f65399c = z;
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.f65402f) {
                return;
            }
            this.f65402f = true;
            this.f65401e = true;
            this.f65397a.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            if (this.f65401e) {
                if (this.f65402f) {
                    RxJavaPlugins.onError(th2);
                    return;
                } else {
                    this.f65397a.onError(th2);
                    return;
                }
            }
            this.f65401e = true;
            if (this.f65399c && !(th2 instanceof Exception)) {
                this.f65397a.onError(th2);
                return;
            }
            try {
                ObservableSource observableSource = (ObservableSource) this.f65398b.apply(th2);
                if (observableSource == null) {
                    NullPointerException nullPointerException = new NullPointerException("Observable is null");
                    nullPointerException.initCause(th2);
                    this.f65397a.onError(nullPointerException);
                    return;
                }
                observableSource.subscribe(this);
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                this.f65397a.onError(new CompositeException(th2, th3));
            }
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            if (this.f65402f) {
                return;
            }
            this.f65397a.onNext(obj);
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            this.f65400d.replace(disposable);
        }
    }

    public ObservableOnErrorNext(ObservableSource<T> observableSource, Function<? super Throwable, ? extends ObservableSource<? extends T>> function, boolean z) {
        super(observableSource);
        this.f65395a = function;
        this.f65396b = z;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        C11033a c11033a = new C11033a(observer, this.f65395a, this.f65396b);
        observer.onSubscribe(c11033a.f65400d);
        this.source.subscribe(c11033a);
    }
}
