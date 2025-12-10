package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableCollection;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import com.google.errorprone.annotations.DoNotMock;
import com.google.errorprone.annotations.concurrent.LazyInit;
import com.google.j2objc.annotations.RetainedWith;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.SortedMap;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collector;
import javax.annotation.CheckForNull;

@DoNotMock("Use ImmutableMap.of or another implementation")
@GwtCompatible(emulated = true, serializable = true)
/* loaded from: classes4.dex */
public abstract class ImmutableMap<K, V> implements Map<K, V>, Serializable {
    static final Map.Entry<?, ?>[] EMPTY_ENTRY_ARRAY = new Map.Entry[0];
    private static final long serialVersionUID = 912559;
    @RetainedWith
    @CheckForNull
    @LazyInit
    private transient ImmutableSet<Map.Entry<K, V>> entrySet;
    @RetainedWith
    @CheckForNull
    @LazyInit
    private transient ImmutableSet<K> keySet;
    @CheckForNull
    @LazyInit
    private transient ImmutableSetMultimap<K, V> multimapView;
    @RetainedWith
    @CheckForNull
    @LazyInit
    private transient ImmutableCollection<V> values;

    @DoNotMock
    /* loaded from: classes4.dex */
    public static class Builder<K, V> {

        /* renamed from: a */
        public Comparator f53143a;

        /* renamed from: b */
        public Object[] f53144b;

        /* renamed from: c */
        public int f53145c;

        /* renamed from: d */
        public boolean f53146d;

        /* renamed from: e */
        public C7624a f53147e;

        /* renamed from: com.google.common.collect.ImmutableMap$Builder$a */
        /* loaded from: classes4.dex */
        public static final class C7624a {

            /* renamed from: a */
            public final Object f53148a;

            /* renamed from: b */
            public final Object f53149b;

            /* renamed from: c */
            public final Object f53150c;

            public C7624a(Object obj, Object obj2, Object obj3) {
                this.f53148a = obj;
                this.f53149b = obj2;
                this.f53150c = obj3;
            }

            /* renamed from: a */
            public IllegalArgumentException m40960a() {
                return new IllegalArgumentException("Multiple entries with same key: " + this.f53148a + "=" + this.f53149b + " and " + this.f53148a + "=" + this.f53150c);
            }
        }

        public Builder() {
            this(4);
        }

        /* renamed from: c */
        private void m40963c(int i) {
            int i2 = i * 2;
            Object[] objArr = this.f53144b;
            if (i2 > objArr.length) {
                this.f53144b = Arrays.copyOf(objArr, ImmutableCollection.Builder.m41001a(objArr.length, i2));
                this.f53146d = false;
            }
        }

        /* renamed from: e */
        public static void m40961e(Object[] objArr, int i, Comparator comparator) {
            Map.Entry[] entryArr = new Map.Entry[i];
            for (int i2 = 0; i2 < i; i2++) {
                int i3 = i2 * 2;
                Object obj = objArr[i3];
                Objects.requireNonNull(obj);
                Object obj2 = objArr[i3 + 1];
                Objects.requireNonNull(obj2);
                entryArr[i2] = new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }
            Arrays.sort(entryArr, 0, i, Ordering.from(comparator).onResultOf(Maps.m40711Q()));
            for (int i4 = 0; i4 < i; i4++) {
                int i5 = i4 * 2;
                objArr[i5] = entryArr[i4].getKey();
                objArr[i5 + 1] = entryArr[i4].getValue();
            }
        }

        /* renamed from: a */
        public final ImmutableMap m40965a(boolean z) {
            Object[] objArr;
            C7624a c7624a;
            C7624a c7624a2;
            if (z && (c7624a2 = this.f53147e) != null) {
                throw c7624a2.m40960a();
            }
            int i = this.f53145c;
            if (this.f53143a == null) {
                objArr = this.f53144b;
            } else {
                if (this.f53146d) {
                    this.f53144b = Arrays.copyOf(this.f53144b, i * 2);
                }
                objArr = this.f53144b;
                if (!z) {
                    objArr = m40962d(objArr, this.f53145c);
                    if (objArr.length < this.f53144b.length) {
                        i = objArr.length >>> 1;
                    }
                }
                m40961e(objArr, i, this.f53143a);
            }
            this.f53146d = true;
            RegularImmutableMap create = RegularImmutableMap.create(i, objArr, this);
            if (z && (c7624a = this.f53147e) != null) {
                throw c7624a.m40960a();
            }
            return create;
        }

