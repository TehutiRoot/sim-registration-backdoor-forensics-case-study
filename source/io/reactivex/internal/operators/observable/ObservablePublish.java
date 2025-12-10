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
    public final ObservableSource f65407a;

    /* renamed from: b */
    public final AtomicReference f65408b;

    /* renamed from: c */
    public final ObservableSource f65409c;

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
                ((C11035a) andSet).m29955b(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            if (get() == this) {
                return true;
            }
            return false;
        }

        public void setParent(C11035a c11035a) {
            if (!compareAndSet(null, c11035a)) {
                c11035a.m29955b(this);
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservablePublish$a */
    /* loaded from: classes5.dex */
    public static final class C11035a implements Observer, Disposable {

        /* renamed from: e */
        public static final InnerDisposable[] f65410e = new InnerDisposable[0];

        /* renamed from: f */
        public static final InnerDisposable[] f65411f = new InnerDisposable[0];

        /* renamed from: a */
        public final AtomicReference f65412a;

        /* renamed from: d */
        public final AtomicReference f65415d = new AtomicReference();

        /* renamed from: b */
        public final AtomicReference f65413b = new AtomicReference(f65410e);

        /* renamed from: c */
        public final AtomicBoolean f65414c = new AtomicBoolean();

        public C11035a(AtomicReference atomicReference) {
            this.f65412a = atomicReference;
        }

        /* renamed from: a */
        public boolean m29956a(InnerDisposable innerDisposable) {
            InnerDisposable[] innerDisposableArr;
            InnerDisposable[] innerDisposableArr2;
            do {
                innerDisposableArr = (InnerDisposable[]) this.f65413b.get();
                if (innerDisposableArr == f65411f) {
                    return false;
                }
                int length = innerDisposableArr.length;
                innerDisposableArr2 = new InnerDisposable[length + 1];
                System.arraycopy(innerDisposableArr, 0, innerDisposableArr2, 0, length);
                innerDisposableArr2[length] = innerDisposable;
            } while (!AbstractC17300An1.m69050a(this.f65413b, innerDisposableArr, innerDisposableArr2));
            return true;
        }

        /* renamed from: b */
        public void m29955b(InnerDisposable innerDisposable) {
            InnerDisposable[] innerDisposableArr;
            InnerDisposable[] innerDisposableArr2;
            do {
                innerDisposableArr = (InnerDisposable[]) this.f65413b.get();
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
                    innerDisposableArr2 = f65410e;
                } else {
                    InnerDisposable[] innerDisposableArr3 = new InnerDisposable[length - 1];
                    System.arraycopy(innerDisposableArr, 0, innerDisposableArr3, 0, i);
                    System.arraycopy(innerDisposableArr, i + 1, innerDisposableArr3, i, (length - i) - 1);
                    innerDisposableArr2 = innerDisposableArr3;
                }
            } while (!AbstractC17300An1.m69050a(this.f65413b, innerDisposableArr, innerDisposableArr2));
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            AtomicReference atomicReference = this.f65413b;
            InnerDisposable[] innerDisposableArr = f65411f;
            if (((InnerDisposable[]) atomicReference.getAndSet(innerDisposableArr)) != innerDisposableArr) {
                AbstractC17300An1.m69050a(this.f65412a, this, null);
                DisposableHelper.dispose(this.f65415d);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            if (this.f65413b.get() == f65411f) {
                return true;
            }
            return false;
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            AbstractC17300An1.m69050a(this.f65412a, this, null);
            for (InnerDisposable innerDisposable : (InnerDisposable[]) this.f65413b.getAndSet(f65411f)) {
                innerDisposable.child.onComplete();
            }
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            AbstractC17300An1.m69050a(this.f65412a, this, null);
            InnerDisposable[] innerDisposableArr = (InnerDisposable[]) this.f65413b.getAndSet(f65411f);
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
            for (InnerDisposable innerDisposable : (InnerDisposable[]) this.f65413b.get()) {
                innerDisposable.child.onNext(obj);
            }
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this.f65415d, disposable);
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservablePublish$b */
    /* loaded from: classes5.dex */
    public static final class C11036b implements ObservableSource {

        /* renamed from: a */
        public final AtomicReference f65416a;

        public C11036b(AtomicReference atomicReference) {
            this.f65416a = atomicReference;
        }

        @Override // io.reactivex.ObservableSource
        public void subscribe(Observer observer) {
            InnerDisposable innerDisposable = new InnerDisposable(observer);
            observer.onSubscribe(innerDisposable);
            while (true) {
                C11035a c11035a = (C11035a) this.f65416a.get();
                if (c11035a == null || c11035a.isDisposed()) {
                    C11035a c11035a2 = new C11035a(this.f65416a);
                    if (AbstractC17300An1.m69050a(this.f65416a, c11035a, c11035a2)) {
                        c11035a = c11035a2;
                    } else {
                        continue;
                    }
                }
                if (c11035a.m29956a(innerDisposable)) {
                    innerDisposable.setParent(c11035a);
                    return;
                }
            }
        }
    }

    public ObservablePublish(ObservableSource observableSource, ObservableSource observableSource2, AtomicReference atomicReference) {
        this.f65409c = observableSource;
        this.f65407a = observableSource2;
        this.f65408b = atomicReference;
    }

    public static <T> ConnectableObservable<T> create(ObservableSource<T> observableSource) {
        AtomicReference atomicReference = new AtomicReference();
        return RxJavaPlugins.onAssembly((ConnectableObservable) new ObservablePublish(new C11036b(atomicReference), observableSource, atomicReference));
    }

    @Override // io.reactivex.observables.ConnectableObservable
    public void connect(Consumer<? super Disposable> consumer) {
        C11035a c11035a;
        while (true) {
            c11035a = (C11035a) this.f65408b.get();
            if (c11035a != null && !c11035a.isDisposed()) {
                break;
            }
            C11035a c11035a2 = new C11035a(this.f65408b);
            if (AbstractC17300An1.m69050a(this.f65408b, c11035a, c11035a2)) {
                c11035a = c11035a2;
                break;
            }
        }
        boolean z = false;
        if (!c11035a.f65414c.get() && c11035a.f65414c.compareAndSet(false, true)) {
            z = true;
        }
        try {
            consumer.accept(c11035a);
            if (z) {
                this.f65407a.subscribe(c11035a);
            }
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            throw ExceptionHelper.wrapOrThrow(th2);
        }
    }

    @Override // io.reactivex.internal.operators.observable.ObservablePublishClassic
    public ObservableSource<T> publishSource() {
        return this.f65407a;
    }

    @Override // io.reactivex.internal.fuseable.HasUpstreamObservableSource
    public ObservableSource<T> source() {
        return this.f65407a;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        this.f65409c.subscribe(observer);
    }
}
