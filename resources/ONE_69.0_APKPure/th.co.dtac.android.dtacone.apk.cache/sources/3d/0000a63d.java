package com.google.api.client.util;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes4.dex */
public class ArrayMap<K, V> extends AbstractMap<K, V> implements Cloneable {

    /* renamed from: a */
    public int f52286a;

    /* renamed from: b */
    public Object[] f52287b;

    /* renamed from: com.google.api.client.util.ArrayMap$a */
    /* loaded from: classes4.dex */
    public final class C7292a implements Map.Entry {

        /* renamed from: a */
        public int f52288a;

        public C7292a(int i) {
            this.f52288a = i;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (Objects.equal(getKey(), entry.getKey()) && Objects.equal(getValue(), entry.getValue())) {
                return true;
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return ArrayMap.this.getKey(this.f52288a);
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return ArrayMap.this.getValue(this.f52288a);
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            int i;
            Object key = getKey();
            Object value = getValue();
            int i2 = 0;
            if (key != null) {
                i = key.hashCode();
            } else {
                i = 0;
            }
            if (value != null) {
                i2 = value.hashCode();
            }
            return i ^ i2;
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            return ArrayMap.this.set(this.f52288a, obj);
        }
    }

    /* renamed from: com.google.api.client.util.ArrayMap$b */
    /* loaded from: classes4.dex */
    public final class C7293b implements Iterator {

        /* renamed from: a */
        public boolean f52290a;

        /* renamed from: b */
        public int f52291b;

        public C7293b() {
        }

        @Override // java.util.Iterator
        /* renamed from: a */
        public Map.Entry next() {
            int i = this.f52291b;
            ArrayMap arrayMap = ArrayMap.this;
            if (i != arrayMap.f52286a) {
                this.f52291b = i + 1;
                this.f52290a = false;
                return new C7292a(i);
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f52291b < ArrayMap.this.f52286a) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            int i = this.f52291b - 1;
            if (!this.f52290a && i >= 0) {
                ArrayMap.this.remove(i);
                this.f52291b--;
                this.f52290a = true;
                return;
            }
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: com.google.api.client.util.ArrayMap$c */
    /* loaded from: classes4.dex */
    public final class C7294c extends AbstractSet {
        public C7294c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new C7293b();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return ArrayMap.this.f52286a;
        }
    }

    public static <K, V> ArrayMap<K, V> create() {
        return new ArrayMap<>();
    }

    /* renamed from: of */
    public static <K, V> ArrayMap<K, V> m41700of(Object... objArr) {
        ArrayMap<K, V> create = create(1);
        int length = objArr.length;
        if (1 != length % 2) {
            create.f52286a = objArr.length / 2;
            Object[] objArr2 = new Object[length];
            create.f52287b = objArr2;
            System.arraycopy(objArr, 0, objArr2, 0, length);
            return create;
        }
        throw new IllegalArgumentException("missing value for last key: " + objArr[length - 1]);
    }

    /* renamed from: a */
    public final int m41705a(Object obj) {
        int i = this.f52286a << 1;
        Object[] objArr = this.f52287b;
        for (int i2 = 0; i2 < i; i2 += 2) {
            Object obj2 = objArr[i2];
            if (obj == null) {
                if (obj2 == null) {
                    return i2;
                }
            } else if (obj.equals(obj2)) {
                return i2;
            }
        }
        return -2;
    }

    public final void add(K k, V v) {
        set(this.f52286a, k, v);
    }

    /* renamed from: b */
    public final Object m41704b(int i) {
        int i2 = this.f52286a << 1;
        if (i < 0 || i >= i2) {
            return null;
        }
        Object m41701f = m41701f(i + 1);
        Object[] objArr = this.f52287b;
        int i3 = (i2 - i) - 2;
        if (i3 != 0) {
            System.arraycopy(objArr, i + 2, objArr, i, i3);
        }
        this.f52286a--;
        m41703c(i2 - 2, null, null);
        return m41701f;
    }