        /* renamed from: b */
        public Builder mo40964b(Builder builder) {
            Preconditions.checkNotNull(builder);
            m40963c(this.f53145c + builder.f53145c);
            System.arraycopy(builder.f53144b, 0, this.f53144b, this.f53145c * 2, builder.f53145c * 2);
            this.f53145c += builder.f53145c;
            return this;
        }

        public ImmutableMap<K, V> build() {
            return buildOrThrow();
        }

        public ImmutableMap<K, V> buildKeepingLast() {
            return m40965a(false);
        }

        public ImmutableMap<K, V> buildOrThrow() {
            return m40965a(true);
        }

        /* renamed from: d */
        public final Object[] m40962d(Object[] objArr, int i) {
            HashSet hashSet = new HashSet();
            BitSet bitSet = new BitSet();
            for (int i2 = i - 1; i2 >= 0; i2--) {
                Object obj = objArr[i2 * 2];
                Objects.requireNonNull(obj);
                if (!hashSet.add(obj)) {
                    bitSet.set(i2);
                }
            }
            if (bitSet.isEmpty()) {
                return objArr;
            }
            Object[] objArr2 = new Object[(i - bitSet.cardinality()) * 2];
            int i3 = 0;
            int i4 = 0;
            while (i3 < i * 2) {
                if (bitSet.get(i3 >>> 1)) {
                    i3 += 2;
                } else {
                    int i5 = i4 + 1;
                    int i6 = i3 + 1;
                    Object obj2 = objArr[i3];
                    Objects.requireNonNull(obj2);
                    objArr2[i4] = obj2;
                    i4 += 2;
                    i3 += 2;
                    Object obj3 = objArr[i6];
                    Objects.requireNonNull(obj3);
                    objArr2[i5] = obj3;
                }
            }
            return objArr2;
        }

        @CanIgnoreReturnValue
        public Builder<K, V> orderEntriesByValue(Comparator<? super V> comparator) {
            boolean z;
            if (this.f53143a == null) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkState(z, "valueComparator was already set");
            this.f53143a = (Comparator) Preconditions.checkNotNull(comparator, "valueComparator");
            return this;
        }

        @CanIgnoreReturnValue
        public Builder<K, V> put(K k, V v) {
            m40963c(this.f53145c + 1);
            AbstractC5406bs.m51815a(k, v);
            Object[] objArr = this.f53144b;
            int i = this.f53145c;
            objArr[i * 2] = k;
            objArr[(i * 2) + 1] = v;
            this.f53145c = i + 1;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder<K, V> putAll(Map<? extends K, ? extends V> map) {
            return putAll(map.entrySet());
        }

        public Builder(int i) {
            this.f53144b = new Object[i * 2];
            this.f53145c = 0;
            this.f53146d = false;
        }

        @CanIgnoreReturnValue
        public Builder<K, V> putAll(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            if (iterable instanceof Collection) {
                m40963c(this.f53145c + ((Collection) iterable).size());
            }
            for (Map.Entry<? extends K, ? extends V> entry : iterable) {
                put(entry);
            }
            return this;
        }

        @CanIgnoreReturnValue
        public Builder<K, V> put(Map.Entry<? extends K, ? extends V> entry) {
            return put(entry.getKey(), entry.getValue());
        }
    }

    /* loaded from: classes4.dex */
    public static abstract class IteratorBasedImmutableMap<K, V> extends ImmutableMap<K, V> {
        @Override // com.google.common.collect.ImmutableMap
        public ImmutableSet<Map.Entry<K, V>> createEntrySet() {
            return new ImmutableMapEntrySet<K, V>() { // from class: com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap.1EntrySetImpl
                {
                    IteratorBasedImmutableMap.this = this;
                }

                @Override // com.google.common.collect.ImmutableMapEntrySet
                public ImmutableMap<K, V> map() {
                    return IteratorBasedImmutableMap.this;
                }

                @Override // com.google.common.collect.ImmutableMapEntrySet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
                @J2ktIncompatible
                @GwtIncompatible
                public Object writeReplace() {
                    return super.writeReplace();
                }

                @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
                public UnmodifiableIterator<Map.Entry<K, V>> iterator() {
                    return IteratorBasedImmutableMap.this.entryIterator();
                }
            };
        }

        @Override // com.google.common.collect.ImmutableMap
        public ImmutableSet<K> createKeySet() {
            return new ImmutableMapKeySet(this);
        }

