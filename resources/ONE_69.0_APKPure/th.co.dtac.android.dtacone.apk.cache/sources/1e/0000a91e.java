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
                C7603d c7603d = new C7603d(this.forward);
                this.inverseEntrySet = c7603d;
                return c7603d;
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
    public final class C7600a extends AbstractC1638X {

        /* renamed from: a */
        public final Object f53135a;

        /* renamed from: b */
        public int f53136b;

        public C7600a(int i) {
            this.f53135a = AbstractC22494uJ0.m1205a(HashBiMap.this.keys[i]);
            this.f53136b = i;
        }

        /* renamed from: a */
        public void m41011a() {
            int i = this.f53136b;
            if (i != -1) {
                HashBiMap hashBiMap = HashBiMap.this;
                if (i <= hashBiMap.size && Objects.equal(hashBiMap.keys[i], this.f53135a)) {
                    return;
                }
            }
            this.f53136b = HashBiMap.this.findEntryByKey(this.f53135a);
        }

        @Override // p000.AbstractC1638X, java.util.Map.Entry
        public Object getKey() {
            return this.f53135a;
        }

        @Override // p000.AbstractC1638X, java.util.Map.Entry
        public Object getValue() {
            m41011a();
            int i = this.f53136b;
            if (i == -1) {
                return AbstractC22494uJ0.m1204b();
            }
            return AbstractC22494uJ0.m1205a(HashBiMap.this.values[i]);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.AbstractC1638X, java.util.Map.Entry
        public Object setValue(Object obj) {
            m41011a();
            int i = this.f53136b;
            if (i == -1) {
                HashBiMap.this.put(this.f53135a, obj);
                return AbstractC22494uJ0.m1204b();
            }
            Object m1205a = AbstractC22494uJ0.m1205a(HashBiMap.this.values[i]);
            if (!Objects.equal(m1205a, obj)) {
                HashBiMap.this.replaceValueInEntry(this.f53136b, obj, false);
                return m1205a;
            }
            return obj;
        }
    }

    /* renamed from: com.google.common.collect.HashBiMap$b */
    /* loaded from: classes4.dex */
    public static final class C7601b extends AbstractC1638X {

        /* renamed from: a */
        public final HashBiMap f53138a;

        /* renamed from: b */
        public final Object f53139b;

        /* renamed from: c */
        public int f53140c;

        public C7601b(HashBiMap hashBiMap, int i) {
            this.f53138a = hashBiMap;
            this.f53139b = AbstractC22494uJ0.m1205a(hashBiMap.values[i]);
            this.f53140c = i;
        }

        /* renamed from: a */
        private void m41010a() {
            int i = this.f53140c;
            if (i != -1) {
                HashBiMap hashBiMap = this.f53138a;
                if (i <= hashBiMap.size && Objects.equal(this.f53139b, hashBiMap.values[i])) {
                    return;
                }
            }
            this.f53140c = this.f53138a.findEntryByValue(this.f53139b);
        }

        @Override // p000.AbstractC1638X, java.util.Map.Entry
        public Object getKey() {
            return this.f53139b;
        }

        @Override // p000.AbstractC1638X, java.util.Map.Entry
        public Object getValue() {
            m41010a();
            int i = this.f53140c;
            if (i == -1) {
                return AbstractC22494uJ0.m1204b();
            }
            return AbstractC22494uJ0.m1205a(this.f53138a.keys[i]);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.AbstractC1638X, java.util.Map.Entry
        public Object setValue(Object obj) {
            m41010a();
            int i = this.f53140c;
            if (i == -1) {
                this.f53138a.putInverse(this.f53139b, obj, false);
                return AbstractC22494uJ0.m1204b();
            }
            Object m1205a = AbstractC22494uJ0.m1205a(this.f53138a.keys[i]);
            if (!Objects.equal(m1205a, obj)) {
                this.f53138a.replaceKeyInEntry(this.f53140c, obj, false);
                return m1205a;
            }
            return obj;
        }
    }

    /* renamed from: com.google.common.collect.HashBiMap$c */
    /* loaded from: classes4.dex */
    public final class C7602c extends AbstractC7606g {
        public C7602c() {
            super(HashBiMap.this);
        }

        @Override // com.google.common.collect.HashBiMap.AbstractC7606g
        /* renamed from: b */
        public Map.Entry mo41007a(int i) {
            return new C7600a(i);
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
                int m68994d = C70.m68994d(key);
                int findEntryByKey = HashBiMap.this.findEntryByKey(key, m68994d);
                if (findEntryByKey != -1 && Objects.equal(value, HashBiMap.this.values[findEntryByKey])) {
                    HashBiMap.this.removeEntryKeyHashKnown(findEntryByKey, m68994d);
                    return true;
                }
                return false;
            }
            return false;
        }
    }

    /* renamed from: com.google.common.collect.HashBiMap$d */
    /* loaded from: classes4.dex */
    public static class C7603d extends AbstractC7606g {
        public C7603d(HashBiMap hashBiMap) {
            super(hashBiMap);
        }

        @Override // com.google.common.collect.HashBiMap.AbstractC7606g
        /* renamed from: b */
        public Map.Entry mo41007a(int i) {
            return new C7601b(this.f53144a, i);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int findEntryByValue = this.f53144a.findEntryByValue(key);
            if (findEntryByValue == -1 || !Objects.equal(this.f53144a.keys[findEntryByValue], value)) {
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
                int m68994d = C70.m68994d(key);
                int findEntryByValue = this.f53144a.findEntryByValue(key, m68994d);
                if (findEntryByValue != -1 && Objects.equal(this.f53144a.keys[findEntryByValue], value)) {
                    this.f53144a.removeEntryValueHashKnown(findEntryByValue, m68994d);
                    return true;
                }
                return false;
            }
            return false;
        }
    }

    /* renamed from: com.google.common.collect.HashBiMap$e */
    /* loaded from: classes4.dex */
    public final class C7604e extends AbstractC7606g {
        public C7604e() {
            super(HashBiMap.this);
        }

        @Override // com.google.common.collect.HashBiMap.AbstractC7606g
        /* renamed from: a */
        public Object mo41007a(int i) {
            return AbstractC22494uJ0.m1205a(HashBiMap.this.keys[i]);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return HashBiMap.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            int m68994d = C70.m68994d(obj);
            int findEntryByKey = HashBiMap.this.findEntryByKey(obj, m68994d);
            if (findEntryByKey != -1) {
                HashBiMap.this.removeEntryKeyHashKnown(findEntryByKey, m68994d);
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.google.common.collect.HashBiMap$f */
    /* loaded from: classes4.dex */
    public final class C7605f extends AbstractC7606g {
        public C7605f() {
            super(HashBiMap.this);
        }

        @Override // com.google.common.collect.HashBiMap.AbstractC7606g
        /* renamed from: a */
        public Object mo41007a(int i) {
            return AbstractC22494uJ0.m1205a(HashBiMap.this.values[i]);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return HashBiMap.this.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            int m68994d = C70.m68994d(obj);
            int findEntryByValue = HashBiMap.this.findEntryByValue(obj, m68994d);
            if (findEntryByValue != -1) {
                HashBiMap.this.removeEntryValueHashKnown(findEntryByValue, m68994d);
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.google.common.collect.HashBiMap$g */
    /* loaded from: classes4.dex */
    public static abstract class AbstractC7606g extends AbstractSet {

        /* renamed from: a */
        public final HashBiMap f53144a;

        /* renamed from: com.google.common.collect.HashBiMap$g$a */
        /* loaded from: classes4.dex */
        public class C7607a implements Iterator {

            /* renamed from: a */
            public int f53145a;

            /* renamed from: b */
            public int f53146b = -1;

            /* renamed from: c */
            public int f53147c;

            /* renamed from: d */
            public int f53148d;

            public C7607a() {
                this.f53145a = AbstractC7606g.this.f53144a.firstInInsertionOrder;
                HashBiMap hashBiMap = AbstractC7606g.this.f53144a;
                this.f53147c = hashBiMap.modCount;
                this.f53148d = hashBiMap.size;
            }

            /* renamed from: a */
            public final void m41006a() {
                if (AbstractC7606g.this.f53144a.modCount == this.f53147c) {
                    return;
                }
                throw new ConcurrentModificationException();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                m41006a();
                if (this.f53145a != -2 && this.f53148d > 0) {
                    return true;
                }
                return false;
            }

            @Override // java.util.Iterator
            public Object next() {
                if (hasNext()) {
                    Object mo41007a = AbstractC7606g.this.mo41007a(this.f53145a);
                    this.f53146b = this.f53145a;
                    this.f53145a = AbstractC7606g.this.f53144a.nextInInsertionOrder[this.f53145a];
                    this.f53148d--;
                    return mo41007a;
                }
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public void remove() {
                boolean z;
                m41006a();
                if (this.f53146b != -1) {
                    z = true;
                } else {
                    z = false;
                }
                AbstractC5383bs.m51874e(z);
                AbstractC7606g.this.f53144a.removeEntry(this.f53146b);
                int i = this.f53145a;
                HashBiMap hashBiMap = AbstractC7606g.this.f53144a;
                if (i == hashBiMap.size) {
                    this.f53145a = this.f53146b;
                }
                this.f53146b = -1;
                this.f53147c = hashBiMap.modCount;
            }
        }

        public AbstractC7606g(HashBiMap hashBiMap) {
            this.f53144a = hashBiMap;
        }

        /* renamed from: a */
        public abstract Object mo41007a(int i);

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            this.f53144a.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new C7607a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f53144a.size;
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
            int m40990a = ImmutableCollection.Builder.m40990a(iArr.length, i);
            this.keys = (K[]) Arrays.copyOf(this.keys, m40990a);
            this.values = (V[]) Arrays.copyOf(this.values, m40990a);
            this.nextInBucketKToV = expandAndFillWithAbsent(this.nextInBucketKToV, m40990a);
            this.nextInBucketVToK = expandAndFillWithAbsent(this.nextInBucketVToK, m40990a);
            this.prevInInsertionOrder = expandAndFillWithAbsent(this.prevInInsertionOrder, m40990a);
            this.nextInInsertionOrder = expandAndFillWithAbsent(this.nextInInsertionOrder, m40990a);
        }
        if (this.hashTableKToV.length < i) {
            int m68997a = C70.m68997a(i, 1.0d);
            this.hashTableKToV = createFilledWithAbsent(m68997a);
            this.hashTableVToK = createFilledWithAbsent(m68997a);
            for (int i2 = 0; i2 < this.size; i2++) {
                int bucket = bucket(C70.m68994d(this.keys[i2]));
                int[] iArr2 = this.nextInBucketKToV;
                int[] iArr3 = this.hashTableKToV;
                iArr2[i2] = iArr3[bucket];
                iArr3[bucket] = i2;
                int bucket2 = bucket(C70.m68994d(this.values[i2]));
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
        int bucket = bucket(C70.m68994d(k));
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
        int bucket2 = bucket(C70.m68994d(v));
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
        int m40205h = AbstractC7972m.m40205h(objectInputStream);
        init(16);
        AbstractC7972m.m40210c(this, objectInputStream, m40205h);
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
        int m68994d = C70.m68994d(k);
        int findEntryByKey = findEntryByKey(k, m68994d);
        int i3 = this.lastInInsertionOrder;
        if (findEntryByKey != -1) {
            if (z) {
                i3 = this.prevInInsertionOrder[findEntryByKey];
                i2 = this.nextInInsertionOrder[findEntryByKey];
                removeEntryKeyHashKnown(findEntryByKey, m68994d);
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
        deleteFromTableKToV(i, C70.m68994d(this.keys[i]));
        this.keys[i] = k;
        insertIntoTableKToV(i, C70.m68994d(k));
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
        int m68994d = C70.m68994d(v);
        int findEntryByValue = findEntryByValue(v, m68994d);
        if (findEntryByValue != -1) {
            if (z) {
                removeEntryValueHashKnown(findEntryByValue, m68994d);
                if (i == this.size) {
                    i = findEntryByValue;
                }
            } else {
                throw new IllegalArgumentException("Value already present in map: " + v);
            }
        }
        deleteFromTableVToK(i, C70.m68994d(this.values[i]));
        this.values[i] = v;
        insertIntoTableVToK(i, m68994d);
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
        AbstractC7972m.m40204i(this, objectOutputStream);
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
            C7602c c7602c = new C7602c();
            this.entrySet = c7602c;
            return c7602c;
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
        return findEntryByKey(obj, C70.m68994d(obj));
    }

    public int findEntryByValue(@CheckForNull Object obj) {
        return findEntryByValue(obj, C70.m68994d(obj));
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
        AbstractC5383bs.m51877b(i, "expectedSize");
        int m68997a = C70.m68997a(i, 1.0d);
        this.size = 0;
        this.keys = (K[]) new Object[i];
        this.values = (V[]) new Object[i];
        this.hashTableKToV = createFilledWithAbsent(m68997a);
        this.hashTableVToK = createFilledWithAbsent(m68997a);
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
            C7604e c7604e = new C7604e();
            this.keySet = c7604e;
            return c7604e;
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
        int m68994d = C70.m68994d(v);
        int findEntryByValue = findEntryByValue(v, m68994d);
        if (findEntryByValue != -1) {
            K k2 = this.keys[findEntryByValue];
            if (Objects.equal(k2, k)) {
                return k;
            }
            replaceKeyInEntry(findEntryByValue, k, z);
            return k2;
        }
        int i2 = this.lastInInsertionOrder;
        int m68994d2 = C70.m68994d(k);
        int findEntryByKey = findEntryByKey(k, m68994d2);
        if (z) {
            if (findEntryByKey != -1) {
                i2 = this.prevInInsertionOrder[findEntryByKey];
                removeEntryKeyHashKnown(findEntryByKey, m68994d2);
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
        insertIntoTableKToV(i3, m68994d2);
        insertIntoTableVToK(this.size, m68994d);
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
        int m68994d = C70.m68994d(obj);
        int findEntryByKey = findEntryByKey(obj, m68994d);
        if (findEntryByKey == -1) {
            return null;
        }
        V v = this.values[findEntryByKey];
        removeEntryKeyHashKnown(findEntryByKey, m68994d);
        return v;
    }

    public void removeEntry(int i) {
        removeEntryKeyHashKnown(i, C70.m68994d(this.keys[i]));
    }

    public void removeEntryKeyHashKnown(int i, int i2) {
        removeEntry(i, i2, C70.m68994d(this.values[i]));
    }

    public void removeEntryValueHashKnown(int i, int i2) {
        removeEntry(i, C70.m68994d(this.keys[i]), i2);
    }

    @CheckForNull
    public K removeInverse(@CheckForNull Object obj) {
        int m68994d = C70.m68994d(obj);
        int findEntryByValue = findEntryByValue(obj, m68994d);
        if (findEntryByValue == -1) {
            return null;
        }
        K k = this.keys[findEntryByValue];
        removeEntryValueHashKnown(findEntryByValue, m68994d);
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
        int m68994d = C70.m68994d(k);
        int findEntryByKey = findEntryByKey(k, m68994d);
        if (findEntryByKey != -1) {
            V v2 = this.values[findEntryByKey];
            if (Objects.equal(v2, v)) {
                return v;
            }
            replaceValueInEntry(findEntryByKey, v, z);
            return v2;
        }
        int m68994d2 = C70.m68994d(v);
        int findEntryByValue = findEntryByValue(v, m68994d2);
        if (!z) {
            Preconditions.checkArgument(findEntryByValue == -1, "Value already present: %s", v);
        } else if (findEntryByValue != -1) {
            removeEntryValueHashKnown(findEntryByValue, m68994d2);
        }
        ensureCapacity(this.size + 1);
        K[] kArr = this.keys;
        int i = this.size;
        kArr[i] = k;
        this.values[i] = v;
        insertIntoTableKToV(i, m68994d);
        insertIntoTableVToK(this.size, m68994d2);
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
            C7605f c7605f = new C7605f();
            this.valueSet = c7605f;
            return c7605f;
        }
        return set;
    }

    public static <K, V> HashBiMap<K, V> create(Map<? extends K, ? extends V> map) {
        HashBiMap<K, V> create = create(map.size());
        create.putAll(map);
        return create;
    }
}