package com.google.common.cache;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Equivalence;
import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.base.Stopwatch;
import com.google.common.base.Ticker;
import com.google.common.cache.AbstractCache;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LocalCache;
import com.google.common.collect.AbstractSequentialIterator;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.primitives.Ints;
import com.google.common.util.concurrent.ExecutionError;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.common.util.concurrent.SettableFuture;
import com.google.common.util.concurrent.UncheckedExecutionException;
import com.google.common.util.concurrent.Uninterruptibles;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.GuardedBy;
import com.google.j2objc.annotations.Weak;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractQueue;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;

/* loaded from: classes4.dex */
public class LocalCache extends AbstractMap implements ConcurrentMap {

    /* renamed from: w */
    public static final Logger f52873w = Logger.getLogger(LocalCache.class.getName());

    /* renamed from: x */
    public static final InterfaceC7517s f52874x = new C7497a();

    /* renamed from: y */
    public static final Queue f52875y = new C7498b();

    /* renamed from: a */
    public final int f52876a;

    /* renamed from: b */
    public final int f52877b;

    /* renamed from: c */
    public final Segment[] f52878c;

    /* renamed from: d */
    public final int f52879d;

    /* renamed from: e */
    public final Equivalence f52880e;

    /* renamed from: f */
    public final Equivalence f52881f;

    /* renamed from: g */
    public final Strength f52882g;

    /* renamed from: h */
    public final Strength f52883h;

    /* renamed from: i */
    public final long f52884i;

    /* renamed from: j */
    public final Weigher f52885j;

    /* renamed from: k */
    public final long f52886k;

    /* renamed from: l */
    public final long f52887l;

    /* renamed from: m */
    public final long f52888m;

    /* renamed from: n */
    public final Queue f52889n;

    /* renamed from: o */
    public final RemovalListener f52890o;

    /* renamed from: p */
    public final Ticker f52891p;

    /* renamed from: q */
    public final EntryFactory f52892q;

    /* renamed from: r */
    public final AbstractCache.StatsCounter f52893r;

    /* renamed from: s */
    public final CacheLoader f52894s;

    /* renamed from: t */
    public Set f52895t;

    /* renamed from: u */
    public Collection f52896u;

    /* renamed from: v */
    public Set f52897v;

    /* renamed from: com.google.common.cache.LocalCache$A */
    /* loaded from: classes4.dex */
    public static final class C7479A extends C7514p {

        /* renamed from: b */
        public final int f52898b;

        public C7479A(Object obj, int i) {
            super(obj);
            this.f52898b = i;
        }

        @Override // com.google.common.cache.LocalCache.C7514p, com.google.common.cache.LocalCache.InterfaceC7517s
        public int getWeight() {
            return this.f52898b;
        }
    }

    /* renamed from: com.google.common.cache.LocalCache$B */
    /* loaded from: classes4.dex */
    public static final class C7480B extends C7522x {

        /* renamed from: b */
        public final int f52899b;

        public C7480B(ReferenceQueue referenceQueue, Object obj, InterfaceC7535b interfaceC7535b, int i) {
            super(referenceQueue, obj, interfaceC7535b);
            this.f52899b = i;
        }

        @Override // com.google.common.cache.LocalCache.C7522x, com.google.common.cache.LocalCache.InterfaceC7517s
        /* renamed from: d */
        public InterfaceC7517s mo41135d(ReferenceQueue referenceQueue, Object obj, InterfaceC7535b interfaceC7535b) {
            return new C7480B(referenceQueue, obj, interfaceC7535b, this.f52899b);
        }

        @Override // com.google.common.cache.LocalCache.C7522x, com.google.common.cache.LocalCache.InterfaceC7517s
        public int getWeight() {
            return this.f52899b;
        }
    }

    /* renamed from: com.google.common.cache.LocalCache$C */
    /* loaded from: classes4.dex */
    public static final class C7481C extends AbstractQueue {

        /* renamed from: a */
        public final InterfaceC7535b f52900a = new C7482a();

        /* renamed from: com.google.common.cache.LocalCache$C$a */
        /* loaded from: classes4.dex */
        public class C7482a extends AbstractC7500d {

            /* renamed from: a */
            public InterfaceC7535b f52901a = this;

            /* renamed from: b */
            public InterfaceC7535b f52902b = this;

            public C7482a() {
                C7481C.this = r1;
            }

            @Override // com.google.common.cache.LocalCache.AbstractC7500d, com.google.common.cache.InterfaceC7535b
            public InterfaceC7535b getNextInWriteQueue() {
                return this.f52901a;
            }

            @Override // com.google.common.cache.LocalCache.AbstractC7500d, com.google.common.cache.InterfaceC7535b
            public InterfaceC7535b getPreviousInWriteQueue() {
                return this.f52902b;
            }

            @Override // com.google.common.cache.LocalCache.AbstractC7500d, com.google.common.cache.InterfaceC7535b
            public long getWriteTime() {
                return Long.MAX_VALUE;
            }

            @Override // com.google.common.cache.LocalCache.AbstractC7500d, com.google.common.cache.InterfaceC7535b
            public void setNextInWriteQueue(InterfaceC7535b interfaceC7535b) {
                this.f52901a = interfaceC7535b;
            }

            @Override // com.google.common.cache.LocalCache.AbstractC7500d, com.google.common.cache.InterfaceC7535b
            public void setPreviousInWriteQueue(InterfaceC7535b interfaceC7535b) {
                this.f52902b = interfaceC7535b;
            }

            @Override // com.google.common.cache.LocalCache.AbstractC7500d, com.google.common.cache.InterfaceC7535b
            public void setWriteTime(long j) {
            }
        }

        /* renamed from: com.google.common.cache.LocalCache$C$b */
        /* loaded from: classes4.dex */
        public class C7483b extends AbstractSequentialIterator {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7483b(InterfaceC7535b interfaceC7535b) {
                super(interfaceC7535b);
                C7481C.this = r1;
            }

            @Override // com.google.common.collect.AbstractSequentialIterator
            /* renamed from: a */
            public InterfaceC7535b computeNext(InterfaceC7535b interfaceC7535b) {
                InterfaceC7535b nextInWriteQueue = interfaceC7535b.getNextInWriteQueue();
                if (nextInWriteQueue == C7481C.this.f52900a) {
                    return null;
                }
                return nextInWriteQueue;
            }
        }

        @Override // java.util.Queue
        /* renamed from: a */
        public boolean offer(InterfaceC7535b interfaceC7535b) {
            LocalCache.m41184c(interfaceC7535b.getPreviousInWriteQueue(), interfaceC7535b.getNextInWriteQueue());
            LocalCache.m41184c(this.f52900a.getPreviousInWriteQueue(), interfaceC7535b);
            LocalCache.m41184c(interfaceC7535b, this.f52900a);
            return true;
        }

        @Override // java.util.Queue
        /* renamed from: b */
        public InterfaceC7535b peek() {
            InterfaceC7535b nextInWriteQueue = this.f52900a.getNextInWriteQueue();
            if (nextInWriteQueue == this.f52900a) {
                return null;
            }
            return nextInWriteQueue;
        }

        @Override // java.util.Queue
        /* renamed from: c */
        public InterfaceC7535b poll() {
            InterfaceC7535b nextInWriteQueue = this.f52900a.getNextInWriteQueue();
            if (nextInWriteQueue == this.f52900a) {
                return null;
            }
            remove(nextInWriteQueue);
            return nextInWriteQueue;
        }

        @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
        public void clear() {
            InterfaceC7535b nextInWriteQueue = this.f52900a.getNextInWriteQueue();
            while (true) {
                InterfaceC7535b interfaceC7535b = this.f52900a;
                if (nextInWriteQueue != interfaceC7535b) {
                    InterfaceC7535b nextInWriteQueue2 = nextInWriteQueue.getNextInWriteQueue();
                    LocalCache.m41163y(nextInWriteQueue);
                    nextInWriteQueue = nextInWriteQueue2;
                } else {
                    interfaceC7535b.setNextInWriteQueue(interfaceC7535b);
                    InterfaceC7535b interfaceC7535b2 = this.f52900a;
                    interfaceC7535b2.setPreviousInWriteQueue(interfaceC7535b2);
                    return;
                }
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (((InterfaceC7535b) obj).getNextInWriteQueue() != NullEntry.INSTANCE) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            if (this.f52900a.getNextInWriteQueue() == this.f52900a) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return new C7483b(peek());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            InterfaceC7535b interfaceC7535b = (InterfaceC7535b) obj;
            InterfaceC7535b previousInWriteQueue = interfaceC7535b.getPreviousInWriteQueue();
            InterfaceC7535b nextInWriteQueue = interfaceC7535b.getNextInWriteQueue();
            LocalCache.m41184c(previousInWriteQueue, nextInWriteQueue);
            LocalCache.m41163y(interfaceC7535b);
            if (nextInWriteQueue != NullEntry.INSTANCE) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            int i = 0;
            for (InterfaceC7535b nextInWriteQueue = this.f52900a.getNextInWriteQueue(); nextInWriteQueue != this.f52900a; nextInWriteQueue = nextInWriteQueue.getNextInWriteQueue()) {
                i++;
            }
            return i;
        }
    }

    /* renamed from: com.google.common.cache.LocalCache$D */
    /* loaded from: classes4.dex */
    public final class C7484D implements Map.Entry {

        /* renamed from: a */
        public final Object f52905a;

        /* renamed from: b */
        public Object f52906b;

