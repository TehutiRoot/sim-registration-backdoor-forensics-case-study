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
    public final CompletableSource f63996a;

    /* renamed from: io.reactivex.internal.operators.completable.CompletableToObservable$a */
    /* loaded from: classes5.dex */
    public static final class C10803a extends BasicQueueDisposable implements CompletableObserver {

        /* renamed from: a */
        public final Observer f63997a;

        /* renamed from: b */
        public Disposable f63998b;

        public C10803a(Observer observer) {
            this.f63997a = observer;
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
            this.f63998b.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f63998b.isDisposed();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
            return true;
        }

        @Override // io.reactivex.CompletableObserver
        public void onComplete() {
            this.f63997a.onComplete();
        }

        @Override // io.reactivex.CompletableObserver
        public void onError(Throwable th2) {
            this.f63997a.onError(th2);
        }

        @Override // io.reactivex.CompletableObserver
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f63998b, disposable)) {
                this.f63998b = disposable;
                this.f63997a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int i) {
            return i & 2;
        }
    }

    public CompletableToObservable(CompletableSource completableSource) {
        this.f63996a = completableSource;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        this.f63996a.subscribe(new C10803a(observer));
    }
}
