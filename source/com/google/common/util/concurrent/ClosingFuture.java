package com.google.common.util.concurrent;

import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Function;
import com.google.common.base.Functions;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.util.concurrent.ClosingFuture;
import com.google.common.util.concurrent.Futures;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotMock;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.io.Closeable;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;

@DoNotMock("Use ClosingFuture.from(Futures.immediate*Future)")
@J2ktIncompatible
/* loaded from: classes4.dex */
public final class ClosingFuture<V> {

    /* renamed from: d */
    public static final C23005xi0 f54247d = new C23005xi0(ClosingFuture.class);

    /* renamed from: a */
    public final AtomicReference f54248a;

    /* renamed from: b */
    public final CloseableList f54249b;

    /* renamed from: c */
    public final FluentFuture f54250c;

    /* loaded from: classes4.dex */
    public interface AsyncClosingCallable<V> {
        ClosingFuture<V> call(DeferredCloser deferredCloser) throws Exception;
    }

    /* loaded from: classes4.dex */
    public interface AsyncClosingFunction<T, U> {
        ClosingFuture<U> apply(DeferredCloser deferredCloser, T t) throws Exception;
    }

    /* loaded from: classes4.dex */
    public interface ClosingCallable<V> {
        V call(DeferredCloser deferredCloser) throws Exception;
    }

    /* loaded from: classes4.dex */
    public interface ClosingFunction<T, U> {
        U apply(DeferredCloser deferredCloser, T t) throws Exception;
    }

    @DoNotMock("Use ClosingFuture.whenAllSucceed() or .whenAllComplete() instead.")
    /* loaded from: classes4.dex */
    public static class Combiner {

        /* renamed from: a */
        public final CloseableList f54251a;

        /* renamed from: b */
        public final boolean f54252b;
        protected final ImmutableList<ClosingFuture<?>> inputs;

        /* loaded from: classes4.dex */
        public interface AsyncCombiningCallable<V> {
            ClosingFuture<V> call(DeferredCloser deferredCloser, Peeker peeker) throws Exception;
        }

        /* loaded from: classes4.dex */
        public interface CombiningCallable<V> {
            V call(DeferredCloser deferredCloser, Peeker peeker) throws Exception;
        }

        /* renamed from: com.google.common.util.concurrent.ClosingFuture$Combiner$a */
        /* loaded from: classes4.dex */
        public class CallableC8216a implements Callable {

            /* renamed from: a */
            public final /* synthetic */ CombiningCallable f54253a;

            /* renamed from: b */
            public final /* synthetic */ Combiner f54254b;

            public CallableC8216a(Combiner combiner, CombiningCallable combiningCallable) {
                this.f54253a = combiningCallable;
                this.f54254b = combiner;
            }

            @Override // java.util.concurrent.Callable
            public Object call() {
                return new Peeker(this.f54254b.inputs, null).m39550c(this.f54253a, this.f54254b.f54251a);
            }

            public String toString() {
                return this.f54253a.toString();
            }
        }

        /* renamed from: com.google.common.util.concurrent.ClosingFuture$Combiner$b */
        /* loaded from: classes4.dex */
        public class C8217b implements AsyncCallable {

            /* renamed from: a */
            public final /* synthetic */ AsyncCombiningCallable f54255a;

            /* renamed from: b */
            public final /* synthetic */ Combiner f54256b;

            public C8217b(Combiner combiner, AsyncCombiningCallable asyncCombiningCallable) {
                this.f54255a = asyncCombiningCallable;
                this.f54256b = combiner;
            }

            @Override // com.google.common.util.concurrent.AsyncCallable
            public ListenableFuture call() {
                return new Peeker(this.f54256b.inputs, null).m39549d(this.f54255a, this.f54256b.f54251a);
            }

            public String toString() {
                return this.f54255a.toString();
            }
        }

        public /* synthetic */ Combiner(boolean z, Iterable iterable, CallableC8227b callableC8227b) {
            this(z, iterable);
        }

        /* renamed from: a */
        public static /* synthetic */ FluentFuture m39571a(ClosingFuture closingFuture) {
            return ClosingFuture.m39588b(closingFuture);
        }

        /* renamed from: c */
        public final Futures.FutureCombiner m39569c() {
            if (this.f54252b) {
                return Futures.whenAllSucceed(m39568d());
            }
            return Futures.whenAllComplete(m39568d());
        }

        public <V> ClosingFuture<V> call(CombiningCallable<V> combiningCallable, Executor executor) {
            ClosingFuture<V> closingFuture = new ClosingFuture<>(m39569c().call(new CallableC8216a(this, combiningCallable), executor), (CallableC8227b) null);
            closingFuture.f54249b.add(this.f54251a, MoreExecutors.directExecutor());
            return closingFuture;
        }

        public <V> ClosingFuture<V> callAsync(AsyncCombiningCallable<V> asyncCombiningCallable, Executor executor) {
            ClosingFuture<V> closingFuture = new ClosingFuture<>(m39569c().callAsync(new C8217b(this, asyncCombiningCallable), executor), (CallableC8227b) null);
            closingFuture.f54249b.add(this.f54251a, MoreExecutors.directExecutor());
            return closingFuture;
        }

        /* renamed from: d */
        public final ImmutableList m39568d() {
            return FluentIterable.from(this.inputs).transform(new Function() { // from class: lq
                @Override // com.google.common.base.Function
                public final Object apply(Object obj) {
                    return ClosingFuture.Combiner.m39571a((ClosingFuture) obj);
                }
            }).toList();
        }

