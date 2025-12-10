package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import javax.annotation.CheckForNull;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* JADX INFO: Access modifiers changed from: package-private */
@GwtIncompatible
/* loaded from: classes4.dex */
public class CompactHashMap<K, V> extends AbstractMap<K, V> implements Serializable {
    @VisibleForTesting
    static final double HASH_FLOODING_FPP = 0.001d;
    private static final int MAX_HASH_BUCKET_LENGTH = 9;
    private static final Object NOT_FOUND = new Object();
    @VisibleForTesting
    @CheckForNull
    transient int[] entries;
    @CheckForNull
    @LazyInit
    private transient Set<Map.Entry<K, V>> entrySetView;
    @CheckForNull
    @LazyInit
    private transient Set<K> keySetView;
    @VisibleForTesting
    @CheckForNull
    transient Object[] keys;
    private transient int metadata;
    private transient int size;
    @CheckForNull
    private transient Object table;
    @VisibleForTesting
    @CheckForNull
    transient Object[] values;
    @CheckForNull
    @LazyInit
    private transient Collection<V> valuesView;

    /* renamed from: com.google.common.collect.CompactHashMap$a */
    /* loaded from: classes4.dex */
    public class C7581a extends AbstractC7585e {
        public C7581a() {
            super(CompactHashMap.this, null);
        }

        @Override // com.google.common.collect.CompactHashMap.AbstractC7585e
        /* renamed from: b */
        public Object mo41048b(int i) {
            return CompactHashMap.this.key(i);
        }
    }

    /* renamed from: com.google.common.collect.CompactHashMap$b */
    /* loaded from: classes4.dex */
    public class C7582b extends AbstractC7585e {
        public C7582b() {
            super(CompactHashMap.this, null);
        }

        @Override // com.google.common.collect.CompactHashMap.AbstractC7585e
        /* renamed from: d */
        public Map.Entry mo41048b(int i) {
            return new C7587g(i);
        }
    }

    /* renamed from: com.google.common.collect.CompactHashMap$c */
    /* loaded from: classes4.dex */
    public class C7583c extends AbstractC7585e {
        public C7583c() {
            super(CompactHashMap.this, null);
        }

        @Override // com.google.common.collect.CompactHashMap.AbstractC7585e
        /* renamed from: b */
        public Object mo41048b(int i) {
            return CompactHashMap.this.value(i);
        }
    }

