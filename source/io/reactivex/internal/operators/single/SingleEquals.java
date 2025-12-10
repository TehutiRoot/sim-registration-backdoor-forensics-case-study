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
    public final SingleSource f65920a;

    /* renamed from: b */
    public final SingleSource f65921b;

    /* renamed from: io.reactivex.internal.operators.single.SingleEquals$a */
    /* loaded from: classes5.dex */
    public static class C11124a implements SingleObserver {

        /* renamed from: a */
        public final int f65922a;

        /* renamed from: b */
        public final CompositeDisposable f65923b;

        /* renamed from: c */
        public final Object[] f65924c;

        /* renamed from: d */
        public final SingleObserver f65925d;

        /* renamed from: e */
        public final AtomicInteger f65926e;

        public C11124a(int i, CompositeDisposable compositeDisposable, Object[] objArr, SingleObserver singleObserver, AtomicInteger atomicInteger) {
            this.f65922a = i;
            this.f65923b = compositeDisposable;
            this.f65924c = objArr;
            this.f65925d = singleObserver;
            this.f65926e = atomicInteger;
        }

        @Override // io.reactivex.SingleObserver
        public void onError(Throwable th2) {
            int i;
            do {
                i = this.f65926e.get();
                if (i >= 2) {
                    RxJavaPlugins.onError(th2);
                    return;
                }
            } while (!this.f65926e.compareAndSet(i, 2));
            this.f65923b.dispose();
            this.f65925d.onError(th2);
        }

        @Override // io.reactivex.SingleObserver
        public void onSubscribe(Disposable disposable) {
            this.f65923b.add(disposable);
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(Object obj) {
            this.f65924c[this.f65922a] = obj;
            if (this.f65926e.incrementAndGet() == 2) {
                SingleObserver singleObserver = this.f65925d;
                Object[] objArr = this.f65924c;
                singleObserver.onSuccess(Boolean.valueOf(ObjectHelper.equals(objArr[0], objArr[1])));
            }
        }
    }

    public SingleEquals(SingleSource<? extends T> singleSource, SingleSource<? extends T> singleSource2) {
        this.f65920a = singleSource;
        this.f65921b = singleSource2;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super Boolean> singleObserver) {
        AtomicInteger atomicInteger = new AtomicInteger();
        Object[] objArr = {null, null};
        CompositeDisposable compositeDisposable = new CompositeDisposable();
        singleObserver.onSubscribe(compositeDisposable);
        this.f65920a.subscribe(new C11124a(0, compositeDisposable, objArr, singleObserver, atomicInteger));
        this.f65921b.subscribe(new C11124a(1, compositeDisposable, objArr, singleObserver, atomicInteger));
    }
}
