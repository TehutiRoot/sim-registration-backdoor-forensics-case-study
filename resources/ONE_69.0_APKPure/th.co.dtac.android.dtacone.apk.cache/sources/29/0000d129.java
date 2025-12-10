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
    public final Observable f65027a;

    /* renamed from: b */
    public final Function f65028b;

    /* renamed from: c */
    public final boolean f65029c;

    /* loaded from: classes5.dex */
    public static final class SwitchMapCompletableObserver implements Observer, Disposable {

        /* renamed from: h */
        public static final SwitchMapInnerObserver f65030h = new SwitchMapInnerObserver(null);

        /* renamed from: a */
        public final CompletableObserver f65031a;

        /* renamed from: b */
        public final Function f65032b;

        /* renamed from: c */
        public final boolean f65033c;

        /* renamed from: d */
        public final AtomicThrowable f65034d = new AtomicThrowable();

        /* renamed from: e */
        public final AtomicReference f65035e = new AtomicReference();

        /* renamed from: f */
        public volatile boolean f65036f;

        /* renamed from: g */
        public Disposable f65037g;

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
                this.parent.m30341b(this);
            }

            @Override // io.reactivex.CompletableObserver
            public void onError(Throwable th2) {
                this.parent.m30340c(this, th2);
            }

            @Override // io.reactivex.CompletableObserver
            public void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this, disposable);
            }
        }

        public SwitchMapCompletableObserver(CompletableObserver completableObserver, Function function, boolean z) {
            this.f65031a = completableObserver;
            this.f65032b = function;
            this.f65033c = z;
        }

        /* renamed from: a */
        public void m30342a() {
            AtomicReference atomicReference = this.f65035e;
            SwitchMapInnerObserver switchMapInnerObserver = f65030h;
            SwitchMapInnerObserver switchMapInnerObserver2 = (SwitchMapInnerObserver) atomicReference.getAndSet(switchMapInnerObserver);
            if (switchMapInnerObserver2 != null && switchMapInnerObserver2 != switchMapInnerObserver) {
                switchMapInnerObserver2.dispose();
            }
        }

        /* renamed from: b */
        public void m30341b(SwitchMapInnerObserver switchMapInnerObserver) {
            if (AbstractC23094xo1.m479a(this.f65035e, switchMapInnerObserver, null) && this.f65036f) {
                Throwable terminate = this.f65034d.terminate();
                if (terminate == null) {
                    this.f65031a.onComplete();
                } else {
                    this.f65031a.onError(terminate);
                }
            }
        }

        /* renamed from: c */
        public void m30340c(SwitchMapInnerObserver switchMapInnerObserver, Throwable th2) {
            if (AbstractC23094xo1.m479a(this.f65035e, switchMapInnerObserver, null) && this.f65034d.addThrowable(th2)) {
                if (this.f65033c) {
                    if (this.f65036f) {
                        this.f65031a.onError(this.f65034d.terminate());
                        return;
                    }
                    return;
                }
                dispose();
                Throwable terminate = this.f65034d.terminate();
                if (terminate != ExceptionHelper.TERMINATED) {
                    this.f65031a.onError(terminate);
                    return;
                }
                return;
            }
            RxJavaPlugins.onError(th2);
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f65037g.dispose();
            m30342a();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            if (this.f65035e.get() == f65030h) {
                return true;
            }
            return false;
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.f65036f = true;
            if (this.f65035e.get() == null) {
                Throwable terminate = this.f65034d.terminate();
                if (terminate == null) {
                    this.f65031a.onComplete();
                } else {
                    this.f65031a.onError(terminate);
                }
            }
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            if (this.f65034d.addThrowable(th2)) {
                if (this.f65033c) {
                    onComplete();
                    return;
                }
                m30342a();
                Throwable terminate = this.f65034d.terminate();
                if (terminate != ExceptionHelper.TERMINATED) {
                    this.f65031a.onError(terminate);
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
                CompletableSource completableSource = (CompletableSource) ObjectHelper.requireNonNull(this.f65032b.apply(obj), "The mapper returned a null CompletableSource");
                SwitchMapInnerObserver switchMapInnerObserver2 = new SwitchMapInnerObserver(this);
                do {
                    switchMapInnerObserver = (SwitchMapInnerObserver) this.f65035e.get();
                    if (switchMapInnerObserver == f65030h) {
                        return;
                    }
                } while (!AbstractC23094xo1.m479a(this.f65035e, switchMapInnerObserver, switchMapInnerObserver2));
                if (switchMapInnerObserver != null) {
                    switchMapInnerObserver.dispose();
                }
                completableSource.subscribe(switchMapInnerObserver2);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f65037g.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f65037g, disposable)) {
                this.f65037g = disposable;
                this.f65031a.onSubscribe(this);
            }
        }
    }

    public ObservableSwitchMapCompletable(Observable<T> observable, Function<? super T, ? extends CompletableSource> function, boolean z) {
        this.f65027a = observable;
        this.f65028b = function;
        this.f65029c = z;
    }

    @Override // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        if (!AbstractC20753kF1.m29262a(this.f65027a, this.f65028b, completableObserver)) {
            this.f65027a.subscribe(new SwitchMapCompletableObserver(completableObserver, this.f65028b, this.f65029c));
        }
    }
}