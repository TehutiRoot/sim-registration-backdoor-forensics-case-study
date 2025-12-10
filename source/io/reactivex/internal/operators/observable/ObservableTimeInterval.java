package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.schedulers.Timed;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public final class ObservableTimeInterval<T> extends AbstractC11091a {

    /* renamed from: a */
    public final Scheduler f65600a;

    /* renamed from: b */
    public final TimeUnit f65601b;

    /* renamed from: io.reactivex.internal.operators.observable.ObservableTimeInterval$a */
    /* loaded from: classes5.dex */
    public static final class C11067a implements Observer, Disposable {

        /* renamed from: a */
        public final Observer f65602a;

        /* renamed from: b */
        public final TimeUnit f65603b;

        /* renamed from: c */
        public final Scheduler f65604c;

        /* renamed from: d */
        public long f65605d;

        /* renamed from: e */
        public Disposable f65606e;

        public C11067a(Observer observer, TimeUnit timeUnit, Scheduler scheduler) {
            this.f65602a = observer;
            this.f65604c = scheduler;
            this.f65603b = timeUnit;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f65606e.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f65606e.isDisposed();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.f65602a.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            this.f65602a.onError(th2);
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            long now = this.f65604c.now(this.f65603b);
            long j = this.f65605d;
            this.f65605d = now;
            this.f65602a.onNext(new Timed(obj, now - j, this.f65603b));
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f65606e, disposable)) {
                this.f65606e = disposable;
                this.f65605d = this.f65604c.now(this.f65603b);
                this.f65602a.onSubscribe(this);
            }
        }
    }

    public ObservableTimeInterval(ObservableSource<T> observableSource, TimeUnit timeUnit, Scheduler scheduler) {
        super(observableSource);
        this.f65600a = scheduler;
        this.f65601b = timeUnit;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super Timed<T>> observer) {
        this.source.subscribe(new C11067a(observer, this.f65601b, this.f65600a));
    }
}
