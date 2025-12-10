package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableCollection;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.LazyInit;
import com.google.j2objc.annotations.RetainedWith;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import javax.annotation.CheckForNull;

@GwtCompatible
/* loaded from: classes4.dex */
public final class HashBiMap<K, V> extends AbstractMap<K, V> implements BiMap<K, V>, Serializable {
    private static final int ABSENT = -1;
    private static final int ENDPOINT = -2;
    @LazyInit
    private transient Set<Map.Entry<K, V>> entrySet;
    private transient int firstInInsertionOrder;
    private transient int[] hashTableKToV;
    private transient int[] hashTableVToK;
    @RetainedWith
    @CheckForNull
    @LazyInit
    private transient BiMap<V, K> inverse;
    @LazyInit
    private transient Set<K> keySet;
    transient K[] keys;
    private transient int lastInInsertionOrder;
    transient int modCount;
    private transient int[] nextInBucketKToV;
    private transient int[] nextInBucketVToK;
    private transient int[] nextInInsertionOrder;
    private transient int[] prevInInsertionOrder;
    transient int size;
    @LazyInit
    private transient Set<V> valueSet;
    transient V[] values;

    /* loaded from: classes4.dex */
    public static class Inverse<K, V> extends AbstractMap<V, K> implements BiMap<V, K>, Serializable {
        private final HashBiMap<K, V> forward;
        private transient Set<Map.Entry<V, K>> inverseEntrySet;

        public Inverse(HashBiMap<K, V> hashBiMap) {
            this.forward = hashBiMap;
        }

