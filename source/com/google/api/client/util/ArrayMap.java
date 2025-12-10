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
    public int f52274a;

    /* renamed from: b */
    public Object[] f52275b;

    /* renamed from: com.google.api.client.util.ArrayMap$a */
    /* loaded from: classes4.dex */
    public final class C7303a implements Map.Entry {

        /* renamed from: a */
        public int f52276a;

        public C7303a(int i) {
            this.f52276a = i;
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
            return ArrayMap.this.getKey(this.f52276a);
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return ArrayMap.this.getValue(this.f52276a);
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
            return ArrayMap.this.set(this.f52276a, obj);
        }
    }

    /* renamed from: com.google.api.client.util.ArrayMap$b */
    /* loaded from: classes4.dex */
    public final class C7304b implements Iterator {

        /* renamed from: a */
        public boolean f52278a;

        /* renamed from: b */
        public int f52279b;

        public C7304b() {
        }

        @Override // java.util.Iterator
        /* renamed from: a */
        public Map.Entry next() {
            int i = this.f52279b;
            ArrayMap arrayMap = ArrayMap.this;
            if (i != arrayMap.f52274a) {
                this.f52279b = i + 1;
                this.f52278a = false;
                return new C7303a(i);
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f52279b < ArrayMap.this.f52274a) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            int i = this.f52279b - 1;
            if (!this.f52278a && i >= 0) {
                ArrayMap.this.remove(i);
                this.f52279b--;
                this.f52278a = true;
                return;
            }
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: com.google.api.client.util.ArrayMap$c */
    /* loaded from: classes4.dex */
    public final class C7305c extends AbstractSet {
        public C7305c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new C7304b();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return ArrayMap.this.f52274a;
        }
    }

    public static <K, V> ArrayMap<K, V> create() {
        return new ArrayMap<>();
    }

    /* renamed from: of */
    public static <K, V> ArrayMap<K, V> m41713of(Object... objArr) {
        ArrayMap<K, V> create = create(1);
        int length = objArr.length;
        if (1 != length % 2) {
            create.f52274a = objArr.length / 2;
            Object[] objArr2 = new Object[length];
            create.f52275b = objArr2;
            System.arraycopy(objArr, 0, objArr2, 0, length);
            return create;
        }
        throw new IllegalArgumentException("missing value for last key: " + objArr[length - 1]);
    }

    /* renamed from: a */
    public final int m41718a(Object obj) {
        int i = this.f52274a << 1;
        Object[] objArr = this.f52275b;
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
        set(this.f52274a, k, v);
    }

    /* renamed from: b */
    public final Object m41717b(int i) {
        int i2 = this.f52274a << 1;
        if (i < 0 || i >= i2) {
            return null;
        }
        Object m41714f = m41714f(i + 1);
        Object[] objArr = this.f52275b;
        int i3 = (i2 - i) - 2;
        if (i3 != 0) {
            System.arraycopy(objArr, i + 2, objArr, i, i3);
        }
        this.f52274a--;
        m41716c(i2 - 2, null, null);
        return m41714f;
    }

    /* renamed from: c */
    public final void m41716c(int i, Object obj, Object obj2) {
        Object[] objArr = this.f52275b;
        objArr[i] = obj;
        objArr[i + 1] = obj2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.f52274a = 0;
        this.f52275b = null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        if (-2 != m41718a(obj)) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        int i = this.f52274a << 1;
        Object[] objArr = this.f52275b;
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
    public final void m41715e(int i) {
        if (i == 0) {
            this.f52275b = null;
            return;
        }
        int i2 = this.f52274a;
        Object[] objArr = this.f52275b;
        if (i2 == 0 || i != objArr.length) {
            Object[] objArr2 = new Object[i];
            this.f52275b = objArr2;
            if (i2 != 0) {
                System.arraycopy(objArr, 0, objArr2, 0, i2 << 1);
            }
        }
    }

    public final void ensureCapacity(int i) {
        int length;
        if (i >= 0) {
            Object[] objArr = this.f52275b;
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
                m41715e(i2);
                return;
            }
            return;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return new C7305c();
    }

    /* renamed from: f */
    public final Object m41714f(int i) {
        if (i < 0) {
            return null;
        }
        return this.f52275b[i];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        return (V) m41714f(m41718a(obj) + 1);
    }

    public final int getIndexOfKey(K k) {
        return m41718a(k) >> 1;
    }

    public final K getKey(int i) {
        if (i >= 0 && i < this.f52274a) {
            return (K) this.f52275b[i << 1];
        }
        return null;
    }

    public final V getValue(int i) {
        if (i >= 0 && i < this.f52274a) {
            return (V) m41714f((i << 1) + 1);
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        int indexOfKey = getIndexOfKey(k);
        if (indexOfKey == -1) {
            indexOfKey = this.f52274a;
        }
        return set(indexOfKey, k, v);
    }

    public final V remove(int i) {
        return (V) m41717b(i << 1);
    }

    public final V set(int i, K k, V v) {
        if (i >= 0) {
            int i2 = i + 1;
            ensureCapacity(i2);
            int i3 = i << 1;
            V v2 = (V) m41714f(i3 + 1);
            m41716c(i3, k, v);
            if (i2 > this.f52274a) {
                this.f52274a = i2;
            }
            return v2;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f52274a;
    }

    public final void trim() {
        m41715e(this.f52274a << 1);
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
            Object[] objArr = this.f52275b;
            if (objArr != null) {
                int length = objArr.length;
                Object[] objArr2 = new Object[length];
                arrayMap.f52275b = objArr2;
                System.arraycopy(objArr, 0, objArr2, 0, length);
            }
            return arrayMap;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        return (V) m41717b(m41718a(obj));
    }

    public final V set(int i, V v) {
        int i2 = this.f52274a;
        if (i >= 0 && i < i2) {
            int i3 = (i << 1) + 1;
            V v2 = (V) m41714f(i3);
            this.f52275b[i3] = v;
            return v2;
        }
        throw new IndexOutOfBoundsException();
    }
}
