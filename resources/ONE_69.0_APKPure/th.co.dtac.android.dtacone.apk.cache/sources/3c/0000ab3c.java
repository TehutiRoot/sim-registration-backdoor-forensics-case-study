package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Maps;
import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import javax.annotation.CheckForNull;

@GwtIncompatible
/* loaded from: classes4.dex */
public final class TreeRangeMap<K extends Comparable, V> implements RangeMap<K, V> {

    /* renamed from: b */
    public static final RangeMap f53627b = new C7906a();

    /* renamed from: a */
    public final NavigableMap f53628a = Maps.newTreeMap();

    /* renamed from: com.google.common.collect.TreeRangeMap$a */
    /* loaded from: classes4.dex */
    public class C7906a implements RangeMap {
        @Override // com.google.common.collect.RangeMap
        public Map asDescendingMapOfRanges() {
            return Collections.emptyMap();
        }

        @Override // com.google.common.collect.RangeMap
        public Map asMapOfRanges() {
            return Collections.emptyMap();
        }

        @Override // com.google.common.collect.RangeMap
        public void clear() {
        }

        @Override // com.google.common.collect.RangeMap
        public Object get(Comparable comparable) {
            return null;
        }

        @Override // com.google.common.collect.RangeMap
        public Map.Entry getEntry(Comparable comparable) {
            return null;
        }

        @Override // com.google.common.collect.RangeMap
        public void put(Range range, Object obj) {
            Preconditions.checkNotNull(range);
            throw new IllegalArgumentException("Cannot insert range " + range + " into an empty subRangeMap");
        }

        @Override // com.google.common.collect.RangeMap
        public void putAll(RangeMap rangeMap) {
            if (rangeMap.asMapOfRanges().isEmpty()) {
                return;
            }
            throw new IllegalArgumentException("Cannot putAll(nonEmptyRangeMap) into an empty subRangeMap");
        }

        @Override // com.google.common.collect.RangeMap
        public void putCoalescing(Range range, Object obj) {
            Preconditions.checkNotNull(range);
            throw new IllegalArgumentException("Cannot insert range " + range + " into an empty subRangeMap");
        }

        @Override // com.google.common.collect.RangeMap
        public void remove(Range range) {
            Preconditions.checkNotNull(range);
        }

        @Override // com.google.common.collect.RangeMap
        public Range span() {
            throw new NoSuchElementException();
        }

        @Override // com.google.common.collect.RangeMap
        public RangeMap subRangeMap(Range range) {
            Preconditions.checkNotNull(range);
            return this;
        }
    }

    /* renamed from: com.google.common.collect.TreeRangeMap$b */
    /* loaded from: classes4.dex */
    public final class C7907b extends Maps.AbstractC7770x {

        /* renamed from: a */
        public final Iterable f53629a;

        public C7907b(Iterable iterable) {
            this.f53629a = iterable;
        }

