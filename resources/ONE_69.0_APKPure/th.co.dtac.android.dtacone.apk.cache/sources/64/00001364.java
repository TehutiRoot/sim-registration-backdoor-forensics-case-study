package p000;

import com.google.android.gms.internal.firebase_ml.zzxl;
import com.google.android.gms.internal.firebase_ml.zzxt;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: UL2 */
/* loaded from: classes3.dex */
public final class UL2 extends AbstractC21637pL2 implements zzxt, HM2, RandomAccess {

    /* renamed from: d */
    public static final UL2 f6616d;

    /* renamed from: b */
    public float[] f6617b;

    /* renamed from: c */
    public int f6618c;

    static {
        UL2 ul2 = new UL2(new float[0], 0);
        f6616d = ul2;
        ul2.zzty();
    }

    public UL2(float[] fArr, int i) {
        this.f6617b = fArr;
        this.f6618c = i;
    }

    /* renamed from: d */
    public static UL2 m66205d() {
        return f6616d;
    }

    /* renamed from: a */
    public final void m66208a(int i) {
        if (i >= 0 && i < this.f6618c) {
            return;
        }
        throw new IndexOutOfBoundsException(m66207b(i));
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        float floatValue = ((Float) obj).floatValue();
        zztz();
        if (i >= 0 && i <= (i2 = this.f6618c)) {
            float[] fArr = this.f6617b;
            if (i2 < fArr.length) {
                System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
            } else {
                float[] fArr2 = new float[((i2 * 3) / 2) + 1];
                System.arraycopy(fArr, 0, fArr2, 0, i);
                System.arraycopy(this.f6617b, i, fArr2, i + 1, this.f6618c - i);
                this.f6617b = fArr2;
            }
            this.f6617b[i] = floatValue;
            this.f6618c++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m66207b(i));
    }

    @Override // p000.AbstractC21637pL2, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zztz();
        zzxl.m47431a(collection);
        if (!(collection instanceof UL2)) {
            return super.addAll(collection);
        }
        UL2 ul2 = (UL2) collection;
        int i = ul2.f6618c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f6618c;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            float[] fArr = this.f6617b;
            if (i3 > fArr.length) {
                this.f6617b = Arrays.copyOf(fArr, i3);
            }
            System.arraycopy(ul2.f6617b, 0, this.f6617b, this.f6618c, ul2.f6618c);
            this.f6618c = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: b */
    public final String m66207b(int i) {
        int i2 = this.f6618c;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: c */
    public final void m66206c(float f) {
        zztz();
        int i = this.f6618c;
        float[] fArr = this.f6617b;
        if (i == fArr.length) {
            float[] fArr2 = new float[((i * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.f6617b = fArr2;
        }
        float[] fArr3 = this.f6617b;
        int i2 = this.f6618c;
        this.f6618c = i2 + 1;
        fArr3[i2] = f;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // p000.AbstractC21637pL2, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UL2)) {
            return super.equals(obj);
        }
        UL2 ul2 = (UL2) obj;
        if (this.f6618c != ul2.f6618c) {
            return false;
        }
        float[] fArr = ul2.f6617b;
        for (int i = 0; i < this.f6618c; i++) {
            if (Float.floatToIntBits(this.f6617b[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        m66208a(i);
        return Float.valueOf(this.f6617b[i]);
    }

    @Override // p000.AbstractC21637pL2, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f6618c; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.f6617b[i2]);
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
            if (this.f6617b[i] == floatValue) {
                return i;
            }
        }
        return -1;
    }

    @Override // p000.AbstractC21637pL2, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        zztz();
        for (int i = 0; i < this.f6618c; i++) {
            if (obj.equals(Float.valueOf(this.f6617b[i]))) {
                float[] fArr = this.f6617b;
                System.arraycopy(fArr, i + 1, fArr, i, (this.f6618c - i) - 1);
                this.f6618c--;
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
            float[] fArr = this.f6617b;
            System.arraycopy(fArr, i2, fArr, i, this.f6618c - i2);
            this.f6618c -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        zztz();
        m66208a(i);
        float[] fArr = this.f6617b;
        float f = fArr[i];
        fArr[i] = floatValue;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f6618c;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzxt
    public final /* synthetic */ zzxt zzda(int i) {
        if (i >= this.f6618c) {
            return new UL2(Arrays.copyOf(this.f6617b, i), this.f6618c);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        int i2;
        zztz();
        m66208a(i);
        float[] fArr = this.f6617b;
        float f = fArr[i];
        if (i < this.f6618c - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.f6618c--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f);
    }

    @Override // p000.AbstractC21637pL2, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        m66206c(((Float) obj).floatValue());
        return true;
    }
}