        @Override // com.google.common.collect.ImmutableMap
        public ImmutableCollection<V> createValues() {
            return new ImmutableMapValues(this);
        }

        public abstract UnmodifiableIterator<Map.Entry<K, V>> entryIterator();

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public /* bridge */ /* synthetic */ Set entrySet() {
            return super.entrySet();
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public /* bridge */ /* synthetic */ Set keySet() {
            return super.keySet();
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map, com.google.common.collect.BiMap
        public /* bridge */ /* synthetic */ Collection values() {
            return super.values();
        }

        @Override // com.google.common.collect.ImmutableMap
        @J2ktIncompatible
        @GwtIncompatible
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    /* loaded from: classes4.dex */
    public final class MapViewOfValuesAsSingletonSets extends IteratorBasedImmutableMap<K, ImmutableSet<V>> {

        /* renamed from: com.google.common.collect.ImmutableMap$MapViewOfValuesAsSingletonSets$a */
        /* loaded from: classes4.dex */
        public class C7625a extends UnmodifiableIterator {

            /* renamed from: a */
            public final /* synthetic */ Iterator f53151a;

            /* renamed from: b */
            public final /* synthetic */ MapViewOfValuesAsSingletonSets f53152b;

            /* renamed from: com.google.common.collect.ImmutableMap$MapViewOfValuesAsSingletonSets$a$a */
            /* loaded from: classes4.dex */
            public class C7626a extends AbstractC1646X {

                /* renamed from: a */
                public final /* synthetic */ Map.Entry f53153a;

                /* renamed from: b */
                public final /* synthetic */ C7625a f53154b;

                public C7626a(C7625a c7625a, Map.Entry entry) {
                    this.f53153a = entry;
                    this.f53154b = c7625a;
                }

                @Override // p000.AbstractC1646X, java.util.Map.Entry
                /* renamed from: a */
                public ImmutableSet getValue() {
                    return ImmutableSet.m40930of(this.f53153a.getValue());
                }

                @Override // p000.AbstractC1646X, java.util.Map.Entry
                public Object getKey() {
                    return this.f53153a.getKey();
                }
            }

            public C7625a(MapViewOfValuesAsSingletonSets mapViewOfValuesAsSingletonSets, Iterator it) {
                this.f53151a = it;
                this.f53152b = mapViewOfValuesAsSingletonSets;
            }

            @Override // java.util.Iterator
            /* renamed from: a */
            public Map.Entry next() {
                return new C7626a(this, (Map.Entry) this.f53151a.next());
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f53151a.hasNext();
            }
        }

        private MapViewOfValuesAsSingletonSets() {
            ImmutableMap.this = r1;
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public boolean containsKey(@CheckForNull Object obj) {
            return ImmutableMap.this.containsKey(obj);
        }

        @Override // com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap, com.google.common.collect.ImmutableMap
        public ImmutableSet<K> createKeySet() {
            return ImmutableMap.this.keySet();
        }

        @Override // com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap
        public UnmodifiableIterator<Map.Entry<K, ImmutableSet<V>>> entryIterator() {
            return new C7625a(this, ImmutableMap.this.entrySet().iterator());
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public int hashCode() {
            return ImmutableMap.this.hashCode();
        }

        @Override // com.google.common.collect.ImmutableMap
        public boolean isHashCodeFast() {
            return ImmutableMap.this.isHashCodeFast();
        }

        @Override // com.google.common.collect.ImmutableMap
        public boolean isPartialView() {
            return ImmutableMap.this.isPartialView();
        }

        @Override // java.util.Map
        public int size() {
            return ImmutableMap.this.size();
        }

        @Override // com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap, com.google.common.collect.ImmutableMap
        @J2ktIncompatible
        @GwtIncompatible
        public Object writeReplace() {
            return super.writeReplace();
        }

        public /* synthetic */ MapViewOfValuesAsSingletonSets(ImmutableMap immutableMap, C7627a c7627a) {
            this();
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        @CheckForNull
        public ImmutableSet<V> get(@CheckForNull Object obj) {
            Object obj2 = ImmutableMap.this.get(obj);
            if (obj2 == null) {
                return null;
            }
            return ImmutableSet.m40930of(obj2);
        }
    }

    @J2ktIncompatible
    /* loaded from: classes4.dex */
    public static class SerializedForm<K, V> implements Serializable {
        private static final boolean USE_LEGACY_SERIALIZATION = true;
        private static final long serialVersionUID = 0;
        private final Object keys;
        private final Object values;

        public SerializedForm(ImmutableMap<K, V> immutableMap) {
            Object[] objArr = new Object[immutableMap.size()];
            Object[] objArr2 = new Object[immutableMap.size()];
            UnmodifiableIterator<Map.Entry<K, V>> it = immutableMap.entrySet().iterator();
            int i = 0;
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                objArr[i] = next.getKey();
                objArr2[i] = next.getValue();
                i++;
            }
            this.keys = objArr;
            this.values = objArr2;
        }

        public final Object legacyReadResolve() {
            Object[] objArr = (Object[]) this.keys;
            Object[] objArr2 = (Object[]) this.values;
            Builder<K, V> makeBuilder = makeBuilder(objArr.length);
            for (int i = 0; i < objArr.length; i++) {
                makeBuilder.put((K) objArr[i], (V) objArr2[i]);
            }
            return makeBuilder.buildOrThrow();
        }

        public Builder<K, V> makeBuilder(int i) {
            return new Builder<>(i);
        }

        public final Object readResolve() {
            Object obj = this.keys;
            if (!(obj instanceof ImmutableSet)) {
                return legacyReadResolve();
            }
            ImmutableSet immutableSet = (ImmutableSet) obj;
            Builder<K, V> makeBuilder = makeBuilder(immutableSet.size());
            UnmodifiableIterator it = immutableSet.iterator();
            UnmodifiableIterator it2 = ((ImmutableCollection) this.values).iterator();
            while (it.hasNext()) {
                makeBuilder.put((K) it.next(), (V) it2.next());
            }
            return makeBuilder.buildOrThrow();
        }
    }

    /* renamed from: com.google.common.collect.ImmutableMap$a */
    /* loaded from: classes4.dex */
    public class C7627a extends UnmodifiableIterator {

        /* renamed from: a */
        public final /* synthetic */ UnmodifiableIterator f53155a;

        /* renamed from: b */
        public final /* synthetic */ ImmutableMap f53156b;

        public C7627a(ImmutableMap immutableMap, UnmodifiableIterator unmodifiableIterator) {
            this.f53155a = unmodifiableIterator;
            this.f53156b = immutableMap;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f53155a.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            return ((Map.Entry) this.f53155a.next()).getKey();
        }
    }

    public static <K, V> Builder<K, V> builder() {
        return new Builder<>();
    }

    public static <K, V> Builder<K, V> builderWithExpectedSize(int i) {
        AbstractC5406bs.m51814b(i, "expectedSize");
        return new Builder<>(i);
    }

    public static void checkNoConflict(boolean z, String str, Object obj, Object obj2) {
        if (z) {
            return;
        }
        throw conflictException(str, obj, obj2);
    }

    public static IllegalArgumentException conflictException(String str, Object obj, Object obj2) {
        return new IllegalArgumentException("Multiple entries with same " + str + ": " + obj + " and " + obj2);
    }

    public static <K, V> ImmutableMap<K, V> copyOf(Map<? extends K, ? extends V> map) {
        if ((map instanceof ImmutableMap) && !(map instanceof SortedMap)) {
            ImmutableMap<K, V> immutableMap = (ImmutableMap) map;
            if (!immutableMap.isPartialView()) {
                return immutableMap;
            }
        }
        return copyOf(map.entrySet());
    }

    public static <K, V> Map.Entry<K, V> entryOf(K k, V v) {
        AbstractC5406bs.m51815a(k, v);
        return new AbstractMap.SimpleImmutableEntry(k, v);
    }

    /* renamed from: of */
    public static <K, V> ImmutableMap<K, V> m40976of() {
        return (ImmutableMap<K, V>) RegularImmutableMap.EMPTY;
    }

    @SafeVarargs
    public static <K, V> ImmutableMap<K, V> ofEntries(Map.Entry<? extends K, ? extends V>... entryArr) {
        return copyOf(Arrays.asList(entryArr));
    }

    @J2ktIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static <T, K, V> Collector<T, ?, ImmutableMap<K, V>> toImmutableMap(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2) {
        return AbstractC7963f.m40309p0(function, function2);
    }

    public ImmutableSetMultimap<K, V> asMultimap() {
        if (isEmpty()) {
            return ImmutableSetMultimap.m40923of();
        }
        ImmutableSetMultimap<K, V> immutableSetMultimap = this.multimapView;
        if (immutableSetMultimap == null) {
            ImmutableSetMultimap<K, V> immutableSetMultimap2 = new ImmutableSetMultimap<>(new MapViewOfValuesAsSingletonSets(this, null), size(), null);
            this.multimapView = immutableSetMultimap2;
            return immutableSetMultimap2;
        }
        return immutableSetMultimap;
    }

    @Override // java.util.Map
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public boolean containsKey(@CheckForNull Object obj) {
        if (get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public boolean containsValue(@CheckForNull Object obj) {
        return values().contains(obj);
    }

    public abstract ImmutableSet<Map.Entry<K, V>> createEntrySet();

    public abstract ImmutableSet<K> createKeySet();

    public abstract ImmutableCollection<V> createValues();

    @Override // java.util.Map
    public boolean equals(@CheckForNull Object obj) {
        return Maps.m40692p(this, obj);
    }

    @Override // java.util.Map
    @CheckForNull
    public abstract V get(@CheckForNull Object obj);

    @Override // java.util.Map
    @CheckForNull
    public final V getOrDefault(@CheckForNull Object obj, @CheckForNull V v) {
        V v2 = get(obj);
        if (v2 != null) {
            return v2;
        }
        return v;
    }

    @Override // java.util.Map
    public int hashCode() {
        return Sets.m40547b(entrySet());
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public boolean isHashCodeFast() {
        return false;
    }

    public abstract boolean isPartialView();

    public UnmodifiableIterator<K> keyIterator() {
        return new C7627a(this, entrySet().iterator());
    }

    @Override // java.util.Map
    @CheckForNull
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    @CanIgnoreReturnValue
    public final V put(K k, V v) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @CanIgnoreReturnValue
    @CheckForNull
    @Deprecated
    public final V remove(@CheckForNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return Maps.m40719I(this);
    }

    @J2ktIncompatible
    public Object writeReplace() {
        return new SerializedForm(this);
    }

    /* renamed from: of */
    public static <K, V> ImmutableMap<K, V> m40975of(K k, V v) {
        AbstractC5406bs.m51815a(k, v);
        return RegularImmutableMap.create(1, new Object[]{k, v});
    }

    public static <T, K, V> Collector<T, ?, ImmutableMap<K, V>> toImmutableMap(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2, BinaryOperator<V> binaryOperator) {
        return AbstractC7963f.m40307q0(function, function2, binaryOperator);
    }

    @Override // java.util.Map
    public ImmutableSet<Map.Entry<K, V>> entrySet() {
        ImmutableSet<Map.Entry<K, V>> immutableSet = this.entrySet;
        if (immutableSet == null) {
            ImmutableSet<Map.Entry<K, V>> createEntrySet = createEntrySet();
            this.entrySet = createEntrySet;
            return createEntrySet;
        }
        return immutableSet;
    }

    @Override // java.util.Map
    public ImmutableSet<K> keySet() {
        ImmutableSet<K> immutableSet = this.keySet;
        if (immutableSet == null) {
            ImmutableSet<K> createKeySet = createKeySet();
            this.keySet = createKeySet;
            return createKeySet;
        }
        return immutableSet;
    }

    @Override // java.util.Map
    public ImmutableCollection<V> values() {
        ImmutableCollection<V> immutableCollection = this.values;
        if (immutableCollection == null) {
            ImmutableCollection<V> createValues = createValues();
            this.values = createValues;
            return createValues;
        }
        return immutableCollection;
    }

    /* renamed from: of */
    public static <K, V> ImmutableMap<K, V> m40974of(K k, V v, K k2, V v2) {
        AbstractC5406bs.m51815a(k, v);
        AbstractC5406bs.m51815a(k2, v2);
        return RegularImmutableMap.create(2, new Object[]{k, v, k2, v2});
    }

    public static <K, V> ImmutableMap<K, V> copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        Builder builder = new Builder(iterable instanceof Collection ? ((Collection) iterable).size() : 4);
        builder.putAll(iterable);
        return builder.build();
    }

    /* renamed from: of */
    public static <K, V> ImmutableMap<K, V> m40973of(K k, V v, K k2, V v2, K k3, V v3) {
        AbstractC5406bs.m51815a(k, v);
        AbstractC5406bs.m51815a(k2, v2);
        AbstractC5406bs.m51815a(k3, v3);
        return RegularImmutableMap.create(3, new Object[]{k, v, k2, v2, k3, v3});
    }

    /* renamed from: of */
    public static <K, V> ImmutableMap<K, V> m40972of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4) {
        AbstractC5406bs.m51815a(k, v);
        AbstractC5406bs.m51815a(k2, v2);
        AbstractC5406bs.m51815a(k3, v3);
        AbstractC5406bs.m51815a(k4, v4);
        return RegularImmutableMap.create(4, new Object[]{k, v, k2, v2, k3, v3, k4, v4});
    }

    /* renamed from: of */
    public static <K, V> ImmutableMap<K, V> m40971of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        AbstractC5406bs.m51815a(k, v);
        AbstractC5406bs.m51815a(k2, v2);
        AbstractC5406bs.m51815a(k3, v3);
        AbstractC5406bs.m51815a(k4, v4);
        AbstractC5406bs.m51815a(k5, v5);
        return RegularImmutableMap.create(5, new Object[]{k, v, k2, v2, k3, v3, k4, v4, k5, v5});
    }

    /* renamed from: of */
    public static <K, V> ImmutableMap<K, V> m40970of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6) {
        AbstractC5406bs.m51815a(k, v);
        AbstractC5406bs.m51815a(k2, v2);
        AbstractC5406bs.m51815a(k3, v3);
        AbstractC5406bs.m51815a(k4, v4);
        AbstractC5406bs.m51815a(k5, v5);
        AbstractC5406bs.m51815a(k6, v6);
        return RegularImmutableMap.create(6, new Object[]{k, v, k2, v2, k3, v3, k4, v4, k5, v5, k6, v6});
    }

    /* renamed from: of */
    public static <K, V> ImmutableMap<K, V> m40969of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7) {
        AbstractC5406bs.m51815a(k, v);
        AbstractC5406bs.m51815a(k2, v2);
        AbstractC5406bs.m51815a(k3, v3);
        AbstractC5406bs.m51815a(k4, v4);
        AbstractC5406bs.m51815a(k5, v5);
        AbstractC5406bs.m51815a(k6, v6);
        AbstractC5406bs.m51815a(k7, v7);
        return RegularImmutableMap.create(7, new Object[]{k, v, k2, v2, k3, v3, k4, v4, k5, v5, k6, v6, k7, v7});
    }

    /* renamed from: of */
    public static <K, V> ImmutableMap<K, V> m40968of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7, K k8, V v8) {
        AbstractC5406bs.m51815a(k, v);
        AbstractC5406bs.m51815a(k2, v2);
        AbstractC5406bs.m51815a(k3, v3);
        AbstractC5406bs.m51815a(k4, v4);
        AbstractC5406bs.m51815a(k5, v5);
        AbstractC5406bs.m51815a(k6, v6);
        AbstractC5406bs.m51815a(k7, v7);
        AbstractC5406bs.m51815a(k8, v8);
        return RegularImmutableMap.create(8, new Object[]{k, v, k2, v2, k3, v3, k4, v4, k5, v5, k6, v6, k7, v7, k8, v8});
    }

    /* renamed from: of */
    public static <K, V> ImmutableMap<K, V> m40967of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7, K k8, V v8, K k9, V v9) {
        AbstractC5406bs.m51815a(k, v);
        AbstractC5406bs.m51815a(k2, v2);
        AbstractC5406bs.m51815a(k3, v3);
        AbstractC5406bs.m51815a(k4, v4);
        AbstractC5406bs.m51815a(k5, v5);
        AbstractC5406bs.m51815a(k6, v6);
        AbstractC5406bs.m51815a(k7, v7);
        AbstractC5406bs.m51815a(k8, v8);
        AbstractC5406bs.m51815a(k9, v9);
        return RegularImmutableMap.create(9, new Object[]{k, v, k2, v2, k3, v3, k4, v4, k5, v5, k6, v6, k7, v7, k8, v8, k9, v9});
    }

    /* renamed from: of */
    public static <K, V> ImmutableMap<K, V> m40966of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7, K k8, V v8, K k9, V v9, K k10, V v10) {
        AbstractC5406bs.m51815a(k, v);
        AbstractC5406bs.m51815a(k2, v2);
        AbstractC5406bs.m51815a(k3, v3);
        AbstractC5406bs.m51815a(k4, v4);
        AbstractC5406bs.m51815a(k5, v5);
        AbstractC5406bs.m51815a(k6, v6);
        AbstractC5406bs.m51815a(k7, v7);
        AbstractC5406bs.m51815a(k8, v8);
        AbstractC5406bs.m51815a(k9, v9);
        AbstractC5406bs.m51815a(k10, v10);
        return RegularImmutableMap.create(10, new Object[]{k, v, k2, v2, k3, v3, k4, v4, k5, v5, k6, v6, k7, v7, k8, v8, k9, v9, k10, v10});
    }
}
