package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.observers.BasicFuseableObserver;

/* loaded from: classes5.dex */
public final class ObservableFilter<T> extends AbstractC11091a {

    /* renamed from: a */
    public final Predicate f65258a;

    /* renamed from: io.reactivex.internal.operators.observable.ObservableFilter$a */
    /* loaded from: classes5.dex */
    public static final class C11002a extends BasicFuseableObserver {

        /* renamed from: a */
        public final Predicate f65259a;

        public C11002a(Observer observer, Predicate predicate) {
            super(observer);
            this.f65259a = predicate;
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            if (this.sourceMode == 0) {
                try {
                    if (this.f65259a.test(obj)) {
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
            } while (!this.f65259a.test(poll));
            return poll;
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int i) {
            return transitiveBoundaryFusion(i);
        }
    }

    public ObservableFilter(ObservableSource<T> observableSource, Predicate<? super T> predicate) {
        super(observableSource);
        this.f65258a = predicate;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        this.source.subscribe(new C11002a(observer, this.f65258a));
    }
}
