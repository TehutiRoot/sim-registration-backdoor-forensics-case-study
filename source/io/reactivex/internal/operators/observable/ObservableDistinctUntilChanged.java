package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.functions.BiPredicate;
import io.reactivex.functions.Function;
import io.reactivex.internal.observers.BasicFuseableObserver;

/* loaded from: classes5.dex */
public final class ObservableDistinctUntilChanged<T, K> extends AbstractC11091a {

    /* renamed from: a */
    public final Function f65208a;

    /* renamed from: b */
    public final BiPredicate f65209b;

    /* renamed from: io.reactivex.internal.operators.observable.ObservableDistinctUntilChanged$a */
    /* loaded from: classes5.dex */
    public static final class C10996a extends BasicFuseableObserver {

        /* renamed from: a */
        public final Function f65210a;

        /* renamed from: b */
        public final BiPredicate f65211b;

        /* renamed from: c */
        public Object f65212c;

        /* renamed from: d */
        public boolean f65213d;

        public C10996a(Observer observer, Function function, BiPredicate biPredicate) {
            super(observer);
            this.f65210a = function;
            this.f65211b = biPredicate;
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
                Object apply = this.f65210a.apply(obj);
                if (this.f65213d) {
                    boolean test = this.f65211b.test(this.f65212c, apply);
                    this.f65212c = apply;
                    if (test) {
                        return;
                    }
                } else {
                    this.f65213d = true;
                    this.f65212c = apply;
                }
                this.downstream.onNext(obj);
            } catch (Throwable th2) {
                fail(th2);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public Object poll() {
            while (true) {
                T poll = this.f63860qd.poll();
                if (poll == null) {
                    return null;
                }
                Object apply = this.f65210a.apply(poll);
                if (!this.f65213d) {
                    this.f65213d = true;
                    this.f65212c = apply;
                    return poll;
                } else if (!this.f65211b.test(this.f65212c, apply)) {
                    this.f65212c = apply;
                    return poll;
                } else {
                    this.f65212c = apply;
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
        this.f65208a = function;
        this.f65209b = biPredicate;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        this.source.subscribe(new C10996a(observer, this.f65208a, this.f65209b));
    }
}
