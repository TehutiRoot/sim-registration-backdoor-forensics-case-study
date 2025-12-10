package io.reactivex.subjects;

import io.reactivex.Observer;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.Nullable;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class PublishSubject<T> extends Subject<T> {

    /* renamed from: c */
    public static final PublishDisposable[] f66424c = new PublishDisposable[0];

    /* renamed from: d */
    public static final PublishDisposable[] f66425d = new PublishDisposable[0];

    /* renamed from: a */
    public final AtomicReference f66426a = new AtomicReference(f66425d);

    /* renamed from: b */
    public Throwable f66427b;

    /* loaded from: classes5.dex */
    public static final class PublishDisposable<T> extends AtomicBoolean implements Disposable {
        private static final long serialVersionUID = 3562861878281475070L;
        final Observer<? super T> downstream;
        final PublishSubject<T> parent;

        public PublishDisposable(Observer<? super T> observer, PublishSubject<T> publishSubject) {
            this.downstream = observer;
            this.parent = publishSubject;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (compareAndSet(false, true)) {
                this.parent.m29777e(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return get();
        }

        public void onComplete() {
            if (!get()) {
                this.downstream.onComplete();
            }
        }

        public void onError(Throwable th2) {
            if (get()) {
                RxJavaPlugins.onError(th2);
            } else {
                this.downstream.onError(th2);
            }
        }

        public void onNext(T t) {
            if (!get()) {
                this.downstream.onNext(t);
            }
        }
    }

    @CheckReturnValue
    @NonNull
    public static <T> PublishSubject<T> create() {
        return new PublishSubject<>();
    }

    /* renamed from: d */
    public boolean m29778d(PublishDisposable publishDisposable) {
        PublishDisposable[] publishDisposableArr;
        PublishDisposable[] publishDisposableArr2;
        do {
            publishDisposableArr = (PublishDisposable[]) this.f66426a.get();
            if (publishDisposableArr == f66424c) {
                return false;
            }
            int length = publishDisposableArr.length;
            publishDisposableArr2 = new PublishDisposable[length + 1];
            System.arraycopy(publishDisposableArr, 0, publishDisposableArr2, 0, length);
            publishDisposableArr2[length] = publishDisposable;
        } while (!AbstractC17300An1.m69050a(this.f66426a, publishDisposableArr, publishDisposableArr2));
        return true;
    }

    /* renamed from: e */
    public void m29777e(PublishDisposable publishDisposable) {
        PublishDisposable[] publishDisposableArr;
        PublishDisposable[] publishDisposableArr2;
        do {
            publishDisposableArr = (PublishDisposable[]) this.f66426a.get();
            if (publishDisposableArr != f66424c && publishDisposableArr != f66425d) {
                int length = publishDisposableArr.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        if (publishDisposableArr[i] == publishDisposable) {
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
                    publishDisposableArr2 = f66425d;
                } else {
                    PublishDisposable[] publishDisposableArr3 = new PublishDisposable[length - 1];
                    System.arraycopy(publishDisposableArr, 0, publishDisposableArr3, 0, i);
                    System.arraycopy(publishDisposableArr, i + 1, publishDisposableArr3, i, (length - i) - 1);
                    publishDisposableArr2 = publishDisposableArr3;
                }
            } else {
                return;
            }
        } while (!AbstractC17300An1.m69050a(this.f66426a, publishDisposableArr, publishDisposableArr2));
    }

    @Override // io.reactivex.subjects.Subject
    @Nullable
    public Throwable getThrowable() {
        if (this.f66426a.get() == f66424c) {
            return this.f66427b;
        }
        return null;
    }

    @Override // io.reactivex.subjects.Subject
    public boolean hasComplete() {
        if (this.f66426a.get() == f66424c && this.f66427b == null) {
            return true;
        }
        return false;
    }

    @Override // io.reactivex.subjects.Subject
    public boolean hasObservers() {
        if (((PublishDisposable[]) this.f66426a.get()).length != 0) {
            return true;
        }
        return false;
    }

    @Override // io.reactivex.subjects.Subject
    public boolean hasThrowable() {
        if (this.f66426a.get() == f66424c && this.f66427b != null) {
            return true;
        }
        return false;
    }

    @Override // io.reactivex.Observer
    public void onComplete() {
        Object obj = this.f66426a.get();
        Object obj2 = f66424c;
        if (obj == obj2) {
            return;
        }
        for (PublishDisposable publishDisposable : (PublishDisposable[]) this.f66426a.getAndSet(obj2)) {
            publishDisposable.onComplete();
        }
    }

    @Override // io.reactivex.Observer
    public void onError(Throwable th2) {
        ObjectHelper.requireNonNull(th2, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        Object obj = this.f66426a.get();
        Object obj2 = f66424c;
        if (obj == obj2) {
            RxJavaPlugins.onError(th2);
            return;
        }
        this.f66427b = th2;
        for (PublishDisposable publishDisposable : (PublishDisposable[]) this.f66426a.getAndSet(obj2)) {
            publishDisposable.onError(th2);
        }
    }

    @Override // io.reactivex.Observer
    public void onNext(T t) {
        ObjectHelper.requireNonNull(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        for (PublishDisposable publishDisposable : (PublishDisposable[]) this.f66426a.get()) {
            publishDisposable.onNext(t);
        }
    }

    @Override // io.reactivex.Observer
    public void onSubscribe(Disposable disposable) {
        if (this.f66426a.get() == f66424c) {
            disposable.dispose();
        }
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        PublishDisposable publishDisposable = new PublishDisposable(observer, this);
        observer.onSubscribe(publishDisposable);
        if (m29778d(publishDisposable)) {
            if (publishDisposable.isDisposed()) {
                m29777e(publishDisposable);
                return;
            }
            return;
        }
        Throwable th2 = this.f66427b;
        if (th2 != null) {
            observer.onError(th2);
        } else {
            observer.onComplete();
        }
    }
}
