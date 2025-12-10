package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.common.collect.Sets;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import javax.annotation.CheckForNull;

@GwtCompatible(emulated = true, serializable = true)
/* loaded from: classes4.dex */
public final class LinkedHashMultimap<K, V> extends LinkedHashMultimapGwtSerializationDependencies<K, V> {
    private static final int DEFAULT_KEY_CAPACITY = 16;
    private static final int DEFAULT_VALUE_SET_CAPACITY = 2;
    @VisibleForTesting
    static final double VALUE_SET_LOAD_FACTOR = 1.0d;
    @J2ktIncompatible
    @GwtIncompatible
    private static final long serialVersionUID = 1;
    private transient ValueEntry<K, V> multimapHeaderEntry;
    @VisibleForTesting
    transient int valueSetCapacity;

    @VisibleForTesting
    /* loaded from: classes4.dex */
    public static final class ValueEntry<K, V> extends ImmutableEntry<K, V> implements InterfaceC7674c {
        @CheckForNull
        ValueEntry<K, V> nextInValueBucket;
        @CheckForNull
        private ValueEntry<K, V> predecessorInMultimap;
        @CheckForNull
        private InterfaceC7674c predecessorInValueSet;
        final int smearedValueHash;
        @CheckForNull
        private ValueEntry<K, V> successorInMultimap;
        @CheckForNull
        private InterfaceC7674c successorInValueSet;

        public ValueEntry(K k, V v, int i, @CheckForNull ValueEntry<K, V> valueEntry) {
            super(k, v);
            this.smearedValueHash = i;
            this.nextInValueBucket = valueEntry;
        }

        public static <K, V> ValueEntry<K, V> newHeader() {
            return new ValueEntry<>(null, null, 0, null);
        }

        public ValueEntry<K, V> getPredecessorInMultimap() {
            ValueEntry<K, V> valueEntry = this.predecessorInMultimap;
            Objects.requireNonNull(valueEntry);
            return valueEntry;
        }

        @Override // com.google.common.collect.LinkedHashMultimap.InterfaceC7674c
        public InterfaceC7674c getPredecessorInValueSet() {
            InterfaceC7674c interfaceC7674c = this.predecessorInValueSet;
            Objects.requireNonNull(interfaceC7674c);
            return interfaceC7674c;
        }

        public ValueEntry<K, V> getSuccessorInMultimap() {
            ValueEntry<K, V> valueEntry = this.successorInMultimap;
            Objects.requireNonNull(valueEntry);
            return valueEntry;
        }

        @Override // com.google.common.collect.LinkedHashMultimap.InterfaceC7674c
        public InterfaceC7674c getSuccessorInValueSet() {
            InterfaceC7674c interfaceC7674c = this.successorInValueSet;
            Objects.requireNonNull(interfaceC7674c);
            return interfaceC7674c;
        }

        public boolean matchesValue(@CheckForNull Object obj, int i) {
            if (this.smearedValueHash == i && com.google.common.base.Objects.equal(getValue(), obj)) {
                return true;
            }
            return false;
        }

        public void setPredecessorInMultimap(ValueEntry<K, V> valueEntry) {
            this.predecessorInMultimap = valueEntry;
        }

        @Override // com.google.common.collect.LinkedHashMultimap.InterfaceC7674c
        public void setPredecessorInValueSet(InterfaceC7674c interfaceC7674c) {
            this.predecessorInValueSet = interfaceC7674c;
        }

        public void setSuccessorInMultimap(ValueEntry<K, V> valueEntry) {
            this.successorInMultimap = valueEntry;
        }

        @Override // com.google.common.collect.LinkedHashMultimap.InterfaceC7674c
        public void setSuccessorInValueSet(InterfaceC7674c interfaceC7674c) {
            this.successorInValueSet = interfaceC7674c;
        }
    }

    /* renamed from: com.google.common.collect.LinkedHashMultimap$a */
    /* loaded from: classes4.dex */
    public class C7671a implements Iterator {

        /* renamed from: a */
        public ValueEntry f53255a;

        /* renamed from: b */
        public ValueEntry f53256b;

        public C7671a() {
            this.f53255a = LinkedHashMultimap.this.multimapHeaderEntry.getSuccessorInMultimap();
        }

        @Override // java.util.Iterator
        /* renamed from: a */
        public Map.Entry next() {
            if (hasNext()) {
                ValueEntry valueEntry = this.f53255a;
                this.f53256b = valueEntry;
                this.f53255a = valueEntry.getSuccessorInMultimap();
                return valueEntry;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f53255a != LinkedHashMultimap.this.multimapHeaderEntry) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            boolean z;
            if (this.f53256b != null) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkState(z, "no calls to next() since the last call to remove()");
            LinkedHashMultimap.this.remove(this.f53256b.getKey(), this.f53256b.getValue());
            this.f53256b = null;
        }
    }

