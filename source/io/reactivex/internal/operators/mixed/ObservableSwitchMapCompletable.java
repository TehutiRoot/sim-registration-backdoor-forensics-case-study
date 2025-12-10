package io.reactivex.internal.operators.mixed;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class ObservableSwitchMapCompletable<T> extends Completable {

    /* renamed from: a */
    public final Observable f64964a;

    /* renamed from: b */
    public final Function f64965b;

    /* renamed from: c */
    public final boolean f64966c;

    /* loaded from: classes5.dex */
    public static final class SwitchMapCompletableObserver implements Observer, Disposable {

        /* renamed from: h */
        public static final SwitchMapInnerObserver f64967h = new SwitchMapInnerObserver(null);

        /* renamed from: a */
        public final CompletableObserver f64968a;

        /* renamed from: b */
        public final Function f64969b;

        /* renamed from: c */
        public final boolean f64970c;

        /* renamed from: d */
        public final AtomicThrowable f64971d = new AtomicThrowable();

        /* renamed from: e */
        public final AtomicReference f64972e = new AtomicReference();

        /* renamed from: f */
        public volatile boolean f64973f;

        /* renamed from: g */
        public Disposable f64974g;

        /* loaded from: classes5.dex */
        public static final class SwitchMapInnerObserver extends AtomicReference<Disposable> implements CompletableObserver {
            private static final long serialVersionUID = -8003404460084760287L;
            final SwitchMapCompletableObserver parent;

            public SwitchMapInnerObserver(SwitchMapCompletableObserver switchMapCompletableObserver) {
                this.parent = switchMapCompletableObserver;
            }

            public void dispose() {
                DisposableHelper.dispose(this);
            }

            @Override // io.reactivex.CompletableObserver
            public void onComplete() {
                this.parent.m30001b(this);
            }

            @Override // io.reactivex.CompletableObserver
            public void onError(Throwable th2) {
                this.parent.m30000c(this, th2);
            }

            @Override // io.reactivex.CompletableObserver
            public void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this, disposable);
            }
        }

        public SwitchMapCompletableObserver(CompletableObserver completableObserver, Function function, boolean z) {
            this.f64968a = completableObserver;
            this.f64969b = function;
            this.f64970c = z;
        }

        /* renamed from: a */
        public void m30002a() {
            AtomicReference atomicReference = this.f64972e;
            SwitchMapInnerObserver switchMapInnerObserver = f64967h;
            SwitchMapInnerObserver switchMapInnerObserver2 = (SwitchMapInnerObserver) atomicReference.getAndSet(switchMapInnerObserver);
            if (switchMapInnerObserver2 != null && switchMapInnerObserver2 != switchMapInnerObserver) {
                switchMapInnerObserver2.dispose();
            }
        }

        /* renamed from: b */
        public void m30001b(SwitchMapInnerObserver switchMapInnerObserver) {
            if (AbstractC17300An1.m69050a(this.f64972e, switchMapInnerObserver, null) && this.f64973f) {
                Throwable terminate = this.f64971d.terminate();
                if (terminate == null) {
                    this.f64968a.onComplete();
                } else {
                    this.f64968a.onError(terminate);
                }
            }
        }

        /* renamed from: c */
        public void m30000c(SwitchMapInnerObserver switchMapInnerObserver, Throwable th2) {
            if (AbstractC17300An1.m69050a(this.f64972e, switchMapInnerObserver, null) && this.f64971d.addThrowable(th2)) {
                if (this.f64970c) {
                    if (this.f64973f) {
                        this.f64968a.onError(this.f64971d.terminate());
                        return;
                    }
                    return;
                }
                dispose();
                Throwable terminate = this.f64971d.terminate();
                if (terminate != ExceptionHelper.TERMINATED) {
                    this.f64968a.onError(terminate);
                    return;
                }
                return;
            }
            RxJavaPlugins.onError(th2);
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f64974g.dispose();
            m30002a();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            if (this.f64972e.get() == f64967h) {
                return true;
            }
            return false;
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.f64973f = true;
            if (this.f64972e.get() == null) {
                Throwable terminate = this.f64971d.terminate();
                if (terminate == null) {
                    this.f64968a.onComplete();
                } else {
                    this.f64968a.onError(terminate);
                }
            }
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            if (this.f64971d.addThrowable(th2)) {
                if (this.f64970c) {
                    onComplete();
                    return;
                }
                m30002a();
                Throwable terminate = this.f64971d.terminate();
                if (terminate != ExceptionHelper.TERMINATED) {
                    this.f64968a.onError(terminate);
                    return;
                }
                return;
            }
            RxJavaPlugins.onError(th2);
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            SwitchMapInnerObserver switchMapInnerObserver;
            try {
                CompletableSource completableSource = (CompletableSource) ObjectHelper.requireNonNull(this.f64969b.apply(obj), "The mapper returned a null CompletableSource");
                SwitchMapInnerObserver switchMapInnerObserver2 = new SwitchMapInnerObserver(this);
                do {
                    switchMapInnerObserver = (SwitchMapInnerObserver) this.f64972e.get();
                    if (switchMapInnerObserver == f64967h) {
                        return;
                    }
                } while (!AbstractC17300An1.m69050a(this.f64972e, switchMapInnerObserver, switchMapInnerObserver2));
                if (switchMapInnerObserver != null) {
                    switchMapInnerObserver.dispose();
                }
                completableSource.subscribe(switchMapInnerObserver2);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f64974g.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f64974g, disposable)) {
                this.f64974g = disposable;
                this.f64968a.onSubscribe(this);
            }
        }
    }

    public ObservableSwitchMapCompletable(Observable<T> observable, Function<? super T, ? extends CompletableSource> function, boolean z) {
        this.f64964a = observable;
        this.f64965b = function;
        this.f64966c = z;
    }

    @Override // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        if (!AbstractC21210nE1.m26150a(this.f64964a, this.f64965b, completableObserver)) {
            this.f64964a.subscribe(new SwitchMapCompletableObserver(completableObserver, this.f64965b, this.f64966c));
        }
    }
}
