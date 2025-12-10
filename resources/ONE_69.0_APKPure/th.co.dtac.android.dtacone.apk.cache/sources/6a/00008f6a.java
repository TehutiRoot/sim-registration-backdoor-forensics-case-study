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
    public int f45893a;

    /* renamed from: b */
    public Object[] f45894b;

    /* renamed from: com.google.android.gms.internal.firebase_ml.zziq$a */
    /* loaded from: classes3.dex */
    public final class C6503a implements Iterator {

        /* renamed from: a */
        public boolean f45895a;

        /* renamed from: b */
        public int f45896b;

        public C6503a() {
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.f45896b < zziq.this.f45893a) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public final /* synthetic */ Object next() {
            int i = this.f45896b;
            zziq zziqVar = zziq.this;
            if (i != zziqVar.f45893a) {
                this.f45896b = i + 1;
                this.f45895a = false;
                return new C6504b(i);
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final void remove() {
            int i = this.f45896b - 1;
            if (!this.f45895a && i >= 0) {
                zziq.this.remove(i);
                this.f45896b--;
                this.f45895a = true;
                return;
            }
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: com.google.android.gms.internal.firebase_ml.zziq$b */
    /* loaded from: classes3.dex */
    public final class C6504b implements Map.Entry {

        /* renamed from: a */
        public int f45898a;

        public C6504b(int i) {
            this.f45898a = i;
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
            return zziq.this.zzaj(this.f45898a);
        }

        @Override // java.util.Map.Entry
        public final Object getValue() {
            return zziq.this.zzak(this.f45898a);
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
            return zziq.this.set(this.f45898a, obj);
        }
    }

    /* renamed from: com.google.android.gms.internal.firebase_ml.zziq$c */
    /* loaded from: classes3.dex */
    public final class C6505c extends AbstractSet {
        public C6505c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            return new C6503a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return zziq.this.f45893a;
        }
    }

    /* renamed from: a */
    public final Object m47903a(int i) {
        if (i < 0) {
            return null;
        }
        return this.f45894b[i];
    }

    /* renamed from: b */
    public final Object m47902b(int i) {
        int i2 = this.f45893a << 1;
        if (i < 0 || i >= i2) {
            return null;
        }
        Object m47903a = m47903a(i + 1);
        Object[] objArr = this.f45894b;
        int i3 = (i2 - i) - 2;
        if (i3 != 0) {
            System.arraycopy(objArr, i + 2, objArr, i, i3);
        }
        this.f45893a--;
        m47901c(i2 - 2, null, null);
        return m47903a;
    }

    /* renamed from: c */
    public final void m47901c(int i, Object obj, Object obj2) {
        Object[] objArr = this.f45894b;
        objArr[i] = obj;
        objArr[i + 1] = obj2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.f45893a = 0;
        this.f45894b = null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        if (-2 != m47900e(obj)) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        int i = this.f45893a << 1;
        Object[] objArr = this.f45894b;
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
    public final int m47900e(Object obj) {
        int i = this.f45893a << 1;
        Object[] objArr = this.f45894b;
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
        return new C6505c();
    }

    @Override // java.util.AbstractMap
    /* renamed from: f */
    public final zziq clone() {
        try {
            zziq zziqVar = (zziq) super.clone();
            Object[] objArr = this.f45894b;
            if (objArr != null) {
                int length = objArr.length;
                Object[] objArr2 = new Object[length];
                zziqVar.f45894b = objArr2;
                System.arraycopy(objArr, 0, objArr2, 0, length);
            }
            return zziqVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        return (V) m47903a(m47900e(obj) + 1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        int length;
        int m47900e = m47900e(k) >> 1;
        if (m47900e == -1) {
            m47900e = this.f45893a;
        }
        if (m47900e >= 0) {
            int i = m47900e + 1;
            if (i >= 0) {
                Object[] objArr = this.f45894b;
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
                        this.f45894b = null;
                    } else {
                        int i5 = this.f45893a;
                        if (i5 == 0 || i2 != objArr.length) {
                            Object[] objArr2 = new Object[i2];
                            this.f45894b = objArr2;
                            if (i5 != 0) {
                                System.arraycopy(objArr, 0, objArr2, 0, i5 << 1);
                            }
                        }
                    }
                }
                int i6 = m47900e << 1;
                V v2 = (V) m47903a(i6 + 1);
                m47901c(i6, k, v);
                if (i > this.f45893a) {
                    this.f45893a = i;
                }
                return v2;
            }
            throw new IndexOutOfBoundsException();
        }
        throw new IndexOutOfBoundsException();
    }

    public final V remove(int i) {
        return (V) m47902b(i << 1);
    }

    public final V set(int i, V v) {
        int i2 = this.f45893a;
        if (i >= 0 && i < i2) {
            int i3 = (i << 1) + 1;
            V v2 = (V) m47903a(i3);
            this.f45894b[i3] = v;
            return v2;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f45893a;
    }

    public final K zzaj(int i) {
        if (i >= 0 && i < this.f45893a) {
            return (K) this.f45894b[i << 1];
        }
        return null;
    }

    public final V zzak(int i) {
        if (i >= 0 && i < this.f45893a) {
            return (V) m47903a((i << 1) + 1);
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        return (V) m47902b(m47900e(obj));
    }
}