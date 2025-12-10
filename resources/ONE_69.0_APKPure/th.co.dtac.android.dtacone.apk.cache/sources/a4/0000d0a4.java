package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.observers.BasicQueueDisposable;
import java.util.Iterator;

/* loaded from: classes5.dex */
public final class MaybeFlatMapIterableObservable<T, R> extends Observable<R> {

    /* renamed from: a */
    public final MaybeSource f64862a;

    /* renamed from: b */
    public final Function f64863b;

    /* renamed from: io.reactivex.internal.operators.maybe.MaybeFlatMapIterableObservable$a */
    /* loaded from: classes5.dex */
    public static final class C10922a extends BasicQueueDisposable implements MaybeObserver {

        /* renamed from: a */
        public final Observer f64864a;

        /* renamed from: b */
        public final Function f64865b;

        /* renamed from: c */
        public Disposable f64866c;

        /* renamed from: d */
        public volatile Iterator f64867d;

        /* renamed from: e */
        public volatile boolean f64868e;

        /* renamed from: f */
        public boolean f64869f;

        public C10922a(Observer observer, Function function) {
            this.f64864a = observer;
            this.f64865b = function;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
            this.f64867d = null;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f64868e = true;
            this.f64866c.dispose();
            this.f64866c = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f64868e;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
            if (this.f64867d == null) {
                return true;
            }
            return false;
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
            this.f64864a.onComplete();
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(Throwable th2) {
            this.f64866c = DisposableHelper.DISPOSED;
            this.f64864a.onError(th2);
        }

        @Override // io.reactivex.MaybeObserver
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f64866c, disposable)) {
                this.f64866c = disposable;
                this.f64864a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(Object obj) {
            Observer observer = this.f64864a;
            try {
                Iterator<T> it = ((Iterable) this.f64865b.apply(obj)).iterator();
                if (!it.hasNext()) {
                    observer.onComplete();
                    return;
                }
                this.f64867d = it;
                if (this.f64869f) {
                    observer.onNext(null);
                    observer.onComplete();
                    return;
                }
                while (!this.f64868e) {
                    try {
                        observer.onNext(it.next());
                        if (this.f64868e) {
                            return;
                        }
                        try {
                            if (!it.hasNext()) {
                                observer.onComplete();
                                return;
                            }
                        } catch (Throwable th2) {
                            Exceptions.throwIfFatal(th2);
                            observer.onError(th2);
                            return;
                        }
                    } catch (Throwable th3) {
                        Exceptions.throwIfFatal(th3);
                        observer.onError(th3);
                        return;
                    }
                }
            } catch (Throwable th4) {
                Exceptions.throwIfFatal(th4);
                observer.onError(th4);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public Object poll() {
            Iterator it = this.f64867d;
            if (it == null) {
                return null;
            }
            Object requireNonNull = ObjectHelper.requireNonNull(it.next(), "The iterator returned a null value");
            if (!it.hasNext()) {
                this.f64867d = null;
            }
            return requireNonNull;
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int i) {
            if ((i & 2) != 0) {
                this.f64869f = true;
                return 2;
            }
            return 0;
        }
    }

    public MaybeFlatMapIterableObservable(MaybeSource<T> maybeSource, Function<? super T, ? extends Iterable<? extends R>> function) {
        this.f64862a = maybeSource;
        this.f64863b = function;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super R> observer) {
        this.f64862a.subscribe(new C10922a(observer, this.f64863b));
    }
}