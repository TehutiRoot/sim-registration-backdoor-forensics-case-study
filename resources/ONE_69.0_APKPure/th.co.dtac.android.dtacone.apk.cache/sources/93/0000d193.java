package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.observers.BasicFuseableObserver;

/* loaded from: classes5.dex */
public final class ObservableDoAfterNext<T> extends AbstractC11078a {

    /* renamed from: a */
    public final Consumer f65277a;

    /* renamed from: io.reactivex.internal.operators.observable.ObservableDoAfterNext$a */
    /* loaded from: classes5.dex */
    public static final class C10984a extends BasicFuseableObserver {

        /* renamed from: a */
        public final Consumer f65278a;

        public C10984a(Observer observer, Consumer consumer) {
            super(observer);
            this.f65278a = consumer;
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            this.downstream.onNext(obj);
            if (this.sourceMode == 0) {
                try {
                    this.f65278a.accept(obj);
                } catch (Throwable th2) {
                    fail(th2);
                }
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public Object poll() {
            T poll = this.f63923qd.poll();
            if (poll != null) {
                this.f65278a.accept(poll);
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
        this.f65277a = consumer;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        this.source.subscribe(new C10984a(observer, this.f65277a));
    }
}