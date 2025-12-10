package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Function;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.AbstractC8305d;
import com.google.common.util.concurrent.AbstractFuture;
import com.google.common.util.concurrent.C8309f;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.internal.InternalFutureFailureAccess;
import com.google.common.util.concurrent.internal.InternalFutures;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

@GwtCompatible(emulated = true)
/* loaded from: classes4.dex */
public final class Futures extends AbstractC20672k70 {

    @GwtCompatible
    /* loaded from: classes4.dex */
    public static final class FutureCombiner<V> {

        /* renamed from: a */
        public final boolean f54336a;

        /* renamed from: b */
        public final ImmutableList f54337b;

        /* renamed from: com.google.common.util.concurrent.Futures$FutureCombiner$a */
        /* loaded from: classes4.dex */
        public class CallableC8247a implements Callable {

            /* renamed from: a */
            public final /* synthetic */ Runnable f54338a;

            /* renamed from: b */
            public final /* synthetic */ FutureCombiner f54339b;

            public CallableC8247a(FutureCombiner futureCombiner, Runnable runnable) {
                this.f54338a = runnable;
                this.f54339b = futureCombiner;
            }

            @Override // java.util.concurrent.Callable
            /* renamed from: a */
            public Void call() {
                this.f54338a.run();
                return null;
            }
        }

        public /* synthetic */ FutureCombiner(boolean z, ImmutableList immutableList, FutureC8248a futureC8248a) {
            this(z, immutableList);
        }

        public <C> ListenableFuture<C> call(Callable<C> callable, Executor executor) {
            return new CombinedFuture(this.f54337b, this.f54336a, executor, callable);
        }

        public <C> ListenableFuture<C> callAsync(AsyncCallable<C> asyncCallable, Executor executor) {
            return new CombinedFuture(this.f54337b, this.f54336a, executor, asyncCallable);
        }

        public ListenableFuture<?> run(Runnable runnable, Executor executor) {
            return call(new CallableC8247a(this, runnable), executor);
        }

        public FutureCombiner(boolean z, ImmutableList immutableList) {
            this.f54336a = z;
            this.f54337b = immutableList;
        }
    }

    /* renamed from: com.google.common.util.concurrent.Futures$a */
    /* loaded from: classes4.dex */
    public class FutureC8248a implements Future {

        /* renamed from: a */
        public final /* synthetic */ Future f54340a;

        /* renamed from: b */
        public final /* synthetic */ Function f54341b;

        public FutureC8248a(Future future, Function function) {
            this.f54340a = future;
            this.f54341b = function;
        }

        /* renamed from: a */
        public final Object m39519a(Object obj) {
            try {
                return this.f54341b.apply(obj);
            } catch (Throwable th2) {
                throw new ExecutionException(th2);
            }
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z) {
            return this.f54340a.cancel(z);
        }

        @Override // java.util.concurrent.Future
        public Object get() {
            return m39519a(this.f54340a.get());
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.f54340a.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.f54340a.isDone();
        }

        @Override // java.util.concurrent.Future
        public Object get(long j, TimeUnit timeUnit) {
            return m39519a(this.f54340a.get(j, timeUnit));
        }
    }

    /* renamed from: com.google.common.util.concurrent.Futures$b */
    /* loaded from: classes4.dex */
    public static final class RunnableC8249b implements Runnable {

        /* renamed from: a */
        public final Future f54342a;

        /* renamed from: b */
        public final FutureCallback f54343b;

        public RunnableC8249b(Future future, FutureCallback futureCallback) {
            this.f54342a = future;
            this.f54343b = futureCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable tryInternalFastPathGetFailure;
            Future future = this.f54342a;
            if ((future instanceof InternalFutureFailureAccess) && (tryInternalFastPathGetFailure = InternalFutures.tryInternalFastPathGetFailure((InternalFutureFailureAccess) future)) != null) {
                this.f54343b.onFailure(tryInternalFastPathGetFailure);
                return;
            }
            try {
                this.f54343b.onSuccess(Futures.getDone(this.f54342a));
            } catch (ExecutionException e) {
                this.f54343b.onFailure(e.getCause());
            } catch (Throwable th2) {
                this.f54343b.onFailure(th2);
            }
        }

        public String toString() {
            return MoreObjects.toStringHelper(this).addValue(this.f54343b).toString();
        }
    }

    /* renamed from: com.google.common.util.concurrent.Futures$c */
    /* loaded from: classes4.dex */
    public static final class C8250c extends AbstractFuture {