        @Override // com.google.common.collect.Maps.AbstractC7770x
        /* renamed from: a */
        public Iterator mo40377a() {
            return this.f53629a.iterator();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            if (get(obj) != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Object get(Object obj) {
            if (obj instanceof Range) {
                Range range = (Range) obj;
                C7908c c7908c = (C7908c) TreeRangeMap.this.f53628a.get(range.lowerBound);
                if (c7908c != null && c7908c.getKey().equals(range)) {
                    return c7908c.getValue();
                }
                return null;
            }
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return TreeRangeMap.this.f53628a.size();
        }
    }

    /* renamed from: com.google.common.collect.TreeRangeMap$c */
    /* loaded from: classes4.dex */
    public static final class C7908c extends AbstractC1638X {

        /* renamed from: a */
        public final Range f53631a;

        /* renamed from: b */
        public final Object f53632b;

        public C7908c(Cut cut, Cut cut2, Object obj) {
            this(Range.create(cut, cut2), obj);
        }

        /* renamed from: a */
        public boolean m40403a(Comparable comparable) {
            return this.f53631a.contains(comparable);
        }

        @Override // p000.AbstractC1638X, java.util.Map.Entry
        /* renamed from: b */
        public Range getKey() {
            return this.f53631a;
        }

        /* renamed from: c */
        public Cut m40401c() {
            return this.f53631a.lowerBound;
        }

        /* renamed from: d */
        public Cut m40400d() {
            return this.f53631a.upperBound;
        }

        @Override // p000.AbstractC1638X, java.util.Map.Entry
        public Object getValue() {
            return this.f53632b;
        }

        public C7908c(Range range, Object obj) {
            this.f53631a = range;
            this.f53632b = obj;
        }
    }

    /* renamed from: com.google.common.collect.TreeRangeMap$d */
    /* loaded from: classes4.dex */
    public class C7909d implements RangeMap {

        /* renamed from: a */
        public final Range f53633a;

        /* renamed from: com.google.common.collect.TreeRangeMap$d$a */
        /* loaded from: classes4.dex */
        public class C7910a extends C7912b {

            /* renamed from: com.google.common.collect.TreeRangeMap$d$a$a */
            /* loaded from: classes4.dex */
            public class C7911a extends AbstractIterator {

                /* renamed from: c */
                public final /* synthetic */ Iterator f53636c;

                /* renamed from: d */
                public final /* synthetic */ C7910a f53637d;

                public C7911a(C7910a c7910a, Iterator it) {
                    this.f53636c = it;
                    this.f53637d = c7910a;
                }

                @Override // com.google.common.collect.AbstractIterator
                /* renamed from: b */
                public Map.Entry computeNext() {
                    if (this.f53636c.hasNext()) {
                        C7908c c7908c = (C7908c) this.f53636c.next();
                        if (c7908c.m40400d().compareTo((Cut) C7909d.this.f53633a.lowerBound) <= 0) {
                            return (Map.Entry) endOfData();
                        }
                        return Maps.immutableEntry(c7908c.getKey().intersection(C7909d.this.f53633a), c7908c.getValue());
                    }
                    return (Map.Entry) endOfData();
                }
            }

            public C7910a() {
                super();
            }

            @Override // com.google.common.collect.TreeRangeMap.C7909d.C7912b
            /* renamed from: b */
            public Iterator mo40396b() {
                if (C7909d.this.f53633a.isEmpty()) {
                    return Iterators.m40828e();
                }
                return new C7911a(this, TreeRangeMap.this.f53628a.headMap(C7909d.this.f53633a.upperBound, false).descendingMap().values().iterator());
            }
        }

        /* renamed from: com.google.common.collect.TreeRangeMap$d$b */
        /* loaded from: classes4.dex */
        public class C7912b extends AbstractMap {

            /* renamed from: com.google.common.collect.TreeRangeMap$d$b$a */
            /* loaded from: classes4.dex */
            public class C7913a extends Maps.C7772y {
                public C7913a(Map map) {
                    super(map);
                }

                @Override // com.google.common.collect.Maps.C7772y, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public boolean remove(Object obj) {
                    if (C7912b.this.remove(obj) != null) {
                        return true;
                    }
                    return false;
                }

                @Override // com.google.common.collect.Sets.AbstractC7846j, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public boolean retainAll(Collection collection) {
                    return C7912b.this.m40395c(Predicates.compose(Predicates.not(Predicates.m41291in(collection)), Maps.m40675v()));
                }
            }

            /* renamed from: com.google.common.collect.TreeRangeMap$d$b$b */
            /* loaded from: classes4.dex */
            public class C7914b extends Maps.AbstractC7756q {
                public C7914b() {
                }

                @Override // com.google.common.collect.Maps.AbstractC7756q
                /* renamed from: a */
                public Map mo40259a() {
                    return C7912b.this;
                }

                @Override // com.google.common.collect.Maps.AbstractC7756q, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public boolean isEmpty() {
                    return !iterator().hasNext();
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
                public Iterator iterator() {
                    return C7912b.this.mo40396b();
                }

                @Override // com.google.common.collect.Maps.AbstractC7756q, com.google.common.collect.Sets.AbstractC7846j, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public boolean retainAll(Collection collection) {
                    return C7912b.this.m40395c(Predicates.not(Predicates.m41291in(collection)));
                }

                @Override // com.google.common.collect.Maps.AbstractC7756q, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public int size() {
                    return Iterators.size(iterator());
                }
            }

