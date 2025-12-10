package androidx.camera.core.impl.utils.futures;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.arch.core.util.Function;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.AbstractC2550a;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;

@RequiresApi(21)
/* loaded from: classes.dex */
public final class Futures {

    /* renamed from: a */
    public static final Function f11332a = new C2546b();

    /* renamed from: androidx.camera.core.impl.utils.futures.Futures$a */
    /* loaded from: classes.dex */
    public class C2545a implements AsyncFunction {

        /* renamed from: a */
        public final /* synthetic */ Function f11333a;

        public C2545a(Function function) {
            this.f11333a = function;
        }

        @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
        public ListenableFuture apply(Object obj) {
            return Futures.immediateFuture(this.f11333a.apply(obj));
        }
    }

    /* renamed from: androidx.camera.core.impl.utils.futures.Futures$b */
    /* loaded from: classes.dex */
    public class C2546b implements Function {
        @Override // androidx.arch.core.util.Function
        public Object apply(Object obj) {
            return obj;
        }
    }

    /* renamed from: androidx.camera.core.impl.utils.futures.Futures$c */
    /* loaded from: classes.dex */
    public class C2547c implements FutureCallback {

        /* renamed from: a */
        public final /* synthetic */ CallbackToFutureAdapter.Completer f11334a;

        /* renamed from: b */
        public final /* synthetic */ Function f11335b;

        public C2547c(CallbackToFutureAdapter.Completer completer, Function function) {
            this.f11334a = completer;
            this.f11335b = function;
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public void onFailure(Throwable th2) {
            this.f11334a.setException(th2);
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public void onSuccess(Object obj) {
            try {
                this.f11334a.set(this.f11335b.apply(obj));
            } catch (Throwable th2) {
                this.f11334a.setException(th2);
            }
        }
    }

    /* renamed from: androidx.camera.core.impl.utils.futures.Futures$d */
    /* loaded from: classes.dex */
    public class RunnableC2548d implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ ListenableFuture f11336a;

        public RunnableC2548d(ListenableFuture listenableFuture) {
            this.f11336a = listenableFuture;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f11336a.cancel(true);
        }
    }

    /* renamed from: androidx.camera.core.impl.utils.futures.Futures$e */
    /* loaded from: classes.dex */
    public static final class RunnableC2549e implements Runnable {

        /* renamed from: a */
        public final Future f11337a;

        /* renamed from: b */
        public final FutureCallback f11338b;

        public RunnableC2549e(Future future, FutureCallback futureCallback) {
            this.f11337a = future;
            this.f11338b = futureCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f11338b.onSuccess(Futures.getDone(this.f11337a));
            } catch (Error e) {
                e = e;
                this.f11338b.onFailure(e);
            } catch (RuntimeException e2) {
                e = e2;
                this.f11338b.onFailure(e);
            } catch (ExecutionException e3) {
                Throwable cause = e3.getCause();
                if (cause == null) {
                    this.f11338b.onFailure(e3);
                } else {
                    this.f11338b.onFailure(cause);
                }
            }
        }

        public String toString() {
            return RunnableC2549e.class.getSimpleName() + "," + this.f11338b;
        }
    }

    public static <V> void addCallback(@NonNull ListenableFuture<V> listenableFuture, @NonNull FutureCallback<? super V> futureCallback, @NonNull Executor executor) {
        Preconditions.checkNotNull(futureCallback);
        listenableFuture.addListener(new RunnableC2549e(listenableFuture, futureCallback), executor);
    }

    @NonNull
    public static <V> ListenableFuture<List<V>> allAsList(@NonNull Collection<? extends ListenableFuture<? extends V>> collection) {
        return new C20084gj0(new ArrayList(collection), true, CameraXExecutors.directExecutor());
    }

