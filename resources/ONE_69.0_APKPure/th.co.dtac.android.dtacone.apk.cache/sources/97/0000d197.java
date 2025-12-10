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
public final class ObservableDoOnEach<T> extends AbstractC11078a {

    /* renamed from: a */
    public final Consumer f65281a;

    /* renamed from: b */
    public final Consumer f65282b;

    /* renamed from: c */
    public final Action f65283c;

    /* renamed from: d */
    public final Action f65284d;

    /* renamed from: io.reactivex.internal.operators.observable.ObservableDoOnEach$a */
    /* loaded from: classes5.dex */
    public static final class C10985a implements Observer, Disposable {

        /* renamed from: a */
        public final Observer f65285a;

        /* renamed from: b */
        public final Consumer f65286b;

        /* renamed from: c */
        public final Consumer f65287c;

        /* renamed from: d */
        public final Action f65288d;

        /* renamed from: e */
        public final Action f65289e;

        /* renamed from: f */
        public Disposable f65290f;

        /* renamed from: g */
        public boolean f65291g;

        public C10985a(Observer observer, Consumer consumer, Consumer consumer2, Action action, Action action2) {
            this.f65285a = observer;
            this.f65286b = consumer;
            this.f65287c = consumer2;
            this.f65288d = action;
            this.f65289e = action2;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f65290f.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f65290f.isDisposed();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.f65291g) {
                return;
            }
            try {
                this.f65288d.run();
                this.f65291g = true;
                this.f65285a.onComplete();
                try {
                    this.f65289e.run();
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
            if (this.f65291g) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f65291g = true;
            try {
                this.f65287c.accept(th2);
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                th2 = new CompositeException(th2, th3);
            }
            this.f65285a.onError(th2);
            try {
                this.f65289e.run();
            } catch (Throwable th4) {
                Exceptions.throwIfFatal(th4);
                RxJavaPlugins.onError(th4);
            }
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            if (this.f65291g) {
                return;
            }
            try {
                this.f65286b.accept(obj);
                this.f65285a.onNext(obj);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f65290f.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f65290f, disposable)) {
                this.f65290f = disposable;
                this.f65285a.onSubscribe(this);
            }
        }
    }

    public ObservableDoOnEach(ObservableSource<T> observableSource, Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, Action action, Action action2) {
        super(observableSource);
        this.f65281a = consumer;
        this.f65282b = consumer2;
        this.f65283c = action;
        this.f65284d = action2;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        this.source.subscribe(new C10985a(observer, this.f65281a, this.f65282b, this.f65283c, this.f65284d));
    }
}