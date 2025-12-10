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
    public final MaybeSource f64799a;

    /* renamed from: b */
    public final Function f64800b;

    /* renamed from: io.reactivex.internal.operators.maybe.MaybeFlatMapIterableObservable$a */
    /* loaded from: classes5.dex */
    public static final class C10935a extends BasicQueueDisposable implements MaybeObserver {

        /* renamed from: a */
        public final Observer f64801a;

        /* renamed from: b */
        public final Function f64802b;

        /* renamed from: c */
        public Disposable f64803c;

        /* renamed from: d */
        public volatile Iterator f64804d;

        /* renamed from: e */
        public volatile boolean f64805e;

        /* renamed from: f */
        public boolean f64806f;

        public C10935a(Observer observer, Function function) {
            this.f64801a = observer;
            this.f64802b = function;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
            this.f64804d = null;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f64805e = true;
            this.f64803c.dispose();
            this.f64803c = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f64805e;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
            if (this.f64804d == null) {
                return true;
            }
            return false;
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
            this.f64801a.onComplete();
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(Throwable th2) {
            this.f64803c = DisposableHelper.DISPOSED;
            this.f64801a.onError(th2);
        }

        @Override // io.reactivex.MaybeObserver
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f64803c, disposable)) {
                this.f64803c = disposable;
                this.f64801a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(Object obj) {
            Observer observer = this.f64801a;
            try {
                Iterator<T> it = ((Iterable) this.f64802b.apply(obj)).iterator();
                if (!it.hasNext()) {
                    observer.onComplete();
                    return;
                }
                this.f64804d = it;
                if (this.f64806f) {
                    observer.onNext(null);
                    observer.onComplete();
                    return;
                }
                while (!this.f64805e) {
                    try {
                        observer.onNext(it.next());
                        if (this.f64805e) {
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
            Iterator it = this.f64804d;
            if (it == null) {
                return null;
            }
            Object requireNonNull = ObjectHelper.requireNonNull(it.next(), "The iterator returned a null value");
            if (!it.hasNext()) {
                this.f64804d = null;
            }
            return requireNonNull;
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int i) {
            if ((i & 2) != 0) {
                this.f64806f = true;
                return 2;
            }
            return 0;
        }
    }

    public MaybeFlatMapIterableObservable(MaybeSource<T> maybeSource, Function<? super T, ? extends Iterable<? extends R>> function) {
        this.f64799a = maybeSource;
        this.f64800b = function;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super R> observer) {
        this.f64799a.subscribe(new C10935a(observer, this.f64800b));
    }
}
