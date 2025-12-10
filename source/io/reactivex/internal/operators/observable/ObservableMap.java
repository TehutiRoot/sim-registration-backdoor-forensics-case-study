package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.observers.BasicFuseableObserver;

/* loaded from: classes5.dex */
public final class ObservableMap<T, U> extends AbstractC11091a {

    /* renamed from: a */
    public final Function f65377a;

    /* renamed from: io.reactivex.internal.operators.observable.ObservableMap$a */
    /* loaded from: classes5.dex */
    public static final class C11030a extends BasicFuseableObserver {

        /* renamed from: a */
        public final Function f65378a;

        public C11030a(Observer observer, Function function) {
            super(observer);
            this.f65378a = function;
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            if (this.done) {
                return;
            }
            if (this.sourceMode != 0) {
                this.downstream.onNext(null);
                return;
            }
            try {
                this.downstream.onNext(ObjectHelper.requireNonNull(this.f65378a.apply(obj), "The mapper function returned a null value."));
            } catch (Throwable th2) {
                fail(th2);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public Object poll() {
            T poll = this.f63860qd.poll();
            if (poll != null) {
                return ObjectHelper.requireNonNull(this.f65378a.apply(poll), "The mapper function returned a null value.");
            }
            return null;
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int i) {
            return transitiveBoundaryFusion(i);
        }
    }

    public ObservableMap(ObservableSource<T> observableSource, Function<? super T, ? extends U> function) {
        super(observableSource);
        this.f65377a = function;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super U> observer) {
        this.source.subscribe(new C11030a(observer, this.f65377a));
    }
}
