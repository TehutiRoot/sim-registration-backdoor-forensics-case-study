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
    public static final class ValueEntry<K, V> extends ImmutableEntry<K, V> implements InterfaceC7663c {
        @CheckForNull
        ValueEntry<K, V> nextInValueBucket;
        @CheckForNull
        private ValueEntry<K, V> predecessorInMultimap;
        @CheckForNull
        private InterfaceC7663c predecessorInValueSet;
        final int smearedValueHash;
        @CheckForNull
        private ValueEntry<K, V> successorInMultimap;
        @CheckForNull
        private InterfaceC7663c successorInValueSet;

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

        @Override // com.google.common.collect.LinkedHashMultimap.InterfaceC7663c
        public InterfaceC7663c getPredecessorInValueSet() {
            InterfaceC7663c interfaceC7663c = this.predecessorInValueSet;
            Objects.requireNonNull(interfaceC7663c);
            return interfaceC7663c;
        }

        public ValueEntry<K, V> getSuccessorInMultimap() {
            ValueEntry<K, V> valueEntry = this.successorInMultimap;
            Objects.requireNonNull(valueEntry);
            return valueEntry;
        }

        @Override // com.google.common.collect.LinkedHashMultimap.InterfaceC7663c
        public InterfaceC7663c getSuccessorInValueSet() {
            InterfaceC7663c interfaceC7663c = this.successorInValueSet;
            Objects.requireNonNull(interfaceC7663c);
            return interfaceC7663c;
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

        @Override // com.google.common.collect.LinkedHashMultimap.InterfaceC7663c
        public void setPredecessorInValueSet(InterfaceC7663c interfaceC7663c) {
            this.predecessorInValueSet = interfaceC7663c;
        }

        public void setSuccessorInMultimap(ValueEntry<K, V> valueEntry) {
            this.successorInMultimap = valueEntry;
        }

        @Override // com.google.common.collect.LinkedHashMultimap.InterfaceC7663c
        public void setSuccessorInValueSet(InterfaceC7663c interfaceC7663c) {
            this.successorInValueSet = interfaceC7663c;
        }
    }

    /* renamed from: com.google.common.collect.LinkedHashMultimap$a */
    /* loaded from: classes4.dex */
    public class C7660a implements Iterator {

        /* renamed from: a */
        public ValueEntry f53267a;

        /* renamed from: b */
        public ValueEntry f53268b;

        public C7660a() {
            this.f53267a = LinkedHashMultimap.this.multimapHeaderEntry.getSuccessorInMultimap();
        }

        @Override // java.util.Iterator
        /* renamed from: a */
        public Map.Entry next() {
            if (hasNext()) {
                ValueEntry valueEntry = this.f53267a;
                this.f53268b = valueEntry;
                this.f53267a = valueEntry.getSuccessorInMultimap();
                return valueEntry;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f53267a != LinkedHashMultimap.this.multimapHeaderEntry) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            boolean z;
            if (this.f53268b != null) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkState(z, "no calls to next() since the last call to remove()");
            LinkedHashMultimap.this.remove(this.f53268b.getKey(), this.f53268b.getValue());
            this.f53268b = null;
        }
    }

    /* renamed from: com.google.common.collect.LinkedHashMultimap$b */
    /* loaded from: classes4.dex */
    public final class C7661b extends Sets.AbstractC7846j implements InterfaceC7663c {

        /* renamed from: a */
        public final Object f53270a;

        /* renamed from: b */
        public ValueEntry[] f53271b;

        /* renamed from: c */
        public int f53272c = 0;

        /* renamed from: d */
        public int f53273d = 0;

        /* renamed from: e */
        public InterfaceC7663c f53274e = this;

        /* renamed from: f */
        public InterfaceC7663c f53275f = this;

        /* renamed from: com.google.common.collect.LinkedHashMultimap$b$a */
        /* loaded from: classes4.dex */
        public class C7662a implements Iterator {

            /* renamed from: a */
            public InterfaceC7663c f53277a;

            /* renamed from: b */
            public ValueEntry f53278b;

            /* renamed from: c */
            public int f53279c;

            public C7662a() {
                this.f53277a = C7661b.this.f53274e;
                this.f53279c = C7661b.this.f53273d;
            }

            /* renamed from: a */
            public final void m40812a() {
                if (C7661b.this.f53273d == this.f53279c) {
                    return;
                }
                throw new ConcurrentModificationException();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                m40812a();
                if (this.f53277a != C7661b.this) {
                    return true;
                }
                return false;
            }

            @Override // java.util.Iterator
            public Object next() {
                if (hasNext()) {
                    ValueEntry valueEntry = (ValueEntry) this.f53277a;
                    V value = valueEntry.getValue();
                    this.f53278b = valueEntry;
                    this.f53277a = valueEntry.getSuccessorInValueSet();
                    return value;
                }
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public void remove() {
                boolean z;
                m40812a();
                if (this.f53278b != null) {
                    z = true;
                } else {
                    z = false;
                }
                Preconditions.checkState(z, "no calls to next() since the last call to remove()");
                C7661b.this.remove(this.f53278b.getValue());
                this.f53279c = C7661b.this.f53273d;
                this.f53278b = null;
            }
        }

        public C7661b(Object obj, int i) {
            this.f53270a = obj;
            this.f53271b = new ValueEntry[C70.m68997a(i, 1.0d)];
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean add(Object obj) {
            int m68994d = C70.m68994d(obj);
            int m40814c = m40814c() & m68994d;
            ValueEntry<K, V> valueEntry = this.f53271b[m40814c];
            for (ValueEntry<K, V> valueEntry2 = valueEntry; valueEntry2 != null; valueEntry2 = valueEntry2.nextInValueBucket) {
                if (valueEntry2.matchesValue(obj, m68994d)) {
                    return false;
                }
            }
            ValueEntry valueEntry3 = new ValueEntry(this.f53270a, obj, m68994d, valueEntry);
            LinkedHashMultimap.succeedsInValueSet(this.f53275f, valueEntry3);
            LinkedHashMultimap.succeedsInValueSet(valueEntry3, this);
            LinkedHashMultimap.succeedsInMultimap(LinkedHashMultimap.this.multimapHeaderEntry.getPredecessorInMultimap(), valueEntry3);
            LinkedHashMultimap.succeedsInMultimap(valueEntry3, LinkedHashMultimap.this.multimapHeaderEntry);
            this.f53271b[m40814c] = valueEntry3;
            this.f53272c++;
            this.f53273d++;
            m40813d();
            return true;
        }

        /* renamed from: c */
        public final int m40814c() {
            return this.f53271b.length - 1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            Arrays.fill(this.f53271b, (Object) null);
            this.f53272c = 0;
            for (InterfaceC7663c interfaceC7663c = this.f53274e; interfaceC7663c != this; interfaceC7663c = interfaceC7663c.getSuccessorInValueSet()) {
                LinkedHashMultimap.deleteFromMultimap((ValueEntry) interfaceC7663c);
            }
            LinkedHashMultimap.succeedsInValueSet(this, this);
            this.f53273d++;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            int m68994d = C70.m68994d(obj);
            for (ValueEntry<K, V> valueEntry = this.f53271b[m40814c() & m68994d]; valueEntry != null; valueEntry = valueEntry.nextInValueBucket) {
                if (valueEntry.matchesValue(obj, m68994d)) {
                    return true;
                }
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v1, types: [com.google.common.collect.LinkedHashMultimap$c] */
        /* renamed from: d */
        public final void m40813d() {
            if (C70.m68996b(this.f53272c, this.f53271b.length, 1.0d)) {
                int length = this.f53271b.length * 2;
                ValueEntry<K, V>[] valueEntryArr = new ValueEntry[length];
                this.f53271b = valueEntryArr;
                int i = length - 1;
                for (ValueEntry<K, V> valueEntry = this.f53274e; valueEntry != this; valueEntry = valueEntry.getSuccessorInValueSet()) {
                    ValueEntry<K, V> valueEntry2 = valueEntry;
                    int i2 = valueEntry2.smearedValueHash & i;
                    valueEntry2.nextInValueBucket = valueEntryArr[i2];
                    valueEntryArr[i2] = valueEntry2;
                }
            }
        }

        @Override // com.google.common.collect.LinkedHashMultimap.InterfaceC7663c
        public InterfaceC7663c getPredecessorInValueSet() {
            return this.f53275f;
        }

        @Override // com.google.common.collect.LinkedHashMultimap.InterfaceC7663c
        public InterfaceC7663c getSuccessorInValueSet() {
            return this.f53274e;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new C7662a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            int m68994d = C70.m68994d(obj);
            int m40814c = m40814c() & m68994d;
            ValueEntry<K, V> valueEntry = null;
            for (ValueEntry<K, V> valueEntry2 = this.f53271b[m40814c]; valueEntry2 != null; valueEntry2 = valueEntry2.nextInValueBucket) {
                if (valueEntry2.matchesValue(obj, m68994d)) {
                    if (valueEntry == null) {
                        this.f53271b[m40814c] = valueEntry2.nextInValueBucket;
                    } else {
                        valueEntry.nextInValueBucket = valueEntry2.nextInValueBucket;
                    }
                    LinkedHashMultimap.deleteFromValueSet(valueEntry2);
                    LinkedHashMultimap.deleteFromMultimap(valueEntry2);
                    this.f53272c--;
                    this.f53273d++;
                    return true;
                }
                valueEntry = valueEntry2;
            }
            return false;
        }

        @Override // com.google.common.collect.LinkedHashMultimap.InterfaceC7663c
        public void setPredecessorInValueSet(InterfaceC7663c interfaceC7663c) {
            this.f53275f = interfaceC7663c;
        }

        @Override // com.google.common.collect.LinkedHashMultimap.InterfaceC7663c
        public void setSuccessorInValueSet(InterfaceC7663c interfaceC7663c) {
            this.f53274e = interfaceC7663c;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f53272c;
        }
    }

    /* renamed from: com.google.common.collect.LinkedHashMultimap$c */
    /* loaded from: classes4.dex */
    public interface InterfaceC7663c {
        InterfaceC7663c getPredecessorInValueSet();

        InterfaceC7663c getSuccessorInValueSet();

        void setPredecessorInValueSet(InterfaceC7663c interfaceC7663c);

        void setSuccessorInValueSet(InterfaceC7663c interfaceC7663c);
    }

    private LinkedHashMultimap(int i, int i2) {
        super(AbstractC7970k.m40217f(i));
        this.valueSetCapacity = 2;
        AbstractC5383bs.m51877b(i2, "expectedValuesPerKey");
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
    public static <K, V> void deleteFromValueSet(InterfaceC7663c interfaceC7663c) {
        succeedsInValueSet(interfaceC7663c.getPredecessorInValueSet(), interfaceC7663c.getSuccessorInValueSet());
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
        Map m40217f = AbstractC7970k.m40217f(12);
        for (int i = 0; i < readInt; i++) {
            Object readObject = objectInputStream.readObject();
            m40217f.put(readObject, createCollection(readObject));
        }
        int readInt2 = objectInputStream.readInt();
        for (int i2 = 0; i2 < readInt2; i2++) {
            Object readObject2 = objectInputStream.readObject();
            Object readObject3 = objectInputStream.readObject();
            Collection collection = (Collection) m40217f.get(readObject2);
            Objects.requireNonNull(collection);
            collection.add(readObject3);
        }
        setMap(m40217f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <K, V> void succeedsInMultimap(ValueEntry<K, V> valueEntry, ValueEntry<K, V> valueEntry2) {
        valueEntry.setSuccessorInMultimap(valueEntry2);
        valueEntry2.setPredecessorInMultimap(valueEntry);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <K, V> void succeedsInValueSet(InterfaceC7663c interfaceC7663c, InterfaceC7663c interfaceC7663c2) {
        interfaceC7663c.setSuccessorInValueSet(interfaceC7663c2);
        interfaceC7663c2.setPredecessorInValueSet(interfaceC7663c);
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

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractC7936a, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public /* bridge */ /* synthetic */ Map asMap() {
        return super.asMap();
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap
    public void clear() {
        super.clear();
        ValueEntry<K, V> valueEntry = this.multimapHeaderEntry;
        succeedsInMultimap(valueEntry, valueEntry);
    }

    @Override // com.google.common.collect.AbstractC7936a, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ boolean containsEntry(@CheckForNull Object obj, @CheckForNull Object obj2) {
        return super.containsEntry(obj, obj2);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ boolean containsKey(@CheckForNull Object obj) {
        return super.containsKey(obj);
    }

    @Override // com.google.common.collect.AbstractC7936a, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ boolean containsValue(@CheckForNull Object obj) {
        return super.containsValue(obj);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractC7936a
    public Iterator<Map.Entry<K, V>> entryIterator() {
        return new C7660a();
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractC7936a, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public /* bridge */ /* synthetic */ boolean equals(@CheckForNull Object obj) {
        return super.equals(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap, com.google.common.collect.SetMultimap
    public /* bridge */ /* synthetic */ Set get(Object obj) {
        return super.get((LinkedHashMultimap<K, V>) obj);
    }

    @Override // com.google.common.collect.AbstractC7936a, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.common.collect.AbstractC7936a, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // com.google.common.collect.AbstractC7936a, com.google.common.collect.Multimap
    public Set<K> keySet() {
        return (Set<K>) super.keySet();
    }

    @Override // com.google.common.collect.AbstractC7936a, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ Multiset keys() {
        return super.keys();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractC7936a, com.google.common.collect.Multimap
    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ boolean put(Object obj, Object obj2) {
        return super.put(obj, obj2);
    }

    @Override // com.google.common.collect.AbstractC7936a, com.google.common.collect.Multimap
    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ boolean putAll(Multimap multimap) {
        return super.putAll(multimap);
    }

    @Override // com.google.common.collect.AbstractC7936a, com.google.common.collect.Multimap
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
    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractC7936a, com.google.common.collect.Multimap, com.google.common.collect.SetMultimap
    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ Collection replaceValues(Object obj, Iterable iterable) {
        return replaceValues((LinkedHashMultimap<K, V>) obj, iterable);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ int size() {
        return super.size();
    }

    @Override // com.google.common.collect.AbstractC7936a
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractC7936a
    public Iterator<V> valueIterator() {
        return Maps.m40699R(entryIterator());
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractC7936a, com.google.common.collect.Multimap
    public Collection<V> values() {
        return super.values();
    }

    public static <K, V> LinkedHashMultimap<K, V> create(int i, int i2) {
        return new LinkedHashMultimap<>(Maps.m40686k(i), Maps.m40686k(i2));
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
    public Set<V> createCollection() {
        return AbstractC7970k.m40216g(this.valueSetCapacity);
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractC7936a, com.google.common.collect.Multimap, com.google.common.collect.SetMultimap
    public Set<Map.Entry<K, V>> entries() {
        return super.entries();
    }

    @Override // com.google.common.collect.AbstractC7936a, com.google.common.collect.Multimap
    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ boolean putAll(Object obj, Iterable iterable) {
        return super.putAll(obj, iterable);
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractC7936a, com.google.common.collect.Multimap, com.google.common.collect.SetMultimap
    @CanIgnoreReturnValue
    public Set<V> replaceValues(K k, Iterable<? extends V> iterable) {
        return super.replaceValues((LinkedHashMultimap<K, V>) k, (Iterable) iterable);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap
    public Collection<V> createCollection(K k) {
        return new C7661b(k, this.valueSetCapacity);
    }

    public static <K, V> LinkedHashMultimap<K, V> create(Multimap<? extends K, ? extends V> multimap) {
        LinkedHashMultimap<K, V> create = create(multimap.keySet().size(), 2);
        create.putAll(multimap);
        return create;
    }
}