        public C7484D(Object obj, Object obj2) {
            LocalCache.this = r1;
            this.f52905a = obj;
            this.f52906b = obj2;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (!this.f52905a.equals(entry.getKey()) || !this.f52906b.equals(entry.getValue())) {
                return false;
            }
            return true;
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.f52905a;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f52906b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f52905a.hashCode() ^ this.f52906b.hashCode();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            Object put = LocalCache.this.put(this.f52905a, obj);
            this.f52906b = obj;
            return put;
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* loaded from: classes4.dex */
    public enum EntryFactory {
        STRONG { // from class: com.google.common.cache.LocalCache.EntryFactory.1
            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> InterfaceC7535b newEntry(Segment<K, V> segment, K k, int i, @CheckForNull InterfaceC7535b interfaceC7535b) {
                return new C7513o(k, i, interfaceC7535b);
            }
        },
        STRONG_ACCESS { // from class: com.google.common.cache.LocalCache.EntryFactory.2
            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> InterfaceC7535b copyEntry(Segment<K, V> segment, InterfaceC7535b interfaceC7535b, InterfaceC7535b interfaceC7535b2, K k) {
                InterfaceC7535b copyEntry = super.copyEntry(segment, interfaceC7535b, interfaceC7535b2, k);
                copyAccessEntry(interfaceC7535b, copyEntry);
                return copyEntry;
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> InterfaceC7535b newEntry(Segment<K, V> segment, K k, int i, @CheckForNull InterfaceC7535b interfaceC7535b) {
                return new C7511m(k, i, interfaceC7535b);
            }
        },
        STRONG_WRITE { // from class: com.google.common.cache.LocalCache.EntryFactory.3
            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> InterfaceC7535b copyEntry(Segment<K, V> segment, InterfaceC7535b interfaceC7535b, InterfaceC7535b interfaceC7535b2, K k) {
                InterfaceC7535b copyEntry = super.copyEntry(segment, interfaceC7535b, interfaceC7535b2, k);
                copyWriteEntry(interfaceC7535b, copyEntry);
                return copyEntry;
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> InterfaceC7535b newEntry(Segment<K, V> segment, K k, int i, @CheckForNull InterfaceC7535b interfaceC7535b) {
                return new C7515q(k, i, interfaceC7535b);
            }
        },
        STRONG_ACCESS_WRITE { // from class: com.google.common.cache.LocalCache.EntryFactory.4
            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> InterfaceC7535b copyEntry(Segment<K, V> segment, InterfaceC7535b interfaceC7535b, InterfaceC7535b interfaceC7535b2, K k) {
                InterfaceC7535b copyEntry = super.copyEntry(segment, interfaceC7535b, interfaceC7535b2, k);
                copyAccessEntry(interfaceC7535b, copyEntry);
                copyWriteEntry(interfaceC7535b, copyEntry);
                return copyEntry;
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> InterfaceC7535b newEntry(Segment<K, V> segment, K k, int i, @CheckForNull InterfaceC7535b interfaceC7535b) {
                return new C7512n(k, i, interfaceC7535b);
            }
        },
        WEAK { // from class: com.google.common.cache.LocalCache.EntryFactory.5
            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> InterfaceC7535b newEntry(Segment<K, V> segment, K k, int i, @CheckForNull InterfaceC7535b interfaceC7535b) {
                return new C7521w(segment.keyReferenceQueue, k, i, interfaceC7535b);
            }
        },
        WEAK_ACCESS { // from class: com.google.common.cache.LocalCache.EntryFactory.6
            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> InterfaceC7535b copyEntry(Segment<K, V> segment, InterfaceC7535b interfaceC7535b, InterfaceC7535b interfaceC7535b2, K k) {
                InterfaceC7535b copyEntry = super.copyEntry(segment, interfaceC7535b, interfaceC7535b2, k);
                copyAccessEntry(interfaceC7535b, copyEntry);
                return copyEntry;
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> InterfaceC7535b newEntry(Segment<K, V> segment, K k, int i, @CheckForNull InterfaceC7535b interfaceC7535b) {
                return new C7519u(segment.keyReferenceQueue, k, i, interfaceC7535b);
            }
        },
        WEAK_WRITE { // from class: com.google.common.cache.LocalCache.EntryFactory.7
            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> InterfaceC7535b copyEntry(Segment<K, V> segment, InterfaceC7535b interfaceC7535b, InterfaceC7535b interfaceC7535b2, K k) {
                InterfaceC7535b copyEntry = super.copyEntry(segment, interfaceC7535b, interfaceC7535b2, k);
                copyWriteEntry(interfaceC7535b, copyEntry);
                return copyEntry;
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> InterfaceC7535b newEntry(Segment<K, V> segment, K k, int i, @CheckForNull InterfaceC7535b interfaceC7535b) {
                return new C7523y(segment.keyReferenceQueue, k, i, interfaceC7535b);
            }
        },
        WEAK_ACCESS_WRITE { // from class: com.google.common.cache.LocalCache.EntryFactory.8
            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> InterfaceC7535b copyEntry(Segment<K, V> segment, InterfaceC7535b interfaceC7535b, InterfaceC7535b interfaceC7535b2, K k) {
                InterfaceC7535b copyEntry = super.copyEntry(segment, interfaceC7535b, interfaceC7535b2, k);
                copyAccessEntry(interfaceC7535b, copyEntry);
                copyWriteEntry(interfaceC7535b, copyEntry);
                return copyEntry;
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> InterfaceC7535b newEntry(Segment<K, V> segment, K k, int i, @CheckForNull InterfaceC7535b interfaceC7535b) {
                return new C7520v(segment.keyReferenceQueue, k, i, interfaceC7535b);
            }
        };
        
        static final int ACCESS_MASK = 1;
        static final int WEAK_MASK = 4;
        static final int WRITE_MASK = 2;
        static final EntryFactory[] factories;

        static {
            EntryFactory entryFactory;
            EntryFactory entryFactory2;
            EntryFactory entryFactory3;
            EntryFactory entryFactory4;
            EntryFactory entryFactory5;
            EntryFactory entryFactory6;
            EntryFactory entryFactory7;
            EntryFactory entryFactory8;
            factories = new EntryFactory[]{entryFactory, entryFactory2, entryFactory3, entryFactory4, entryFactory5, entryFactory6, entryFactory7, entryFactory8};
        }

        public static EntryFactory getFactory(Strength strength, boolean z, boolean z2) {
            int i;
            int i2 = 0;
            if (strength == Strength.WEAK) {
                i = 4;
            } else {
                i = 0;
            }
            int i3 = i | (z ? 1 : 0);
            if (z2) {
                i2 = 2;
            }
            return factories[i3 | i2];
        }

        public <K, V> void copyAccessEntry(InterfaceC7535b interfaceC7535b, InterfaceC7535b interfaceC7535b2) {
            interfaceC7535b2.setAccessTime(interfaceC7535b.getAccessTime());
            LocalCache.m41185b(interfaceC7535b.getPreviousInAccessQueue(), interfaceC7535b2);
            LocalCache.m41185b(interfaceC7535b2, interfaceC7535b.getNextInAccessQueue());
            LocalCache.m41164x(interfaceC7535b);
        }

        public <K, V> InterfaceC7535b copyEntry(Segment<K, V> segment, InterfaceC7535b interfaceC7535b, InterfaceC7535b interfaceC7535b2, K k) {
            return newEntry(segment, k, interfaceC7535b.getHash(), interfaceC7535b2);
        }

        public <K, V> void copyWriteEntry(InterfaceC7535b interfaceC7535b, InterfaceC7535b interfaceC7535b2) {
            interfaceC7535b2.setWriteTime(interfaceC7535b.getWriteTime());
            LocalCache.m41184c(interfaceC7535b.getPreviousInWriteQueue(), interfaceC7535b2);
            LocalCache.m41184c(interfaceC7535b2, interfaceC7535b.getNextInWriteQueue());
            LocalCache.m41163y(interfaceC7535b);
        }

        public abstract <K, V> InterfaceC7535b newEntry(Segment<K, V> segment, K k, int i, @CheckForNull InterfaceC7535b interfaceC7535b);

        /* synthetic */ EntryFactory(C7497a c7497a) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class LoadingSerializationProxy<K, V> extends ManualSerializationProxy<K, V> implements LoadingCache<K, V>, Serializable {
        private static final long serialVersionUID = 1;
        @CheckForNull
        transient LoadingCache<K, V> autoDelegate;

        public LoadingSerializationProxy(LocalCache localCache) {
            super(localCache);
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            objectInputStream.defaultReadObject();
            this.autoDelegate = (LoadingCache<K, V>) recreateCacheBuilder().build((CacheLoader<? super K, V>) this.loader);
        }

        private Object readResolve() {
            return this.autoDelegate;
        }

        @Override // com.google.common.cache.LoadingCache, com.google.common.base.Function
        public V apply(K k) {
            return this.autoDelegate.apply(k);
        }

        @Override // com.google.common.cache.LoadingCache
        public V get(K k) throws ExecutionException {
            return this.autoDelegate.get(k);
        }

        @Override // com.google.common.cache.LoadingCache
        public ImmutableMap<K, V> getAll(Iterable<? extends K> iterable) throws ExecutionException {
            return this.autoDelegate.getAll(iterable);
        }

        @Override // com.google.common.cache.LoadingCache
        public V getUnchecked(K k) {
            return this.autoDelegate.getUnchecked(k);
        }

        @Override // com.google.common.cache.LoadingCache
        public void refresh(K k) {
            this.autoDelegate.refresh(k);
        }
    }

    /* loaded from: classes4.dex */
    public static class LocalLoadingCache<K, V> extends LocalManualCache<K, V> implements LoadingCache<K, V> {
        private static final long serialVersionUID = 1;

        public LocalLoadingCache(CacheBuilder<? super K, ? super V> cacheBuilder, CacheLoader<? super K, V> cacheLoader) {
            super(new LocalCache(cacheBuilder, (CacheLoader) Preconditions.checkNotNull(cacheLoader)), null);
        }

        private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
            throw new InvalidObjectException("Use LoadingSerializationProxy");
        }

        @Override // com.google.common.cache.LoadingCache, com.google.common.base.Function
        public final V apply(K k) {
            return getUnchecked(k);
        }

        @Override // com.google.common.cache.LoadingCache
        public V get(K k) throws ExecutionException {
            return (V) this.localCache.m41172p(k);
        }

        @Override // com.google.common.cache.LoadingCache
        public ImmutableMap<K, V> getAll(Iterable<? extends K> iterable) throws ExecutionException {
            return this.localCache.m41176l(iterable);
        }

        @Override // com.google.common.cache.LoadingCache
        @CanIgnoreReturnValue
        public V getUnchecked(K k) {
            try {
                return get(k);
            } catch (ExecutionException e) {
                throw new UncheckedExecutionException(e.getCause());
            }
        }

        @Override // com.google.common.cache.LoadingCache
        public void refresh(K k) {
            this.localCache.m41197F(k);
        }

        @Override // com.google.common.cache.LocalCache.LocalManualCache
        public Object writeReplace() {
            return new LoadingSerializationProxy(this.localCache);
        }
    }

    /* loaded from: classes4.dex */
    public static class LocalManualCache<K, V> implements Cache<K, V>, Serializable {
        private static final long serialVersionUID = 1;
        final LocalCache localCache;

        /* renamed from: com.google.common.cache.LocalCache$LocalManualCache$a */
        /* loaded from: classes4.dex */
        public class C7493a extends CacheLoader {

            /* renamed from: a */
            public final /* synthetic */ Callable f52908a;

            /* renamed from: b */
            public final /* synthetic */ LocalManualCache f52909b;

            public C7493a(LocalManualCache localManualCache, Callable callable) {
                this.f52908a = callable;
                this.f52909b = localManualCache;
            }

            @Override // com.google.common.cache.CacheLoader
            public Object load(Object obj) {
                return this.f52908a.call();
            }
        }

        public /* synthetic */ LocalManualCache(LocalCache localCache, C7497a c7497a) {
            this(localCache);
        }

        private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
            throw new InvalidObjectException("Use ManualSerializationProxy");
        }

        @Override // com.google.common.cache.Cache
        public ConcurrentMap<K, V> asMap() {
            return this.localCache;
        }

        @Override // com.google.common.cache.Cache
        public void cleanUp() {
            this.localCache.m41186a();
        }

        @Override // com.google.common.cache.Cache
        public V get(K k, Callable<? extends V> callable) throws ExecutionException {
            Preconditions.checkNotNull(callable);
            return (V) this.localCache.m41177k(k, new C7493a(this, callable));
        }

        @Override // com.google.common.cache.Cache
        public ImmutableMap<K, V> getAllPresent(Iterable<?> iterable) {
            return this.localCache.m41175m(iterable);
        }

        @Override // com.google.common.cache.Cache
        @CheckForNull
        public V getIfPresent(Object obj) {
            return (V) this.localCache.m41174n(obj);
        }

        @Override // com.google.common.cache.Cache
        public void invalidate(Object obj) {
            Preconditions.checkNotNull(obj);
            this.localCache.remove(obj);
        }

        @Override // com.google.common.cache.Cache
        public void invalidateAll(Iterable<?> iterable) {
            this.localCache.m41170r(iterable);
        }

        @Override // com.google.common.cache.Cache
        public void put(K k, V v) {
            this.localCache.put(k, v);
        }

        @Override // com.google.common.cache.Cache
        public void putAll(Map<? extends K, ? extends V> map) {
            this.localCache.putAll(map);
        }

        @Override // com.google.common.cache.Cache
        public long size() {
            return this.localCache.m41167u();
        }

        @Override // com.google.common.cache.Cache
        public CacheStats stats() {
            AbstractCache.SimpleStatsCounter simpleStatsCounter = new AbstractCache.SimpleStatsCounter();
            simpleStatsCounter.incrementBy(this.localCache.f52893r);
            for (Segment segment : this.localCache.f52878c) {
                simpleStatsCounter.incrementBy(segment.statsCounter);
            }
            return simpleStatsCounter.snapshot();
        }

        public Object writeReplace() {
            return new ManualSerializationProxy(this.localCache);
        }

        public LocalManualCache(CacheBuilder<? super K, ? super V> cacheBuilder) {
            this(new LocalCache(cacheBuilder, null));
        }

        @Override // com.google.common.cache.Cache
        public void invalidateAll() {
            this.localCache.clear();
        }

        private LocalManualCache(LocalCache localCache) {
            this.localCache = localCache;
        }
    }

    /* loaded from: classes4.dex */
    public static class ManualSerializationProxy<K, V> extends ForwardingCache<K, V> implements Serializable {
        private static final long serialVersionUID = 1;
        final int concurrencyLevel;
        @CheckForNull
        transient Cache<K, V> delegate;
        final long expireAfterAccessNanos;
        final long expireAfterWriteNanos;
        final Equivalence<Object> keyEquivalence;
        final Strength keyStrength;
        final CacheLoader<? super K, V> loader;
        final long maxWeight;
        final RemovalListener<? super K, ? super V> removalListener;
        @CheckForNull
        final Ticker ticker;
        final Equivalence<Object> valueEquivalence;
        final Strength valueStrength;
        final Weigher<K, V> weigher;

        public ManualSerializationProxy(LocalCache localCache) {
            this(localCache.f52882g, localCache.f52883h, localCache.f52880e, localCache.f52881f, localCache.f52887l, localCache.f52886k, localCache.f52884i, localCache.f52885j, localCache.f52879d, localCache.f52890o, localCache.f52891p, localCache.f52894s);
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            objectInputStream.defaultReadObject();
            this.delegate = (Cache<K, V>) recreateCacheBuilder().build();
        }

        private Object readResolve() {
            return this.delegate;
        }

        public CacheBuilder<K, V> recreateCacheBuilder() {
            CacheBuilder<K, V> cacheBuilder = (CacheBuilder<K, V>) CacheBuilder.newBuilder().m41217s(this.keyStrength).m41216t(this.valueStrength).m41219q(this.keyEquivalence).m41214v(this.valueEquivalence).concurrencyLevel(this.concurrencyLevel).removalListener((RemovalListener<? super K, ? super V>) this.removalListener);
            cacheBuilder.f52826a = false;
            long j = this.expireAfterWriteNanos;
            if (j > 0) {
                cacheBuilder.expireAfterWrite(j, TimeUnit.NANOSECONDS);
            }
            long j2 = this.expireAfterAccessNanos;
            if (j2 > 0) {
                cacheBuilder.expireAfterAccess(j2, TimeUnit.NANOSECONDS);
            }
            Weigher weigher = this.weigher;
            if (weigher != CacheBuilder.OneWeigher.INSTANCE) {
                cacheBuilder.weigher(weigher);
                long j3 = this.maxWeight;
                if (j3 != -1) {
                    cacheBuilder.maximumWeight(j3);
                }
            } else {
                long j4 = this.maxWeight;
                if (j4 != -1) {
                    cacheBuilder.maximumSize(j4);
                }
            }
            Ticker ticker = this.ticker;
            if (ticker != null) {
                cacheBuilder.ticker(ticker);
            }
            return cacheBuilder;
        }

        private ManualSerializationProxy(Strength strength, Strength strength2, Equivalence<Object> equivalence, Equivalence<Object> equivalence2, long j, long j2, long j3, Weigher<K, V> weigher, int i, RemovalListener<? super K, ? super V> removalListener, Ticker ticker, CacheLoader<? super K, V> cacheLoader) {
            this.keyStrength = strength;
            this.valueStrength = strength2;
            this.keyEquivalence = equivalence;
            this.valueEquivalence = equivalence2;
            this.expireAfterWriteNanos = j;
            this.expireAfterAccessNanos = j2;
            this.maxWeight = j3;
            this.weigher = weigher;
            this.concurrencyLevel = i;
            this.removalListener = removalListener;
            this.ticker = (ticker == Ticker.systemTicker() || ticker == CacheBuilder.f52825t) ? null : null;
            this.loader = cacheLoader;
        }

        @Override // com.google.common.cache.ForwardingCache, com.google.common.collect.ForwardingObject
        public Cache<K, V> delegate() {
            return this.delegate;
        }
    }

    /* loaded from: classes4.dex */
    public enum NullEntry implements InterfaceC7535b {
        INSTANCE;

        @Override // com.google.common.cache.InterfaceC7535b
        public long getAccessTime() {
            return 0L;
        }

        @Override // com.google.common.cache.InterfaceC7535b
        public int getHash() {
            return 0;
        }

        @Override // com.google.common.cache.InterfaceC7535b
        @CheckForNull
        public Object getKey() {
            return null;
        }

        @Override // com.google.common.cache.InterfaceC7535b
        @CheckForNull
        public InterfaceC7535b getNext() {
            return null;
        }

        @Override // com.google.common.cache.InterfaceC7535b
        public InterfaceC7535b getNextInAccessQueue() {
            return this;
        }

        @Override // com.google.common.cache.InterfaceC7535b
        public InterfaceC7535b getNextInWriteQueue() {
            return this;
        }

        @Override // com.google.common.cache.InterfaceC7535b
        public InterfaceC7535b getPreviousInAccessQueue() {
            return this;
        }

        @Override // com.google.common.cache.InterfaceC7535b
        public InterfaceC7535b getPreviousInWriteQueue() {
            return this;
        }

        @Override // com.google.common.cache.InterfaceC7535b
        @CheckForNull
        public InterfaceC7517s getValueReference() {
            return null;
        }

        @Override // com.google.common.cache.InterfaceC7535b
        public long getWriteTime() {
            return 0L;
        }

        @Override // com.google.common.cache.InterfaceC7535b
        public void setAccessTime(long j) {
        }

        @Override // com.google.common.cache.InterfaceC7535b
        public void setNextInAccessQueue(InterfaceC7535b interfaceC7535b) {
        }

        @Override // com.google.common.cache.InterfaceC7535b
        public void setNextInWriteQueue(InterfaceC7535b interfaceC7535b) {
        }

        @Override // com.google.common.cache.InterfaceC7535b
        public void setPreviousInAccessQueue(InterfaceC7535b interfaceC7535b) {
        }

        @Override // com.google.common.cache.InterfaceC7535b
        public void setPreviousInWriteQueue(InterfaceC7535b interfaceC7535b) {
        }

        @Override // com.google.common.cache.InterfaceC7535b
        public void setValueReference(InterfaceC7517s interfaceC7517s) {
        }

        @Override // com.google.common.cache.InterfaceC7535b
        public void setWriteTime(long j) {
        }
    }

    /* loaded from: classes4.dex */
    public enum Strength {
        STRONG { // from class: com.google.common.cache.LocalCache.Strength.1
            @Override // com.google.common.cache.LocalCache.Strength
            public Equivalence<Object> defaultEquivalence() {
                return Equivalence.equals();
            }

            @Override // com.google.common.cache.LocalCache.Strength
            public <K, V> InterfaceC7517s referenceValue(Segment<K, V> segment, InterfaceC7535b interfaceC7535b, V v, int i) {
                if (i == 1) {
                    return new C7514p(v);
                }
                return new C7479A(v, i);
            }
        },
        SOFT { // from class: com.google.common.cache.LocalCache.Strength.2
            @Override // com.google.common.cache.LocalCache.Strength
            public Equivalence<Object> defaultEquivalence() {
                return Equivalence.identity();
            }

            @Override // com.google.common.cache.LocalCache.Strength
            public <K, V> InterfaceC7517s referenceValue(Segment<K, V> segment, InterfaceC7535b interfaceC7535b, V v, int i) {
                if (i == 1) {
                    return new C7510l(segment.valueReferenceQueue, v, interfaceC7535b);
                }
                return new C7524z(segment.valueReferenceQueue, v, interfaceC7535b, i);
            }
        },
        WEAK { // from class: com.google.common.cache.LocalCache.Strength.3
            @Override // com.google.common.cache.LocalCache.Strength
            public Equivalence<Object> defaultEquivalence() {
                return Equivalence.identity();
            }

            @Override // com.google.common.cache.LocalCache.Strength
            public <K, V> InterfaceC7517s referenceValue(Segment<K, V> segment, InterfaceC7535b interfaceC7535b, V v, int i) {
                if (i == 1) {
                    return new C7522x(segment.valueReferenceQueue, v, interfaceC7535b);
                }
                return new C7480B(segment.valueReferenceQueue, v, interfaceC7535b, i);
            }
        };

        public abstract Equivalence<Object> defaultEquivalence();

        public abstract <K, V> InterfaceC7517s referenceValue(Segment<K, V> segment, InterfaceC7535b interfaceC7535b, V v, int i);

        /* synthetic */ Strength(C7497a c7497a) {
            this();
        }
    }

    /* renamed from: com.google.common.cache.LocalCache$a */
    /* loaded from: classes4.dex */
    public class C7497a implements InterfaceC7517s {
        @Override // com.google.common.cache.LocalCache.InterfaceC7517s
        /* renamed from: a */
        public InterfaceC7535b mo41138a() {
            return null;
        }

        @Override // com.google.common.cache.LocalCache.InterfaceC7517s
        /* renamed from: b */
        public void mo41137b(Object obj) {
        }

        @Override // com.google.common.cache.LocalCache.InterfaceC7517s
        /* renamed from: c */
        public Object mo41136c() {
            return null;
        }

        @Override // com.google.common.cache.LocalCache.InterfaceC7517s
        /* renamed from: d */
        public InterfaceC7517s mo41135d(ReferenceQueue referenceQueue, Object obj, InterfaceC7535b interfaceC7535b) {
            return this;
        }

        @Override // com.google.common.cache.LocalCache.InterfaceC7517s
        public Object get() {
            return null;
        }

        @Override // com.google.common.cache.LocalCache.InterfaceC7517s
        public int getWeight() {
            return 0;
        }

        @Override // com.google.common.cache.LocalCache.InterfaceC7517s
        public boolean isActive() {
            return false;
        }

        @Override // com.google.common.cache.LocalCache.InterfaceC7517s
        public boolean isLoading() {
            return false;
        }
    }

    /* renamed from: com.google.common.cache.LocalCache$b */
    /* loaded from: classes4.dex */
    public class C7498b extends AbstractQueue {
        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return ImmutableSet.m40931of().iterator();
        }

        @Override // java.util.Queue
        public boolean offer(Object obj) {
            return true;
        }

        @Override // java.util.Queue
        public Object peek() {
            return null;
        }

        @Override // java.util.Queue
        public Object poll() {
            return null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return 0;
        }
    }

    /* renamed from: com.google.common.cache.LocalCache$c */
    /* loaded from: classes4.dex */
    public abstract class AbstractC7499c extends AbstractSet {
        public AbstractC7499c() {
            LocalCache.this = r1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            LocalCache.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return LocalCache.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return LocalCache.this.size();
        }
    }

    /* renamed from: com.google.common.cache.LocalCache$d */
    /* loaded from: classes4.dex */
    public static abstract class AbstractC7500d implements InterfaceC7535b {
        @Override // com.google.common.cache.InterfaceC7535b
        public long getAccessTime() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.InterfaceC7535b
        public int getHash() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.InterfaceC7535b
        public Object getKey() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.InterfaceC7535b
        public InterfaceC7535b getNext() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.InterfaceC7535b
        public InterfaceC7535b getNextInAccessQueue() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.InterfaceC7535b
        public InterfaceC7535b getNextInWriteQueue() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.InterfaceC7535b
        public InterfaceC7535b getPreviousInAccessQueue() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.InterfaceC7535b
        public InterfaceC7535b getPreviousInWriteQueue() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.InterfaceC7535b
        public InterfaceC7517s getValueReference() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.InterfaceC7535b
        public long getWriteTime() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.InterfaceC7535b
        public void setAccessTime(long j) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.InterfaceC7535b
        public void setNextInAccessQueue(InterfaceC7535b interfaceC7535b) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.InterfaceC7535b
        public void setNextInWriteQueue(InterfaceC7535b interfaceC7535b) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.InterfaceC7535b
        public void setPreviousInAccessQueue(InterfaceC7535b interfaceC7535b) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.InterfaceC7535b
        public void setPreviousInWriteQueue(InterfaceC7535b interfaceC7535b) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.InterfaceC7535b
        public void setValueReference(InterfaceC7517s interfaceC7517s) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.InterfaceC7535b
        public void setWriteTime(long j) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: com.google.common.cache.LocalCache$e */
    /* loaded from: classes4.dex */
    public static final class C7501e extends AbstractQueue {

        /* renamed from: a */
        public final InterfaceC7535b f52911a = new C7502a();

        /* renamed from: com.google.common.cache.LocalCache$e$a */
        /* loaded from: classes4.dex */
        public class C7502a extends AbstractC7500d {

            /* renamed from: a */
            public InterfaceC7535b f52912a = this;

            /* renamed from: b */
            public InterfaceC7535b f52913b = this;

            public C7502a() {
                C7501e.this = r1;
            }

            @Override // com.google.common.cache.LocalCache.AbstractC7500d, com.google.common.cache.InterfaceC7535b
            public long getAccessTime() {
                return Long.MAX_VALUE;
            }

            @Override // com.google.common.cache.LocalCache.AbstractC7500d, com.google.common.cache.InterfaceC7535b
            public InterfaceC7535b getNextInAccessQueue() {
                return this.f52912a;
            }

            @Override // com.google.common.cache.LocalCache.AbstractC7500d, com.google.common.cache.InterfaceC7535b
            public InterfaceC7535b getPreviousInAccessQueue() {
                return this.f52913b;
            }

            @Override // com.google.common.cache.LocalCache.AbstractC7500d, com.google.common.cache.InterfaceC7535b
            public void setAccessTime(long j) {
            }

            @Override // com.google.common.cache.LocalCache.AbstractC7500d, com.google.common.cache.InterfaceC7535b
            public void setNextInAccessQueue(InterfaceC7535b interfaceC7535b) {
                this.f52912a = interfaceC7535b;
            }

            @Override // com.google.common.cache.LocalCache.AbstractC7500d, com.google.common.cache.InterfaceC7535b
            public void setPreviousInAccessQueue(InterfaceC7535b interfaceC7535b) {
                this.f52913b = interfaceC7535b;
            }
        }

        /* renamed from: com.google.common.cache.LocalCache$e$b */
        /* loaded from: classes4.dex */
        public class C7503b extends AbstractSequentialIterator {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7503b(InterfaceC7535b interfaceC7535b) {
                super(interfaceC7535b);
                C7501e.this = r1;
            }

            @Override // com.google.common.collect.AbstractSequentialIterator
            /* renamed from: a */
            public InterfaceC7535b computeNext(InterfaceC7535b interfaceC7535b) {
                InterfaceC7535b nextInAccessQueue = interfaceC7535b.getNextInAccessQueue();
                if (nextInAccessQueue == C7501e.this.f52911a) {
                    return null;
                }
                return nextInAccessQueue;
            }
        }

        @Override // java.util.Queue
        /* renamed from: a */
        public boolean offer(InterfaceC7535b interfaceC7535b) {
            LocalCache.m41185b(interfaceC7535b.getPreviousInAccessQueue(), interfaceC7535b.getNextInAccessQueue());
            LocalCache.m41185b(this.f52911a.getPreviousInAccessQueue(), interfaceC7535b);
            LocalCache.m41185b(interfaceC7535b, this.f52911a);
            return true;
        }

        @Override // java.util.Queue
        /* renamed from: b */
        public InterfaceC7535b peek() {
            InterfaceC7535b nextInAccessQueue = this.f52911a.getNextInAccessQueue();
            if (nextInAccessQueue == this.f52911a) {
                return null;
            }
            return nextInAccessQueue;
        }

        @Override // java.util.Queue
        /* renamed from: c */
        public InterfaceC7535b poll() {
            InterfaceC7535b nextInAccessQueue = this.f52911a.getNextInAccessQueue();
            if (nextInAccessQueue == this.f52911a) {
                return null;
            }
            remove(nextInAccessQueue);
            return nextInAccessQueue;
        }

        @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
        public void clear() {
            InterfaceC7535b nextInAccessQueue = this.f52911a.getNextInAccessQueue();
            while (true) {
                InterfaceC7535b interfaceC7535b = this.f52911a;
                if (nextInAccessQueue != interfaceC7535b) {
                    InterfaceC7535b nextInAccessQueue2 = nextInAccessQueue.getNextInAccessQueue();
                    LocalCache.m41164x(nextInAccessQueue);
                    nextInAccessQueue = nextInAccessQueue2;
                } else {
                    interfaceC7535b.setNextInAccessQueue(interfaceC7535b);
                    InterfaceC7535b interfaceC7535b2 = this.f52911a;
                    interfaceC7535b2.setPreviousInAccessQueue(interfaceC7535b2);
                    return;
                }
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (((InterfaceC7535b) obj).getNextInAccessQueue() != NullEntry.INSTANCE) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            if (this.f52911a.getNextInAccessQueue() == this.f52911a) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return new C7503b(peek());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            InterfaceC7535b interfaceC7535b = (InterfaceC7535b) obj;
            InterfaceC7535b previousInAccessQueue = interfaceC7535b.getPreviousInAccessQueue();
            InterfaceC7535b nextInAccessQueue = interfaceC7535b.getNextInAccessQueue();
            LocalCache.m41185b(previousInAccessQueue, nextInAccessQueue);
            LocalCache.m41164x(interfaceC7535b);
            if (nextInAccessQueue != NullEntry.INSTANCE) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            int i = 0;
            for (InterfaceC7535b nextInAccessQueue = this.f52911a.getNextInAccessQueue(); nextInAccessQueue != this.f52911a; nextInAccessQueue = nextInAccessQueue.getNextInAccessQueue()) {
                i++;
            }
            return i;
        }
    }

    /* renamed from: com.google.common.cache.LocalCache$f */
    /* loaded from: classes4.dex */
    public final class C7504f extends AbstractC7506h {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7504f() {
            super();
            LocalCache.this = r1;
        }

        @Override // java.util.Iterator
        /* renamed from: f */
        public Map.Entry next() {
            return m41149c();
        }
    }

    /* renamed from: com.google.common.cache.LocalCache$g */
    /* loaded from: classes4.dex */
    public final class C7505g extends AbstractC7499c {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7505g() {
            super();
            LocalCache.this = r1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry;
            Object key;
            Object obj2;
            if (!(obj instanceof Map.Entry) || (key = (entry = (Map.Entry) obj).getKey()) == null || (obj2 = LocalCache.this.get(key)) == null || !LocalCache.this.f52881f.equivalent(entry.getValue(), obj2)) {
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new C7504f();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry;
            Object key;
            if (!(obj instanceof Map.Entry) || (key = (entry = (Map.Entry) obj).getKey()) == null || !LocalCache.this.remove(key, entry.getValue())) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: com.google.common.cache.LocalCache$h */
    /* loaded from: classes4.dex */
    public abstract class AbstractC7506h implements Iterator {

        /* renamed from: a */
        public int f52918a;

        /* renamed from: b */
        public int f52919b = -1;

        /* renamed from: c */
        public Segment f52920c;

        /* renamed from: d */
        public AtomicReferenceArray f52921d;

        /* renamed from: e */
        public InterfaceC7535b f52922e;

        /* renamed from: f */
        public C7484D f52923f;

        /* renamed from: g */
        public C7484D f52924g;

        public AbstractC7506h() {
            LocalCache.this = r1;
            this.f52918a = r1.f52878c.length - 1;
            m41151a();
        }

        /* renamed from: a */
        public final void m41151a() {
            this.f52923f = null;
            if (m41148d() || m41147e()) {
                return;
            }
            while (true) {
                int i = this.f52918a;
                if (i >= 0) {
                    Segment[] segmentArr = LocalCache.this.f52878c;
                    this.f52918a = i - 1;
                    Segment segment = segmentArr[i];
                    this.f52920c = segment;
                    if (segment.count != 0) {
                        AtomicReferenceArray<InterfaceC7535b> atomicReferenceArray = this.f52920c.table;
                        this.f52921d = atomicReferenceArray;
                        this.f52919b = atomicReferenceArray.length() - 1;
                        if (m41147e()) {
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
        }

        /* renamed from: b */
        public boolean m41150b(InterfaceC7535b interfaceC7535b) {
            try {
                long read = LocalCache.this.f52891p.read();
                Object key = interfaceC7535b.getKey();
                Object m41173o = LocalCache.this.m41173o(interfaceC7535b, read);
                if (m41173o != null) {
                    this.f52923f = new C7484D(key, m41173o);
                    this.f52920c.postReadCleanup();
                    return true;
                }
                this.f52920c.postReadCleanup();
                return false;
            } catch (Throwable th2) {
                this.f52920c.postReadCleanup();
                throw th2;
            }
        }

        /* renamed from: c */
        public C7484D m41149c() {
            C7484D c7484d = this.f52923f;
            if (c7484d != null) {
                this.f52924g = c7484d;
                m41151a();
                return this.f52924g;
            }
            throw new NoSuchElementException();
        }

        /* renamed from: d */
        public boolean m41148d() {
            InterfaceC7535b interfaceC7535b = this.f52922e;
            if (interfaceC7535b == null) {
                return false;
            }
            while (true) {
                this.f52922e = interfaceC7535b.getNext();
                InterfaceC7535b interfaceC7535b2 = this.f52922e;
                if (interfaceC7535b2 != null) {
                    if (m41150b(interfaceC7535b2)) {
                        return true;
                    }
                    interfaceC7535b = this.f52922e;
                } else {
                    return false;
                }
            }
        }

        /* renamed from: e */
        public boolean m41147e() {
            while (true) {
                int i = this.f52919b;
                if (i >= 0) {
                    AtomicReferenceArray atomicReferenceArray = this.f52921d;
                    this.f52919b = i - 1;
                    InterfaceC7535b interfaceC7535b = (InterfaceC7535b) atomicReferenceArray.get(i);
                    this.f52922e = interfaceC7535b;
                    if (interfaceC7535b != null && (m41150b(interfaceC7535b) || m41148d())) {
                        return true;
                    }
                } else {
                    return false;
                }
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f52923f != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            boolean z;
            if (this.f52924g != null) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkState(z);
            LocalCache.this.remove(this.f52924g.getKey());
            this.f52924g = null;
        }
    }

    /* renamed from: com.google.common.cache.LocalCache$i */
    /* loaded from: classes4.dex */
    public final class C7507i extends AbstractC7506h {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7507i() {
            super();
            LocalCache.this = r1;
        }

        @Override // java.util.Iterator
        public Object next() {
            return m41149c().getKey();
        }
    }

    /* renamed from: com.google.common.cache.LocalCache$j */
    /* loaded from: classes4.dex */
    public final class C7508j extends AbstractC7499c {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7508j() {
            super();
            LocalCache.this = r1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return LocalCache.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new C7507i();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (LocalCache.this.remove(obj) != null) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.google.common.cache.LocalCache$k */
    /* loaded from: classes4.dex */
    public static class C7509k implements InterfaceC7517s {

        /* renamed from: a */
        public volatile InterfaceC7517s f52928a;

        /* renamed from: b */
        public final SettableFuture f52929b;

        /* renamed from: c */
        public final Stopwatch f52930c;

        public C7509k() {
            this(LocalCache.m41193J());
        }

        /* renamed from: e */
        public static /* synthetic */ Object m41146e(C7509k c7509k, Object obj) {
            return c7509k.m41142i(obj);
        }

        @Override // com.google.common.cache.LocalCache.InterfaceC7517s
        /* renamed from: a */
        public InterfaceC7535b mo41138a() {
            return null;
        }

        @Override // com.google.common.cache.LocalCache.InterfaceC7517s
        /* renamed from: b */
        public void mo41137b(Object obj) {
            if (obj != null) {
                m41140k(obj);
            } else {
                this.f52928a = LocalCache.m41193J();
            }
        }

        @Override // com.google.common.cache.LocalCache.InterfaceC7517s
        /* renamed from: c */
        public Object mo41136c() {
            return Uninterruptibles.getUninterruptibly(this.f52929b);
        }

        @Override // com.google.common.cache.LocalCache.InterfaceC7517s
        /* renamed from: d */
        public InterfaceC7517s mo41135d(ReferenceQueue referenceQueue, Object obj, InterfaceC7535b interfaceC7535b) {
            return this;
        }

        /* renamed from: f */
        public long m41145f() {
            return this.f52930c.elapsed(TimeUnit.NANOSECONDS);
        }

        /* renamed from: g */
        public final ListenableFuture m41144g(Throwable th2) {
            return Futures.immediateFailedFuture(th2);
        }

        @Override // com.google.common.cache.LocalCache.InterfaceC7517s
        public Object get() {
            return this.f52928a.get();
        }

        @Override // com.google.common.cache.LocalCache.InterfaceC7517s
        public int getWeight() {
            return this.f52928a.getWeight();
        }

        /* renamed from: h */
        public InterfaceC7517s m41143h() {
            return this.f52928a;
        }

        /* renamed from: i */
        public final /* synthetic */ Object m41142i(Object obj) {
            m41140k(obj);
            return obj;
        }

        @Override // com.google.common.cache.LocalCache.InterfaceC7517s
        public boolean isActive() {
            return this.f52928a.isActive();
        }

        @Override // com.google.common.cache.LocalCache.InterfaceC7517s
        public boolean isLoading() {
            return true;
        }

        /* renamed from: j */
        public ListenableFuture m41141j(Object obj, CacheLoader cacheLoader) {
            ListenableFuture m41144g;
            try {
                this.f52930c.start();
                Object obj2 = this.f52928a.get();
                if (obj2 == null) {
                    Object load = cacheLoader.load(obj);
                    if (m41140k(load)) {
                        return this.f52929b;
                    }
                    return Futures.immediateFuture(load);
                }
                ListenableFuture reload = cacheLoader.reload(obj, obj2);
                if (reload == null) {
                    return Futures.immediateFuture(null);
                }
                return Futures.transform(reload, new Function() { // from class: Gj0
                    {
                        LocalCache.C7509k.this = this;
                    }

                    @Override // com.google.common.base.Function
                    public final Object apply(Object obj3) {
                        return LocalCache.C7509k.m41146e(LocalCache.C7509k.this, obj3);
                    }
                }, MoreExecutors.directExecutor());
            } catch (Throwable th2) {
                if (m41139l(th2)) {
                    m41144g = this.f52929b;
                } else {
                    m41144g = m41144g(th2);
                }
                if (th2 instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                return m41144g;
            }
        }

        /* renamed from: k */
        public boolean m41140k(Object obj) {
            return this.f52929b.set(obj);
        }

        /* renamed from: l */
        public boolean m41139l(Throwable th2) {
            return this.f52929b.setException(th2);
        }

        public C7509k(InterfaceC7517s interfaceC7517s) {
            this.f52929b = SettableFuture.create();
            this.f52930c = Stopwatch.createUnstarted();
            this.f52928a = interfaceC7517s;
        }
    }

    /* renamed from: com.google.common.cache.LocalCache$l */
    /* loaded from: classes4.dex */
    public static class C7510l extends SoftReference implements InterfaceC7517s {

        /* renamed from: a */
        public final InterfaceC7535b f52931a;

        public C7510l(ReferenceQueue referenceQueue, Object obj, InterfaceC7535b interfaceC7535b) {
            super(obj, referenceQueue);
            this.f52931a = interfaceC7535b;
        }

        @Override // com.google.common.cache.LocalCache.InterfaceC7517s
        /* renamed from: a */
        public InterfaceC7535b mo41138a() {
            return this.f52931a;
        }

        @Override // com.google.common.cache.LocalCache.InterfaceC7517s
        /* renamed from: b */
        public void mo41137b(Object obj) {
        }

        @Override // com.google.common.cache.LocalCache.InterfaceC7517s
        /* renamed from: c */
        public Object mo41136c() {
            return get();
        }

        @Override // com.google.common.cache.LocalCache.InterfaceC7517s
        /* renamed from: d */
        public InterfaceC7517s mo41135d(ReferenceQueue referenceQueue, Object obj, InterfaceC7535b interfaceC7535b) {
            return new C7510l(referenceQueue, obj, interfaceC7535b);
        }

        @Override // com.google.common.cache.LocalCache.InterfaceC7517s
        public int getWeight() {
            return 1;
        }

        @Override // com.google.common.cache.LocalCache.InterfaceC7517s
        public boolean isActive() {
            return true;
        }

        @Override // com.google.common.cache.LocalCache.InterfaceC7517s
        public boolean isLoading() {
            return false;
        }
    }

    /* renamed from: com.google.common.cache.LocalCache$m */
    /* loaded from: classes4.dex */
    public static final class C7511m extends C7513o {

        /* renamed from: e */
        public volatile long f52932e;

        /* renamed from: f */
        public InterfaceC7535b f52933f;

        /* renamed from: g */
        public InterfaceC7535b f52934g;

        public C7511m(Object obj, int i, InterfaceC7535b interfaceC7535b) {
            super(obj, i, interfaceC7535b);
            this.f52932e = Long.MAX_VALUE;
            this.f52933f = LocalCache.m41165w();
            this.f52934g = LocalCache.m41165w();
        }

        @Override // com.google.common.cache.LocalCache.AbstractC7500d, com.google.common.cache.InterfaceC7535b
        public long getAccessTime() {
            return this.f52932e;
        }

        @Override // com.google.common.cache.LocalCache.AbstractC7500d, com.google.common.cache.InterfaceC7535b
        public InterfaceC7535b getNextInAccessQueue() {
            return this.f52933f;
        }

        @Override // com.google.common.cache.LocalCache.AbstractC7500d, com.google.common.cache.InterfaceC7535b
        public InterfaceC7535b getPreviousInAccessQueue() {
            return this.f52934g;
        }

        @Override // com.google.common.cache.LocalCache.AbstractC7500d, com.google.common.cache.InterfaceC7535b
        public void setAccessTime(long j) {
            this.f52932e = j;
        }

        @Override // com.google.common.cache.LocalCache.AbstractC7500d, com.google.common.cache.InterfaceC7535b
        public void setNextInAccessQueue(InterfaceC7535b interfaceC7535b) {
            this.f52933f = interfaceC7535b;
        }

        @Override // com.google.common.cache.LocalCache.AbstractC7500d, com.google.common.cache.InterfaceC7535b
        public void setPreviousInAccessQueue(InterfaceC7535b interfaceC7535b) {
            this.f52934g = interfaceC7535b;
        }
    }

    /* renamed from: com.google.common.cache.LocalCache$n */
    /* loaded from: classes4.dex */
    public static final class C7512n extends C7513o {

        /* renamed from: e */
        public volatile long f52935e;

        /* renamed from: f */
        public InterfaceC7535b f52936f;

        /* renamed from: g */
        public InterfaceC7535b f52937g;

        /* renamed from: h */
        public volatile long f52938h;

        /* renamed from: i */
        public InterfaceC7535b f52939i;

        /* renamed from: j */
        public InterfaceC7535b f52940j;

        public C7512n(Object obj, int i, InterfaceC7535b interfaceC7535b) {
            super(obj, i, interfaceC7535b);
            this.f52935e = Long.MAX_VALUE;
            this.f52936f = LocalCache.m41165w();
            this.f52937g = LocalCache.m41165w();
            this.f52938h = Long.MAX_VALUE;
            this.f52939i = LocalCache.m41165w();
            this.f52940j = LocalCache.m41165w();
        }

        @Override // com.google.common.cache.LocalCache.AbstractC7500d, com.google.common.cache.InterfaceC7535b
        public long getAccessTime() {
            return this.f52935e;
        }

        @Override // com.google.common.cache.LocalCache.AbstractC7500d, com.google.common.cache.InterfaceC7535b
        public InterfaceC7535b getNextInAccessQueue() {
            return this.f52936f;
        }

        @Override // com.google.common.cache.LocalCache.AbstractC7500d, com.google.common.cache.InterfaceC7535b
        public InterfaceC7535b getNextInWriteQueue() {
            return this.f52939i;
        }

        @Override // com.google.common.cache.LocalCache.AbstractC7500d, com.google.common.cache.InterfaceC7535b
        public InterfaceC7535b getPreviousInAccessQueue() {
            return this.f52937g;
        }

        @Override // com.google.common.cache.LocalCache.AbstractC7500d, com.google.common.cache.InterfaceC7535b
        public InterfaceC7535b getPreviousInWriteQueue() {
            return this.f52940j;
        }

        @Override // com.google.common.cache.LocalCache.AbstractC7500d, com.google.common.cache.InterfaceC7535b
        public long getWriteTime() {
            return this.f52938h;
        }

        @Override // com.google.common.cache.LocalCache.AbstractC7500d, com.google.common.cache.InterfaceC7535b
        public void setAccessTime(long j) {
            this.f52935e = j;
        }

        @Override // com.google.common.cache.LocalCache.AbstractC7500d, com.google.common.cache.InterfaceC7535b
        public void setNextInAccessQueue(InterfaceC7535b interfaceC7535b) {
            this.f52936f = interfaceC7535b;
        }

        @Override // com.google.common.cache.LocalCache.AbstractC7500d, com.google.common.cache.InterfaceC7535b
        public void setNextInWriteQueue(InterfaceC7535b interfaceC7535b) {
            this.f52939i = interfaceC7535b;
        }

        @Override // com.google.common.cache.LocalCache.AbstractC7500d, com.google.common.cache.InterfaceC7535b
        public void setPreviousInAccessQueue(InterfaceC7535b interfaceC7535b) {
            this.f52937g = interfaceC7535b;
        }

        @Override // com.google.common.cache.LocalCache.AbstractC7500d, com.google.common.cache.InterfaceC7535b
        public void setPreviousInWriteQueue(InterfaceC7535b interfaceC7535b) {
            this.f52940j = interfaceC7535b;
        }

        @Override // com.google.common.cache.LocalCache.AbstractC7500d, com.google.common.cache.InterfaceC7535b
        public void setWriteTime(long j) {
            this.f52938h = j;
        }
    }

    /* renamed from: com.google.common.cache.LocalCache$o */
    /* loaded from: classes4.dex */
    public static class C7513o extends AbstractC7500d {

        /* renamed from: a */
        public final Object f52941a;

        /* renamed from: b */
        public final int f52942b;

        /* renamed from: c */
        public final InterfaceC7535b f52943c;

        /* renamed from: d */
        public volatile InterfaceC7517s f52944d = LocalCache.m41193J();

        public C7513o(Object obj, int i, InterfaceC7535b interfaceC7535b) {
            this.f52941a = obj;
            this.f52942b = i;
            this.f52943c = interfaceC7535b;
        }

        @Override // com.google.common.cache.LocalCache.AbstractC7500d, com.google.common.cache.InterfaceC7535b
        public int getHash() {
            return this.f52942b;
        }

        @Override // com.google.common.cache.LocalCache.AbstractC7500d, com.google.common.cache.InterfaceC7535b
        public Object getKey() {
            return this.f52941a;
        }

        @Override // com.google.common.cache.LocalCache.AbstractC7500d, com.google.common.cache.InterfaceC7535b
        public InterfaceC7535b getNext() {
            return this.f52943c;
        }

        @Override // com.google.common.cache.LocalCache.AbstractC7500d, com.google.common.cache.InterfaceC7535b
        public InterfaceC7517s getValueReference() {
            return this.f52944d;
        }

        @Override // com.google.common.cache.LocalCache.AbstractC7500d, com.google.common.cache.InterfaceC7535b
        public void setValueReference(InterfaceC7517s interfaceC7517s) {
            this.f52944d = interfaceC7517s;
        }
    }

    /* renamed from: com.google.common.cache.LocalCache$p */
    /* loaded from: classes4.dex */
    public static class C7514p implements InterfaceC7517s {

        /* renamed from: a */
        public final Object f52945a;

        public C7514p(Object obj) {
            this.f52945a = obj;
        }

        @Override // com.google.common.cache.LocalCache.InterfaceC7517s
        /* renamed from: a */
        public InterfaceC7535b mo41138a() {
            return null;
        }

        @Override // com.google.common.cache.LocalCache.InterfaceC7517s
        /* renamed from: b */
        public void mo41137b(Object obj) {
        }

        @Override // com.google.common.cache.LocalCache.InterfaceC7517s
        /* renamed from: c */
        public Object mo41136c() {
            return get();
        }

        @Override // com.google.common.cache.LocalCache.InterfaceC7517s
        /* renamed from: d */
        public InterfaceC7517s mo41135d(ReferenceQueue referenceQueue, Object obj, InterfaceC7535b interfaceC7535b) {
            return this;
        }

        @Override // com.google.common.cache.LocalCache.InterfaceC7517s
        public Object get() {
            return this.f52945a;
        }

        @Override // com.google.common.cache.LocalCache.InterfaceC7517s
        public int getWeight() {
            return 1;
        }

        @Override // com.google.common.cache.LocalCache.InterfaceC7517s
        public boolean isActive() {
            return true;
        }

        @Override // com.google.common.cache.LocalCache.InterfaceC7517s
        public boolean isLoading() {
            return false;
        }
    }

    /* renamed from: com.google.common.cache.LocalCache$q */
    /* loaded from: classes4.dex */
    public static final class C7515q extends C7513o {

        /* renamed from: e */
        public volatile long f52946e;

        /* renamed from: f */
        public InterfaceC7535b f52947f;

        /* renamed from: g */
        public InterfaceC7535b f52948g;

        public C7515q(Object obj, int i, InterfaceC7535b interfaceC7535b) {
            super(obj, i, interfaceC7535b);
            this.f52946e = Long.MAX_VALUE;
            this.f52947f = LocalCache.m41165w();
            this.f52948g = LocalCache.m41165w();
        }

        @Override // com.google.common.cache.LocalCache.AbstractC7500d, com.google.common.cache.InterfaceC7535b
        public InterfaceC7535b getNextInWriteQueue() {
            return this.f52947f;
        }

        @Override // com.google.common.cache.LocalCache.AbstractC7500d, com.google.common.cache.InterfaceC7535b
        public InterfaceC7535b getPreviousInWriteQueue() {
            return this.f52948g;
        }

        @Override // com.google.common.cache.LocalCache.AbstractC7500d, com.google.common.cache.InterfaceC7535b
        public long getWriteTime() {
            return this.f52946e;
        }

        @Override // com.google.common.cache.LocalCache.AbstractC7500d, com.google.common.cache.InterfaceC7535b
        public void setNextInWriteQueue(InterfaceC7535b interfaceC7535b) {
            this.f52947f = interfaceC7535b;
        }

        @Override // com.google.common.cache.LocalCache.AbstractC7500d, com.google.common.cache.InterfaceC7535b
        public void setPreviousInWriteQueue(InterfaceC7535b interfaceC7535b) {
            this.f52948g = interfaceC7535b;
        }

        @Override // com.google.common.cache.LocalCache.AbstractC7500d, com.google.common.cache.InterfaceC7535b
        public void setWriteTime(long j) {
            this.f52946e = j;
        }
    }

    /* renamed from: com.google.common.cache.LocalCache$r */
    /* loaded from: classes4.dex */
    public final class C7516r extends AbstractC7506h {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7516r() {
            super();
            LocalCache.this = r1;
        }

        @Override // java.util.Iterator
        public Object next() {
            return m41149c().getValue();
        }
    }

    /* renamed from: com.google.common.cache.LocalCache$s */
    /* loaded from: classes4.dex */
    public interface InterfaceC7517s {
        /* renamed from: a */
        InterfaceC7535b mo41138a();

        /* renamed from: b */
        void mo41137b(Object obj);

        /* renamed from: c */
        Object mo41136c();

        /* renamed from: d */
        InterfaceC7517s mo41135d(ReferenceQueue referenceQueue, Object obj, InterfaceC7535b interfaceC7535b);

        Object get();

        int getWeight();

        boolean isActive();

        boolean isLoading();
    }

    /* renamed from: com.google.common.cache.LocalCache$t */
    /* loaded from: classes4.dex */
    public final class C7518t extends AbstractCollection {
        public C7518t() {
            LocalCache.this = r1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            LocalCache.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return LocalCache.this.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return LocalCache.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return new C7516r();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return LocalCache.this.size();
        }
    }

    /* renamed from: com.google.common.cache.LocalCache$u */
    /* loaded from: classes4.dex */
    public static final class C7519u extends C7521w {

        /* renamed from: d */
        public volatile long f52951d;

        /* renamed from: e */
        public InterfaceC7535b f52952e;

        /* renamed from: f */
        public InterfaceC7535b f52953f;

        public C7519u(ReferenceQueue referenceQueue, Object obj, int i, InterfaceC7535b interfaceC7535b) {
            super(referenceQueue, obj, i, interfaceC7535b);
            this.f52951d = Long.MAX_VALUE;
            this.f52952e = LocalCache.m41165w();
            this.f52953f = LocalCache.m41165w();
        }

        @Override // com.google.common.cache.LocalCache.C7521w, com.google.common.cache.InterfaceC7535b
        public long getAccessTime() {
            return this.f52951d;
        }

        @Override // com.google.common.cache.LocalCache.C7521w, com.google.common.cache.InterfaceC7535b
        public InterfaceC7535b getNextInAccessQueue() {
            return this.f52952e;
        }

        @Override // com.google.common.cache.LocalCache.C7521w, com.google.common.cache.InterfaceC7535b
        public InterfaceC7535b getPreviousInAccessQueue() {
            return this.f52953f;
        }

        @Override // com.google.common.cache.LocalCache.C7521w, com.google.common.cache.InterfaceC7535b
        public void setAccessTime(long j) {
            this.f52951d = j;
        }

        @Override // com.google.common.cache.LocalCache.C7521w, com.google.common.cache.InterfaceC7535b
        public void setNextInAccessQueue(InterfaceC7535b interfaceC7535b) {
            this.f52952e = interfaceC7535b;
        }

        @Override // com.google.common.cache.LocalCache.C7521w, com.google.common.cache.InterfaceC7535b
        public void setPreviousInAccessQueue(InterfaceC7535b interfaceC7535b) {
            this.f52953f = interfaceC7535b;
        }
    }

    /* renamed from: com.google.common.cache.LocalCache$v */
    /* loaded from: classes4.dex */
    public static final class C7520v extends C7521w {

        /* renamed from: d */
        public volatile long f52954d;

        /* renamed from: e */
        public InterfaceC7535b f52955e;

        /* renamed from: f */
        public InterfaceC7535b f52956f;

        /* renamed from: g */
        public volatile long f52957g;

        /* renamed from: h */
        public InterfaceC7535b f52958h;

        /* renamed from: i */
        public InterfaceC7535b f52959i;

        public C7520v(ReferenceQueue referenceQueue, Object obj, int i, InterfaceC7535b interfaceC7535b) {
            super(referenceQueue, obj, i, interfaceC7535b);
            this.f52954d = Long.MAX_VALUE;
            this.f52955e = LocalCache.m41165w();
            this.f52956f = LocalCache.m41165w();
            this.f52957g = Long.MAX_VALUE;
            this.f52958h = LocalCache.m41165w();
            this.f52959i = LocalCache.m41165w();
        }

        @Override // com.google.common.cache.LocalCache.C7521w, com.google.common.cache.InterfaceC7535b
        public long getAccessTime() {
            return this.f52954d;
        }

        @Override // com.google.common.cache.LocalCache.C7521w, com.google.common.cache.InterfaceC7535b
        public InterfaceC7535b getNextInAccessQueue() {
            return this.f52955e;
        }

        @Override // com.google.common.cache.LocalCache.C7521w, com.google.common.cache.InterfaceC7535b
        public InterfaceC7535b getNextInWriteQueue() {
            return this.f52958h;
        }

        @Override // com.google.common.cache.LocalCache.C7521w, com.google.common.cache.InterfaceC7535b
        public InterfaceC7535b getPreviousInAccessQueue() {
            return this.f52956f;
        }

        @Override // com.google.common.cache.LocalCache.C7521w, com.google.common.cache.InterfaceC7535b
        public InterfaceC7535b getPreviousInWriteQueue() {
            return this.f52959i;
        }

        @Override // com.google.common.cache.LocalCache.C7521w, com.google.common.cache.InterfaceC7535b
        public long getWriteTime() {
            return this.f52957g;
        }

        @Override // com.google.common.cache.LocalCache.C7521w, com.google.common.cache.InterfaceC7535b
        public void setAccessTime(long j) {
            this.f52954d = j;
        }

        @Override // com.google.common.cache.LocalCache.C7521w, com.google.common.cache.InterfaceC7535b
        public void setNextInAccessQueue(InterfaceC7535b interfaceC7535b) {
            this.f52955e = interfaceC7535b;
        }

        @Override // com.google.common.cache.LocalCache.C7521w, com.google.common.cache.InterfaceC7535b
        public void setNextInWriteQueue(InterfaceC7535b interfaceC7535b) {
            this.f52958h = interfaceC7535b;
        }

        @Override // com.google.common.cache.LocalCache.C7521w, com.google.common.cache.InterfaceC7535b
        public void setPreviousInAccessQueue(InterfaceC7535b interfaceC7535b) {
            this.f52956f = interfaceC7535b;
        }

        @Override // com.google.common.cache.LocalCache.C7521w, com.google.common.cache.InterfaceC7535b
        public void setPreviousInWriteQueue(InterfaceC7535b interfaceC7535b) {
            this.f52959i = interfaceC7535b;
        }

        @Override // com.google.common.cache.LocalCache.C7521w, com.google.common.cache.InterfaceC7535b
        public void setWriteTime(long j) {
            this.f52957g = j;
        }
    }

    /* renamed from: com.google.common.cache.LocalCache$w */
    /* loaded from: classes4.dex */
    public static class C7521w extends WeakReference implements InterfaceC7535b {

        /* renamed from: a */
        public final int f52960a;

        /* renamed from: b */
        public final InterfaceC7535b f52961b;

        /* renamed from: c */
        public volatile InterfaceC7517s f52962c;

        public C7521w(ReferenceQueue referenceQueue, Object obj, int i, InterfaceC7535b interfaceC7535b) {
            super(obj, referenceQueue);
            this.f52962c = LocalCache.m41193J();
            this.f52960a = i;
            this.f52961b = interfaceC7535b;
        }

        public long getAccessTime() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.InterfaceC7535b
        public int getHash() {
            return this.f52960a;
        }

        @Override // com.google.common.cache.InterfaceC7535b
        public Object getKey() {
            return get();
        }

        @Override // com.google.common.cache.InterfaceC7535b
        public InterfaceC7535b getNext() {
            return this.f52961b;
        }

        public InterfaceC7535b getNextInAccessQueue() {
            throw new UnsupportedOperationException();
        }

        public InterfaceC7535b getNextInWriteQueue() {
            throw new UnsupportedOperationException();
        }

        public InterfaceC7535b getPreviousInAccessQueue() {
            throw new UnsupportedOperationException();
        }

        public InterfaceC7535b getPreviousInWriteQueue() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.InterfaceC7535b
        public InterfaceC7517s getValueReference() {
            return this.f52962c;
        }

        public long getWriteTime() {
            throw new UnsupportedOperationException();
        }

        public void setAccessTime(long j) {
            throw new UnsupportedOperationException();
        }

        public void setNextInAccessQueue(InterfaceC7535b interfaceC7535b) {
            throw new UnsupportedOperationException();
        }

        public void setNextInWriteQueue(InterfaceC7535b interfaceC7535b) {
            throw new UnsupportedOperationException();
        }

        public void setPreviousInAccessQueue(InterfaceC7535b interfaceC7535b) {
            throw new UnsupportedOperationException();
        }

        public void setPreviousInWriteQueue(InterfaceC7535b interfaceC7535b) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.InterfaceC7535b
        public void setValueReference(InterfaceC7517s interfaceC7517s) {
            this.f52962c = interfaceC7517s;
        }

        public void setWriteTime(long j) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: com.google.common.cache.LocalCache$x */
    /* loaded from: classes4.dex */
    public static class C7522x extends WeakReference implements InterfaceC7517s {

        /* renamed from: a */
        public final InterfaceC7535b f52963a;

        public C7522x(ReferenceQueue referenceQueue, Object obj, InterfaceC7535b interfaceC7535b) {
            super(obj, referenceQueue);
            this.f52963a = interfaceC7535b;
        }

        @Override // com.google.common.cache.LocalCache.InterfaceC7517s
        /* renamed from: a */
        public InterfaceC7535b mo41138a() {
            return this.f52963a;
        }

        @Override // com.google.common.cache.LocalCache.InterfaceC7517s
        /* renamed from: b */
        public void mo41137b(Object obj) {
        }

        @Override // com.google.common.cache.LocalCache.InterfaceC7517s
        /* renamed from: c */
        public Object mo41136c() {
            return get();
        }

        /* renamed from: d */
        public InterfaceC7517s mo41135d(ReferenceQueue referenceQueue, Object obj, InterfaceC7535b interfaceC7535b) {
            return new C7522x(referenceQueue, obj, interfaceC7535b);
        }

        public int getWeight() {
            return 1;
        }

        @Override // com.google.common.cache.LocalCache.InterfaceC7517s
        public boolean isActive() {
            return true;
        }

        @Override // com.google.common.cache.LocalCache.InterfaceC7517s
        public boolean isLoading() {
            return false;
        }
    }

    /* renamed from: com.google.common.cache.LocalCache$y */
    /* loaded from: classes4.dex */
    public static final class C7523y extends C7521w {

        /* renamed from: d */
        public volatile long f52964d;

        /* renamed from: e */
        public InterfaceC7535b f52965e;

        /* renamed from: f */
        public InterfaceC7535b f52966f;

        public C7523y(ReferenceQueue referenceQueue, Object obj, int i, InterfaceC7535b interfaceC7535b) {
            super(referenceQueue, obj, i, interfaceC7535b);
            this.f52964d = Long.MAX_VALUE;
            this.f52965e = LocalCache.m41165w();
            this.f52966f = LocalCache.m41165w();
        }

        @Override // com.google.common.cache.LocalCache.C7521w, com.google.common.cache.InterfaceC7535b
        public InterfaceC7535b getNextInWriteQueue() {
            return this.f52965e;
        }

        @Override // com.google.common.cache.LocalCache.C7521w, com.google.common.cache.InterfaceC7535b
        public InterfaceC7535b getPreviousInWriteQueue() {
            return this.f52966f;
        }

        @Override // com.google.common.cache.LocalCache.C7521w, com.google.common.cache.InterfaceC7535b
        public long getWriteTime() {
            return this.f52964d;
        }

        @Override // com.google.common.cache.LocalCache.C7521w, com.google.common.cache.InterfaceC7535b
        public void setNextInWriteQueue(InterfaceC7535b interfaceC7535b) {
            this.f52965e = interfaceC7535b;
        }

        @Override // com.google.common.cache.LocalCache.C7521w, com.google.common.cache.InterfaceC7535b
        public void setPreviousInWriteQueue(InterfaceC7535b interfaceC7535b) {
            this.f52966f = interfaceC7535b;
        }

        @Override // com.google.common.cache.LocalCache.C7521w, com.google.common.cache.InterfaceC7535b
        public void setWriteTime(long j) {
            this.f52964d = j;
        }
    }

    /* renamed from: com.google.common.cache.LocalCache$z */
    /* loaded from: classes4.dex */
    public static final class C7524z extends C7510l {

        /* renamed from: b */
        public final int f52967b;

        public C7524z(ReferenceQueue referenceQueue, Object obj, InterfaceC7535b interfaceC7535b, int i) {
            super(referenceQueue, obj, interfaceC7535b);
            this.f52967b = i;
        }

        @Override // com.google.common.cache.LocalCache.C7510l, com.google.common.cache.LocalCache.InterfaceC7517s
        /* renamed from: d */
        public InterfaceC7517s mo41135d(ReferenceQueue referenceQueue, Object obj, InterfaceC7535b interfaceC7535b) {
            return new C7524z(referenceQueue, obj, interfaceC7535b, this.f52967b);
        }

        @Override // com.google.common.cache.LocalCache.C7510l, com.google.common.cache.LocalCache.InterfaceC7517s
        public int getWeight() {
            return this.f52967b;
        }
    }

    public LocalCache(CacheBuilder cacheBuilder, CacheLoader cacheLoader) {
        Queue concurrentLinkedQueue;
        this.f52879d = Math.min(cacheBuilder.m41233c(), 65536);
        Strength m41228h = cacheBuilder.m41228h();
        this.f52882g = m41228h;
        this.f52883h = cacheBuilder.m41221o();
        this.f52880e = cacheBuilder.m41229g();
        this.f52881f = cacheBuilder.m41222n();
        long m41227i = cacheBuilder.m41227i();
        this.f52884i = m41227i;
        this.f52885j = cacheBuilder.m41220p();
        this.f52886k = cacheBuilder.m41232d();
        this.f52887l = cacheBuilder.m41231e();
        this.f52888m = cacheBuilder.m41226j();
        RemovalListener m41225k = cacheBuilder.m41225k();
        this.f52890o = m41225k;
        if (m41225k == CacheBuilder.NullListener.INSTANCE) {
            concurrentLinkedQueue = m41181g();
        } else {
            concurrentLinkedQueue = new ConcurrentLinkedQueue();
        }
        this.f52889n = concurrentLinkedQueue;
        this.f52891p = cacheBuilder.m41223m(m41199D());
        this.f52892q = EntryFactory.getFactory(m41228h, m41192K(), m41188O());
        this.f52893r = (AbstractCache.StatsCounter) cacheBuilder.m41224l().get();
        this.f52894s = cacheLoader;
        int min = Math.min(cacheBuilder.m41230f(), 1073741824);
        if (m41180h() && !m41182f()) {
            min = (int) Math.min(min, m41227i);
        }
        int i = 0;
        int i2 = 1;
        int i3 = 1;
        int i4 = 0;
        while (i3 < this.f52879d && (!m41180h() || i3 * 20 <= this.f52884i)) {
            i4++;
            i3 <<= 1;
        }
        this.f52877b = 32 - i4;
        this.f52876a = i3 - 1;
        this.f52878c = m41166v(i3);
        int i5 = min / i3;
        while (i2 < (i5 * i3 < min ? i5 + 1 : i5)) {
            i2 <<= 1;
        }
        if (m41180h()) {
            long j = this.f52884i;
            long j2 = i3;
            long j3 = (j / j2) + 1;
            long j4 = j % j2;
            while (true) {
                Segment[] segmentArr = this.f52878c;
                if (i < segmentArr.length) {
                    if (i == j4) {
                        j3--;
                    }
                    segmentArr[i] = m41183e(i2, j3, (AbstractCache.StatsCounter) cacheBuilder.m41224l().get());
                    i++;
                } else {
                    return;
                }
            }
        } else {
            while (true) {
                Segment[] segmentArr2 = this.f52878c;
                if (i < segmentArr2.length) {
                    segmentArr2[i] = m41183e(i2, -1L, (AbstractCache.StatsCounter) cacheBuilder.m41224l().get());
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: H */
    public static int m41195H(int i) {
        int i2 = i + ((i << 15) ^ (-12931));
        int i3 = i2 ^ (i2 >>> 10);
        int i4 = i3 + (i3 << 3);
        int i5 = i4 ^ (i4 >>> 6);
        int i6 = i5 + (i5 << 2) + (i5 << 14);
        return i6 ^ (i6 >>> 16);
    }

    /* renamed from: J */
    public static InterfaceC7517s m41193J() {
        return f52874x;
    }

    /* renamed from: b */
    public static void m41185b(InterfaceC7535b interfaceC7535b, InterfaceC7535b interfaceC7535b2) {
        interfaceC7535b.setNextInAccessQueue(interfaceC7535b2);
        interfaceC7535b2.setPreviousInAccessQueue(interfaceC7535b);
    }

    /* renamed from: c */
    public static void m41184c(InterfaceC7535b interfaceC7535b, InterfaceC7535b interfaceC7535b2) {
        interfaceC7535b.setNextInWriteQueue(interfaceC7535b2);
        interfaceC7535b2.setPreviousInWriteQueue(interfaceC7535b);
    }

    /* renamed from: g */
    public static Queue m41181g() {
        return f52875y;
    }

    /* renamed from: w */
    public static InterfaceC7535b m41165w() {
        return NullEntry.INSTANCE;
    }

    /* renamed from: x */
    public static void m41164x(InterfaceC7535b interfaceC7535b) {
        InterfaceC7535b m41165w = m41165w();
        interfaceC7535b.setNextInAccessQueue(m41165w);
        interfaceC7535b.setPreviousInAccessQueue(m41165w);
    }

    /* renamed from: y */
    public static void m41163y(InterfaceC7535b interfaceC7535b) {
        InterfaceC7535b m41165w = m41165w();
        interfaceC7535b.setNextInWriteQueue(m41165w);
        interfaceC7535b.setPreviousInWriteQueue(m41165w);
    }

    /* renamed from: A */
    public void m41202A(InterfaceC7535b interfaceC7535b) {
        int hash = interfaceC7535b.getHash();
        m41194I(hash).reclaimKey(interfaceC7535b, hash);
    }

    /* renamed from: B */
    public void m41201B(InterfaceC7517s interfaceC7517s) {
        InterfaceC7535b mo41138a = interfaceC7517s.mo41138a();
        int hash = mo41138a.getHash();
        m41194I(hash).reclaimValue(mo41138a.getKey(), hash, interfaceC7517s);
    }

    /* renamed from: C */
    public boolean m41200C() {
        return m41179i();
    }

    /* renamed from: D */
    public boolean m41199D() {
        if (!m41198E() && !m41200C()) {
            return false;
        }
        return true;
    }

    /* renamed from: E */
    public boolean m41198E() {
        if (!m41178j() && !m41196G()) {
            return false;
        }
        return true;
    }

    /* renamed from: F */
    public void m41197F(Object obj) {
        int m41171q = m41171q(Preconditions.checkNotNull(obj));
        m41194I(m41171q).refresh(obj, m41171q, this.f52894s, false);
    }

    /* renamed from: G */
    public boolean m41196G() {
        if (this.f52888m > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: I */
    public Segment m41194I(int i) {
        return this.f52878c[(i >>> this.f52877b) & this.f52876a];
    }

    /* renamed from: K */
    public boolean m41192K() {
        if (!m41191L() && !m41200C()) {
            return false;
        }
        return true;
    }

    /* renamed from: L */
    public boolean m41191L() {
        if (!m41179i() && !m41180h()) {
            return false;
        }
        return true;
    }

    /* renamed from: M */
    public boolean m41190M() {
        if (this.f52882g != Strength.STRONG) {
            return true;
        }
        return false;
    }

    /* renamed from: N */
    public boolean m41189N() {
        if (this.f52883h != Strength.STRONG) {
            return true;
        }
        return false;
    }

    /* renamed from: O */
    public boolean m41188O() {
        if (!m41187P() && !m41198E()) {
            return false;
        }
        return true;
    }

    /* renamed from: P */
    public boolean m41187P() {
        return m41178j();
    }

    /* renamed from: a */
    public void m41186a() {
        for (Segment segment : this.f52878c) {
            segment.cleanUp();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        for (Segment segment : this.f52878c) {
            segment.clear();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        if (obj == null) {
            return false;
        }
        int m41171q = m41171q(obj);
        return m41194I(m41171q).containsKey(obj, m41171q);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        if (obj == null) {
            return false;
        }
        long read = this.f52891p.read();
        Segment[] segmentArr = this.f52878c;
        long j = -1;
        int i = 0;
        while (i < 3) {
            int length = segmentArr.length;
            long j2 = 0;
            int i2 = 0;
            while (i2 < length) {
                Segment segment = segmentArr[i2];
                int i3 = segment.count;
                AtomicReferenceArray<InterfaceC7535b> atomicReferenceArray = segment.table;
                for (int i4 = 0; i4 < atomicReferenceArray.length(); i4++) {
                    InterfaceC7535b interfaceC7535b = atomicReferenceArray.get(i4);
                    while (interfaceC7535b != null) {
                        Segment[] segmentArr2 = segmentArr;
                        Object liveValue = segment.getLiveValue(interfaceC7535b, read);
                        long j3 = read;
                        if (liveValue != null && this.f52881f.equivalent(obj, liveValue)) {
                            return true;
                        }
                        interfaceC7535b = interfaceC7535b.getNext();
                        segmentArr = segmentArr2;
                        read = j3;
                    }
                }
                j2 += segment.modCount;
                i2++;
                read = read;
            }
            long j4 = read;
            Segment[] segmentArr3 = segmentArr;
            if (j2 == j) {
                return false;
            }
            i++;
            j = j2;
            segmentArr = segmentArr3;
            read = j4;
        }
        return false;
    }

    /* renamed from: e */
    public Segment m41183e(int i, long j, AbstractCache.StatsCounter statsCounter) {
        return new Segment(this, i, j, statsCounter);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        Set set = this.f52897v;
        if (set == null) {
            C7505g c7505g = new C7505g();
            this.f52897v = c7505g;
            return c7505g;
        }
        return set;
    }

    /* renamed from: f */
    public boolean m41182f() {
        if (this.f52885j != CacheBuilder.OneWeigher.INSTANCE) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        int m41171q = m41171q(obj);
        return m41194I(m41171q).get(obj, m41171q);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        if (obj3 != null) {
            return obj3;
        }
        return obj2;
    }

    /* renamed from: h */
    public boolean m41180h() {
        if (this.f52884i >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public boolean m41179i() {
        if (this.f52886k > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        Segment[] segmentArr = this.f52878c;
        long j = 0;
        for (Segment segment : segmentArr) {
            if (segment.count != 0) {
                return false;
            }
            j += segment.modCount;
        }
        if (j == 0) {
            return true;
        }
        for (Segment segment2 : segmentArr) {
            if (segment2.count != 0) {
                return false;
            }
            j -= segment2.modCount;
        }
        if (j != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public boolean m41178j() {
        if (this.f52887l > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public Object m41177k(Object obj, CacheLoader cacheLoader) {
        int m41171q = m41171q(Preconditions.checkNotNull(obj));
        return m41194I(m41171q).get(obj, m41171q, cacheLoader);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        Set set = this.f52895t;
        if (set == null) {
            C7508j c7508j = new C7508j();
            this.f52895t = c7508j;
            return c7508j;
        }
        return set;
    }

    /* renamed from: l */
    public ImmutableMap m41176l(Iterable iterable) {
        LinkedHashMap newLinkedHashMap = Maps.newLinkedHashMap();
        LinkedHashSet newLinkedHashSet = Sets.newLinkedHashSet();
        int i = 0;
        int i2 = 0;
        for (Object obj : iterable) {
            Object obj2 = get(obj);
            if (!newLinkedHashMap.containsKey(obj)) {
                newLinkedHashMap.put(obj, obj2);
                if (obj2 == null) {
                    i2++;
                    newLinkedHashSet.add(obj);
                } else {
                    i++;
                }
            }
        }
        try {
            if (!newLinkedHashSet.isEmpty()) {
                try {
                    Map m41168t = m41168t(Collections.unmodifiableSet(newLinkedHashSet), this.f52894s);
                    for (Object obj3 : newLinkedHashSet) {
                        Object obj4 = m41168t.get(obj3);
                        if (obj4 != null) {
                            newLinkedHashMap.put(obj3, obj4);
                        } else {
                            throw new CacheLoader.InvalidCacheLoadException("loadAll failed to return a value for " + obj3);
                        }
                    }
                } catch (CacheLoader.UnsupportedLoadingOperationException unused) {
                    for (Object obj5 : newLinkedHashSet) {
                        i2--;
                        newLinkedHashMap.put(obj5, m41177k(obj5, this.f52894s));
                    }
                }
            }
            ImmutableMap copyOf = ImmutableMap.copyOf((Map) newLinkedHashMap);
            this.f52893r.recordHits(i);
            this.f52893r.recordMisses(i2);
            return copyOf;
        } catch (Throwable th2) {
            this.f52893r.recordHits(i);
            this.f52893r.recordMisses(i2);
            throw th2;
        }
    }

    /* renamed from: m */
    public ImmutableMap m41175m(Iterable iterable) {
        ImmutableMap.Builder builder = ImmutableMap.builder();
        int i = 0;
        int i2 = 0;
        for (Object obj : iterable) {
            Object obj2 = get(obj);
            if (obj2 == null) {
                i2++;
            } else {
                builder.put(obj, obj2);
                i++;
            }
        }
        this.f52893r.recordHits(i);
        this.f52893r.recordMisses(i2);
        return builder.buildKeepingLast();
    }

    /* renamed from: n */
    public Object m41174n(Object obj) {
        int m41171q = m41171q(Preconditions.checkNotNull(obj));
        Object obj2 = m41194I(m41171q).get(obj, m41171q);
        if (obj2 == null) {
            this.f52893r.recordMisses(1);
        } else {
            this.f52893r.recordHits(1);
        }
        return obj2;
    }

    /* renamed from: o */
    public Object m41173o(InterfaceC7535b interfaceC7535b, long j) {
        Object obj;
        if (interfaceC7535b.getKey() == null || (obj = interfaceC7535b.getValueReference().get()) == null || m41169s(interfaceC7535b, j)) {
            return null;
        }
        return obj;
    }

    /* renamed from: p */
    public Object m41172p(Object obj) {
        return m41177k(obj, this.f52894s);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        Preconditions.checkNotNull(obj);
        Preconditions.checkNotNull(obj2);
        int m41171q = m41171q(obj);
        return m41194I(m41171q).put(obj, m41171q, obj2, false);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public Object putIfAbsent(Object obj, Object obj2) {
        Preconditions.checkNotNull(obj);
        Preconditions.checkNotNull(obj2);
        int m41171q = m41171q(obj);
        return m41194I(m41171q).put(obj, m41171q, obj2, true);
    }

    /* renamed from: q */
    public int m41171q(Object obj) {
        return m41195H(this.f52880e.hash(obj));
    }

    /* renamed from: r */
    public void m41170r(Iterable iterable) {
        for (Object obj : iterable) {
            remove(obj);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        if (obj == null) {
            return null;
        }
        int m41171q = m41171q(obj);
        return m41194I(m41171q).remove(obj, m41171q);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public boolean replace(Object obj, Object obj2, Object obj3) {
        Preconditions.checkNotNull(obj);
        Preconditions.checkNotNull(obj3);
        if (obj2 == null) {
            return false;
        }
        int m41171q = m41171q(obj);
        return m41194I(m41171q).replace(obj, m41171q, obj2, obj3);
    }

    /* renamed from: s */
    public boolean m41169s(InterfaceC7535b interfaceC7535b, long j) {
        Preconditions.checkNotNull(interfaceC7535b);
        if (m41179i() && j - interfaceC7535b.getAccessTime() >= this.f52886k) {
            return true;
        }
        if (m41178j() && j - interfaceC7535b.getWriteTime() >= this.f52887l) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return Ints.saturatedCast(m41167u());
    }

    /* JADX WARN: Removed duplicated region for block: B:91:0x00b9  */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.Map m41168t(java.util.Set r7, com.google.common.cache.CacheLoader r8) {
        /*
            r6 = this;
            com.google.common.base.Preconditions.checkNotNull(r8)
            com.google.common.base.Preconditions.checkNotNull(r7)
            com.google.common.base.Stopwatch r0 = com.google.common.base.Stopwatch.createStarted()
            r1 = 1
            r2 = 0
            java.util.Map r7 = r8.loadAll(r7)     // Catch: java.lang.Throwable -> L8e java.lang.Error -> L91 java.lang.Exception -> L98 java.lang.RuntimeException -> L9f java.lang.InterruptedException -> La6 com.google.common.cache.CacheLoader.UnsupportedLoadingOperationException -> Lb4
            if (r7 == 0) goto L6c
            r0.stop()
            java.util.Set r3 = r7.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L1d:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L3c
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getKey()
            java.lang.Object r4 = r4.getValue()
            if (r5 == 0) goto L3a
            if (r4 != 0) goto L36
            goto L3a
        L36:
            r6.put(r5, r4)
            goto L1d
        L3a:
            r2 = 1
            goto L1d
        L3c:
            if (r2 != 0) goto L4a
            com.google.common.cache.AbstractCache$StatsCounter r8 = r6.f52893r
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r0 = r0.elapsed(r1)
            r8.recordLoadSuccess(r0)
            return r7
        L4a:
            com.google.common.cache.AbstractCache$StatsCounter r7 = r6.f52893r
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r0 = r0.elapsed(r1)
            r7.recordLoadException(r0)
            com.google.common.cache.CacheLoader$InvalidCacheLoadException r7 = new com.google.common.cache.CacheLoader$InvalidCacheLoadException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            java.lang.String r8 = " returned null keys or values from loadAll"
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            r7.<init>(r8)
            throw r7
        L6c:
            com.google.common.cache.AbstractCache$StatsCounter r7 = r6.f52893r
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r0 = r0.elapsed(r1)
            r7.recordLoadException(r0)
            com.google.common.cache.CacheLoader$InvalidCacheLoadException r7 = new com.google.common.cache.CacheLoader$InvalidCacheLoadException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            java.lang.String r8 = " returned null map from loadAll"
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            r7.<init>(r8)
            throw r7
        L8e:
            r7 = move-exception
            r1 = 0
            goto Lb7
        L91:
            r7 = move-exception
            com.google.common.util.concurrent.ExecutionError r8 = new com.google.common.util.concurrent.ExecutionError     // Catch: java.lang.Throwable -> L8e
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L8e
            throw r8     // Catch: java.lang.Throwable -> L8e
        L98:
            r7 = move-exception
            java.util.concurrent.ExecutionException r8 = new java.util.concurrent.ExecutionException     // Catch: java.lang.Throwable -> L8e
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L8e
            throw r8     // Catch: java.lang.Throwable -> L8e
        L9f:
            r7 = move-exception
            com.google.common.util.concurrent.UncheckedExecutionException r8 = new com.google.common.util.concurrent.UncheckedExecutionException     // Catch: java.lang.Throwable -> L8e
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L8e
            throw r8     // Catch: java.lang.Throwable -> L8e
        La6:
            r7 = move-exception
            java.lang.Thread r8 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L8e
            r8.interrupt()     // Catch: java.lang.Throwable -> L8e
            java.util.concurrent.ExecutionException r8 = new java.util.concurrent.ExecutionException     // Catch: java.lang.Throwable -> L8e
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L8e
            throw r8     // Catch: java.lang.Throwable -> L8e
        Lb4:
            r7 = move-exception
            throw r7     // Catch: java.lang.Throwable -> Lb6
        Lb6:
            r7 = move-exception
        Lb7:
            if (r1 != 0) goto Lc4
            com.google.common.cache.AbstractCache$StatsCounter r8 = r6.f52893r
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r0 = r0.elapsed(r1)
            r8.recordLoadException(r0)
        Lc4:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.LocalCache.m41168t(java.util.Set, com.google.common.cache.CacheLoader):java.util.Map");
    }

    /* renamed from: u */
    public long m41167u() {
        long j = 0;
        for (Segment segment : this.f52878c) {
            j += Math.max(0, segment.count);
        }
        return j;
    }

    /* renamed from: v */
    public final Segment[] m41166v(int i) {
        return new Segment[i];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection values() {
        Collection collection = this.f52896u;
        if (collection == null) {
            C7518t c7518t = new C7518t();
            this.f52896u = c7518t;
            return c7518t;
        }
        return collection;
    }

    /* renamed from: z */
    public void m41162z() {
        while (true) {
            RemovalNotification removalNotification = (RemovalNotification) this.f52889n.poll();
            if (removalNotification != null) {
                try {
                    this.f52890o.onRemoval(removalNotification);
                } catch (Throwable th2) {
                    f52873w.log(Level.WARNING, "Exception thrown by removal listener", th2);
                }
            } else {
                return;
            }
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public boolean remove(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            return false;
        }
        int m41171q = m41171q(obj);
        return m41194I(m41171q).remove(obj, m41171q, obj2);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public Object replace(Object obj, Object obj2) {
        Preconditions.checkNotNull(obj);
        Preconditions.checkNotNull(obj2);
        int m41171q = m41171q(obj);
        return m41194I(m41171q).replace(obj, m41171q, obj2);
    }

    /* loaded from: classes4.dex */
    public static class Segment<K, V> extends ReentrantLock {
        @GuardedBy("this")
        final Queue<InterfaceC7535b> accessQueue;
        volatile int count;
        @CheckForNull
        final ReferenceQueue<K> keyReferenceQueue;
        @Weak
        final LocalCache map;
        final long maxSegmentWeight;
        int modCount;
        final AtomicInteger readCount = new AtomicInteger();
        final Queue<InterfaceC7535b> recencyQueue;
        final AbstractCache.StatsCounter statsCounter;
        @CheckForNull
        volatile AtomicReferenceArray<InterfaceC7535b> table;
        int threshold;
        @GuardedBy("this")
        long totalWeight;
        @CheckForNull
        final ReferenceQueue<V> valueReferenceQueue;
        @GuardedBy("this")
        final Queue<InterfaceC7535b> writeQueue;

        public Segment(LocalCache localCache, int i, long j, AbstractCache.StatsCounter statsCounter) {
            ReferenceQueue<K> referenceQueue;
            Queue<InterfaceC7535b> m41181g;
            Queue<InterfaceC7535b> m41181g2;
            Queue<InterfaceC7535b> m41181g3;
            this.map = localCache;
            this.maxSegmentWeight = j;
            this.statsCounter = (AbstractCache.StatsCounter) Preconditions.checkNotNull(statsCounter);
            initTable(newEntryArray(i));
            if (localCache.m41190M()) {
                referenceQueue = new ReferenceQueue<>();
            } else {
                referenceQueue = null;
            }
            this.keyReferenceQueue = referenceQueue;
            this.valueReferenceQueue = localCache.m41189N() ? new ReferenceQueue<>() : null;
            if (localCache.m41191L()) {
                m41181g = new ConcurrentLinkedQueue<>();
            } else {
                m41181g = LocalCache.m41181g();
            }
            this.recencyQueue = m41181g;
            if (localCache.m41187P()) {
                m41181g2 = new C7481C();
            } else {
                m41181g2 = LocalCache.m41181g();
            }
            this.writeQueue = m41181g2;
            if (localCache.m41191L()) {
                m41181g3 = new C7501e();
            } else {
                m41181g3 = LocalCache.m41181g();
            }
            this.accessQueue = m41181g3;
        }

        /* renamed from: a */
        public static /* synthetic */ void m41157a(Segment segment, Object obj, int i, C7509k c7509k, ListenableFuture listenableFuture) {
            segment.lambda$loadAsync$0(obj, i, c7509k, listenableFuture);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public /* synthetic */ void lambda$loadAsync$0(Object obj, int i, C7509k c7509k, ListenableFuture listenableFuture) {
            try {
                getAndRecordStats(obj, i, c7509k, listenableFuture);
            } catch (Throwable th2) {
                LocalCache.f52873w.log(Level.WARNING, "Exception thrown during refresh", th2);
                c7509k.m41139l(th2);
            }
        }

        public void cleanUp() {
            runLockedCleanup(this.map.f52891p.read());
            runUnlockedCleanup();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void clear() {
            RemovalCause removalCause;
            if (this.count != 0) {
                lock();
                try {
                    preWriteCleanup(this.map.f52891p.read());
                    AtomicReferenceArray<InterfaceC7535b> atomicReferenceArray = this.table;
                    for (int i = 0; i < atomicReferenceArray.length(); i++) {
                        for (InterfaceC7535b interfaceC7535b = atomicReferenceArray.get(i); interfaceC7535b != null; interfaceC7535b = interfaceC7535b.getNext()) {
                            if (interfaceC7535b.getValueReference().isActive()) {
                                Object key = interfaceC7535b.getKey();
                                Object obj = interfaceC7535b.getValueReference().get();
                                if (key != null && obj != null) {
                                    removalCause = RemovalCause.EXPLICIT;
                                    enqueueNotification(key, interfaceC7535b.getHash(), obj, interfaceC7535b.getValueReference().getWeight(), removalCause);
                                }
                                removalCause = RemovalCause.COLLECTED;
                                enqueueNotification(key, interfaceC7535b.getHash(), obj, interfaceC7535b.getValueReference().getWeight(), removalCause);
                            }
                        }
                    }
                    for (int i2 = 0; i2 < atomicReferenceArray.length(); i2++) {
                        atomicReferenceArray.set(i2, null);
                    }
                    clearReferenceQueues();
                    this.writeQueue.clear();
                    this.accessQueue.clear();
                    this.readCount.set(0);
                    this.modCount++;
                    this.count = 0;
                    unlock();
                    postWriteCleanup();
                } catch (Throwable th2) {
                    unlock();
                    postWriteCleanup();
                    throw th2;
                }
            }
        }

        public void clearKeyReferenceQueue() {
            do {
            } while (this.keyReferenceQueue.poll() != null);
        }

        public void clearReferenceQueues() {
            if (this.map.m41190M()) {
                clearKeyReferenceQueue();
            }
            if (this.map.m41189N()) {
                clearValueReferenceQueue();
            }
        }

        public void clearValueReferenceQueue() {
            do {
            } while (this.valueReferenceQueue.poll() != null);
        }

        public boolean containsKey(Object obj, int i) {
            try {
                boolean z = false;
                if (this.count == 0) {
                    return false;
                }
                InterfaceC7535b liveEntry = getLiveEntry(obj, i, this.map.f52891p.read());
                if (liveEntry == null) {
                    return false;
                }
                if (liveEntry.getValueReference().get() != null) {
                    z = true;
                }
                return z;
            } finally {
                postReadCleanup();
            }
        }

        @VisibleForTesting
        public boolean containsValue(Object obj) {
            try {
                if (this.count != 0) {
                    long read = this.map.f52891p.read();
                    AtomicReferenceArray<InterfaceC7535b> atomicReferenceArray = this.table;
                    int length = atomicReferenceArray.length();
                    for (int i = 0; i < length; i++) {
                        for (InterfaceC7535b interfaceC7535b = atomicReferenceArray.get(i); interfaceC7535b != null; interfaceC7535b = interfaceC7535b.getNext()) {
                            V liveValue = getLiveValue(interfaceC7535b, read);
                            if (liveValue != null && this.map.f52881f.equivalent(obj, liveValue)) {
                                postReadCleanup();
                                return true;
                            }
                        }
                    }
                }
                return false;
            } finally {
                postReadCleanup();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @CheckForNull
        @GuardedBy("this")
        public InterfaceC7535b copyEntry(InterfaceC7535b interfaceC7535b, InterfaceC7535b interfaceC7535b2) {
            Object key = interfaceC7535b.getKey();
            if (key == null) {
                return null;
            }
            InterfaceC7517s valueReference = interfaceC7535b.getValueReference();
            Object obj = valueReference.get();
            if (obj == null && valueReference.isActive()) {
                return null;
            }
            InterfaceC7535b copyEntry = this.map.f52892q.copyEntry(this, interfaceC7535b, interfaceC7535b2, key);
            copyEntry.setValueReference(valueReference.mo41135d(this.valueReferenceQueue, obj, copyEntry));
            return copyEntry;
        }

        @GuardedBy("this")
        public void drainKeyReferenceQueue() {
            int i = 0;
            do {
                Reference<? extends K> poll = this.keyReferenceQueue.poll();
                if (poll != null) {
                    this.map.m41202A((InterfaceC7535b) poll);
                    i++;
                } else {
                    return;
                }
            } while (i != 16);
        }

        @GuardedBy("this")
        public void drainRecencyQueue() {
            while (true) {
                InterfaceC7535b poll = this.recencyQueue.poll();
                if (poll != null) {
                    if (this.accessQueue.contains(poll)) {
                        this.accessQueue.add(poll);
                    }
                } else {
                    return;
                }
            }
        }

        @GuardedBy("this")
        public void drainReferenceQueues() {
            if (this.map.m41190M()) {
                drainKeyReferenceQueue();
            }
            if (this.map.m41189N()) {
                drainValueReferenceQueue();
            }
        }

        @GuardedBy("this")
        public void drainValueReferenceQueue() {
            int i = 0;
            do {
                Reference<? extends V> poll = this.valueReferenceQueue.poll();
                if (poll != null) {
                    this.map.m41201B((InterfaceC7517s) poll);
                    i++;
                } else {
                    return;
                }
            } while (i != 16);
        }

        @GuardedBy("this")
        public void enqueueNotification(@CheckForNull K k, int i, @CheckForNull V v, int i2, RemovalCause removalCause) {
            this.totalWeight -= i2;
            if (removalCause.wasEvicted()) {
                this.statsCounter.recordEviction();
            }
            if (this.map.f52889n != LocalCache.f52875y) {
                this.map.f52889n.offer(RemovalNotification.create(k, v, removalCause));
            }
        }

        @GuardedBy("this")
        public void evictEntries(InterfaceC7535b interfaceC7535b) {
            if (!this.map.m41180h()) {
                return;
            }
            drainRecencyQueue();
            if (interfaceC7535b.getValueReference().getWeight() > this.maxSegmentWeight && !removeEntry(interfaceC7535b, interfaceC7535b.getHash(), RemovalCause.SIZE)) {
                throw new AssertionError();
            }
            while (this.totalWeight > this.maxSegmentWeight) {
                InterfaceC7535b nextEvictable = getNextEvictable();
                if (!removeEntry(nextEvictable, nextEvictable.getHash(), RemovalCause.SIZE)) {
                    throw new AssertionError();
                }
            }
        }

        @GuardedBy("this")
        public void expand() {
            AtomicReferenceArray<InterfaceC7535b> atomicReferenceArray = this.table;
            int length = atomicReferenceArray.length();
            if (length >= 1073741824) {
                return;
            }
            int i = this.count;
            AtomicReferenceArray<InterfaceC7535b> newEntryArray = newEntryArray(length << 1);
            this.threshold = (newEntryArray.length() * 3) / 4;
            int length2 = newEntryArray.length() - 1;
            for (int i2 = 0; i2 < length; i2++) {
                InterfaceC7535b interfaceC7535b = atomicReferenceArray.get(i2);
                if (interfaceC7535b != null) {
                    InterfaceC7535b next = interfaceC7535b.getNext();
                    int hash = interfaceC7535b.getHash() & length2;
                    if (next == null) {
                        newEntryArray.set(hash, interfaceC7535b);
                    } else {
                        InterfaceC7535b interfaceC7535b2 = interfaceC7535b;
                        while (next != null) {
                            int hash2 = next.getHash() & length2;
                            if (hash2 != hash) {
                                interfaceC7535b2 = next;
                                hash = hash2;
                            }
                            next = next.getNext();
                        }
                        newEntryArray.set(hash, interfaceC7535b2);
                        while (interfaceC7535b != interfaceC7535b2) {
                            int hash3 = interfaceC7535b.getHash() & length2;
                            InterfaceC7535b copyEntry = copyEntry(interfaceC7535b, newEntryArray.get(hash3));
                            if (copyEntry != null) {
                                newEntryArray.set(hash3, copyEntry);
                            } else {
                                removeCollectedEntry(interfaceC7535b);
                                i--;
                            }
                            interfaceC7535b = interfaceC7535b.getNext();
                        }
                    }
                }
            }
            this.table = newEntryArray;
            this.count = i;
        }

        @GuardedBy("this")
        public void expireEntries(long j) {
            InterfaceC7535b peek;
            InterfaceC7535b peek2;
            drainRecencyQueue();
            do {
                peek = this.writeQueue.peek();
                if (peek == null || !this.map.m41169s(peek, j)) {
                    do {
                        peek2 = this.accessQueue.peek();
                        if (peek2 == null || !this.map.m41169s(peek2, j)) {
                            return;
                        }
                    } while (removeEntry(peek2, peek2.getHash(), RemovalCause.EXPIRED));
                    throw new AssertionError();
                }
            } while (removeEntry(peek, peek.getHash(), RemovalCause.EXPIRED));
            throw new AssertionError();
        }

        @CanIgnoreReturnValue
        public V get(K k, int i, CacheLoader<? super K, V> cacheLoader) throws ExecutionException {
            InterfaceC7535b entry;
            Preconditions.checkNotNull(k);
            Preconditions.checkNotNull(cacheLoader);
            try {
                try {
                    if (this.count != 0 && (entry = getEntry(k, i)) != null) {
                        long read = this.map.f52891p.read();
                        V liveValue = getLiveValue(entry, read);
                        if (liveValue != null) {
                            recordRead(entry, read);
                            this.statsCounter.recordHits(1);
                            return scheduleRefresh(entry, k, i, liveValue, read, cacheLoader);
                        }
                        InterfaceC7517s valueReference = entry.getValueReference();
                        if (valueReference.isLoading()) {
                            return waitForLoadingValue(entry, k, valueReference);
                        }
                    }
                    return lockedGetOrLoad(k, i, cacheLoader);
                } catch (ExecutionException e) {
                    Throwable cause = e.getCause();
                    if (!(cause instanceof Error)) {
                        if (cause instanceof RuntimeException) {
                            throw new UncheckedExecutionException(cause);
                        }
                        throw e;
                    }
                    throw new ExecutionError((Error) cause);
                }
            } finally {
                postReadCleanup();
            }
        }

        @CanIgnoreReturnValue
        public V getAndRecordStats(K k, int i, C7509k c7509k, ListenableFuture<V> listenableFuture) throws ExecutionException {
            V v;
            try {
                v = (V) Uninterruptibles.getUninterruptibly(listenableFuture);
                try {
                    if (v != null) {
                        this.statsCounter.recordLoadSuccess(c7509k.m41145f());
                        storeLoadedValue(k, i, c7509k, v);
                        return v;
                    }
                    throw new CacheLoader.InvalidCacheLoadException("CacheLoader returned null for key " + k + ".");
                } catch (Throwable th2) {
                    th = th2;
                    if (v == null) {
                        this.statsCounter.recordLoadException(c7509k.m41145f());
                        removeLoadingValue(k, i, c7509k);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                v = null;
            }
        }

        @CheckForNull
        public InterfaceC7535b getEntry(Object obj, int i) {
            for (InterfaceC7535b first = getFirst(i); first != null; first = first.getNext()) {
                if (first.getHash() == i) {
                    Object key = first.getKey();
                    if (key == null) {
                        tryDrainReferenceQueues();
                    } else if (this.map.f52880e.equivalent(obj, key)) {
                        return first;
                    }
                }
            }
            return null;
        }

        public InterfaceC7535b getFirst(int i) {
            AtomicReferenceArray<InterfaceC7535b> atomicReferenceArray = this.table;
            return atomicReferenceArray.get(i & (atomicReferenceArray.length() - 1));
        }

        @CheckForNull
        public InterfaceC7535b getLiveEntry(Object obj, int i, long j) {
            InterfaceC7535b entry = getEntry(obj, i);
            if (entry == null) {
                return null;
            }
            if (this.map.m41169s(entry, j)) {
                tryExpireEntries(j);
                return null;
            }
            return entry;
        }

        public V getLiveValue(InterfaceC7535b interfaceC7535b, long j) {
            if (interfaceC7535b.getKey() == null) {
                tryDrainReferenceQueues();
                return null;
            }
            V v = (V) interfaceC7535b.getValueReference().get();
            if (v == null) {
                tryDrainReferenceQueues();
                return null;
            } else if (this.map.m41169s(interfaceC7535b, j)) {
                tryExpireEntries(j);
                return null;
            } else {
                return v;
            }
        }

        @GuardedBy("this")
        public InterfaceC7535b getNextEvictable() {
            for (InterfaceC7535b interfaceC7535b : this.accessQueue) {
                if (interfaceC7535b.getValueReference().getWeight() > 0) {
                    return interfaceC7535b;
                }
            }
            throw new AssertionError();
        }

        public void initTable(AtomicReferenceArray<InterfaceC7535b> atomicReferenceArray) {
            this.threshold = (atomicReferenceArray.length() * 3) / 4;
            if (!this.map.m41182f()) {
                int i = this.threshold;
                if (i == this.maxSegmentWeight) {
                    this.threshold = i + 1;
                }
            }
            this.table = atomicReferenceArray;
        }

        /* JADX WARN: Finally extract failed */
        @CheckForNull
        public C7509k insertLoadingValueReference(K k, int i, boolean z) {
            lock();
            try {
                long read = this.map.f52891p.read();
                preWriteCleanup(read);
                AtomicReferenceArray<InterfaceC7535b> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                InterfaceC7535b interfaceC7535b = atomicReferenceArray.get(length);
                for (InterfaceC7535b interfaceC7535b2 = interfaceC7535b; interfaceC7535b2 != null; interfaceC7535b2 = interfaceC7535b2.getNext()) {
                    Object key = interfaceC7535b2.getKey();
                    if (interfaceC7535b2.getHash() == i && key != null && this.map.f52880e.equivalent(k, key)) {
                        InterfaceC7517s valueReference = interfaceC7535b2.getValueReference();
                        if (!valueReference.isLoading() && (!z || read - interfaceC7535b2.getWriteTime() >= this.map.f52888m)) {
                            this.modCount++;
                            C7509k c7509k = new C7509k(valueReference);
                            interfaceC7535b2.setValueReference(c7509k);
                            unlock();
                            postWriteCleanup();
                            return c7509k;
                        }
                        unlock();
                        postWriteCleanup();
                        return null;
                    }
                }
                this.modCount++;
                C7509k c7509k2 = new C7509k();
                InterfaceC7535b newEntry = newEntry(k, i, interfaceC7535b);
                newEntry.setValueReference(c7509k2);
                atomicReferenceArray.set(length, newEntry);
                unlock();
                postWriteCleanup();
                return c7509k2;
            } catch (Throwable th2) {
                unlock();
                postWriteCleanup();
                throw th2;
            }
        }

        public ListenableFuture<V> loadAsync(final K k, final int i, final C7509k c7509k, CacheLoader<? super K, V> cacheLoader) {
            final ListenableFuture<V> m41141j = c7509k.m41141j(k, cacheLoader);
            m41141j.addListener(new Runnable() { // from class: com.google.common.cache.a
                {
                    LocalCache.Segment.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    LocalCache.Segment.m41157a(LocalCache.Segment.this, k, i, c7509k, m41141j);
                }
            }, MoreExecutors.directExecutor());
            return m41141j;
        }

        public V loadSync(K k, int i, C7509k c7509k, CacheLoader<? super K, V> cacheLoader) throws ExecutionException {
            return getAndRecordStats(k, i, c7509k, c7509k.m41141j(k, cacheLoader));
        }

        /* JADX WARN: Multi-variable type inference failed */
        public V lockedGetOrLoad(K k, int i, CacheLoader<? super K, V> cacheLoader) throws ExecutionException {
            C7509k c7509k;
            InterfaceC7517s interfaceC7517s;
            boolean z;
            V v;
            lock();
            try {
                long read = this.map.f52891p.read();
                preWriteCleanup(read);
                int i2 = this.count - 1;
                AtomicReferenceArray<InterfaceC7535b> atomicReferenceArray = this.table;
                int length = i & (atomicReferenceArray.length() - 1);
                InterfaceC7535b interfaceC7535b = atomicReferenceArray.get(length);
                InterfaceC7535b interfaceC7535b2 = interfaceC7535b;
                while (true) {
                    c7509k = null;
                    if (interfaceC7535b2 != null) {
                        Object key = interfaceC7535b2.getKey();
                        if (interfaceC7535b2.getHash() == i && key != null && this.map.f52880e.equivalent(k, key)) {
                            InterfaceC7517s valueReference = interfaceC7535b2.getValueReference();
                            if (valueReference.isLoading()) {
                                z = false;
                                interfaceC7517s = valueReference;
                            } else {
                                V v2 = (V) valueReference.get();
                                if (v2 == null) {
                                    enqueueNotification(key, i, v2, valueReference.getWeight(), RemovalCause.COLLECTED);
                                } else if (this.map.m41169s(interfaceC7535b2, read)) {
                                    enqueueNotification(key, i, v2, valueReference.getWeight(), RemovalCause.EXPIRED);
                                } else {
                                    recordLockedRead(interfaceC7535b2, read);
                                    this.statsCounter.recordHits(1);
                                    unlock();
                                    postWriteCleanup();
                                    return v2;
                                }
                                this.writeQueue.remove(interfaceC7535b2);
                                this.accessQueue.remove(interfaceC7535b2);
                                this.count = i2;
                                interfaceC7517s = valueReference;
                            }
                        } else {
                            interfaceC7535b2 = interfaceC7535b2.getNext();
                        }
                    } else {
                        interfaceC7517s = null;
                        break;
                    }
                }
                z = true;
                if (z) {
                    c7509k = new C7509k();
                    if (interfaceC7535b2 == null) {
                        interfaceC7535b2 = newEntry(k, i, interfaceC7535b);
                        interfaceC7535b2.setValueReference(c7509k);
                        atomicReferenceArray.set(length, interfaceC7535b2);
                    } else {
                        interfaceC7535b2.setValueReference(c7509k);
                    }
                }
                unlock();
                postWriteCleanup();
                if (z) {
                    try {
                        synchronized (interfaceC7535b2) {
                            v = (V) loadSync(k, i, c7509k, cacheLoader);
                        }
                        return v;
                    } finally {
                        this.statsCounter.recordMisses(1);
                    }
                }
                return (V) waitForLoadingValue(interfaceC7535b2, k, interfaceC7517s);
            } catch (Throwable th2) {
                unlock();
                postWriteCleanup();
                throw th2;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @GuardedBy("this")
        public InterfaceC7535b newEntry(K k, int i, @CheckForNull InterfaceC7535b interfaceC7535b) {
            return this.map.f52892q.newEntry(this, Preconditions.checkNotNull(k), i, interfaceC7535b);
        }

        public AtomicReferenceArray<InterfaceC7535b> newEntryArray(int i) {
            return new AtomicReferenceArray<>(i);
        }

        public void postReadCleanup() {
            if ((this.readCount.incrementAndGet() & 63) == 0) {
                cleanUp();
            }
        }

        public void postWriteCleanup() {
            runUnlockedCleanup();
        }

        @GuardedBy("this")
        public void preWriteCleanup(long j) {
            runLockedCleanup(j);
        }

        /* JADX WARN: Code restructure failed: missing block: B:64:0x008d, code lost:
            unlock();
            postWriteCleanup();
         */
        /* JADX WARN: Code restructure failed: missing block: B:65:0x0093, code lost:
            return null;
         */
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        @javax.annotation.CheckForNull
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public V put(K r15, int r16, V r17, boolean r18) {
            /*
                Method dump skipped, instructions count: 238
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.LocalCache.Segment.put(java.lang.Object, int, java.lang.Object, boolean):java.lang.Object");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @CanIgnoreReturnValue
        public boolean reclaimKey(InterfaceC7535b interfaceC7535b, int i) {
            lock();
            try {
                AtomicReferenceArray<InterfaceC7535b> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                InterfaceC7535b interfaceC7535b2 = atomicReferenceArray.get(length);
                for (InterfaceC7535b interfaceC7535b3 = interfaceC7535b2; interfaceC7535b3 != null; interfaceC7535b3 = interfaceC7535b3.getNext()) {
                    if (interfaceC7535b3 == interfaceC7535b) {
                        this.modCount++;
                        atomicReferenceArray.set(length, removeValueFromChain(interfaceC7535b2, interfaceC7535b3, interfaceC7535b3.getKey(), i, interfaceC7535b3.getValueReference().get(), interfaceC7535b3.getValueReference(), RemovalCause.COLLECTED));
                        this.count--;
                        return true;
                    }
                }
                unlock();
                postWriteCleanup();
                return false;
            } finally {
                unlock();
                postWriteCleanup();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @CanIgnoreReturnValue
        public boolean reclaimValue(K k, int i, InterfaceC7517s interfaceC7517s) {
            lock();
            try {
                AtomicReferenceArray<InterfaceC7535b> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                InterfaceC7535b interfaceC7535b = atomicReferenceArray.get(length);
                for (InterfaceC7535b interfaceC7535b2 = interfaceC7535b; interfaceC7535b2 != null; interfaceC7535b2 = interfaceC7535b2.getNext()) {
                    Object key = interfaceC7535b2.getKey();
                    if (interfaceC7535b2.getHash() == i && key != null && this.map.f52880e.equivalent(k, key)) {
                        if (interfaceC7535b2.getValueReference() == interfaceC7517s) {
                            this.modCount++;
                            atomicReferenceArray.set(length, removeValueFromChain(interfaceC7535b, interfaceC7535b2, key, i, interfaceC7517s.get(), interfaceC7517s, RemovalCause.COLLECTED));
                            this.count--;
                            return true;
                        }
                        unlock();
                        if (!isHeldByCurrentThread()) {
                            postWriteCleanup();
                        }
                        return false;
                    }
                }
                unlock();
                if (!isHeldByCurrentThread()) {
                    postWriteCleanup();
                }
                return false;
            } finally {
                unlock();
                if (!isHeldByCurrentThread()) {
                    postWriteCleanup();
                }
            }
        }

        @GuardedBy("this")
        public void recordLockedRead(InterfaceC7535b interfaceC7535b, long j) {
            if (this.map.m41200C()) {
                interfaceC7535b.setAccessTime(j);
            }
            this.accessQueue.add(interfaceC7535b);
        }

        public void recordRead(InterfaceC7535b interfaceC7535b, long j) {
            if (this.map.m41200C()) {
                interfaceC7535b.setAccessTime(j);
            }
            this.recencyQueue.add(interfaceC7535b);
        }

        @GuardedBy("this")
        public void recordWrite(InterfaceC7535b interfaceC7535b, int i, long j) {
            drainRecencyQueue();
            this.totalWeight += i;
            if (this.map.m41200C()) {
                interfaceC7535b.setAccessTime(j);
            }
            if (this.map.m41198E()) {
                interfaceC7535b.setWriteTime(j);
            }
            this.accessQueue.add(interfaceC7535b);
            this.writeQueue.add(interfaceC7535b);
        }

        @CanIgnoreReturnValue
        @CheckForNull
        public V refresh(K k, int i, CacheLoader<? super K, V> cacheLoader, boolean z) {
            C7509k insertLoadingValueReference = insertLoadingValueReference(k, i, z);
            if (insertLoadingValueReference == null) {
                return null;
            }
            ListenableFuture<V> loadAsync = loadAsync(k, i, insertLoadingValueReference, cacheLoader);
            if (loadAsync.isDone()) {
                try {
                    return (V) Uninterruptibles.getUninterruptibly(loadAsync);
                } catch (Throwable unused) {
                }
            }
            return null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:47:0x0038, code lost:
            r9 = r5.getValueReference();
            r12 = (V) r9.get();
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x0040, code lost:
            if (r12 == null) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x0042, code lost:
            r2 = com.google.common.cache.RemovalCause.EXPLICIT;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x0044, code lost:
            r10 = r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x004c, code lost:
            if (r9.isActive() == false) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x004e, code lost:
            r2 = com.google.common.cache.RemovalCause.COLLECTED;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x0051, code lost:
            r11.modCount++;
            r0.set(r1, removeValueFromChain(r4, r5, r6, r13, r12, r9, r10));
            r11.count--;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x0067, code lost:
            unlock();
            postWriteCleanup();
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x006d, code lost:
            return r12;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @javax.annotation.CheckForNull
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public V remove(java.lang.Object r12, int r13) {
            /*
                r11 = this;
                r11.lock()
                com.google.common.cache.LocalCache r0 = r11.map     // Catch: java.lang.Throwable -> L46
                com.google.common.base.Ticker r0 = r0.f52891p     // Catch: java.lang.Throwable -> L46
                long r0 = r0.read()     // Catch: java.lang.Throwable -> L46
                r11.preWriteCleanup(r0)     // Catch: java.lang.Throwable -> L46
                java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.cache.b> r0 = r11.table     // Catch: java.lang.Throwable -> L46
                int r1 = r0.length()     // Catch: java.lang.Throwable -> L46
                int r1 = r1 + (-1)
                r1 = r1 & r13
                java.lang.Object r2 = r0.get(r1)     // Catch: java.lang.Throwable -> L46
                r4 = r2
                com.google.common.cache.b r4 = (com.google.common.cache.InterfaceC7535b) r4     // Catch: java.lang.Throwable -> L46
                r5 = r4
            L1f:
                r2 = 0
                if (r5 == 0) goto L6e
                java.lang.Object r6 = r5.getKey()     // Catch: java.lang.Throwable -> L46
                int r3 = r5.getHash()     // Catch: java.lang.Throwable -> L46
                if (r3 != r13) goto L75
                if (r6 == 0) goto L75
                com.google.common.cache.LocalCache r3 = r11.map     // Catch: java.lang.Throwable -> L46
                com.google.common.base.Equivalence r3 = r3.f52880e     // Catch: java.lang.Throwable -> L46
                boolean r3 = r3.equivalent(r12, r6)     // Catch: java.lang.Throwable -> L46
                if (r3 == 0) goto L75
                com.google.common.cache.LocalCache$s r9 = r5.getValueReference()     // Catch: java.lang.Throwable -> L46
                java.lang.Object r12 = r9.get()     // Catch: java.lang.Throwable -> L46
                if (r12 == 0) goto L48
                com.google.common.cache.RemovalCause r2 = com.google.common.cache.RemovalCause.EXPLICIT     // Catch: java.lang.Throwable -> L46
            L44:
                r10 = r2
                goto L51
            L46:
                r12 = move-exception
                goto L7a
            L48:
                boolean r3 = r9.isActive()     // Catch: java.lang.Throwable -> L46
                if (r3 == 0) goto L6e
                com.google.common.cache.RemovalCause r2 = com.google.common.cache.RemovalCause.COLLECTED     // Catch: java.lang.Throwable -> L46
                goto L44
            L51:
                int r2 = r11.modCount     // Catch: java.lang.Throwable -> L46
                int r2 = r2 + 1
                r11.modCount = r2     // Catch: java.lang.Throwable -> L46
                r3 = r11
                r7 = r13
                r8 = r12
                com.google.common.cache.b r13 = r3.removeValueFromChain(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L46
                int r2 = r11.count     // Catch: java.lang.Throwable -> L46
                int r2 = r2 + (-1)
                r0.set(r1, r13)     // Catch: java.lang.Throwable -> L46
                r11.count = r2     // Catch: java.lang.Throwable -> L46
                r11.unlock()
                r11.postWriteCleanup()
                return r12
            L6e:
                r11.unlock()
                r11.postWriteCleanup()
                return r2
            L75:
                com.google.common.cache.b r5 = r5.getNext()     // Catch: java.lang.Throwable -> L46
                goto L1f
            L7a:
                r11.unlock()
                r11.postWriteCleanup()
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.LocalCache.Segment.remove(java.lang.Object, int):java.lang.Object");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @GuardedBy("this")
        public void removeCollectedEntry(InterfaceC7535b interfaceC7535b) {
            enqueueNotification(interfaceC7535b.getKey(), interfaceC7535b.getHash(), interfaceC7535b.getValueReference().get(), interfaceC7535b.getValueReference().getWeight(), RemovalCause.COLLECTED);
            this.writeQueue.remove(interfaceC7535b);
            this.accessQueue.remove(interfaceC7535b);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @VisibleForTesting
        @CanIgnoreReturnValue
        @GuardedBy("this")
        public boolean removeEntry(InterfaceC7535b interfaceC7535b, int i, RemovalCause removalCause) {
            AtomicReferenceArray<InterfaceC7535b> atomicReferenceArray = this.table;
            int length = (atomicReferenceArray.length() - 1) & i;
            InterfaceC7535b interfaceC7535b2 = atomicReferenceArray.get(length);
            for (InterfaceC7535b interfaceC7535b3 = interfaceC7535b2; interfaceC7535b3 != null; interfaceC7535b3 = interfaceC7535b3.getNext()) {
                if (interfaceC7535b3 == interfaceC7535b) {
                    this.modCount++;
                    atomicReferenceArray.set(length, removeValueFromChain(interfaceC7535b2, interfaceC7535b3, interfaceC7535b3.getKey(), i, interfaceC7535b3.getValueReference().get(), interfaceC7535b3.getValueReference(), removalCause));
                    this.count--;
                    return true;
                }
            }
            return false;
        }

        @CheckForNull
        @GuardedBy("this")
        public InterfaceC7535b removeEntryFromChain(InterfaceC7535b interfaceC7535b, InterfaceC7535b interfaceC7535b2) {
            int i = this.count;
            InterfaceC7535b next = interfaceC7535b2.getNext();
            while (interfaceC7535b != interfaceC7535b2) {
                InterfaceC7535b copyEntry = copyEntry(interfaceC7535b, next);
                if (copyEntry != null) {
                    next = copyEntry;
                } else {
                    removeCollectedEntry(interfaceC7535b);
                    i--;
                }
                interfaceC7535b = interfaceC7535b.getNext();
            }
            this.count = i;
            return next;
        }

        @CanIgnoreReturnValue
        public boolean removeLoadingValue(K k, int i, C7509k c7509k) {
            lock();
            try {
                AtomicReferenceArray<InterfaceC7535b> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                InterfaceC7535b interfaceC7535b = atomicReferenceArray.get(length);
                InterfaceC7535b interfaceC7535b2 = interfaceC7535b;
                while (true) {
                    if (interfaceC7535b2 == null) {
                        break;
                    }
                    Object key = interfaceC7535b2.getKey();
                    if (interfaceC7535b2.getHash() == i && key != null && this.map.f52880e.equivalent(k, key)) {
                        if (interfaceC7535b2.getValueReference() == c7509k) {
                            if (c7509k.isActive()) {
                                interfaceC7535b2.setValueReference(c7509k.m41143h());
                            } else {
                                atomicReferenceArray.set(length, removeEntryFromChain(interfaceC7535b, interfaceC7535b2));
                            }
                            unlock();
                            postWriteCleanup();
                            return true;
                        }
                    } else {
                        interfaceC7535b2 = interfaceC7535b2.getNext();
                    }
                }
                unlock();
                postWriteCleanup();
                return false;
            } catch (Throwable th2) {
                unlock();
                postWriteCleanup();
                throw th2;
            }
        }

        @CheckForNull
        @GuardedBy("this")
        public InterfaceC7535b removeValueFromChain(InterfaceC7535b interfaceC7535b, InterfaceC7535b interfaceC7535b2, @CheckForNull K k, int i, V v, InterfaceC7517s interfaceC7517s, RemovalCause removalCause) {
            enqueueNotification(k, i, v, interfaceC7517s.getWeight(), removalCause);
            this.writeQueue.remove(interfaceC7535b2);
            this.accessQueue.remove(interfaceC7535b2);
            if (interfaceC7517s.isLoading()) {
                interfaceC7517s.mo41137b(null);
                return interfaceC7535b;
            }
            return removeEntryFromChain(interfaceC7535b, interfaceC7535b2);
        }

        /* JADX WARN: Code restructure failed: missing block: B:56:0x0072, code lost:
            return false;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean replace(K r18, int r19, V r20, V r21) {
            /*
                r17 = this;
                r9 = r17
                r0 = r19
                r17.lock()
                com.google.common.cache.LocalCache r1 = r9.map     // Catch: java.lang.Throwable -> L6a
                com.google.common.base.Ticker r1 = r1.f52891p     // Catch: java.lang.Throwable -> L6a
                long r7 = r1.read()     // Catch: java.lang.Throwable -> L6a
                r9.preWriteCleanup(r7)     // Catch: java.lang.Throwable -> L6a
                java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.cache.b> r10 = r9.table     // Catch: java.lang.Throwable -> L6a
                int r1 = r10.length()     // Catch: java.lang.Throwable -> L6a
                r11 = 1
                int r1 = r1 - r11
                r12 = r0 & r1
                java.lang.Object r1 = r10.get(r12)     // Catch: java.lang.Throwable -> L6a
                r2 = r1
                com.google.common.cache.b r2 = (com.google.common.cache.InterfaceC7535b) r2     // Catch: java.lang.Throwable -> L6a
                r13 = r2
            L24:
                r14 = 0
                if (r13 == 0) goto L6c
                java.lang.Object r4 = r13.getKey()     // Catch: java.lang.Throwable -> L6a
                int r1 = r13.getHash()     // Catch: java.lang.Throwable -> L6a
                if (r1 != r0) goto Lb1
                if (r4 == 0) goto Lb1
                com.google.common.cache.LocalCache r1 = r9.map     // Catch: java.lang.Throwable -> L6a
                com.google.common.base.Equivalence r1 = r1.f52880e     // Catch: java.lang.Throwable -> L6a
                r15 = r18
                boolean r1 = r1.equivalent(r15, r4)     // Catch: java.lang.Throwable -> L6a
                if (r1 == 0) goto Lae
                com.google.common.cache.LocalCache$s r16 = r13.getValueReference()     // Catch: java.lang.Throwable -> L6a
                java.lang.Object r6 = r16.get()     // Catch: java.lang.Throwable -> L6a
                if (r6 != 0) goto L73
                boolean r1 = r16.isActive()     // Catch: java.lang.Throwable -> L6a
                if (r1 == 0) goto L6c
                int r1 = r9.modCount     // Catch: java.lang.Throwable -> L6a
                int r1 = r1 + r11
                r9.modCount = r1     // Catch: java.lang.Throwable -> L6a
                com.google.common.cache.RemovalCause r8 = com.google.common.cache.RemovalCause.COLLECTED     // Catch: java.lang.Throwable -> L6a
                r1 = r17
                r3 = r13
                r5 = r19
                r7 = r16
                com.google.common.cache.b r0 = r1.removeValueFromChain(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L6a
                int r1 = r9.count     // Catch: java.lang.Throwable -> L6a
                int r1 = r1 - r11
                r10.set(r12, r0)     // Catch: java.lang.Throwable -> L6a
                r9.count = r1     // Catch: java.lang.Throwable -> L6a
                goto L6c
            L6a:
                r0 = move-exception
                goto Lba
            L6c:
                r17.unlock()
                r17.postWriteCleanup()
                return r14
            L73:
                com.google.common.cache.LocalCache r1 = r9.map     // Catch: java.lang.Throwable -> L6a
                com.google.common.base.Equivalence r1 = r1.f52881f     // Catch: java.lang.Throwable -> L6a
                r3 = r20
                boolean r1 = r1.equivalent(r3, r6)     // Catch: java.lang.Throwable -> L6a
                if (r1 == 0) goto Laa
                int r1 = r9.modCount     // Catch: java.lang.Throwable -> L6a
                int r1 = r1 + r11
                r9.modCount = r1     // Catch: java.lang.Throwable -> L6a
                int r5 = r16.getWeight()     // Catch: java.lang.Throwable -> L6a
                com.google.common.cache.RemovalCause r10 = com.google.common.cache.RemovalCause.REPLACED     // Catch: java.lang.Throwable -> L6a
                r1 = r17
                r2 = r18
                r3 = r19
                r4 = r6
                r6 = r10
                r1.enqueueNotification(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L6a
                r1 = r17
                r2 = r13
                r3 = r18
                r4 = r21
                r5 = r7
                r1.setValue(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L6a
                r9.evictEntries(r13)     // Catch: java.lang.Throwable -> L6a
                r17.unlock()
                r17.postWriteCleanup()
                return r11
            Laa:
                r9.recordLockedRead(r13, r7)     // Catch: java.lang.Throwable -> L6a
                goto L6c
            Lae:
                r3 = r20
                goto Lb4
            Lb1:
                r15 = r18
                goto Lae
            Lb4:
                com.google.common.cache.b r13 = r13.getNext()     // Catch: java.lang.Throwable -> L6a
                goto L24
            Lba:
                r17.unlock()
                r17.postWriteCleanup()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.LocalCache.Segment.replace(java.lang.Object, int, java.lang.Object, java.lang.Object):boolean");
        }

        public void runLockedCleanup(long j) {
            if (tryLock()) {
                try {
                    drainReferenceQueues();
                    expireEntries(j);
                    this.readCount.set(0);
                } finally {
                    unlock();
                }
            }
        }

        public void runUnlockedCleanup() {
            if (!isHeldByCurrentThread()) {
                this.map.m41162z();
            }
        }

        public V scheduleRefresh(InterfaceC7535b interfaceC7535b, K k, int i, V v, long j, CacheLoader<? super K, V> cacheLoader) {
            V refresh;
            if (this.map.m41196G() && j - interfaceC7535b.getWriteTime() > this.map.f52888m && !interfaceC7535b.getValueReference().isLoading() && (refresh = refresh(k, i, cacheLoader, true)) != null) {
                return refresh;
            }
            return v;
        }

        @GuardedBy("this")
        public void setValue(InterfaceC7535b interfaceC7535b, K k, V v, long j) {
            boolean z;
            InterfaceC7517s valueReference = interfaceC7535b.getValueReference();
            int weigh = this.map.f52885j.weigh(k, v);
            if (weigh >= 0) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkState(z, "Weights must be non-negative");
            interfaceC7535b.setValueReference(this.map.f52883h.referenceValue(this, interfaceC7535b, v, weigh));
            recordWrite(interfaceC7535b, weigh, j);
            valueReference.mo41137b(v);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @CanIgnoreReturnValue
        public boolean storeLoadedValue(K k, int i, C7509k c7509k, V v) {
            RemovalCause removalCause;
            lock();
            try {
                long read = this.map.f52891p.read();
                preWriteCleanup(read);
                int i2 = this.count + 1;
                if (i2 > this.threshold) {
                    expand();
                    i2 = this.count + 1;
                }
                int i3 = i2;
                AtomicReferenceArray<InterfaceC7535b> atomicReferenceArray = this.table;
                int length = i & (atomicReferenceArray.length() - 1);
                InterfaceC7535b interfaceC7535b = atomicReferenceArray.get(length);
                InterfaceC7535b interfaceC7535b2 = interfaceC7535b;
                while (true) {
                    if (interfaceC7535b2 != null) {
                        Object key = interfaceC7535b2.getKey();
                        if (interfaceC7535b2.getHash() == i && key != null && this.map.f52880e.equivalent(k, key)) {
                            InterfaceC7517s valueReference = interfaceC7535b2.getValueReference();
                            Object obj = valueReference.get();
                            if (c7509k != valueReference && (obj != null || valueReference == LocalCache.f52874x)) {
                                enqueueNotification(k, i, v, 0, RemovalCause.REPLACED);
                                unlock();
                                postWriteCleanup();
                                return false;
                            }
                            this.modCount++;
                            if (c7509k.isActive()) {
                                if (obj == null) {
                                    removalCause = RemovalCause.COLLECTED;
                                } else {
                                    removalCause = RemovalCause.REPLACED;
                                }
                                enqueueNotification(k, i, obj, c7509k.getWeight(), removalCause);
                                i3--;
                            }
                            setValue(interfaceC7535b2, k, v, read);
                            this.count = i3;
                            evictEntries(interfaceC7535b2);
                        } else {
                            interfaceC7535b2 = interfaceC7535b2.getNext();
                        }
                    } else {
                        this.modCount++;
                        InterfaceC7535b newEntry = newEntry(k, i, interfaceC7535b);
                        setValue(newEntry, k, v, read);
                        atomicReferenceArray.set(length, newEntry);
                        this.count = i3;
                        evictEntries(newEntry);
                        break;
                    }
                }
                unlock();
                postWriteCleanup();
                return true;
            } catch (Throwable th2) {
                unlock();
                postWriteCleanup();
                throw th2;
            }
        }

        public void tryDrainReferenceQueues() {
            if (tryLock()) {
                try {
                    drainReferenceQueues();
                } finally {
                    unlock();
                }
            }
        }

        public void tryExpireEntries(long j) {
            if (tryLock()) {
                try {
                    expireEntries(j);
                } finally {
                    unlock();
                }
            }
        }

        public V waitForLoadingValue(InterfaceC7535b interfaceC7535b, K k, InterfaceC7517s interfaceC7517s) throws ExecutionException {
            if (interfaceC7517s.isLoading()) {
                Preconditions.checkState(!Thread.holdsLock(interfaceC7535b), "Recursive load of: %s", k);
                try {
                    V v = (V) interfaceC7517s.mo41136c();
                    if (v != null) {
                        recordRead(interfaceC7535b, this.map.f52891p.read());
                        return v;
                    }
                    throw new CacheLoader.InvalidCacheLoadException("CacheLoader returned null for key " + k + ".");
                } finally {
                    this.statsCounter.recordMisses(1);
                }
            }
            throw new AssertionError();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @CheckForNull
        public V get(Object obj, int i) {
            try {
                if (this.count != 0) {
                    long read = this.map.f52891p.read();
                    InterfaceC7535b liveEntry = getLiveEntry(obj, i, read);
                    if (liveEntry == null) {
                        return null;
                    }
                    Object obj2 = liveEntry.getValueReference().get();
                    if (obj2 != null) {
                        recordRead(liveEntry, read);
                        return (V) scheduleRefresh(liveEntry, liveEntry.getKey(), i, obj2, read, this.map.f52894s);
                    }
                    tryDrainReferenceQueues();
                }
                return null;
            } finally {
                postReadCleanup();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:50:0x0038, code lost:
            r10 = r6.getValueReference();
            r9 = r10.get();
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x0048, code lost:
            if (r12.map.f52881f.equivalent(r15, r9) == false) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x004a, code lost:
            r13 = com.google.common.cache.RemovalCause.EXPLICIT;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x004f, code lost:
            if (r9 != null) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x0055, code lost:
            if (r10.isActive() == false) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x0057, code lost:
            r13 = com.google.common.cache.RemovalCause.COLLECTED;
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x0059, code lost:
            r12.modCount++;
            r0.set(r1, removeValueFromChain(r5, r6, r7, r14, r9, r10, r13));
            r12.count--;
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x006f, code lost:
            if (r13 != com.google.common.cache.RemovalCause.EXPLICIT) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x0072, code lost:
            r2 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:63:0x0073, code lost:
            unlock();
            postWriteCleanup();
         */
        /* JADX WARN: Code restructure failed: missing block: B:64:0x0079, code lost:
            return r2;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean remove(java.lang.Object r13, int r14, java.lang.Object r15) {
            /*
                r12 = this;
                r12.lock()
                com.google.common.cache.LocalCache r0 = r12.map     // Catch: java.lang.Throwable -> L4d
                com.google.common.base.Ticker r0 = r0.f52891p     // Catch: java.lang.Throwable -> L4d
                long r0 = r0.read()     // Catch: java.lang.Throwable -> L4d
                r12.preWriteCleanup(r0)     // Catch: java.lang.Throwable -> L4d
                java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.cache.b> r0 = r12.table     // Catch: java.lang.Throwable -> L4d
                int r1 = r0.length()     // Catch: java.lang.Throwable -> L4d
                r2 = 1
                int r1 = r1 - r2
                r1 = r1 & r14
                java.lang.Object r3 = r0.get(r1)     // Catch: java.lang.Throwable -> L4d
                r5 = r3
                com.google.common.cache.b r5 = (com.google.common.cache.InterfaceC7535b) r5     // Catch: java.lang.Throwable -> L4d
                r6 = r5
            L1f:
                r3 = 0
                if (r6 == 0) goto L7a
                java.lang.Object r7 = r6.getKey()     // Catch: java.lang.Throwable -> L4d
                int r4 = r6.getHash()     // Catch: java.lang.Throwable -> L4d
                if (r4 != r14) goto L81
                if (r7 == 0) goto L81
                com.google.common.cache.LocalCache r4 = r12.map     // Catch: java.lang.Throwable -> L4d
                com.google.common.base.Equivalence r4 = r4.f52880e     // Catch: java.lang.Throwable -> L4d
                boolean r4 = r4.equivalent(r13, r7)     // Catch: java.lang.Throwable -> L4d
                if (r4 == 0) goto L81
                com.google.common.cache.LocalCache$s r10 = r6.getValueReference()     // Catch: java.lang.Throwable -> L4d
                java.lang.Object r9 = r10.get()     // Catch: java.lang.Throwable -> L4d
                com.google.common.cache.LocalCache r13 = r12.map     // Catch: java.lang.Throwable -> L4d
                com.google.common.base.Equivalence r13 = r13.f52881f     // Catch: java.lang.Throwable -> L4d
                boolean r13 = r13.equivalent(r15, r9)     // Catch: java.lang.Throwable -> L4d
                if (r13 == 0) goto L4f
                com.google.common.cache.RemovalCause r13 = com.google.common.cache.RemovalCause.EXPLICIT     // Catch: java.lang.Throwable -> L4d
                goto L59
            L4d:
                r13 = move-exception
                goto L86
            L4f:
                if (r9 != 0) goto L7a
                boolean r13 = r10.isActive()     // Catch: java.lang.Throwable -> L4d
                if (r13 == 0) goto L7a
                com.google.common.cache.RemovalCause r13 = com.google.common.cache.RemovalCause.COLLECTED     // Catch: java.lang.Throwable -> L4d
            L59:
                int r15 = r12.modCount     // Catch: java.lang.Throwable -> L4d
                int r15 = r15 + r2
                r12.modCount = r15     // Catch: java.lang.Throwable -> L4d
                r4 = r12
                r8 = r14
                r11 = r13
                com.google.common.cache.b r14 = r4.removeValueFromChain(r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L4d
                int r15 = r12.count     // Catch: java.lang.Throwable -> L4d
                int r15 = r15 - r2
                r0.set(r1, r14)     // Catch: java.lang.Throwable -> L4d
                r12.count = r15     // Catch: java.lang.Throwable -> L4d
                com.google.common.cache.RemovalCause r14 = com.google.common.cache.RemovalCause.EXPLICIT     // Catch: java.lang.Throwable -> L4d
                if (r13 != r14) goto L72
                goto L73
            L72:
                r2 = 0
            L73:
                r12.unlock()
                r12.postWriteCleanup()
                return r2
            L7a:
                r12.unlock()
                r12.postWriteCleanup()
                return r3
            L81:
                com.google.common.cache.b r6 = r6.getNext()     // Catch: java.lang.Throwable -> L4d
                goto L1f
            L86:
                r12.unlock()
                r12.postWriteCleanup()
                throw r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.LocalCache.Segment.remove(java.lang.Object, int, java.lang.Object):boolean");
        }

        /* JADX WARN: Code restructure failed: missing block: B:54:0x0075, code lost:
            return null;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @javax.annotation.CheckForNull
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public V replace(K r18, int r19, V r20) {
            /*
                r17 = this;
                r9 = r17
                r0 = r19
                r17.lock()
                com.google.common.cache.LocalCache r1 = r9.map     // Catch: java.lang.Throwable -> L6d
                com.google.common.base.Ticker r1 = r1.f52891p     // Catch: java.lang.Throwable -> L6d
                long r7 = r1.read()     // Catch: java.lang.Throwable -> L6d
                r9.preWriteCleanup(r7)     // Catch: java.lang.Throwable -> L6d
                java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.cache.b> r10 = r9.table     // Catch: java.lang.Throwable -> L6d
                int r1 = r10.length()     // Catch: java.lang.Throwable -> L6d
                int r1 = r1 + (-1)
                r11 = r0 & r1
                java.lang.Object r1 = r10.get(r11)     // Catch: java.lang.Throwable -> L6d
                r2 = r1
                com.google.common.cache.b r2 = (com.google.common.cache.InterfaceC7535b) r2     // Catch: java.lang.Throwable -> L6d
                r12 = r2
            L24:
                r13 = 0
                if (r12 == 0) goto L6f
                java.lang.Object r4 = r12.getKey()     // Catch: java.lang.Throwable -> L6d
                int r1 = r12.getHash()     // Catch: java.lang.Throwable -> L6d
                if (r1 != r0) goto La2
                if (r4 == 0) goto La2
                com.google.common.cache.LocalCache r1 = r9.map     // Catch: java.lang.Throwable -> L6d
                com.google.common.base.Equivalence r1 = r1.f52880e     // Catch: java.lang.Throwable -> L6d
                r14 = r18
                boolean r1 = r1.equivalent(r14, r4)     // Catch: java.lang.Throwable -> L6d
                if (r1 == 0) goto La4
                com.google.common.cache.LocalCache$s r15 = r12.getValueReference()     // Catch: java.lang.Throwable -> L6d
                java.lang.Object r16 = r15.get()     // Catch: java.lang.Throwable -> L6d
                if (r16 != 0) goto L76
                boolean r1 = r15.isActive()     // Catch: java.lang.Throwable -> L6d
                if (r1 == 0) goto L6f
                int r1 = r9.modCount     // Catch: java.lang.Throwable -> L6d
                int r1 = r1 + 1
                r9.modCount = r1     // Catch: java.lang.Throwable -> L6d
                com.google.common.cache.RemovalCause r8 = com.google.common.cache.RemovalCause.COLLECTED     // Catch: java.lang.Throwable -> L6d
                r1 = r17
                r3 = r12
                r5 = r19
                r6 = r16
                r7 = r15
                com.google.common.cache.b r0 = r1.removeValueFromChain(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L6d
                int r1 = r9.count     // Catch: java.lang.Throwable -> L6d
                int r1 = r1 + (-1)
                r10.set(r11, r0)     // Catch: java.lang.Throwable -> L6d
                r9.count = r1     // Catch: java.lang.Throwable -> L6d
                goto L6f
            L6d:
                r0 = move-exception
                goto Laa
            L6f:
                r17.unlock()
                r17.postWriteCleanup()
                return r13
            L76:
                int r1 = r9.modCount     // Catch: java.lang.Throwable -> L6d
                int r1 = r1 + 1
                r9.modCount = r1     // Catch: java.lang.Throwable -> L6d
                int r5 = r15.getWeight()     // Catch: java.lang.Throwable -> L6d
                com.google.common.cache.RemovalCause r6 = com.google.common.cache.RemovalCause.REPLACED     // Catch: java.lang.Throwable -> L6d
                r1 = r17
                r2 = r18
                r3 = r19
                r4 = r16
                r1.enqueueNotification(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L6d
                r1 = r17
                r2 = r12
                r3 = r18
                r4 = r20
                r5 = r7
                r1.setValue(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L6d
                r9.evictEntries(r12)     // Catch: java.lang.Throwable -> L6d
                r17.unlock()
                r17.postWriteCleanup()
                return r16
            La2:
                r14 = r18
            La4:
                com.google.common.cache.b r12 = r12.getNext()     // Catch: java.lang.Throwable -> L6d
                goto L24
            Laa:
                r17.unlock()
                r17.postWriteCleanup()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.LocalCache.Segment.replace(java.lang.Object, int, java.lang.Object):java.lang.Object");
        }
    }
}
