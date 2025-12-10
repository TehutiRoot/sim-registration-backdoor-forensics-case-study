package androidx.camera.core.impl.utils.futures;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.arch.core.util.Function;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@RequiresApi(21)
/* loaded from: classes.dex */
public class FutureChain<V> implements ListenableFuture<V> {

    /* renamed from: a */
    public final ListenableFuture f11329a;

    /* renamed from: b */
    public CallbackToFutureAdapter.Completer f11330b;

    /* renamed from: androidx.camera.core.impl.utils.futures.FutureChain$a */
    /* loaded from: classes.dex */
    public class C2544a implements CallbackToFutureAdapter.Resolver {
        public C2544a() {
        }

        @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
        public Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
            boolean z;
            if (FutureChain.this.f11330b == null) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkState(z, "The result can only set once!");
            FutureChain.this.f11330b = completer;
            return "FutureChain[" + FutureChain.this + "]";
        }
    }

    public FutureChain(ListenableFuture listenableFuture) {
        this.f11329a = (ListenableFuture) Preconditions.checkNotNull(listenableFuture);
    }

    @NonNull
    public static <V> FutureChain<V> from(@NonNull ListenableFuture<V> listenableFuture) {
        if (listenableFuture instanceof FutureChain) {
            return (FutureChain) listenableFuture;
        }
        return new FutureChain<>(listenableFuture);
    }

    /* renamed from: a */
    public boolean m62839a(Object obj) {
        CallbackToFutureAdapter.Completer completer = this.f11330b;
        if (completer != null) {
            return completer.set(obj);
        }
        return false;
    }

    public final void addCallback(@NonNull FutureCallback<? super V> futureCallback, @NonNull Executor executor) {
        Futures.addCallback(this, futureCallback, executor);
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public void addListener(@NonNull Runnable runnable, @NonNull Executor executor) {
        this.f11329a.addListener(runnable, executor);
    }

    /* renamed from: b */
    public boolean m62838b(Throwable th2) {
        CallbackToFutureAdapter.Completer completer = this.f11330b;
        if (completer != null) {
            return completer.setException(th2);
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return this.f11329a.cancel(z);
    }

    @Override // java.util.concurrent.Future
    @Nullable
    public V get() throws InterruptedException, ExecutionException {
        return this.f11329a.get();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f11329a.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f11329a.isDone();
    }

    @NonNull
    public final <T> FutureChain<T> transform(@NonNull Function<? super V, T> function, @NonNull Executor executor) {
        return (FutureChain) Futures.transform(this, function, executor);
    }

    @NonNull
    public final <T> FutureChain<T> transformAsync(@NonNull AsyncFunction<? super V, T> asyncFunction, @NonNull Executor executor) {
        return (FutureChain) Futures.transformAsync(this, asyncFunction, executor);
    }

    @Override // java.util.concurrent.Future
    @Nullable
    public V get(long j, @NonNull TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.f11329a.get(j, timeUnit);
    }

    public FutureChain() {
        this.f11329a = CallbackToFutureAdapter.getFuture(new C2544a());
    }
}
