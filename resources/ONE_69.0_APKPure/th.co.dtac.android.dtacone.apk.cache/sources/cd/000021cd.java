package androidx.collection;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* loaded from: classes.dex */
public class SimpleArrayMap<K, V> {

    /* renamed from: d */
    public static Object[] f12396d;

    /* renamed from: e */
    public static int f12397e;

    /* renamed from: f */
    public static Object[] f12398f;

    /* renamed from: g */
    public static int f12399g;

    /* renamed from: a */
    public int[] f12400a;

    /* renamed from: b */
    public Object[] f12401b;

    /* renamed from: c */
    public int f12402c;

    public SimpleArrayMap() {
        this.f12400a = AbstractC17018wx.f108615a;
        this.f12401b = AbstractC17018wx.f108617c;
        this.f12402c = 0;
    }

    /* renamed from: b */
    public static int m61715b(int[] iArr, int i, int i2) {
        try {
            return AbstractC17018wx.m623a(iArr, i, i2);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: c */
    public static void m61714c(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (SimpleArrayMap.class) {
                try {
                    if (f12399g < 10) {
                        objArr[0] = f12398f;
                        objArr[1] = iArr;
                        for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                            objArr[i2] = null;
                        }
                        f12398f = objArr;
                        f12399g++;
                    }
                } finally {
                }
            }
        } else if (iArr.length == 4) {
            synchronized (SimpleArrayMap.class) {
                try {
                    if (f12397e < 10) {
                        objArr[0] = f12396d;
                        objArr[1] = iArr;
                        for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                            objArr[i3] = null;
                        }
                        f12396d = objArr;
                        f12397e++;
                    }
                } finally {
                }
            }
        }
    }

    /* renamed from: a */
    public final void m61716a(int i) {
        if (i == 8) {
            synchronized (SimpleArrayMap.class) {
                try {
                    Object[] objArr = f12398f;
                    if (objArr != null) {
                        this.f12401b = objArr;
                        f12398f = (Object[]) objArr[0];
                        this.f12400a = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        f12399g--;
                        return;
                    }
                } finally {
                }
            }
        } else if (i == 4) {
            synchronized (SimpleArrayMap.class) {
                try {
                    Object[] objArr2 = f12396d;
                    if (objArr2 != null) {
                        this.f12401b = objArr2;
                        f12396d = (Object[]) objArr2[0];
                        this.f12400a = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        f12397e--;
                        return;
                    }
                } finally {
                }
            }
        }
        this.f12400a = new int[i];
        this.f12401b = new Object[i << 1];
    }

    public void clear() {
        int i = this.f12402c;
        if (i > 0) {
            int[] iArr = this.f12400a;
            Object[] objArr = this.f12401b;
            this.f12400a = AbstractC17018wx.f108615a;
            this.f12401b = AbstractC17018wx.f108617c;
            this.f12402c = 0;
            m61714c(iArr, objArr, i);
        }
        if (this.f12402c <= 0) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    public boolean containsKey(@Nullable Object obj) {
        if (indexOfKey(obj) >= 0) {
            return true;
        }
        return false;
    }

    public boolean containsValue(Object obj) {
        if (m61711g(obj) >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public int m61713e(Object obj, int i) {
        int i2 = this.f12402c;
        if (i2 == 0) {
            return -1;
        }
        int m61715b = m61715b(this.f12400a, i2, i);
        if (m61715b < 0) {
            return m61715b;
        }
        if (obj.equals(this.f12401b[m61715b << 1])) {
            return m61715b;
        }
        int i3 = m61715b + 1;
        while (i3 < i2 && this.f12400a[i3] == i) {
            if (obj.equals(this.f12401b[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = m61715b - 1; i4 >= 0 && this.f12400a[i4] == i; i4--) {
            if (obj.equals(this.f12401b[i4 << 1])) {
                return i4;
            }
        }
        return ~i3;
    }

    public void ensureCapacity(int i) {
        int i2 = this.f12402c;
        int[] iArr = this.f12400a;
        if (iArr.length < i) {
            Object[] objArr = this.f12401b;
            m61716a(i);
            if (this.f12402c > 0) {
                System.arraycopy(iArr, 0, this.f12400a, 0, i2);
                System.arraycopy(objArr, 0, this.f12401b, 0, i2 << 1);
            }
            m61714c(iArr, objArr, i2);
        }
        if (this.f12402c == i2) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SimpleArrayMap) {
            SimpleArrayMap simpleArrayMap = (SimpleArrayMap) obj;
            if (size() != simpleArrayMap.size()) {
                return false;
            }
            for (int i = 0; i < this.f12402c; i++) {
                K keyAt = keyAt(i);
                V valueAt = valueAt(i);
                Object obj2 = simpleArrayMap.get(keyAt);
                if (valueAt == null) {
                    if (obj2 != null || !simpleArrayMap.containsKey(keyAt)) {
                        return false;
                    }
                } else if (!valueAt.equals(obj2)) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            for (int i2 = 0; i2 < this.f12402c; i2++) {
                K keyAt2 = keyAt(i2);
                V valueAt2 = valueAt(i2);
                Object obj3 = map.get(keyAt2);
                if (valueAt2 == null) {
                    if (obj3 != null || !map.containsKey(keyAt2)) {
                        return false;
                    }
                } else if (!valueAt2.equals(obj3)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public int m61712f() {
        int i = this.f12402c;
        if (i == 0) {
            return -1;
        }
        int m61715b = m61715b(this.f12400a, i, 0);
        if (m61715b < 0) {
            return m61715b;
        }
        if (this.f12401b[m61715b << 1] == null) {
            return m61715b;
        }
        int i2 = m61715b + 1;
        while (i2 < i && this.f12400a[i2] == 0) {
            if (this.f12401b[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = m61715b - 1; i3 >= 0 && this.f12400a[i3] == 0; i3--) {
            if (this.f12401b[i3 << 1] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    /* renamed from: g */
    public int m61711g(Object obj) {
        int i = this.f12402c * 2;
        Object[] objArr = this.f12401b;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    @Nullable
    public V get(Object obj) {
        return getOrDefault(obj, null);
    }

    public V getOrDefault(Object obj, V v) {
        int indexOfKey = indexOfKey(obj);
        if (indexOfKey >= 0) {
            return (V) this.f12401b[(indexOfKey << 1) + 1];
        }
        return v;
    }

    public int hashCode() {
        int hashCode;
        int[] iArr = this.f12400a;
        Object[] objArr = this.f12401b;
        int i = this.f12402c;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            int i5 = iArr[i3];
            if (obj == null) {
                hashCode = 0;
            } else {
                hashCode = obj.hashCode();
            }
            i4 += hashCode ^ i5;
            i3++;
            i2 += 2;
        }
        return i4;
    }

    public int indexOfKey(@Nullable Object obj) {
        if (obj == null) {
            return m61712f();
        }
        return m61713e(obj, obj.hashCode());
    }

    public boolean isEmpty() {
        if (this.f12402c <= 0) {
            return true;
        }
        return false;
    }

    public K keyAt(int i) {
        return (K) this.f12401b[i << 1];
    }

    @Nullable
    public V put(K k, V v) {
        int i;
        int m61713e;
        int i2 = this.f12402c;
        if (k == null) {
            m61713e = m61712f();
            i = 0;
        } else {
            int hashCode = k.hashCode();
            i = hashCode;
            m61713e = m61713e(k, hashCode);
        }
        if (m61713e >= 0) {
            int i3 = (m61713e << 1) + 1;
            Object[] objArr = this.f12401b;
            V v2 = (V) objArr[i3];
            objArr[i3] = v;
            return v2;
        }
        int i4 = ~m61713e;
        int[] iArr = this.f12400a;
        if (i2 >= iArr.length) {
            int i5 = 8;
            if (i2 >= 8) {
                i5 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i5 = 4;
            }
            Object[] objArr2 = this.f12401b;
            m61716a(i5);
            if (i2 == this.f12402c) {
                int[] iArr2 = this.f12400a;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr2, 0, this.f12401b, 0, objArr2.length);
                }
                m61714c(iArr, objArr2, i2);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i4 < i2) {
            int[] iArr3 = this.f12400a;
            int i6 = i4 + 1;
            System.arraycopy(iArr3, i4, iArr3, i6, i2 - i4);
            Object[] objArr3 = this.f12401b;
            System.arraycopy(objArr3, i4 << 1, objArr3, i6 << 1, (this.f12402c - i4) << 1);
        }
        int i7 = this.f12402c;
        if (i2 == i7) {
            int[] iArr4 = this.f12400a;
            if (i4 < iArr4.length) {
                iArr4[i4] = i;
                Object[] objArr4 = this.f12401b;
                int i8 = i4 << 1;
                objArr4[i8] = k;
                objArr4[i8 + 1] = v;
                this.f12402c = i7 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public void putAll(@NonNull SimpleArrayMap<? extends K, ? extends V> simpleArrayMap) {
        int i = simpleArrayMap.f12402c;
        ensureCapacity(this.f12402c + i);
        if (this.f12402c == 0) {
            if (i > 0) {
                System.arraycopy(simpleArrayMap.f12400a, 0, this.f12400a, 0, i);
                System.arraycopy(simpleArrayMap.f12401b, 0, this.f12401b, 0, i << 1);
                this.f12402c = i;
                return;
            }
            return;
        }
        for (int i2 = 0; i2 < i; i2++) {
            put(simpleArrayMap.keyAt(i2), simpleArrayMap.valueAt(i2));
        }
    }

    @Nullable
    public V putIfAbsent(K k, V v) {
        V v2 = get(k);
        if (v2 == null) {
            return put(k, v);
        }
        return v2;
    }

    @Nullable
    public V remove(Object obj) {
        int indexOfKey = indexOfKey(obj);
        if (indexOfKey >= 0) {
            return removeAt(indexOfKey);
        }
        return null;
    }

    public V removeAt(int i) {
        Object[] objArr = this.f12401b;
        int i2 = i << 1;
        V v = (V) objArr[i2 + 1];
        int i3 = this.f12402c;
        if (i3 <= 1) {
            clear();
        } else {
            int i4 = i3 - 1;
            int[] iArr = this.f12400a;
            int i5 = 8;
            if (iArr.length > 8 && i3 < iArr.length / 3) {
                if (i3 > 8) {
                    i5 = i3 + (i3 >> 1);
                }
                m61716a(i5);
                if (i3 == this.f12402c) {
                    if (i > 0) {
                        System.arraycopy(iArr, 0, this.f12400a, 0, i);
                        System.arraycopy(objArr, 0, this.f12401b, 0, i2);
                    }
                    if (i < i4) {
                        int i6 = i + 1;
                        int i7 = i4 - i;
                        System.arraycopy(iArr, i6, this.f12400a, i, i7);
                        System.arraycopy(objArr, i6 << 1, this.f12401b, i2, i7 << 1);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            } else {
                if (i < i4) {
                    int i8 = i + 1;
                    int i9 = i4 - i;
                    System.arraycopy(iArr, i8, iArr, i, i9);
                    Object[] objArr2 = this.f12401b;
                    System.arraycopy(objArr2, i8 << 1, objArr2, i2, i9 << 1);
                }
                Object[] objArr3 = this.f12401b;
                int i10 = i4 << 1;
                objArr3[i10] = null;
                objArr3[i10 + 1] = null;
            }
            if (i3 == this.f12402c) {
                this.f12402c = i4;
            } else {
                throw new ConcurrentModificationException();
            }
        }
        return v;
    }

    @Nullable
    public V replace(K k, V v) {
        int indexOfKey = indexOfKey(k);
        if (indexOfKey >= 0) {
            return setValueAt(indexOfKey, v);
        }
        return null;
    }

    public V setValueAt(int i, V v) {
        int i2 = (i << 1) + 1;
        Object[] objArr = this.f12401b;
        V v2 = (V) objArr[i2];
        objArr[i2] = v;
        return v2;
    }

    public int size() {
        return this.f12402c;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f12402c * 28);
        sb.append('{');
        for (int i = 0; i < this.f12402c; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            K keyAt = keyAt(i);
            if (keyAt != this) {
                sb.append(keyAt);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            V valueAt = valueAt(i);
            if (valueAt != this) {
                sb.append(valueAt);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public V valueAt(int i) {
        return (V) this.f12401b[(i << 1) + 1];
    }

    public boolean remove(Object obj, Object obj2) {
        int indexOfKey = indexOfKey(obj);
        if (indexOfKey >= 0) {
            V valueAt = valueAt(indexOfKey);
            if (obj2 == valueAt || (obj2 != null && obj2.equals(valueAt))) {
                removeAt(indexOfKey);
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean replace(K k, V v, V v2) {
        int indexOfKey = indexOfKey(k);
        if (indexOfKey >= 0) {
            V valueAt = valueAt(indexOfKey);
            if (valueAt == v || (v != null && v.equals(valueAt))) {
                setValueAt(indexOfKey, v2);
                return true;
            }
            return false;
        }
        return false;
    }

    public SimpleArrayMap(int i) {
        if (i == 0) {
            this.f12400a = AbstractC17018wx.f108615a;
            this.f12401b = AbstractC17018wx.f108617c;
        } else {
            m61716a(i);
        }
        this.f12402c = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SimpleArrayMap(SimpleArrayMap<K, V> simpleArrayMap) {
        this();
        if (simpleArrayMap != 0) {
            putAll(simpleArrayMap);
        }
    }
}