package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Equivalence;
import com.google.common.base.Preconditions;
import com.google.common.collect.MapMaker;
import com.google.common.collect.MapMakerInternalMap.InterfaceC7706h;
import com.google.common.collect.MapMakerInternalMap.Segment;
import com.google.common.primitives.Ints;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.GuardedBy;
import com.google.errorprone.annotations.concurrent.LazyInit;
import com.google.j2objc.annotations.Weak;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;
import javax.annotation.CheckForNull;

/* JADX INFO: Access modifiers changed from: package-private */
@J2ktIncompatible
@GwtIncompatible
/* loaded from: classes4.dex */
public class MapMakerInternalMap<K, V, E extends InterfaceC7706h, S extends Segment<K, V, E, S>> extends AbstractMap<K, V> implements ConcurrentMap<K, V>, Serializable {
    static final int CONTAINS_VALUE_RETRIES = 3;
    static final int DRAIN_MAX = 16;
    static final int DRAIN_THRESHOLD = 63;
    static final int MAXIMUM_CAPACITY = 1073741824;
    static final int MAX_SEGMENTS = 65536;
    static final InterfaceC7731u UNSET_WEAK_VALUE_REFERENCE = new C7699a();
    private static final long serialVersionUID = 5;
    final int concurrencyLevel;
    final transient InterfaceC7707i entryHelper;
    @CheckForNull
    @LazyInit
    transient Set<Map.Entry<K, V>> entrySet;
    final Equivalence<Object> keyEquivalence;
    @CheckForNull
    @LazyInit
    transient Set<K> keySet;
    final transient int segmentMask;
    final transient int segmentShift;
    final transient Segment<K, V, E, S>[] segments;
    @CheckForNull
    @LazyInit
    transient Collection<V> values;

    /* loaded from: classes4.dex */
    public static final class SerializationProxy<K, V> extends AbstractSerializationProxy<K, V> {
        private static final long serialVersionUID = 3;

        public SerializationProxy(Strength strength, Strength strength2, Equivalence<Object> equivalence, Equivalence<Object> equivalence2, int i, ConcurrentMap<K, V> concurrentMap) {
            super(strength, strength2, equivalence, equivalence2, i, concurrentMap);
        }

        @J2ktIncompatible
        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            objectInputStream.defaultReadObject();
            this.delegate = readMapMaker(objectInputStream).makeMap();
            readEntries(objectInputStream);
        }

