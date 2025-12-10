package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.HasUpstreamObservableSource;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.observables.ConnectableObservable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class ObservablePublish<T> extends ConnectableObservable<T> implements HasUpstreamObservableSource<T>, ObservablePublishClassic<T> {

    /* renamed from: a */
    public final ObservableSource f65470a;

    /* renamed from: b */
    public final AtomicReference f65471b;

    /* renamed from: c */
    public final ObservableSource f65472c;

    /* loaded from: classes5.dex */
    public static final class InnerDisposable<T> extends AtomicReference<Object> implements Disposable {
        private static final long serialVersionUID = -1100270633763673112L;
        final Observer<? super T> child;

        public InnerDisposable(Observer<? super T> observer) {
            this.child = observer;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            Object andSet = getAndSet(this);
            if (andSet != null && andSet != this) {
                ((C11022a) andSet).m30295b(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            if (get() == this) {
                return true;
            }
            return false;
        }

        public void setParent(C11022a c11022a) {
            if (!compareAndSet(null, c11022a)) {
                c11022a.m30295b(this);
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservablePublish$a */
    /* loaded from: classes5.dex */
    public static final class C11022a implements Observer, Disposable {

        /* renamed from: e */
        public static final InnerDisposable[] f65473e = new InnerDisposable[0];

        /* renamed from: f */
        public static final InnerDisposable[] f65474f = new InnerDisposable[0];

        /* renamed from: a */
        public final AtomicReference f65475a;

        /* renamed from: d */
        public final AtomicReference f65478d = new AtomicReference();

        /* renamed from: b */
        public final AtomicReference f65476b = new AtomicReference(f65473e);

        /* renamed from: c */
        public final AtomicBoolean f65477c = new AtomicBoolean();

        public C11022a(AtomicReference atomicReference) {
            this.f65475a = atomicReference;
        }

        /* renamed from: a */
        public boolean m30296a(InnerDisposable innerDisposable) {
            InnerDisposable[] innerDisposableArr;
            InnerDisposable[] innerDisposableArr2;
            do {
                innerDisposableArr = (InnerDisposable[]) this.f65476b.get();
                if (innerDisposableArr == f65474f) {
                    return false;
                }
                int length = innerDisposableArr.length;
                innerDisposableArr2 = new InnerDisposable[length + 1];
                System.arraycopy(innerDisposableArr, 0, innerDisposableArr2, 0, length);
                innerDisposableArr2[length] = innerDisposable;
            } while (!AbstractC23094xo1.m479a(this.f65476b, innerDisposableArr, innerDisposableArr2));
            return true;
        }

        /* renamed from: b */
        public void m30295b(InnerDisposable innerDisposable) {
            InnerDisposable[] innerDisposableArr;
            InnerDisposable[] innerDisposableArr2;
            do {
                innerDisposableArr = (InnerDisposable[]) this.f65476b.get();
                int length = innerDisposableArr.length;
                if (length == 0) {
                    return;
                }
                int i = 0;
                while (true) {
                    if (i < length) {
                        if (innerDisposableArr[i].equals(innerDisposable)) {
                            break;
                        }
                        i++;
                    } else {
                        i = -1;
                        break;
                    }
                }
                if (i < 0) {
                    return;
                }
                if (length == 1) {
                    innerDisposableArr2 = f65473e;
                } else {
                    InnerDisposable[] innerDisposableArr3 = new InnerDisposable[length - 1];
                    System.arraycopy(innerDisposableArr, 0, innerDisposableArr3, 0, i);
                    System.arraycopy(innerDisposableArr, i + 1, innerDisposableArr3, i, (length - i) - 1);
                    innerDisposableArr2 = innerDisposableArr3;
                }
            } while (!AbstractC23094xo1.m479a(this.f65476b, innerDisposableArr, innerDisposableArr2));
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            AtomicReference atomicReference = this.f65476b;
            InnerDisposable[] innerDisposableArr = f65474f;
            if (((InnerDisposable[]) atomicReference.getAndSet(innerDisposableArr)) != innerDisposableArr) {
                AbstractC23094xo1.m479a(this.f65475a, this, null);
                DisposableHelper.dispose(this.f65478d);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            if (this.f65476b.get() == f65474f) {
                return true;
            }
            return false;
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            AbstractC23094xo1.m479a(this.f65475a, this, null);
            for (InnerDisposable innerDisposable : (InnerDisposable[]) this.f65476b.getAndSet(f65474f)) {
                innerDisposable.child.onComplete();
            }
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            AbstractC23094xo1.m479a(this.f65475a, this, null);
            InnerDisposable[] innerDisposableArr = (InnerDisposable[]) this.f65476b.getAndSet(f65474f);
            if (innerDisposableArr.length != 0) {
                for (InnerDisposable innerDisposable : innerDisposableArr) {
                    innerDisposable.child.onError(th2);
                }
                return;
            }
            RxJavaPlugins.onError(th2);
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            for (InnerDisposable innerDisposable : (InnerDisposable[]) this.f65476b.get()) {
                innerDisposable.child.onNext(obj);
            }
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this.f65478d, disposable);
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservablePublish$b */
    /* loaded from: classes5.dex */
    public static final class C11023b implements ObservableSource {

        /* renamed from: a */
        public final AtomicReference f65479a;

        public C11023b(AtomicReference atomicReference) {
            this.f65479a = atomicReference;
        }

        @Override // io.reactivex.ObservableSource
        public void subscribe(Observer observer) {
            InnerDisposable innerDisposable = new InnerDisposable(observer);
            observer.onSubscribe(innerDisposable);
            while (true) {
                C11022a c11022a = (C11022a) this.f65479a.get();
                if (c11022a == null || c11022a.isDisposed()) {
                    C11022a c11022a2 = new C11022a(this.f65479a);
                    if (AbstractC23094xo1.m479a(this.f65479a, c11022a, c11022a2)) {
                        c11022a = c11022a2;
                    } else {
                        continue;
                    }
                }
                if (c11022a.m30296a(innerDisposable)) {
                    innerDisposable.setParent(c11022a);
                    return;
                }
            }
        }
    }

    public ObservablePublish(ObservableSource observableSource, ObservableSource observableSource2, AtomicReference atomicReference) {
        this.f65472c = observableSource;
        this.f65470a = observableSource2;
        this.f65471b = atomicReference;
    }

    public static <T> ConnectableObservable<T> create(ObservableSource<T> observableSource) {
        AtomicReference atomicReference = new AtomicReference();
        return RxJavaPlugins.onAssembly((ConnectableObservable) new ObservablePublish(new C11023b(atomicReference), observableSource, atomicReference));
    }

    @Override // io.reactivex.observables.ConnectableObservable
    public void connect(Consumer<? super Disposable> consumer) {
        C11022a c11022a;
        while (true) {
            c11022a = (C11022a) this.f65471b.get();
            if (c11022a != null && !c11022a.isDisposed()) {
                break;
            }
            C11022a c11022a2 = new C11022a(this.f65471b);
            if (AbstractC23094xo1.m479a(this.f65471b, c11022a, c11022a2)) {
                c11022a = c11022a2;
                break;
            }
        }
        boolean z = false;
        if (!c11022a.f65477c.get() && c11022a.f65477c.compareAndSet(false, true)) {
            z = true;
        }
        try {
            consumer.accept(c11022a);
            if (z) {
                this.f65470a.subscribe(c11022a);
            }
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            throw ExceptionHelper.wrapOrThrow(th2);
        }
    }

    @Override // io.reactivex.internal.operators.observable.ObservablePublishClassic
    public ObservableSource<T> publishSource() {
        return this.f65470a;
    }

    @Override // io.reactivex.internal.fuseable.HasUpstreamObservableSource
    public ObservableSource<T> source() {
        return this.f65470a;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        this.f65472c.subscribe(observer);
    }
}