    /* renamed from: b */
    public static /* synthetic */ Object m62836b(ListenableFuture listenableFuture, CallbackToFutureAdapter.Completer completer) {
        m62835c(false, listenableFuture, f11332a, completer, CameraXExecutors.directExecutor());
        return "nonCancellationPropagating[" + listenableFuture + "]";
    }

    /* renamed from: c */
    public static void m62835c(boolean z, ListenableFuture listenableFuture, Function function, CallbackToFutureAdapter.Completer completer, Executor executor) {
        Preconditions.checkNotNull(listenableFuture);
        Preconditions.checkNotNull(function);
        Preconditions.checkNotNull(completer);
        Preconditions.checkNotNull(executor);
        addCallback(listenableFuture, new C2547c(completer, function), executor);
        if (z) {
            completer.addCancellationListener(new RunnableC2548d(listenableFuture), CameraXExecutors.directExecutor());
        }
    }

    @Nullable
    public static <V> V getDone(@NonNull Future<V> future) throws ExecutionException {
        boolean isDone = future.isDone();
        Preconditions.checkState(isDone, "Future was expected to be done, " + future);
        return (V) getUninterruptibly(future);
    }

    @Nullable
    public static <V> V getUninterruptibly(@NonNull Future<V> future) throws ExecutionException {
        V v;
        boolean z = false;
        while (true) {
            try {
                v = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th2) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return v;
    }

    @NonNull
    public static <V> ListenableFuture<V> immediateFailedFuture(@NonNull Throwable th2) {
        return new AbstractC2550a.C2551a(th2);
    }

    @NonNull
    public static <V> ScheduledFuture<V> immediateFailedScheduledFuture(@NonNull Throwable th2) {
        return new AbstractC2550a.ScheduledFutureC2552b(th2);
    }

    @NonNull
    public static <V> ListenableFuture<V> immediateFuture(@Nullable V v) {
        if (v == null) {
            return AbstractC2550a.m62834a();
        }
        return new AbstractC2550a.C2553c(v);
    }

    @NonNull
    public static <V> ListenableFuture<V> nonCancellationPropagating(@NonNull final ListenableFuture<V> listenableFuture) {
        Preconditions.checkNotNull(listenableFuture);
        if (listenableFuture.isDone()) {
            return listenableFuture;
        }
        return CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: s50
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                Object m62836b;
                m62836b = Futures.m62836b(listenableFuture, completer);
                return m62836b;
            }
        });
    }

    public static <V> void propagate(@NonNull ListenableFuture<V> listenableFuture, @NonNull CallbackToFutureAdapter.Completer<V> completer) {
        propagateTransform(listenableFuture, f11332a, completer, CameraXExecutors.directExecutor());
    }

    public static <I, O> void propagateTransform(@NonNull ListenableFuture<I> listenableFuture, @NonNull Function<? super I, ? extends O> function, @NonNull CallbackToFutureAdapter.Completer<O> completer, @NonNull Executor executor) {
        m62835c(true, listenableFuture, function, completer, executor);
    }

    @NonNull
    public static <V> ListenableFuture<List<V>> successfulAsList(@NonNull Collection<? extends ListenableFuture<? extends V>> collection) {
        return new C20084gj0(new ArrayList(collection), false, CameraXExecutors.directExecutor());
    }

    @NonNull
    public static <I, O> ListenableFuture<O> transform(@NonNull ListenableFuture<I> listenableFuture, @NonNull Function<? super I, ? extends O> function, @NonNull Executor executor) {
        Preconditions.checkNotNull(function);
        return transformAsync(listenableFuture, new C2545a(function), executor);
    }

    @NonNull
    public static <I, O> ListenableFuture<O> transformAsync(@NonNull ListenableFuture<I> listenableFuture, @NonNull AsyncFunction<? super I, ? extends O> asyncFunction, @NonNull Executor executor) {
        RunnableC17075xm runnableC17075xm = new RunnableC17075xm(asyncFunction, listenableFuture);
        listenableFuture.addListener(runnableC17075xm, executor);
        return runnableC17075xm;
    }
}
