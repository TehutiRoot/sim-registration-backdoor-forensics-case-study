package androidx.collection;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public class SparseArrayCompat<E> implements Cloneable {

    /* renamed from: e */
    public static final Object f12403e = new Object();

    /* renamed from: a */
    public boolean f12404a;

    /* renamed from: b */
    public int[] f12405b;

    /* renamed from: c */
    public Object[] f12406c;

    /* renamed from: d */
    public int f12407d;

    public SparseArrayCompat() {
        this(10);
    }

    /* renamed from: a */
    public final void m61710a() {
        int i = this.f12407d;
        int[] iArr = this.f12405b;
        Object[] objArr = this.f12406c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f12403e) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f12404a = false;
        this.f12407d = i2;
    }

    public void append(int i, E e) {
        int i2 = this.f12407d;
        if (i2 != 0 && i <= this.f12405b[i2 - 1]) {
            put(i, e);
            return;
        }
        if (this.f12404a && i2 >= this.f12405b.length) {
            m61710a();
        }
        int i3 = this.f12407d;
        if (i3 >= this.f12405b.length) {
            int m619e = AbstractC17018wx.m619e(i3 + 1);
            int[] iArr = new int[m619e];
            Object[] objArr = new Object[m619e];
            int[] iArr2 = this.f12405b;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.f12406c;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f12405b = iArr;
            this.f12406c = objArr;
        }
        this.f12405b[i3] = i;
        this.f12406c[i3] = e;
        this.f12407d = i3 + 1;
    }

    public void clear() {
        int i = this.f12407d;
        Object[] objArr = this.f12406c;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f12407d = 0;
        this.f12404a = false;
    }

    public boolean containsKey(int i) {
        if (indexOfKey(i) >= 0) {
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
    public void delete(int i) {
        remove(i);
    }

    @Nullable
    public E get(int i) {
        return get(i, null);
    }

    public int indexOfKey(int i) {
        if (this.f12404a) {
            m61710a();
        }
        return AbstractC17018wx.m623a(this.f12405b, this.f12407d, i);
    }

    public int indexOfValue(E e) {
        if (this.f12404a) {
            m61710a();
        }
        for (int i = 0; i < this.f12407d; i++) {
            if (this.f12406c[i] == e) {
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

    public int keyAt(int i) {
        if (this.f12404a) {
            m61710a();
        }
        return this.f12405b[i];
    }

    public void put(int i, E e) {
        int m623a = AbstractC17018wx.m623a(this.f12405b, this.f12407d, i);
        if (m623a >= 0) {
            this.f12406c[m623a] = e;
            return;
        }
        int i2 = ~m623a;
        int i3 = this.f12407d;
        if (i2 < i3) {
            Object[] objArr = this.f12406c;
            if (objArr[i2] == f12403e) {
                this.f12405b[i2] = i;
                objArr[i2] = e;
                return;
            }
        }
        if (this.f12404a && i3 >= this.f12405b.length) {
            m61710a();
            i2 = ~AbstractC17018wx.m623a(this.f12405b, this.f12407d, i);
        }
        int i4 = this.f12407d;
        if (i4 >= this.f12405b.length) {
            int m619e = AbstractC17018wx.m619e(i4 + 1);
            int[] iArr = new int[m619e];
            Object[] objArr2 = new Object[m619e];
            int[] iArr2 = this.f12405b;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f12406c;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f12405b = iArr;
            this.f12406c = objArr2;
        }
        int i5 = this.f12407d;
        if (i5 - i2 != 0) {
            int[] iArr3 = this.f12405b;
            int i6 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i6, i5 - i2);
            Object[] objArr4 = this.f12406c;
            System.arraycopy(objArr4, i2, objArr4, i6, this.f12407d - i2);
        }
        this.f12405b[i2] = i;
        this.f12406c[i2] = e;
        this.f12407d++;
    }

    public void putAll(@NonNull SparseArrayCompat<? extends E> sparseArrayCompat) {
        int size = sparseArrayCompat.size();
        for (int i = 0; i < size; i++) {
            put(sparseArrayCompat.keyAt(i), sparseArrayCompat.valueAt(i));
        }
    }

    @Nullable
    public E putIfAbsent(int i, E e) {
        E e2 = get(i);
        if (e2 == null) {
            put(i, e);
        }
        return e2;
    }

    public void remove(int i) {
        int m623a = AbstractC17018wx.m623a(this.f12405b, this.f12407d, i);
        if (m623a >= 0) {
            Object[] objArr = this.f12406c;
            Object obj = objArr[m623a];
            Object obj2 = f12403e;
            if (obj != obj2) {
                objArr[m623a] = obj2;
                this.f12404a = true;
            }
        }
    }

    public void removeAt(int i) {
        Object[] objArr = this.f12406c;
        Object obj = objArr[i];
        Object obj2 = f12403e;
        if (obj != obj2) {
            objArr[i] = obj2;
            this.f12404a = true;
        }
    }

    public void removeAtRange(int i, int i2) {
        int min = Math.min(this.f12407d, i2 + i);
        while (i < min) {
            removeAt(i);
            i++;
        }
    }

    @Nullable
    public E replace(int i, E e) {
        int indexOfKey = indexOfKey(i);
        if (indexOfKey >= 0) {
            Object[] objArr = this.f12406c;
            E e2 = (E) objArr[indexOfKey];
            objArr[indexOfKey] = e;
            return e2;
        }
        return null;
    }

    public void setValueAt(int i, E e) {
        if (this.f12404a) {
            m61710a();
        }
        this.f12406c[i] = e;
    }

    public int size() {
        if (this.f12404a) {
            m61710a();
        }
        return this.f12407d;
    }

    public String toString() {
        if (size() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f12407d * 28);
        sb.append('{');
        for (int i = 0; i < this.f12407d; i++) {
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
        if (this.f12404a) {
            m61710a();
        }
        return (E) this.f12406c[i];
    }

    public SparseArrayCompat(int i) {
        this.f12404a = false;
        if (i == 0) {
            this.f12405b = AbstractC17018wx.f108615a;
            this.f12406c = AbstractC17018wx.f108617c;
            return;
        }
        int m619e = AbstractC17018wx.m619e(i);
        this.f12405b = new int[m619e];
        this.f12406c = new Object[m619e];
    }

    /* renamed from: clone */
    public SparseArrayCompat<E> m69377clone() {
        try {
            SparseArrayCompat<E> sparseArrayCompat = (SparseArrayCompat) super.clone();
            sparseArrayCompat.f12405b = (int[]) this.f12405b.clone();
            sparseArrayCompat.f12406c = (Object[]) this.f12406c.clone();
            return sparseArrayCompat;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public E get(int i, E e) {
        E e2;
        int m623a = AbstractC17018wx.m623a(this.f12405b, this.f12407d, i);
        return (m623a < 0 || (e2 = (E) this.f12406c[m623a]) == f12403e) ? e : e2;
    }

    public boolean replace(int i, E e, E e2) {
        int indexOfKey = indexOfKey(i);
        if (indexOfKey >= 0) {
            Object obj = this.f12406c[indexOfKey];
            if (obj == e || (e != null && e.equals(obj))) {
                this.f12406c[indexOfKey] = e2;
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean remove(int i, Object obj) {
        int indexOfKey = indexOfKey(i);
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