            /* renamed from: com.google.common.collect.TreeRangeMap$d$b$c */
            /* loaded from: classes4.dex */
            public class C7915c extends AbstractIterator {

                /* renamed from: c */
                public final /* synthetic */ Iterator f53641c;

                /* renamed from: d */
                public final /* synthetic */ C7912b f53642d;

                public C7915c(C7912b c7912b, Iterator it) {
                    this.f53641c = it;
                    this.f53642d = c7912b;
                }

                @Override // com.google.common.collect.AbstractIterator
                /* renamed from: b */
                public Map.Entry computeNext() {
                    while (this.f53641c.hasNext()) {
                        C7908c c7908c = (C7908c) this.f53641c.next();
                        if (c7908c.m40401c().compareTo((Cut) C7909d.this.f53633a.upperBound) >= 0) {
                            return (Map.Entry) endOfData();
                        }
                        if (c7908c.m40400d().compareTo((Cut) C7909d.this.f53633a.lowerBound) > 0) {
                            return Maps.immutableEntry(c7908c.getKey().intersection(C7909d.this.f53633a), c7908c.getValue());
                        }
                    }
                    return (Map.Entry) endOfData();
                }
            }

            /* renamed from: com.google.common.collect.TreeRangeMap$d$b$d */
            /* loaded from: classes4.dex */
            public class C7916d extends Maps.C7736L {
                public C7916d(Map map) {
                    super(map);
                }

                @Override // com.google.common.collect.Maps.C7736L, java.util.AbstractCollection, java.util.Collection
                public boolean removeAll(Collection collection) {
                    return C7912b.this.m40395c(Predicates.compose(Predicates.m41291in(collection), Maps.m40700Q()));
                }

                @Override // com.google.common.collect.Maps.C7736L, java.util.AbstractCollection, java.util.Collection
                public boolean retainAll(Collection collection) {
                    return C7912b.this.m40395c(Predicates.compose(Predicates.not(Predicates.m41291in(collection)), Maps.m40700Q()));
                }
            }

            public C7912b() {
            }

            /* renamed from: b */
            public Iterator mo40396b() {
                if (!C7909d.this.f53633a.isEmpty()) {
                    return new C7915c(this, TreeRangeMap.this.f53628a.tailMap((Cut) MoreObjects.firstNonNull((Cut) TreeRangeMap.this.f53628a.floorKey(C7909d.this.f53633a.lowerBound), C7909d.this.f53633a.lowerBound), true).values().iterator());
                }
                return Iterators.m40828e();
            }

            /* renamed from: c */
            public final boolean m40395c(Predicate predicate) {
                ArrayList<Range<K>> newArrayList = Lists.newArrayList();
                for (Map.Entry entry : entrySet()) {
                    if (predicate.apply(entry)) {
                        newArrayList.add((Range) entry.getKey());
                    }
                }
                for (Range<K> range : newArrayList) {
                    TreeRangeMap.this.remove(range);
                }
                return !newArrayList.isEmpty();
            }

            @Override // java.util.AbstractMap, java.util.Map
            public void clear() {
                C7909d.this.clear();
            }

            @Override // java.util.AbstractMap, java.util.Map
            public boolean containsKey(Object obj) {
                if (get(obj) != null) {
                    return true;
                }
                return false;
            }

