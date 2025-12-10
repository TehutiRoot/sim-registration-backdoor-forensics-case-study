package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes5.dex */
public final class SingleEquals<T> extends Single<Boolean> {

    /* renamed from: a */
    public final SingleSource f65983a;

    /* renamed from: b */
    public final SingleSource f65984b;

    /* renamed from: io.reactivex.internal.operators.single.SingleEquals$a */
    /* loaded from: classes5.dex */
    public static class C11111a implements SingleObserver {

        /* renamed from: a */
        public final int f65985a;

        /* renamed from: b */
        public final CompositeDisposable f65986b;

        /* renamed from: c */
        public final Object[] f65987c;

        /* renamed from: d */
        public final SingleObserver f65988d;

        /* renamed from: e */
        public final AtomicInteger f65989e;

        public C11111a(int i, CompositeDisposable compositeDisposable, Object[] objArr, SingleObserver singleObserver, AtomicInteger atomicInteger) {
            this.f65985a = i;
            this.f65986b = compositeDisposable;
            this.f65987c = objArr;
            this.f65988d = singleObserver;
            this.f65989e = atomicInteger;
        }

        @Override // io.reactivex.SingleObserver
        public void onError(Throwable th2) {
            int i;
            do {
                i = this.f65989e.get();
                if (i >= 2) {
                    RxJavaPlugins.onError(th2);
                    return;
                }
            } while (!this.f65989e.compareAndSet(i, 2));
            this.f65986b.dispose();
            this.f65988d.onError(th2);
        }

        @Override // io.reactivex.SingleObserver
        public void onSubscribe(Disposable disposable) {
            this.f65986b.add(disposable);
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(Object obj) {
            this.f65987c[this.f65985a] = obj;
            if (this.f65989e.incrementAndGet() == 2) {
                SingleObserver singleObserver = this.f65988d;
                Object[] objArr = this.f65987c;
                singleObserver.onSuccess(Boolean.valueOf(ObjectHelper.equals(objArr[0], objArr[1])));
            }
        }
    }

    public SingleEquals(SingleSource<? extends T> singleSource, SingleSource<? extends T> singleSource2) {
        this.f65983a = singleSource;
        this.f65984b = singleSource2;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super Boolean> singleObserver) {
        AtomicInteger atomicInteger = new AtomicInteger();
        Object[] objArr = {null, null};
        CompositeDisposable compositeDisposable = new CompositeDisposable();
        singleObserver.onSubscribe(compositeDisposable);
        this.f65983a.subscribe(new C11111a(0, compositeDisposable, objArr, singleObserver, atomicInteger));
        this.f65984b.subscribe(new C11111a(1, compositeDisposable, objArr, singleObserver, atomicInteger));
    }
}