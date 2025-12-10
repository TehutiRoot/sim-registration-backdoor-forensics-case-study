package androidx.collection;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public class SparseArrayCompat<E> implements Cloneable {

    /* renamed from: e */
    public static final Object f12315e = new Object();

    /* renamed from: a */
    public boolean f12316a;

    /* renamed from: b */
    public int[] f12317b;

    /* renamed from: c */
    public Object[] f12318c;

    /* renamed from: d */
    public int f12319d;

    public SparseArrayCompat() {
        this(10);
    }

    /* renamed from: a */
    public final void m61760a() {
        int i = this.f12319d;
        int[] iArr = this.f12317b;
        Object[] objArr = this.f12318c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f12315e) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f12316a = false;
        this.f12319d = i2;
    }

    public void append(int i, E e) {
        int i2 = this.f12319d;
        if (i2 != 0 && i <= this.f12317b[i2 - 1]) {
            put(i, e);
            return;
        }
        if (this.f12316a && i2 >= this.f12317b.length) {
            m61760a();
        }
        int i3 = this.f12319d;
        if (i3 >= this.f12317b.length) {
            int m640e = AbstractC17009wx.m640e(i3 + 1);
            int[] iArr = new int[m640e];
            Object[] objArr = new Object[m640e];
            int[] iArr2 = this.f12317b;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.f12318c;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f12317b = iArr;
            this.f12318c = objArr;
        }
        this.f12317b[i3] = i;
        this.f12318c[i3] = e;
        this.f12319d = i3 + 1;
    }

    public void clear() {
        int i = this.f12319d;
        Object[] objArr = this.f12318c;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f12319d = 0;
        this.f12316a = false;
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
        if (this.f12316a) {
            m61760a();
        }
        return AbstractC17009wx.m644a(this.f12317b, this.f12319d, i);
    }

    public int indexOfValue(E e) {
        if (this.f12316a) {
            m61760a();
        }
        for (int i = 0; i < this.f12319d; i++) {
            if (this.f12318c[i] == e) {
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
        if (this.f12316a) {
            m61760a();
        }
        return this.f12317b[i];
    }

    public void put(int i, E e) {
        int m644a = AbstractC17009wx.m644a(this.f12317b, this.f12319d, i);
        if (m644a >= 0) {
            this.f12318c[m644a] = e;
            return;
        }
        int i2 = ~m644a;
        int i3 = this.f12319d;
        if (i2 < i3) {
            Object[] objArr = this.f12318c;
            if (objArr[i2] == f12315e) {
                this.f12317b[i2] = i;
                objArr[i2] = e;
                return;
            }
        }
        if (this.f12316a && i3 >= this.f12317b.length) {
            m61760a();
            i2 = ~AbstractC17009wx.m644a(this.f12317b, this.f12319d, i);
        }
        int i4 = this.f12319d;
        if (i4 >= this.f12317b.length) {
            int m640e = AbstractC17009wx.m640e(i4 + 1);
            int[] iArr = new int[m640e];
            Object[] objArr2 = new Object[m640e];
            int[] iArr2 = this.f12317b;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f12318c;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f12317b = iArr;
            this.f12318c = objArr2;
        }
        int i5 = this.f12319d;
        if (i5 - i2 != 0) {
            int[] iArr3 = this.f12317b;
            int i6 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i6, i5 - i2);
            Object[] objArr4 = this.f12318c;
            System.arraycopy(objArr4, i2, objArr4, i6, this.f12319d - i2);
        }
        this.f12317b[i2] = i;
        this.f12318c[i2] = e;
        this.f12319d++;
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
        int m644a = AbstractC17009wx.m644a(this.f12317b, this.f12319d, i);
        if (m644a >= 0) {
            Object[] objArr = this.f12318c;
            Object obj = objArr[m644a];
            Object obj2 = f12315e;
            if (obj != obj2) {
                objArr[m644a] = obj2;
                this.f12316a = true;
            }
        }
    }

    public void removeAt(int i) {
        Object[] objArr = this.f12318c;
        Object obj = objArr[i];
        Object obj2 = f12315e;
        if (obj != obj2) {
            objArr[i] = obj2;
            this.f12316a = true;
        }
    }

    public void removeAtRange(int i, int i2) {
        int min = Math.min(this.f12319d, i2 + i);
        while (i < min) {
            removeAt(i);
            i++;
        }
    }

    @Nullable
    public E replace(int i, E e) {
        int indexOfKey = indexOfKey(i);
        if (indexOfKey >= 0) {
            Object[] objArr = this.f12318c;
            E e2 = (E) objArr[indexOfKey];
            objArr[indexOfKey] = e;
            return e2;
        }
        return null;
    }

    public void setValueAt(int i, E e) {
        if (this.f12316a) {
            m61760a();
        }
        this.f12318c[i] = e;
    }

    public int size() {
        if (this.f12316a) {
            m61760a();
        }
        return this.f12319d;
    }

    public String toString() {
        if (size() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f12319d * 28);
        sb.append('{');
        for (int i = 0; i < this.f12319d; i++) {
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
        if (this.f12316a) {
            m61760a();
        }
        return (E) this.f12318c[i];
    }

    public SparseArrayCompat(int i) {
        this.f12316a = false;
        if (i == 0) {
            this.f12317b = AbstractC17009wx.f108184a;
            this.f12318c = AbstractC17009wx.f108186c;
            return;
        }
        int m640e = AbstractC17009wx.m640e(i);
        this.f12317b = new int[m640e];
        this.f12318c = new Object[m640e];
    }

    /* renamed from: clone */
    public SparseArrayCompat<E> m69191clone() {
        try {
            SparseArrayCompat<E> sparseArrayCompat = (SparseArrayCompat) super.clone();
            sparseArrayCompat.f12317b = (int[]) this.f12317b.clone();
            sparseArrayCompat.f12318c = (Object[]) this.f12318c.clone();
            return sparseArrayCompat;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public E get(int i, E e) {
        E e2;
        int m644a = AbstractC17009wx.m644a(this.f12317b, this.f12319d, i);
        return (m644a < 0 || (e2 = (E) this.f12318c[m644a]) == f12315e) ? e : e2;
    }

    public boolean replace(int i, E e, E e2) {
        int indexOfKey = indexOfKey(i);
        if (indexOfKey >= 0) {
            Object obj = this.f12318c[indexOfKey];
            if (obj == e || (e != null && e.equals(obj))) {
                this.f12318c[indexOfKey] = e2;
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