    /* renamed from: com.google.common.collect.LinkedHashMultimap$b */
    /* loaded from: classes4.dex */
    public final class C7672b extends Sets.AbstractC7857j implements InterfaceC7674c {

        /* renamed from: a */
        public final Object f53258a;

        /* renamed from: b */
        public ValueEntry[] f53259b;

        /* renamed from: c */
        public int f53260c = 0;

        /* renamed from: d */
        public int f53261d = 0;

        /* renamed from: e */
        public InterfaceC7674c f53262e = this;

        /* renamed from: f */
        public InterfaceC7674c f53263f = this;

        /* renamed from: com.google.common.collect.LinkedHashMultimap$b$a */
        /* loaded from: classes4.dex */
        public class C7673a implements Iterator {

            /* renamed from: a */
            public InterfaceC7674c f53265a;

            /* renamed from: b */
            public ValueEntry f53266b;

            /* renamed from: c */
            public int f53267c;

            public C7673a() {
                this.f53265a = C7672b.this.f53262e;
                this.f53267c = C7672b.this.f53261d;
            }

            /* renamed from: a */
            public final void m40823a() {
                if (C7672b.this.f53261d == this.f53267c) {
                    return;
                }
                throw new ConcurrentModificationException();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                m40823a();
                if (this.f53265a != C7672b.this) {
                    return true;
                }
                return false;
            }

            @Override // java.util.Iterator
            public Object next() {
                if (hasNext()) {
                    ValueEntry valueEntry = (ValueEntry) this.f53265a;
                    V value = valueEntry.getValue();
                    this.f53266b = valueEntry;
                    this.f53265a = valueEntry.getSuccessorInValueSet();
                    return value;
                }
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public void remove() {
                boolean z;
                m40823a();
                if (this.f53266b != null) {
                    z = true;
                } else {
                    z = false;
                }
                Preconditions.checkState(z, "no calls to next() since the last call to remove()");
                C7672b.this.remove(this.f53266b.getValue());
                this.f53267c = C7672b.this.f53261d;
                this.f53266b = null;
            }
        }

