package androidx.collection;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public class LongSparseArray<E> implements Cloneable {

    /* renamed from: e */
    public static final Object f12287e = new Object();

    /* renamed from: a */
    public boolean f12288a;

    /* renamed from: b */
    public long[] f12289b;

    /* renamed from: c */
    public Object[] f12290c;

    /* renamed from: d */
    public int f12291d;

    public LongSparseArray() {
        this(10);
    }

    /* renamed from: a */
    public final void m61768a() {
        int i = this.f12291d;
        long[] jArr = this.f12289b;
        Object[] objArr = this.f12290c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f12287e) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f12288a = false;
        this.f12291d = i2;
    }

    public void append(long j, E e) {
        int i = this.f12291d;
        if (i != 0 && j <= this.f12289b[i - 1]) {
            put(j, e);
            return;
        }
        if (this.f12288a && i >= this.f12289b.length) {
            m61768a();
        }
        int i2 = this.f12291d;
        if (i2 >= this.f12289b.length) {
            int m639f = AbstractC17009wx.m639f(i2 + 1);
            long[] jArr = new long[m639f];
            Object[] objArr = new Object[m639f];
            long[] jArr2 = this.f12289b;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr2 = this.f12290c;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f12289b = jArr;
            this.f12290c = objArr;
        }
        this.f12289b[i2] = j;
        this.f12290c[i2] = e;
        this.f12291d = i2 + 1;
    }

    public void clear() {
        int i = this.f12291d;
        Object[] objArr = this.f12290c;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f12291d = 0;
        this.f12288a = false;
    }

    public boolean containsKey(long j) {
        if (indexOfKey(j) >= 0) {
            return true;
        }
        return false;
    }

    public boolean containsValue(E e) {
        if (indexOfValue(e) >= 0) {
            return true;
        }
        return false;
    }

    @Deprecated
    public void delete(long j) {
        remove(j);
    }

    @Nullable
    public E get(long j) {
        return get(j, null);
    }

    public int indexOfKey(long j) {
        if (this.f12288a) {
            m61768a();
        }
        return AbstractC17009wx.m643b(this.f12289b, this.f12291d, j);
    }

    public int indexOfValue(E e) {
        if (this.f12288a) {
            m61768a();
        }
        for (int i = 0; i < this.f12291d; i++) {
            if (this.f12290c[i] == e) {
                return i;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public long keyAt(int i) {
        if (this.f12288a) {
            m61768a();
        }
        return this.f12289b[i];
    }

    public void put(long j, E e) {
        int m643b = AbstractC17009wx.m643b(this.f12289b, this.f12291d, j);
        if (m643b >= 0) {
            this.f12290c[m643b] = e;
            return;
        }
        int i = ~m643b;
        int i2 = this.f12291d;
        if (i < i2) {
            Object[] objArr = this.f12290c;
            if (objArr[i] == f12287e) {
                this.f12289b[i] = j;
                objArr[i] = e;
                return;
            }
        }
        if (this.f12288a && i2 >= this.f12289b.length) {
            m61768a();
            i = ~AbstractC17009wx.m643b(this.f12289b, this.f12291d, j);
        }
        int i3 = this.f12291d;
        if (i3 >= this.f12289b.length) {
            int m639f = AbstractC17009wx.m639f(i3 + 1);
            long[] jArr = new long[m639f];
            Object[] objArr2 = new Object[m639f];
            long[] jArr2 = this.f12289b;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f12290c;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f12289b = jArr;
            this.f12290c = objArr2;
        }
        int i4 = this.f12291d;
        if (i4 - i != 0) {
            long[] jArr3 = this.f12289b;
            int i5 = i + 1;
            System.arraycopy(jArr3, i, jArr3, i5, i4 - i);
            Object[] objArr4 = this.f12290c;
            System.arraycopy(objArr4, i, objArr4, i5, this.f12291d - i);
        }
        this.f12289b[i] = j;
        this.f12290c[i] = e;
        this.f12291d++;
    }

    public void putAll(@NonNull LongSparseArray<? extends E> longSparseArray) {
        int size = longSparseArray.size();
        for (int i = 0; i < size; i++) {
            put(longSparseArray.keyAt(i), longSparseArray.valueAt(i));
        }
    }

    @Nullable
    public E putIfAbsent(long j, E e) {
        E e2 = get(j);
        if (e2 == null) {
            put(j, e);
        }
        return e2;
    }

    public void remove(long j) {
        int m643b = AbstractC17009wx.m643b(this.f12289b, this.f12291d, j);
        if (m643b >= 0) {
            Object[] objArr = this.f12290c;
            Object obj = objArr[m643b];
            Object obj2 = f12287e;
            if (obj != obj2) {
                objArr[m643b] = obj2;
                this.f12288a = true;
            }
        }
    }

    public void removeAt(int i) {
        Object[] objArr = this.f12290c;
        Object obj = objArr[i];
        Object obj2 = f12287e;
        if (obj != obj2) {
            objArr[i] = obj2;
            this.f12288a = true;
        }
    }

    @Nullable
    public E replace(long j, E e) {
        int indexOfKey = indexOfKey(j);
        if (indexOfKey >= 0) {
            Object[] objArr = this.f12290c;
            E e2 = (E) objArr[indexOfKey];
            objArr[indexOfKey] = e;
            return e2;
        }
        return null;
    }

    public void setValueAt(int i, E e) {
        if (this.f12288a) {
            m61768a();
        }
        this.f12290c[i] = e;
    }

    public int size() {
        if (this.f12288a) {
            m61768a();
        }
        return this.f12291d;
    }

    public String toString() {
        if (size() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f12291d * 28);
        sb.append('{');
        for (int i = 0; i < this.f12291d; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(keyAt(i));
            sb.append('=');
            E valueAt = valueAt(i);
            if (valueAt != this) {
                sb.append(valueAt);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public E valueAt(int i) {
        if (this.f12288a) {
            m61768a();
        }
        return (E) this.f12290c[i];
    }

    public LongSparseArray(int i) {
        this.f12288a = false;
        if (i == 0) {
            this.f12289b = AbstractC17009wx.f108185b;
            this.f12290c = AbstractC17009wx.f108186c;
            return;
        }
        int m639f = AbstractC17009wx.m639f(i);
        this.f12289b = new long[m639f];
        this.f12290c = new Object[m639f];
    }

    /* renamed from: clone */
    public LongSparseArray<E> m69190clone() {
        try {
            LongSparseArray<E> longSparseArray = (LongSparseArray) super.clone();
            longSparseArray.f12289b = (long[]) this.f12289b.clone();
            longSparseArray.f12290c = (Object[]) this.f12290c.clone();
            return longSparseArray;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public E get(long j, E e) {
        E e2;
        int m643b = AbstractC17009wx.m643b(this.f12289b, this.f12291d, j);
        return (m643b < 0 || (e2 = (E) this.f12290c[m643b]) == f12287e) ? e : e2;
    }

    public boolean replace(long j, E e, E e2) {
        int indexOfKey = indexOfKey(j);
        if (indexOfKey >= 0) {
            Object obj = this.f12290c[indexOfKey];
            if (obj == e || (e != null && e.equals(obj))) {
                this.f12290c[indexOfKey] = e2;
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean remove(long j, Object obj) {
        int indexOfKey = indexOfKey(j);
        if (indexOfKey >= 0) {
            E valueAt = valueAt(indexOfKey);
            if (obj == valueAt || (obj != null && obj.equals(valueAt))) {
                removeAt(indexOfKey);
                return true;
            }
            return false;
        }
        return false;
    }
}
