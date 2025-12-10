package com.google.common.cache;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.cache.CacheLoader;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ListenableFutureTask;
import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

@GwtCompatible(emulated = true)
/* loaded from: classes4.dex */
public abstract class CacheLoader<K, V> {

    /* loaded from: classes4.dex */
    public static final class FunctionToCacheLoader<K, V> extends CacheLoader<K, V> implements Serializable {
        private static final long serialVersionUID = 0;
        private final Function<K, V> computingFunction;

        public FunctionToCacheLoader(Function<K, V> function) {
            this.computingFunction = (Function) Preconditions.checkNotNull(function);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.cache.CacheLoader
        public V load(K k) {
            return (V) this.computingFunction.apply(Preconditions.checkNotNull(k));
        }
    }

    /* loaded from: classes4.dex */
    public static final class InvalidCacheLoadException extends RuntimeException {
        public InvalidCacheLoadException(String str) {
            super(str);
        }
    }

    /* loaded from: classes4.dex */
    public static final class SupplierToCacheLoader<V> extends CacheLoader<Object, V> implements Serializable {
        private static final long serialVersionUID = 0;
        private final Supplier<V> computingSupplier;

        public SupplierToCacheLoader(Supplier<V> supplier) {
            this.computingSupplier = (Supplier) Preconditions.checkNotNull(supplier);
        }

        @Override // com.google.common.cache.CacheLoader
        public V load(Object obj) {
            Preconditions.checkNotNull(obj);
            return this.computingSupplier.get();
        }
    }

    /* loaded from: classes4.dex */
    public static final class UnsupportedLoadingOperationException extends UnsupportedOperationException {
    }

    /* renamed from: com.google.common.cache.CacheLoader$a */
    /* loaded from: classes4.dex */
    public class C7478a extends CacheLoader {

        /* renamed from: b */
        public final /* synthetic */ Executor f52864b;

        public C7478a(Executor executor) {
            CacheLoader.this = r1;
            this.f52864b = executor;
        }

        /* renamed from: a */
        public static /* synthetic */ Object m41204a(CacheLoader cacheLoader, Object obj, Object obj2) {
            return m41203b(cacheLoader, obj, obj2);
        }

        /* renamed from: b */
        public static /* synthetic */ Object m41203b(CacheLoader cacheLoader, Object obj, Object obj2) {
            return cacheLoader.reload(obj, obj2).get();
        }

        @Override // com.google.common.cache.CacheLoader
        public Object load(Object obj) {
            return CacheLoader.this.load(obj);
        }

        @Override // com.google.common.cache.CacheLoader
        public Map loadAll(Iterable iterable) {
            return CacheLoader.this.loadAll(iterable);
        }

        @Override // com.google.common.cache.CacheLoader
        public ListenableFuture reload(final Object obj, final Object obj2) {
            final CacheLoader cacheLoader = CacheLoader.this;
            ListenableFutureTask create = ListenableFutureTask.create(new Callable() { // from class: mg
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return CacheLoader.C7478a.m41204a(cacheLoader, obj, obj2);
                }
            });
            this.f52864b.execute(create);
            return create;
        }
    }

    @GwtIncompatible
    public static <K, V> CacheLoader<K, V> asyncReloading(CacheLoader<K, V> cacheLoader, Executor executor) {
        Preconditions.checkNotNull(cacheLoader);
        Preconditions.checkNotNull(executor);
        return new C7478a(executor);
    }

    public static <K, V> CacheLoader<K, V> from(Function<K, V> function) {
        return new FunctionToCacheLoader(function);
    }

    public abstract V load(K k) throws Exception;

    public Map<K, V> loadAll(Iterable<? extends K> iterable) throws Exception {
        throw new UnsupportedLoadingOperationException();
    }

    @GwtIncompatible
    public ListenableFuture<V> reload(K k, V v) throws Exception {
        Preconditions.checkNotNull(k);
        Preconditions.checkNotNull(v);
        return Futures.immediateFuture(load(k));
    }

    public static <V> CacheLoader<Object, V> from(Supplier<V> supplier) {
        return new SupplierToCacheLoader(supplier);
    }
}