        private Object readResolve() {
            return this.delegate;
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            writeMapTo(objectOutputStream);
        }
    }

    /* loaded from: classes4.dex */
    public enum Strength {
        STRONG { // from class: com.google.common.collect.MapMakerInternalMap.Strength.1
            @Override // com.google.common.collect.MapMakerInternalMap.Strength
            public Equivalence<Object> defaultEquivalence() {
                return Equivalence.equals();
            }
        },
        WEAK { // from class: com.google.common.collect.MapMakerInternalMap.Strength.2
            @Override // com.google.common.collect.MapMakerInternalMap.Strength
            public Equivalence<Object> defaultEquivalence() {
                return Equivalence.identity();
            }
        };

        public abstract Equivalence<Object> defaultEquivalence();

        /* synthetic */ Strength(C7699a c7699a) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class StrongKeyDummyValueSegment<K> extends Segment<K, MapMaker.Dummy, C7710l, StrongKeyDummyValueSegment<K>> {
        public StrongKeyDummyValueSegment(MapMakerInternalMap<K, MapMaker.Dummy, C7710l, StrongKeyDummyValueSegment<K>> mapMakerInternalMap, int i) {
            super(mapMakerInternalMap, i);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public StrongKeyDummyValueSegment<K> self() {
            return this;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public C7710l castForTesting(InterfaceC7706h interfaceC7706h) {
            return (C7710l) interfaceC7706h;
        }
    }

    /* loaded from: classes4.dex */
    public static final class StrongKeyStrongValueSegment<K, V> extends Segment<K, V, C7713m, StrongKeyStrongValueSegment<K, V>> {
        public StrongKeyStrongValueSegment(MapMakerInternalMap<K, V, C7713m, StrongKeyStrongValueSegment<K, V>> mapMakerInternalMap, int i) {
            super(mapMakerInternalMap, i);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public StrongKeyStrongValueSegment<K, V> self() {
            return this;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        @CheckForNull
        public C7713m castForTesting(@CheckForNull InterfaceC7706h interfaceC7706h) {
            return (C7713m) interfaceC7706h;
        }
    }

    /* loaded from: classes4.dex */
    public static final class StrongKeyWeakValueSegment<K, V> extends Segment<K, V, C7716n, StrongKeyWeakValueSegment<K, V>> {
        private final ReferenceQueue<V> queueForValues;

        public StrongKeyWeakValueSegment(MapMakerInternalMap<K, V, C7716n, StrongKeyWeakValueSegment<K, V>> mapMakerInternalMap, int i) {
            super(mapMakerInternalMap, i);
            this.queueForValues = new ReferenceQueue<>();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public ReferenceQueue<V> getValueReferenceQueueForTesting() {
            return this.queueForValues;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public InterfaceC7731u getWeakValueReferenceForTesting(InterfaceC7706h interfaceC7706h) {
            return castForTesting(interfaceC7706h).getValueReference();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public void maybeClearReferenceQueues() {
            clearReferenceQueue((ReferenceQueue<V>) this.queueForValues);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public void maybeDrainReferenceQueues() {
            drainValueReferenceQueue(this.queueForValues);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public InterfaceC7731u newWeakValueReferenceForTesting(InterfaceC7706h interfaceC7706h, V v) {
            return new C7732v(this.queueForValues, v, castForTesting(interfaceC7706h));
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public StrongKeyWeakValueSegment<K, V> self() {
            return this;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public void setWeakValueReferenceForTesting(InterfaceC7706h interfaceC7706h, InterfaceC7731u interfaceC7731u) {
            C7716n castForTesting = castForTesting(interfaceC7706h);
            InterfaceC7731u interfaceC7731u2 = castForTesting.f53338c;
            castForTesting.f53338c = interfaceC7731u;
            interfaceC7731u2.clear();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        @CheckForNull
        public C7716n castForTesting(@CheckForNull InterfaceC7706h interfaceC7706h) {
            return (C7716n) interfaceC7706h;
        }
    }

    /* loaded from: classes4.dex */
    public static final class WeakKeyDummyValueSegment<K> extends Segment<K, MapMaker.Dummy, C7721q, WeakKeyDummyValueSegment<K>> {
        private final ReferenceQueue<K> queueForKeys;

        public WeakKeyDummyValueSegment(MapMakerInternalMap<K, MapMaker.Dummy, C7721q, WeakKeyDummyValueSegment<K>> mapMakerInternalMap, int i) {
            super(mapMakerInternalMap, i);
            this.queueForKeys = new ReferenceQueue<>();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public ReferenceQueue<K> getKeyReferenceQueueForTesting() {
            return this.queueForKeys;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public void maybeClearReferenceQueues() {
            clearReferenceQueue((ReferenceQueue<K>) this.queueForKeys);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public void maybeDrainReferenceQueues() {
            drainKeyReferenceQueue(this.queueForKeys);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public WeakKeyDummyValueSegment<K> self() {
            return this;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public C7721q castForTesting(InterfaceC7706h interfaceC7706h) {
            return (C7721q) interfaceC7706h;
        }
    }

    /* loaded from: classes4.dex */
    public static final class WeakKeyStrongValueSegment<K, V> extends Segment<K, V, C7724r, WeakKeyStrongValueSegment<K, V>> {
        private final ReferenceQueue<K> queueForKeys;

        public WeakKeyStrongValueSegment(MapMakerInternalMap<K, V, C7724r, WeakKeyStrongValueSegment<K, V>> mapMakerInternalMap, int i) {
            super(mapMakerInternalMap, i);
            this.queueForKeys = new ReferenceQueue<>();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public ReferenceQueue<K> getKeyReferenceQueueForTesting() {
            return this.queueForKeys;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public void maybeClearReferenceQueues() {
            clearReferenceQueue((ReferenceQueue<K>) this.queueForKeys);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public void maybeDrainReferenceQueues() {
            drainKeyReferenceQueue(this.queueForKeys);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public WeakKeyStrongValueSegment<K, V> self() {
            return this;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public C7724r castForTesting(InterfaceC7706h interfaceC7706h) {
            return (C7724r) interfaceC7706h;
        }
    }

    /* loaded from: classes4.dex */
    public static final class WeakKeyWeakValueSegment<K, V> extends Segment<K, V, C7727s, WeakKeyWeakValueSegment<K, V>> {
        private final ReferenceQueue<K> queueForKeys;
        private final ReferenceQueue<V> queueForValues;

        public WeakKeyWeakValueSegment(MapMakerInternalMap<K, V, C7727s, WeakKeyWeakValueSegment<K, V>> mapMakerInternalMap, int i) {
            super(mapMakerInternalMap, i);
            this.queueForKeys = new ReferenceQueue<>();
            this.queueForValues = new ReferenceQueue<>();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public ReferenceQueue<K> getKeyReferenceQueueForTesting() {
            return this.queueForKeys;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public ReferenceQueue<V> getValueReferenceQueueForTesting() {
            return this.queueForValues;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public InterfaceC7731u getWeakValueReferenceForTesting(InterfaceC7706h interfaceC7706h) {
            return castForTesting(interfaceC7706h).getValueReference();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public void maybeClearReferenceQueues() {
            clearReferenceQueue((ReferenceQueue<K>) this.queueForKeys);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public void maybeDrainReferenceQueues() {
            drainKeyReferenceQueue(this.queueForKeys);
            drainValueReferenceQueue(this.queueForValues);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public InterfaceC7731u newWeakValueReferenceForTesting(InterfaceC7706h interfaceC7706h, V v) {
            return new C7732v(this.queueForValues, v, castForTesting(interfaceC7706h));
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public WeakKeyWeakValueSegment<K, V> self() {
            return this;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public void setWeakValueReferenceForTesting(InterfaceC7706h interfaceC7706h, InterfaceC7731u interfaceC7731u) {
            C7727s castForTesting = castForTesting(interfaceC7706h);
            InterfaceC7731u interfaceC7731u2 = castForTesting.f53348b;
            castForTesting.f53348b = interfaceC7731u;
            interfaceC7731u2.clear();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        @CheckForNull
        public C7727s castForTesting(@CheckForNull InterfaceC7706h interfaceC7706h) {
            return (C7727s) interfaceC7706h;
        }
    }

    /* renamed from: com.google.common.collect.MapMakerInternalMap$a */
    /* loaded from: classes4.dex */
    public class C7699a implements InterfaceC7731u {
        @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC7731u
        /* renamed from: a */
        public /* bridge */ /* synthetic */ InterfaceC7706h mo40729a() {
            m40788d();
            return null;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC7731u
        /* renamed from: b */
        public /* bridge */ /* synthetic */ InterfaceC7731u mo40728b(ReferenceQueue referenceQueue, InterfaceC7706h interfaceC7706h) {
            AbstractC22494uj2.m1214a(interfaceC7706h);
            return m40789c(referenceQueue, null);
        }

        /* renamed from: c */
        public InterfaceC7731u m40789c(ReferenceQueue referenceQueue, C7702d c7702d) {
            return this;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC7731u
        public void clear() {
        }

        /* renamed from: d */
        public C7702d m40788d() {
            return null;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC7731u
        public Object get() {
            return null;
        }
    }

    /* renamed from: com.google.common.collect.MapMakerInternalMap$b */
    /* loaded from: classes4.dex */
    public static abstract class AbstractC7700b implements InterfaceC7706h {

        /* renamed from: a */
        public final Object f53318a;

        /* renamed from: b */
        public final int f53319b;

        public AbstractC7700b(Object obj, int i) {
            this.f53318a = obj;
            this.f53319b = i;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC7706h
        public final int getHash() {
            return this.f53319b;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC7706h
        public final Object getKey() {
            return this.f53318a;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC7706h
        public InterfaceC7706h getNext() {
            return null;
        }
    }

    /* renamed from: com.google.common.collect.MapMakerInternalMap$c */
    /* loaded from: classes4.dex */
    public static abstract class AbstractC7701c extends WeakReference implements InterfaceC7706h {

        /* renamed from: a */
        public final int f53320a;

        public AbstractC7701c(ReferenceQueue referenceQueue, Object obj, int i) {
            super(obj, referenceQueue);
            this.f53320a = i;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC7706h
        public final int getHash() {
            return this.f53320a;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC7706h
        public final Object getKey() {
            return get();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC7706h
        public InterfaceC7706h getNext() {
            return null;
        }
    }

    /* renamed from: com.google.common.collect.MapMakerInternalMap$d */
    /* loaded from: classes4.dex */
    public static final class C7702d implements InterfaceC7706h {
    }

    /* renamed from: com.google.common.collect.MapMakerInternalMap$e */
    /* loaded from: classes4.dex */
    public final class C7703e extends AbstractC7705g {
        public C7703e() {
            super();
        }

        @Override // java.util.Iterator
        /* renamed from: f */
        public Map.Entry next() {
            return m40784c();
        }
    }

    /* renamed from: com.google.common.collect.MapMakerInternalMap$f */
    /* loaded from: classes4.dex */
    public final class C7704f extends AbstractSet {
        public C7704f() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            MapMakerInternalMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry;
            Object key;
            Object obj2;
            if (!(obj instanceof Map.Entry) || (key = (entry = (Map.Entry) obj).getKey()) == null || (obj2 = MapMakerInternalMap.this.get(key)) == null || !MapMakerInternalMap.this.valueEquivalence().equivalent(entry.getValue(), obj2)) {
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return MapMakerInternalMap.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new C7703e();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry;
            Object key;
            if (!(obj instanceof Map.Entry) || (key = (entry = (Map.Entry) obj).getKey()) == null || !MapMakerInternalMap.this.remove(key, entry.getValue())) {
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return MapMakerInternalMap.this.size();
        }
    }

    /* renamed from: com.google.common.collect.MapMakerInternalMap$g */
    /* loaded from: classes4.dex */
    public abstract class AbstractC7705g implements Iterator {

        /* renamed from: a */
        public int f53323a;

        /* renamed from: b */
        public int f53324b = -1;

        /* renamed from: c */
        public Segment f53325c;

        /* renamed from: d */
        public AtomicReferenceArray f53326d;

        /* renamed from: e */
        public InterfaceC7706h f53327e;

        /* renamed from: f */
        public C7733w f53328f;

        /* renamed from: g */
        public C7733w f53329g;

        public AbstractC7705g() {
            this.f53323a = MapMakerInternalMap.this.segments.length - 1;
            m40786a();
        }

        /* renamed from: a */
        public final void m40786a() {
            this.f53328f = null;
            if (m40783d() || m40782e()) {
                return;
            }
            while (true) {
                int i = this.f53323a;
                if (i >= 0) {
                    Segment<K, V, E, S>[] segmentArr = MapMakerInternalMap.this.segments;
                    this.f53323a = i - 1;
                    Segment<K, V, E, S> segment = segmentArr[i];
                    this.f53325c = segment;
                    if (segment.count != 0) {
                        AtomicReferenceArray<E> atomicReferenceArray = this.f53325c.table;
                        this.f53326d = atomicReferenceArray;
                        this.f53324b = atomicReferenceArray.length() - 1;
                        if (m40782e()) {
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
        }

        /* renamed from: b */
        public boolean m40785b(InterfaceC7706h interfaceC7706h) {
            try {
                Object key = interfaceC7706h.getKey();
                Object liveValue = MapMakerInternalMap.this.getLiveValue(interfaceC7706h);
                if (liveValue != null) {
                    this.f53328f = new C7733w(key, liveValue);
                    this.f53325c.postReadCleanup();
                    return true;
                }
                this.f53325c.postReadCleanup();
                return false;
            } catch (Throwable th2) {
                this.f53325c.postReadCleanup();
                throw th2;
            }
        }

        /* renamed from: c */
        public C7733w m40784c() {
            C7733w c7733w = this.f53328f;
            if (c7733w != null) {
                this.f53329g = c7733w;
                m40786a();
                return this.f53329g;
            }
            throw new NoSuchElementException();
        }

        /* renamed from: d */
        public boolean m40783d() {
            InterfaceC7706h interfaceC7706h = this.f53327e;
            if (interfaceC7706h == null) {
                return false;
            }
            while (true) {
                this.f53327e = interfaceC7706h.getNext();
                InterfaceC7706h interfaceC7706h2 = this.f53327e;
                if (interfaceC7706h2 != null) {
                    if (m40785b(interfaceC7706h2)) {
                        return true;
                    }
                    interfaceC7706h = this.f53327e;
                } else {
                    return false;
                }
            }
        }

        /* renamed from: e */
        public boolean m40782e() {
            while (true) {
                int i = this.f53324b;
                if (i >= 0) {
                    AtomicReferenceArray atomicReferenceArray = this.f53326d;
                    this.f53324b = i - 1;
                    InterfaceC7706h interfaceC7706h = (InterfaceC7706h) atomicReferenceArray.get(i);
                    this.f53327e = interfaceC7706h;
                    if (interfaceC7706h != null && (m40785b(interfaceC7706h) || m40783d())) {
                        return true;
                    }
                } else {
                    return false;
                }
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f53328f != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            boolean z;
            if (this.f53329g != null) {
                z = true;
            } else {
                z = false;
            }
            AbstractC5406bs.m51811e(z);
            MapMakerInternalMap.this.remove(this.f53329g.getKey());
            this.f53329g = null;
        }
    }

    /* renamed from: com.google.common.collect.MapMakerInternalMap$h */
    /* loaded from: classes4.dex */
    public interface InterfaceC7706h {
        int getHash();

        Object getKey();

        InterfaceC7706h getNext();

        Object getValue();
    }

    /* renamed from: com.google.common.collect.MapMakerInternalMap$i */
    /* loaded from: classes4.dex */
    public interface InterfaceC7707i {
        /* renamed from: a */
        Segment mo40741a(MapMakerInternalMap mapMakerInternalMap, int i);

        /* renamed from: b */
        void mo40740b(Segment segment, InterfaceC7706h interfaceC7706h, Object obj);

        /* renamed from: c */
        Strength mo40739c();

        /* renamed from: d */
        InterfaceC7706h mo40738d(Segment segment, InterfaceC7706h interfaceC7706h, InterfaceC7706h interfaceC7706h2);

        /* renamed from: e */
        Strength mo40737e();

        /* renamed from: f */
        InterfaceC7706h mo40736f(Segment segment, Object obj, int i, InterfaceC7706h interfaceC7706h);
    }

    /* renamed from: com.google.common.collect.MapMakerInternalMap$j */
    /* loaded from: classes4.dex */
    public final class C7708j extends AbstractC7705g {
        public C7708j() {
            super();
        }

        @Override // java.util.Iterator
        public Object next() {
            return m40784c().getKey();
        }
    }

    /* renamed from: com.google.common.collect.MapMakerInternalMap$k */
    /* loaded from: classes4.dex */
    public final class C7709k extends AbstractSet {
        public C7709k() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            MapMakerInternalMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return MapMakerInternalMap.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return MapMakerInternalMap.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new C7708j();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (MapMakerInternalMap.this.remove(obj) != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return MapMakerInternalMap.this.size();
        }
    }

    /* renamed from: com.google.common.collect.MapMakerInternalMap$l */
    /* loaded from: classes4.dex */
    public static class C7710l extends AbstractC7700b implements InterfaceC7706h {

        /* renamed from: com.google.common.collect.MapMakerInternalMap$l$a */
        /* loaded from: classes4.dex */
        public static final class C7711a implements InterfaceC7707i {

            /* renamed from: a */
            public static final C7711a f53333a = new C7711a();

            /* renamed from: h */
            public static C7711a m40779h() {
                return f53333a;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC7707i
            /* renamed from: c */
            public Strength mo40739c() {
                return Strength.STRONG;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC7707i
            /* renamed from: e */
            public Strength mo40737e() {
                return Strength.STRONG;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC7707i
            /* renamed from: g */
            public C7710l mo40738d(StrongKeyDummyValueSegment strongKeyDummyValueSegment, C7710l c7710l, C7710l c7710l2) {
                return mo40736f(strongKeyDummyValueSegment, c7710l.f53318a, c7710l.f53319b, c7710l2);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC7707i
            /* renamed from: i */
            public C7710l mo40736f(StrongKeyDummyValueSegment strongKeyDummyValueSegment, Object obj, int i, C7710l c7710l) {
                if (c7710l == null) {
                    return new C7710l(obj, i, null);
                }
                return new C7712b(obj, i, c7710l);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC7707i
            /* renamed from: j */
            public StrongKeyDummyValueSegment mo40741a(MapMakerInternalMap mapMakerInternalMap, int i) {
                return new StrongKeyDummyValueSegment(mapMakerInternalMap, i);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC7707i
            /* renamed from: k */
            public void mo40740b(StrongKeyDummyValueSegment strongKeyDummyValueSegment, C7710l c7710l, MapMaker.Dummy dummy) {
            }
        }

        /* renamed from: com.google.common.collect.MapMakerInternalMap$l$b */
        /* loaded from: classes4.dex */
        public static final class C7712b extends C7710l {

            /* renamed from: c */
            public final C7710l f53334c;

            public C7712b(Object obj, int i, C7710l c7710l) {
                super(obj, i, null);
                this.f53334c = c7710l;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.AbstractC7700b, com.google.common.collect.MapMakerInternalMap.InterfaceC7706h
            /* renamed from: b */
            public C7710l getNext() {
                return this.f53334c;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.C7710l, com.google.common.collect.MapMakerInternalMap.InterfaceC7706h
            public /* bridge */ /* synthetic */ Object getValue() {
                return super.getValue();
            }
        }

        public /* synthetic */ C7710l(Object obj, int i, C7699a c7699a) {
            this(obj, i);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC7706h
        /* renamed from: a */
        public final MapMaker.Dummy getValue() {
            return MapMaker.Dummy.VALUE;
        }

        public C7710l(Object obj, int i) {
            super(obj, i);
        }
    }

    /* renamed from: com.google.common.collect.MapMakerInternalMap$m */
    /* loaded from: classes4.dex */
    public static class C7713m extends AbstractC7700b implements InterfaceC7706h {

        /* renamed from: c */
        public volatile Object f53335c;

        /* renamed from: com.google.common.collect.MapMakerInternalMap$m$a */
        /* loaded from: classes4.dex */
        public static final class C7714a implements InterfaceC7707i {

            /* renamed from: a */
            public static final C7714a f53336a = new C7714a();

            /* renamed from: h */
            public static C7714a m40771h() {
                return f53336a;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC7707i
            /* renamed from: c */
            public Strength mo40739c() {
                return Strength.STRONG;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC7707i
            /* renamed from: e */
            public Strength mo40737e() {
                return Strength.STRONG;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC7707i
            /* renamed from: g */
            public C7713m mo40738d(StrongKeyStrongValueSegment strongKeyStrongValueSegment, C7713m c7713m, C7713m c7713m2) {
                C7713m mo40736f = mo40736f(strongKeyStrongValueSegment, c7713m.f53318a, c7713m.f53319b, c7713m2);
                mo40736f.f53335c = c7713m.f53335c;
                return mo40736f;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC7707i
            /* renamed from: i */
            public C7713m mo40736f(StrongKeyStrongValueSegment strongKeyStrongValueSegment, Object obj, int i, C7713m c7713m) {
                if (c7713m == null) {
                    return new C7713m(obj, i, null);
                }
                return new C7715b(obj, i, c7713m);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC7707i
            /* renamed from: j */
            public StrongKeyStrongValueSegment mo40741a(MapMakerInternalMap mapMakerInternalMap, int i) {
                return new StrongKeyStrongValueSegment(mapMakerInternalMap, i);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC7707i
            /* renamed from: k */
            public void mo40740b(StrongKeyStrongValueSegment strongKeyStrongValueSegment, C7713m c7713m, Object obj) {
                c7713m.f53335c = obj;
            }
        }

        /* renamed from: com.google.common.collect.MapMakerInternalMap$m$b */
        /* loaded from: classes4.dex */
        public static final class C7715b extends C7713m {

            /* renamed from: d */
            public final C7713m f53337d;

            public C7715b(Object obj, int i, C7713m c7713m) {
                super(obj, i, null);
                this.f53337d = c7713m;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.AbstractC7700b, com.google.common.collect.MapMakerInternalMap.InterfaceC7706h
            /* renamed from: c */
            public C7713m getNext() {
                return this.f53337d;
            }
        }

        public /* synthetic */ C7713m(Object obj, int i, C7699a c7699a) {
            this(obj, i);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC7706h
        public final Object getValue() {
            return this.f53335c;
        }

        public C7713m(Object obj, int i) {
            super(obj, i);
            this.f53335c = null;
        }
    }

    /* renamed from: com.google.common.collect.MapMakerInternalMap$n */
    /* loaded from: classes4.dex */
    public static class C7716n extends AbstractC7700b implements InterfaceC7730t {

        /* renamed from: c */
        public volatile InterfaceC7731u f53338c;

        /* renamed from: com.google.common.collect.MapMakerInternalMap$n$a */
        /* loaded from: classes4.dex */
        public static final class C7717a implements InterfaceC7707i {

            /* renamed from: a */
            public static final C7717a f53339a = new C7717a();

            /* renamed from: h */
            public static C7717a m40763h() {
                return f53339a;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC7707i
            /* renamed from: c */
            public Strength mo40739c() {
                return Strength.STRONG;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC7707i
            /* renamed from: e */
            public Strength mo40737e() {
                return Strength.WEAK;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC7707i
            /* renamed from: g */
            public C7716n mo40738d(StrongKeyWeakValueSegment strongKeyWeakValueSegment, C7716n c7716n, C7716n c7716n2) {
                if (Segment.isCollected(c7716n)) {
                    return null;
                }
                C7716n mo40736f = mo40736f(strongKeyWeakValueSegment, c7716n.f53318a, c7716n.f53319b, c7716n2);
                mo40736f.f53338c = c7716n.f53338c.mo40728b(strongKeyWeakValueSegment.queueForValues, mo40736f);
                return mo40736f;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC7707i
            /* renamed from: i */
            public C7716n mo40736f(StrongKeyWeakValueSegment strongKeyWeakValueSegment, Object obj, int i, C7716n c7716n) {
                if (c7716n == null) {
                    return new C7716n(obj, i, null);
                }
                return new C7718b(obj, i, c7716n);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC7707i
            /* renamed from: j */
            public StrongKeyWeakValueSegment mo40741a(MapMakerInternalMap mapMakerInternalMap, int i) {
                return new StrongKeyWeakValueSegment(mapMakerInternalMap, i);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC7707i
            /* renamed from: k */
            public void mo40740b(StrongKeyWeakValueSegment strongKeyWeakValueSegment, C7716n c7716n, Object obj) {
                InterfaceC7731u interfaceC7731u = c7716n.f53338c;
                c7716n.f53338c = new C7732v(strongKeyWeakValueSegment.queueForValues, obj, c7716n);
                interfaceC7731u.clear();
            }
        }

        /* renamed from: com.google.common.collect.MapMakerInternalMap$n$b */
        /* loaded from: classes4.dex */
        public static final class C7718b extends C7716n {

            /* renamed from: d */
            public final C7716n f53340d;

            public C7718b(Object obj, int i, C7716n c7716n) {
                super(obj, i, null);
                this.f53340d = c7716n;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.AbstractC7700b, com.google.common.collect.MapMakerInternalMap.InterfaceC7706h
            /* renamed from: c */
            public C7716n getNext() {
                return this.f53340d;
            }
        }

        public /* synthetic */ C7716n(Object obj, int i, C7699a c7699a) {
            this(obj, i);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC7706h
        public final Object getValue() {
            return this.f53338c.get();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC7730t
        public final InterfaceC7731u getValueReference() {
            return this.f53338c;
        }

        public C7716n(Object obj, int i) {
            super(obj, i);
            this.f53338c = MapMakerInternalMap.unsetWeakValueReference();
        }
    }

    /* renamed from: com.google.common.collect.MapMakerInternalMap$o */
    /* loaded from: classes4.dex */
    public final class C7719o extends AbstractC7705g {
        public C7719o() {
            super();
        }

        @Override // java.util.Iterator
        public Object next() {
            return m40784c().getValue();
        }
    }

    /* renamed from: com.google.common.collect.MapMakerInternalMap$p */
    /* loaded from: classes4.dex */
    public final class C7720p extends AbstractCollection {
        public C7720p() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            MapMakerInternalMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return MapMakerInternalMap.this.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return MapMakerInternalMap.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return new C7719o();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return MapMakerInternalMap.this.size();
        }
    }

    /* renamed from: com.google.common.collect.MapMakerInternalMap$q */
    /* loaded from: classes4.dex */
    public static class C7721q extends AbstractC7701c implements InterfaceC7706h {

        /* renamed from: com.google.common.collect.MapMakerInternalMap$q$a */
        /* loaded from: classes4.dex */
        public static final class C7722a implements InterfaceC7707i {

            /* renamed from: a */
            public static final C7722a f53343a = new C7722a();

            /* renamed from: h */
            public static C7722a m40756h() {
                return f53343a;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC7707i
            /* renamed from: c */
            public Strength mo40739c() {
                return Strength.WEAK;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC7707i
            /* renamed from: e */
            public Strength mo40737e() {
                return Strength.STRONG;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC7707i
            /* renamed from: g */
            public C7721q mo40738d(WeakKeyDummyValueSegment weakKeyDummyValueSegment, C7721q c7721q, C7721q c7721q2) {
                Object key = c7721q.getKey();
                if (key == null) {
                    return null;
                }
                return mo40736f(weakKeyDummyValueSegment, key, c7721q.f53320a, c7721q2);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC7707i
            /* renamed from: i */
            public C7721q mo40736f(WeakKeyDummyValueSegment weakKeyDummyValueSegment, Object obj, int i, C7721q c7721q) {
                if (c7721q == null) {
                    return new C7721q(weakKeyDummyValueSegment.queueForKeys, obj, i, null);
                }
                return new C7723b(weakKeyDummyValueSegment.queueForKeys, obj, i, c7721q, null);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC7707i
            /* renamed from: j */
            public WeakKeyDummyValueSegment mo40741a(MapMakerInternalMap mapMakerInternalMap, int i) {
                return new WeakKeyDummyValueSegment(mapMakerInternalMap, i);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC7707i
            /* renamed from: k */
            public void mo40740b(WeakKeyDummyValueSegment weakKeyDummyValueSegment, C7721q c7721q, MapMaker.Dummy dummy) {
            }
        }

        /* renamed from: com.google.common.collect.MapMakerInternalMap$q$b */
        /* loaded from: classes4.dex */
        public static final class C7723b extends C7721q {

            /* renamed from: b */
            public final C7721q f53344b;

            public /* synthetic */ C7723b(ReferenceQueue referenceQueue, Object obj, int i, C7721q c7721q, C7699a c7699a) {
                this(referenceQueue, obj, i, c7721q);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.AbstractC7701c, com.google.common.collect.MapMakerInternalMap.InterfaceC7706h
            /* renamed from: b */
            public C7721q getNext() {
                return this.f53344b;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.C7721q, com.google.common.collect.MapMakerInternalMap.InterfaceC7706h
            public /* bridge */ /* synthetic */ Object getValue() {
                return super.getValue();
            }

            public C7723b(ReferenceQueue referenceQueue, Object obj, int i, C7721q c7721q) {
                super(referenceQueue, obj, i, null);
                this.f53344b = c7721q;
            }
        }

        public /* synthetic */ C7721q(ReferenceQueue referenceQueue, Object obj, int i, C7699a c7699a) {
            this(referenceQueue, obj, i);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC7706h
        /* renamed from: a */
        public final MapMaker.Dummy getValue() {
            return MapMaker.Dummy.VALUE;
        }

        public C7721q(ReferenceQueue referenceQueue, Object obj, int i) {
            super(referenceQueue, obj, i);
        }
    }

    /* renamed from: com.google.common.collect.MapMakerInternalMap$r */
    /* loaded from: classes4.dex */
    public static class C7724r extends AbstractC7701c implements InterfaceC7706h {

        /* renamed from: b */
        public volatile Object f53345b;

        /* renamed from: com.google.common.collect.MapMakerInternalMap$r$a */
        /* loaded from: classes4.dex */
        public static final class C7725a implements InterfaceC7707i {

            /* renamed from: a */
            public static final C7725a f53346a = new C7725a();

            /* renamed from: h */
            public static C7725a m40748h() {
                return f53346a;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC7707i
            /* renamed from: c */
            public Strength mo40739c() {
                return Strength.WEAK;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC7707i
            /* renamed from: e */
            public Strength mo40737e() {
                return Strength.STRONG;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC7707i
            /* renamed from: g */
            public C7724r mo40738d(WeakKeyStrongValueSegment weakKeyStrongValueSegment, C7724r c7724r, C7724r c7724r2) {
                Object key = c7724r.getKey();
                if (key == null) {
                    return null;
                }
                C7724r mo40736f = mo40736f(weakKeyStrongValueSegment, key, c7724r.f53320a, c7724r2);
                mo40736f.f53345b = c7724r.f53345b;
                return mo40736f;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC7707i
            /* renamed from: i */
            public C7724r mo40736f(WeakKeyStrongValueSegment weakKeyStrongValueSegment, Object obj, int i, C7724r c7724r) {
                if (c7724r == null) {
                    return new C7724r(weakKeyStrongValueSegment.queueForKeys, obj, i, null);
                }
                return new C7726b(weakKeyStrongValueSegment.queueForKeys, obj, i, c7724r, null);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC7707i
            /* renamed from: j */
            public WeakKeyStrongValueSegment mo40741a(MapMakerInternalMap mapMakerInternalMap, int i) {
                return new WeakKeyStrongValueSegment(mapMakerInternalMap, i);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC7707i
            /* renamed from: k */
            public void mo40740b(WeakKeyStrongValueSegment weakKeyStrongValueSegment, C7724r c7724r, Object obj) {
                c7724r.f53345b = obj;
            }
        }

        /* renamed from: com.google.common.collect.MapMakerInternalMap$r$b */
        /* loaded from: classes4.dex */
        public static final class C7726b extends C7724r {

            /* renamed from: c */
            public final C7724r f53347c;

            public /* synthetic */ C7726b(ReferenceQueue referenceQueue, Object obj, int i, C7724r c7724r, C7699a c7699a) {
                this(referenceQueue, obj, i, c7724r);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.AbstractC7701c, com.google.common.collect.MapMakerInternalMap.InterfaceC7706h
            /* renamed from: c */
            public C7724r getNext() {
                return this.f53347c;
            }

            public C7726b(ReferenceQueue referenceQueue, Object obj, int i, C7724r c7724r) {
                super(referenceQueue, obj, i, null);
                this.f53347c = c7724r;
            }
        }

        public /* synthetic */ C7724r(ReferenceQueue referenceQueue, Object obj, int i, C7699a c7699a) {
            this(referenceQueue, obj, i);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC7706h
        public final Object getValue() {
            return this.f53345b;
        }

        public C7724r(ReferenceQueue referenceQueue, Object obj, int i) {
            super(referenceQueue, obj, i);
            this.f53345b = null;
        }
    }

    /* renamed from: com.google.common.collect.MapMakerInternalMap$s */
    /* loaded from: classes4.dex */
    public static class C7727s extends AbstractC7701c implements InterfaceC7730t {

        /* renamed from: b */
        public volatile InterfaceC7731u f53348b;

        /* renamed from: com.google.common.collect.MapMakerInternalMap$s$a */
        /* loaded from: classes4.dex */
        public static final class C7728a implements InterfaceC7707i {

            /* renamed from: a */
            public static final C7728a f53349a = new C7728a();

            /* renamed from: h */
            public static C7728a m40734h() {
                return f53349a;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC7707i
            /* renamed from: c */
            public Strength mo40739c() {
                return Strength.WEAK;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC7707i
            /* renamed from: e */
            public Strength mo40737e() {
                return Strength.WEAK;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC7707i
            /* renamed from: g */
            public C7727s mo40738d(WeakKeyWeakValueSegment weakKeyWeakValueSegment, C7727s c7727s, C7727s c7727s2) {
                Object key = c7727s.getKey();
                if (key == null || Segment.isCollected(c7727s)) {
                    return null;
                }
                C7727s mo40736f = mo40736f(weakKeyWeakValueSegment, key, c7727s.f53320a, c7727s2);
                mo40736f.f53348b = c7727s.f53348b.mo40728b(weakKeyWeakValueSegment.queueForValues, mo40736f);
                return mo40736f;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC7707i
            /* renamed from: i */
            public C7727s mo40736f(WeakKeyWeakValueSegment weakKeyWeakValueSegment, Object obj, int i, C7727s c7727s) {
                if (c7727s == null) {
                    return new C7727s(weakKeyWeakValueSegment.queueForKeys, obj, i);
                }
                return new C7729b(weakKeyWeakValueSegment.queueForKeys, obj, i, c7727s);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC7707i
            /* renamed from: j */
            public WeakKeyWeakValueSegment mo40741a(MapMakerInternalMap mapMakerInternalMap, int i) {
                return new WeakKeyWeakValueSegment(mapMakerInternalMap, i);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC7707i
            /* renamed from: k */
            public void mo40740b(WeakKeyWeakValueSegment weakKeyWeakValueSegment, C7727s c7727s, Object obj) {
                InterfaceC7731u interfaceC7731u = c7727s.f53348b;
                c7727s.f53348b = new C7732v(weakKeyWeakValueSegment.queueForValues, obj, c7727s);
                interfaceC7731u.clear();
            }
        }

        /* renamed from: com.google.common.collect.MapMakerInternalMap$s$b */
        /* loaded from: classes4.dex */
        public static final class C7729b extends C7727s {

            /* renamed from: c */
            public final C7727s f53350c;

            public C7729b(ReferenceQueue referenceQueue, Object obj, int i, C7727s c7727s) {
                super(referenceQueue, obj, i);
                this.f53350c = c7727s;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.AbstractC7701c, com.google.common.collect.MapMakerInternalMap.InterfaceC7706h
            /* renamed from: c */
            public C7727s getNext() {
                return this.f53350c;
            }
        }

        public C7727s(ReferenceQueue referenceQueue, Object obj, int i) {
            super(referenceQueue, obj, i);
            this.f53348b = MapMakerInternalMap.unsetWeakValueReference();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC7706h
        public final Object getValue() {
            return this.f53348b.get();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC7730t
        public final InterfaceC7731u getValueReference() {
            return this.f53348b;
        }
    }

    /* renamed from: com.google.common.collect.MapMakerInternalMap$t */
    /* loaded from: classes4.dex */
    public interface InterfaceC7730t extends InterfaceC7706h {
        InterfaceC7731u getValueReference();
    }

    /* renamed from: com.google.common.collect.MapMakerInternalMap$u */
    /* loaded from: classes4.dex */
    public interface InterfaceC7731u {
        /* renamed from: a */
        InterfaceC7706h mo40729a();

        /* renamed from: b */
        InterfaceC7731u mo40728b(ReferenceQueue referenceQueue, InterfaceC7706h interfaceC7706h);

        void clear();

        Object get();
    }

    /* renamed from: com.google.common.collect.MapMakerInternalMap$v */
    /* loaded from: classes4.dex */
    public static final class C7732v extends WeakReference implements InterfaceC7731u {

        /* renamed from: a */
        public final InterfaceC7706h f53351a;

        public C7732v(ReferenceQueue referenceQueue, Object obj, InterfaceC7706h interfaceC7706h) {
            super(obj, referenceQueue);
            this.f53351a = interfaceC7706h;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC7731u
        /* renamed from: a */
        public InterfaceC7706h mo40729a() {
            return this.f53351a;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC7731u
        /* renamed from: b */
        public InterfaceC7731u mo40728b(ReferenceQueue referenceQueue, InterfaceC7706h interfaceC7706h) {
            return new C7732v(referenceQueue, get(), interfaceC7706h);
        }
    }

    /* renamed from: com.google.common.collect.MapMakerInternalMap$w */
    /* loaded from: classes4.dex */
    public final class C7733w extends AbstractC1646X {

        /* renamed from: a */
        public final Object f53352a;

        /* renamed from: b */
        public Object f53353b;

        public C7733w(Object obj, Object obj2) {
            this.f53352a = obj;
            this.f53353b = obj2;
        }

        @Override // p000.AbstractC1646X, java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (!this.f53352a.equals(entry.getKey()) || !this.f53353b.equals(entry.getValue())) {
                return false;
            }
            return true;
        }

        @Override // p000.AbstractC1646X, java.util.Map.Entry
        public Object getKey() {
            return this.f53352a;
        }

        @Override // p000.AbstractC1646X, java.util.Map.Entry
        public Object getValue() {
            return this.f53353b;
        }

        @Override // p000.AbstractC1646X, java.util.Map.Entry
        public int hashCode() {
            return this.f53352a.hashCode() ^ this.f53353b.hashCode();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.AbstractC1646X, java.util.Map.Entry
        public Object setValue(Object obj) {
            Object put = MapMakerInternalMap.this.put(this.f53352a, obj);
            this.f53353b = obj;
            return put;
        }
    }

    private MapMakerInternalMap(MapMaker mapMaker, InterfaceC7707i interfaceC7707i) {
        this.concurrencyLevel = Math.min(mapMaker.m40797a(), 65536);
        this.keyEquivalence = mapMaker.m40795c();
        this.entryHelper = interfaceC7707i;
        int min = Math.min(mapMaker.m40796b(), 1073741824);
        int i = 0;
        int i2 = 1;
        int i3 = 1;
        int i4 = 0;
        while (i3 < this.concurrencyLevel) {
            i4++;
            i3 <<= 1;
        }
        this.segmentShift = 32 - i4;
        this.segmentMask = i3 - 1;
        this.segments = newSegmentArray(i3);
        int i5 = min / i3;
        while (i2 < (i3 * i5 < min ? i5 + 1 : i5)) {
            i2 <<= 1;
        }
        while (true) {
            Segment<K, V, E, S>[] segmentArr = this.segments;
            if (i < segmentArr.length) {
                segmentArr[i] = createSegment(i2);
                i++;
            } else {
                return;
            }
        }
    }

    public static <K, V> MapMakerInternalMap<K, V, ? extends InterfaceC7706h, ?> create(MapMaker mapMaker) {
        Strength m40794d = mapMaker.m40794d();
        Strength strength = Strength.STRONG;
        if (m40794d == strength && mapMaker.m40793e() == strength) {
            return new MapMakerInternalMap<>(mapMaker, C7713m.C7714a.m40771h());
        }
        if (mapMaker.m40794d() == strength && mapMaker.m40793e() == Strength.WEAK) {
            return new MapMakerInternalMap<>(mapMaker, C7716n.C7717a.m40763h());
        }
        Strength m40794d2 = mapMaker.m40794d();
        Strength strength2 = Strength.WEAK;
        if (m40794d2 == strength2 && mapMaker.m40793e() == strength) {
            return new MapMakerInternalMap<>(mapMaker, C7724r.C7725a.m40748h());
        }
        if (mapMaker.m40794d() == strength2 && mapMaker.m40793e() == strength2) {
            return new MapMakerInternalMap<>(mapMaker, C7727s.C7728a.m40734h());
        }
        throw new AssertionError();
    }

    public static <K> MapMakerInternalMap<K, MapMaker.Dummy, ? extends InterfaceC7706h, ?> createWithDummyValues(MapMaker mapMaker) {
        Strength m40794d = mapMaker.m40794d();
        Strength strength = Strength.STRONG;
        if (m40794d == strength && mapMaker.m40793e() == strength) {
            return new MapMakerInternalMap<>(mapMaker, C7710l.C7711a.m40779h());
        }
        Strength m40794d2 = mapMaker.m40794d();
        Strength strength2 = Strength.WEAK;
        if (m40794d2 == strength2 && mapMaker.m40793e() == strength) {
            return new MapMakerInternalMap<>(mapMaker, C7721q.C7722a.m40756h());
        }
        if (mapMaker.m40793e() == strength2) {
            throw new IllegalArgumentException("Map cannot have both weak and dummy values");
        }
        throw new AssertionError();
    }

    @J2ktIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializationProxy");
    }

    public static int rehash(int i) {
        int i2 = i + ((i << 15) ^ (-12931));
        int i3 = i2 ^ (i2 >>> 10);
        int i4 = i3 + (i3 << 3);
        int i5 = i4 ^ (i4 >>> 6);
        int i6 = i5 + (i5 << 2) + (i5 << 14);
        return i6 ^ (i6 >>> 16);
    }

    public static <K, V, E extends InterfaceC7706h> InterfaceC7731u unsetWeakValueReference() {
        return UNSET_WEAK_VALUE_REFERENCE;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        for (Segment<K, V, E, S> segment : this.segments) {
            segment.clear();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(@CheckForNull Object obj) {
        if (obj == null) {
            return false;
        }
        int hash = hash(obj);
        return segmentFor(hash).containsKey(obj, hash);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(@CheckForNull Object obj) {
        if (obj == null) {
            return false;
        }
        Segment<K, V, E, S>[] segmentArr = this.segments;
        long j = -1;
        int i = 0;
        while (i < 3) {
            long j2 = 0;
            for (StrongKeyDummyValueSegment strongKeyDummyValueSegment : segmentArr) {
                int i2 = strongKeyDummyValueSegment.count;
                AtomicReferenceArray<E> atomicReferenceArray = strongKeyDummyValueSegment.table;
                for (int i3 = 0; i3 < atomicReferenceArray.length(); i3++) {
                    for (E e = atomicReferenceArray.get(i3); e != null; e = e.getNext()) {
                        Object liveValue = strongKeyDummyValueSegment.getLiveValue(e);
                        if (liveValue != null && valueEquivalence().equivalent(obj, liveValue)) {
                            return true;
                        }
                    }
                }
                j2 += strongKeyDummyValueSegment.modCount;
            }
            if (j2 == j) {
                return false;
            }
            i++;
            j = j2;
        }
        return false;
    }

    @VisibleForTesting
    public E copyEntry(E e, E e2) {
        return segmentFor(e.getHash()).copyEntry(e, e2);
    }

    public Segment<K, V, E, S> createSegment(int i) {
        return this.entryHelper.mo40741a(this, i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.entrySet;
        if (set == null) {
            C7704f c7704f = new C7704f();
            this.entrySet = c7704f;
            return c7704f;
        }
        return set;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CheckForNull
    public V get(@CheckForNull Object obj) {
        if (obj == null) {
            return null;
        }
        int hash = hash(obj);
        return segmentFor(hash).get(obj, hash);
    }

    @CheckForNull
    public E getEntry(@CheckForNull Object obj) {
        if (obj == null) {
            return null;
        }
        int hash = hash(obj);
        return segmentFor(hash).getEntry(obj, hash);
    }

    @CheckForNull
    public V getLiveValue(E e) {
        if (e.getKey() == null) {
            return null;
        }
        return (V) e.getValue();
    }

    public int hash(Object obj) {
        return rehash(this.keyEquivalence.hash(obj));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        Segment<K, V, E, S>[] segmentArr = this.segments;
        long j = 0;
        for (int i = 0; i < segmentArr.length; i++) {
            if (segmentArr[i].count != 0) {
                return false;
            }
            j += segmentArr[i].modCount;
        }
        if (j == 0) {
            return true;
        }
        for (int i2 = 0; i2 < segmentArr.length; i2++) {
            if (segmentArr[i2].count != 0) {
                return false;
            }
            j -= segmentArr[i2].modCount;
        }
        if (j != 0) {
            return false;
        }
        return true;
    }

    @VisibleForTesting
    public boolean isLiveForTesting(InterfaceC7706h interfaceC7706h) {
        if (segmentFor(interfaceC7706h.getHash()).getLiveValueForTesting(interfaceC7706h) != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.keySet;
        if (set == null) {
            C7709k c7709k = new C7709k();
            this.keySet = c7709k;
            return c7709k;
        }
        return set;
    }

    @VisibleForTesting
    public Strength keyStrength() {
        return this.entryHelper.mo40739c();
    }

    public final Segment<K, V, E, S>[] newSegmentArray(int i) {
        return new Segment[i];
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CanIgnoreReturnValue
    @CheckForNull
    public V put(K k, V v) {
        Preconditions.checkNotNull(k);
        Preconditions.checkNotNull(v);
        int hash = hash(k);
        return segmentFor(hash).put(k, hash, v, false);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @CanIgnoreReturnValue
    @CheckForNull
    public V putIfAbsent(K k, V v) {
        Preconditions.checkNotNull(k);
        Preconditions.checkNotNull(v);
        int hash = hash(k);
        return segmentFor(hash).put(k, hash, v, true);
    }

    public void reclaimKey(E e) {
        int hash = e.getHash();
        segmentFor(hash).reclaimKey(e, hash);
    }

    public void reclaimValue(InterfaceC7731u interfaceC7731u) {
        InterfaceC7706h mo40729a = interfaceC7731u.mo40729a();
        int hash = mo40729a.getHash();
        segmentFor(hash).reclaimValue((K) mo40729a.getKey(), hash, interfaceC7731u);
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CanIgnoreReturnValue
    @CheckForNull
    public V remove(@CheckForNull Object obj) {
        if (obj == null) {
            return null;
        }
        int hash = hash(obj);
        return segmentFor(hash).remove(obj, hash);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @CanIgnoreReturnValue
    public boolean replace(K k, @CheckForNull V v, V v2) {
        Preconditions.checkNotNull(k);
        Preconditions.checkNotNull(v2);
        if (v == null) {
            return false;
        }
        int hash = hash(k);
        return segmentFor(hash).replace(k, hash, v, v2);
    }

    public Segment<K, V, E, S> segmentFor(int i) {
        return this.segments[(i >>> this.segmentShift) & this.segmentMask];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        long j = 0;
        for (Segment<K, V, E, S> segment : this.segments) {
            j += segment.count;
        }
        return Ints.saturatedCast(j);
    }

    @VisibleForTesting
    public Equivalence<Object> valueEquivalence() {
        return this.entryHelper.mo40737e().defaultEquivalence();
    }

    @VisibleForTesting
    public Strength valueStrength() {
        return this.entryHelper.mo40737e();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        Collection<V> collection = this.values;
        if (collection == null) {
            C7720p c7720p = new C7720p();
            this.values = c7720p;
            return c7720p;
        }
        return collection;
    }

    public Object writeReplace() {
        return new SerializationProxy(this.entryHelper.mo40739c(), this.entryHelper.mo40737e(), this.keyEquivalence, this.entryHelper.mo40737e().defaultEquivalence(), this.concurrencyLevel, this);
    }

    /* loaded from: classes4.dex */
    public static abstract class AbstractSerializationProxy<K, V> extends ForwardingConcurrentMap<K, V> implements Serializable {
        private static final long serialVersionUID = 3;
        final int concurrencyLevel;
        transient ConcurrentMap<K, V> delegate;
        final Equivalence<Object> keyEquivalence;
        final Strength keyStrength;
        final Equivalence<Object> valueEquivalence;
        final Strength valueStrength;

        public AbstractSerializationProxy(Strength strength, Strength strength2, Equivalence<Object> equivalence, Equivalence<Object> equivalence2, int i, ConcurrentMap<K, V> concurrentMap) {
            this.keyStrength = strength;
            this.valueStrength = strength2;
            this.keyEquivalence = equivalence;
            this.valueEquivalence = equivalence2;
            this.concurrencyLevel = i;
            this.delegate = concurrentMap;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @J2ktIncompatible
        public void readEntries(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            while (true) {
                Object readObject = objectInputStream.readObject();
                if (readObject == null) {
                    return;
                }
                this.delegate.put(readObject, objectInputStream.readObject());
            }
        }

        @J2ktIncompatible
        public MapMaker readMapMaker(ObjectInputStream objectInputStream) throws IOException {
            return new MapMaker().initialCapacity(objectInputStream.readInt()).m40791g(this.keyStrength).m40790h(this.valueStrength).m40792f(this.keyEquivalence).concurrencyLevel(this.concurrencyLevel);
        }

        public void writeMapTo(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.writeInt(this.delegate.size());
            for (Map.Entry<K, V> entry : this.delegate.entrySet()) {
                objectOutputStream.writeObject(entry.getKey());
                objectOutputStream.writeObject(entry.getValue());
            }
            objectOutputStream.writeObject(null);
        }

        @Override // com.google.common.collect.ForwardingConcurrentMap, com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
        public ConcurrentMap<K, V> delegate() {
            return this.delegate;
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @CanIgnoreReturnValue
    public boolean remove(@CheckForNull Object obj, @CheckForNull Object obj2) {
        if (obj == null || obj2 == null) {
            return false;
        }
        int hash = hash(obj);
        return segmentFor(hash).remove(obj, hash, obj2);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @CanIgnoreReturnValue
    @CheckForNull
    public V replace(K k, V v) {
        Preconditions.checkNotNull(k);
        Preconditions.checkNotNull(v);
        int hash = hash(k);
        return segmentFor(hash).replace(k, hash, v);
    }

    /* loaded from: classes4.dex */
    public static abstract class Segment<K, V, E extends InterfaceC7706h, S extends Segment<K, V, E, S>> extends ReentrantLock {
        volatile int count;
        @Weak
        final MapMakerInternalMap<K, V, E, S> map;
        int modCount;
        final AtomicInteger readCount = new AtomicInteger();
        @CheckForNull
        volatile AtomicReferenceArray<E> table;
        int threshold;

        public Segment(MapMakerInternalMap<K, V, E, S> mapMakerInternalMap, int i) {
            this.map = mapMakerInternalMap;
            initTable(newEntryArray(i));
        }

        public static <K, V, E extends InterfaceC7706h> boolean isCollected(E e) {
            if (e.getValue() == null) {
                return true;
            }
            return false;
        }

        public abstract E castForTesting(InterfaceC7706h interfaceC7706h);

        public void clear() {
            if (this.count != 0) {
                lock();
                try {
                    AtomicReferenceArray<E> atomicReferenceArray = this.table;
                    for (int i = 0; i < atomicReferenceArray.length(); i++) {
                        atomicReferenceArray.set(i, null);
                    }
                    maybeClearReferenceQueues();
                    this.readCount.set(0);
                    this.modCount++;
                    this.count = 0;
                    unlock();
                } catch (Throwable th2) {
                    unlock();
                    throw th2;
                }
            }
        }

        public <T> void clearReferenceQueue(ReferenceQueue<T> referenceQueue) {
            do {
            } while (referenceQueue.poll() != null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @CanIgnoreReturnValue
        public boolean clearValueForTesting(K k, int i, InterfaceC7731u interfaceC7731u) {
            lock();
            try {
                AtomicReferenceArray<E> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                E e = atomicReferenceArray.get(length);
                for (InterfaceC7706h interfaceC7706h = e; interfaceC7706h != null; interfaceC7706h = interfaceC7706h.getNext()) {
                    Object key = interfaceC7706h.getKey();
                    if (interfaceC7706h.getHash() == i && key != null && this.map.keyEquivalence.equivalent(k, key)) {
                        if (((InterfaceC7730t) interfaceC7706h).getValueReference() != interfaceC7731u) {
                            return false;
                        }
                        atomicReferenceArray.set(length, removeFromChain(e, interfaceC7706h));
                        return true;
                    }
                }
                return false;
            } finally {
                unlock();
            }
        }

        public boolean containsKey(Object obj, int i) {
            try {
                boolean z = false;
                if (this.count == 0) {
                    return false;
                }
                E liveEntry = getLiveEntry(obj, i);
                if (liveEntry != null) {
                    if (liveEntry.getValue() != null) {
                        z = true;
                    }
                }
                return z;
            } finally {
                postReadCleanup();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @VisibleForTesting
        public boolean containsValue(Object obj) {
            try {
                if (this.count != 0) {
                    AtomicReferenceArray<E> atomicReferenceArray = this.table;
                    int length = atomicReferenceArray.length();
                    for (int i = 0; i < length; i++) {
                        for (E e = atomicReferenceArray.get(i); e != null; e = e.getNext()) {
                            Object liveValue = getLiveValue(e);
                            if (liveValue != null && this.map.valueEquivalence().equivalent(obj, liveValue)) {
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

        @CheckForNull
        public E copyEntry(E e, E e2) {
            return (E) this.map.entryHelper.mo40738d(self(), e, e2);
        }

        public E copyForTesting(InterfaceC7706h interfaceC7706h, @CheckForNull InterfaceC7706h interfaceC7706h2) {
            return (E) this.map.entryHelper.mo40738d(self(), castForTesting(interfaceC7706h), castForTesting(interfaceC7706h2));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @GuardedBy("this")
        public void drainKeyReferenceQueue(ReferenceQueue<K> referenceQueue) {
            int i = 0;
            do {
                Reference<? extends K> poll = referenceQueue.poll();
                if (poll != null) {
                    this.map.reclaimKey((InterfaceC7706h) poll);
                    i++;
                } else {
                    return;
                }
            } while (i != 16);
        }

        @GuardedBy("this")
        public void drainValueReferenceQueue(ReferenceQueue<V> referenceQueue) {
            int i = 0;
            do {
                Reference<? extends V> poll = referenceQueue.poll();
                if (poll != null) {
                    this.map.reclaimValue((InterfaceC7731u) poll);
                    i++;
                } else {
                    return;
                }
            } while (i != 16);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @GuardedBy("this")
        public void expand() {
            AtomicReferenceArray<E> atomicReferenceArray = this.table;
            int length = atomicReferenceArray.length();
            if (length >= 1073741824) {
                return;
            }
            int i = this.count;
            AtomicReferenceArray<E> atomicReferenceArray2 = (AtomicReferenceArray<E>) newEntryArray(length << 1);
            this.threshold = (atomicReferenceArray2.length() * 3) / 4;
            int length2 = atomicReferenceArray2.length() - 1;
            for (int i2 = 0; i2 < length; i2++) {
                E e = atomicReferenceArray.get(i2);
                if (e != null) {
                    InterfaceC7706h next = e.getNext();
                    int hash = e.getHash() & length2;
                    if (next == null) {
                        atomicReferenceArray2.set(hash, e);
                    } else {
                        InterfaceC7706h interfaceC7706h = e;
                        while (next != null) {
                            int hash2 = next.getHash() & length2;
                            if (hash2 != hash) {
                                interfaceC7706h = next;
                                hash = hash2;
                            }
                            next = next.getNext();
                        }
                        atomicReferenceArray2.set(hash, interfaceC7706h);
                        while (e != interfaceC7706h) {
                            int hash3 = e.getHash() & length2;
                            InterfaceC7706h copyEntry = copyEntry(e, (InterfaceC7706h) atomicReferenceArray2.get(hash3));
                            if (copyEntry != null) {
                                atomicReferenceArray2.set(hash3, copyEntry);
                            } else {
                                i--;
                            }
                            e = e.getNext();
                        }
                    }
                }
            }
            this.table = atomicReferenceArray2;
            this.count = i;
        }

        @CheckForNull
        public V get(Object obj, int i) {
            try {
                E liveEntry = getLiveEntry(obj, i);
                if (liveEntry == null) {
                    postReadCleanup();
                    return null;
                }
                V v = (V) liveEntry.getValue();
                if (v == null) {
                    tryDrainReferenceQueues();
                }
                return v;
            } finally {
                postReadCleanup();
            }
        }

        @CheckForNull
        public E getEntry(Object obj, int i) {
            if (this.count != 0) {
                for (E first = getFirst(i); first != null; first = (E) first.getNext()) {
                    if (first.getHash() == i) {
                        Object key = first.getKey();
                        if (key == null) {
                            tryDrainReferenceQueues();
                        } else if (this.map.keyEquivalence.equivalent(obj, key)) {
                            return first;
                        }
                    }
                }
                return null;
            }
            return null;
        }

        @CheckForNull
        public E getFirst(int i) {
            AtomicReferenceArray<E> atomicReferenceArray = this.table;
            return atomicReferenceArray.get(i & (atomicReferenceArray.length() - 1));
        }

        public ReferenceQueue<K> getKeyReferenceQueueForTesting() {
            throw new AssertionError();
        }

        @CheckForNull
        public E getLiveEntry(Object obj, int i) {
            return getEntry(obj, i);
        }

        @CheckForNull
        public V getLiveValue(E e) {
            if (e.getKey() == null) {
                tryDrainReferenceQueues();
                return null;
            }
            V v = (V) e.getValue();
            if (v == null) {
                tryDrainReferenceQueues();
                return null;
            }
            return v;
        }

        @CheckForNull
        public V getLiveValueForTesting(InterfaceC7706h interfaceC7706h) {
            return getLiveValue(castForTesting(interfaceC7706h));
        }

        public ReferenceQueue<V> getValueReferenceQueueForTesting() {
            throw new AssertionError();
        }

        public InterfaceC7731u getWeakValueReferenceForTesting(InterfaceC7706h interfaceC7706h) {
            throw new AssertionError();
        }

        public void initTable(AtomicReferenceArray<E> atomicReferenceArray) {
            this.threshold = (atomicReferenceArray.length() * 3) / 4;
            this.table = atomicReferenceArray;
        }

        public void maybeClearReferenceQueues() {
        }

        @GuardedBy("this")
        public void maybeDrainReferenceQueues() {
        }

        public AtomicReferenceArray<E> newEntryArray(int i) {
            return new AtomicReferenceArray<>(i);
        }

        public E newEntryForTesting(K k, int i, @CheckForNull InterfaceC7706h interfaceC7706h) {
            return (E) this.map.entryHelper.mo40736f(self(), k, i, castForTesting(interfaceC7706h));
        }

        public InterfaceC7731u newWeakValueReferenceForTesting(InterfaceC7706h interfaceC7706h, V v) {
            throw new AssertionError();
        }

        public void postReadCleanup() {
            if ((this.readCount.incrementAndGet() & 63) == 0) {
                runCleanup();
            }
        }

        @GuardedBy("this")
        public void preWriteCleanup() {
            runLockedCleanup();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @CheckForNull
        public V put(K k, int i, V v, boolean z) {
            lock();
            try {
                preWriteCleanup();
                int i2 = this.count + 1;
                if (i2 > this.threshold) {
                    expand();
                    i2 = this.count + 1;
                }
                AtomicReferenceArray<E> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                InterfaceC7706h interfaceC7706h = (InterfaceC7706h) atomicReferenceArray.get(length);
                for (InterfaceC7706h interfaceC7706h2 = interfaceC7706h; interfaceC7706h2 != null; interfaceC7706h2 = interfaceC7706h2.getNext()) {
                    Object key = interfaceC7706h2.getKey();
                    if (interfaceC7706h2.getHash() == i && key != null && this.map.keyEquivalence.equivalent(k, key)) {
                        V v2 = (V) interfaceC7706h2.getValue();
                        if (v2 == null) {
                            this.modCount++;
                            setValue(interfaceC7706h2, v);
                            this.count = this.count;
                            unlock();
                            return null;
                        } else if (z) {
                            unlock();
                            return v2;
                        } else {
                            this.modCount++;
                            setValue(interfaceC7706h2, v);
                            unlock();
                            return v2;
                        }
                    }
                }
                this.modCount++;
                InterfaceC7706h mo40736f = this.map.entryHelper.mo40736f(self(), k, i, interfaceC7706h);
                setValue(mo40736f, v);
                atomicReferenceArray.set(length, mo40736f);
                this.count = i2;
                unlock();
                return null;
            } catch (Throwable th2) {
                unlock();
                throw th2;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @CanIgnoreReturnValue
        public boolean reclaimKey(E e, int i) {
            lock();
            try {
                AtomicReferenceArray<E> atomicReferenceArray = this.table;
                int length = i & (atomicReferenceArray.length() - 1);
                E e2 = atomicReferenceArray.get(length);
                for (InterfaceC7706h interfaceC7706h = e2; interfaceC7706h != null; interfaceC7706h = interfaceC7706h.getNext()) {
                    if (interfaceC7706h == e) {
                        this.modCount++;
                        atomicReferenceArray.set(length, removeFromChain(e2, interfaceC7706h));
                        this.count--;
                        return true;
                    }
                }
                unlock();
                return false;
            } finally {
                unlock();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @CanIgnoreReturnValue
        public boolean reclaimValue(K k, int i, InterfaceC7731u interfaceC7731u) {
            lock();
            try {
                AtomicReferenceArray<E> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                E e = atomicReferenceArray.get(length);
                for (InterfaceC7706h interfaceC7706h = e; interfaceC7706h != null; interfaceC7706h = interfaceC7706h.getNext()) {
                    Object key = interfaceC7706h.getKey();
                    if (interfaceC7706h.getHash() == i && key != null && this.map.keyEquivalence.equivalent(k, key)) {
                        if (((InterfaceC7730t) interfaceC7706h).getValueReference() != interfaceC7731u) {
                            return false;
                        }
                        this.modCount++;
                        atomicReferenceArray.set(length, removeFromChain(e, interfaceC7706h));
                        this.count--;
                        return true;
                    }
                }
                return false;
            } finally {
                unlock();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @CanIgnoreReturnValue
        @CheckForNull
        public V remove(Object obj, int i) {
            lock();
            try {
                preWriteCleanup();
                AtomicReferenceArray<E> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                E e = atomicReferenceArray.get(length);
                for (InterfaceC7706h interfaceC7706h = e; interfaceC7706h != null; interfaceC7706h = interfaceC7706h.getNext()) {
                    Object key = interfaceC7706h.getKey();
                    if (interfaceC7706h.getHash() == i && key != null && this.map.keyEquivalence.equivalent(obj, key)) {
                        V v = (V) interfaceC7706h.getValue();
                        if (v == null && !isCollected(interfaceC7706h)) {
                            return null;
                        }
                        this.modCount++;
                        atomicReferenceArray.set(length, removeFromChain(e, interfaceC7706h));
                        this.count--;
                        return v;
                    }
                }
                return null;
            } finally {
                unlock();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @GuardedBy("this")
        public boolean removeEntryForTesting(E e) {
            int hash = e.getHash();
            AtomicReferenceArray<E> atomicReferenceArray = this.table;
            int length = hash & (atomicReferenceArray.length() - 1);
            E e2 = atomicReferenceArray.get(length);
            for (InterfaceC7706h interfaceC7706h = e2; interfaceC7706h != null; interfaceC7706h = interfaceC7706h.getNext()) {
                if (interfaceC7706h == e) {
                    this.modCount++;
                    atomicReferenceArray.set(length, removeFromChain(e2, interfaceC7706h));
                    this.count--;
                    return true;
                }
            }
            return false;
        }

        @CheckForNull
        @GuardedBy("this")
        public E removeFromChain(E e, E e2) {
            int i = this.count;
            E e3 = (E) e2.getNext();
            while (e != e2) {
                E copyEntry = copyEntry(e, e3);
                if (copyEntry != null) {
                    e3 = copyEntry;
                } else {
                    i--;
                }
                e = (E) e.getNext();
            }
            this.count = i;
            return e3;
        }

        @CheckForNull
        public E removeFromChainForTesting(InterfaceC7706h interfaceC7706h, InterfaceC7706h interfaceC7706h2) {
            return removeFromChain(castForTesting(interfaceC7706h), castForTesting(interfaceC7706h2));
        }

        @CanIgnoreReturnValue
        public boolean removeTableEntryForTesting(InterfaceC7706h interfaceC7706h) {
            return removeEntryForTesting(castForTesting(interfaceC7706h));
        }

        /* JADX WARN: Multi-variable type inference failed */
        public boolean replace(K k, int i, V v, V v2) {
            lock();
            try {
                preWriteCleanup();
                AtomicReferenceArray<E> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                E e = atomicReferenceArray.get(length);
                for (InterfaceC7706h interfaceC7706h = e; interfaceC7706h != null; interfaceC7706h = interfaceC7706h.getNext()) {
                    Object key = interfaceC7706h.getKey();
                    if (interfaceC7706h.getHash() == i && key != null && this.map.keyEquivalence.equivalent(k, key)) {
                        Object value = interfaceC7706h.getValue();
                        if (value == null) {
                            if (isCollected(interfaceC7706h)) {
                                this.modCount++;
                                atomicReferenceArray.set(length, removeFromChain(e, interfaceC7706h));
                                this.count--;
                            }
                            return false;
                        } else if (this.map.valueEquivalence().equivalent(v, value)) {
                            this.modCount++;
                            setValue(interfaceC7706h, v2);
                            return true;
                        } else {
                            return false;
                        }
                    }
                }
                return false;
            } finally {
                unlock();
            }
        }

        public void runCleanup() {
            runLockedCleanup();
        }

        public void runLockedCleanup() {
            if (tryLock()) {
                try {
                    maybeDrainReferenceQueues();
                    this.readCount.set(0);
                } finally {
                    unlock();
                }
            }
        }

        public abstract S self();

        public void setTableEntryForTesting(int i, InterfaceC7706h interfaceC7706h) {
            this.table.set(i, castForTesting(interfaceC7706h));
        }

        public void setValue(E e, V v) {
            this.map.entryHelper.mo40740b(self(), e, v);
        }

        public void setValueForTesting(InterfaceC7706h interfaceC7706h, V v) {
            this.map.entryHelper.mo40740b(self(), castForTesting(interfaceC7706h), v);
        }

        public void setWeakValueReferenceForTesting(InterfaceC7706h interfaceC7706h, InterfaceC7731u interfaceC7731u) {
            throw new AssertionError();
        }

        public void tryDrainReferenceQueues() {
            if (tryLock()) {
                try {
                    maybeDrainReferenceQueues();
                } finally {
                    unlock();
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
            if (r8.map.valueEquivalence().equivalent(r11, r4.getValue()) == false) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x003f, code lost:
            r5 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:
            if (isCollected(r4) == false) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0047, code lost:
            r8.modCount++;
            r0.set(r1, removeFromChain(r3, r4));
            r8.count--;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x005b, code lost:
            return r5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0061, code lost:
            return false;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean remove(java.lang.Object r9, int r10, java.lang.Object r11) {
            /*
                r8 = this;
                r8.lock()
                r8.preWriteCleanup()     // Catch: java.lang.Throwable -> L5c
                java.util.concurrent.atomic.AtomicReferenceArray<E extends com.google.common.collect.MapMakerInternalMap$h> r0 = r8.table     // Catch: java.lang.Throwable -> L5c
                int r1 = r0.length()     // Catch: java.lang.Throwable -> L5c
                r2 = 1
                int r1 = r1 - r2
                r1 = r1 & r10
                java.lang.Object r3 = r0.get(r1)     // Catch: java.lang.Throwable -> L5c
                com.google.common.collect.MapMakerInternalMap$h r3 = (com.google.common.collect.MapMakerInternalMap.InterfaceC7706h) r3     // Catch: java.lang.Throwable -> L5c
                r4 = r3
            L16:
                r5 = 0
                if (r4 == 0) goto L67
                java.lang.Object r6 = r4.getKey()     // Catch: java.lang.Throwable -> L5c
                int r7 = r4.getHash()     // Catch: java.lang.Throwable -> L5c
                if (r7 != r10) goto L62
                if (r6 == 0) goto L62
                com.google.common.collect.MapMakerInternalMap<K, V, E extends com.google.common.collect.MapMakerInternalMap$h, S extends com.google.common.collect.MapMakerInternalMap$Segment<K, V, E, S>> r7 = r8.map     // Catch: java.lang.Throwable -> L5c
                com.google.common.base.Equivalence<java.lang.Object> r7 = r7.keyEquivalence     // Catch: java.lang.Throwable -> L5c
                boolean r6 = r7.equivalent(r9, r6)     // Catch: java.lang.Throwable -> L5c
                if (r6 == 0) goto L62
                java.lang.Object r9 = r4.getValue()     // Catch: java.lang.Throwable -> L5c
                com.google.common.collect.MapMakerInternalMap<K, V, E extends com.google.common.collect.MapMakerInternalMap$h, S extends com.google.common.collect.MapMakerInternalMap$Segment<K, V, E, S>> r10 = r8.map     // Catch: java.lang.Throwable -> L5c
                com.google.common.base.Equivalence r10 = r10.valueEquivalence()     // Catch: java.lang.Throwable -> L5c
                boolean r9 = r10.equivalent(r11, r9)     // Catch: java.lang.Throwable -> L5c
                if (r9 == 0) goto L41
                r5 = 1
                goto L47
            L41:
                boolean r9 = isCollected(r4)     // Catch: java.lang.Throwable -> L5c
                if (r9 == 0) goto L5e
            L47:
                int r9 = r8.modCount     // Catch: java.lang.Throwable -> L5c
                int r9 = r9 + r2
                r8.modCount = r9     // Catch: java.lang.Throwable -> L5c
                com.google.common.collect.MapMakerInternalMap$h r9 = r8.removeFromChain(r3, r4)     // Catch: java.lang.Throwable -> L5c
                int r10 = r8.count     // Catch: java.lang.Throwable -> L5c
                int r10 = r10 - r2
                r0.set(r1, r9)     // Catch: java.lang.Throwable -> L5c
                r8.count = r10     // Catch: java.lang.Throwable -> L5c
                r8.unlock()
                return r5
            L5c:
                r9 = move-exception
                goto L6b
            L5e:
                r8.unlock()
                return r5
            L62:
                com.google.common.collect.MapMakerInternalMap$h r4 = r4.getNext()     // Catch: java.lang.Throwable -> L5c
                goto L16
            L67:
                r8.unlock()
                return r5
            L6b:
                r8.unlock()
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.MapMakerInternalMap.Segment.remove(java.lang.Object, int, java.lang.Object):boolean");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @CheckForNull
        public V replace(K k, int i, V v) {
            lock();
            try {
                preWriteCleanup();
                AtomicReferenceArray<E> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                E e = atomicReferenceArray.get(length);
                for (InterfaceC7706h interfaceC7706h = e; interfaceC7706h != null; interfaceC7706h = interfaceC7706h.getNext()) {
                    Object key = interfaceC7706h.getKey();
                    if (interfaceC7706h.getHash() == i && key != null && this.map.keyEquivalence.equivalent(k, key)) {
                        V v2 = (V) interfaceC7706h.getValue();
                        if (v2 == null) {
                            if (isCollected(interfaceC7706h)) {
                                this.modCount++;
                                atomicReferenceArray.set(length, removeFromChain(e, interfaceC7706h));
                                this.count--;
                            }
                            return null;
                        }
                        this.modCount++;
                        setValue(interfaceC7706h, v);
                        return v2;
                    }
                }
                return null;
            } finally {
                unlock();
            }
        }
    }
}
