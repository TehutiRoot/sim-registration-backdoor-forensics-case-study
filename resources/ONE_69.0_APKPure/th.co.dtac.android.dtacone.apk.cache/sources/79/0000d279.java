package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.schedulers.Timed;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public final class ObservableTimeInterval<T> extends AbstractC11078a {

    /* renamed from: a */
    public final Scheduler f65663a;

    /* renamed from: b */
    public final TimeUnit f65664b;

    /* renamed from: io.reactivex.internal.operators.observable.ObservableTimeInterval$a */
    /* loaded from: classes5.dex */
    public static final class C11054a implements Observer, Disposable {

        /* renamed from: a */
        public final Observer f65665a;

        /* renamed from: b */
        public final TimeUnit f65666b;

        /* renamed from: c */
        public final Scheduler f65667c;

        /* renamed from: d */
        public long f65668d;

        /* renamed from: e */
        public Disposable f65669e;

        public C11054a(Observer observer, TimeUnit timeUnit, Scheduler scheduler) {
            this.f65665a = observer;
            this.f65667c = scheduler;
            this.f65666b = timeUnit;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f65669e.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f65669e.isDisposed();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.f65665a.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            this.f65665a.onError(th2);
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            long now = this.f65667c.now(this.f65666b);
            long j = this.f65668d;
            this.f65668d = now;
            this.f65665a.onNext(new Timed(obj, now - j, this.f65666b));
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f65669e, disposable)) {
                this.f65669e = disposable;
                this.f65668d = this.f65667c.now(this.f65666b);
                this.f65665a.onSubscribe(this);
            }
        }
    }

    public ObservableTimeInterval(ObservableSource<T> observableSource, TimeUnit timeUnit, Scheduler scheduler) {
        super(observableSource);
        this.f65663a = scheduler;
        this.f65664b = timeUnit;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super Timed<T>> observer) {
        this.source.subscribe(new C11054a(observer, this.f65664b, this.f65663a));
    }
}