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
    public Object[] f60870a;

    /* renamed from: com.tom_roush.pdfbox.util.SmallMap$a */
    /* loaded from: classes5.dex */
    public class C9969a implements Map.Entry {

        /* renamed from: a */
        public final int f60871a;

        public C9969a(int i) {
            this.f60871a = i;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!(obj instanceof C9969a)) {
                return false;
            }
            C9969a c9969a = (C9969a) obj;
            if (!getKey().equals(c9969a.getKey()) || !getValue().equals(c9969a.getValue())) {
                return false;
            }
            return true;
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return SmallMap.this.f60870a[this.f60871a];
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return SmallMap.this.f60870a[this.f60871a + 1];
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return getKey().hashCode();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (obj != null) {
                Object value = getValue();
                SmallMap.this.f60870a[this.f60871a + 1] = obj;
                return value;
            }
            throw new NullPointerException("Key or value must not be null.");
        }
    }

    public SmallMap() {
    }

    /* renamed from: b */
    public final int m32067b(Object obj) {
        if (!isEmpty() && obj != null) {
            int i = 0;
            while (true) {
                Object[] objArr = this.f60870a;
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
    public final int m32066c(Object obj) {
        if (!isEmpty() && obj != null) {
            int i = 1;
            while (true) {
                Object[] objArr = this.f60870a;
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
        this.f60870a = null;
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        if (m32067b(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        if (m32066c(obj) >= 0) {
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
        for (int i = 0; i < this.f60870a.length; i += 2) {
            linkedHashSet.add(new C9969a(i));
        }
        return Collections.unmodifiableSet(linkedHashSet);
    }

    @Override // java.util.Map
    public V get(Object obj) {
        int m32067b = m32067b(obj);
        if (m32067b < 0) {
            return null;
        }
        return (V) this.f60870a[m32067b + 1];
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        Object[] objArr = this.f60870a;
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
            Object[] objArr = this.f60870a;
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
            if (this.f60870a == null) {
                this.f60870a = new Object[]{k, v};
                return null;
            }
            int m32067b = m32067b(k);
            if (m32067b < 0) {
                Object[] objArr = this.f60870a;
                int length = objArr.length;
                Object[] objArr2 = new Object[2 + length];
                System.arraycopy(objArr, 0, objArr2, 0, length);
                objArr2[length] = k;
                objArr2[length + 1] = v;
                this.f60870a = objArr2;
                return null;
            }
            Object[] objArr3 = this.f60870a;
            int i = m32067b + 1;
            V v2 = (V) objArr3[i];
            objArr3[i] = v;
            return v2;
        }
        throw new NullPointerException("Key or value must not be null.");
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        Object[] objArr = this.f60870a;
        int i = 0;
        if (objArr != null && objArr.length != 0) {
            int length = objArr.length;
            int size = (map.size() << 1) + length;
            Object[] objArr2 = new Object[size];
            System.arraycopy(this.f60870a, 0, objArr2, 0, length);
            for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
                if (entry.getKey() != null && entry.getValue() != null) {
                    int m32067b = m32067b(entry.getKey());
                    if (m32067b >= 0) {
                        objArr2[m32067b + 1] = entry.getValue();
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
            this.f60870a = objArr2;
            return;
        }
        this.f60870a = new Object[map.size() << 1];
        for (Map.Entry<? extends K, ? extends V> entry2 : map.entrySet()) {
            if (entry2.getKey() != null && entry2.getValue() != null) {
                int i3 = i + 1;
                this.f60870a[i] = entry2.getKey();
                i += 2;
                this.f60870a[i3] = entry2.getValue();
            } else {
                throw new NullPointerException("Key or value must not be null.");
            }
        }
    }

    @Override // java.util.Map
    public V remove(Object obj) {
        int m32067b = m32067b(obj);
        if (m32067b < 0) {
            return null;
        }
        Object[] objArr = this.f60870a;
        V v = (V) objArr[m32067b + 1];
        int length = objArr.length;
        if (length == 2) {
            this.f60870a = null;
        } else {
            Object[] objArr2 = new Object[length - 2];
            System.arraycopy(objArr, 0, objArr2, 0, m32067b);
            System.arraycopy(this.f60870a, m32067b + 2, objArr2, m32067b, (length - m32067b) - 2);
            this.f60870a = objArr2;
        }
        return v;
    }

    @Override // java.util.Map
    public int size() {
        Object[] objArr = this.f60870a;
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
        ArrayList arrayList = new ArrayList(this.f60870a.length >> 1);
        while (true) {
            Object[] objArr = this.f60870a;
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