package com.google.android.gms.internal.firebase_ml;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes3.dex */
public class zziq<K, V> extends AbstractMap<K, V> implements Cloneable {

    /* renamed from: a */
    public int f45881a;

    /* renamed from: b */
    public Object[] f45882b;

    /* renamed from: com.google.android.gms.internal.firebase_ml.zziq$a */
    /* loaded from: classes3.dex */
    public final class C6514a implements Iterator {

        /* renamed from: a */
        public boolean f45883a;

        /* renamed from: b */
        public int f45884b;

        public C6514a() {
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.f45884b < zziq.this.f45881a) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public final /* synthetic */ Object next() {
            int i = this.f45884b;
            zziq zziqVar = zziq.this;
            if (i != zziqVar.f45881a) {
                this.f45884b = i + 1;
                this.f45883a = false;
                return new C6515b(i);
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final void remove() {
            int i = this.f45884b - 1;
            if (!this.f45883a && i >= 0) {
                zziq.this.remove(i);
                this.f45884b--;
                this.f45883a = true;
                return;
            }
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: com.google.android.gms.internal.firebase_ml.zziq$b */
    /* loaded from: classes3.dex */
    public final class C6515b implements Map.Entry {

        /* renamed from: a */
        public int f45886a;

        public C6515b(int i) {
            this.f45886a = i;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (zzmg.equal(getKey(), entry.getKey()) && zzmg.equal(getValue(), entry.getValue())) {
                return true;
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public final Object getKey() {
            return zziq.this.zzaj(this.f45886a);
        }

        @Override // java.util.Map.Entry
        public final Object getValue() {
            return zziq.this.zzak(this.f45886a);
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
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
        public final Object setValue(Object obj) {
            return zziq.this.set(this.f45886a, obj);
        }
    }

    /* renamed from: com.google.android.gms.internal.firebase_ml.zziq$c */
    /* loaded from: classes3.dex */
    public final class C6516c extends AbstractSet {
        public C6516c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            return new C6514a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return zziq.this.f45881a;
        }
    }

    /* renamed from: a */
    public final Object m47894a(int i) {
        if (i < 0) {
            return null;
        }
        return this.f45882b[i];
    }

    /* renamed from: b */
    public final Object m47893b(int i) {
        int i2 = this.f45881a << 1;
        if (i < 0 || i >= i2) {
            return null;
        }
        Object m47894a = m47894a(i + 1);
        Object[] objArr = this.f45882b;
        int i3 = (i2 - i) - 2;
        if (i3 != 0) {
            System.arraycopy(objArr, i + 2, objArr, i, i3);
        }
        this.f45881a--;
        m47892c(i2 - 2, null, null);
        return m47894a;
    }

    /* renamed from: c */
    public final void m47892c(int i, Object obj, Object obj2) {
        Object[] objArr = this.f45882b;
        objArr[i] = obj;
        objArr[i + 1] = obj2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.f45881a = 0;
        this.f45882b = null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        if (-2 != m47891e(obj)) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        int i = this.f45881a << 1;
        Object[] objArr = this.f45882b;
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
    public final int m47891e(Object obj) {
        int i = this.f45881a << 1;
        Object[] objArr = this.f45882b;
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

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return new C6516c();
    }

    @Override // java.util.AbstractMap
    /* renamed from: f */
    public final zziq clone() {
        try {
            zziq zziqVar = (zziq) super.clone();
            Object[] objArr = this.f45882b;
            if (objArr != null) {
                int length = objArr.length;
                Object[] objArr2 = new Object[length];
                zziqVar.f45882b = objArr2;
                System.arraycopy(objArr, 0, objArr2, 0, length);
            }
            return zziqVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        return (V) m47894a(m47891e(obj) + 1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        int length;
        int m47891e = m47891e(k) >> 1;
        if (m47891e == -1) {
            m47891e = this.f45881a;
        }
        if (m47891e >= 0) {
            int i = m47891e + 1;
            if (i >= 0) {
                Object[] objArr = this.f45882b;
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
                    if (i2 == 0) {
                        this.f45882b = null;
                    } else {
                        int i5 = this.f45881a;
                        if (i5 == 0 || i2 != objArr.length) {
                            Object[] objArr2 = new Object[i2];
                            this.f45882b = objArr2;
                            if (i5 != 0) {
                                System.arraycopy(objArr, 0, objArr2, 0, i5 << 1);
                            }
                        }
                    }
                }
                int i6 = m47891e << 1;
                V v2 = (V) m47894a(i6 + 1);
                m47892c(i6, k, v);
                if (i > this.f45881a) {
                    this.f45881a = i;
                }
                return v2;
            }
            throw new IndexOutOfBoundsException();
        }
        throw new IndexOutOfBoundsException();
    }

    public final V remove(int i) {
        return (V) m47893b(i << 1);
    }

    public final V set(int i, V v) {
        int i2 = this.f45881a;
        if (i >= 0 && i < i2) {
            int i3 = (i << 1) + 1;
            V v2 = (V) m47894a(i3);
            this.f45882b[i3] = v;
            return v2;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f45881a;
    }

    public final K zzaj(int i) {
        if (i >= 0 && i < this.f45881a) {
            return (K) this.f45882b[i << 1];
        }
        return null;
    }

    public final V zzak(int i) {
        if (i >= 0 && i < this.f45881a) {
            return (V) m47894a((i << 1) + 1);
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        return (V) m47893b(m47891e(obj));
    }
}