        public C7672b(Object obj, int i) {
            this.f53258a = obj;
            this.f53259b = new ValueEntry[AbstractC22736w70.m905a(i, 1.0d)];
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean add(Object obj) {
            int m902d = AbstractC22736w70.m902d(obj);
            int m40825c = m40825c() & m902d;
            ValueEntry<K, V> valueEntry = this.f53259b[m40825c];
            for (ValueEntry<K, V> valueEntry2 = valueEntry; valueEntry2 != null; valueEntry2 = valueEntry2.nextInValueBucket) {
                if (valueEntry2.matchesValue(obj, m902d)) {
                    return false;
                }
            }
            ValueEntry valueEntry3 = new ValueEntry(this.f53258a, obj, m902d, valueEntry);
            LinkedHashMultimap.succeedsInValueSet(this.f53263f, valueEntry3);
            LinkedHashMultimap.succeedsInValueSet(valueEntry3, this);
            LinkedHashMultimap.succeedsInMultimap(LinkedHashMultimap.this.multimapHeaderEntry.getPredecessorInMultimap(), valueEntry3);
            LinkedHashMultimap.succeedsInMultimap(valueEntry3, LinkedHashMultimap.this.multimapHeaderEntry);
            this.f53259b[m40825c] = valueEntry3;
            this.f53260c++;
            this.f53261d++;
            m40824d();
            return true;
        }

        /* renamed from: c */
        public final int m40825c() {
            return this.f53259b.length - 1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            Arrays.fill(this.f53259b, (Object) null);
            this.f53260c = 0;
            for (InterfaceC7674c interfaceC7674c = this.f53262e; interfaceC7674c != this; interfaceC7674c = interfaceC7674c.getSuccessorInValueSet()) {
                LinkedHashMultimap.deleteFromMultimap((ValueEntry) interfaceC7674c);
            }
            LinkedHashMultimap.succeedsInValueSet(this, this);
            this.f53261d++;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            int m902d = AbstractC22736w70.m902d(obj);
            for (ValueEntry<K, V> valueEntry = this.f53259b[m40825c() & m902d]; valueEntry != null; valueEntry = valueEntry.nextInValueBucket) {
                if (valueEntry.matchesValue(obj, m902d)) {
                    return true;
                }
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v1, types: [com.google.common.collect.LinkedHashMultimap$c] */
        /* renamed from: d */
        public final void m40824d() {
            if (AbstractC22736w70.m904b(this.f53260c, this.f53259b.length, 1.0d)) {
                int length = this.f53259b.length * 2;
                ValueEntry<K, V>[] valueEntryArr = new ValueEntry[length];
                this.f53259b = valueEntryArr;
                int i = length - 1;
                for (ValueEntry<K, V> valueEntry = this.f53262e; valueEntry != this; valueEntry = valueEntry.getSuccessorInValueSet()) {
                    ValueEntry<K, V> valueEntry2 = valueEntry;
                    int i2 = valueEntry2.smearedValueHash & i;
                    valueEntry2.nextInValueBucket = valueEntryArr[i2];
                    valueEntryArr[i2] = valueEntry2;
                }
            }
        }

        @Override // com.google.common.collect.LinkedHashMultimap.InterfaceC7674c
        public InterfaceC7674c getPredecessorInValueSet() {
            return this.f53263f;
        }

        @Override // com.google.common.collect.LinkedHashMultimap.InterfaceC7674c
        public InterfaceC7674c getSuccessorInValueSet() {
            return this.f53262e;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new C7673a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            int m902d = AbstractC22736w70.m902d(obj);
            int m40825c = m40825c() & m902d;
            ValueEntry<K, V> valueEntry = null;
            for (ValueEntry<K, V> valueEntry2 = this.f53259b[m40825c]; valueEntry2 != null; valueEntry2 = valueEntry2.nextInValueBucket) {
                if (valueEntry2.matchesValue(obj, m902d)) {
                    if (valueEntry == null) {
                        this.f53259b[m40825c] = valueEntry2.nextInValueBucket;
                    } else {
                        valueEntry.nextInValueBucket = valueEntry2.nextInValueBucket;
                    }
                    LinkedHashMultimap.deleteFromValueSet(valueEntry2);
                    LinkedHashMultimap.deleteFromMultimap(valueEntry2);
                    this.f53260c--;
                    this.f53261d++;
                    return true;
                }
                valueEntry = valueEntry2;
            }
            return false;
        }

        @Override // com.google.common.collect.LinkedHashMultimap.InterfaceC7674c
        public void setPredecessorInValueSet(InterfaceC7674c interfaceC7674c) {
            this.f53263f = interfaceC7674c;
        }

        @Override // com.google.common.collect.LinkedHashMultimap.InterfaceC7674c
        public void setSuccessorInValueSet(InterfaceC7674c interfaceC7674c) {
            this.f53262e = interfaceC7674c;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f53260c;
        }
    }

    /* renamed from: com.google.common.collect.LinkedHashMultimap$c */
    /* loaded from: classes4.dex */
    public interface InterfaceC7674c {
        InterfaceC7674c getPredecessorInValueSet();

        InterfaceC7674c getSuccessorInValueSet();

        void setPredecessorInValueSet(InterfaceC7674c interfaceC7674c);

        void setSuccessorInValueSet(InterfaceC7674c interfaceC7674c);
    }

    private LinkedHashMultimap(int i, int i2) {
        super(AbstractC7981k.m40226f(i));
        this.valueSetCapacity = 2;
        AbstractC5406bs.m51814b(i2, "expectedValuesPerKey");
        this.valueSetCapacity = i2;
        ValueEntry<K, V> newHeader = ValueEntry.newHeader();
        this.multimapHeaderEntry = newHeader;
        succeedsInMultimap(newHeader, newHeader);
    }

    public static <K, V> LinkedHashMultimap<K, V> create() {
        return new LinkedHashMultimap<>(16, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <K, V> void deleteFromMultimap(ValueEntry<K, V> valueEntry) {
        succeedsInMultimap(valueEntry.getPredecessorInMultimap(), valueEntry.getSuccessorInMultimap());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <K, V> void deleteFromValueSet(InterfaceC7674c interfaceC7674c) {
        succeedsInValueSet(interfaceC7674c.getPredecessorInValueSet(), interfaceC7674c.getSuccessorInValueSet());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @J2ktIncompatible
    @GwtIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        ValueEntry<K, V> newHeader = ValueEntry.newHeader();
        this.multimapHeaderEntry = newHeader;
        succeedsInMultimap(newHeader, newHeader);
        this.valueSetCapacity = 2;
        int readInt = objectInputStream.readInt();
        Map m40226f = AbstractC7981k.m40226f(12);
        for (int i = 0; i < readInt; i++) {
            Object readObject = objectInputStream.readObject();
            m40226f.put(readObject, createCollection(readObject));
        }
        int readInt2 = objectInputStream.readInt();
        for (int i2 = 0; i2 < readInt2; i2++) {
            Object readObject2 = objectInputStream.readObject();
            Object readObject3 = objectInputStream.readObject();
            Collection collection = (Collection) m40226f.get(readObject2);
            Objects.requireNonNull(collection);
            collection.add(readObject3);
        }
        setMap(m40226f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <K, V> void succeedsInMultimap(ValueEntry<K, V> valueEntry, ValueEntry<K, V> valueEntry2) {
        valueEntry.setSuccessorInMultimap(valueEntry2);
        valueEntry2.setPredecessorInMultimap(valueEntry);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <K, V> void succeedsInValueSet(InterfaceC7674c interfaceC7674c, InterfaceC7674c interfaceC7674c2) {
        interfaceC7674c.setSuccessorInValueSet(interfaceC7674c2);
        interfaceC7674c2.setPredecessorInValueSet(interfaceC7674c);
    }

    @J2ktIncompatible
    @GwtIncompatible
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(keySet().size());
        for (K k : keySet()) {
            objectOutputStream.writeObject(k);
        }
        objectOutputStream.writeInt(size());
        for (Map.Entry<K, V> entry : entries()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractC7947a, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public /* bridge */ /* synthetic */ Map asMap() {
        return super.asMap();
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap
    public void clear() {
        super.clear();
        ValueEntry<K, V> valueEntry = this.multimapHeaderEntry;
        succeedsInMultimap(valueEntry, valueEntry);
    }

    @Override // com.google.common.collect.AbstractC7947a, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ boolean containsEntry(@CheckForNull Object obj, @CheckForNull Object obj2) {
        return super.containsEntry(obj, obj2);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ boolean containsKey(@CheckForNull Object obj) {
        return super.containsKey(obj);
    }

    @Override // com.google.common.collect.AbstractC7947a, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ boolean containsValue(@CheckForNull Object obj) {
        return super.containsValue(obj);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractC7947a
    public Iterator<Map.Entry<K, V>> entryIterator() {
        return new C7671a();
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractC7947a, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public /* bridge */ /* synthetic */ boolean equals(@CheckForNull Object obj) {
        return super.equals(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap, com.google.common.collect.SetMultimap
    public /* bridge */ /* synthetic */ Set get(Object obj) {
        return super.get((LinkedHashMultimap<K, V>) obj);
    }

    @Override // com.google.common.collect.AbstractC7947a, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.common.collect.AbstractC7947a, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // com.google.common.collect.AbstractC7947a, com.google.common.collect.Multimap
    public Set<K> keySet() {
        return (Set<K>) super.keySet();
    }

    @Override // com.google.common.collect.AbstractC7947a, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ Multiset keys() {
        return super.keys();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractC7947a, com.google.common.collect.Multimap
    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ boolean put(Object obj, Object obj2) {
        return super.put(obj, obj2);
    }

    @Override // com.google.common.collect.AbstractC7947a, com.google.common.collect.Multimap
    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ boolean putAll(Multimap multimap) {
        return super.putAll(multimap);
    }

    @Override // com.google.common.collect.AbstractC7947a, com.google.common.collect.Multimap
    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ boolean remove(@CheckForNull Object obj, @CheckForNull Object obj2) {
        return super.remove(obj, obj2);
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap, com.google.common.collect.SetMultimap
    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ Set removeAll(@CheckForNull Object obj) {
        return super.removeAll(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractC7947a, com.google.common.collect.Multimap, com.google.common.collect.SetMultimap
    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ Collection replaceValues(Object obj, Iterable iterable) {
        return replaceValues((LinkedHashMultimap<K, V>) obj, iterable);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ int size() {
        return super.size();
    }

    @Override // com.google.common.collect.AbstractC7947a
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractC7947a
    public Iterator<V> valueIterator() {
        return Maps.m40710R(entryIterator());
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractC7947a, com.google.common.collect.Multimap
    public Collection<V> values() {
        return super.values();
    }

    public static <K, V> LinkedHashMultimap<K, V> create(int i, int i2) {
        return new LinkedHashMultimap<>(Maps.m40697k(i), Maps.m40697k(i2));
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
    public Set<V> createCollection() {
        return AbstractC7981k.m40225g(this.valueSetCapacity);
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractC7947a, com.google.common.collect.Multimap, com.google.common.collect.SetMultimap
    public Set<Map.Entry<K, V>> entries() {
        return super.entries();
    }

    @Override // com.google.common.collect.AbstractC7947a, com.google.common.collect.Multimap
    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ boolean putAll(Object obj, Iterable iterable) {
        return super.putAll(obj, iterable);
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractC7947a, com.google.common.collect.Multimap, com.google.common.collect.SetMultimap
    @CanIgnoreReturnValue
    public Set<V> replaceValues(K k, Iterable<? extends V> iterable) {
        return super.replaceValues((LinkedHashMultimap<K, V>) k, (Iterable) iterable);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap
    public Collection<V> createCollection(K k) {
        return new C7672b(k, this.valueSetCapacity);
    }

    public static <K, V> LinkedHashMultimap<K, V> create(Multimap<? extends K, ? extends V> multimap) {
        LinkedHashMultimap<K, V> create = create(multimap.keySet().size(), 2);
        create.putAll(multimap);
        return create;
    }
}
