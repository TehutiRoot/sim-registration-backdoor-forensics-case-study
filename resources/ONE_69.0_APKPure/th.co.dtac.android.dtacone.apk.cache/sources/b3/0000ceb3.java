package io.reactivex.internal.operators.completable;

import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.observers.BasicQueueDisposable;

/* loaded from: classes5.dex */
public final class CompletableToObservable<T> extends Observable<T> {

    /* renamed from: a */
    public final CompletableSource f64059a;

    /* renamed from: io.reactivex.internal.operators.completable.CompletableToObservable$a */
    /* loaded from: classes5.dex */
    public static final class C10790a extends BasicQueueDisposable implements CompletableObserver {

        /* renamed from: a */
        public final Observer f64060a;

        /* renamed from: b */
        public Disposable f64061b;

        public C10790a(Observer observer) {
            this.f64060a = observer;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        /* renamed from: a */
        public Void poll() {
            return null;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f64061b.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f64061b.isDisposed();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
            return true;
        }

        @Override // io.reactivex.CompletableObserver
        public void onComplete() {
            this.f64060a.onComplete();
        }

        @Override // io.reactivex.CompletableObserver
        public void onError(Throwable th2) {
            this.f64060a.onError(th2);
        }

        @Override // io.reactivex.CompletableObserver
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f64061b, disposable)) {
                this.f64061b = disposable;
                this.f64060a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int i) {
            return i & 2;
        }
    }

    public CompletableToObservable(CompletableSource completableSource) {
        this.f64059a = completableSource;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        this.f64059a.subscribe(new C10790a(observer));
    }
}