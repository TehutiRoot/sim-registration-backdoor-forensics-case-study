package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Iterator;

/* loaded from: classes5.dex */
public final class ObservableZipIterable<T, U, V> extends Observable<V> {

    /* renamed from: a */
    public final Observable f65789a;

    /* renamed from: b */
    public final Iterable f65790b;

    /* renamed from: c */
    public final BiFunction f65791c;

    /* renamed from: io.reactivex.internal.operators.observable.ObservableZipIterable$a */
    /* loaded from: classes5.dex */
    public static final class C11077a implements Observer, Disposable {

        /* renamed from: a */
        public final Observer f65792a;

        /* renamed from: b */
        public final Iterator f65793b;

        /* renamed from: c */
        public final BiFunction f65794c;

        /* renamed from: d */
        public Disposable f65795d;

        /* renamed from: e */
        public boolean f65796e;

        public C11077a(Observer observer, Iterator it, BiFunction biFunction) {
            this.f65792a = observer;
            this.f65793b = it;
            this.f65794c = biFunction;
        }

        /* renamed from: a */
        public void m30273a(Throwable th2) {
            this.f65796e = true;
            this.f65795d.dispose();
            this.f65792a.onError(th2);
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f65795d.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f65795d.isDisposed();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.f65796e) {
                return;
            }
            this.f65796e = true;
            this.f65792a.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            if (this.f65796e) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f65796e = true;
            this.f65792a.onError(th2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            if (this.f65796e) {
                return;
            }
            try {
                try {
                    this.f65792a.onNext(ObjectHelper.requireNonNull(this.f65794c.apply(obj, ObjectHelper.requireNonNull(this.f65793b.next(), "The iterator returned a null value")), "The zipper function returned a null value"));
                    try {
                        if (!this.f65793b.hasNext()) {
                            this.f65796e = true;
                            this.f65795d.dispose();
                            this.f65792a.onComplete();
                        }
                    } catch (Throwable th2) {
                        Exceptions.throwIfFatal(th2);
                        m30273a(th2);
                    }
                } catch (Throwable th3) {
                    Exceptions.throwIfFatal(th3);
                    m30273a(th3);
                }
            } catch (Throwable th4) {
                Exceptions.throwIfFatal(th4);
                m30273a(th4);
            }
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f65795d, disposable)) {
                this.f65795d = disposable;
                this.f65792a.onSubscribe(this);
            }
        }
    }

    public ObservableZipIterable(Observable<? extends T> observable, Iterable<U> iterable, BiFunction<? super T, ? super U, ? extends V> biFunction) {
        this.f65789a = observable;
        this.f65790b = iterable;
        this.f65791c = biFunction;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super V> observer) {
        try {
            Iterator it = (Iterator) ObjectHelper.requireNonNull(this.f65790b.iterator(), "The iterator returned by other is null");
            try {
                if (!it.hasNext()) {
                    EmptyDisposable.complete(observer);
                } else {
                    this.f65789a.subscribe(new C11077a(observer, it, this.f65791c));
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                EmptyDisposable.error(th2, observer);
            }
        } catch (Throwable th3) {
            Exceptions.throwIfFatal(th3);
            EmptyDisposable.error(th3, observer);
        }
    }
}