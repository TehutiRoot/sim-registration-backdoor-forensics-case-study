package p000;

import com.google.android.gms.internal.vision.zzjf;
import com.google.android.gms.internal.vision.zzjl;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: LA2 */
/* loaded from: classes3.dex */
public final class LA2 extends AbstractC21213mv2 implements zzjl, InterfaceC22308tE2, RandomAccess {

    /* renamed from: d */
    public static final LA2 f3524d;

    /* renamed from: b */
    public int[] f3525b;

    /* renamed from: c */
    public int f3526c;

    static {
        LA2 la2 = new LA2(new int[0], 0);
        f3524d = la2;
        la2.zzb();
    }

    public LA2(int[] iArr, int i) {
        this.f3525b = iArr;
        this.f3526c = i;
    }

    /* renamed from: c */
    public static LA2 m67616c() {
        return f3524d;
    }

    /* renamed from: a */
    public final int m67618a(int i) {
        m67615d(i);
        return this.f3525b[i];
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        int intValue = ((Integer) obj).intValue();
        zzc();
        if (i >= 0 && i <= (i2 = this.f3526c)) {
            int[] iArr = this.f3525b;
            if (i2 < iArr.length) {
                System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
            } else {
                int[] iArr2 = new int[((i2 * 3) / 2) + 1];
                System.arraycopy(iArr, 0, iArr2, 0, i);
                System.arraycopy(this.f3525b, i, iArr2, i + 1, this.f3526c - i);
                this.f3525b = iArr2;
            }
            this.f3525b[i] = intValue;
            this.f3526c++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m67614e(i));
    }

    @Override // p000.AbstractC21213mv2, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zzc();
        zzjf.m46406b(collection);
        if (!(collection instanceof LA2)) {
            return super.addAll(collection);
        }
        LA2 la2 = (LA2) collection;
        int i = la2.f3526c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f3526c;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.f3525b;
            if (i3 > iArr.length) {
                this.f3525b = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(la2.f3525b, 0, this.f3525b, this.f3526c, la2.f3526c);
            this.f3526c = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: b */
    public final void m67617b(int i) {
        zzc();
        int i2 = this.f3526c;
        int[] iArr = this.f3525b;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[((i2 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f3525b = iArr2;
        }
        int[] iArr3 = this.f3525b;
        int i3 = this.f3526c;
        this.f3526c = i3 + 1;
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
    public final void m67615d(int i) {
        if (i >= 0 && i < this.f3526c) {
            return;
        }
        throw new IndexOutOfBoundsException(m67614e(i));
    }

    /* renamed from: e */
    public final String m67614e(int i) {
        int i2 = this.f3526c;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    @Override // p000.AbstractC21213mv2, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LA2)) {
            return super.equals(obj);
        }
        LA2 la2 = (LA2) obj;
        if (this.f3526c != la2.f3526c) {
            return false;
        }
        int[] iArr = la2.f3525b;
        for (int i = 0; i < this.f3526c; i++) {
            if (this.f3525b[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        return Integer.valueOf(m67618a(i));
    }

    @Override // p000.AbstractC21213mv2, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f3526c; i2++) {
            i = (i * 31) + this.f3525b[i2];
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
            if (this.f3525b[i] == intValue) {
                return i;
            }
        }
        return -1;
    }

    @Override // p000.AbstractC21213mv2, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        int i2;
        zzc();
        m67615d(i);
        int[] iArr = this.f3525b;
        int i3 = iArr[i];
        if (i < this.f3526c - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i2 - i) - 1);
        }
        this.f3526c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i3);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        zzc();
        if (i2 >= i) {
            int[] iArr = this.f3525b;
            System.arraycopy(iArr, i2, iArr, i, this.f3526c - i2);
            this.f3526c -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        zzc();
        m67615d(i);
        int[] iArr = this.f3525b;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f3526c;
    }

    @Override // com.google.android.gms.internal.vision.zzjl
    public final /* synthetic */ zzjl zza(int i) {
        if (i >= this.f3526c) {
            return new LA2(Arrays.copyOf(this.f3525b, i), this.f3526c);
        }
        throw new IllegalArgumentException();
    }

    @Override // p000.AbstractC21213mv2, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        m67617b(((Integer) obj).intValue());
        return true;
    }
}