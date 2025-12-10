package androidx.collection;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public class LongSparseArray<E> implements Cloneable {

    /* renamed from: e */
    public static final Object f12375e = new Object();

    /* renamed from: a */
    public boolean f12376a;

    /* renamed from: b */
    public long[] f12377b;

    /* renamed from: c */
    public Object[] f12378c;

    /* renamed from: d */
    public int f12379d;

    public LongSparseArray() {
        this(10);
    }

    /* renamed from: a */
    public final void m61718a() {
        int i = this.f12379d;
        long[] jArr = this.f12377b;
        Object[] objArr = this.f12378c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f12375e) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f12376a = false;
        this.f12379d = i2;
    }

    public void append(long j, E e) {
        int i = this.f12379d;
        if (i != 0 && j <= this.f12377b[i - 1]) {
            put(j, e);
            return;
        }
        if (this.f12376a && i >= this.f12377b.length) {
            m61718a();
        }
        int i2 = this.f12379d;
        if (i2 >= this.f12377b.length) {
            int m618f = AbstractC17018wx.m618f(i2 + 1);
            long[] jArr = new long[m618f];
            Object[] objArr = new Object[m618f];
            long[] jArr2 = this.f12377b;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr2 = this.f12378c;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f12377b = jArr;
            this.f12378c = objArr;
        }
        this.f12377b[i2] = j;
        this.f12378c[i2] = e;
        this.f12379d = i2 + 1;
    }

    public void clear() {
        int i = this.f12379d;
        Object[] objArr = this.f12378c;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f12379d = 0;
        this.f12376a = false;
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
        if (this.f12376a) {
            m61718a();
        }
        return AbstractC17018wx.m622b(this.f12377b, this.f12379d, j);
    }

    public int indexOfValue(E e) {
        if (this.f12376a) {
            m61718a();
        }
        for (int i = 0; i < this.f12379d; i++) {
            if (this.f12378c[i] == e) {
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
        if (this.f12376a) {
            m61718a();
        }
        return this.f12377b[i];
    }

    public void put(long j, E e) {
        int m622b = AbstractC17018wx.m622b(this.f12377b, this.f12379d, j);
        if (m622b >= 0) {
            this.f12378c[m622b] = e;
            return;
        }
        int i = ~m622b;
        int i2 = this.f12379d;
        if (i < i2) {
            Object[] objArr = this.f12378c;
            if (objArr[i] == f12375e) {
                this.f12377b[i] = j;
                objArr[i] = e;
                return;
            }
        }
        if (this.f12376a && i2 >= this.f12377b.length) {
            m61718a();
            i = ~AbstractC17018wx.m622b(this.f12377b, this.f12379d, j);
        }
        int i3 = this.f12379d;
        if (i3 >= this.f12377b.length) {
            int m618f = AbstractC17018wx.m618f(i3 + 1);
            long[] jArr = new long[m618f];
            Object[] objArr2 = new Object[m618f];
            long[] jArr2 = this.f12377b;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f12378c;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f12377b = jArr;
            this.f12378c = objArr2;
        }
        int i4 = this.f12379d;
        if (i4 - i != 0) {
            long[] jArr3 = this.f12377b;
            int i5 = i + 1;
            System.arraycopy(jArr3, i, jArr3, i5, i4 - i);
            Object[] objArr4 = this.f12378c;
            System.arraycopy(objArr4, i, objArr4, i5, this.f12379d - i);
        }
        this.f12377b[i] = j;
        this.f12378c[i] = e;
        this.f12379d++;
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
        int m622b = AbstractC17018wx.m622b(this.f12377b, this.f12379d, j);
        if (m622b >= 0) {
            Object[] objArr = this.f12378c;
            Object obj = objArr[m622b];
            Object obj2 = f12375e;
            if (obj != obj2) {
                objArr[m622b] = obj2;
                this.f12376a = true;
            }
        }
    }

    public void removeAt(int i) {
        Object[] objArr = this.f12378c;
        Object obj = objArr[i];
        Object obj2 = f12375e;
        if (obj != obj2) {
            objArr[i] = obj2;
            this.f12376a = true;
        }
    }

    @Nullable
    public E replace(long j, E e) {
        int indexOfKey = indexOfKey(j);
        if (indexOfKey >= 0) {
            Object[] objArr = this.f12378c;
            E e2 = (E) objArr[indexOfKey];
            objArr[indexOfKey] = e;
            return e2;
        }
        return null;
    }

    public void setValueAt(int i, E e) {
        if (this.f12376a) {
            m61718a();
        }
        this.f12378c[i] = e;
    }

    public int size() {
        if (this.f12376a) {
            m61718a();
        }
        return this.f12379d;
    }

    public String toString() {
        if (size() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f12379d * 28);
        sb.append('{');
        for (int i = 0; i < this.f12379d; i++) {
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
        if (this.f12376a) {
            m61718a();
        }
        return (E) this.f12378c[i];
    }

    public LongSparseArray(int i) {
        this.f12376a = false;
        if (i == 0) {
            this.f12377b = AbstractC17018wx.f108616b;
            this.f12378c = AbstractC17018wx.f108617c;
            return;
        }
        int m618f = AbstractC17018wx.m618f(i);
        this.f12377b = new long[m618f];
        this.f12378c = new Object[m618f];
    }

    /* renamed from: clone */
    public LongSparseArray<E> m69376clone() {
        try {
            LongSparseArray<E> longSparseArray = (LongSparseArray) super.clone();
            longSparseArray.f12377b = (long[]) this.f12377b.clone();
            longSparseArray.f12378c = (Object[]) this.f12378c.clone();
            return longSparseArray;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public E get(long j, E e) {
        E e2;
        int m622b = AbstractC17018wx.m622b(this.f12377b, this.f12379d, j);
        return (m622b < 0 || (e2 = (E) this.f12378c[m622b]) == f12375e) ? e : e2;
    }

    public boolean replace(long j, E e, E e2) {
        int indexOfKey = indexOfKey(j);
        if (indexOfKey >= 0) {
            Object obj = this.f12378c[indexOfKey];
            if (obj == e || (e != null && e.equals(obj))) {
                this.f12378c[indexOfKey] = e2;
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