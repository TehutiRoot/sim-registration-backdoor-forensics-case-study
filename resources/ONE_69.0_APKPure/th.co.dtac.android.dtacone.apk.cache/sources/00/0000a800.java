package com.google.common.cache;

import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;

@GwtCompatible
/* loaded from: classes4.dex */
public abstract class AbstractCache<K, V> implements Cache<K, V> {

    /* loaded from: classes4.dex */
    public static final class SimpleStatsCounter implements StatsCounter {

        /* renamed from: a */
        public final InterfaceC17970Km0 f52828a = LongAddables.m41123a();

        /* renamed from: b */
        public final InterfaceC17970Km0 f52829b = LongAddables.m41123a();

        /* renamed from: c */
        public final InterfaceC17970Km0 f52830c = LongAddables.m41123a();

        /* renamed from: d */
        public final InterfaceC17970Km0 f52831d = LongAddables.m41123a();

        /* renamed from: e */
        public final InterfaceC17970Km0 f52832e = LongAddables.m41123a();

        /* renamed from: f */
        public final InterfaceC17970Km0 f52833f = LongAddables.m41123a();

        /* renamed from: a */
        public static long m41225a(long j) {
            if (j >= 0) {
                return j;
            }
            return Long.MAX_VALUE;
        }

        public void incrementBy(StatsCounter statsCounter) {
            CacheStats snapshot = statsCounter.snapshot();
            this.f52828a.add(snapshot.hitCount());
            this.f52829b.add(snapshot.missCount());
            this.f52830c.add(snapshot.loadSuccessCount());
            this.f52831d.add(snapshot.loadExceptionCount());
            this.f52832e.add(snapshot.totalLoadTime());
            this.f52833f.add(snapshot.evictionCount());
        }

        @Override // com.google.common.cache.AbstractCache.StatsCounter
        public void recordEviction() {
            this.f52833f.increment();
        }

        @Override // com.google.common.cache.AbstractCache.StatsCounter
        public void recordHits(int i) {
            this.f52828a.add(i);
        }

        @Override // com.google.common.cache.AbstractCache.StatsCounter
        public void recordLoadException(long j) {
            this.f52831d.increment();
            this.f52832e.add(j);
        }

        @Override // com.google.common.cache.AbstractCache.StatsCounter
        public void recordLoadSuccess(long j) {
            this.f52830c.increment();
            this.f52832e.add(j);
        }

        @Override // com.google.common.cache.AbstractCache.StatsCounter
        public void recordMisses(int i) {
            this.f52829b.add(i);
        }

        @Override // com.google.common.cache.AbstractCache.StatsCounter
        public CacheStats snapshot() {
            return new CacheStats(m41225a(this.f52828a.sum()), m41225a(this.f52829b.sum()), m41225a(this.f52830c.sum()), m41225a(this.f52831d.sum()), m41225a(this.f52832e.sum()), m41225a(this.f52833f.sum()));
        }
    }

    /* loaded from: classes4.dex */
    public interface StatsCounter {
        void recordEviction();

        void recordHits(int i);

        void recordLoadException(long j);

        void recordLoadSuccess(long j);

        void recordMisses(int i);

        CacheStats snapshot();
    }

    @Override // com.google.common.cache.Cache
    public ConcurrentMap<K, V> asMap() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.cache.Cache
    public void cleanUp() {
    }

    @Override // com.google.common.cache.Cache
    public V get(K k, Callable<? extends V> callable) throws ExecutionException {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.cache.Cache
    public ImmutableMap<K, V> getAllPresent(Iterable<? extends Object> iterable) {
        V ifPresent;
        LinkedHashMap newLinkedHashMap = Maps.newLinkedHashMap();
        for (Object obj : iterable) {
            if (!newLinkedHashMap.containsKey(obj) && (ifPresent = getIfPresent(obj)) != null) {
                newLinkedHashMap.put(obj, ifPresent);
            }
        }
        return ImmutableMap.copyOf((Map) newLinkedHashMap);
    }

    @Override // com.google.common.cache.Cache
    public void invalidate(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.cache.Cache
    public void invalidateAll(Iterable<? extends Object> iterable) {
        for (Object obj : iterable) {
            invalidate(obj);
        }
    }

    @Override // com.google.common.cache.Cache
    public void put(K k, V v) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.cache.Cache
    public void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.common.cache.Cache
    public long size() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.cache.Cache
    public CacheStats stats() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.cache.Cache
    public void invalidateAll() {
        throw new UnsupportedOperationException();
    }
}