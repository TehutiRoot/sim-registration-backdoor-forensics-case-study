package com.jakewharton.rxrelay2;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class PublishRelay<T> extends Relay<T> {

    /* renamed from: b */
    public static final PublishDisposable[] f58366b = new PublishDisposable[0];

    /* renamed from: a */
    public final AtomicReference f58367a = new AtomicReference(f58366b);

    /* loaded from: classes5.dex */
    public static final class PublishDisposable<T> extends AtomicBoolean implements Disposable {
        private static final long serialVersionUID = 3562861878281475070L;
        final Observer<? super T> actual;
        final PublishRelay<T> parent;

        public PublishDisposable(Observer<? super T> observer, PublishRelay<T> publishRelay) {
            this.actual = observer;
            this.parent = publishRelay;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (compareAndSet(false, true)) {
                this.parent.m33711e(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return get();
        }

        public void onNext(T t) {
            if (!get()) {
                this.actual.onNext(t);
            }
        }
    }

    public static <T> PublishRelay<T> create() {
        return new PublishRelay<>();
    }

    @Override // com.jakewharton.rxrelay2.Relay, io.reactivex.functions.Consumer
    public void accept(T t) {
        if (t != null) {
            for (PublishDisposable publishDisposable : (PublishDisposable[]) this.f58367a.get()) {
                publishDisposable.onNext(t);
            }
            return;
        }
        throw new NullPointerException("value == null");
    }

    /* renamed from: d */
    public final void m33712d(PublishDisposable publishDisposable) {
        PublishDisposable[] publishDisposableArr;
        PublishDisposable[] publishDisposableArr2;
        do {
            publishDisposableArr = (PublishDisposable[]) this.f58367a.get();
            int length = publishDisposableArr.length;
            publishDisposableArr2 = new PublishDisposable[length + 1];
            System.arraycopy(publishDisposableArr, 0, publishDisposableArr2, 0, length);
            publishDisposableArr2[length] = publishDisposable;
        } while (!AbstractC23094xo1.m479a(this.f58367a, publishDisposableArr, publishDisposableArr2));
    }

    /* renamed from: e */
    public void m33711e(PublishDisposable publishDisposable) {
        PublishDisposable[] publishDisposableArr;
        PublishDisposable[] publishDisposableArr2;
        do {
            publishDisposableArr = (PublishDisposable[]) this.f58367a.get();
            if (publishDisposableArr == f58366b) {
                return;
            }
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
                publishDisposableArr2 = f58366b;
            } else {
                PublishDisposable[] publishDisposableArr3 = new PublishDisposable[length - 1];
                System.arraycopy(publishDisposableArr, 0, publishDisposableArr3, 0, i);
                System.arraycopy(publishDisposableArr, i + 1, publishDisposableArr3, i, (length - i) - 1);
                publishDisposableArr2 = publishDisposableArr3;
            }
        } while (!AbstractC23094xo1.m479a(this.f58367a, publishDisposableArr, publishDisposableArr2));
    }

    @Override // com.jakewharton.rxrelay2.Relay
    public boolean hasObservers() {
        if (((PublishDisposable[]) this.f58367a.get()).length != 0) {
            return true;
        }
        return false;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        PublishDisposable publishDisposable = new PublishDisposable(observer, this);
        observer.onSubscribe(publishDisposable);
        m33712d(publishDisposable);
        if (publishDisposable.isDisposed()) {
            m33711e(publishDisposable);
        }
    }
}