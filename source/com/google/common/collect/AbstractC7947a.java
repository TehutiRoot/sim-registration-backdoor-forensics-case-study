package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.Multimaps;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* renamed from: com.google.common.collect.a */
/* loaded from: classes4.dex */
public abstract class AbstractC7947a implements Multimap {
    @CheckForNull
    @LazyInit
    private transient Map<Object, Collection<Object>> asMap;
    @CheckForNull
    @LazyInit
    private transient Collection<Map.Entry<Object, Object>> entries;
    @CheckForNull
    @LazyInit
    private transient Set<Object> keySet;
    @CheckForNull
    @LazyInit
    private transient Multiset<Object> keys;
    @CheckForNull
    @LazyInit
    private transient Collection<Object> values;

    /* renamed from: com.google.common.collect.a$a */
    /* loaded from: classes4.dex */
    public class C7948a extends Multimaps.AbstractC7804b {
        public C7948a() {
            AbstractC7947a.this = r1;
        }

        @Override // com.google.common.collect.Multimaps.AbstractC7804b
        /* renamed from: a */
        public Multimap mo40372a() {
            return AbstractC7947a.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return AbstractC7947a.this.entryIterator();
        }
    }

    /* renamed from: com.google.common.collect.a$b */
    /* loaded from: classes4.dex */
    public class C7949b extends C7948a implements Set {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7949b() {
            super();
            AbstractC7947a.this = r1;
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            return Sets.m40548a(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            return Sets.m40547b(this);
        }
    }

    /* renamed from: com.google.common.collect.a$c */
    /* loaded from: classes4.dex */
    public class C7950c extends AbstractCollection {
        public C7950c() {
            AbstractC7947a.this = r1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            AbstractC7947a.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return AbstractC7947a.this.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return AbstractC7947a.this.valueIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return AbstractC7947a.this.size();
        }
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public Map<Object, Collection<Object>> asMap() {
        Map<Object, Collection<Object>> map = this.asMap;
        if (map == null) {
            Map<Object, Collection<Object>> createAsMap = createAsMap();
            this.asMap = createAsMap;
            return createAsMap;
        }
        return map;
    }

    @Override // com.google.common.collect.Multimap
    public boolean containsEntry(@CheckForNull Object obj, @CheckForNull Object obj2) {
        Collection<Object> collection = asMap().get(obj);
        if (collection != null && collection.contains(obj2)) {
            return true;
        }
        return false;
    }

    @Override // com.google.common.collect.Multimap
    public boolean containsValue(@CheckForNull Object obj) {
        for (Collection<Object> collection : asMap().values()) {
            if (collection.contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public abstract Map createAsMap();

    public abstract Collection createEntries();

    public abstract Set createKeySet();

    public abstract Multiset createKeys();

    public abstract Collection createValues();

    @Override // com.google.common.collect.Multimap, com.google.common.collect.SetMultimap
    public Collection entries() {
        Collection<Map.Entry<Object, Object>> collection = this.entries;
        if (collection == null) {
            Collection<Map.Entry<Object, Object>> createEntries = createEntries();
            this.entries = createEntries;
            return createEntries;
        }
        return collection;
    }

    public abstract Iterator entryIterator();

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public boolean equals(@CheckForNull Object obj) {
        return Multimaps.m40600c(this, obj);
    }

    @Override // com.google.common.collect.Multimap
    public int hashCode() {
        return asMap().hashCode();
    }

    @Override // com.google.common.collect.Multimap
    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.common.collect.Multimap
    public Set<Object> keySet() {
        Set<Object> set = this.keySet;
        if (set == null) {
            Set<Object> createKeySet = createKeySet();
            this.keySet = createKeySet;
            return createKeySet;
        }
        return set;
    }

    @Override // com.google.common.collect.Multimap
    public Multiset<Object> keys() {
        Multiset<Object> multiset = this.keys;
        if (multiset == null) {
            Multiset<Object> createKeys = createKeys();
            this.keys = createKeys;
            return createKeys;
        }
        return multiset;
    }

    @Override // com.google.common.collect.Multimap
    public boolean put(Object obj, Object obj2) {
        return get(obj).add(obj2);
    }

    @Override // com.google.common.collect.Multimap
    @CanIgnoreReturnValue
    public boolean putAll(Object obj, Iterable<Object> iterable) {
        Preconditions.checkNotNull(iterable);
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            return !collection.isEmpty() && get(obj).addAll(collection);
        }
        Iterator<Object> it = iterable.iterator();
        return it.hasNext() && Iterators.addAll(get(obj), it);
    }

    @Override // com.google.common.collect.Multimap
    @CanIgnoreReturnValue
    public boolean remove(@CheckForNull Object obj, @CheckForNull Object obj2) {
        Collection<Object> collection = asMap().get(obj);
        if (collection != null && collection.remove(obj2)) {
            return true;
        }
        return false;
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.SetMultimap
    public Collection replaceValues(Object obj, Iterable iterable) {
        Preconditions.checkNotNull(iterable);
        Collection removeAll = removeAll(obj);
        putAll(obj, iterable);
        return removeAll;
    }

    public String toString() {
        return asMap().toString();
    }

    public Iterator<Object> valueIterator() {
        return Maps.m40710R(entries().iterator());
    }

    @Override // com.google.common.collect.Multimap
    public Collection<Object> values() {
        Collection<Object> collection = this.values;
        if (collection == null) {
            Collection<Object> createValues = createValues();
            this.values = createValues;
            return createValues;
        }
        return collection;
    }

    @Override // com.google.common.collect.Multimap
    @CanIgnoreReturnValue
    public boolean putAll(Multimap<Object, Object> multimap) {
        boolean z = false;
        for (Map.Entry<Object, Object> entry : multimap.entries()) {
            z |= put(entry.getKey(), entry.getValue());
        }
        return z;
    }
}