        /* renamed from: h */
        public C8251d f54344h;

        public /* synthetic */ C8250c(C8251d c8251d, FutureC8248a futureC8248a) {
            this(c8251d);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture
        public void afterDone() {
            this.f54344h = null;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        public boolean cancel(boolean z) {
            C8251d c8251d = this.f54344h;
            if (super.cancel(z)) {
                Objects.requireNonNull(c8251d);
                c8251d.m39512g(z);
                return true;
            }
            return false;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture
        public String pendingToString() {
            C8251d c8251d = this.f54344h;
            if (c8251d != null) {
                return "inputCount=[" + c8251d.f54348d.length + "], remaining=[" + c8251d.f54347c.get() + "]";
            }
            return null;
        }

        public C8250c(C8251d c8251d) {
            this.f54344h = c8251d;
        }
    }

    /* renamed from: com.google.common.util.concurrent.Futures$d */
    /* loaded from: classes4.dex */
    public static final class C8251d {

        /* renamed from: a */
        public boolean f54345a;

        /* renamed from: b */
        public boolean f54346b;

        /* renamed from: c */
        public final AtomicInteger f54347c;

        /* renamed from: d */
        public final ListenableFuture[] f54348d;

        /* renamed from: e */
        public volatile int f54349e;

        public /* synthetic */ C8251d(ListenableFuture[] listenableFutureArr, FutureC8248a futureC8248a) {
            this(listenableFutureArr);
        }

        /* renamed from: d */
        public static /* synthetic */ void m39515d(C8251d c8251d, ImmutableList immutableList, int i) {
            c8251d.m39513f(immutableList, i);
        }

        /* renamed from: e */
        public final void m39514e() {
            ListenableFuture[] listenableFutureArr;
            if (this.f54347c.decrementAndGet() == 0 && this.f54345a) {
                for (ListenableFuture listenableFuture : this.f54348d) {
                    if (listenableFuture != null) {
                        listenableFuture.cancel(this.f54346b);
                    }
                }
            }
        }

        /* renamed from: f */
        public final void m39513f(ImmutableList immutableList, int i) {
            ListenableFuture listenableFuture = this.f54348d[i];
            Objects.requireNonNull(listenableFuture);
            ListenableFuture listenableFuture2 = listenableFuture;
            this.f54348d[i] = null;
            for (int i2 = this.f54349e; i2 < immutableList.size(); i2++) {
                if (((AbstractFuture) immutableList.get(i2)).setFuture(listenableFuture2)) {
                    m39514e();
                    this.f54349e = i2 + 1;
                    return;
                }
            }
            this.f54349e = immutableList.size();
        }

        /* renamed from: g */
        public final void m39512g(boolean z) {
            this.f54345a = true;
            if (!z) {
                this.f54346b = false;
            }
            m39514e();
        }

        public C8251d(ListenableFuture[] listenableFutureArr) {
            this.f54345a = false;
            this.f54346b = true;
            this.f54349e = 0;
            this.f54348d = listenableFutureArr;
            this.f54347c = new AtomicInteger(listenableFutureArr.length);
        }
    }

    /* renamed from: com.google.common.util.concurrent.Futures$e */
    /* loaded from: classes4.dex */
    public static final class RunnableC8252e extends AbstractFuture.AbstractC8187i implements Runnable {

        /* renamed from: h */
        public ListenableFuture f54350h;

        public RunnableC8252e(ListenableFuture listenableFuture) {
            this.f54350h = listenableFuture;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture
        public void afterDone() {
            this.f54350h = null;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture
        public String pendingToString() {
            ListenableFuture listenableFuture = this.f54350h;
            if (listenableFuture != null) {
                return "delegate=[" + listenableFuture + "]";
            }
            return null;
        }

        @Override // java.lang.Runnable
        public void run() {
            ListenableFuture listenableFuture = this.f54350h;
            if (listenableFuture != null) {
                setFuture(listenableFuture);
            }
        }
    }

    public static <V> void addCallback(ListenableFuture<V> listenableFuture, FutureCallback<? super V> futureCallback, Executor executor) {
        Preconditions.checkNotNull(futureCallback);
        listenableFuture.addListener(new RunnableC8249b(listenableFuture, futureCallback), executor);
    }

    @SafeVarargs
    public static <V> ListenableFuture<List<V>> allAsList(ListenableFuture<? extends V>... listenableFutureArr) {
        return new AbstractC8305d.C8306a(ImmutableList.copyOf(listenableFutureArr), true);
    }

    /* renamed from: b */
    public static /* synthetic */ void m39525b(Future future) {
        future.cancel(false);
    }

    /* renamed from: c */
    public static ListenableFuture[] m39524c(Iterable iterable) {
        Collection copyOf;
        if (iterable instanceof Collection) {
            copyOf = (Collection) iterable;
        } else {
            copyOf = ImmutableList.copyOf(iterable);
        }
        return (ListenableFuture[]) copyOf.toArray(new ListenableFuture[0]);
    }

    @J2ktIncompatible
    public static <V, X extends Throwable> ListenableFuture<V> catching(ListenableFuture<? extends V> listenableFuture, Class<X> cls, Function<? super X, ? extends V> function, Executor executor) {
        return AbstractRunnableC8294a.m39385z(listenableFuture, cls, function, executor);
    }

    @J2ktIncompatible
    public static <V, X extends Throwable> ListenableFuture<V> catchingAsync(ListenableFuture<? extends V> listenableFuture, Class<X> cls, AsyncFunction<? super X, ? extends V> asyncFunction, Executor executor) {
        return AbstractRunnableC8294a.m39386A(listenableFuture, cls, asyncFunction, executor);
    }

    /* renamed from: f */
    public static void m39521f(Throwable th2) {
        if (th2 instanceof Error) {
            throw new ExecutionError((Error) th2);
        }
        throw new UncheckedExecutionException(th2);
    }

    @GwtIncompatible
    @CanIgnoreReturnValue
    @J2ktIncompatible
    public static <V, X extends Exception> V getChecked(Future<V> future, Class<X> cls) throws Exception {
        return (V) FuturesGetChecked.m39505g(future, cls);
    }

    @CanIgnoreReturnValue
    public static <V> V getDone(Future<V> future) throws ExecutionException {
        Preconditions.checkState(future.isDone(), "Future was expected to be done: %s", future);
        return (V) Uninterruptibles.getUninterruptibly(future);
    }

    @CanIgnoreReturnValue
    public static <V> V getUnchecked(Future<V> future) {
        Preconditions.checkNotNull(future);
        try {
            return (V) Uninterruptibles.getUninterruptibly(future);
        } catch (ExecutionException e) {
            m39521f(e.getCause());
            throw new AssertionError();
        }
    }

    public static <V> ListenableFuture<V> immediateCancelledFuture() {
        C8309f.C8310a c8310a = C8309f.C8310a.f54476h;
        if (c8310a != null) {
            return c8310a;
        }
        return new C8309f.C8310a();
    }

    public static <V> ListenableFuture<V> immediateFailedFuture(Throwable th2) {
        Preconditions.checkNotNull(th2);
        return new C8309f.C8311b(th2);
    }

    public static <V> ListenableFuture<V> immediateFuture(V v) {
        if (v == null) {
            return C8309f.f54473b;
        }
        return new C8309f(v);
    }

    public static ListenableFuture<Void> immediateVoidFuture() {
        return C8309f.f54473b;
    }

    public static <T> ImmutableList<ListenableFuture<T>> inCompletionOrder(Iterable<? extends ListenableFuture<? extends T>> iterable) {
        ListenableFuture[] m39524c = m39524c(iterable);
        final C8251d c8251d = new C8251d(m39524c, null);
        ImmutableList.Builder builderWithExpectedSize = ImmutableList.builderWithExpectedSize(m39524c.length);
        for (int i = 0; i < m39524c.length; i++) {
            builderWithExpectedSize.add((ImmutableList.Builder) new C8250c(c8251d, null));
        }
        final ImmutableList<ListenableFuture<T>> build = builderWithExpectedSize.build();
        for (final int i2 = 0; i2 < m39524c.length; i2++) {
            m39524c[i2].addListener(new Runnable() { // from class: r50
                @Override // java.lang.Runnable
                public final void run() {
                    Futures.C8251d.m39515d(Futures.C8251d.this, build, i2);
                }
            }, MoreExecutors.directExecutor());
        }
        return build;
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static <I, O> Future<O> lazyTransform(Future<I> future, Function<? super I, ? extends O> function) {
        Preconditions.checkNotNull(future);
        Preconditions.checkNotNull(function);
        return new FutureC8248a(future, function);
    }

    public static <V> ListenableFuture<V> nonCancellationPropagating(ListenableFuture<V> listenableFuture) {
        if (listenableFuture.isDone()) {
            return listenableFuture;
        }
        RunnableC8252e runnableC8252e = new RunnableC8252e(listenableFuture);
        listenableFuture.addListener(runnableC8252e, MoreExecutors.directExecutor());
        return runnableC8252e;
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static <O> ListenableFuture<O> scheduleAsync(AsyncCallable<O> asyncCallable, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        TrustedListenableFutureTask m39387z = TrustedListenableFutureTask.m39387z(asyncCallable);
        final ScheduledFuture<?> schedule = scheduledExecutorService.schedule(m39387z, j, timeUnit);
        m39387z.addListener(new Runnable() { // from class: t50
            @Override // java.lang.Runnable
            public final void run() {
                Futures.m39525b(schedule);
            }
        }, MoreExecutors.directExecutor());
        return m39387z;
    }

    public static <O> ListenableFuture<O> submit(Callable<O> callable, Executor executor) {
        TrustedListenableFutureTask m39388B = TrustedListenableFutureTask.m39388B(callable);
        executor.execute(m39388B);
        return m39388B;
    }

    public static <O> ListenableFuture<O> submitAsync(AsyncCallable<O> asyncCallable, Executor executor) {
        TrustedListenableFutureTask m39387z = TrustedListenableFutureTask.m39387z(asyncCallable);
        executor.execute(m39387z);
        return m39387z;
    }

    @SafeVarargs
    public static <V> ListenableFuture<List<V>> successfulAsList(ListenableFuture<? extends V>... listenableFutureArr) {
        return new AbstractC8305d.C8306a(ImmutableList.copyOf(listenableFutureArr), false);
    }

    public static <I, O> ListenableFuture<O> transform(ListenableFuture<I> listenableFuture, Function<? super I, ? extends O> function, Executor executor) {
        return AbstractRunnableC8297b.m39378z(listenableFuture, function, executor);
    }

    public static <I, O> ListenableFuture<O> transformAsync(ListenableFuture<I> listenableFuture, AsyncFunction<? super I, ? extends O> asyncFunction, Executor executor) {
        return AbstractRunnableC8297b.m39379A(listenableFuture, asyncFunction, executor);
    }

    @SafeVarargs
    public static <V> FutureCombiner<V> whenAllComplete(ListenableFuture<? extends V>... listenableFutureArr) {
        return new FutureCombiner<>(false, ImmutableList.copyOf(listenableFutureArr), null);
    }

    @SafeVarargs
    public static <V> FutureCombiner<V> whenAllSucceed(ListenableFuture<? extends V>... listenableFutureArr) {
        return new FutureCombiner<>(true, ImmutableList.copyOf(listenableFutureArr), null);
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static <V> ListenableFuture<V> withTimeout(ListenableFuture<V> listenableFuture, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        if (listenableFuture.isDone()) {
            return listenableFuture;
        }
        return TimeoutFuture.m39391C(listenableFuture, j, timeUnit, scheduledExecutorService);
    }

    @GwtIncompatible
    @CanIgnoreReturnValue
    @J2ktIncompatible
    public static <V, X extends Exception> V getChecked(Future<V> future, Class<X> cls, long j, TimeUnit timeUnit) throws Exception {
        return (V) FuturesGetChecked.m39504h(future, cls, j, timeUnit);
    }

    public static <V> ListenableFuture<List<V>> successfulAsList(Iterable<? extends ListenableFuture<? extends V>> iterable) {
        return new AbstractC8305d.C8306a(ImmutableList.copyOf(iterable), false);
    }

    public static <V> FutureCombiner<V> whenAllComplete(Iterable<? extends ListenableFuture<? extends V>> iterable) {
        return new FutureCombiner<>(false, ImmutableList.copyOf(iterable), null);
    }

    public static <V> FutureCombiner<V> whenAllSucceed(Iterable<? extends ListenableFuture<? extends V>> iterable) {
        return new FutureCombiner<>(true, ImmutableList.copyOf(iterable), null);
    }

    public static <V> ListenableFuture<List<V>> allAsList(Iterable<? extends ListenableFuture<? extends V>> iterable) {
        return new AbstractC8305d.C8306a(ImmutableList.copyOf(iterable), true);
    }

    public static ListenableFuture<Void> submit(Runnable runnable, Executor executor) {
        TrustedListenableFutureTask m39389A = TrustedListenableFutureTask.m39389A(runnable, null);
        executor.execute(m39389A);
        return m39389A;
    }
}
