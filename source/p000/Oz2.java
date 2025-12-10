package p000;

import com.google.android.gms.internal.vision.zzjf;
import com.google.android.gms.internal.vision.zzjl;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: Oz2 */
/* loaded from: classes3.dex */
public final class Oz2 extends AbstractC21667pu2 implements zzjl, InterfaceC22756wD2, RandomAccess {

    /* renamed from: d */
    public static final Oz2 f4609d;

    /* renamed from: b */
    public int[] f4610b;

    /* renamed from: c */
    public int f4611c;

    static {
        Oz2 oz2 = new Oz2(new int[0], 0);
        f4609d = oz2;
        oz2.zzb();
    }

    public Oz2(int[] iArr, int i) {
        this.f4610b = iArr;
        this.f4611c = i;
    }

    /* renamed from: c */
    public static Oz2 m66935c() {
        return f4609d;
    }

    /* renamed from: a */
    public final int m66937a(int i) {
        m66934d(i);
        return this.f4610b[i];
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        int intValue = ((Integer) obj).intValue();
        zzc();
        if (i >= 0 && i <= (i2 = this.f4611c)) {
            int[] iArr = this.f4610b;
            if (i2 < iArr.length) {
                System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
            } else {
                int[] iArr2 = new int[((i2 * 3) / 2) + 1];
                System.arraycopy(iArr, 0, iArr2, 0, i);
                System.arraycopy(this.f4610b, i, iArr2, i + 1, this.f4611c - i);
                this.f4610b = iArr2;
            }
            this.f4610b[i] = intValue;
            this.f4611c++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m66933e(i));
    }

    @Override // p000.AbstractC21667pu2, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zzc();
        zzjf.m46421b(collection);
        if (!(collection instanceof Oz2)) {
            return super.addAll(collection);
        }
        Oz2 oz2 = (Oz2) collection;
        int i = oz2.f4611c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f4611c;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.f4610b;
            if (i3 > iArr.length) {
                this.f4610b = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(oz2.f4610b, 0, this.f4610b, this.f4611c, oz2.f4611c);
            this.f4611c = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: b */
    public final void m66936b(int i) {
        zzc();
        int i2 = this.f4611c;
        int[] iArr = this.f4610b;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[((i2 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f4610b = iArr2;
        }
        int[] iArr3 = this.f4610b;
        int i3 = this.f4611c;
        this.f4611c = i3 + 1;
        iArr3[i3] = i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final void m66934d(int i) {
        if (i >= 0 && i < this.f4611c) {
            return;
        }
        throw new IndexOutOfBoundsException(m66933e(i));
    }

    /* renamed from: e */
    public final String m66933e(int i) {
        int i2 = this.f4611c;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    @Override // p000.AbstractC21667pu2, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Oz2)) {
            return super.equals(obj);
        }
        Oz2 oz2 = (Oz2) obj;
        if (this.f4611c != oz2.f4611c) {
            return false;
        }
        int[] iArr = oz2.f4610b;
        for (int i = 0; i < this.f4611c; i++) {
            if (this.f4610b[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        return Integer.valueOf(m66937a(i));
    }

    @Override // p000.AbstractC21667pu2, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f4611c; i2++) {
            i = (i * 31) + this.f4610b[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f4610b[i] == intValue) {
                return i;
            }
        }
        return -1;
    }

    @Override // p000.AbstractC21667pu2, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        int i2;
        zzc();
        m66934d(i);
        int[] iArr = this.f4610b;
        int i3 = iArr[i];
        if (i < this.f4611c - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i2 - i) - 1);
        }
        this.f4611c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i3);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        zzc();
        if (i2 >= i) {
            int[] iArr = this.f4610b;
            System.arraycopy(iArr, i2, iArr, i, this.f4611c - i2);
            this.f4611c -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        zzc();
        m66934d(i);
        int[] iArr = this.f4610b;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4611c;
    }

    @Override // com.google.android.gms.internal.vision.zzjl
    public final /* synthetic */ zzjl zza(int i) {
        if (i >= this.f4611c) {
            return new Oz2(Arrays.copyOf(this.f4610b, i), this.f4611c);
        }
        throw new IllegalArgumentException();
    }

    @Override // p000.AbstractC21667pu2, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        m66936b(((Integer) obj).intValue());
        return true;
    }
}
