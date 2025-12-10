package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.observers.BasicFuseableObserver;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Collection;
import java.util.concurrent.Callable;

/* loaded from: classes5.dex */
public final class ObservableDistinct<T, K> extends AbstractC11091a {

    /* renamed from: a */
    public final Function f65204a;

    /* renamed from: b */
    public final Callable f65205b;

    /* renamed from: io.reactivex.internal.operators.observable.ObservableDistinct$a */
    /* loaded from: classes5.dex */
    public static final class C10995a extends BasicFuseableObserver {

        /* renamed from: a */
        public final Collection f65206a;

        /* renamed from: b */
        public final Function f65207b;

        public C10995a(Observer observer, Function function, Collection collection) {
            super(observer);
            this.f65207b = function;
            this.f65206a = collection;
        }

        @Override // io.reactivex.internal.observers.BasicFuseableObserver, io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
            this.f65206a.clear();
            super.clear();
        }

        @Override // io.reactivex.internal.observers.BasicFuseableObserver, io.reactivex.Observer
        public void onComplete() {
            if (!this.done) {
                this.done = true;
                this.f65206a.clear();
                this.downstream.onComplete();
            }
        }

        @Override // io.reactivex.internal.observers.BasicFuseableObserver, io.reactivex.Observer
        public void onError(Throwable th2) {
            if (this.done) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.done = true;
            this.f65206a.clear();
            this.downstream.onError(th2);
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            if (this.done) {
                return;
            }
            if (this.sourceMode == 0) {
                try {
                    if (this.f65206a.add(ObjectHelper.requireNonNull(this.f65207b.apply(obj), "The keySelector returned a null key"))) {
                        this.downstream.onNext(obj);
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    fail(th2);
                    return;
                }
            }
            this.downstream.onNext(null);
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public Object poll() {
            T poll;
            do {
                poll = this.f63860qd.poll();
                if (poll == null) {
                    break;
                }
            } while (!this.f65206a.add(ObjectHelper.requireNonNull(this.f65207b.apply(poll), "The keySelector returned a null key")));
            return poll;
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int i) {
            return transitiveBoundaryFusion(i);
        }
    }

    public ObservableDistinct(ObservableSource<T> observableSource, Function<? super T, K> function, Callable<? extends Collection<? super K>> callable) {
        super(observableSource);
        this.f65204a = function;
        this.f65205b = callable;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        try {
            this.source.subscribe(new C10995a(observer, this.f65204a, (Collection) ObjectHelper.requireNonNull(this.f65205b.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            EmptyDisposable.error(th2, observer);
        }
    }
}