    /* renamed from: c */
    public final void m41703c(int i, Object obj, Object obj2) {
        Object[] objArr = this.f52287b;
        objArr[i] = obj;
        objArr[i + 1] = obj2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.f52286a = 0;
        this.f52287b = null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        if (-2 != m41705a(obj)) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        int i = this.f52286a << 1;
        Object[] objArr = this.f52287b;
        for (int i2 = 1; i2 < i; i2 += 2) {
            Object obj2 = objArr[i2];
            if (obj == null) {
                if (obj2 == null) {
                    return true;
                }
            } else if (obj.equals(obj2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public final void m41702e(int i) {
        if (i == 0) {
            this.f52287b = null;
            return;
        }
        int i2 = this.f52286a;
        Object[] objArr = this.f52287b;
        if (i2 == 0 || i != objArr.length) {
            Object[] objArr2 = new Object[i];
            this.f52287b = objArr2;
            if (i2 != 0) {
                System.arraycopy(objArr, 0, objArr2, 0, i2 << 1);
            }
        }
    }

    public final void ensureCapacity(int i) {
        int length;
        if (i >= 0) {
            Object[] objArr = this.f52287b;
            int i2 = i << 1;
            if (objArr == null) {
                length = 0;
            } else {
                length = objArr.length;
            }
            if (i2 > length) {
                int i3 = (length / 2) * 3;
                int i4 = i3 + 1;
                if (i4 % 2 != 0) {
                    i4 = i3 + 2;
                }
                if (i4 >= i2) {
                    i2 = i4;
                }
                m41702e(i2);
                return;
            }
            return;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return new C7294c();
    }

    /* renamed from: f */
    public final Object m41701f(int i) {
        if (i < 0) {
            return null;
        }
        return this.f52287b[i];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        return (V) m41701f(m41705a(obj) + 1);
    }

    public final int getIndexOfKey(K k) {
        return m41705a(k) >> 1;
    }

    public final K getKey(int i) {
        if (i >= 0 && i < this.f52286a) {
            return (K) this.f52287b[i << 1];
        }
        return null;
    }

    public final V getValue(int i) {
        if (i >= 0 && i < this.f52286a) {
            return (V) m41701f((i << 1) + 1);
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        int indexOfKey = getIndexOfKey(k);
        if (indexOfKey == -1) {
            indexOfKey = this.f52286a;
        }
        return set(indexOfKey, k, v);
    }

    public final V remove(int i) {
        return (V) m41704b(i << 1);
    }

    public final V set(int i, K k, V v) {
        if (i >= 0) {
            int i2 = i + 1;
            ensureCapacity(i2);
            int i3 = i << 1;
            V v2 = (V) m41701f(i3 + 1);
            m41703c(i3, k, v);
            if (i2 > this.f52286a) {
                this.f52286a = i2;
            }
            return v2;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f52286a;
    }

    public final void trim() {
        m41702e(this.f52286a << 1);
    }

    public static <K, V> ArrayMap<K, V> create(int i) {
        ArrayMap<K, V> create = create();
        create.ensureCapacity(i);
        return create;
    }

    @Override // java.util.AbstractMap
    public ArrayMap<K, V> clone() {
        try {
            ArrayMap<K, V> arrayMap = (ArrayMap) super.clone();
            Object[] objArr = this.f52287b;
            if (objArr != null) {
                int length = objArr.length;
                Object[] objArr2 = new Object[length];
                arrayMap.f52287b = objArr2;
                System.arraycopy(objArr, 0, objArr2, 0, length);
            }
            return arrayMap;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        return (V) m41704b(m41705a(obj));
    }

    public final V set(int i, V v) {
        int i2 = this.f52286a;
        if (i >= 0 && i < i2) {
            int i3 = (i << 1) + 1;
            V v2 = (V) m41701f(i3);
            this.f52287b[i3] = v;
            return v2;
        }
        throw new IndexOutOfBoundsException();
    }
}