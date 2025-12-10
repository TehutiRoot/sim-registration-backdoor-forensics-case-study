package com.tom_roush.pdfbox.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes5.dex */
public class SmallMap<K, V> implements Map<K, V> {

    /* renamed from: a */
    public Object[] f60858a;

    /* renamed from: com.tom_roush.pdfbox.util.SmallMap$a */
    /* loaded from: classes5.dex */
    public class C9980a implements Map.Entry {

        /* renamed from: a */
        public final int f60859a;

        public C9980a(int i) {
            this.f60859a = i;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!(obj instanceof C9980a)) {
                return false;
            }
            C9980a c9980a = (C9980a) obj;
            if (!getKey().equals(c9980a.getKey()) || !getValue().equals(c9980a.getValue())) {
                return false;
            }
            return true;
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return SmallMap.this.f60858a[this.f60859a];
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return SmallMap.this.f60858a[this.f60859a + 1];
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return getKey().hashCode();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (obj != null) {
                Object value = getValue();
                SmallMap.this.f60858a[this.f60859a + 1] = obj;
                return value;
            }
            throw new NullPointerException("Key or value must not be null.");
        }
    }

    public SmallMap() {
    }

    /* renamed from: b */
    public final int m32075b(Object obj) {
        if (!isEmpty() && obj != null) {
            int i = 0;
            while (true) {
                Object[] objArr = this.f60858a;
                if (i >= objArr.length) {
                    break;
                } else if (obj.equals(objArr[i])) {
                    return i;
                } else {
                    i += 2;
                }
            }
        }
        return -1;
    }

    /* renamed from: c */
    public final int m32074c(Object obj) {
        if (!isEmpty() && obj != null) {
            int i = 1;
            while (true) {
                Object[] objArr = this.f60858a;
                if (i >= objArr.length) {
                    break;
                } else if (obj.equals(objArr[i])) {
                    return i;
                } else {
                    i += 2;
                }
            }
        }
        return -1;
    }

    @Override // java.util.Map
    public void clear() {
        this.f60858a = null;
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        if (m32075b(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        if (m32074c(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (isEmpty()) {
            return Collections.emptySet();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (int i = 0; i < this.f60858a.length; i += 2) {
            linkedHashSet.add(new C9980a(i));
        }
        return Collections.unmodifiableSet(linkedHashSet);
    }

    @Override // java.util.Map
    public V get(Object obj) {
        int m32075b = m32075b(obj);
        if (m32075b < 0) {
            return null;
        }
        return (V) this.f60858a[m32075b + 1];
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        Object[] objArr = this.f60858a;
        if (objArr != null && objArr.length != 0) {
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        if (isEmpty()) {
            return Collections.emptySet();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i = 0;
        while (true) {
            Object[] objArr = this.f60858a;
            if (i < objArr.length) {
                linkedHashSet.add(objArr[i]);
                i += 2;
            } else {
                return Collections.unmodifiableSet(linkedHashSet);
            }
        }
    }

    @Override // java.util.Map
    public V put(K k, V v) {
        if (k != null && v != null) {
            if (this.f60858a == null) {
                this.f60858a = new Object[]{k, v};
                return null;
            }
            int m32075b = m32075b(k);
            if (m32075b < 0) {
                Object[] objArr = this.f60858a;
                int length = objArr.length;
                Object[] objArr2 = new Object[2 + length];
                System.arraycopy(objArr, 0, objArr2, 0, length);
                objArr2[length] = k;
                objArr2[length + 1] = v;
                this.f60858a = objArr2;
                return null;
            }
            Object[] objArr3 = this.f60858a;
            int i = m32075b + 1;
            V v2 = (V) objArr3[i];
            objArr3[i] = v;
            return v2;
        }
        throw new NullPointerException("Key or value must not be null.");
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        Object[] objArr = this.f60858a;
        int i = 0;
        if (objArr != null && objArr.length != 0) {
            int length = objArr.length;
            int size = (map.size() << 1) + length;
            Object[] objArr2 = new Object[size];
            System.arraycopy(this.f60858a, 0, objArr2, 0, length);
            for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
                if (entry.getKey() != null && entry.getValue() != null) {
                    int m32075b = m32075b(entry.getKey());
                    if (m32075b >= 0) {
                        objArr2[m32075b + 1] = entry.getValue();
                    } else {
                        int i2 = length + 1;
                        objArr2[length] = entry.getKey();
                        length += 2;
                        objArr2[i2] = entry.getValue();
                    }
                } else {
                    throw new NullPointerException("Key or value must not be null.");
                }
            }
            if (length < size) {
                Object[] objArr3 = new Object[length];
                System.arraycopy(objArr2, 0, objArr3, 0, length);
                objArr2 = objArr3;
            }
            this.f60858a = objArr2;
            return;
        }
        this.f60858a = new Object[map.size() << 1];
        for (Map.Entry<? extends K, ? extends V> entry2 : map.entrySet()) {
            if (entry2.getKey() != null && entry2.getValue() != null) {
                int i3 = i + 1;
                this.f60858a[i] = entry2.getKey();
                i += 2;
                this.f60858a[i3] = entry2.getValue();
            } else {
                throw new NullPointerException("Key or value must not be null.");
            }
        }
    }

    @Override // java.util.Map
    public V remove(Object obj) {
        int m32075b = m32075b(obj);
        if (m32075b < 0) {
            return null;
        }
        Object[] objArr = this.f60858a;
        V v = (V) objArr[m32075b + 1];
        int length = objArr.length;
        if (length == 2) {
            this.f60858a = null;
        } else {
            Object[] objArr2 = new Object[length - 2];
            System.arraycopy(objArr, 0, objArr2, 0, m32075b);
            System.arraycopy(this.f60858a, m32075b + 2, objArr2, m32075b, (length - m32075b) - 2);
            this.f60858a = objArr2;
        }
        return v;
    }

    @Override // java.util.Map
    public int size() {
        Object[] objArr = this.f60858a;
        if (objArr == null) {
            return 0;
        }
        return objArr.length >> 1;
    }

    @Override // java.util.Map
    public Collection<V> values() {
        if (isEmpty()) {
            return Collections.emptySet();
        }
        int i = 1;
        ArrayList arrayList = new ArrayList(this.f60858a.length >> 1);
        while (true) {
            Object[] objArr = this.f60858a;
            if (i < objArr.length) {
                arrayList.add(objArr[i]);
                i += 2;
            } else {
                return Collections.unmodifiableList(arrayList);
            }
        }
    }

    public SmallMap(Map<? extends K, ? extends V> map) {
        putAll(map);
    }
}
