package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.ConstantObservable;
import androidx.camera.core.impl.Observable;
import androidx.camera.core.impl.utils.futures.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

@RequiresApi(21)
/* loaded from: classes.dex */
public final class ConstantObservable<T> implements Observable<T> {

    /* renamed from: b */
    public static final ConstantObservable f11126b = new ConstantObservable(null);

    /* renamed from: a */
    public final ListenableFuture f11127a;

    public ConstantObservable(Object obj) {
        this.f11127a = Futures.immediateFuture(obj);
    }

    /* renamed from: a */
    public static /* synthetic */ void m62952a(ConstantObservable constantObservable, Observable.Observer observer) {
        constantObservable.m62951b(observer);
    }

    @NonNull
    public static <U> Observable<U> withValue(@Nullable U u) {
        if (u == null) {
            return f11126b;
        }
        return new ConstantObservable(u);
    }

    @Override // androidx.camera.core.impl.Observable
    public void addObserver(@NonNull Executor executor, @NonNull final Observable.Observer<? super T> observer) {
        this.f11127a.addListener(new Runnable() { // from class: cx
            {
                ConstantObservable.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ConstantObservable.m62952a(ConstantObservable.this, observer);
            }
        }, executor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public final /* synthetic */ void m62951b(Observable.Observer observer) {
        try {
            observer.onNewData(this.f11127a.get());
        } catch (InterruptedException | ExecutionException e) {
            observer.onError(e);
        }
    }

    @Override // androidx.camera.core.impl.Observable
    @NonNull
    public ListenableFuture<T> fetchData() {
        return this.f11127a;
    }

    @Override // androidx.camera.core.impl.Observable
    public void removeObserver(@NonNull Observable.Observer<? super T> observer) {
    }
}
