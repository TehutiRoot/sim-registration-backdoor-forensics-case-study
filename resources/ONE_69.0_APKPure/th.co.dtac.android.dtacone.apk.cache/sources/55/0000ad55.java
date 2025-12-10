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
import com.google.common.util.concurrent.FluentFuture;
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
    public static final C17503Di0 f54259d = new C17503Di0(ClosingFuture.class);

    /* renamed from: a */
    public final AtomicReference f54260a;

    /* renamed from: b */
    public final CloseableList f54261b;

    /* renamed from: c */
    public final FluentFuture f54262c;

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
        public final CloseableList f54263a;

        /* renamed from: b */
        public final boolean f54264b;
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
        public class CallableC8205a implements Callable {

            /* renamed from: a */
            public final /* synthetic */ CombiningCallable f54265a;

            /* renamed from: b */
            public final /* synthetic */ Combiner f54266b;

            public CallableC8205a(Combiner combiner, CombiningCallable combiningCallable) {
                this.f54265a = combiningCallable;
                this.f54266b = combiner;
            }

            @Override // java.util.concurrent.Callable
            public Object call() {
                return new Peeker(this.f54266b.inputs, null).m39542c(this.f54265a, this.f54266b.f54263a);
            }

            public String toString() {
                return this.f54265a.toString();
            }
        }

        /* renamed from: com.google.common.util.concurrent.ClosingFuture$Combiner$b */
        /* loaded from: classes4.dex */
        public class C8206b implements AsyncCallable {

            /* renamed from: a */
            public final /* synthetic */ AsyncCombiningCallable f54267a;

            /* renamed from: b */
            public final /* synthetic */ Combiner f54268b;

            public C8206b(Combiner combiner, AsyncCombiningCallable asyncCombiningCallable) {
                this.f54267a = asyncCombiningCallable;
                this.f54268b = combiner;
            }

            @Override // com.google.common.util.concurrent.AsyncCallable
            public ListenableFuture call() {
                return new Peeker(this.f54268b.inputs, null).m39541d(this.f54267a, this.f54268b.f54263a);
            }

            public String toString() {
                return this.f54267a.toString();
            }
        }

        public /* synthetic */ Combiner(boolean z, Iterable iterable, CallableC8216b callableC8216b) {
            this(z, iterable);
        }

        /* renamed from: c */
        public final Futures.FutureCombiner m39561c() {
            if (this.f54264b) {
                return Futures.whenAllSucceed(m39560d());
            }
            return Futures.whenAllComplete(m39560d());
        }

        public <V> ClosingFuture<V> call(CombiningCallable<V> combiningCallable, Executor executor) {
            ClosingFuture<V> closingFuture = new ClosingFuture<>(m39561c().call(new CallableC8205a(this, combiningCallable), executor), (CallableC8216b) null);
            closingFuture.f54261b.add(this.f54263a, MoreExecutors.directExecutor());
            return closingFuture;
        }

        public <V> ClosingFuture<V> callAsync(AsyncCombiningCallable<V> asyncCombiningCallable, Executor executor) {
            ClosingFuture<V> closingFuture = new ClosingFuture<>(m39561c().callAsync(new C8206b(this, asyncCombiningCallable), executor), (CallableC8216b) null);
            closingFuture.f54261b.add(this.f54263a, MoreExecutors.directExecutor());
            return closingFuture;
        }

        /* renamed from: d */
        public final ImmutableList m39560d() {
            return FluentIterable.from(this.inputs).transform(new Function() { // from class: lq
                @Override // com.google.common.base.Function
                public final Object apply(Object obj) {
                    FluentFuture m39580b;
                    m39580b = ClosingFuture.m39580b((ClosingFuture) obj);
                    return m39580b;
                }
            }).toList();
        }

        public Combiner(boolean z, Iterable iterable) {
            this.f54263a = new CloseableList(null);
            this.f54264b = z;
            this.inputs = ImmutableList.copyOf(iterable);
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                ((ClosingFuture) it.next()).m39573i(this.f54263a);
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class Combiner2<V1, V2> extends Combiner {

        /* renamed from: c */
        public final ClosingFuture f54269c;

        /* renamed from: d */
        public final ClosingFuture f54270d;

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
        public class C8207a implements Combiner.CombiningCallable {

            /* renamed from: a */
            public final /* synthetic */ ClosingFunction2 f54271a;

            /* renamed from: b */
            public final /* synthetic */ Combiner2 f54272b;

            public C8207a(Combiner2 combiner2, ClosingFunction2 closingFunction2) {
                this.f54271a = closingFunction2;
                this.f54272b = combiner2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.util.concurrent.ClosingFuture.Combiner.CombiningCallable
            public Object call(DeferredCloser deferredCloser, Peeker peeker) {
                return this.f54271a.apply(deferredCloser, peeker.getDone(this.f54272b.f54269c), peeker.getDone(this.f54272b.f54270d));
            }

            public String toString() {
                return this.f54271a.toString();
            }
        }

        /* renamed from: com.google.common.util.concurrent.ClosingFuture$Combiner2$b */
        /* loaded from: classes4.dex */
        public class C8208b implements Combiner.AsyncCombiningCallable {

            /* renamed from: a */
            public final /* synthetic */ AsyncClosingFunction2 f54273a;

            /* renamed from: b */
            public final /* synthetic */ Combiner2 f54274b;

            public C8208b(Combiner2 combiner2, AsyncClosingFunction2 asyncClosingFunction2) {
                this.f54273a = asyncClosingFunction2;
                this.f54274b = combiner2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.util.concurrent.ClosingFuture.Combiner.AsyncCombiningCallable
            public ClosingFuture call(DeferredCloser deferredCloser, Peeker peeker) {
                return this.f54273a.apply(deferredCloser, peeker.getDone(this.f54274b.f54269c), peeker.getDone(this.f54274b.f54270d));
            }

            public String toString() {
                return this.f54273a.toString();
            }
        }

        public /* synthetic */ Combiner2(ClosingFuture closingFuture, ClosingFuture closingFuture2, CallableC8216b callableC8216b) {
            this(closingFuture, closingFuture2);
        }

        public <U> ClosingFuture<U> call(ClosingFunction2<V1, V2, U> closingFunction2, Executor executor) {
            return (ClosingFuture<V>) call(new C8207a(this, closingFunction2), executor);
        }

        public <U> ClosingFuture<U> callAsync(AsyncClosingFunction2<V1, V2, U> asyncClosingFunction2, Executor executor) {
            return (ClosingFuture<V>) callAsync(new C8208b(this, asyncClosingFunction2), executor);
        }

        public Combiner2(ClosingFuture closingFuture, ClosingFuture closingFuture2) {
            super(true, ImmutableList.m40985of(closingFuture, closingFuture2), null);
            this.f54269c = closingFuture;
            this.f54270d = closingFuture2;
        }
    }

    /* loaded from: classes4.dex */
    public static final class Combiner3<V1, V2, V3> extends Combiner {

        /* renamed from: c */
        public final ClosingFuture f54275c;

        /* renamed from: d */
        public final ClosingFuture f54276d;

        /* renamed from: e */
        public final ClosingFuture f54277e;

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
        public class C8209a implements Combiner.CombiningCallable {

            /* renamed from: a */
            public final /* synthetic */ ClosingFunction3 f54278a;

            /* renamed from: b */
            public final /* synthetic */ Combiner3 f54279b;

            public C8209a(Combiner3 combiner3, ClosingFunction3 closingFunction3) {
                this.f54278a = closingFunction3;
                this.f54279b = combiner3;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.util.concurrent.ClosingFuture.Combiner.CombiningCallable
            public Object call(DeferredCloser deferredCloser, Peeker peeker) {
                return this.f54278a.apply(deferredCloser, peeker.getDone(this.f54279b.f54275c), peeker.getDone(this.f54279b.f54276d), peeker.getDone(this.f54279b.f54277e));
            }

            public String toString() {
                return this.f54278a.toString();
            }
        }

        /* renamed from: com.google.common.util.concurrent.ClosingFuture$Combiner3$b */
        /* loaded from: classes4.dex */
        public class C8210b implements Combiner.AsyncCombiningCallable {

            /* renamed from: a */
            public final /* synthetic */ AsyncClosingFunction3 f54280a;

            /* renamed from: b */
            public final /* synthetic */ Combiner3 f54281b;

            public C8210b(Combiner3 combiner3, AsyncClosingFunction3 asyncClosingFunction3) {
                this.f54280a = asyncClosingFunction3;
                this.f54281b = combiner3;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.util.concurrent.ClosingFuture.Combiner.AsyncCombiningCallable
            public ClosingFuture call(DeferredCloser deferredCloser, Peeker peeker) {
                return this.f54280a.apply(deferredCloser, peeker.getDone(this.f54281b.f54275c), peeker.getDone(this.f54281b.f54276d), peeker.getDone(this.f54281b.f54277e));
            }

            public String toString() {
                return this.f54280a.toString();
            }
        }

        public /* synthetic */ Combiner3(ClosingFuture closingFuture, ClosingFuture closingFuture2, ClosingFuture closingFuture3, CallableC8216b callableC8216b) {
            this(closingFuture, closingFuture2, closingFuture3);
        }

        public <U> ClosingFuture<U> call(ClosingFunction3<V1, V2, V3, U> closingFunction3, Executor executor) {
            return (ClosingFuture<V>) call(new C8209a(this, closingFunction3), executor);
        }

        public <U> ClosingFuture<U> callAsync(AsyncClosingFunction3<V1, V2, V3, U> asyncClosingFunction3, Executor executor) {
            return (ClosingFuture<V>) callAsync(new C8210b(this, asyncClosingFunction3), executor);
        }

        public Combiner3(ClosingFuture closingFuture, ClosingFuture closingFuture2, ClosingFuture closingFuture3) {
            super(true, ImmutableList.m40984of(closingFuture, closingFuture2, closingFuture3), null);
            this.f54275c = closingFuture;
            this.f54276d = closingFuture2;
            this.f54277e = closingFuture3;
        }
    }

    /* loaded from: classes4.dex */
    public static final class Combiner4<V1, V2, V3, V4> extends Combiner {

        /* renamed from: c */
        public final ClosingFuture f54282c;

        /* renamed from: d */
        public final ClosingFuture f54283d;

        /* renamed from: e */
        public final ClosingFuture f54284e;

        /* renamed from: f */
        public final ClosingFuture f54285f;

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
        public class C8211a implements Combiner.CombiningCallable {

            /* renamed from: a */
            public final /* synthetic */ ClosingFunction4 f54286a;

            /* renamed from: b */
            public final /* synthetic */ Combiner4 f54287b;

            public C8211a(Combiner4 combiner4, ClosingFunction4 closingFunction4) {
                this.f54286a = closingFunction4;
                this.f54287b = combiner4;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.util.concurrent.ClosingFuture.Combiner.CombiningCallable
            public Object call(DeferredCloser deferredCloser, Peeker peeker) {
                return this.f54286a.apply(deferredCloser, peeker.getDone(this.f54287b.f54282c), peeker.getDone(this.f54287b.f54283d), peeker.getDone(this.f54287b.f54284e), peeker.getDone(this.f54287b.f54285f));
            }

            public String toString() {
                return this.f54286a.toString();
            }
        }

        /* renamed from: com.google.common.util.concurrent.ClosingFuture$Combiner4$b */
        /* loaded from: classes4.dex */
        public class C8212b implements Combiner.AsyncCombiningCallable {

            /* renamed from: a */
            public final /* synthetic */ AsyncClosingFunction4 f54288a;

            /* renamed from: b */
            public final /* synthetic */ Combiner4 f54289b;

            public C8212b(Combiner4 combiner4, AsyncClosingFunction4 asyncClosingFunction4) {
                this.f54288a = asyncClosingFunction4;
                this.f54289b = combiner4;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.util.concurrent.ClosingFuture.Combiner.AsyncCombiningCallable
            public ClosingFuture call(DeferredCloser deferredCloser, Peeker peeker) {
                return this.f54288a.apply(deferredCloser, peeker.getDone(this.f54289b.f54282c), peeker.getDone(this.f54289b.f54283d), peeker.getDone(this.f54289b.f54284e), peeker.getDone(this.f54289b.f54285f));
            }

            public String toString() {
                return this.f54288a.toString();
            }
        }

        public /* synthetic */ Combiner4(ClosingFuture closingFuture, ClosingFuture closingFuture2, ClosingFuture closingFuture3, ClosingFuture closingFuture4, CallableC8216b callableC8216b) {
            this(closingFuture, closingFuture2, closingFuture3, closingFuture4);
        }

        public <U> ClosingFuture<U> call(ClosingFunction4<V1, V2, V3, V4, U> closingFunction4, Executor executor) {
            return (ClosingFuture<V>) call(new C8211a(this, closingFunction4), executor);
        }

        public <U> ClosingFuture<U> callAsync(AsyncClosingFunction4<V1, V2, V3, V4, U> asyncClosingFunction4, Executor executor) {
            return (ClosingFuture<V>) callAsync(new C8212b(this, asyncClosingFunction4), executor);
        }

        public Combiner4(ClosingFuture closingFuture, ClosingFuture closingFuture2, ClosingFuture closingFuture3, ClosingFuture closingFuture4) {
            super(true, ImmutableList.m40983of(closingFuture, closingFuture2, closingFuture3, closingFuture4), null);
            this.f54282c = closingFuture;
            this.f54283d = closingFuture2;
            this.f54284e = closingFuture3;
            this.f54285f = closingFuture4;
        }
    }

    /* loaded from: classes4.dex */
    public static final class Combiner5<V1, V2, V3, V4, V5> extends Combiner {

        /* renamed from: c */
        public final ClosingFuture f54290c;

        /* renamed from: d */
        public final ClosingFuture f54291d;

        /* renamed from: e */
        public final ClosingFuture f54292e;

        /* renamed from: f */
        public final ClosingFuture f54293f;

        /* renamed from: g */
        public final ClosingFuture f54294g;

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
        public class C8213a implements Combiner.CombiningCallable {

            /* renamed from: a */
            public final /* synthetic */ ClosingFunction5 f54295a;

            /* renamed from: b */
            public final /* synthetic */ Combiner5 f54296b;

            public C8213a(Combiner5 combiner5, ClosingFunction5 closingFunction5) {
                this.f54295a = closingFunction5;
                this.f54296b = combiner5;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.util.concurrent.ClosingFuture.Combiner.CombiningCallable
            public Object call(DeferredCloser deferredCloser, Peeker peeker) {
                return this.f54295a.apply(deferredCloser, peeker.getDone(this.f54296b.f54290c), peeker.getDone(this.f54296b.f54291d), peeker.getDone(this.f54296b.f54292e), peeker.getDone(this.f54296b.f54293f), peeker.getDone(this.f54296b.f54294g));
            }

            public String toString() {
                return this.f54295a.toString();
            }
        }

        /* renamed from: com.google.common.util.concurrent.ClosingFuture$Combiner5$b */
        /* loaded from: classes4.dex */
        public class C8214b implements Combiner.AsyncCombiningCallable {

            /* renamed from: a */
            public final /* synthetic */ AsyncClosingFunction5 f54297a;

            /* renamed from: b */
            public final /* synthetic */ Combiner5 f54298b;

            public C8214b(Combiner5 combiner5, AsyncClosingFunction5 asyncClosingFunction5) {
                this.f54297a = asyncClosingFunction5;
                this.f54298b = combiner5;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.util.concurrent.ClosingFuture.Combiner.AsyncCombiningCallable
            public ClosingFuture call(DeferredCloser deferredCloser, Peeker peeker) {
                return this.f54297a.apply(deferredCloser, peeker.getDone(this.f54298b.f54290c), peeker.getDone(this.f54298b.f54291d), peeker.getDone(this.f54298b.f54292e), peeker.getDone(this.f54298b.f54293f), peeker.getDone(this.f54298b.f54294g));
            }

            public String toString() {
                return this.f54297a.toString();
            }
        }

        public /* synthetic */ Combiner5(ClosingFuture closingFuture, ClosingFuture closingFuture2, ClosingFuture closingFuture3, ClosingFuture closingFuture4, ClosingFuture closingFuture5, CallableC8216b callableC8216b) {
            this(closingFuture, closingFuture2, closingFuture3, closingFuture4, closingFuture5);
        }

        public <U> ClosingFuture<U> call(ClosingFunction5<V1, V2, V3, V4, V5, U> closingFunction5, Executor executor) {
            return (ClosingFuture<V>) call(new C8213a(this, closingFunction5), executor);
        }

        public <U> ClosingFuture<U> callAsync(AsyncClosingFunction5<V1, V2, V3, V4, V5, U> asyncClosingFunction5, Executor executor) {
            return (ClosingFuture<V>) callAsync(new C8214b(this, asyncClosingFunction5), executor);
        }

        public Combiner5(ClosingFuture closingFuture, ClosingFuture closingFuture2, ClosingFuture closingFuture3, ClosingFuture closingFuture4, ClosingFuture closingFuture5) {
            super(true, ImmutableList.m40982of(closingFuture, closingFuture2, closingFuture3, closingFuture4, closingFuture5), null);
            this.f54290c = closingFuture;
            this.f54291d = closingFuture2;
            this.f54292e = closingFuture3;
            this.f54293f = closingFuture4;
            this.f54294g = closingFuture5;
        }
    }

    /* loaded from: classes4.dex */
    public static final class DeferredCloser {

        /* renamed from: a */
        public final CloseableList f54299a;

        public DeferredCloser(CloseableList closeableList) {
            this.f54299a = closeableList;
        }

        @CanIgnoreReturnValue
        public <C extends AutoCloseable> C eventuallyClose(C c, Executor executor) {
            Preconditions.checkNotNull(executor);
            if (c != null) {
                this.f54299a.add(c, executor);
            }
            return c;
        }
    }

    /* loaded from: classes4.dex */
    public static final class Peeker {

        /* renamed from: a */
        public final ImmutableList f54300a;

        /* renamed from: b */
        public volatile boolean f54301b;

        public /* synthetic */ Peeker(ImmutableList immutableList, CallableC8216b callableC8216b) {
            this(immutableList);
        }

        /* renamed from: c */
        public final Object m39542c(Combiner.CombiningCallable combiningCallable, CloseableList closeableList) {
            this.f54301b = true;
            CloseableList closeableList2 = new CloseableList(null);
            try {
                return combiningCallable.call(closeableList2.closer, this);
            } finally {
                closeableList.add(closeableList2, MoreExecutors.directExecutor());
                this.f54301b = false;
            }
        }

        /* renamed from: d */
        public final FluentFuture m39541d(Combiner.AsyncCombiningCallable asyncCombiningCallable, CloseableList closeableList) {
            this.f54301b = true;
            CloseableList closeableList2 = new CloseableList(null);
            try {
                ClosingFuture<V> call = asyncCombiningCallable.call(closeableList2.closer, this);
                call.m39573i(closeableList);
                return call.f54262c;
            } finally {
                closeableList.add(closeableList2, MoreExecutors.directExecutor());
                this.f54301b = false;
            }
        }

        public final <D> D getDone(ClosingFuture<D> closingFuture) throws ExecutionException {
            Preconditions.checkState(this.f54301b);
            Preconditions.checkArgument(this.f54300a.contains(closingFuture));
            return (D) Futures.getDone(closingFuture.f54262c);
        }

        public Peeker(ImmutableList immutableList) {
            this.f54300a = (ImmutableList) Preconditions.checkNotNull(immutableList);
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
        public final ClosingFuture f54302a;

        public ValueAndCloser(ClosingFuture closingFuture) {
            this.f54302a = (ClosingFuture) Preconditions.checkNotNull(closingFuture);
        }

        public void closeAsync() {
            this.f54302a.m39569m();
        }

        public V get() throws ExecutionException {
            return (V) Futures.getDone(this.f54302a.f54262c);
        }
    }

    /* loaded from: classes4.dex */
    public interface ValueAndCloserConsumer<V> {
        void accept(ValueAndCloser<V> valueAndCloser);
    }

    /* renamed from: com.google.common.util.concurrent.ClosingFuture$a */
    /* loaded from: classes4.dex */
    public class RunnableC8215a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ ValueAndCloserConsumer f54303a;

        /* renamed from: b */
        public final /* synthetic */ ClosingFuture f54304b;

        public RunnableC8215a(ClosingFuture closingFuture, ValueAndCloserConsumer valueAndCloserConsumer) {
            this.f54303a = valueAndCloserConsumer;
            this.f54304b = closingFuture;
        }

        @Override // java.lang.Runnable
        public void run() {
            ClosingFuture.m39564r(this.f54303a, this.f54304b);
        }
    }

    /* renamed from: com.google.common.util.concurrent.ClosingFuture$b */
    /* loaded from: classes4.dex */
    public class CallableC8216b implements Callable {

        /* renamed from: a */
        public final /* synthetic */ ClosingCallable f54305a;

        /* renamed from: b */
        public final /* synthetic */ CloseableList f54306b;

        public CallableC8216b(ClosingCallable closingCallable, CloseableList closeableList) {
            this.f54305a = closingCallable;
            this.f54306b = closeableList;
        }

        @Override // java.util.concurrent.Callable
        public Object call() {
            return this.f54305a.call(this.f54306b.closer);
        }

        public String toString() {
            return this.f54305a.toString();
        }
    }

    /* renamed from: com.google.common.util.concurrent.ClosingFuture$c */
    /* loaded from: classes4.dex */
    public class C8217c implements AsyncCallable {

        /* renamed from: a */
        public final /* synthetic */ AsyncClosingCallable f54307a;

        /* renamed from: b */
        public final /* synthetic */ CloseableList f54308b;

        public C8217c(AsyncClosingCallable asyncClosingCallable, CloseableList closeableList) {
            this.f54307a = asyncClosingCallable;
            this.f54308b = closeableList;
        }

        @Override // com.google.common.util.concurrent.AsyncCallable
        public ListenableFuture call() {
            CloseableList closeableList = new CloseableList(null);
            try {
                ClosingFuture<V> call = this.f54307a.call(closeableList.closer);
                call.m39573i(this.f54308b);
                return call.f54262c;
            } finally {
                this.f54308b.add(closeableList, MoreExecutors.directExecutor());
            }
        }

        public String toString() {
            return this.f54307a.toString();
        }
    }

    /* renamed from: com.google.common.util.concurrent.ClosingFuture$d */
    /* loaded from: classes4.dex */
    public class C8218d implements FutureCallback {

        /* renamed from: b */
        public final /* synthetic */ Executor f54310b;

        public C8218d(Executor executor) {
            ClosingFuture.this = r1;
            this.f54310b = executor;
        }

        @Override // com.google.common.util.concurrent.FutureCallback
        /* renamed from: a */
        public void onSuccess(AutoCloseable autoCloseable) {
            ClosingFuture.this.f54261b.closer.eventuallyClose(autoCloseable, this.f54310b);
        }

        @Override // com.google.common.util.concurrent.FutureCallback
        public void onFailure(Throwable th2) {
        }
    }

    /* renamed from: com.google.common.util.concurrent.ClosingFuture$e */
    /* loaded from: classes4.dex */
    public class C8219e implements AsyncFunction {

        /* renamed from: a */
        public final /* synthetic */ ClosingFunction f54311a;

        /* renamed from: b */
        public final /* synthetic */ ClosingFuture f54312b;

        public C8219e(ClosingFuture closingFuture, ClosingFunction closingFunction) {
            this.f54311a = closingFunction;
            this.f54312b = closingFuture;
        }

        @Override // com.google.common.util.concurrent.AsyncFunction
        public ListenableFuture apply(Object obj) {
            return this.f54312b.f54261b.applyClosingFunction(this.f54311a, obj);
        }

        public String toString() {
            return this.f54311a.toString();
        }
    }

    /* renamed from: com.google.common.util.concurrent.ClosingFuture$f */
    /* loaded from: classes4.dex */
    public class C8220f implements AsyncFunction {

        /* renamed from: a */
        public final /* synthetic */ AsyncClosingFunction f54313a;

        /* renamed from: b */
        public final /* synthetic */ ClosingFuture f54314b;

        public C8220f(ClosingFuture closingFuture, AsyncClosingFunction asyncClosingFunction) {
            this.f54313a = asyncClosingFunction;
            this.f54314b = closingFuture;
        }

        @Override // com.google.common.util.concurrent.AsyncFunction
        public ListenableFuture apply(Object obj) {
            return this.f54314b.f54261b.applyAsyncClosingFunction(this.f54313a, obj);
        }

        public String toString() {
            return this.f54313a.toString();
        }
    }

    /* renamed from: com.google.common.util.concurrent.ClosingFuture$g */
    /* loaded from: classes4.dex */
    public class C8221g implements AsyncClosingFunction {

        /* renamed from: a */
        public final /* synthetic */ AsyncFunction f54315a;

        public C8221g(AsyncFunction asyncFunction) {
            this.f54315a = asyncFunction;
        }

        @Override // com.google.common.util.concurrent.ClosingFuture.AsyncClosingFunction
        public ClosingFuture apply(DeferredCloser deferredCloser, Object obj) {
            return ClosingFuture.from(this.f54315a.apply(obj));
        }
    }

    /* renamed from: com.google.common.util.concurrent.ClosingFuture$h */
    /* loaded from: classes4.dex */
    public class C8222h implements AsyncFunction {

        /* renamed from: a */
        public final /* synthetic */ ClosingFunction f54316a;

        /* renamed from: b */
        public final /* synthetic */ ClosingFuture f54317b;

        public C8222h(ClosingFuture closingFuture, ClosingFunction closingFunction) {
            this.f54316a = closingFunction;
            this.f54317b = closingFuture;
        }

        @Override // com.google.common.util.concurrent.AsyncFunction
        /* renamed from: a */
        public ListenableFuture apply(Throwable th2) {
            return this.f54317b.f54261b.applyClosingFunction(this.f54316a, th2);
        }

        public String toString() {
            return this.f54316a.toString();
        }
    }

    /* renamed from: com.google.common.util.concurrent.ClosingFuture$i */
    /* loaded from: classes4.dex */
    public class C8223i implements AsyncFunction {

        /* renamed from: a */
        public final /* synthetic */ AsyncClosingFunction f54318a;

        /* renamed from: b */
        public final /* synthetic */ ClosingFuture f54319b;

        public C8223i(ClosingFuture closingFuture, AsyncClosingFunction asyncClosingFunction) {
            this.f54318a = asyncClosingFunction;
            this.f54319b = closingFuture;
        }

        @Override // com.google.common.util.concurrent.AsyncFunction
        /* renamed from: a */
        public ListenableFuture apply(Throwable th2) {
            return this.f54319b.f54261b.applyAsyncClosingFunction(this.f54318a, th2);
        }

        public String toString() {
            return this.f54318a.toString();
        }
    }

    /* renamed from: com.google.common.util.concurrent.ClosingFuture$j */
    /* loaded from: classes4.dex */
    public class RunnableC8224j implements Runnable {
        public RunnableC8224j() {
            ClosingFuture.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            ClosingFuture closingFuture = ClosingFuture.this;
            State state = State.WILL_CLOSE;
            State state2 = State.CLOSING;
            closingFuture.m39570l(state, state2);
            ClosingFuture.this.m39569m();
            ClosingFuture.this.m39570l(state2, State.CLOSED);
        }
    }

    public /* synthetic */ ClosingFuture(ListenableFuture listenableFuture, CallableC8216b callableC8216b) {
        this(listenableFuture);
    }

    /* renamed from: a */
    public static /* synthetic */ void m39581a(AutoCloseable autoCloseable) {
        m39565q(autoCloseable);
    }

    /* renamed from: b */
    public static /* synthetic */ FluentFuture m39580b(ClosingFuture closingFuture) {
        return closingFuture.f54262c;
    }

    @Deprecated
    public static <C extends AutoCloseable> ClosingFuture<C> eventuallyClosing(ListenableFuture<C> listenableFuture, Executor executor) {
        Preconditions.checkNotNull(executor);
        ClosingFuture<C> closingFuture = new ClosingFuture<>(Futures.nonCancellationPropagating(listenableFuture));
        Futures.addCallback(listenableFuture, new C8218d(executor), MoreExecutors.directExecutor());
        return closingFuture;
    }

    public static <V> ClosingFuture<V> from(ListenableFuture<V> listenableFuture) {
        return new ClosingFuture<>(listenableFuture);
    }

    /* renamed from: n */
    public static void m39568n(final AutoCloseable autoCloseable, Executor executor) {
        if (autoCloseable == null) {
            return;
        }
        try {
            executor.execute(new Runnable() { // from class: kq
                @Override // java.lang.Runnable
                public final void run() {
                    ClosingFuture.m39581a(autoCloseable);
                }
            });
        } catch (RejectedExecutionException e) {
            C17503Di0 c17503Di0 = f54259d;
            Logger m68797a = c17503Di0.m68797a();
            Level level = Level.WARNING;
            if (m68797a.isLoggable(level)) {
                c17503Di0.m68797a().log(level, String.format("while submitting close to %s; will close inline", executor), (Throwable) e);
            }
            m39568n(autoCloseable, MoreExecutors.directExecutor());
        }
    }

    /* renamed from: q */
    public static /* synthetic */ void m39565q(AutoCloseable autoCloseable) {
        try {
            autoCloseable.close();
        } catch (Exception e) {
            AbstractC23431zl1.m74b(e);
            f54259d.m68797a().log(Level.WARNING, "thrown by close()", (Throwable) e);
        }
    }

    /* renamed from: r */
    public static void m39564r(ValueAndCloserConsumer valueAndCloserConsumer, ClosingFuture closingFuture) {
        valueAndCloserConsumer.accept(new ValueAndCloser<>(closingFuture));
    }

    public static <V> ClosingFuture<V> submit(ClosingCallable<V> closingCallable, Executor executor) {
        Preconditions.checkNotNull(closingCallable);
        CloseableList closeableList = new CloseableList(null);
        TrustedListenableFutureTask m39380B = TrustedListenableFutureTask.m39380B(new CallableC8216b(closingCallable, closeableList));
        executor.execute(m39380B);
        return new ClosingFuture<>(m39380B, closeableList);
    }

    public static <V> ClosingFuture<V> submitAsync(AsyncClosingCallable<V> asyncClosingCallable, Executor executor) {
        Preconditions.checkNotNull(asyncClosingCallable);
        CloseableList closeableList = new CloseableList(null);
        TrustedListenableFutureTask m39379z = TrustedListenableFutureTask.m39379z(new C8217c(asyncClosingCallable, closeableList));
        executor.execute(m39379z);
        return new ClosingFuture<>(m39379z, closeableList);
    }

    public static Combiner whenAllComplete(Iterable<? extends ClosingFuture<?>> iterable) {
        return new Combiner(false, iterable, null);
    }

    public static Combiner whenAllSucceed(Iterable<? extends ClosingFuture<?>> iterable) {
        return new Combiner(true, iterable, null);
    }

    public static <V, U> AsyncClosingFunction<V, U> withoutCloser(AsyncFunction<V, U> asyncFunction) {
        Preconditions.checkNotNull(asyncFunction);
        return new C8221g(asyncFunction);
    }

    @CanIgnoreReturnValue
    public boolean cancel(boolean z) {
        f54259d.m68797a().log(Level.FINER, "cancelling {0}", this);
        boolean cancel = this.f54262c.cancel(z);
        if (cancel) {
            m39569m();
        }
        return cancel;
    }

    public <X extends Throwable> ClosingFuture<V> catching(Class<X> cls, ClosingFunction<? super X, ? extends V> closingFunction, Executor executor) {
        return m39571k(cls, closingFunction, executor);
    }

    public <X extends Throwable> ClosingFuture<V> catchingAsync(Class<X> cls, AsyncClosingFunction<? super X, ? extends V> asyncClosingFunction, Executor executor) {
        return m39572j(cls, asyncClosingFunction, executor);
    }

    public void finalize() {
        if (((State) this.f54260a.get()).equals(State.OPEN)) {
            f54259d.m68797a().log(Level.SEVERE, "Uh oh! An open ClosingFuture has leaked and will close: {0}", this);
            finishToFuture();
        }
    }

    public FluentFuture<V> finishToFuture() {
        if (m39567o(State.OPEN, State.WILL_CLOSE)) {
            f54259d.m68797a().log(Level.FINER, "will close {0}", this);
            this.f54262c.addListener(new RunnableC8224j(), MoreExecutors.directExecutor());
        } else {
            int ordinal = ((State) this.f54260a.get()).ordinal();
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
        return this.f54262c;
    }

    public void finishToValueAndCloser(ValueAndCloserConsumer<? super V> valueAndCloserConsumer, Executor executor) {
        Preconditions.checkNotNull(valueAndCloserConsumer);
        if (!m39567o(State.OPEN, State.WILL_CREATE_VALUE_AND_CLOSER)) {
            int ordinal = ((State) this.f54260a.get()).ordinal();
            if (ordinal != 1) {
                if (ordinal != 2 && ordinal != 3 && ordinal != 4) {
                    if (ordinal != 5) {
                        throw new AssertionError(this.f54260a);
                    }
                    throw new IllegalStateException("Cannot call finishToValueAndCloser() twice");
                }
                throw new IllegalStateException("Cannot call finishToValueAndCloser() after calling finishToFuture()");
            }
            throw new IllegalStateException("Cannot call finishToValueAndCloser() after deriving another step");
        }
        this.f54262c.addListener(new RunnableC8215a(this, valueAndCloserConsumer), executor);
    }

    /* renamed from: i */
    public final void m39573i(CloseableList closeableList) {
        m39570l(State.OPEN, State.SUBSUMED);
        closeableList.add(this.f54261b, MoreExecutors.directExecutor());
    }

    /* renamed from: j */
    public final ClosingFuture m39572j(Class cls, AsyncClosingFunction asyncClosingFunction, Executor executor) {
        Preconditions.checkNotNull(asyncClosingFunction);
        return m39566p(this.f54262c.catchingAsync(cls, new C8223i(this, asyncClosingFunction), executor));
    }

    /* renamed from: k */
    public final ClosingFuture m39571k(Class cls, ClosingFunction closingFunction, Executor executor) {
        Preconditions.checkNotNull(closingFunction);
        return m39566p(this.f54262c.catchingAsync(cls, new C8222h(this, closingFunction), executor));
    }

    /* renamed from: l */
    public final void m39570l(State state, State state2) {
        Preconditions.checkState(m39567o(state, state2), "Expected state to be %s, but it was %s", state, state2);
    }

    /* renamed from: m */
    public final void m39569m() {
        f54259d.m68797a().log(Level.FINER, "closing {0}", this);
        this.f54261b.close();
    }

    /* renamed from: o */
    public final boolean m39567o(State state, State state2) {
        return AbstractC23094xo1.m479a(this.f54260a, state, state2);
    }

    /* renamed from: p */
    public final ClosingFuture m39566p(FluentFuture fluentFuture) {
        ClosingFuture closingFuture = new ClosingFuture(fluentFuture);
        m39573i(closingFuture.f54261b);
        return closingFuture;
    }

    public ListenableFuture<?> statusFuture() {
        return Futures.nonCancellationPropagating(this.f54262c.transform(Functions.constant(null), MoreExecutors.directExecutor()));
    }

    public String toString() {
        return MoreObjects.toStringHelper(this).add(RemoteConfigConstants.ResponseFieldKey.STATE, this.f54260a.get()).addValue(this.f54262c).toString();
    }

    public <U> ClosingFuture<U> transform(ClosingFunction<? super V, U> closingFunction, Executor executor) {
        Preconditions.checkNotNull(closingFunction);
        return m39566p(this.f54262c.transformAsync(new C8219e(this, closingFunction), executor));
    }

    public <U> ClosingFuture<U> transformAsync(AsyncClosingFunction<? super V, U> asyncClosingFunction, Executor executor) {
        Preconditions.checkNotNull(asyncClosingFunction);
        return m39566p(this.f54262c.transformAsync(new C8220f(this, asyncClosingFunction), executor));
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
                        ClosingFuture.m39568n(autoCloseable, executor);
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
                apply.m39573i(closeableList);
                return apply.f54262c;
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
                        ClosingFuture.m39568n(entry.getKey(), entry.getValue());
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

        public /* synthetic */ CloseableList(CallableC8216b callableC8216b) {
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
        this.f54260a = new AtomicReference(State.OPEN);
        this.f54262c = FluentFuture.from(listenableFuture);
        this.f54261b = closeableList;
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
        return whenAllSucceed(FluentIterable.m41014of(closingFuture, closingFuture2, closingFuture3, closingFuture4, closingFuture5, closingFuture6).append(closingFutureArr));
    }
}