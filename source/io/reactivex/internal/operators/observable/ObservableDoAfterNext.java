package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.observers.BasicFuseableObserver;

/* loaded from: classes5.dex */
public final class ObservableDoAfterNext<T> extends AbstractC11091a {

    /* renamed from: a */
    public final Consumer f65214a;

    /* renamed from: io.reactivex.internal.operators.observable.ObservableDoAfterNext$a */
    /* loaded from: classes5.dex */
    public static final class C10997a extends BasicFuseableObserver {

        /* renamed from: a */
        public final Consumer f65215a;

        public C10997a(Observer observer, Consumer consumer) {
            super(observer);
            this.f65215a = consumer;
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            this.downstream.onNext(obj);
            if (this.sourceMode == 0) {
                try {
                    this.f65215a.accept(obj);
                } catch (Throwable th2) {
                    fail(th2);
                }
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public Object poll() {
            T poll = this.f63860qd.poll();
            if (poll != null) {
                this.f65215a.accept(poll);
            }
            return poll;
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int i) {
            return transitiveBoundaryFusion(i);
        }
    }

    public ObservableDoAfterNext(ObservableSource<T> observableSource, Consumer<? super T> consumer) {
        super(observableSource);
        this.f65214a = consumer;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        this.source.subscribe(new C10997a(observer, this.f65214a));
    }
}