        @GwtIncompatible("serialization")
        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            ((HashBiMap) this.forward).inverse = this;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            this.forward.clear();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@CheckForNull Object obj) {
            return this.forward.containsValue(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsValue(@CheckForNull Object obj) {
            return this.forward.containsKey(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<V, K>> entrySet() {
            Set<Map.Entry<V, K>> set = this.inverseEntrySet;
            if (set == null) {
                C7614d c7614d = new C7614d(this.forward);
                this.inverseEntrySet = c7614d;
                return c7614d;
            }
            return set;
        }

        @Override // com.google.common.collect.BiMap
        @CanIgnoreReturnValue
        @CheckForNull
        public K forcePut(V v, K k) {
            return this.forward.putInverse(v, k, true);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @CheckForNull
        public K get(@CheckForNull Object obj) {
            return this.forward.getInverse(obj);
        }

        @Override // com.google.common.collect.BiMap
        public BiMap<K, V> inverse() {
            return this.forward;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<V> keySet() {
            return this.forward.values();
        }

        @Override // java.util.AbstractMap, java.util.Map, com.google.common.collect.BiMap
        @CanIgnoreReturnValue
        @CheckForNull
        public K put(V v, K k) {
            return this.forward.putInverse(v, k, false);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @CanIgnoreReturnValue
        @CheckForNull
        public K remove(@CheckForNull Object obj) {
            return this.forward.removeInverse(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.forward.size;
        }

        @Override // java.util.AbstractMap, java.util.Map, com.google.common.collect.BiMap
        public Set<K> values() {
            return this.forward.keySet();
        }
    }

    /* renamed from: com.google.common.collect.HashBiMap$a */
    /* loaded from: classes4.dex */
    public final class C7611a extends AbstractC1646X {

        /* renamed from: a */
        public final Object f53123a;

        /* renamed from: b */
        public int f53124b;

        public C7611a(int i) {
            this.f53123a = AbstractC21396oJ0.m25936a(HashBiMap.this.keys[i]);
            this.f53124b = i;
        }

        /* renamed from: a */
        public void m41022a() {
            int i = this.f53124b;
            if (i != -1) {
                HashBiMap hashBiMap = HashBiMap.this;
                if (i <= hashBiMap.size && Objects.equal(hashBiMap.keys[i], this.f53123a)) {
                    return;
                }
            }
            this.f53124b = HashBiMap.this.findEntryByKey(this.f53123a);
        }

        @Override // p000.AbstractC1646X, java.util.Map.Entry
        public Object getKey() {
            return this.f53123a;
        }

        @Override // p000.AbstractC1646X, java.util.Map.Entry
        public Object getValue() {
            m41022a();
            int i = this.f53124b;
            if (i == -1) {
                return AbstractC21396oJ0.m25935b();
            }
            return AbstractC21396oJ0.m25936a(HashBiMap.this.values[i]);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.AbstractC1646X, java.util.Map.Entry
        public Object setValue(Object obj) {
            m41022a();
            int i = this.f53124b;
            if (i == -1) {
                HashBiMap.this.put(this.f53123a, obj);
                return AbstractC21396oJ0.m25935b();
            }
            Object m25936a = AbstractC21396oJ0.m25936a(HashBiMap.this.values[i]);
            if (!Objects.equal(m25936a, obj)) {
                HashBiMap.this.replaceValueInEntry(this.f53124b, obj, false);
                return m25936a;
            }
            return obj;
        }
    }

    /* renamed from: com.google.common.collect.HashBiMap$b */
    /* loaded from: classes4.dex */
    public static final class C7612b extends AbstractC1646X {

        /* renamed from: a */
        public final HashBiMap f53126a;

        /* renamed from: b */
        public final Object f53127b;

        /* renamed from: c */
        public int f53128c;

        public C7612b(HashBiMap hashBiMap, int i) {
            this.f53126a = hashBiMap;
            this.f53127b = AbstractC21396oJ0.m25936a(hashBiMap.values[i]);
            this.f53128c = i;
        }

        /* renamed from: a */
        private void m41021a() {
            int i = this.f53128c;
            if (i != -1) {
                HashBiMap hashBiMap = this.f53126a;
                if (i <= hashBiMap.size && Objects.equal(this.f53127b, hashBiMap.values[i])) {
                    return;
                }
            }
            this.f53128c = this.f53126a.findEntryByValue(this.f53127b);
        }

        @Override // p000.AbstractC1646X, java.util.Map.Entry
        public Object getKey() {
            return this.f53127b;
        }

        @Override // p000.AbstractC1646X, java.util.Map.Entry
        public Object getValue() {
            m41021a();
            int i = this.f53128c;
            if (i == -1) {
                return AbstractC21396oJ0.m25935b();
            }
            return AbstractC21396oJ0.m25936a(this.f53126a.keys[i]);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.AbstractC1646X, java.util.Map.Entry
        public Object setValue(Object obj) {
            m41021a();
            int i = this.f53128c;
            if (i == -1) {
                this.f53126a.putInverse(this.f53127b, obj, false);
                return AbstractC21396oJ0.m25935b();
            }
            Object m25936a = AbstractC21396oJ0.m25936a(this.f53126a.keys[i]);
            if (!Objects.equal(m25936a, obj)) {
                this.f53126a.replaceKeyInEntry(this.f53128c, obj, false);
                return m25936a;
            }
            return obj;
        }
    }

    /* renamed from: com.google.common.collect.HashBiMap$c */
    /* loaded from: classes4.dex */
    public final class C7613c extends AbstractC7617g {
        public C7613c() {
            super(HashBiMap.this);
        }

        @Override // com.google.common.collect.HashBiMap.AbstractC7617g
        /* renamed from: b */
        public Map.Entry mo41018a(int i) {
            return new C7611a(i);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int findEntryByKey = HashBiMap.this.findEntryByKey(key);
            if (findEntryByKey == -1 || !Objects.equal(value, HashBiMap.this.values[findEntryByKey])) {
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Object value = entry.getValue();
                int m902d = AbstractC22736w70.m902d(key);
                int findEntryByKey = HashBiMap.this.findEntryByKey(key, m902d);
                if (findEntryByKey != -1 && Objects.equal(value, HashBiMap.this.values[findEntryByKey])) {
                    HashBiMap.this.removeEntryKeyHashKnown(findEntryByKey, m902d);
                    return true;
                }
                return false;
            }
            return false;
        }
    }

    /* renamed from: com.google.common.collect.HashBiMap$d */
    /* loaded from: classes4.dex */
    public static class C7614d extends AbstractC7617g {
        public C7614d(HashBiMap hashBiMap) {
            super(hashBiMap);
        }

        @Override // com.google.common.collect.HashBiMap.AbstractC7617g
        /* renamed from: b */
        public Map.Entry mo41018a(int i) {
            return new C7612b(this.f53132a, i);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int findEntryByValue = this.f53132a.findEntryByValue(key);
            if (findEntryByValue == -1 || !Objects.equal(this.f53132a.keys[findEntryByValue], value)) {
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Object value = entry.getValue();
                int m902d = AbstractC22736w70.m902d(key);
                int findEntryByValue = this.f53132a.findEntryByValue(key, m902d);
                if (findEntryByValue != -1 && Objects.equal(this.f53132a.keys[findEntryByValue], value)) {
                    this.f53132a.removeEntryValueHashKnown(findEntryByValue, m902d);
                    return true;
                }
                return false;
            }
            return false;
        }
    }

    /* renamed from: com.google.common.collect.HashBiMap$e */
    /* loaded from: classes4.dex */
    public final class C7615e extends AbstractC7617g {
        public C7615e() {
            super(HashBiMap.this);
        }

        @Override // com.google.common.collect.HashBiMap.AbstractC7617g
        /* renamed from: a */
        public Object mo41018a(int i) {
            return AbstractC21396oJ0.m25936a(HashBiMap.this.keys[i]);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return HashBiMap.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            int m902d = AbstractC22736w70.m902d(obj);
            int findEntryByKey = HashBiMap.this.findEntryByKey(obj, m902d);
            if (findEntryByKey != -1) {
                HashBiMap.this.removeEntryKeyHashKnown(findEntryByKey, m902d);
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.google.common.collect.HashBiMap$f */
    /* loaded from: classes4.dex */
    public final class C7616f extends AbstractC7617g {
        public C7616f() {
            super(HashBiMap.this);
        }

        @Override // com.google.common.collect.HashBiMap.AbstractC7617g
        /* renamed from: a */
        public Object mo41018a(int i) {
            return AbstractC21396oJ0.m25936a(HashBiMap.this.values[i]);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return HashBiMap.this.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            int m902d = AbstractC22736w70.m902d(obj);
            int findEntryByValue = HashBiMap.this.findEntryByValue(obj, m902d);
            if (findEntryByValue != -1) {
                HashBiMap.this.removeEntryValueHashKnown(findEntryByValue, m902d);
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.google.common.collect.HashBiMap$g */
    /* loaded from: classes4.dex */
    public static abstract class AbstractC7617g extends AbstractSet {

        /* renamed from: a */
        public final HashBiMap f53132a;

        /* renamed from: com.google.common.collect.HashBiMap$g$a */
        /* loaded from: classes4.dex */
        public class C7618a implements Iterator {

            /* renamed from: a */
            public int f53133a;

            /* renamed from: b */
            public int f53134b = -1;

            /* renamed from: c */
            public int f53135c;

            /* renamed from: d */
            public int f53136d;

            public C7618a() {
                this.f53133a = AbstractC7617g.this.f53132a.firstInInsertionOrder;
                HashBiMap hashBiMap = AbstractC7617g.this.f53132a;
                this.f53135c = hashBiMap.modCount;
                this.f53136d = hashBiMap.size;
            }

            /* renamed from: a */
            public final void m41017a() {
                if (AbstractC7617g.this.f53132a.modCount == this.f53135c) {
                    return;
                }
                throw new ConcurrentModificationException();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                m41017a();
                if (this.f53133a != -2 && this.f53136d > 0) {
                    return true;
                }
                return false;
            }

            @Override // java.util.Iterator
            public Object next() {
                if (hasNext()) {
                    Object mo41018a = AbstractC7617g.this.mo41018a(this.f53133a);
                    this.f53134b = this.f53133a;
                    this.f53133a = AbstractC7617g.this.f53132a.nextInInsertionOrder[this.f53133a];
                    this.f53136d--;
                    return mo41018a;
                }
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public void remove() {
                boolean z;
                m41017a();
                if (this.f53134b != -1) {
                    z = true;
                } else {
                    z = false;
                }
                AbstractC5406bs.m51811e(z);
                AbstractC7617g.this.f53132a.removeEntry(this.f53134b);
                int i = this.f53133a;
                HashBiMap hashBiMap = AbstractC7617g.this.f53132a;
                if (i == hashBiMap.size) {
                    this.f53133a = this.f53134b;
                }
                this.f53134b = -1;
                this.f53135c = hashBiMap.modCount;
            }
        }

        public AbstractC7617g(HashBiMap hashBiMap) {
            this.f53132a = hashBiMap;
        }

        /* renamed from: a */
        public abstract Object mo41018a(int i);

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            this.f53132a.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new C7618a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f53132a.size;
        }
    }

    private HashBiMap(int i) {
        init(i);
    }

    private int bucket(int i) {
        return i & (this.hashTableKToV.length - 1);
    }

    public static <K, V> HashBiMap<K, V> create() {
        return create(16);
    }

    private static int[] createFilledWithAbsent(int i) {
        int[] iArr = new int[i];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    private void deleteFromTableKToV(int i, int i2) {
        boolean z;
        if (i != -1) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z);
        int bucket = bucket(i2);
        int[] iArr = this.hashTableKToV;
        int i3 = iArr[bucket];
        if (i3 == i) {
            int[] iArr2 = this.nextInBucketKToV;
            iArr[bucket] = iArr2[i];
            iArr2[i] = -1;
            return;
        }
        int i4 = this.nextInBucketKToV[i3];
        while (true) {
            int i5 = i3;
            i3 = i4;
            if (i3 != -1) {
                if (i3 == i) {
                    int[] iArr3 = this.nextInBucketKToV;
                    iArr3[i5] = iArr3[i];
                    iArr3[i] = -1;
                    return;
                }
                i4 = this.nextInBucketKToV[i3];
            } else {
                throw new AssertionError("Expected to find entry with key " + this.keys[i]);
            }
        }
    }

    private void deleteFromTableVToK(int i, int i2) {
        boolean z;
        if (i != -1) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z);
        int bucket = bucket(i2);
        int[] iArr = this.hashTableVToK;
        int i3 = iArr[bucket];
        if (i3 == i) {
            int[] iArr2 = this.nextInBucketVToK;
            iArr[bucket] = iArr2[i];
            iArr2[i] = -1;
            return;
        }
        int i4 = this.nextInBucketVToK[i3];
        while (true) {
            int i5 = i3;
            i3 = i4;
            if (i3 != -1) {
                if (i3 == i) {
                    int[] iArr3 = this.nextInBucketVToK;
                    iArr3[i5] = iArr3[i];
                    iArr3[i] = -1;
                    return;
                }
                i4 = this.nextInBucketVToK[i3];
            } else {
                throw new AssertionError("Expected to find entry with value " + this.values[i]);
            }
        }
    }

    private void ensureCapacity(int i) {
        int[] iArr = this.nextInBucketKToV;
        if (iArr.length < i) {
            int m41001a = ImmutableCollection.Builder.m41001a(iArr.length, i);
            this.keys = (K[]) Arrays.copyOf(this.keys, m41001a);
            this.values = (V[]) Arrays.copyOf(this.values, m41001a);
            this.nextInBucketKToV = expandAndFillWithAbsent(this.nextInBucketKToV, m41001a);
            this.nextInBucketVToK = expandAndFillWithAbsent(this.nextInBucketVToK, m41001a);
            this.prevInInsertionOrder = expandAndFillWithAbsent(this.prevInInsertionOrder, m41001a);
            this.nextInInsertionOrder = expandAndFillWithAbsent(this.nextInInsertionOrder, m41001a);
        }
        if (this.hashTableKToV.length < i) {
            int m905a = AbstractC22736w70.m905a(i, 1.0d);
            this.hashTableKToV = createFilledWithAbsent(m905a);
            this.hashTableVToK = createFilledWithAbsent(m905a);
            for (int i2 = 0; i2 < this.size; i2++) {
                int bucket = bucket(AbstractC22736w70.m902d(this.keys[i2]));
                int[] iArr2 = this.nextInBucketKToV;
                int[] iArr3 = this.hashTableKToV;
                iArr2[i2] = iArr3[bucket];
                iArr3[bucket] = i2;
                int bucket2 = bucket(AbstractC22736w70.m902d(this.values[i2]));
                int[] iArr4 = this.nextInBucketVToK;
                int[] iArr5 = this.hashTableVToK;
                iArr4[i2] = iArr5[bucket2];
                iArr5[bucket2] = i2;
            }
        }
    }

    private static int[] expandAndFillWithAbsent(int[] iArr, int i) {
        int length = iArr.length;
        int[] copyOf = Arrays.copyOf(iArr, i);
        Arrays.fill(copyOf, length, i, -1);
        return copyOf;
    }

    private void insertIntoTableKToV(int i, int i2) {
        boolean z;
        if (i != -1) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z);
        int bucket = bucket(i2);
        int[] iArr = this.nextInBucketKToV;
        int[] iArr2 = this.hashTableKToV;
        iArr[i] = iArr2[bucket];
        iArr2[bucket] = i;
    }

    private void insertIntoTableVToK(int i, int i2) {
        boolean z;
        if (i != -1) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z);
        int bucket = bucket(i2);
        int[] iArr = this.nextInBucketVToK;
        int[] iArr2 = this.hashTableVToK;
        iArr[i] = iArr2[bucket];
        iArr2[bucket] = i;
    }

    private void moveEntryToIndex(int i, int i2) {
        int i3;
        int i4;
        if (i == i2) {
            return;
        }
        int i5 = this.prevInInsertionOrder[i];
        int i6 = this.nextInInsertionOrder[i];
        setSucceeds(i5, i2);
        setSucceeds(i2, i6);
        K[] kArr = this.keys;
        K k = kArr[i];
        V[] vArr = this.values;
        V v = vArr[i];
        kArr[i2] = k;
        vArr[i2] = v;
        int bucket = bucket(AbstractC22736w70.m902d(k));
        int[] iArr = this.hashTableKToV;
        int i7 = iArr[bucket];
        if (i7 == i) {
            iArr[bucket] = i2;
        } else {
            int i8 = this.nextInBucketKToV[i7];
            while (true) {
                i3 = i7;
                i7 = i8;
                if (i7 == i) {
                    break;
                }
                i8 = this.nextInBucketKToV[i7];
            }
            this.nextInBucketKToV[i3] = i2;
        }
        int[] iArr2 = this.nextInBucketKToV;
        iArr2[i2] = iArr2[i];
        iArr2[i] = -1;
        int bucket2 = bucket(AbstractC22736w70.m902d(v));
        int[] iArr3 = this.hashTableVToK;
        int i9 = iArr3[bucket2];
        if (i9 == i) {
            iArr3[bucket2] = i2;
        } else {
            int i10 = this.nextInBucketVToK[i9];
            while (true) {
                i4 = i9;
                i9 = i10;
                if (i9 == i) {
                    break;
                }
                i10 = this.nextInBucketVToK[i9];
            }
            this.nextInBucketVToK[i4] = i2;
        }
        int[] iArr4 = this.nextInBucketVToK;
        iArr4[i2] = iArr4[i];
        iArr4[i] = -1;
    }

    @J2ktIncompatible
    @GwtIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        int m40214h = AbstractC7983m.m40214h(objectInputStream);
        init(16);
        AbstractC7983m.m40219c(this, objectInputStream, m40214h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void replaceKeyInEntry(int i, K k, boolean z) {
        boolean z2;
        int i2;
        if (i != -1) {
            z2 = true;
        } else {
            z2 = false;
        }
        Preconditions.checkArgument(z2);
        int m902d = AbstractC22736w70.m902d(k);
        int findEntryByKey = findEntryByKey(k, m902d);
        int i3 = this.lastInInsertionOrder;
        if (findEntryByKey != -1) {
            if (z) {
                i3 = this.prevInInsertionOrder[findEntryByKey];
                i2 = this.nextInInsertionOrder[findEntryByKey];
                removeEntryKeyHashKnown(findEntryByKey, m902d);
                if (i == this.size) {
                    i = findEntryByKey;
                }
            } else {
                throw new IllegalArgumentException("Key already present in map: " + k);
            }
        } else {
            i2 = -2;
        }
        if (i3 == i) {
            i3 = this.prevInInsertionOrder[i];
        } else if (i3 == this.size) {
            i3 = findEntryByKey;
        }
        if (i2 == i) {
            findEntryByKey = this.nextInInsertionOrder[i];
        } else if (i2 != this.size) {
            findEntryByKey = i2;
        }
        setSucceeds(this.prevInInsertionOrder[i], this.nextInInsertionOrder[i]);
        deleteFromTableKToV(i, AbstractC22736w70.m902d(this.keys[i]));
        this.keys[i] = k;
        insertIntoTableKToV(i, AbstractC22736w70.m902d(k));
        setSucceeds(i3, i);
        setSucceeds(i, findEntryByKey);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void replaceValueInEntry(int i, V v, boolean z) {
        boolean z2;
        if (i != -1) {
            z2 = true;
        } else {
            z2 = false;
        }
        Preconditions.checkArgument(z2);
        int m902d = AbstractC22736w70.m902d(v);
        int findEntryByValue = findEntryByValue(v, m902d);
        if (findEntryByValue != -1) {
            if (z) {
                removeEntryValueHashKnown(findEntryByValue, m902d);
                if (i == this.size) {
                    i = findEntryByValue;
                }
            } else {
                throw new IllegalArgumentException("Value already present in map: " + v);
            }
        }
        deleteFromTableVToK(i, AbstractC22736w70.m902d(this.values[i]));
        this.values[i] = v;
        insertIntoTableVToK(i, m902d);
    }

    private void setSucceeds(int i, int i2) {
        if (i == -2) {
            this.firstInInsertionOrder = i2;
        } else {
            this.nextInInsertionOrder[i] = i2;
        }
        if (i2 == -2) {
            this.lastInInsertionOrder = i;
        } else {
            this.prevInInsertionOrder[i2] = i;
        }
    }

    @J2ktIncompatible
    @GwtIncompatible
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        AbstractC7983m.m40213i(this, objectOutputStream);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        Arrays.fill(this.keys, 0, this.size, (Object) null);
        Arrays.fill(this.values, 0, this.size, (Object) null);
        Arrays.fill(this.hashTableKToV, -1);
        Arrays.fill(this.hashTableVToK, -1);
        Arrays.fill(this.nextInBucketKToV, 0, this.size, -1);
        Arrays.fill(this.nextInBucketVToK, 0, this.size, -1);
        Arrays.fill(this.prevInInsertionOrder, 0, this.size, -1);
        Arrays.fill(this.nextInInsertionOrder, 0, this.size, -1);
        this.size = 0;
        this.firstInInsertionOrder = -2;
        this.lastInInsertionOrder = -2;
        this.modCount++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(@CheckForNull Object obj) {
        if (findEntryByKey(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(@CheckForNull Object obj) {
        if (findEntryByValue(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.entrySet;
        if (set == null) {
            C7613c c7613c = new C7613c();
            this.entrySet = c7613c;
            return c7613c;
        }
        return set;
    }

    public int findEntry(@CheckForNull Object obj, int i, int[] iArr, int[] iArr2, Object[] objArr) {
        int i2 = iArr[bucket(i)];
        while (i2 != -1) {
            if (Objects.equal(objArr[i2], obj)) {
                return i2;
            }
            i2 = iArr2[i2];
        }
        return -1;
    }

    public int findEntryByKey(@CheckForNull Object obj) {
        return findEntryByKey(obj, AbstractC22736w70.m902d(obj));
    }

    public int findEntryByValue(@CheckForNull Object obj) {
        return findEntryByValue(obj, AbstractC22736w70.m902d(obj));
    }

    @Override // com.google.common.collect.BiMap
    @CanIgnoreReturnValue
    @CheckForNull
    public V forcePut(K k, V v) {
        return put(k, v, true);
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CheckForNull
    public V get(@CheckForNull Object obj) {
        int findEntryByKey = findEntryByKey(obj);
        if (findEntryByKey == -1) {
            return null;
        }
        return this.values[findEntryByKey];
    }

    @CheckForNull
    public K getInverse(@CheckForNull Object obj) {
        int findEntryByValue = findEntryByValue(obj);
        if (findEntryByValue == -1) {
            return null;
        }
        return this.keys[findEntryByValue];
    }

    public void init(int i) {
        AbstractC5406bs.m51814b(i, "expectedSize");
        int m905a = AbstractC22736w70.m905a(i, 1.0d);
        this.size = 0;
        this.keys = (K[]) new Object[i];
        this.values = (V[]) new Object[i];
        this.hashTableKToV = createFilledWithAbsent(m905a);
        this.hashTableVToK = createFilledWithAbsent(m905a);
        this.nextInBucketKToV = createFilledWithAbsent(i);
        this.nextInBucketVToK = createFilledWithAbsent(i);
        this.firstInInsertionOrder = -2;
        this.lastInInsertionOrder = -2;
        this.prevInInsertionOrder = createFilledWithAbsent(i);
        this.nextInInsertionOrder = createFilledWithAbsent(i);
    }

    @Override // com.google.common.collect.BiMap
    public BiMap<V, K> inverse() {
        BiMap<V, K> biMap = this.inverse;
        if (biMap == null) {
            Inverse inverse = new Inverse(this);
            this.inverse = inverse;
            return inverse;
        }
        return biMap;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.keySet;
        if (set == null) {
            C7615e c7615e = new C7615e();
            this.keySet = c7615e;
            return c7615e;
        }
        return set;
    }

    @Override // java.util.AbstractMap, java.util.Map, com.google.common.collect.BiMap
    @CanIgnoreReturnValue
    @CheckForNull
    public V put(K k, V v) {
        return put(k, v, false);
    }

    @CanIgnoreReturnValue
    @CheckForNull
    public K putInverse(V v, K k, boolean z) {
        boolean z2;
        int i;
        int m902d = AbstractC22736w70.m902d(v);
        int findEntryByValue = findEntryByValue(v, m902d);
        if (findEntryByValue != -1) {
            K k2 = this.keys[findEntryByValue];
            if (Objects.equal(k2, k)) {
                return k;
            }
            replaceKeyInEntry(findEntryByValue, k, z);
            return k2;
        }
        int i2 = this.lastInInsertionOrder;
        int m902d2 = AbstractC22736w70.m902d(k);
        int findEntryByKey = findEntryByKey(k, m902d2);
        if (z) {
            if (findEntryByKey != -1) {
                i2 = this.prevInInsertionOrder[findEntryByKey];
                removeEntryKeyHashKnown(findEntryByKey, m902d2);
            }
        } else {
            if (findEntryByKey == -1) {
                z2 = true;
            } else {
                z2 = false;
            }
            Preconditions.checkArgument(z2, "Key already present: %s", k);
        }
        ensureCapacity(this.size + 1);
        K[] kArr = this.keys;
        int i3 = this.size;
        kArr[i3] = k;
        this.values[i3] = v;
        insertIntoTableKToV(i3, m902d2);
        insertIntoTableVToK(this.size, m902d);
        if (i2 == -2) {
            i = this.firstInInsertionOrder;
        } else {
            i = this.nextInInsertionOrder[i2];
        }
        setSucceeds(i2, this.size);
        setSucceeds(this.size, i);
        this.size++;
        this.modCount++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CanIgnoreReturnValue
    @CheckForNull
    public V remove(@CheckForNull Object obj) {
        int m902d = AbstractC22736w70.m902d(obj);
        int findEntryByKey = findEntryByKey(obj, m902d);
        if (findEntryByKey == -1) {
            return null;
        }
        V v = this.values[findEntryByKey];
        removeEntryKeyHashKnown(findEntryByKey, m902d);
        return v;
    }

    public void removeEntry(int i) {
        removeEntryKeyHashKnown(i, AbstractC22736w70.m902d(this.keys[i]));
    }

    public void removeEntryKeyHashKnown(int i, int i2) {
        removeEntry(i, i2, AbstractC22736w70.m902d(this.values[i]));
    }

    public void removeEntryValueHashKnown(int i, int i2) {
        removeEntry(i, AbstractC22736w70.m902d(this.keys[i]), i2);
    }

    @CheckForNull
    public K removeInverse(@CheckForNull Object obj) {
        int m902d = AbstractC22736w70.m902d(obj);
        int findEntryByValue = findEntryByValue(obj, m902d);
        if (findEntryByValue == -1) {
            return null;
        }
        K k = this.keys[findEntryByValue];
        removeEntryValueHashKnown(findEntryByValue, m902d);
        return k;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.size;
    }

    public static <K, V> HashBiMap<K, V> create(int i) {
        return new HashBiMap<>(i);
    }

    private void removeEntry(int i, int i2, int i3) {
        Preconditions.checkArgument(i != -1);
        deleteFromTableKToV(i, i2);
        deleteFromTableVToK(i, i3);
        setSucceeds(this.prevInInsertionOrder[i], this.nextInInsertionOrder[i]);
        moveEntryToIndex(this.size - 1, i);
        K[] kArr = this.keys;
        int i4 = this.size;
        kArr[i4 - 1] = null;
        this.values[i4 - 1] = null;
        this.size = i4 - 1;
        this.modCount++;
    }

    public int findEntryByKey(@CheckForNull Object obj, int i) {
        return findEntry(obj, i, this.hashTableKToV, this.nextInBucketKToV, this.keys);
    }

    public int findEntryByValue(@CheckForNull Object obj, int i) {
        return findEntry(obj, i, this.hashTableVToK, this.nextInBucketVToK, this.values);
    }

    @CheckForNull
    public V put(K k, V v, boolean z) {
        int m902d = AbstractC22736w70.m902d(k);
        int findEntryByKey = findEntryByKey(k, m902d);
        if (findEntryByKey != -1) {
            V v2 = this.values[findEntryByKey];
            if (Objects.equal(v2, v)) {
                return v;
            }
            replaceValueInEntry(findEntryByKey, v, z);
            return v2;
        }
        int m902d2 = AbstractC22736w70.m902d(v);
        int findEntryByValue = findEntryByValue(v, m902d2);
        if (!z) {
            Preconditions.checkArgument(findEntryByValue == -1, "Value already present: %s", v);
        } else if (findEntryByValue != -1) {
            removeEntryValueHashKnown(findEntryByValue, m902d2);
        }
        ensureCapacity(this.size + 1);
        K[] kArr = this.keys;
        int i = this.size;
        kArr[i] = k;
        this.values[i] = v;
        insertIntoTableKToV(i, m902d);
        insertIntoTableVToK(this.size, m902d2);
        setSucceeds(this.lastInInsertionOrder, this.size);
        setSucceeds(this.size, -2);
        this.size++;
        this.modCount++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map, com.google.common.collect.BiMap
    public Set<V> values() {
        Set<V> set = this.valueSet;
        if (set == null) {
            C7616f c7616f = new C7616f();
            this.valueSet = c7616f;
            return c7616f;
        }
        return set;
    }

    public static <K, V> HashBiMap<K, V> create(Map<? extends K, ? extends V> map) {
        HashBiMap<K, V> create = create(map.size());
        create.putAll(map);
        return create;
    }
}
