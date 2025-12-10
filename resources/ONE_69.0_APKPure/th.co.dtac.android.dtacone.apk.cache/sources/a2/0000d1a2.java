package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.observers.BasicFuseableObserver;

/* loaded from: classes5.dex */
public final class ObservableFilter<T> extends AbstractC11078a {

    /* renamed from: a */
    public final Predicate f65321a;

    /* renamed from: io.reactivex.internal.operators.observable.ObservableFilter$a */
    /* loaded from: classes5.dex */
    public static final class C10989a extends BasicFuseableObserver {

        /* renamed from: a */
        public final Predicate f65322a;

        public C10989a(Observer observer, Predicate predicate) {
            super(observer);
            this.f65322a = predicate;
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            if (this.sourceMode == 0) {
                try {
                    if (this.f65322a.test(obj)) {
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
                poll = this.f63923qd.poll();
                if (poll == null) {
                    break;
                }
            } while (!this.f65322a.test(poll));
            return poll;
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int i) {
            return transitiveBoundaryFusion(i);
        }
    }

    public ObservableFilter(ObservableSource<T> observableSource, Predicate<? super T> predicate) {
        super(observableSource);
        this.f65321a = predicate;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        this.source.subscribe(new C10989a(observer, this.f65321a));
    }
}