    /* renamed from: com.google.common.collect.CompactHashMap$d */
    /* loaded from: classes4.dex */
    public class C7584d extends AbstractSet {
        public C7584d() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            CompactHashMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map<K, V> delegateOrNull = CompactHashMap.this.delegateOrNull();
            if (delegateOrNull != null) {
                return delegateOrNull.entrySet().contains(obj);
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int indexOf = CompactHashMap.this.indexOf(entry.getKey());
            if (indexOf == -1 || !Objects.equal(CompactHashMap.this.value(indexOf), entry.getValue())) {
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return CompactHashMap.this.entrySetIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map<K, V> delegateOrNull = CompactHashMap.this.delegateOrNull();
            if (delegateOrNull != null) {
                return delegateOrNull.entrySet().remove(obj);
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (!CompactHashMap.this.needsAllocArrays()) {
                int hashTableMask = CompactHashMap.this.hashTableMask();
                int m29025f = AbstractC11608ju.m29025f(entry.getKey(), entry.getValue(), hashTableMask, CompactHashMap.this.requireTable(), CompactHashMap.this.requireEntries(), CompactHashMap.this.requireKeys(), CompactHashMap.this.requireValues());
                if (m29025f == -1) {
                    return false;
                }
                CompactHashMap.this.moveLastEntry(m29025f, hashTableMask);
                CompactHashMap.access$1210(CompactHashMap.this);
                CompactHashMap.this.incrementModCount();
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return CompactHashMap.this.size();
        }
    }

    /* renamed from: com.google.common.collect.CompactHashMap$f */
    /* loaded from: classes4.dex */
    public class C7586f extends AbstractSet {
        public C7586f() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            CompactHashMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return CompactHashMap.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return CompactHashMap.this.keySetIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map<K, V> delegateOrNull = CompactHashMap.this.delegateOrNull();
            if (delegateOrNull != null) {
                return delegateOrNull.keySet().remove(obj);
            }
            if (CompactHashMap.this.removeHelper(obj) != CompactHashMap.NOT_FOUND) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return CompactHashMap.this.size();
        }
    }

    /* renamed from: com.google.common.collect.CompactHashMap$g */
    /* loaded from: classes4.dex */
    public final class C7587g extends AbstractC1646X {

        /* renamed from: a */
        public final Object f53073a;

        /* renamed from: b */
        public int f53074b;

        public C7587g(int i) {
            this.f53073a = CompactHashMap.this.key(i);
            this.f53074b = i;
        }

        /* renamed from: a */
        public final void m41046a() {
            int i = this.f53074b;
            if (i == -1 || i >= CompactHashMap.this.size() || !Objects.equal(this.f53073a, CompactHashMap.this.key(this.f53074b))) {
                this.f53074b = CompactHashMap.this.indexOf(this.f53073a);
            }
        }

        @Override // p000.AbstractC1646X, java.util.Map.Entry
        public Object getKey() {
            return this.f53073a;
        }

        @Override // p000.AbstractC1646X, java.util.Map.Entry
        public Object getValue() {
            Map<K, V> delegateOrNull = CompactHashMap.this.delegateOrNull();
            if (delegateOrNull != null) {
                return AbstractC21396oJ0.m25936a(delegateOrNull.get(this.f53073a));
            }
            m41046a();
            int i = this.f53074b;
            if (i != -1) {
                return CompactHashMap.this.value(i);
            }
            return AbstractC21396oJ0.m25935b();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.AbstractC1646X, java.util.Map.Entry
        public Object setValue(Object obj) {
            Map<K, V> delegateOrNull = CompactHashMap.this.delegateOrNull();
            if (delegateOrNull != null) {
                return AbstractC21396oJ0.m25936a(delegateOrNull.put((K) this.f53073a, obj));
            }
            m41046a();
            int i = this.f53074b;
            if (i != -1) {
                Object value = CompactHashMap.this.value(i);
                CompactHashMap.this.setValue(this.f53074b, obj);
                return value;
            }
            CompactHashMap.this.put(this.f53073a, obj);
            return AbstractC21396oJ0.m25935b();
        }
    }

    /* renamed from: com.google.common.collect.CompactHashMap$h */
    /* loaded from: classes4.dex */
    public class C7588h extends AbstractCollection {
        public C7588h() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            CompactHashMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return CompactHashMap.this.valuesIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return CompactHashMap.this.size();
        }
    }

    public CompactHashMap() {
        init(3);
    }

    public static /* synthetic */ int access$1210(CompactHashMap compactHashMap) {
        int i = compactHashMap.size;
        compactHashMap.size = i - 1;
        return i;
    }

    public static <K, V> CompactHashMap<K, V> create() {
        return new CompactHashMap<>();
    }

    public static <K, V> CompactHashMap<K, V> createWithExpectedSize(int i) {
        return new CompactHashMap<>(i);
    }

    private int entry(int i) {
        return requireEntries()[i];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int hashTableMask() {
        return (1 << (this.metadata & 31)) - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int indexOf(@CheckForNull Object obj) {
        if (needsAllocArrays()) {
            return -1;
        }
        int m902d = AbstractC22736w70.m902d(obj);
        int hashTableMask = hashTableMask();
        int m29023h = AbstractC11608ju.m29023h(requireTable(), m902d & hashTableMask);
        if (m29023h == 0) {
            return -1;
        }
        int m29029b = AbstractC11608ju.m29029b(m902d, hashTableMask);
        do {
            int i = m29023h - 1;
            int entry = entry(i);
            if (AbstractC11608ju.m29029b(entry, hashTableMask) == m29029b && Objects.equal(obj, key(i))) {
                return i;
            }
            m29023h = AbstractC11608ju.m29028c(entry, hashTableMask);
        } while (m29023h != 0);
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public K key(int i) {
        return (K) requireKeys()[i];
    }

    /* JADX WARN: Multi-variable type inference failed */
    @J2ktIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        if (readInt >= 0) {
            init(readInt);
            for (int i = 0; i < readInt; i++) {
                put(objectInputStream.readObject(), objectInputStream.readObject());
            }
            return;
        }
        throw new InvalidObjectException("Invalid size: " + readInt);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object removeHelper(@CheckForNull Object obj) {
        if (needsAllocArrays()) {
            return NOT_FOUND;
        }
        int hashTableMask = hashTableMask();
        int m29025f = AbstractC11608ju.m29025f(obj, null, hashTableMask, requireTable(), requireEntries(), requireKeys(), null);
        if (m29025f == -1) {
            return NOT_FOUND;
        }
        V value = value(m29025f);
        moveLastEntry(m29025f, hashTableMask);
        this.size--;
        incrementModCount();
        return value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int[] requireEntries() {
        int[] iArr = this.entries;
        java.util.Objects.requireNonNull(iArr);
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object[] requireKeys() {
        Object[] objArr = this.keys;
        java.util.Objects.requireNonNull(objArr);
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object requireTable() {
        Object obj = this.table;
        java.util.Objects.requireNonNull(obj);
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object[] requireValues() {
        Object[] objArr = this.values;
        java.util.Objects.requireNonNull(objArr);
        return objArr;
    }

    private void resizeMeMaybe(int i) {
        int min;
        int length = requireEntries().length;
        if (i > length && (min = Math.min((int) LockFreeTaskQueueCore.MAX_CAPACITY_MASK, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            resizeEntries(min);
        }
    }

    @CanIgnoreReturnValue
    private int resizeTable(int i, int i2, int i3, int i4) {
        Object m29030a = AbstractC11608ju.m29030a(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            AbstractC11608ju.m29022i(m29030a, i3 & i5, i4 + 1);
        }
        Object requireTable = requireTable();
        int[] requireEntries = requireEntries();
        for (int i6 = 0; i6 <= i; i6++) {
            int m29023h = AbstractC11608ju.m29023h(requireTable, i6);
            while (m29023h != 0) {
                int i7 = m29023h - 1;
                int i8 = requireEntries[i7];
                int m29029b = AbstractC11608ju.m29029b(i8, i) | i6;
                int i9 = m29029b & i5;
                int m29023h2 = AbstractC11608ju.m29023h(m29030a, i9);
                AbstractC11608ju.m29022i(m29030a, i9, m29023h);
                requireEntries[i7] = AbstractC11608ju.m29027d(m29029b, m29023h2, i5);
                m29023h = AbstractC11608ju.m29028c(i8, i);
            }
        }
        this.table = m29030a;
        setHashTableMask(i5);
        return i5;
    }

    private void setEntry(int i, int i2) {
        requireEntries()[i] = i2;
    }

    private void setHashTableMask(int i) {
        this.metadata = AbstractC11608ju.m29027d(this.metadata, 32 - Integer.numberOfLeadingZeros(i), 31);
    }

    private void setKey(int i, K k) {
        requireKeys()[i] = k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(int i, V v) {
        requireValues()[i] = v;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public V value(int i) {
        return (V) requireValues()[i];
    }

    @J2ktIncompatible
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator<Map.Entry<K, V>> entrySetIterator = entrySetIterator();
        while (entrySetIterator.hasNext()) {
            Map.Entry<K, V> next = entrySetIterator.next();
            objectOutputStream.writeObject(next.getKey());
            objectOutputStream.writeObject(next.getValue());
        }
    }

    public void accessEntry(int i) {
    }

    public int adjustAfterRemove(int i, int i2) {
        return i - 1;
    }

    @CanIgnoreReturnValue
    public int allocArrays() {
        Preconditions.checkState(needsAllocArrays(), "Arrays already allocated");
        int i = this.metadata;
        int m29021j = AbstractC11608ju.m29021j(i);
        this.table = AbstractC11608ju.m29030a(m29021j);
        setHashTableMask(m29021j - 1);
        this.entries = new int[i];
        this.keys = new Object[i];
        this.values = new Object[i];
        return i;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        if (needsAllocArrays()) {
            return;
        }
        incrementModCount();
        Map<K, V> delegateOrNull = delegateOrNull();
        if (delegateOrNull != null) {
            this.metadata = Ints.constrainToRange(size(), 3, LockFreeTaskQueueCore.MAX_CAPACITY_MASK);
            delegateOrNull.clear();
            this.table = null;
            this.size = 0;
            return;
        }
        Arrays.fill(requireKeys(), 0, this.size, (Object) null);
        Arrays.fill(requireValues(), 0, this.size, (Object) null);
        AbstractC11608ju.m29024g(requireTable());
        Arrays.fill(requireEntries(), 0, this.size, 0);
        this.size = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(@CheckForNull Object obj) {
        Map<K, V> delegateOrNull = delegateOrNull();
        if (delegateOrNull != null) {
            return delegateOrNull.containsKey(obj);
        }
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(@CheckForNull Object obj) {
        Map<K, V> delegateOrNull = delegateOrNull();
        if (delegateOrNull != null) {
            return delegateOrNull.containsValue(obj);
        }
        for (int i = 0; i < this.size; i++) {
            if (Objects.equal(obj, value(i))) {
                return true;
            }
        }
        return false;
    }

    @CanIgnoreReturnValue
    public Map<K, V> convertToHashFloodingResistantImplementation() {
        Map<K, V> createHashFloodingResistantDelegate = createHashFloodingResistantDelegate(hashTableMask() + 1);
        int firstEntryIndex = firstEntryIndex();
        while (firstEntryIndex >= 0) {
            createHashFloodingResistantDelegate.put(key(firstEntryIndex), value(firstEntryIndex));
            firstEntryIndex = getSuccessor(firstEntryIndex);
        }
        this.table = createHashFloodingResistantDelegate;
        this.entries = null;
        this.keys = null;
        this.values = null;
        incrementModCount();
        return createHashFloodingResistantDelegate;
    }

    public Set<Map.Entry<K, V>> createEntrySet() {
        return new C7584d();
    }

    public Map<K, V> createHashFloodingResistantDelegate(int i) {
        return new LinkedHashMap(i, 1.0f);
    }

    public Set<K> createKeySet() {
        return new C7586f();
    }

    public Collection<V> createValues() {
        return new C7588h();
    }

    @VisibleForTesting
    @CheckForNull
    public Map<K, V> delegateOrNull() {
        Object obj = this.table;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.entrySetView;
        if (set == null) {
            Set<Map.Entry<K, V>> createEntrySet = createEntrySet();
            this.entrySetView = createEntrySet;
            return createEntrySet;
        }
        return set;
    }

    public Iterator<Map.Entry<K, V>> entrySetIterator() {
        Map<K, V> delegateOrNull = delegateOrNull();
        if (delegateOrNull != null) {
            return delegateOrNull.entrySet().iterator();
        }
        return new C7582b();
    }

    public int firstEntryIndex() {
        if (isEmpty()) {
            return -1;
        }
        return 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CheckForNull
    public V get(@CheckForNull Object obj) {
        Map<K, V> delegateOrNull = delegateOrNull();
        if (delegateOrNull != null) {
            return delegateOrNull.get(obj);
        }
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return null;
        }
        accessEntry(indexOf);
        return value(indexOf);
    }

    public int getSuccessor(int i) {
        int i2 = i + 1;
        if (i2 >= this.size) {
            return -1;
        }
        return i2;
    }

    public void incrementModCount() {
        this.metadata += 32;
    }

    public void init(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "Expected size must be >= 0");
        this.metadata = Ints.constrainToRange(i, 1, LockFreeTaskQueueCore.MAX_CAPACITY_MASK);
    }

    public void insertEntry(int i, K k, V v, int i2, int i3) {
        setEntry(i, AbstractC11608ju.m29027d(i2, 0, i3));
        setKey(i, k);
        setValue(i, v);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.keySetView;
        if (set == null) {
            Set<K> createKeySet = createKeySet();
            this.keySetView = createKeySet;
            return createKeySet;
        }
        return set;
    }

    public Iterator<K> keySetIterator() {
        Map<K, V> delegateOrNull = delegateOrNull();
        if (delegateOrNull != null) {
            return delegateOrNull.keySet().iterator();
        }
        return new C7581a();
    }

    public void moveLastEntry(int i, int i2) {
        Object requireTable = requireTable();
        int[] requireEntries = requireEntries();
        Object[] requireKeys = requireKeys();
        Object[] requireValues = requireValues();
        int size = size();
        int i3 = size - 1;
        if (i < i3) {
            Object obj = requireKeys[i3];
            requireKeys[i] = obj;
            requireValues[i] = requireValues[i3];
            requireKeys[i3] = null;
            requireValues[i3] = null;
            requireEntries[i] = requireEntries[i3];
            requireEntries[i3] = 0;
            int m902d = AbstractC22736w70.m902d(obj) & i2;
            int m29023h = AbstractC11608ju.m29023h(requireTable, m902d);
            if (m29023h == size) {
                AbstractC11608ju.m29022i(requireTable, m902d, i + 1);
                return;
            }
            while (true) {
                int i4 = m29023h - 1;
                int i5 = requireEntries[i4];
                int m29028c = AbstractC11608ju.m29028c(i5, i2);
                if (m29028c == size) {
                    requireEntries[i4] = AbstractC11608ju.m29027d(i5, i + 1, i2);
                    return;
                }
                m29023h = m29028c;
            }
        } else {
            requireKeys[i] = null;
            requireValues[i] = null;
            requireEntries[i] = 0;
        }
    }

    public boolean needsAllocArrays() {
        if (this.table == null) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CanIgnoreReturnValue
    @CheckForNull
    public V put(K k, V v) {
        int resizeTable;
        int i;
        if (needsAllocArrays()) {
            allocArrays();
        }
        Map<K, V> delegateOrNull = delegateOrNull();
        if (delegateOrNull != null) {
            return delegateOrNull.put(k, v);
        }
        int[] requireEntries = requireEntries();
        Object[] requireKeys = requireKeys();
        Object[] requireValues = requireValues();
        int i2 = this.size;
        int i3 = i2 + 1;
        int m902d = AbstractC22736w70.m902d(k);
        int hashTableMask = hashTableMask();
        int i4 = m902d & hashTableMask;
        int m29023h = AbstractC11608ju.m29023h(requireTable(), i4);
        if (m29023h == 0) {
            if (i3 > hashTableMask) {
                resizeTable = resizeTable(hashTableMask, AbstractC11608ju.m29026e(hashTableMask), m902d, i2);
                i = resizeTable;
            } else {
                AbstractC11608ju.m29022i(requireTable(), i4, i3);
                i = hashTableMask;
            }
        } else {
            int m29029b = AbstractC11608ju.m29029b(m902d, hashTableMask);
            int i5 = 0;
            while (true) {
                int i6 = m29023h - 1;
                int i7 = requireEntries[i6];
                if (AbstractC11608ju.m29029b(i7, hashTableMask) == m29029b && Objects.equal(k, requireKeys[i6])) {
                    V v2 = (V) requireValues[i6];
                    requireValues[i6] = v;
                    accessEntry(i6);
                    return v2;
                }
                int m29028c = AbstractC11608ju.m29028c(i7, hashTableMask);
                i5++;
                if (m29028c == 0) {
                    if (i5 >= 9) {
                        return convertToHashFloodingResistantImplementation().put(k, v);
                    }
                    if (i3 > hashTableMask) {
                        resizeTable = resizeTable(hashTableMask, AbstractC11608ju.m29026e(hashTableMask), m902d, i2);
                    } else {
                        requireEntries[i6] = AbstractC11608ju.m29027d(i7, i3, hashTableMask);
                    }
                } else {
                    m29023h = m29028c;
                }
            }
        }
        resizeMeMaybe(i3);
        insertEntry(i2, k, v, m902d, i);
        this.size = i3;
        incrementModCount();
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CanIgnoreReturnValue
    @CheckForNull
    public V remove(@CheckForNull Object obj) {
        Map<K, V> delegateOrNull = delegateOrNull();
        if (delegateOrNull != null) {
            return delegateOrNull.remove(obj);
        }
        V v = (V) removeHelper(obj);
        if (v == NOT_FOUND) {
            return null;
        }
        return v;
    }

    public void resizeEntries(int i) {
        this.entries = Arrays.copyOf(requireEntries(), i);
        this.keys = Arrays.copyOf(requireKeys(), i);
        this.values = Arrays.copyOf(requireValues(), i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        Map<K, V> delegateOrNull = delegateOrNull();
        if (delegateOrNull != null) {
            return delegateOrNull.size();
        }
        return this.size;
    }

    public void trimToSize() {
        if (needsAllocArrays()) {
            return;
        }
        Map<K, V> delegateOrNull = delegateOrNull();
        if (delegateOrNull != null) {
            Map<K, V> createHashFloodingResistantDelegate = createHashFloodingResistantDelegate(size());
            createHashFloodingResistantDelegate.putAll(delegateOrNull);
            this.table = createHashFloodingResistantDelegate;
            return;
        }
        int i = this.size;
        if (i < requireEntries().length) {
            resizeEntries(i);
        }
        int m29021j = AbstractC11608ju.m29021j(i);
        int hashTableMask = hashTableMask();
        if (m29021j < hashTableMask) {
            resizeTable(hashTableMask, m29021j, 0, 0);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        Collection<V> collection = this.valuesView;
        if (collection == null) {
            Collection<V> createValues = createValues();
            this.valuesView = createValues;
            return createValues;
        }
        return collection;
    }

    public Iterator<V> valuesIterator() {
        Map<K, V> delegateOrNull = delegateOrNull();
        if (delegateOrNull != null) {
            return delegateOrNull.values().iterator();
        }
        return new C7583c();
    }

    public CompactHashMap(int i) {
        init(i);
    }

    /* renamed from: com.google.common.collect.CompactHashMap$e */
    /* loaded from: classes4.dex */
    public abstract class AbstractC7585e implements Iterator {

        /* renamed from: a */
        public int f53068a;

        /* renamed from: b */
        public int f53069b;

        /* renamed from: c */
        public int f53070c;

        public AbstractC7585e() {
            this.f53068a = CompactHashMap.this.metadata;
            this.f53069b = CompactHashMap.this.firstEntryIndex();
            this.f53070c = -1;
        }

        /* renamed from: a */
        public final void m41049a() {
            if (CompactHashMap.this.metadata == this.f53068a) {
                return;
            }
            throw new ConcurrentModificationException();
        }

        /* renamed from: b */
        public abstract Object mo41048b(int i);

        /* renamed from: c */
        public void m41047c() {
            this.f53068a += 32;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f53069b >= 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            m41049a();
            if (hasNext()) {
                int i = this.f53069b;
                this.f53070c = i;
                Object mo41048b = mo41048b(i);
                this.f53069b = CompactHashMap.this.getSuccessor(this.f53069b);
                return mo41048b;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            boolean z;
            m41049a();
            if (this.f53070c >= 0) {
                z = true;
            } else {
                z = false;
            }
            AbstractC5406bs.m51811e(z);
            m41047c();
            CompactHashMap compactHashMap = CompactHashMap.this;
            compactHashMap.remove(compactHashMap.key(this.f53070c));
            this.f53069b = CompactHashMap.this.adjustAfterRemove(this.f53069b, this.f53070c);
            this.f53070c = -1;
        }

        public /* synthetic */ AbstractC7585e(CompactHashMap compactHashMap, C7581a c7581a) {
            this();
        }
    }
}
