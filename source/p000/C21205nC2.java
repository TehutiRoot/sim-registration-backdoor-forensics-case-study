package p000;

import com.google.android.gms.internal.measurement.zzkj;
import com.google.android.gms.internal.measurement.zzkm;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: nC2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C21205nC2 extends Qx2 implements RandomAccess, zzkj, InterfaceC21042mF2 {

    /* renamed from: d */
    public static final C21205nC2 f72151d;

    /* renamed from: b */
    public int[] f72152b;

    /* renamed from: c */
    public int f72153c;

    static {
        C21205nC2 c21205nC2 = new C21205nC2(new int[0], 0);
        f72151d = c21205nC2;
        c21205nC2.zzb();
    }

    public C21205nC2(int[] iArr, int i) {
        this.f72152b = iArr;
        this.f72153c = i;
    }

    /* renamed from: b */
    public static C21205nC2 m26153b() {
        return f72151d;
    }

    /* renamed from: a */
    public final int m26154a(int i) {
        m26151d(i);
        return this.f72152b[i];
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        int intValue = ((Integer) obj).intValue();
        zzbP();
        if (i >= 0 && i <= (i2 = this.f72153c)) {
            int[] iArr = this.f72152b;
            if (i2 < iArr.length) {
                System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
            } else {
                int[] iArr2 = new int[((i2 * 3) / 2) + 1];
                System.arraycopy(iArr, 0, iArr2, 0, i);
                System.arraycopy(this.f72152b, i, iArr2, i + 1, this.f72153c - i);
                this.f72152b = iArr2;
            }
            this.f72152b[i] = intValue;
            this.f72153c++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m26152c(i));
    }

    @Override // p000.Qx2, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zzbP();
        zzkm.m47152b(collection);
        if (!(collection instanceof C21205nC2)) {
            return super.addAll(collection);
        }
        C21205nC2 c21205nC2 = (C21205nC2) collection;
        int i = c21205nC2.f72153c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f72153c;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.f72152b;
            if (i3 > iArr.length) {
                this.f72152b = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(c21205nC2.f72152b, 0, this.f72152b, this.f72153c, c21205nC2.f72153c);
            this.f72153c = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: c */
    public final String m26152c(int i) {
        int i2 = this.f72153c;
        return "Index:" + i + ", Size:" + i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final void m26151d(int i) {
        if (i >= 0 && i < this.f72153c) {
            return;
        }
        throw new IndexOutOfBoundsException(m26152c(i));
    }

    @Override // p000.Qx2, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21205nC2)) {
            return super.equals(obj);
        }
        C21205nC2 c21205nC2 = (C21205nC2) obj;
        if (this.f72153c != c21205nC2.f72153c) {
            return false;
        }
        int[] iArr = c21205nC2.f72152b;
        for (int i = 0; i < this.f72153c; i++) {
            if (this.f72152b[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        m26151d(i);
        return Integer.valueOf(this.f72152b[i]);
    }

    @Override // p000.Qx2, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f72153c; i2++) {
            i = (i * 31) + this.f72152b[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i = this.f72153c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f72152b[i2] == intValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // p000.Qx2, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        int i2;
        zzbP();
        m26151d(i);
        int[] iArr = this.f72152b;
        int i3 = iArr[i];
        if (i < this.f72153c - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i2 - i) - 1);
        }
        this.f72153c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i3);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        zzbP();
        if (i2 >= i) {
            int[] iArr = this.f72152b;
            System.arraycopy(iArr, i2, iArr, i, this.f72153c - i2);
            this.f72153c -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        zzbP();
        m26151d(i);
        int[] iArr = this.f72152b;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f72153c;
    }

    @Override // com.google.android.gms.internal.measurement.zzkl
    /* renamed from: zzg */
    public final zzkj zzd(int i) {
        if (i >= this.f72153c) {
            return new C21205nC2(Arrays.copyOf(this.f72152b, i), this.f72153c);
        }
        throw new IllegalArgumentException();
    }

    public final void zzh(int i) {
        zzbP();
        int i2 = this.f72153c;
        int[] iArr = this.f72152b;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[((i2 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f72152b = iArr2;
        }
        int[] iArr3 = this.f72152b;
        int i3 = this.f72153c;
        this.f72153c = i3 + 1;
        iArr3[i3] = i;
    }

    @Override // p000.Qx2, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzh(((Integer) obj).intValue());
        return true;
    }
}
