package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes5.dex */
public final class SingleAmb<T> extends Single<T> {

    /* renamed from: a */
    public final SingleSource[] f65837a;

    /* renamed from: b */
    public final Iterable f65838b;

    /* renamed from: io.reactivex.internal.operators.single.SingleAmb$a */
    /* loaded from: classes5.dex */
    public static final class C11110a implements SingleObserver {

        /* renamed from: a */
        public final CompositeDisposable f65839a;

        /* renamed from: b */
        public final SingleObserver f65840b;

        /* renamed from: c */
        public final AtomicBoolean f65841c;

        /* renamed from: d */
        public Disposable f65842d;

        public C11110a(SingleObserver singleObserver, CompositeDisposable compositeDisposable, AtomicBoolean atomicBoolean) {
            this.f65840b = singleObserver;
            this.f65839a = compositeDisposable;
            this.f65841c = atomicBoolean;
        }

        @Override // io.reactivex.SingleObserver
        public void onError(Throwable th2) {
            if (this.f65841c.compareAndSet(false, true)) {
                this.f65839a.delete(this.f65842d);
                this.f65839a.dispose();
                this.f65840b.onError(th2);
                return;
            }
            RxJavaPlugins.onError(th2);
        }

        @Override // io.reactivex.SingleObserver
        public void onSubscribe(Disposable disposable) {
            this.f65842d = disposable;
            this.f65839a.add(disposable);
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(Object obj) {
            if (this.f65841c.compareAndSet(false, true)) {
                this.f65839a.delete(this.f65842d);
                this.f65839a.dispose();
                this.f65840b.onSuccess(obj);
            }
        }
    }

    public SingleAmb(SingleSource<? extends T>[] singleSourceArr, Iterable<? extends SingleSource<? extends T>> iterable) {
        this.f65837a = singleSourceArr;
        this.f65838b = iterable;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        int length;
        SingleSource[] singleSourceArr = this.f65837a;
        if (singleSourceArr == null) {
            singleSourceArr = new SingleSource[8];
            try {
                length = 0;
                for (SingleSource singleSource : this.f65838b) {
                    if (singleSource == null) {
                        EmptyDisposable.error(new NullPointerException("One of the sources is null"), singleObserver);
                        return;
                    }
                    if (length == singleSourceArr.length) {
                        SingleSource[] singleSourceArr2 = new SingleSource[(length >> 2) + length];
                        System.arraycopy(singleSourceArr, 0, singleSourceArr2, 0, length);
                        singleSourceArr = singleSourceArr2;
                    }
                    int i = length + 1;
                    singleSourceArr[length] = singleSource;
                    length = i;
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                EmptyDisposable.error(th2, singleObserver);
                return;
            }
        } else {
            length = singleSourceArr.length;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        CompositeDisposable compositeDisposable = new CompositeDisposable();
        singleObserver.onSubscribe(compositeDisposable);
        for (int i2 = 0; i2 < length; i2++) {
            SingleSource singleSource2 = singleSourceArr[i2];
            if (compositeDisposable.isDisposed()) {
                return;
            }
            if (singleSource2 == null) {
                compositeDisposable.dispose();
                NullPointerException nullPointerException = new NullPointerException("One of the sources is null");
                if (atomicBoolean.compareAndSet(false, true)) {
                    singleObserver.onError(nullPointerException);
                    return;
                } else {
                    RxJavaPlugins.onError(nullPointerException);
                    return;
                }
            }
            singleSource2.subscribe(new C11110a(singleObserver, compositeDisposable, atomicBoolean));
        }
    }
}
