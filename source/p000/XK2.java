package p000;

import com.google.android.gms.internal.firebase_ml.zzxl;
import com.google.android.gms.internal.firebase_ml.zzxt;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: XK2 */
/* loaded from: classes3.dex */
public final class XK2 extends AbstractC22089sK2 implements zzxt, KL2, RandomAccess {

    /* renamed from: d */
    public static final XK2 f7457d;

    /* renamed from: b */
    public float[] f7458b;

    /* renamed from: c */
    public int f7459c;

    static {
        XK2 xk2 = new XK2(new float[0], 0);
        f7457d = xk2;
        xk2.zzty();
    }

    public XK2(float[] fArr, int i) {
        this.f7458b = fArr;
        this.f7459c = i;
    }

    /* renamed from: d */
    public static XK2 m65511d() {
        return f7457d;
    }

    /* renamed from: a */
    public final void m65514a(int i) {
        if (i >= 0 && i < this.f7459c) {
            return;
        }
        throw new IndexOutOfBoundsException(m65513b(i));
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        float floatValue = ((Float) obj).floatValue();
        zztz();
        if (i >= 0 && i <= (i2 = this.f7459c)) {
            float[] fArr = this.f7458b;
            if (i2 < fArr.length) {
                System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
            } else {
                float[] fArr2 = new float[((i2 * 3) / 2) + 1];
                System.arraycopy(fArr, 0, fArr2, 0, i);
                System.arraycopy(this.f7458b, i, fArr2, i + 1, this.f7459c - i);
                this.f7458b = fArr2;
            }
            this.f7458b[i] = floatValue;
            this.f7459c++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m65513b(i));
    }

    @Override // p000.AbstractC22089sK2, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zztz();
        zzxl.m47422a(collection);
        if (!(collection instanceof XK2)) {
            return super.addAll(collection);
        }
        XK2 xk2 = (XK2) collection;
        int i = xk2.f7459c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f7459c;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            float[] fArr = this.f7458b;
            if (i3 > fArr.length) {
                this.f7458b = Arrays.copyOf(fArr, i3);
            }
            System.arraycopy(xk2.f7458b, 0, this.f7458b, this.f7459c, xk2.f7459c);
            this.f7459c = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: b */
    public final String m65513b(int i) {
        int i2 = this.f7459c;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: c */
    public final void m65512c(float f) {
        zztz();
        int i = this.f7459c;
        float[] fArr = this.f7458b;
        if (i == fArr.length) {
            float[] fArr2 = new float[((i * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.f7458b = fArr2;
        }
        float[] fArr3 = this.f7458b;
        int i2 = this.f7459c;
        this.f7459c = i2 + 1;
        fArr3[i2] = f;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // p000.AbstractC22089sK2, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof XK2)) {
            return super.equals(obj);
        }
        XK2 xk2 = (XK2) obj;
        if (this.f7459c != xk2.f7459c) {
            return false;
        }
        float[] fArr = xk2.f7458b;
        for (int i = 0; i < this.f7459c; i++) {
            if (Float.floatToIntBits(this.f7458b[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        m65514a(i);
        return Float.valueOf(this.f7458b[i]);
    }

    @Override // p000.AbstractC22089sK2, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f7459c; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.f7458b[i2]);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f7458b[i] == floatValue) {
                return i;
            }
        }
        return -1;
    }

    @Override // p000.AbstractC22089sK2, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        zztz();
        for (int i = 0; i < this.f7459c; i++) {
            if (obj.equals(Float.valueOf(this.f7458b[i]))) {
                float[] fArr = this.f7458b;
                System.arraycopy(fArr, i + 1, fArr, i, (this.f7459c - i) - 1);
                this.f7459c--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        zztz();
        if (i2 >= i) {
            float[] fArr = this.f7458b;
            System.arraycopy(fArr, i2, fArr, i, this.f7459c - i2);
            this.f7459c -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        zztz();
        m65514a(i);
        float[] fArr = this.f7458b;
        float f = fArr[i];
        fArr[i] = floatValue;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f7459c;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzxt
    public final /* synthetic */ zzxt zzda(int i) {
        if (i >= this.f7459c) {
            return new XK2(Arrays.copyOf(this.f7458b, i), this.f7459c);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        int i2;
        zztz();
        m65514a(i);
        float[] fArr = this.f7458b;
        float f = fArr[i];
        if (i < this.f7459c - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.f7459c--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f);
    }

    @Override // p000.AbstractC22089sK2, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        m65512c(((Float) obj).floatValue());
        return true;
    }
}
