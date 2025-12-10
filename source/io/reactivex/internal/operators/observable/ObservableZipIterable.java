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
    public final Observable f65726a;

    /* renamed from: b */
    public final Iterable f65727b;

    /* renamed from: c */
    public final BiFunction f65728c;

    /* renamed from: io.reactivex.internal.operators.observable.ObservableZipIterable$a */
    /* loaded from: classes5.dex */
    public static final class C11090a implements Observer, Disposable {

        /* renamed from: a */
        public final Observer f65729a;

        /* renamed from: b */
        public final Iterator f65730b;

        /* renamed from: c */
        public final BiFunction f65731c;

        /* renamed from: d */
        public Disposable f65732d;

        /* renamed from: e */
        public boolean f65733e;

        public C11090a(Observer observer, Iterator it, BiFunction biFunction) {
            this.f65729a = observer;
            this.f65730b = it;
            this.f65731c = biFunction;
        }

        /* renamed from: a */
        public void m29933a(Throwable th2) {
            this.f65733e = true;
            this.f65732d.dispose();
            this.f65729a.onError(th2);
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f65732d.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f65732d.isDisposed();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.f65733e) {
                return;
            }
            this.f65733e = true;
            this.f65729a.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            if (this.f65733e) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f65733e = true;
            this.f65729a.onError(th2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            if (this.f65733e) {
                return;
            }
            try {
                try {
                    this.f65729a.onNext(ObjectHelper.requireNonNull(this.f65731c.apply(obj, ObjectHelper.requireNonNull(this.f65730b.next(), "The iterator returned a null value")), "The zipper function returned a null value"));
                    try {
                        if (!this.f65730b.hasNext()) {
                            this.f65733e = true;
                            this.f65732d.dispose();
                            this.f65729a.onComplete();
                        }
                    } catch (Throwable th2) {
                        Exceptions.throwIfFatal(th2);
                        m29933a(th2);
                    }
                } catch (Throwable th3) {
                    Exceptions.throwIfFatal(th3);
                    m29933a(th3);
                }
            } catch (Throwable th4) {
                Exceptions.throwIfFatal(th4);
                m29933a(th4);
            }
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f65732d, disposable)) {
                this.f65732d = disposable;
                this.f65729a.onSubscribe(this);
            }
        }
    }

    public ObservableZipIterable(Observable<? extends T> observable, Iterable<U> iterable, BiFunction<? super T, ? super U, ? extends V> biFunction) {
        this.f65726a = observable;
        this.f65727b = iterable;
        this.f65728c = biFunction;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super V> observer) {
        try {
            Iterator it = (Iterator) ObjectHelper.requireNonNull(this.f65727b.iterator(), "The iterator returned by other is null");
            try {
                if (!it.hasNext()) {
                    EmptyDisposable.complete(observer);
                } else {
                    this.f65726a.subscribe(new C11090a(observer, it, this.f65728c));
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
