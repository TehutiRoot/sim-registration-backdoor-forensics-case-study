package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.functions.BiPredicate;
import io.reactivex.functions.Function;
import io.reactivex.internal.observers.BasicFuseableObserver;

/* loaded from: classes5.dex */
public final class ObservableDistinctUntilChanged<T, K> extends AbstractC11078a {

    /* renamed from: a */
    public final Function f65271a;

    /* renamed from: b */
    public final BiPredicate f65272b;

    /* renamed from: io.reactivex.internal.operators.observable.ObservableDistinctUntilChanged$a */
    /* loaded from: classes5.dex */
    public static final class C10983a extends BasicFuseableObserver {

        /* renamed from: a */
        public final Function f65273a;

        /* renamed from: b */
        public final BiPredicate f65274b;

        /* renamed from: c */
        public Object f65275c;

        /* renamed from: d */
        public boolean f65276d;

        public C10983a(Observer observer, Function function, BiPredicate biPredicate) {
            super(observer);
            this.f65273a = function;
            this.f65274b = biPredicate;
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            if (this.done) {
                return;
            }
            if (this.sourceMode != 0) {
                this.downstream.onNext(obj);
                return;
            }
            try {
                Object apply = this.f65273a.apply(obj);
                if (this.f65276d) {
                    boolean test = this.f65274b.test(this.f65275c, apply);
                    this.f65275c = apply;
                    if (test) {
                        return;
                    }
                } else {
                    this.f65276d = true;
                    this.f65275c = apply;
                }
                this.downstream.onNext(obj);
            } catch (Throwable th2) {
                fail(th2);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public Object poll() {
            while (true) {
                T poll = this.f63923qd.poll();
                if (poll == null) {
                    return null;
                }
                Object apply = this.f65273a.apply(poll);
                if (!this.f65276d) {
                    this.f65276d = true;
                    this.f65275c = apply;
                    return poll;
                } else if (!this.f65274b.test(this.f65275c, apply)) {
                    this.f65275c = apply;
                    return poll;
                } else {
                    this.f65275c = apply;
                }
            }
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int i) {
            return transitiveBoundaryFusion(i);
        }
    }

    public ObservableDistinctUntilChanged(ObservableSource<T> observableSource, Function<? super T, K> function, BiPredicate<? super K, ? super K> biPredicate) {
        super(observableSource);
        this.f65271a = function;
        this.f65272b = biPredicate;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        this.source.subscribe(new C10983a(observer, this.f65271a, this.f65272b));
    }
}