            @Override // java.util.AbstractMap, java.util.Map
            public Set entrySet() {
                return new C7914b();
            }

            @Override // java.util.AbstractMap, java.util.Map
            public Object get(Object obj) {
                C7908c c7908c;
                try {
                    if (obj instanceof Range) {
                        Range range = (Range) obj;
                        if (C7909d.this.f53633a.encloses(range) && !range.isEmpty()) {
                            if (range.lowerBound.compareTo((Cut) C7909d.this.f53633a.lowerBound) == 0) {
                                Map.Entry floorEntry = TreeRangeMap.this.f53628a.floorEntry(range.lowerBound);
                                if (floorEntry != null) {
                                    c7908c = (C7908c) floorEntry.getValue();
                                } else {
                                    c7908c = null;
                                }
                            } else {
                                c7908c = (C7908c) TreeRangeMap.this.f53628a.get(range.lowerBound);
                            }
                            if (c7908c != null && c7908c.getKey().isConnected(C7909d.this.f53633a) && c7908c.getKey().intersection(C7909d.this.f53633a).equals(range)) {
                                return c7908c.getValue();
                            }
                        }
                    }
                } catch (ClassCastException unused) {
                }
                return null;
            }

            @Override // java.util.AbstractMap, java.util.Map
            public Set keySet() {
                return new C7913a(this);
            }

            @Override // java.util.AbstractMap, java.util.Map
            public Object remove(Object obj) {
                Object obj2 = get(obj);
                if (obj2 != null) {
                    Objects.requireNonNull(obj);
                    TreeRangeMap.this.remove((Range) obj);
                    return obj2;
                }
                return null;
            }

