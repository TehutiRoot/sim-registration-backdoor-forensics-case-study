package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: classes5.dex */
public final class ObservableDoOnEach<T> extends AbstractC11091a {

    /* renamed from: a */
    public final Consumer f65218a;

    /* renamed from: b */
    public final Consumer f65219b;

    /* renamed from: c */
    public final Action f65220c;

    /* renamed from: d */
    public final Action f65221d;

    /* renamed from: io.reactivex.internal.operators.observable.ObservableDoOnEach$a */
    /* loaded from: classes5.dex */
    public static final class C10998a implements Observer, Disposable {

        /* renamed from: a */
        public final Observer f65222a;

        /* renamed from: b */
        public final Consumer f65223b;

        /* renamed from: c */
        public final Consumer f65224c;

        /* renamed from: d */
        public final Action f65225d;

        /* renamed from: e */
        public final Action f65226e;

        /* renamed from: f */
        public Disposable f65227f;

        /* renamed from: g */
        public boolean f65228g;

        public C10998a(Observer observer, Consumer consumer, Consumer consumer2, Action action, Action action2) {
            this.f65222a = observer;
            this.f65223b = consumer;
            this.f65224c = consumer2;
            this.f65225d = action;
            this.f65226e = action2;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f65227f.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f65227f.isDisposed();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.f65228g) {
                return;
            }
            try {
                this.f65225d.run();
                this.f65228g = true;
                this.f65222a.onComplete();
                try {
                    this.f65226e.run();
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    RxJavaPlugins.onError(th2);
                }
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                onError(th3);
            }
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            if (this.f65228g) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f65228g = true;
            try {
                this.f65224c.accept(th2);
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                th2 = new CompositeException(th2, th3);
            }
            this.f65222a.onError(th2);
            try {
                this.f65226e.run();
            } catch (Throwable th4) {
                Exceptions.throwIfFatal(th4);
                RxJavaPlugins.onError(th4);
            }
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            if (this.f65228g) {
                return;
            }
            try {
                this.f65223b.accept(obj);
                this.f65222a.onNext(obj);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f65227f.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f65227f, disposable)) {
                this.f65227f = disposable;
                this.f65222a.onSubscribe(this);
            }
        }
    }

    public ObservableDoOnEach(ObservableSource<T> observableSource, Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, Action action, Action action2) {
        super(observableSource);
        this.f65218a = consumer;
        this.f65219b = consumer2;
        this.f65220c = action;
        this.f65221d = action2;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        this.source.subscribe(new C10998a(observer, this.f65218a, this.f65219b, this.f65220c, this.f65221d));
    }
}