        public Combiner(boolean z, Iterable iterable) {
            this.f54251a = new CloseableList(null);
            this.f54252b = z;
            this.inputs = ImmutableList.copyOf(iterable);
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                ((ClosingFuture) it.next()).m39581i(this.f54251a);
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class Combiner2<V1, V2> extends Combiner {

        /* renamed from: c */
        public final ClosingFuture f54257c;

        /* renamed from: d */
        public final ClosingFuture f54258d;

        /* loaded from: classes4.dex */
        public interface AsyncClosingFunction2<V1, V2, U> {
            ClosingFuture<U> apply(DeferredCloser deferredCloser, V1 v1, V2 v2) throws Exception;
        }

        /* loaded from: classes4.dex */
        public interface ClosingFunction2<V1, V2, U> {
            U apply(DeferredCloser deferredCloser, V1 v1, V2 v2) throws Exception;
        }

        /* renamed from: com.google.common.util.concurrent.ClosingFuture$Combiner2$a */
        /* loaded from: classes4.dex */
        public class C8218a implements Combiner.CombiningCallable {

            /* renamed from: a */
            public final /* synthetic */ ClosingFunction2 f54259a;

            /* renamed from: b */
            public final /* synthetic */ Combiner2 f54260b;

            public C8218a(Combiner2 combiner2, ClosingFunction2 closingFunction2) {
                this.f54259a = closingFunction2;
                this.f54260b = combiner2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.util.concurrent.ClosingFuture.Combiner.CombiningCallable
            public Object call(DeferredCloser deferredCloser, Peeker peeker) {
                return this.f54259a.apply(deferredCloser, peeker.getDone(this.f54260b.f54257c), peeker.getDone(this.f54260b.f54258d));
            }

            public String toString() {
                return this.f54259a.toString();
            }
        }

        /* renamed from: com.google.common.util.concurrent.ClosingFuture$Combiner2$b */
        /* loaded from: classes4.dex */
        public class C8219b implements Combiner.AsyncCombiningCallable {

            /* renamed from: a */
            public final /* synthetic */ AsyncClosingFunction2 f54261a;

            /* renamed from: b */
            public final /* synthetic */ Combiner2 f54262b;

            public C8219b(Combiner2 combiner2, AsyncClosingFunction2 asyncClosingFunction2) {
                this.f54261a = asyncClosingFunction2;
                this.f54262b = combiner2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.util.concurrent.ClosingFuture.Combiner.AsyncCombiningCallable
            public ClosingFuture call(DeferredCloser deferredCloser, Peeker peeker) {
                return this.f54261a.apply(deferredCloser, peeker.getDone(this.f54262b.f54257c), peeker.getDone(this.f54262b.f54258d));
            }

            public String toString() {
                return this.f54261a.toString();
            }
        }

        public /* synthetic */ Combiner2(ClosingFuture closingFuture, ClosingFuture closingFuture2, CallableC8227b callableC8227b) {
            this(closingFuture, closingFuture2);
        }

        public <U> ClosingFuture<U> call(ClosingFunction2<V1, V2, U> closingFunction2, Executor executor) {
            return (ClosingFuture<V>) call(new C8218a(this, closingFunction2), executor);
        }

        public <U> ClosingFuture<U> callAsync(AsyncClosingFunction2<V1, V2, U> asyncClosingFunction2, Executor executor) {
            return (ClosingFuture<V>) callAsync(new C8219b(this, asyncClosingFunction2), executor);
        }

        public Combiner2(ClosingFuture closingFuture, ClosingFuture closingFuture2) {
            super(true, ImmutableList.m40996of(closingFuture, closingFuture2), null);
            this.f54257c = closingFuture;
            this.f54258d = closingFuture2;
        }
    }

    /* loaded from: classes4.dex */
    public static final class Combiner3<V1, V2, V3> extends Combiner {

        /* renamed from: c */
        public final ClosingFuture f54263c;

        /* renamed from: d */
        public final ClosingFuture f54264d;

        /* renamed from: e */
        public final ClosingFuture f54265e;

        /* loaded from: classes4.dex */
        public interface AsyncClosingFunction3<V1, V2, V3, U> {
            ClosingFuture<U> apply(DeferredCloser deferredCloser, V1 v1, V2 v2, V3 v3) throws Exception;
        }

        /* loaded from: classes4.dex */
        public interface ClosingFunction3<V1, V2, V3, U> {
            U apply(DeferredCloser deferredCloser, V1 v1, V2 v2, V3 v3) throws Exception;
        }

        /* renamed from: com.google.common.util.concurrent.ClosingFuture$Combiner3$a */
        /* loaded from: classes4.dex */
        public class C8220a implements Combiner.CombiningCallable {

            /* renamed from: a */
            public final /* synthetic */ ClosingFunction3 f54266a;

            /* renamed from: b */
            public final /* synthetic */ Combiner3 f54267b;

            public C8220a(Combiner3 combiner3, ClosingFunction3 closingFunction3) {
                this.f54266a = closingFunction3;
                this.f54267b = combiner3;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.util.concurrent.ClosingFuture.Combiner.CombiningCallable
            public Object call(DeferredCloser deferredCloser, Peeker peeker) {
                return this.f54266a.apply(deferredCloser, peeker.getDone(this.f54267b.f54263c), peeker.getDone(this.f54267b.f54264d), peeker.getDone(this.f54267b.f54265e));
            }

            public String toString() {
                return this.f54266a.toString();
            }
        }

        /* renamed from: com.google.common.util.concurrent.ClosingFuture$Combiner3$b */
        /* loaded from: classes4.dex */
        public class C8221b implements Combiner.AsyncCombiningCallable {

            /* renamed from: a */
            public final /* synthetic */ AsyncClosingFunction3 f54268a;

            /* renamed from: b */
            public final /* synthetic */ Combiner3 f54269b;

            public C8221b(Combiner3 combiner3, AsyncClosingFunction3 asyncClosingFunction3) {
                this.f54268a = asyncClosingFunction3;
                this.f54269b = combiner3;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.util.concurrent.ClosingFuture.Combiner.AsyncCombiningCallable
            public ClosingFuture call(DeferredCloser deferredCloser, Peeker peeker) {
                return this.f54268a.apply(deferredCloser, peeker.getDone(this.f54269b.f54263c), peeker.getDone(this.f54269b.f54264d), peeker.getDone(this.f54269b.f54265e));
            }

            public String toString() {
                return this.f54268a.toString();
            }
        }

        public /* synthetic */ Combiner3(ClosingFuture closingFuture, ClosingFuture closingFuture2, ClosingFuture closingFuture3, CallableC8227b callableC8227b) {
            this(closingFuture, closingFuture2, closingFuture3);
        }

        public <U> ClosingFuture<U> call(ClosingFunction3<V1, V2, V3, U> closingFunction3, Executor executor) {
            return (ClosingFuture<V>) call(new C8220a(this, closingFunction3), executor);
        }

        public <U> ClosingFuture<U> callAsync(AsyncClosingFunction3<V1, V2, V3, U> asyncClosingFunction3, Executor executor) {
            return (ClosingFuture<V>) callAsync(new C8221b(this, asyncClosingFunction3), executor);
        }

        public Combiner3(ClosingFuture closingFuture, ClosingFuture closingFuture2, ClosingFuture closingFuture3) {
            super(true, ImmutableList.m40995of(closingFuture, closingFuture2, closingFuture3), null);
            this.f54263c = closingFuture;
            this.f54264d = closingFuture2;
            this.f54265e = closingFuture3;
        }
    }

    /* loaded from: classes4.dex */
    public static final class Combiner4<V1, V2, V3, V4> extends Combiner {

        /* renamed from: c */
        public final ClosingFuture f54270c;

        /* renamed from: d */
        public final ClosingFuture f54271d;

        /* renamed from: e */
        public final ClosingFuture f54272e;

        /* renamed from: f */
        public final ClosingFuture f54273f;

        /* loaded from: classes4.dex */
        public interface AsyncClosingFunction4<V1, V2, V3, V4, U> {
            ClosingFuture<U> apply(DeferredCloser deferredCloser, V1 v1, V2 v2, V3 v3, V4 v4) throws Exception;
        }

        /* loaded from: classes4.dex */
        public interface ClosingFunction4<V1, V2, V3, V4, U> {
            U apply(DeferredCloser deferredCloser, V1 v1, V2 v2, V3 v3, V4 v4) throws Exception;
        }

        /* renamed from: com.google.common.util.concurrent.ClosingFuture$Combiner4$a */
        /* loaded from: classes4.dex */
        public class C8222a implements Combiner.CombiningCallable {

            /* renamed from: a */
            public final /* synthetic */ ClosingFunction4 f54274a;

            /* renamed from: b */
            public final /* synthetic */ Combiner4 f54275b;

            public C8222a(Combiner4 combiner4, ClosingFunction4 closingFunction4) {
                this.f54274a = closingFunction4;
                this.f54275b = combiner4;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.util.concurrent.ClosingFuture.Combiner.CombiningCallable
            public Object call(DeferredCloser deferredCloser, Peeker peeker) {
                return this.f54274a.apply(deferredCloser, peeker.getDone(this.f54275b.f54270c), peeker.getDone(this.f54275b.f54271d), peeker.getDone(this.f54275b.f54272e), peeker.getDone(this.f54275b.f54273f));
            }

            public String toString() {
                return this.f54274a.toString();
            }
        }

        /* renamed from: com.google.common.util.concurrent.ClosingFuture$Combiner4$b */
        /* loaded from: classes4.dex */
        public class C8223b implements Combiner.AsyncCombiningCallable {

            /* renamed from: a */
            public final /* synthetic */ AsyncClosingFunction4 f54276a;

            /* renamed from: b */
            public final /* synthetic */ Combiner4 f54277b;

            public C8223b(Combiner4 combiner4, AsyncClosingFunction4 asyncClosingFunction4) {
                this.f54276a = asyncClosingFunction4;
                this.f54277b = combiner4;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.util.concurrent.ClosingFuture.Combiner.AsyncCombiningCallable
            public ClosingFuture call(DeferredCloser deferredCloser, Peeker peeker) {
                return this.f54276a.apply(deferredCloser, peeker.getDone(this.f54277b.f54270c), peeker.getDone(this.f54277b.f54271d), peeker.getDone(this.f54277b.f54272e), peeker.getDone(this.f54277b.f54273f));
            }

            public String toString() {
                return this.f54276a.toString();
            }
        }

        public /* synthetic */ Combiner4(ClosingFuture closingFuture, ClosingFuture closingFuture2, ClosingFuture closingFuture3, ClosingFuture closingFuture4, CallableC8227b callableC8227b) {
            this(closingFuture, closingFuture2, closingFuture3, closingFuture4);
        }

        public <U> ClosingFuture<U> call(ClosingFunction4<V1, V2, V3, V4, U> closingFunction4, Executor executor) {
            return (ClosingFuture<V>) call(new C8222a(this, closingFunction4), executor);
        }

        public <U> ClosingFuture<U> callAsync(AsyncClosingFunction4<V1, V2, V3, V4, U> asyncClosingFunction4, Executor executor) {
            return (ClosingFuture<V>) callAsync(new C8223b(this, asyncClosingFunction4), executor);
        }

        public Combiner4(ClosingFuture closingFuture, ClosingFuture closingFuture2, ClosingFuture closingFuture3, ClosingFuture closingFuture4) {
            super(true, ImmutableList.m40994of(closingFuture, closingFuture2, closingFuture3, closingFuture4), null);
            this.f54270c = closingFuture;
            this.f54271d = closingFuture2;
            this.f54272e = closingFuture3;
            this.f54273f = closingFuture4;
        }
    }

    /* loaded from: classes4.dex */
    public static final class Combiner5<V1, V2, V3, V4, V5> extends Combiner {

        /* renamed from: c */
        public final ClosingFuture f54278c;

        /* renamed from: d */
        public final ClosingFuture f54279d;

        /* renamed from: e */
        public final ClosingFuture f54280e;

        /* renamed from: f */
        public final ClosingFuture f54281f;

        /* renamed from: g */
        public final ClosingFuture f54282g;

        /* loaded from: classes4.dex */
        public interface AsyncClosingFunction5<V1, V2, V3, V4, V5, U> {
            ClosingFuture<U> apply(DeferredCloser deferredCloser, V1 v1, V2 v2, V3 v3, V4 v4, V5 v5) throws Exception;
        }

        /* loaded from: classes4.dex */
        public interface ClosingFunction5<V1, V2, V3, V4, V5, U> {
            U apply(DeferredCloser deferredCloser, V1 v1, V2 v2, V3 v3, V4 v4, V5 v5) throws Exception;
        }

        /* renamed from: com.google.common.util.concurrent.ClosingFuture$Combiner5$a */
        /* loaded from: classes4.dex */
        public class C8224a implements Combiner.CombiningCallable {

            /* renamed from: a */
            public final /* synthetic */ ClosingFunction5 f54283a;

            /* renamed from: b */
            public final /* synthetic */ Combiner5 f54284b;

            public C8224a(Combiner5 combiner5, ClosingFunction5 closingFunction5) {
                this.f54283a = closingFunction5;
                this.f54284b = combiner5;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.util.concurrent.ClosingFuture.Combiner.CombiningCallable
            public Object call(DeferredCloser deferredCloser, Peeker peeker) {
                return this.f54283a.apply(deferredCloser, peeker.getDone(this.f54284b.f54278c), peeker.getDone(this.f54284b.f54279d), peeker.getDone(this.f54284b.f54280e), peeker.getDone(this.f54284b.f54281f), peeker.getDone(this.f54284b.f54282g));
            }

            public String toString() {
                return this.f54283a.toString();
            }
        }

        /* renamed from: com.google.common.util.concurrent.ClosingFuture$Combiner5$b */
        /* loaded from: classes4.dex */
        public class C8225b implements Combiner.AsyncCombiningCallable {

            /* renamed from: a */
            public final /* synthetic */ AsyncClosingFunction5 f54285a;

            /* renamed from: b */
            public final /* synthetic */ Combiner5 f54286b;

            public C8225b(Combiner5 combiner5, AsyncClosingFunction5 asyncClosingFunction5) {
                this.f54285a = asyncClosingFunction5;
                this.f54286b = combiner5;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.util.concurrent.ClosingFuture.Combiner.AsyncCombiningCallable
            public ClosingFuture call(DeferredCloser deferredCloser, Peeker peeker) {
                return this.f54285a.apply(deferredCloser, peeker.getDone(this.f54286b.f54278c), peeker.getDone(this.f54286b.f54279d), peeker.getDone(this.f54286b.f54280e), peeker.getDone(this.f54286b.f54281f), peeker.getDone(this.f54286b.f54282g));
            }

            public String toString() {
                return this.f54285a.toString();
            }
        }

        public /* synthetic */ Combiner5(ClosingFuture closingFuture, ClosingFuture closingFuture2, ClosingFuture closingFuture3, ClosingFuture closingFuture4, ClosingFuture closingFuture5, CallableC8227b callableC8227b) {
            this(closingFuture, closingFuture2, closingFuture3, closingFuture4, closingFuture5);
        }

        public <U> ClosingFuture<U> call(ClosingFunction5<V1, V2, V3, V4, V5, U> closingFunction5, Executor executor) {
            return (ClosingFuture<V>) call(new C8224a(this, closingFunction5), executor);
        }

        public <U> ClosingFuture<U> callAsync(AsyncClosingFunction5<V1, V2, V3, V4, V5, U> asyncClosingFunction5, Executor executor) {
            return (ClosingFuture<V>) callAsync(new C8225b(this, asyncClosingFunction5), executor);
        }

        public Combiner5(ClosingFuture closingFuture, ClosingFuture closingFuture2, ClosingFuture closingFuture3, ClosingFuture closingFuture4, ClosingFuture closingFuture5) {
            super(true, ImmutableList.m40993of(closingFuture, closingFuture2, closingFuture3, closingFuture4, closingFuture5), null);
            this.f54278c = closingFuture;
            this.f54279d = closingFuture2;
            this.f54280e = closingFuture3;
            this.f54281f = closingFuture4;
            this.f54282g = closingFuture5;
        }
    }

    /* loaded from: classes4.dex */
    public static final class DeferredCloser {

        /* renamed from: a */
        public final CloseableList f54287a;

        public DeferredCloser(CloseableList closeableList) {
            this.f54287a = closeableList;
        }

        @CanIgnoreReturnValue
        public <C extends AutoCloseable> C eventuallyClose(C c, Executor executor) {
            Preconditions.checkNotNull(executor);
            if (c != null) {
                this.f54287a.add(c, executor);
            }
            return c;
        }
    }

    /* loaded from: classes4.dex */
    public static final class Peeker {

        /* renamed from: a */
        public final ImmutableList f54288a;

        /* renamed from: b */
        public volatile boolean f54289b;

        public /* synthetic */ Peeker(ImmutableList immutableList, CallableC8227b callableC8227b) {
            this(immutableList);
        }

        /* renamed from: c */
        public final Object m39550c(Combiner.CombiningCallable combiningCallable, CloseableList closeableList) {
            this.f54289b = true;
            CloseableList closeableList2 = new CloseableList(null);
            try {
                return combiningCallable.call(closeableList2.closer, this);
            } finally {
                closeableList.add(closeableList2, MoreExecutors.directExecutor());
                this.f54289b = false;
            }
        }

        /* renamed from: d */
        public final FluentFuture m39549d(Combiner.AsyncCombiningCallable asyncCombiningCallable, CloseableList closeableList) {
            this.f54289b = true;
            CloseableList closeableList2 = new CloseableList(null);
            try {
                ClosingFuture<V> call = asyncCombiningCallable.call(closeableList2.closer, this);
                call.m39581i(closeableList);
                return call.f54250c;
            } finally {
                closeableList.add(closeableList2, MoreExecutors.directExecutor());
                this.f54289b = false;
            }
        }

        public final <D> D getDone(ClosingFuture<D> closingFuture) throws ExecutionException {
            Preconditions.checkState(this.f54289b);
            Preconditions.checkArgument(this.f54288a.contains(closingFuture));
            return (D) Futures.getDone(closingFuture.f54250c);
        }

        public Peeker(ImmutableList immutableList) {
            this.f54288a = (ImmutableList) Preconditions.checkNotNull(immutableList);
        }
    }

    /* loaded from: classes4.dex */
    public enum State {
        OPEN,
        SUBSUMED,
        WILL_CLOSE,
        CLOSING,
        CLOSED,
        WILL_CREATE_VALUE_AND_CLOSER
    }

    /* loaded from: classes4.dex */
    public static final class ValueAndCloser<V> {

        /* renamed from: a */
        public final ClosingFuture f54290a;

        public ValueAndCloser(ClosingFuture closingFuture) {
            this.f54290a = (ClosingFuture) Preconditions.checkNotNull(closingFuture);
        }

        public void closeAsync() {
            this.f54290a.m39577m();
        }

        public V get() throws ExecutionException {
            return (V) Futures.getDone(this.f54290a.f54250c);
        }
    }

    /* loaded from: classes4.dex */
    public interface ValueAndCloserConsumer<V> {
        void accept(ValueAndCloser<V> valueAndCloser);
    }

    /* renamed from: com.google.common.util.concurrent.ClosingFuture$a */
    /* loaded from: classes4.dex */
    public class RunnableC8226a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ ValueAndCloserConsumer f54291a;

        /* renamed from: b */
        public final /* synthetic */ ClosingFuture f54292b;

        public RunnableC8226a(ClosingFuture closingFuture, ValueAndCloserConsumer valueAndCloserConsumer) {
            this.f54291a = valueAndCloserConsumer;
            this.f54292b = closingFuture;
        }

        @Override // java.lang.Runnable
        public void run() {
            ClosingFuture.m39572r(this.f54291a, this.f54292b);
        }
    }

    /* renamed from: com.google.common.util.concurrent.ClosingFuture$b */
    /* loaded from: classes4.dex */
    public class CallableC8227b implements Callable {

        /* renamed from: a */
        public final /* synthetic */ ClosingCallable f54293a;

        /* renamed from: b */
        public final /* synthetic */ CloseableList f54294b;

        public CallableC8227b(ClosingCallable closingCallable, CloseableList closeableList) {
            this.f54293a = closingCallable;
            this.f54294b = closeableList;
        }

        @Override // java.util.concurrent.Callable
        public Object call() {
            return this.f54293a.call(this.f54294b.closer);
        }

        public String toString() {
            return this.f54293a.toString();
        }
    }

    /* renamed from: com.google.common.util.concurrent.ClosingFuture$c */
    /* loaded from: classes4.dex */
    public class C8228c implements AsyncCallable {

        /* renamed from: a */
        public final /* synthetic */ AsyncClosingCallable f54295a;

        /* renamed from: b */
        public final /* synthetic */ CloseableList f54296b;

        public C8228c(AsyncClosingCallable asyncClosingCallable, CloseableList closeableList) {
            this.f54295a = asyncClosingCallable;
            this.f54296b = closeableList;
        }

        @Override // com.google.common.util.concurrent.AsyncCallable
        public ListenableFuture call() {
            CloseableList closeableList = new CloseableList(null);
            try {
                ClosingFuture<V> call = this.f54295a.call(closeableList.closer);
                call.m39581i(this.f54296b);
                return call.f54250c;
            } finally {
                this.f54296b.add(closeableList, MoreExecutors.directExecutor());
            }
        }

        public String toString() {
            return this.f54295a.toString();
        }
    }

    /* renamed from: com.google.common.util.concurrent.ClosingFuture$d */
    /* loaded from: classes4.dex */
    public class C8229d implements FutureCallback {

        /* renamed from: b */
        public final /* synthetic */ Executor f54298b;

        public C8229d(Executor executor) {
            ClosingFuture.this = r1;
            this.f54298b = executor;
        }

        @Override // com.google.common.util.concurrent.FutureCallback
        /* renamed from: a */
        public void onSuccess(AutoCloseable autoCloseable) {
            ClosingFuture.this.f54249b.closer.eventuallyClose(autoCloseable, this.f54298b);
        }

        @Override // com.google.common.util.concurrent.FutureCallback
        public void onFailure(Throwable th2) {
        }
    }

    /* renamed from: com.google.common.util.concurrent.ClosingFuture$e */
    /* loaded from: classes4.dex */
    public class C8230e implements AsyncFunction {

        /* renamed from: a */
        public final /* synthetic */ ClosingFunction f54299a;

        /* renamed from: b */
        public final /* synthetic */ ClosingFuture f54300b;

        public C8230e(ClosingFuture closingFuture, ClosingFunction closingFunction) {
            this.f54299a = closingFunction;
            this.f54300b = closingFuture;
        }

        @Override // com.google.common.util.concurrent.AsyncFunction
        public ListenableFuture apply(Object obj) {
            return this.f54300b.f54249b.applyClosingFunction(this.f54299a, obj);
        }

        public String toString() {
            return this.f54299a.toString();
        }
    }

    /* renamed from: com.google.common.util.concurrent.ClosingFuture$f */
    /* loaded from: classes4.dex */
    public class C8231f implements AsyncFunction {

        /* renamed from: a */
        public final /* synthetic */ AsyncClosingFunction f54301a;

        /* renamed from: b */
        public final /* synthetic */ ClosingFuture f54302b;

        public C8231f(ClosingFuture closingFuture, AsyncClosingFunction asyncClosingFunction) {
            this.f54301a = asyncClosingFunction;
            this.f54302b = closingFuture;
        }

        @Override // com.google.common.util.concurrent.AsyncFunction
        public ListenableFuture apply(Object obj) {
            return this.f54302b.f54249b.applyAsyncClosingFunction(this.f54301a, obj);
        }

        public String toString() {
            return this.f54301a.toString();
        }
    }

    /* renamed from: com.google.common.util.concurrent.ClosingFuture$g */
    /* loaded from: classes4.dex */
    public class C8232g implements AsyncClosingFunction {

        /* renamed from: a */
        public final /* synthetic */ AsyncFunction f54303a;

        public C8232g(AsyncFunction asyncFunction) {
            this.f54303a = asyncFunction;
        }

        @Override // com.google.common.util.concurrent.ClosingFuture.AsyncClosingFunction
        public ClosingFuture apply(DeferredCloser deferredCloser, Object obj) {
            return ClosingFuture.from(this.f54303a.apply(obj));
        }
    }

    /* renamed from: com.google.common.util.concurrent.ClosingFuture$h */
    /* loaded from: classes4.dex */
    public class C8233h implements AsyncFunction {

        /* renamed from: a */
        public final /* synthetic */ ClosingFunction f54304a;

        /* renamed from: b */
        public final /* synthetic */ ClosingFuture f54305b;

        public C8233h(ClosingFuture closingFuture, ClosingFunction closingFunction) {
            this.f54304a = closingFunction;
            this.f54305b = closingFuture;
        }

        @Override // com.google.common.util.concurrent.AsyncFunction
        /* renamed from: a */
        public ListenableFuture apply(Throwable th2) {
            return this.f54305b.f54249b.applyClosingFunction(this.f54304a, th2);
        }

        public String toString() {
            return this.f54304a.toString();
        }
    }

    /* renamed from: com.google.common.util.concurrent.ClosingFuture$i */
    /* loaded from: classes4.dex */
    public class C8234i implements AsyncFunction {

        /* renamed from: a */
        public final /* synthetic */ AsyncClosingFunction f54306a;

        /* renamed from: b */
        public final /* synthetic */ ClosingFuture f54307b;

        public C8234i(ClosingFuture closingFuture, AsyncClosingFunction asyncClosingFunction) {
            this.f54306a = asyncClosingFunction;
            this.f54307b = closingFuture;
        }

        @Override // com.google.common.util.concurrent.AsyncFunction
        /* renamed from: a */
        public ListenableFuture apply(Throwable th2) {
            return this.f54307b.f54249b.applyAsyncClosingFunction(this.f54306a, th2);
        }

        public String toString() {
            return this.f54306a.toString();
        }
    }

    /* renamed from: com.google.common.util.concurrent.ClosingFuture$j */
    /* loaded from: classes4.dex */
    public class RunnableC8235j implements Runnable {
        public RunnableC8235j() {
            ClosingFuture.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            ClosingFuture closingFuture = ClosingFuture.this;
            State state = State.WILL_CLOSE;
            State state2 = State.CLOSING;
            closingFuture.m39578l(state, state2);
            ClosingFuture.this.m39577m();
            ClosingFuture.this.m39578l(state2, State.CLOSED);
        }
    }

    public /* synthetic */ ClosingFuture(ListenableFuture listenableFuture, CallableC8227b callableC8227b) {
        this(listenableFuture);
    }

    /* renamed from: a */
    public static /* synthetic */ void m39589a(AutoCloseable autoCloseable) {
        m39573q(autoCloseable);
    }

    /* renamed from: b */
    public static /* synthetic */ FluentFuture m39588b(ClosingFuture closingFuture) {
        return closingFuture.f54250c;
    }

    @Deprecated
    public static <C extends AutoCloseable> ClosingFuture<C> eventuallyClosing(ListenableFuture<C> listenableFuture, Executor executor) {
        Preconditions.checkNotNull(executor);
        ClosingFuture<C> closingFuture = new ClosingFuture<>(Futures.nonCancellationPropagating(listenableFuture));
        Futures.addCallback(listenableFuture, new C8229d(executor), MoreExecutors.directExecutor());
        return closingFuture;
    }

    public static <V> ClosingFuture<V> from(ListenableFuture<V> listenableFuture) {
        return new ClosingFuture<>(listenableFuture);
    }

    /* renamed from: n */
    public static void m39576n(final AutoCloseable autoCloseable, Executor executor) {
        if (autoCloseable == null) {
            return;
        }
        try {
            executor.execute(new Runnable() { // from class: kq
                @Override // java.lang.Runnable
                public final void run() {
                    ClosingFuture.m39589a(autoCloseable);
                }
            });
        } catch (RejectedExecutionException e) {
            C23005xi0 c23005xi0 = f54247d;
            Logger m405a = c23005xi0.m405a();
            Level level = Level.WARNING;
            if (m405a.isLoggable(level)) {
                c23005xi0.m405a().log(level, String.format("while submitting close to %s; will close inline", executor), (Throwable) e);
            }
            m39576n(autoCloseable, MoreExecutors.directExecutor());
        }
    }

    /* renamed from: q */
    public static /* synthetic */ void m39573q(AutoCloseable autoCloseable) {
        try {
            autoCloseable.close();
        } catch (Exception e) {
            AbstractC17420Ck1.m68741b(e);
            f54247d.m405a().log(Level.WARNING, "thrown by close()", (Throwable) e);
        }
    }

    /* renamed from: r */
    public static void m39572r(ValueAndCloserConsumer valueAndCloserConsumer, ClosingFuture closingFuture) {
        valueAndCloserConsumer.accept(new ValueAndCloser<>(closingFuture));
    }

    public static <V> ClosingFuture<V> submit(ClosingCallable<V> closingCallable, Executor executor) {
        Preconditions.checkNotNull(closingCallable);
        CloseableList closeableList = new CloseableList(null);
        TrustedListenableFutureTask m39388B = TrustedListenableFutureTask.m39388B(new CallableC8227b(closingCallable, closeableList));
        executor.execute(m39388B);
        return new ClosingFuture<>(m39388B, closeableList);
    }

    public static <V> ClosingFuture<V> submitAsync(AsyncClosingCallable<V> asyncClosingCallable, Executor executor) {
        Preconditions.checkNotNull(asyncClosingCallable);
        CloseableList closeableList = new CloseableList(null);
        TrustedListenableFutureTask m39387z = TrustedListenableFutureTask.m39387z(new C8228c(asyncClosingCallable, closeableList));
        executor.execute(m39387z);
        return new ClosingFuture<>(m39387z, closeableList);
    }

    public static Combiner whenAllComplete(Iterable<? extends ClosingFuture<?>> iterable) {
        return new Combiner(false, iterable, null);
    }

    public static Combiner whenAllSucceed(Iterable<? extends ClosingFuture<?>> iterable) {
        return new Combiner(true, iterable, null);
    }

    public static <V, U> AsyncClosingFunction<V, U> withoutCloser(AsyncFunction<V, U> asyncFunction) {
        Preconditions.checkNotNull(asyncFunction);
        return new C8232g(asyncFunction);
    }

    @CanIgnoreReturnValue
    public boolean cancel(boolean z) {
        f54247d.m405a().log(Level.FINER, "cancelling {0}", this);
        boolean cancel = this.f54250c.cancel(z);
        if (cancel) {
            m39577m();
        }
        return cancel;
    }

    public <X extends Throwable> ClosingFuture<V> catching(Class<X> cls, ClosingFunction<? super X, ? extends V> closingFunction, Executor executor) {
        return m39579k(cls, closingFunction, executor);
    }

    public <X extends Throwable> ClosingFuture<V> catchingAsync(Class<X> cls, AsyncClosingFunction<? super X, ? extends V> asyncClosingFunction, Executor executor) {
        return m39580j(cls, asyncClosingFunction, executor);
    }

    public void finalize() {
        if (((State) this.f54248a.get()).equals(State.OPEN)) {
            f54247d.m405a().log(Level.SEVERE, "Uh oh! An open ClosingFuture has leaked and will close: {0}", this);
            finishToFuture();
        }
    }

    public FluentFuture<V> finishToFuture() {
        if (m39575o(State.OPEN, State.WILL_CLOSE)) {
            f54247d.m405a().log(Level.FINER, "will close {0}", this);
            this.f54250c.addListener(new RunnableC8235j(), MoreExecutors.directExecutor());
        } else {
            int ordinal = ((State) this.f54248a.get()).ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2 && ordinal != 3 && ordinal != 4) {
                        if (ordinal == 5) {
                            throw new IllegalStateException("Cannot call finishToFuture() after calling finishToValueAndCloser()");
                        }
                    } else {
                        throw new IllegalStateException("Cannot call finishToFuture() twice");
                    }
                } else {
                    throw new IllegalStateException("Cannot call finishToFuture() after deriving another step");
                }
            } else {
                throw new AssertionError();
            }
        }
        return this.f54250c;
    }

    public void finishToValueAndCloser(ValueAndCloserConsumer<? super V> valueAndCloserConsumer, Executor executor) {
        Preconditions.checkNotNull(valueAndCloserConsumer);
        if (!m39575o(State.OPEN, State.WILL_CREATE_VALUE_AND_CLOSER)) {
            int ordinal = ((State) this.f54248a.get()).ordinal();
            if (ordinal != 1) {
                if (ordinal != 2 && ordinal != 3 && ordinal != 4) {
                    if (ordinal != 5) {
                        throw new AssertionError(this.f54248a);
                    }
                    throw new IllegalStateException("Cannot call finishToValueAndCloser() twice");
                }
                throw new IllegalStateException("Cannot call finishToValueAndCloser() after calling finishToFuture()");
            }
            throw new IllegalStateException("Cannot call finishToValueAndCloser() after deriving another step");
        }
        this.f54250c.addListener(new RunnableC8226a(this, valueAndCloserConsumer), executor);
    }

    /* renamed from: i */
    public final void m39581i(CloseableList closeableList) {
        m39578l(State.OPEN, State.SUBSUMED);
        closeableList.add(this.f54249b, MoreExecutors.directExecutor());
    }

    /* renamed from: j */
    public final ClosingFuture m39580j(Class cls, AsyncClosingFunction asyncClosingFunction, Executor executor) {
        Preconditions.checkNotNull(asyncClosingFunction);
        return m39574p(this.f54250c.catchingAsync(cls, new C8234i(this, asyncClosingFunction), executor));
    }

    /* renamed from: k */
    public final ClosingFuture m39579k(Class cls, ClosingFunction closingFunction, Executor executor) {
        Preconditions.checkNotNull(closingFunction);
        return m39574p(this.f54250c.catchingAsync(cls, new C8233h(this, closingFunction), executor));
    }

    /* renamed from: l */
    public final void m39578l(State state, State state2) {
        Preconditions.checkState(m39575o(state, state2), "Expected state to be %s, but it was %s", state, state2);
    }

    /* renamed from: m */
    public final void m39577m() {
        f54247d.m405a().log(Level.FINER, "closing {0}", this);
        this.f54249b.close();
    }

    /* renamed from: o */
    public final boolean m39575o(State state, State state2) {
        return AbstractC17300An1.m69050a(this.f54248a, state, state2);
    }

    /* renamed from: p */
    public final ClosingFuture m39574p(FluentFuture fluentFuture) {
        ClosingFuture closingFuture = new ClosingFuture(fluentFuture);
        m39581i(closingFuture.f54249b);
        return closingFuture;
    }

    public ListenableFuture<?> statusFuture() {
        return Futures.nonCancellationPropagating(this.f54250c.transform(Functions.constant(null), MoreExecutors.directExecutor()));
    }

    public String toString() {
        return MoreObjects.toStringHelper(this).add(RemoteConfigConstants.ResponseFieldKey.STATE, this.f54248a.get()).addValue(this.f54250c).toString();
    }

    public <U> ClosingFuture<U> transform(ClosingFunction<? super V, U> closingFunction, Executor executor) {
        Preconditions.checkNotNull(closingFunction);
        return m39574p(this.f54250c.transformAsync(new C8230e(this, closingFunction), executor));
    }

    public <U> ClosingFuture<U> transformAsync(AsyncClosingFunction<? super V, U> asyncClosingFunction, Executor executor) {
        Preconditions.checkNotNull(asyncClosingFunction);
        return m39574p(this.f54250c.transformAsync(new C8231f(this, asyncClosingFunction), executor));
    }

    /* loaded from: classes4.dex */
    public static final class CloseableList extends IdentityHashMap<AutoCloseable, Executor> implements Closeable {
        private volatile boolean closed;
        private final DeferredCloser closer;
        @CheckForNull
        private volatile CountDownLatch whenClosed;

        private CloseableList() {
            this.closer = new DeferredCloser(this);
        }

        public void add(@CheckForNull AutoCloseable autoCloseable, Executor executor) {
            Preconditions.checkNotNull(executor);
            if (autoCloseable == null) {
                return;
            }
            synchronized (this) {
                try {
                    if (this.closed) {
                        ClosingFuture.m39576n(autoCloseable, executor);
                    } else {
                        put(autoCloseable, executor);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public <V, U> FluentFuture<U> applyAsyncClosingFunction(AsyncClosingFunction<V, U> asyncClosingFunction, V v) throws Exception {
            CloseableList closeableList = new CloseableList();
            try {
                ClosingFuture<U> apply = asyncClosingFunction.apply(closeableList.closer, v);
                apply.m39581i(closeableList);
                return apply.f54250c;
            } finally {
                add(closeableList, MoreExecutors.directExecutor());
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public <V, U> ListenableFuture<U> applyClosingFunction(ClosingFunction<? super V, U> closingFunction, V v) throws Exception {
            CloseableList closeableList = new CloseableList();
            try {
                return Futures.immediateFuture(closingFunction.apply(closeableList.closer, v));
            } finally {
                add(closeableList, MoreExecutors.directExecutor());
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.closed) {
                return;
            }
            synchronized (this) {
                try {
                    if (this.closed) {
                        return;
                    }
                    this.closed = true;
                    for (Map.Entry<AutoCloseable, Executor> entry : entrySet()) {
                        ClosingFuture.m39576n(entry.getKey(), entry.getValue());
                    }
                    clear();
                    if (this.whenClosed != null) {
                        this.whenClosed.countDown();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public CountDownLatch whenClosedCountDown() {
            boolean z = false;
            if (this.closed) {
                return new CountDownLatch(0);
            }
            synchronized (this) {
                try {
                    if (this.closed) {
                        return new CountDownLatch(0);
                    }
                    if (this.whenClosed == null) {
                        z = true;
                    }
                    Preconditions.checkState(z);
                    CountDownLatch countDownLatch = new CountDownLatch(1);
                    this.whenClosed = countDownLatch;
                    return countDownLatch;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public /* synthetic */ CloseableList(CallableC8227b callableC8227b) {
            this();
        }
    }

    public ClosingFuture(ListenableFuture listenableFuture) {
        this(listenableFuture, new CloseableList(null));
    }

    public static Combiner whenAllComplete(ClosingFuture<?> closingFuture, ClosingFuture<?>... closingFutureArr) {
        return whenAllComplete(Lists.asList(closingFuture, closingFutureArr));
    }

    public static <V1, V2> Combiner2<V1, V2> whenAllSucceed(ClosingFuture<V1> closingFuture, ClosingFuture<V2> closingFuture2) {
        return new Combiner2<>(closingFuture, closingFuture2, null);
    }

    public ClosingFuture(ListenableFuture listenableFuture, CloseableList closeableList) {
        this.f54248a = new AtomicReference(State.OPEN);
        this.f54250c = FluentFuture.from(listenableFuture);
        this.f54249b = closeableList;
    }

    public static <V1, V2, V3> Combiner3<V1, V2, V3> whenAllSucceed(ClosingFuture<V1> closingFuture, ClosingFuture<V2> closingFuture2, ClosingFuture<V3> closingFuture3) {
        return new Combiner3<>(closingFuture, closingFuture2, closingFuture3, null);
    }

    public static <V1, V2, V3, V4> Combiner4<V1, V2, V3, V4> whenAllSucceed(ClosingFuture<V1> closingFuture, ClosingFuture<V2> closingFuture2, ClosingFuture<V3> closingFuture3, ClosingFuture<V4> closingFuture4) {
        return new Combiner4<>(closingFuture, closingFuture2, closingFuture3, closingFuture4, null);
    }

    public static <V1, V2, V3, V4, V5> Combiner5<V1, V2, V3, V4, V5> whenAllSucceed(ClosingFuture<V1> closingFuture, ClosingFuture<V2> closingFuture2, ClosingFuture<V3> closingFuture3, ClosingFuture<V4> closingFuture4, ClosingFuture<V5> closingFuture5) {
        return new Combiner5<>(closingFuture, closingFuture2, closingFuture3, closingFuture4, closingFuture5, null);
    }

    public static Combiner whenAllSucceed(ClosingFuture<?> closingFuture, ClosingFuture<?> closingFuture2, ClosingFuture<?> closingFuture3, ClosingFuture<?> closingFuture4, ClosingFuture<?> closingFuture5, ClosingFuture<?> closingFuture6, ClosingFuture<?>... closingFutureArr) {
        return whenAllSucceed(FluentIterable.m41025of(closingFuture, closingFuture2, closingFuture3, closingFuture4, closingFuture5, closingFuture6).append(closingFutureArr));
    }
}