            @Override // java.util.AbstractMap, java.util.Map
            public Collection values() {
                return new C7916d(this);
            }
        }

        public C7909d(Range range) {
            this.f53633a = range;
        }

        @Override // com.google.common.collect.RangeMap
        public Map asDescendingMapOfRanges() {
            return new C7910a();
        }

        @Override // com.google.common.collect.RangeMap
        public Map asMapOfRanges() {
            return new C7912b();
        }

        @Override // com.google.common.collect.RangeMap
        public void clear() {
            TreeRangeMap.this.remove(this.f53633a);
        }

        @Override // com.google.common.collect.RangeMap
        public boolean equals(Object obj) {
            if (obj instanceof RangeMap) {
                return asMapOfRanges().equals(((RangeMap) obj).asMapOfRanges());
            }
            return false;
        }

        @Override // com.google.common.collect.RangeMap
        public Object get(Comparable comparable) {
            if (this.f53633a.contains(comparable)) {
                return TreeRangeMap.this.get(comparable);
            }
            return null;
        }

        @Override // com.google.common.collect.RangeMap
        public Map.Entry getEntry(Comparable comparable) {
            Map.Entry<Range<K>, V> entry;
            if (this.f53633a.contains(comparable) && (entry = TreeRangeMap.this.getEntry(comparable)) != null) {
                return Maps.immutableEntry(entry.getKey().intersection(this.f53633a), entry.getValue());
            }
            return null;
        }

        @Override // com.google.common.collect.RangeMap
        public int hashCode() {
            return asMapOfRanges().hashCode();
        }

        @Override // com.google.common.collect.RangeMap
        public void put(Range range, Object obj) {
            Preconditions.checkArgument(this.f53633a.encloses(range), "Cannot put range %s into a subRangeMap(%s)", range, this.f53633a);
            TreeRangeMap.this.put(range, obj);
        }

        @Override // com.google.common.collect.RangeMap
        public void putAll(RangeMap rangeMap) {
            if (rangeMap.asMapOfRanges().isEmpty()) {
                return;
            }
            Range<K> span = rangeMap.span();
            Preconditions.checkArgument(this.f53633a.encloses(span), "Cannot putAll rangeMap with span %s into a subRangeMap(%s)", span, this.f53633a);
            TreeRangeMap.this.putAll(rangeMap);
        }

        @Override // com.google.common.collect.RangeMap
        public void putCoalescing(Range range, Object obj) {
            if (!TreeRangeMap.this.f53628a.isEmpty() && this.f53633a.encloses(range)) {
                put(TreeRangeMap.this.m40406e(range, Preconditions.checkNotNull(obj)).intersection(this.f53633a), obj);
            } else {
                put(range, obj);
            }
        }

        @Override // com.google.common.collect.RangeMap
        public void remove(Range range) {
            if (range.isConnected(this.f53633a)) {
                TreeRangeMap.this.remove(range.intersection(this.f53633a));
            }
        }

        @Override // com.google.common.collect.RangeMap
        public Range span() {
            Cut cut;
            Cut m40400d;
            Map.Entry floorEntry = TreeRangeMap.this.f53628a.floorEntry(this.f53633a.lowerBound);
            if (floorEntry != null && ((C7908c) floorEntry.getValue()).m40400d().compareTo((Cut) this.f53633a.lowerBound) > 0) {
                cut = this.f53633a.lowerBound;
            } else {
                cut = (Cut) TreeRangeMap.this.f53628a.ceilingKey(this.f53633a.lowerBound);
                if (cut == null || cut.compareTo((Cut) this.f53633a.upperBound) >= 0) {
                    throw new NoSuchElementException();
                }
            }
            Map.Entry lowerEntry = TreeRangeMap.this.f53628a.lowerEntry(this.f53633a.upperBound);
            if (lowerEntry != null) {
                if (((C7908c) lowerEntry.getValue()).m40400d().compareTo((Cut) this.f53633a.upperBound) >= 0) {
                    m40400d = this.f53633a.upperBound;
                } else {
                    m40400d = ((C7908c) lowerEntry.getValue()).m40400d();
                }
                return Range.create(cut, m40400d);
            }
            throw new NoSuchElementException();
        }

        @Override // com.google.common.collect.RangeMap
        public RangeMap subRangeMap(Range range) {
            if (!range.isConnected(this.f53633a)) {
                return TreeRangeMap.this.m40405f();
            }
            return TreeRangeMap.this.subRangeMap(range.intersection(this.f53633a));
        }

        @Override // com.google.common.collect.RangeMap
        public String toString() {
            return asMapOfRanges().toString();
        }
    }

    public static <K extends Comparable, V> TreeRangeMap<K, V> create() {
        return new TreeRangeMap<>();
    }

    /* renamed from: d */
    public static Range m40407d(Range range, Object obj, Map.Entry entry) {
        if (entry != null && ((C7908c) entry.getValue()).getKey().isConnected(range) && ((C7908c) entry.getValue()).getValue().equals(obj)) {
            return range.span(((C7908c) entry.getValue()).getKey());
        }
        return range;
    }

    @Override // com.google.common.collect.RangeMap
    public Map<Range<K>, V> asDescendingMapOfRanges() {
        return new C7907b(this.f53628a.descendingMap().values());
    }

    @Override // com.google.common.collect.RangeMap
    public Map<Range<K>, V> asMapOfRanges() {
        return new C7907b(this.f53628a.values());
    }

    @Override // com.google.common.collect.RangeMap
    public void clear() {
        this.f53628a.clear();
    }

    /* renamed from: e */
    public final Range m40406e(Range range, Object obj) {
        return m40407d(m40407d(range, obj, this.f53628a.lowerEntry(range.lowerBound)), obj, this.f53628a.floorEntry(range.upperBound));
    }

    @Override // com.google.common.collect.RangeMap
    public boolean equals(@CheckForNull Object obj) {
        if (obj instanceof RangeMap) {
            return asMapOfRanges().equals(((RangeMap) obj).asMapOfRanges());
        }
        return false;
    }

    /* renamed from: f */
    public final RangeMap m40405f() {
        return f53627b;
    }

    /* renamed from: g */
    public final void m40404g(Cut cut, Cut cut2, Object obj) {
        this.f53628a.put(cut, new C7908c(cut, cut2, obj));
    }

    @Override // com.google.common.collect.RangeMap
    @CheckForNull
    public V get(K k) {
        Map.Entry<Range<K>, V> entry = getEntry(k);
        if (entry == null) {
            return null;
        }
        return entry.getValue();
    }

    @Override // com.google.common.collect.RangeMap
    @CheckForNull
    public Map.Entry<Range<K>, V> getEntry(K k) {
        Map.Entry floorEntry = this.f53628a.floorEntry(Cut.belowValue(k));
        if (floorEntry != null && ((C7908c) floorEntry.getValue()).m40403a(k)) {
            return (Map.Entry) floorEntry.getValue();
        }
        return null;
    }

    @Override // com.google.common.collect.RangeMap
    public int hashCode() {
        return asMapOfRanges().hashCode();
    }

    @Override // com.google.common.collect.RangeMap
    public void put(Range<K> range, V v) {
        if (!range.isEmpty()) {
            Preconditions.checkNotNull(v);
            remove(range);
            this.f53628a.put(range.lowerBound, new C7908c(range, v));
        }
    }

    @Override // com.google.common.collect.RangeMap
    public void putAll(RangeMap<K, ? extends V> rangeMap) {
        for (Map.Entry<Range<K>, ? extends V> entry : rangeMap.asMapOfRanges().entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.common.collect.RangeMap
    public void putCoalescing(Range<K> range, V v) {
        if (this.f53628a.isEmpty()) {
            put(range, v);
        } else {
            put(m40406e(range, Preconditions.checkNotNull(v)), v);
        }
    }

    @Override // com.google.common.collect.RangeMap
    public void remove(Range<K> range) {
        if (range.isEmpty()) {
            return;
        }
        Map.Entry lowerEntry = this.f53628a.lowerEntry(range.lowerBound);
        if (lowerEntry != null) {
            C7908c c7908c = (C7908c) lowerEntry.getValue();
            if (c7908c.m40400d().compareTo((Cut) range.lowerBound) > 0) {
                if (c7908c.m40400d().compareTo((Cut) range.upperBound) > 0) {
                    m40404g(range.upperBound, c7908c.m40400d(), ((C7908c) lowerEntry.getValue()).getValue());
                }
                m40404g(c7908c.m40401c(), range.lowerBound, ((C7908c) lowerEntry.getValue()).getValue());
            }
        }
        Map.Entry lowerEntry2 = this.f53628a.lowerEntry(range.upperBound);
        if (lowerEntry2 != null) {
            C7908c c7908c2 = (C7908c) lowerEntry2.getValue();
            if (c7908c2.m40400d().compareTo((Cut) range.upperBound) > 0) {
                m40404g(range.upperBound, c7908c2.m40400d(), ((C7908c) lowerEntry2.getValue()).getValue());
            }
        }
        this.f53628a.subMap(range.lowerBound, range.upperBound).clear();
    }

    @Override // com.google.common.collect.RangeMap
    public Range<K> span() {
        Map.Entry firstEntry = this.f53628a.firstEntry();
        Map.Entry lastEntry = this.f53628a.lastEntry();
        if (firstEntry != null && lastEntry != null) {
            return Range.create(((C7908c) firstEntry.getValue()).getKey().lowerBound, ((C7908c) lastEntry.getValue()).getKey().upperBound);
        }
        throw new NoSuchElementException();
    }

    @Override // com.google.common.collect.RangeMap
    public RangeMap<K, V> subRangeMap(Range<K> range) {
        if (range.equals(Range.all())) {
            return this;
        }
        return new C7909d(range);
    }

    @Override // com.google.common.collect.RangeMap
    public String toString() {
        return this.f53628a.values().toString();
    }
}